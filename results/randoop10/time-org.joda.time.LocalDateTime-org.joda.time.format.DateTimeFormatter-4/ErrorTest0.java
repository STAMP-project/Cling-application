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
        long long17 = dateTimeZone12.nextTransition((long) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 26574907, dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
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
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.centuryOfEra();
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfSecond(10);
        java.lang.String str49 = localDateTime45.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone51);
        java.lang.String str53 = dateTimeZone51.getID();
        org.joda.time.DateTime dateTime54 = localDateTime45.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime41.toDateTime(dateTimeZone51);
        java.lang.String str57 = dateTimeZone51.getNameKey(86400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime55", (dateTime18.compareTo(dateTime55) == 0) == dateTime18.equals(dateTime55));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight29.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight29.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight29.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval48 = interval1.withStart((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime63.withEra((int) (short) 0);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = interval48.isBefore((org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) (short) 10, chronology76);
        org.joda.time.DateTime dateTime80 = dateTime78.minusHours(7);
        org.joda.time.DateTime dateTime82 = dateTime80.plusYears((int) (byte) 0);
        int int83 = dateTime82.getMonthOfYear();
        org.joda.time.DateTime dateTime85 = dateTime82.minusHours(17);
        org.joda.time.Interval interval86 = interval48.withEnd((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant66", (dateTime61.compareTo(instant66) == 0) == dateTime61.equals(instant66));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfSecond(10);
        java.lang.String str49 = localDateTime45.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone51);
        java.lang.String str53 = dateTimeZone51.getID();
        org.joda.time.DateTime dateTime54 = localDateTime45.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime41.toDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        org.joda.time.LocalDateTime localDateTime61 = property60.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime62 = property60.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundFloorCopy();
        boolean boolean64 = dateTimeZone51.isLocalDateTimeGap(localDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime55", (dateTime18.compareTo(dateTime55) == 0) == dateTime18.equals(dateTime55));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
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
        mutableDateTime37.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.millisOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) mutableDateTime37);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone1);
        java.util.TimeZone timeZone44 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        boolean boolean46 = timeZone44.hasSameRules(timeZone45);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale47);
        calendar48.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) calendar48);
        java.util.TimeZone timeZone52 = calendar48.getTimeZone();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone52);
        boolean boolean54 = timeZone44.hasSameRules(timeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar53", (calendar48.compareTo(calendar53) == 0) == calendar48.equals(calendar53));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        int int19 = dateMidnight18.getMillisOfSecond();
        org.joda.time.Instant instant20 = dateMidnight18.toInstant();
        boolean boolean21 = property16.equals((java.lang.Object) instant20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        java.util.TimeZone timeZone5 = calendar1.getTimeZone();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval7 = yearMonthDay6.toInterval();
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay6.dayOfMonth();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = property8.getAsShortText(locale9);
        java.lang.String str11 = timeZone5.getDisplayName(locale9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and yearMonthDay6", (localDate4.compareTo(yearMonthDay6) == 0) == localDate4.equals(yearMonthDay6));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        mutableDateTime9.setMillis(457104L);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        long long18 = dateMidnight15.getMillis();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.days();
        org.joda.time.Period period20 = duration13.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight15, periodType19);
        java.util.Date date21 = dateMidnight15.toDate();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone23);
        java.lang.String str25 = dateTimeZone23.getID();
        org.joda.time.MutableDateTime mutableDateTime26 = dateMidnight15.toMutableDateTime(dateTimeZone23);
        mutableDateTime9.setZoneRetainFields(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime26", (dateMidnight3.compareTo(mutableDateTime26) == 0) == dateMidnight3.equals(mutableDateTime26));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 10, chronology32);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMonths(10);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology45);
        org.joda.time.DateTime dateTime48 = dateTime36.toDateTime(chronology45);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology45);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.days();
        org.joda.time.Period period54 = new org.joda.time.Period(1645574400000L, periodType53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withPeriodAdded((org.joda.time.ReadablePeriod) period54, (int) (byte) 0);
        int[] intArray58 = chronology45.get((org.joda.time.ReadablePartial) localDateTime56, (long) 3);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(chronology45);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight21.withChronology(chronology45);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusDays((int) (short) -1);
        long long67 = dateMidnight64.getMillis();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.days();
        org.joda.time.Period period69 = duration62.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight64, periodType68);
        java.util.Date date70 = dateMidnight64.toDate();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(dateTimeZone72);
        java.lang.String str74 = dateTimeZone72.getID();
        org.joda.time.MutableDateTime mutableDateTime75 = dateMidnight64.toMutableDateTime(dateTimeZone72);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((java.lang.Object) dateMidnight60, dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and mutableDateTime75", (dateMidnight14.compareTo(mutableDateTime75) == 0) == dateMidnight14.equals(mutableDateTime75));
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
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours(7);
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property26 = dateTime23.centuryOfEra();
        int int27 = dateTime23.getMillisOfSecond();
        org.joda.time.DateTime dateTime29 = dateTime23.plus((long) 6);
        org.joda.time.DateTime dateTime31 = dateTime23.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(dateTimeZone33);
        boolean boolean36 = dateTimeZone33.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology38 = chronology7.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime37", (dateTime23.compareTo(dateTime37) == 0) == dateTime23.equals(dateTime37));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration21 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration19, 12);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration27 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration25, 12);
        boolean boolean28 = duration17.isEqual((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime30 = dateTime10.withDurationAdded((org.joda.time.ReadableDuration) duration17, 47);
        long long31 = duration17.getStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        java.util.GregorianCalendar gregorianCalendar16 = dateTime14.toGregorianCalendar();
        java.time.Instant instant17 = gregorianCalendar16.toInstant();
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale18);
        calendar19.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) calendar19);
        java.util.TimeZone timeZone23 = calendar19.getTimeZone();
        gregorianCalendar16.setTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone26);
        java.lang.String str28 = dateTimeZone26.getID();
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
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.era();
        boolean boolean67 = dateTimeZone26.equals((java.lang.Object) mutableDateTime62);
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(dateTimeZone26);
        java.util.TimeZone timeZone69 = dateTimeZone26.toTimeZone();
        java.util.TimeZone timeZone70 = java.util.TimeZone.getDefault();
        boolean boolean71 = timeZone69.hasSameRules(timeZone70);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone69);
        java.util.TimeZone.setDefault(timeZone69);
        boolean boolean74 = timeZone23.hasSameRules(timeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar72", (calendar19.compareTo(calendar72) == 0) == calendar19.equals(calendar72));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.joda.time.DateTime dateTime66 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.plusWeeks(4);
        org.joda.time.DateTime dateTime71 = dateTime66.withDurationAdded(0L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long76 = dateTimeZone73.adjustOffset((long) 10, false);
        org.joda.time.DateTime dateTime77 = dateTime66.toDateTime(dateTimeZone73);
        int int78 = dateTime66.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight37 and dateTime77", (dateMidnight37.compareTo(dateTime77) == 0) == dateMidnight37.equals(dateTime77));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime41 = property38.roundCeiling();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime41.add((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        int int52 = dateMidnight49.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight49);
        boolean boolean54 = mutableDateTime41.isEqual((org.joda.time.ReadableInstant) mutableDateTime53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime53.minuteOfDay();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusDays((int) (short) -1);
        int int63 = dateMidnight62.getYearOfEra();
        org.joda.time.Chronology chronology64 = dateMidnight62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (short) 10, chronology64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate69 = org.joda.time.LocalDate.now(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime66.toMutableDateTime(dateTimeZone68);
        mutableDateTime53.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and mutableDateTime71", (dateTime32.compareTo(mutableDateTime71) == 0) == dateTime32.equals(mutableDateTime71));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime15.withCenturyOfEra(8);
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
        org.joda.time.Period period42 = new org.joda.time.Period((long) 0, (long) 6, chronology39);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 122, chronology39);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone45);
        java.lang.String str47 = dateTimeZone45.getID();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology51);
        mutablePeriod52.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod52.add(0L);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutablePeriod52.add(0L, chronology66);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (-1), chronology66);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        int int77 = dateMidnight76.getYearOfEra();
        org.joda.time.Chronology chronology78 = dateMidnight76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology78);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (short) 10, chronology78);
        org.joda.time.MutableDateTime mutableDateTime81 = dateMidnight69.toMutableDateTime(chronology78);
        mutableDateTime81.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime81.millisOfDay();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime81.era();
        boolean boolean86 = dateTimeZone45.equals((java.lang.Object) mutableDateTime81);
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight(dateTimeZone45);
        org.joda.time.DateTime dateTime88 = dateTime43.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTime dateTime89 = dateTime18.withZone(dateTimeZone45);
        java.lang.String str90 = dateTimeZone45.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime89", (dateTime18.compareTo(dateTime89) == 0) == dateTime18.equals(dateTime89));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean10 = timeOfDay6.isSupported(dateTimeFieldType9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours(7);
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime26 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime28 = dateTime26.minusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property29 = dateTime26.weekyear();
        java.util.GregorianCalendar gregorianCalendar30 = dateTime26.toGregorianCalendar();
        java.time.Instant instant31 = gregorianCalendar30.toInstant();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("Property[dayOfWeek]");
        java.lang.String str34 = timeZone33.getID();
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale.setDefault(locale35);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone33, locale35);
        gregorianCalendar30.setTimeZone(timeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology44);
        mutablePeriod45.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod45.add(0L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        int int58 = dateMidnight57.getYearOfEra();
        org.joda.time.Chronology chronology59 = dateMidnight57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology59);
        mutablePeriod45.add(0L, chronology59);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (-1), chronology59);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType40.getField(chronology59);
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        java.lang.String str66 = dateTimeField63.getAsShortText(840, locale65);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(locale65);
        java.lang.String str68 = timeZone33.getDisplayName(locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar67", (calendar38.compareTo(calendar67) == 0) == calendar38.equals(calendar67));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        int int24 = dateTime23.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond(12);
        org.joda.time.DateTime dateTime20 = dateTime18.withCenturyOfEra(20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 10, chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime31.toMutableDateTime(dateTimeZone33);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration42 = duration38.withDurationAdded((org.joda.time.ReadableDuration) duration40, 12);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration48 = duration44.withDurationAdded((org.joda.time.ReadableDuration) duration46, 12);
        boolean boolean49 = duration38.isEqual((org.joda.time.ReadableDuration) duration46);
        org.joda.time.DateTime dateTime51 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration38, 47);
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime36", (dateTime10.compareTo(mutableDateTime36) == 0) == dateTime10.equals(mutableDateTime36));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        long long18 = dateTimeZone11.convertLocalToUTC((long) 547, false, (long) 353);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property16 = dateTime13.centuryOfEra();
        int int17 = dateTime13.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime13.plus((long) 6);
        org.joda.time.DateTime dateTime21 = dateTime13.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime13.withZone(dateTimeZone23);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(36000L, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime27", (dateTime13.compareTo(dateTime27) == 0) == dateTime13.equals(dateTime27));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale6);
        calendar7.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) calendar7);
        calendar7.set(100, 1969, 50, (int) 'a', (int) (byte) 100);
        calendar7.setMinimalDaysInFirstWeek(2000);
        int int19 = gregorianCalendar4.compareTo(calendar7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate10", (localDate5.compareTo(localDate10) == 0) == localDate5.equals(localDate10));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        long long10 = dateMidnight7.getMillis();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.Period period12 = duration5.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight7, periodType11);
        java.util.Date date13 = dateMidnight7.toDate();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        java.lang.String str17 = dateTimeZone15.getID();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight7.toMutableDateTime(dateTimeZone15);
        mutableDateTime3.setZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and mutableDateTime18", (dateMidnight7.compareTo(mutableDateTime18) == 0) == dateMidnight7.equals(mutableDateTime18));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DurationField durationField42 = chronology37.years();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology37);
        int int44 = mutableDateTime43.getDayOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        int int49 = dateMidnight48.getYearOfEra();
        org.joda.time.Chronology chronology50 = dateMidnight48.getChronology();
        long long51 = dateMidnight48.getMillis();
        org.joda.time.DateMidnight.Property property52 = dateMidnight48.weekyear();
        org.joda.time.DateMidnight dateMidnight53 = property52.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight54 = property52.roundHalfFloorCopy();
        int int55 = dateMidnight54.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar56 = dateMidnight54.toGregorianCalendar();
        int int57 = mutableDateTime43.compareTo((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        long long64 = dateMidnight61.getMillis();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.days();
        org.joda.time.Period period66 = duration59.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight61, periodType65);
        java.util.Date date67 = dateMidnight61.toDate();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(dateTimeZone69);
        java.lang.String str71 = dateTimeZone69.getID();
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight61.toMutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.weekyear();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime72.millisOfDay();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime72.dayOfWeek();
        mutableDateTime72.setWeekyear(2022);
        java.lang.String str78 = mutableDateTime72.toString();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay(dateTimeZone79);
        org.joda.time.DateTime dateTime81 = mutableDateTime72.toDateTime(dateTimeZone79);
        mutableDateTime43.setZoneRetainFields(dateTimeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime72", (dateMidnight4.compareTo(mutableDateTime72) == 0) == dateMidnight4.equals(mutableDateTime72));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        int int24 = dateTime23.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime15.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime15.millisOfSecond();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        long long26 = chronology22.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekyear();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology22);
        org.joda.time.DateTime dateTime29 = dateTime15.toDateTime(chronology22);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(9L, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) '#');
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter19.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter19.getZone();
        java.util.Locale locale22 = dateTimeFormatter19.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter19.withDefaultYear((int) (byte) 10);
        org.joda.time.Chronology chronology25 = dateTimeFormatter24.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay26.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        int int32 = dateTimeZone30.getOffset((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight33 = yearMonthDay26.toDateMidnight(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter24.withZone(dateTimeZone30);
        long long36 = dateTimeZone12.getMillisKeepLocal(dateTimeZone30, 3600035L);
        boolean boolean37 = dateMidnight2.equals((java.lang.Object) dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime29", (mutableDateTime16.compareTo(dateTime29) == 0) == mutableDateTime16.equals(dateTime29));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.millisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime12.withChronology(chronology20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology20);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) (byte) -1, chronology20);
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.plusHours((int) (byte) -1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        int int30 = dateMidnight29.getMillisOfSecond();
        org.joda.time.Interval interval31 = dateMidnight29.toInterval();
        org.joda.time.Instant instant32 = dateMidnight29.toInstant();
        org.joda.time.Period period34 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight29.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusDays((int) (short) -1);
        long long40 = dateMidnight37.getMillis();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight37.withMillis((long) 7);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.minusDays((int) (short) -1);
        long long49 = dateMidnight46.getMillis();
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.days();
        org.joda.time.Period period51 = duration44.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight46, periodType50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateMidnight46.toMutableDateTimeISO();
        int int53 = dateMidnight42.compareTo((org.joda.time.ReadableInstant) mutableDateTime52);
        mutableDateTime52.addYears(131485);
        int int56 = mutableDateTime52.getMillisOfDay();
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType58 = periodType57.withWeeksRemoved();
        java.lang.String str59 = periodType57.getName();
        java.util.Date date63 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType65.getDurationType();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay64.withFieldAdded(durationFieldType66, 0);
        int int69 = periodType57.indexOf(durationFieldType66);
        org.joda.time.PeriodType periodType70 = periodType57.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight29, (org.joda.time.ReadableInstant) mutableDateTime52, periodType70);
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay25.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod71, 19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and instant32", (dateMidnight5.compareTo(instant32) == 0) == dateMidnight5.equals(instant32));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight29.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight29.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight29.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval48 = interval1.withStart((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime63.withEra((int) (short) 0);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = interval48.isBefore((org.joda.time.ReadableInstant) instant66);
        java.lang.Object obj68 = null;
        boolean boolean69 = interval48.equals(obj68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant66", (dateTime61.compareTo(instant66) == 0) == dateTime61.equals(instant66));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight29.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight29.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight29.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval48 = interval1.withStart((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime63.withEra((int) (short) 0);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = interval48.isBefore((org.joda.time.ReadableInstant) instant66);
        org.joda.time.MutableDateTime mutableDateTime68 = instant66.toMutableDateTimeISO();
        org.joda.time.Instant instant70 = instant66.plus(4406400000L);
        org.joda.time.Instant instant71 = new org.joda.time.Instant((java.lang.Object) 4406400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant66", (dateTime61.compareTo(instant66) == 0) == dateTime61.equals(instant66));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant6 = instant1.plus((long) 47);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        int int9 = dateMidnight8.getMillisOfSecond();
        org.joda.time.Interval interval10 = dateMidnight8.toInterval();
        org.joda.time.Instant instant11 = dateMidnight8.toInstant();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.MutableDateTime mutableDateTime13 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant11", (dateMidnight8.compareTo(instant11) == 0) == dateMidnight8.equals(instant11));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.DateTime dateTime85 = instant24.toDateTime();
        org.joda.time.ReadableDuration readableDuration86 = null;
        org.joda.time.Instant instant87 = instant24.plus(readableDuration86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths(10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.DateTime dateTime49 = dateTime37.toDateTime(chronology46);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology46);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = new org.joda.time.Period(1645574400000L, periodType54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withPeriodAdded((org.joda.time.ReadablePeriod) period55, (int) (byte) 0);
        int[] intArray59 = chronology46.get((org.joda.time.ReadablePartial) localDateTime57, (long) 3);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology46);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight22.withChronology(chronology46);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology46, locale62);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.weekyearOfCentury();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology64);
        java.lang.String str67 = chronology64.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and dateTime66", (dateTime60.compareTo(dateTime66) == 0) == dateTime60.equals(dateTime66));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.DurationField durationField27 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.yearOfEra();
        java.lang.String str29 = dateTimeField28.getName();
        org.joda.time.DurationField durationField30 = dateTimeField28.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField30, and durationField27", !(durationField27.compareTo(durationField30) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField30.compareTo(durationField27))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.Period period9 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight4, periodType8);
        java.util.Date date10 = dateMidnight4.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
        java.lang.String str14 = dateTimeZone12.getID();
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight4.toMutableDateTime(dateTimeZone12);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 7, dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime15", (dateMidnight4.compareTo(mutableDateTime15) == 0) == dateMidnight4.equals(mutableDateTime15));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTime.Property property29 = dateTime14.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime28", (dateTime14.compareTo(dateTime28) == 0) == dateTime14.equals(dateTime28));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        int int14 = localDate12.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate16 = localDate12.minusWeeks(9);
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfMonth();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate.Property property21 = localDate19.weekyear();
        java.lang.String str22 = property21.getAsString();
        org.joda.time.LocalDate localDate23 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = property21.roundHalfFloorCopy();
        int int25 = localDate24.getWeekyear();
        org.joda.time.LocalDate localDate26 = localDate16.withFields((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant31 = instant29.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime32 = instant29.toMutableDateTimeISO();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology35);
        mutablePeriod36.setPeriod((long) (short) 10, (long) (short) -1);
        int int40 = mutablePeriod36.getSeconds();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology44);
        mutablePeriod45.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod45.add(0L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        int int58 = dateMidnight57.getYearOfEra();
        org.joda.time.Chronology chronology59 = dateMidnight57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology59);
        mutablePeriod45.add(0L, chronology59);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (-1), chronology59);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, chronology71);
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight62.toMutableDateTime(chronology71);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime74.add((org.joda.time.ReadableDuration) duration77);
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardDays((long) '#');
        long long82 = duration81.getMillis();
        boolean boolean83 = duration77.isEqual((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant84 = instant29.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.DateTime dateTime85 = localDate26.toDateTime((org.joda.time.ReadableInstant) instant84);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime85.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime32", (instant29.compareTo(mutableDateTime32) == 0) == instant29.equals(mutableDateTime32));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.Instant instant13 = dateTime10.toInstant();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.days();
        org.joda.time.Period period16 = new org.joda.time.Period(1645574400000L, periodType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration17, readableInstant18);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period21 = period16.normalizedStandard(periodType20);
        org.joda.time.DateTime dateTime22 = dateTime10.plus((org.joda.time.ReadablePeriod) period21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant13", (dateMidnight3.compareTo(instant13) == 0) == dateMidnight3.equals(instant13));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.Period period4 = new org.joda.time.Period(1645574400000L, periodType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded((org.joda.time.ReadablePeriod) period4, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withWeekyear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusSeconds(62);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.LocalDateTime localDateTime13 = property11.withMinimumValue();
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.minus((long) 572);
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        int int25 = mutablePeriod21.getSeconds();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology29);
        mutablePeriod30.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod30.add(0L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        mutablePeriod30.add(0L, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (-1), chronology44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) 10, chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight47.toMutableDateTime(chronology56);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime59.add((org.joda.time.ReadableDuration) duration62);
        mutablePeriod21.add((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardDays((long) '#');
        long long67 = duration66.getMillis();
        boolean boolean68 = duration62.isEqual((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Instant instant70 = instant16.withDurationAdded((org.joda.time.ReadableDuration) duration62, 652);
        org.joda.time.Duration duration73 = duration62.withDurationAdded(339L, 151);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime13.plus((org.joda.time.ReadableDuration) duration73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str86 = dateTimeFieldType85.getName();
        boolean boolean87 = instant84.isSupported(dateTimeFieldType85);
        org.joda.time.Instant instant89 = instant84.withMillis((long) 28);
        org.joda.time.Instant instant91 = instant89.withMillis((long) 1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime14.withZoneRetainFields(dateTimeZone29);
        boolean boolean34 = dateTime33.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
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
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        int int25 = dateTimeZone21.getOffset(2304207674205000L);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration21 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration19, 12);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration27 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration25, 12);
        boolean boolean28 = duration17.isEqual((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime30 = dateTime10.withDurationAdded((org.joda.time.ReadableDuration) duration17, 47);
        org.joda.time.Hours hours31 = duration17.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.joda.time.Period period23 = new org.joda.time.Period((long) 0, (long) 6, chronology20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 122, chronology20);
        org.joda.time.DurationField durationField25 = chronology20.hours();
        org.joda.time.DurationField durationField26 = chronology20.days();
        org.joda.time.DurationField durationField27 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField25, and durationField26", !(durationField27.compareTo(durationField25) == 0) || (Math.signum(durationField27.compareTo(durationField26)) == Math.signum(durationField25.compareTo(durationField26))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone2);
        boolean boolean5 = dateTimeZone2.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 44, dateTimeZone2);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology15);
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours(7);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime25 = dateTime22.withCenturyOfEra(8);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.Period period49 = new org.joda.time.Period((long) 0, (long) 6, chronology46);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 122, chronology46);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(dateTimeZone52);
        java.lang.String str54 = dateTimeZone52.getID();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology58);
        mutablePeriod59.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod59.add(0L);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(chronology68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.minusDays((int) (short) -1);
        int int72 = dateMidnight71.getYearOfEra();
        org.joda.time.Chronology chronology73 = dateMidnight71.getChronology();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology73);
        mutablePeriod59.add(0L, chronology73);
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) (-1), chronology73);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight(chronology80);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.minusDays((int) (short) -1);
        int int84 = dateMidnight83.getYearOfEra();
        org.joda.time.Chronology chronology85 = dateMidnight83.getChronology();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology85);
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime((long) (short) 10, chronology85);
        org.joda.time.MutableDateTime mutableDateTime88 = dateMidnight76.toMutableDateTime(chronology85);
        mutableDateTime88.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime88.millisOfDay();
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime88.era();
        boolean boolean93 = dateTimeZone52.equals((java.lang.Object) mutableDateTime88);
        org.joda.time.DateMidnight dateMidnight94 = new org.joda.time.DateMidnight(dateTimeZone52);
        org.joda.time.DateTime dateTime95 = dateTime50.withZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime dateTime96 = dateTime25.withZone(dateTimeZone52);
        long long98 = dateTimeZone2.getMillisKeepLocal(dateTimeZone52, (long) 26680607);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime96", (dateTime25.compareTo(dateTime96) == 0) == dateTime25.equals(dateTime96));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.minus((long) 50);
        org.joda.time.Instant instant5 = instant1.minus(36000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology14, locale18, (java.lang.Integer) 9, (int) (short) 0);
        long long23 = dateTimeParserBucket21.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (-1), chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight49.toMutableDateTime(chronology58);
        mutableDateTime61.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        boolean boolean66 = dateTimeZone25.equals((java.lang.Object) mutableDateTime61);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        dateTimeParserBucket21.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) instant1, dateTimeZone25);
        long long71 = dateTimeZone25.convertUTCToLocal(4150911252232096L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime69", (instant1.compareTo(mutableDateTime69) == 0) == instant1.equals(mutableDateTime69));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        org.joda.time.DateTime dateTime66 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.plusWeeks(4);
        int int69 = dateTime68.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime71 = dateTime68.toDateTime(dateTimeZone70);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        boolean boolean74 = dateTimeZone72.isStandardOffset((long) '#');
        java.lang.String str75 = dateTimeZone72.getID();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone72);
        long long78 = dateTimeZone70.getMillisKeepLocal(dateTimeZone72, (long) 339);
        org.joda.time.LocalDate localDate79 = org.joda.time.LocalDate.now(dateTimeZone72);
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and dateTime71", (dateTime68.compareTo(dateTime71) == 0) == dateTime68.equals(dateTime71));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        long long4 = instant2.getMillis();
        org.joda.time.DateTime dateTime5 = instant2.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Interval interval3 = dateMidnight1.toInterval();
        org.joda.time.Instant instant4 = dateMidnight1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        long long12 = dateMidnight9.getMillis();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withMillis((long) 7);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        long long21 = dateMidnight18.getMillis();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.days();
        org.joda.time.Period period23 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight18, periodType22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight18.toMutableDateTimeISO();
        int int25 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime24.addYears(131485);
        int int28 = mutableDateTime24.getMillisOfDay();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        java.lang.String str31 = periodType29.getName();
        java.util.Date date35 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromDateFields(date35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay36.withFieldAdded(durationFieldType38, 0);
        int int41 = periodType29.indexOf(durationFieldType38);
        org.joda.time.PeriodType periodType42 = periodType29.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) mutableDateTime24, periodType42);
        int int44 = mutableDateTime24.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant4", (dateMidnight1.compareTo(instant4) == 0) == dateMidnight1.equals(instant4));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod13.getSeconds();
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
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime51.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) '#');
        long long59 = duration58.getMillis();
        boolean boolean60 = duration54.isEqual((org.joda.time.ReadableDuration) duration58);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType62 = periodType61.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration54, periodType62);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology68);
        mutablePeriod69.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod69.add(0L);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight(chronology78);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.minusDays((int) (short) -1);
        int int82 = dateMidnight81.getYearOfEra();
        org.joda.time.Chronology chronology83 = dateMidnight81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology83);
        mutablePeriod69.add(0L, chronology83);
        boolean boolean86 = dateTimeFieldType65.isSupported(chronology83);
        org.joda.time.DateTimeField dateTimeField87 = chronology83.millisOfSecond();
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((long) (short) 1, chronology83);
        org.joda.time.Period period89 = duration54.toPeriod(chronology83);
        org.joda.time.DurationField durationField90 = chronology83.weeks();
        org.joda.time.DurationField durationField91 = chronology83.eras();
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField90 and durationField91", Math.signum(durationField90.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField90)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTimeISO();
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getSecondOfMinute();
        int int12 = property7.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateMidnight dateMidnight13 = property7.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight13.toYearMonthDay();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight13, readableInstant15);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        int int26 = mutablePeriod21.getValue(0);
        mutablePeriod21.addMinutes(0);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration34 = duration30.withDurationAdded((org.joda.time.ReadableDuration) duration32, 12);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(10L);
        boolean boolean37 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration36);
        mutablePeriod21.add((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration40 = duration32.plus((-1L));
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays((long) '#');
        long long43 = duration42.getMillis();
        boolean boolean44 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Interval interval45 = interval16.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology48 = instant47.getChronology();
        org.joda.time.Instant instant50 = instant47.minus(31556952000L);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        long long57 = dateMidnight54.getMillis();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.days();
        org.joda.time.Period period59 = duration52.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight54, periodType58);
        java.util.Date date60 = dateMidnight54.toDate();
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours(10L);
        long long63 = duration62.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.withMillis((long) 24);
        long long67 = dateMidnight66.getMillis();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration62, (org.joda.time.ReadableInstant) dateMidnight66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight54.minus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Instant instant70 = instant50.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.MutableDateTime mutableDateTime71 = instant50.toMutableDateTime();
        org.joda.time.Interval interval72 = interval16.withStart((org.joda.time.ReadableInstant) instant50);
        boolean boolean73 = interval16.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and mutableDateTime71", (instant50.compareTo(mutableDateTime71) == 0) == instant50.equals(mutableDateTime71));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime14.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = dateTime33.withCenturyOfEra(16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTime dateTime20 = dateTime12.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime12.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime12.withYear(339);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime26", (dateTime12.compareTo(dateTime26) == 0) == dateTime12.equals(dateTime26));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField14 = chronology11.seconds();
        org.joda.time.DateTime dateTime15 = dateTime3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra(26584792);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        int int10 = dateMidnight9.getMinuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight9, chronology16);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(5L, chronology16);
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
        org.joda.time.Period period88 = period86.minusMillis(0);
        int[] intArray90 = chronology16.get((org.joda.time.ReadablePeriod) period86, (long) 653);
        boolean boolean91 = localDate7.equals((java.lang.Object) 653);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and yearMonthDay76", (localDate4.compareTo(yearMonthDay76) == 0) == localDate4.equals(yearMonthDay76));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        java.util.TimeZone timeZone5 = calendar1.getTimeZone();
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
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
        org.joda.time.Period period30 = new org.joda.time.Period((long) 0, (long) 6, chronology27);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 122, chronology27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(dateTimeZone33);
        java.lang.String str35 = dateTimeZone33.getID();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology39);
        mutablePeriod40.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod40.add(0L);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        mutablePeriod40.add(0L, chronology54);
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (-1), chronology54);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 10, chronology66);
        org.joda.time.MutableDateTime mutableDateTime69 = dateMidnight57.toMutableDateTime(chronology66);
        mutableDateTime69.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime69.millisOfDay();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.era();
        boolean boolean74 = dateTimeZone33.equals((java.lang.Object) mutableDateTime69);
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime76 = dateTime31.withZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone77 = dateTimeZone33.toTimeZone();
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone77);
        int int79 = timeZone77.getRawOffset();
        boolean boolean80 = timeZone6.hasSameRules(timeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar78", (calendar1.compareTo(calendar78) == 0) == calendar1.equals(calendar78));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology8, locale12, (java.lang.Integer) 9, (int) (short) 0);
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfSecond(10);
        java.lang.String str24 = localDateTime20.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone26);
        java.lang.String str28 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime29 = localDateTime20.toDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfMonth();
        boolean boolean32 = dateTimeParserBucket15.restoreState((java.lang.Object) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long39 = dateTimeZone37.nextTransition((long) 22);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(56, 3, 9, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime41 = dateMidnight40.toMutableDateTimeISO();
        org.joda.time.Instant instant42 = dateMidnight40.toInstant();
        boolean boolean43 = dateTimeParserBucket15.restoreState((java.lang.Object) dateMidnight40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and instant42", (mutableDateTime41.compareTo(instant42) == 0) == mutableDateTime41.equals(instant42));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime33);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime33, dateTimeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone41.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and mutableDateTime42", (mutableDateTime33.compareTo(mutableDateTime42) == 0) == mutableDateTime33.equals(mutableDateTime42));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfSecond(10);
        java.lang.String str49 = localDateTime45.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone51);
        java.lang.String str53 = dateTimeZone51.getID();
        org.joda.time.DateTime dateTime54 = localDateTime45.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime41.toDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime55", (dateTime18.compareTo(dateTime55) == 0) == dateTime18.equals(dateTime55));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        long long25 = dateTimeZone21.previousTransition((long) 56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property16 = dateTime13.centuryOfEra();
        int int17 = dateTime13.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime13.plus((long) 6);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMillisOfSecond(10);
        java.lang.String str27 = localDateTime23.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        java.lang.String str31 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime32 = localDateTime23.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime13.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 26707428, dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime33", (dateTime13.compareTo(dateTime33) == 0) == dateTime13.equals(dateTime33));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration21 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration19, 12);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration27 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration25, 12);
        boolean boolean28 = duration17.isEqual((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime30 = dateTime10.withDurationAdded((org.joda.time.ReadableDuration) duration17, 47);
        long long31 = duration17.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.joda.time.DateTime dateTime66 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.plusWeeks(4);
        org.joda.time.DateTime dateTime71 = dateTime66.withDurationAdded(0L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long76 = dateTimeZone73.adjustOffset((long) 10, false);
        org.joda.time.DateTime dateTime77 = dateTime66.toDateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime79 = dateTime77.minusWeeks((-292275054));
        org.joda.time.Period period81 = org.joda.time.Period.years(14);
        int int82 = period81.getMillis();
        org.joda.time.DateTime dateTime83 = dateTime79.minus((org.joda.time.ReadablePeriod) period81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight37 and dateTime77", (dateMidnight37.compareTo(dateTime77) == 0) == dateMidnight37.equals(dateTime77));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime15.withCenturyOfEra(8);
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
        org.joda.time.Period period42 = new org.joda.time.Period((long) 0, (long) 6, chronology39);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 122, chronology39);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone45);
        java.lang.String str47 = dateTimeZone45.getID();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology51);
        mutablePeriod52.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod52.add(0L);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutablePeriod52.add(0L, chronology66);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (-1), chronology66);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        int int77 = dateMidnight76.getYearOfEra();
        org.joda.time.Chronology chronology78 = dateMidnight76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology78);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (short) 10, chronology78);
        org.joda.time.MutableDateTime mutableDateTime81 = dateMidnight69.toMutableDateTime(chronology78);
        mutableDateTime81.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime81.millisOfDay();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime81.era();
        boolean boolean86 = dateTimeZone45.equals((java.lang.Object) mutableDateTime81);
        org.joda.time.DateMidnight dateMidnight87 = new org.joda.time.DateMidnight(dateTimeZone45);
        org.joda.time.DateTime dateTime88 = dateTime43.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTime dateTime89 = dateTime18.withZone(dateTimeZone45);
        long long91 = dateTimeZone45.convertUTCToLocal(4346618617L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime89", (dateTime18.compareTo(dateTime89) == 0) == dateTime18.equals(dateTime89));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DurationField durationField12 = chronology9.weekyears();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 122, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.Instant instant86 = instant24.minus(1166400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        long long6 = duration5.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = duration5.toPeriod();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval10 = yearMonthDay9.toInterval();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.Interval interval13 = interval10.gap((org.joda.time.ReadableInterval) interval12);
        boolean boolean15 = interval10.isBefore(100L);
        long long16 = interval10.getEndMillis();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod21.add(0L);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        mutablePeriod21.add(0L, chronology35);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (-1), chronology35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusDays((int) (short) -1);
        int int46 = dateMidnight45.getYearOfEra();
        org.joda.time.Chronology chronology47 = dateMidnight45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 10, chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = dateMidnight38.toMutableDateTime(chronology47);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight38.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight38.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight38.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval57 = interval10.withStart((org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 10, chronology66);
        org.joda.time.DateTime dateTime70 = dateTime68.minusHours(7);
        org.joda.time.DateTime dateTime72 = dateTime70.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime74 = dateTime72.withEra((int) (short) 0);
        org.joda.time.Instant instant75 = dateTime72.toInstant();
        boolean boolean76 = interval57.isBefore((org.joda.time.ReadableInstant) instant75);
        org.joda.time.MutableDateTime mutableDateTime77 = instant75.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime78 = instant75.toDateTime();
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration84 = duration80.withDurationAdded((org.joda.time.ReadableDuration) duration82, 12);
        long long85 = duration80.getStandardMinutes();
        org.joda.time.Instant instant86 = instant75.minus((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Period period88 = org.joda.time.Period.days(4);
        org.joda.time.Period period90 = period88.plusMinutes(32770);
        org.joda.time.Period period92 = period90.multipliedBy(35);
        org.joda.time.Duration duration93 = period92.toStandardDuration();
        boolean boolean94 = duration80.isLongerThan((org.joda.time.ReadableDuration) duration93);
        int int95 = duration5.compareTo((org.joda.time.ReadableDuration) duration93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime70 and instant75", (dateTime70.compareTo(instant75) == 0) == dateTime70.equals(instant75));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Interval interval3 = dateMidnight1.toInterval();
        org.joda.time.Instant instant4 = dateMidnight1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTimeISO();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant4", (dateMidnight1.compareTo(instant4) == 0) == dateMidnight1.equals(instant4));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 10, chronology10);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(7);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property19 = dateTime16.millisOfSecond();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        long long27 = chronology23.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.weekyear();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology23);
        org.joda.time.DateTime dateTime30 = dateTime16.toDateTime(chronology23);
        org.joda.time.DateTimeField dateTimeField31 = chronology23.millisOfSecond();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (-11), (long) 2119, chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime30", (dateTime14.compareTo(dateTime30) == 0) == dateTime14.equals(dateTime30));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight1.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withYearOfCentury((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withYear(17);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours(10L);
        long long11 = duration10.getStandardSeconds();
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration15 = duration10.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology18);
        mutablePeriod19.setPeriod((long) (short) 10, (long) (short) -1);
        int int24 = mutablePeriod19.getValue(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        org.joda.time.Duration duration29 = mutablePeriod19.toDurationTo((org.joda.time.ReadableInstant) dateMidnight26);
        org.joda.time.Duration duration30 = duration14.minus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight8.withDurationAdded((org.joda.time.ReadableDuration) duration14, 86399999);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant35 = instant34.toInstant();
        org.joda.time.DateTime dateTime36 = instant35.toDateTimeISO();
        long long37 = instant35.getMillis();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) instant35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime36", (instant35.compareTo(dateTime36) == 0) == instant35.equals(dateTime36));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        org.joda.time.Instant instant61 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.clockhourOfDay();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(chronology69);
        int int73 = dateTime72.getWeekOfWeekyear();
        boolean boolean74 = instant61.isEqual((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant75 = instant61.toInstant();
        boolean boolean76 = instant61.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant61", (mutableDateTime33.compareTo(instant61) == 0) == mutableDateTime33.equals(instant61));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str86 = dateTimeFieldType85.getName();
        boolean boolean87 = instant84.isSupported(dateTimeFieldType85);
        org.joda.time.Instant instant89 = instant84.withMillis((long) 28);
        org.joda.time.Instant instant91 = instant84.withMillis((long) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime92 = instant84.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(54);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) '#');
        java.lang.String str21 = dateTimeZone18.getID();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology23 = mutableDateTime22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime13.withChronology(chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 22, chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime24", (dateTime13.compareTo(dateTime24) == 0) == dateTime13.equals(dateTime24));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant8 = instant1.minus(101L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        int int3 = dateMidnight2.getMillisOfSecond();
        org.joda.time.Interval interval4 = dateMidnight2.toInterval();
        org.joda.time.Instant instant5 = dateMidnight2.toInstant();
        org.joda.time.Period period7 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight2.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        long long13 = dateMidnight10.getMillis();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withMillis((long) 7);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        long long22 = dateMidnight19.getMillis();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration17.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight19, periodType23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateMidnight19.toMutableDateTimeISO();
        int int26 = dateMidnight15.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        mutableDateTime25.addYears(131485);
        int int29 = mutableDateTime25.getMillisOfDay();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        java.lang.String str32 = periodType30.getName();
        java.util.Date date36 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromDateFields(date36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType38.getDurationType();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay37.withFieldAdded(durationFieldType39, 0);
        int int42 = periodType30.indexOf(durationFieldType39);
        org.joda.time.PeriodType periodType43 = periodType30.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) mutableDateTime25, periodType43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((long) 10, chronology46);
        org.joda.time.DateTimeField[] dateTimeFieldArray48 = timeOfDay47.getFields();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((long) 10, chronology50);
        org.joda.time.DateTimeField[] dateTimeFieldArray52 = timeOfDay51.getFields();
        org.joda.time.Period period53 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay47, (org.joda.time.ReadablePartial) timeOfDay51);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean55 = timeOfDay51.isSupported(dateTimeFieldType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusDays((int) (short) -1);
        int int62 = dateMidnight61.getYearOfEra();
        org.joda.time.Chronology chronology63 = dateMidnight61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.clockhourOfDay();
        boolean boolean66 = dateTimeFieldType54.isSupported(chronology63);
        org.joda.time.DateTimeField dateTimeField67 = chronology63.dayOfWeek();
        org.joda.time.DurationField durationField68 = chronology63.months();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 18, periodType43, chronology63);
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and instant5", (dateMidnight2.compareTo(instant5) == 0) == dateMidnight2.equals(instant5));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.LocalDate localDate27 = localDate25.plusMonths(31);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        java.lang.String str31 = dateTimeZone29.getID();
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
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime65.era();
        boolean boolean70 = dateTimeZone29.equals((java.lang.Object) mutableDateTime65);
        org.joda.time.DateTime dateTime71 = localDate27.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.Interval interval72 = localDate27.toInterval();
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(locale73);
        calendar74.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((java.lang.Object) calendar74);
        org.joda.time.Interval interval78 = localDate77.toInterval();
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.Interval interval80 = interval78.withPeriodBeforeEnd(readablePeriod79);
        org.joda.time.Interval interval81 = interval72.gap((org.joda.time.ReadableInterval) interval80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate25 and localDate77", (localDate25.compareTo(localDate77) == 0) == localDate25.equals(localDate77));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        long long17 = dateTimeZone14.convertUTCToLocal(873903906000L);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.DateTime dateTime19 = dateTime12.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime15", (dateTime10.compareTo(dateTime15) == 0) == dateTime10.equals(dateTime15));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(dateTimeZone2);
        java.lang.String str4 = dateTimeZone2.getID();
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 10, chronology35);
        org.joda.time.MutableDateTime mutableDateTime38 = dateMidnight26.toMutableDateTime(chronology35);
        mutableDateTime38.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.millisOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime38.era();
        boolean boolean43 = dateTimeZone2.equals((java.lang.Object) mutableDateTime38);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 32769, dateTimeZone2);
        org.joda.time.LocalDate localDate47 = localDate45.withWeekyear(86399999);
        int int48 = localDate47.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = localDate47.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.clockhourOfDay();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology58);
        org.joda.time.DateTime dateTime63 = dateTime61.minusSeconds(4);
        org.joda.time.LocalTime localTime64 = dateTime63.toLocalTime();
        org.joda.time.DateTime dateTime66 = dateTime63.withMillisOfSecond((int) (byte) 100);
        int int67 = dateTime63.getSecondOfMinute();
        org.joda.time.DateTime.Property property68 = dateTime63.dayOfMonth();
        org.joda.time.DateTime dateTime70 = dateTime63.withWeekyear(53);
        org.joda.time.DateTime dateTime72 = dateTime70.withWeekOfWeekyear(24);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long79 = dateTimeZone77.nextTransition((long) 22);
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(56, 3, 9, dateTimeZone77);
        long long82 = dateTimeZone77.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime83 = dateTime72.withZoneRetainFields(dateTimeZone77);
        long long85 = dateTimeZone49.getMillisKeepLocal(dateTimeZone77, (long) 86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime44 and dateTime61", (mutableDateTime44.compareTo(dateTime61) == 0) == mutableDateTime44.equals(dateTime61));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime5 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 10, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours(7);
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime20.withEra((int) (short) 0);
        org.joda.time.Chronology chronology23 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime20.plusSeconds(9);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardDays((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration33, readableInstant34);
        org.joda.time.PeriodType periodType36 = period35.getPeriodType();
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
        org.joda.time.DurationField durationField71 = chronology67.months();
        org.joda.time.DateTimeField dateTimeField72 = chronology67.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(36000L, periodType36, chronology67);
        org.joda.time.Period period74 = duration27.toPeriodTo((org.joda.time.ReadableInstant) dateTime31, periodType36);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime31);
        boolean boolean76 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration79 = new org.joda.time.Duration((-1704067200000L), 3024000000L);
        org.joda.time.DateTime dateTime81 = dateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration79, 339);
        org.joda.time.Period period82 = duration79.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime31", (dateTime4.compareTo(dateTime31) == 0) == dateTime4.equals(dateTime31));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, 36000L, periodType12);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(10);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours(10L);
        long long27 = duration26.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.withDurationAdded((org.joda.time.ReadableDuration) duration26, (int) (short) 10);
        boolean boolean30 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int39 = mutablePeriod34.getValue(0);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        org.joda.time.Duration duration44 = mutablePeriod34.toDurationTo((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Duration duration47 = duration44.withDurationAdded((long) 32769, 0);
        org.joda.time.Duration duration49 = duration26.withDurationAdded((org.joda.time.ReadableDuration) duration47, 35);
        int int50 = duration14.compareTo((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime15.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime15.millisOfSecond();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        long long26 = chronology22.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekyear();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology22);
        org.joda.time.DateTime dateTime29 = dateTime15.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField30 = chronology22.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "1182", chronology22);
        int int32 = mutableDateTime31.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "07:22:45.446", "07:22:45.446");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        calendar11.setMinimalDaysInFirstWeek(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField28 = chronology25.seconds();
        org.joda.time.DateTime dateTime29 = dateTime17.withChronology(chronology25);
        boolean boolean30 = calendar11.before((java.lang.Object) chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime29", (dateTime17.compareTo(dateTime29) == 0) == dateTime17.equals(dateTime29));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        mutablePeriod3.addMinutes(0);
        mutablePeriod3.setMonths((int) (byte) 10);
        java.lang.Object obj13 = mutablePeriod3.clone();
        mutablePeriod3.addSeconds(14);
        int int16 = mutablePeriod3.getMonths();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours(10L);
        long long19 = duration18.getStandardSeconds();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration23 = duration18.plus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology26);
        mutablePeriod27.setPeriod((long) (short) 10, (long) (short) -1);
        int int32 = mutablePeriod27.getValue(0);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        org.joda.time.Duration duration37 = mutablePeriod27.toDurationTo((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.Duration duration38 = duration22.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusDays((int) (short) -1);
        int int46 = dateMidnight45.getYearOfEra();
        org.joda.time.Chronology chronology47 = dateMidnight45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 10, chronology47);
        org.joda.time.DateTime dateTime51 = dateTime49.minusHours(7);
        org.joda.time.DateTime dateTime53 = dateTime51.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime55 = dateTime53.withEra((int) (short) 0);
        org.joda.time.Chronology chronology56 = dateTime53.getChronology();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration38, chronology56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableDuration58, readableInstant59);
        org.joda.time.PeriodType periodType61 = period60.getPeriodType();
        org.joda.time.PeriodType periodType62 = periodType61.withDaysRemoved();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, chronology71);
        org.joda.time.DurationField durationField74 = chronology71.weekyears();
        org.joda.time.DurationField durationField75 = chronology71.eras();
        org.joda.time.Period period76 = duration38.toPeriod(periodType62, chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField74 and durationField75", Math.signum(durationField74.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField74)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.plus(1645514595578L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant4.withMillis((long) 52);
        long long8 = instant7.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime5", (instant4.compareTo(mutableDateTime5) == 0) == instant4.equals(mutableDateTime5));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTime dateTime20 = dateTime12.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime12.withZone(dateTimeZone22);
        boolean boolean28 = dateTimeZone22.isStandardOffset(36000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime26", (dateTime12.compareTo(dateTime26) == 0) == dateTime12.equals(dateTime26));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(10);
        java.lang.String str26 = localDateTime22.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime31 = localDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime12.toDateTime(dateTimeZone28);
        java.util.TimeZone timeZone33 = dateTimeZone28.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime32", (dateTime12.compareTo(dateTime32) == 0) == dateTime12.equals(dateTime32));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant6 = instant1.plus((long) 47);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        int int9 = dateMidnight8.getMillisOfSecond();
        org.joda.time.Interval interval10 = dateMidnight8.toInterval();
        org.joda.time.Instant instant11 = dateMidnight8.toInstant();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.Period period14 = period12.plusWeeks(364);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant11", (dateMidnight8.compareTo(instant11) == 0) == dateMidnight8.equals(instant11));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime14.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillis((long) 50400000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.minus((long) 50);
        org.joda.time.Instant instant5 = instant1.minus(36000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology14, locale18, (java.lang.Integer) 9, (int) (short) 0);
        long long23 = dateTimeParserBucket21.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (-1), chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight49.toMutableDateTime(chronology58);
        mutableDateTime61.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        boolean boolean66 = dateTimeZone25.equals((java.lang.Object) mutableDateTime61);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        dateTimeParserBucket21.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) instant1, dateTimeZone25);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(chronology70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusDays((int) (short) -1);
        int int74 = dateMidnight73.getYearOfEra();
        org.joda.time.Chronology chronology75 = dateMidnight73.getChronology();
        long long76 = dateMidnight73.getMillis();
        org.joda.time.DateMidnight.Property property77 = dateMidnight73.weekyear();
        long long78 = property77.remainder();
        org.joda.time.DateMidnight dateMidnight79 = property77.roundHalfCeilingCopy();
        int int80 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateMidnight79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime69", (instant1.compareTo(mutableDateTime69) == 0) == instant1.equals(mutableDateTime69));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DurationField durationField11 = chronology8.weekyears();
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DurationField durationField13 = chronology8.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = dateTimeField9.getType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.setPeriod((long) (short) 10, (long) (short) -1);
        int int20 = mutablePeriod15.getValue(0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        org.joda.time.Duration duration25 = mutablePeriod15.toDurationTo((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.halfdayOfDay();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight22, chronology33);
        org.joda.time.DateTimeField dateTimeField38 = chronology33.year();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone40);
        java.lang.String str42 = dateTimeZone40.getID();
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
        mutableDateTime76.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime76.millisOfDay();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime76.era();
        boolean boolean81 = dateTimeZone40.equals((java.lang.Object) mutableDateTime76);
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(dateTimeZone40);
        java.util.TimeZone timeZone83 = dateTimeZone40.toTimeZone();
        java.util.TimeZone timeZone84 = java.util.TimeZone.getDefault();
        boolean boolean85 = timeZone83.hasSameRules(timeZone84);
        java.util.Locale locale86 = java.util.Locale.KOREAN;
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone83, locale86);
        int int88 = dateTimeField38.getMaximumShortTextLength(locale86);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(locale86);
        java.lang.String str90 = dateTimeField9.getAsShortText((long) 26680607, locale86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar87 and calendar89", (calendar87.compareTo(calendar89) == 0) == calendar87.equals(calendar89));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths(10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.DateTime dateTime49 = dateTime37.toDateTime(chronology46);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology46);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = new org.joda.time.Period(1645574400000L, periodType54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withPeriodAdded((org.joda.time.ReadablePeriod) period55, (int) (byte) 0);
        int[] intArray59 = chronology46.get((org.joda.time.ReadablePartial) localDateTime57, (long) 3);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology46);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight22.withChronology(chronology46);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology46, locale62);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        dateTimeParserBucket63.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.withMillisOfSecond(10);
        java.lang.String str74 = localDateTime70.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(dateTimeZone76);
        java.lang.String str78 = dateTimeZone76.getID();
        org.joda.time.DateTime dateTime79 = localDateTime70.toDateTime(dateTimeZone76);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(dateTimeZone76);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(dateTimeZone76);
        int int83 = dateTimeZone76.getOffset(32010L);
        dateTimeParserBucket63.setZone(dateTimeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and mutableDateTime80", (dateTime60.compareTo(mutableDateTime80) == 0) == dateTime60.equals(mutableDateTime80));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTime dateTime20 = dateTime12.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime12.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime26.plus(4346618617L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfDay();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateMidnight dateMidnight40 = dateTime39.toDateMidnight();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration46 = duration42.withDurationAdded((org.joda.time.ReadableDuration) duration44, 12);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight40, (org.joda.time.ReadableDuration) duration46);
        int int48 = mutablePeriod47.getMillis();
        mutablePeriod47.setPeriod(48, (-11), 55, 1987, 44, 5064, 2022, 339);
        java.lang.Object obj58 = mutablePeriod47.clone();
        org.joda.time.DateTime dateTime59 = dateTime28.plus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime26", (dateTime12.compareTo(dateTime26) == 0) == dateTime12.equals(dateTime26));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 10, chronology11);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours(7);
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property19 = dateTime15.property(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime15.weekOfWeekyear();
        org.joda.time.Duration duration21 = new org.joda.time.Duration((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Days days24 = duration23.toStandardDays();
        org.joda.time.Instant instant26 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration23, 964);
        org.joda.time.Minutes minutes27 = duration23.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.Period period14 = duration6.toPeriod();
        long long15 = duration6.getStandardSeconds();
        org.joda.time.Instant instant17 = instant4.withDurationAdded((org.joda.time.ReadableDuration) duration6, 151);
        org.joda.time.Minutes minutes18 = duration6.toStandardMinutes();
        org.joda.time.Period period19 = duration6.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant4", (dateMidnight1.compareTo(instant4) == 0) == dateMidnight1.equals(instant4));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.joda.time.TimeOfDay timeOfDay20 = property18.addToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay21 = property18.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay23 = property18.setCopy(24);
        int int24 = property18.getMinimumValueOverall();
        java.lang.String str25 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay26 = property18.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay28 = property18.addWrapFieldToCopy((int) (byte) 10);
        int int29 = timeOfDay28.getMinuteOfHour();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.Period period32 = new org.joda.time.Period(1645574400000L, periodType31);
        org.joda.time.Period period33 = period32.normalizedStandard();
        int int34 = period33.getSeconds();
        org.joda.time.Period period36 = period33.withMinutes((int) (byte) -1);
        org.joda.time.Period period38 = period36.withSeconds(3);
        org.joda.time.Period period40 = period38.plusMillis(345);
        org.joda.time.Period period42 = period38.plusMinutes(197057);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay28.plus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        int int46 = dateMidnight45.getMillisOfSecond();
        org.joda.time.Instant instant47 = dateMidnight45.toInstant();
        boolean boolean49 = instant47.isBefore((long) (short) 10);
        long long50 = instant47.getMillis();
        org.joda.time.Instant instant52 = instant47.minus((long) (-292275054));
        org.joda.time.DateTime dateTime53 = instant52.toDateTimeISO();
        boolean boolean54 = period38.equals((java.lang.Object) dateTime53);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusDays((int) (short) -1);
        int int62 = dateMidnight61.getYearOfEra();
        org.joda.time.Chronology chronology63 = dateMidnight61.getChronology();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.clockhourOfDay();
        org.joda.time.Period period66 = new org.joda.time.Period(123552000007L, chronology63);
        org.joda.time.Duration duration67 = period66.toStandardDuration();
        org.joda.time.Duration duration68 = period66.toStandardDuration();
        org.joda.time.Period period70 = period66.plusDays(845);
        org.joda.time.DateTime dateTime71 = dateTime53.plus((org.joda.time.ReadablePeriod) period70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight45 and instant47", (dateMidnight45.compareTo(instant47) == 0) == dateMidnight45.equals(instant47));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.lang.String str12 = dateTimeZone10.getID();
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
        mutableDateTime46.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.millisOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.era();
        boolean boolean51 = dateTimeZone10.equals((java.lang.Object) mutableDateTime46);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime53 = instant8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology56);
        mutablePeriod57.setPeriod((long) (short) 10, (long) (short) -1);
        int int62 = mutablePeriod57.getValue(0);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(chronology63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.minusDays((int) (short) -1);
        org.joda.time.Duration duration67 = mutablePeriod57.toDurationTo((org.joda.time.ReadableInstant) dateMidnight64);
        java.util.Date date73 = new java.util.Date((int) (short) 0, 11, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        org.joda.time.LocalDate localDate74 = org.joda.time.LocalDate.fromDateFields(date73);
        org.joda.time.LocalDate localDate76 = localDate74.minusYears(22);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology79);
        mutablePeriod80.setPeriod((long) (short) 10, (long) (short) -1);
        int int85 = mutablePeriod80.getValue(0);
        mutablePeriod80.addMinutes(0);
        mutablePeriod80.setMonths((int) (byte) 10);
        java.lang.Object obj90 = mutablePeriod80.clone();
        mutablePeriod80.addSeconds(14);
        org.joda.time.LocalDate localDate93 = localDate74.minus((org.joda.time.ReadablePeriod) mutablePeriod80);
        mutablePeriod57.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod80);
        org.joda.time.DateTime dateTime95 = dateTime53.plus((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        org.joda.time.DateTime dateTime5 = interval1.getStart();
        long long6 = interval1.toDurationMillis();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval8 = yearMonthDay7.toInterval();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval10 = yearMonthDay9.toInterval();
        org.joda.time.Interval interval11 = interval8.gap((org.joda.time.ReadableInterval) interval10);
        boolean boolean13 = interval8.isBefore(100L);
        org.joda.time.Interval interval14 = interval8.toInterval();
        org.joda.time.Duration duration15 = interval8.toDuration();
        org.joda.time.Interval interval17 = interval8.withStartMillis(1645514595578L);
        org.joda.time.Interval interval18 = interval1.overlap((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval21 = yearMonthDay20.toInterval();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval23 = yearMonthDay22.toInterval();
        org.joda.time.Interval interval24 = interval21.gap((org.joda.time.ReadableInterval) interval23);
        boolean boolean26 = interval21.isBefore(100L);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration32 = duration28.withDurationAdded((org.joda.time.ReadableDuration) duration30, 12);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        long long39 = dateMidnight36.getMillis();
        org.joda.time.DateMidnight.Property property40 = dateMidnight36.weekyear();
        org.joda.time.DateMidnight dateMidnight41 = property40.roundCeilingCopy();
        org.joda.time.Interval interval42 = duration28.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.Interval interval43 = interval21.withDurationAfterStart((org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(dateTimeZone45);
        java.lang.String str47 = dateTimeZone45.getID();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology51);
        mutablePeriod52.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod52.add(0L);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutablePeriod52.add(0L, chronology66);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((long) (-1), chronology66);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        int int77 = dateMidnight76.getYearOfEra();
        org.joda.time.Chronology chronology78 = dateMidnight76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology78);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) (short) 10, chronology78);
        org.joda.time.MutableDateTime mutableDateTime81 = dateMidnight69.toMutableDateTime(chronology78);
        mutableDateTime81.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime81.millisOfDay();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime81.era();
        boolean boolean86 = dateTimeZone45.equals((java.lang.Object) mutableDateTime81);
        boolean boolean87 = interval21.contains((org.joda.time.ReadableInstant) mutableDateTime81);
        long long88 = interval21.getEndMillis();
        org.joda.time.Interval interval90 = interval21.withStartMillis((long) 32770);
        org.joda.time.Interval interval91 = interval18.overlap((org.joda.time.ReadableInterval) interval90);
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.DateMidnight dateMidnight93 = new org.joda.time.DateMidnight(chronology92);
        int int94 = dateMidnight93.getMillisOfSecond();
        org.joda.time.Instant instant95 = dateMidnight93.toInstant();
        org.joda.time.Chronology chronology96 = instant95.getChronology();
        org.joda.time.Interval interval97 = interval18.withChronology(chronology96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant95", (dateTime5.compareTo(instant95) == 0) == dateTime5.equals(instant95));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.Instant instant10 = instant8.toInstant();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(4406400000L, chronology11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval18 = yearMonthDay17.toInterval();
        org.joda.time.Interval interval19 = interval16.gap((org.joda.time.ReadableInterval) interval18);
        boolean boolean21 = interval16.isBefore(100L);
        long long22 = interval16.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight44.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight44.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight44.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval63 = interval16.withStart((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(chronology67);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.minusDays((int) (short) -1);
        int int71 = dateMidnight70.getYearOfEra();
        org.joda.time.Chronology chronology72 = dateMidnight70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (short) 10, chronology72);
        org.joda.time.DateTime dateTime76 = dateTime74.minusHours(7);
        org.joda.time.DateTime dateTime78 = dateTime76.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime80 = dateTime78.withEra((int) (short) 0);
        org.joda.time.Instant instant81 = dateTime78.toInstant();
        boolean boolean82 = interval63.isBefore((org.joda.time.ReadableInstant) instant81);
        org.joda.time.MutableDateTime mutableDateTime83 = instant81.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime84 = instant81.toDateTime();
        org.joda.time.Duration duration86 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration88 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration90 = duration86.withDurationAdded((org.joda.time.ReadableDuration) duration88, 12);
        long long91 = duration86.getStandardMinutes();
        org.joda.time.Instant instant92 = instant81.minus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime76 and instant81", (dateTime76.compareTo(instant81) == 0) == dateTime76.equals(instant81));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusDays((int) (short) -1);
        int int5 = dateMidnight4.getYearOfEra();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        java.lang.String str7 = chronology6.toString();
        org.joda.time.DurationField durationField8 = chronology6.hours();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 1, chronology6, locale11, (java.lang.Integer) 35, (int) ' ');
        org.joda.time.DurationField durationField16 = chronology6.eras();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfSecond(10);
        java.lang.String str33 = localDateTime29.toString("1970-01-01");
        int[] intArray35 = chronology24.get((org.joda.time.ReadablePartial) localDateTime29, (long) (-1));
        org.joda.time.DurationField durationField36 = chronology24.seconds();
        boolean boolean37 = durationField36.isSupported();
        long long40 = durationField36.getMillis((long) (-11), 14L);
        int int41 = durationField16.compareTo(durationField36);
        long long43 = durationField36.getValueAsLong((long) 26596049);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField16", Math.signum(durationField8.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField8)));
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
        org.joda.time.Instant instant61 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.clockhourOfDay();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(chronology69);
        int int73 = dateTime72.getWeekOfWeekyear();
        boolean boolean74 = instant61.isEqual((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime.Property property75 = dateTime72.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant61", (mutableDateTime33.compareTo(instant61) == 0) == mutableDateTime33.equals(instant61));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.plusDays(7);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay0.minusMonths(131485);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusMonths((int) (byte) 100);
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
        mutableDateTime41.setYear(2022);
        mutableDateTime41.addMillis(26574655);
        mutableDateTime41.setMillis(117L);
        mutableDateTime41.setMillisOfDay((int) (byte) 100);
        mutableDateTime41.addSeconds(2011);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int55 = dateTimeZone53.getOffsetFromLocal((long) 23);
        int int57 = dateTimeZone53.getOffset((long) 'a');
        java.lang.String str58 = dateTimeZone53.toString();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime41.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight60 = yearMonthDay5.toDateMidnight(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and mutableDateTime59", (mutableDateTime41.compareTo(mutableDateTime59) == 0) == mutableDateTime41.equals(mutableDateTime59));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(35);
        java.lang.String str32 = dateTime30.toString("6");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime11.withChronology(chronology19);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((long) 10, chronology25);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((long) 10, chronology29);
        org.joda.time.DateTimeField[] dateTimeFieldArray31 = timeOfDay30.getFields();
        org.joda.time.Period period32 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay26, (org.joda.time.ReadablePartial) timeOfDay30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((long) 10, chronology34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = timeOfDay35.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay35.plusSeconds((int) '4');
        int int39 = timeOfDay26.compareTo((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay26.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property42 = timeOfDay26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        org.joda.time.TimeOfDay timeOfDay44 = property42.getTimeOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology55.getZone();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 100, dateTimeZone58);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 40, (long) 429, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = timeOfDay44.toDateTimeToday(dateTimeZone58);
        boolean boolean62 = localTime23.isEqual((org.joda.time.ReadablePartial) timeOfDay44);
        org.joda.time.TimeOfDay timeOfDay64 = timeOfDay44.withHourOfDay(0);
        org.joda.time.Instant instant66 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime67 = instant66.toDateTimeISO();
        org.joda.time.Chronology chronology68 = instant66.getChronology();
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay64.withChronologyRetainFields(chronology68);
        org.joda.time.TimeOfDay.Property property70 = timeOfDay64.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant66 and dateTime67", (instant66.compareTo(dateTime67) == 0) == instant66.equals(dateTime67));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 10, chronology10);
        org.joda.time.DurationField durationField13 = chronology10.weekyears();
        org.joda.time.DurationField durationField14 = chronology10.eras();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 374, periodType1, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str86 = dateTimeFieldType85.getName();
        boolean boolean87 = instant84.isSupported(dateTimeFieldType85);
        org.joda.time.Instant instant89 = instant84.withMillis((long) 28);
        org.joda.time.DateTimeZone dateTimeZone90 = instant84.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime14.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds(191);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight29.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight29.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight29.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval48 = interval1.withStart((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime63.withEra((int) (short) 0);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = interval48.isBefore((org.joda.time.ReadableInstant) instant66);
        boolean boolean68 = interval48.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant66", (dateTime61.compareTo(instant66) == 0) == dateTime61.equals(instant66));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 10, chronology10);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(7);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 0);
        int int17 = dateTime16.getMonthOfYear();
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
        mutableDateTime51.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime51.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime51.toMutableDateTime(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = yearMonthDay57.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.Duration duration61 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime51, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType65 = periodType64.withWeeksRemoved();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 1970, (long) 3, periodType64);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration61, periodType64);
        org.joda.time.DateTime dateTime68 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.plusWeeks(4);
        int int71 = dateTime70.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime73 = dateTime70.toDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        boolean boolean76 = dateTimeZone74.isStandardOffset((long) '#');
        java.lang.String str77 = dateTimeZone74.getID();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone74);
        long long80 = dateTimeZone72.getMillisKeepLocal(dateTimeZone74, (long) 339);
        org.joda.time.LocalDate localDate81 = org.joda.time.LocalDate.now(dateTimeZone74);
        org.joda.time.Interval interval82 = new org.joda.time.Interval((long) 26574907, 347155200000L, dateTimeZone74);
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and mutableDateTime78", (dateTime60.compareTo(mutableDateTime78) == 0) == dateTime60.equals(mutableDateTime78));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField14 = chronology11.seconds();
        org.joda.time.DateTime dateTime15 = dateTime3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField16 = chronology11.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTime dateTime20 = dateTime12.withWeekOfWeekyear(31);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime12.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = dateTime26.plus(4346618617L);
        int int29 = dateTime28.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime26", (dateTime12.compareTo(dateTime26) == 0) == dateTime12.equals(dateTime26));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant6 = instant1.plus((long) 47);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        int int9 = dateMidnight8.getMillisOfSecond();
        org.joda.time.Interval interval10 = dateMidnight8.toInterval();
        org.joda.time.Instant instant11 = dateMidnight8.toInstant();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.MutableDateTime mutableDateTime13 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant11", (dateMidnight8.compareTo(instant11) == 0) == dateMidnight8.equals(instant11));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Interval interval3 = dateMidnight1.toInterval();
        org.joda.time.Instant instant4 = dateMidnight1.toInstant();
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 10, chronology35);
        org.joda.time.MutableDateTime mutableDateTime38 = dateMidnight26.toMutableDateTime(chronology35);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime38.add((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours(10L);
        long long45 = duration44.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.withMillis((long) 24);
        long long49 = dateMidnight48.getMillis();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.Period period51 = duration44.toPeriod();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardDays((long) 7);
        int int54 = duration44.compareTo((org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration41.isLongerThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Period period56 = duration41.toPeriod();
        org.joda.time.Instant instant58 = instant4.withDurationAdded((org.joda.time.ReadableDuration) duration41, 78);
        org.joda.time.MutableDateTime mutableDateTime59 = instant58.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant4", (dateMidnight1.compareTo(instant4) == 0) == dateMidnight1.equals(instant4));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime15.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime15.millisOfSecond();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        long long26 = chronology22.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekyear();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology22);
        org.joda.time.DateTime dateTime29 = dateTime15.toDateTime(chronology22);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean32 = dateTimeZone30.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = dateTime15.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((-46800000L), dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Property[dayOfWeek]");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        calendar3.setMinimalDaysInFirstWeek(429);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar3);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long13 = dateTimeZone11.nextTransition((long) 22);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(56, 3, 9, dateTimeZone11);
        org.joda.time.DateTime dateTime15 = yearMonthDay6.toDateTimeAtCurrentTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar3", (calendar2.compareTo(calendar3) == 0) == calendar2.equals(calendar3));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.lang.String str5 = dateTimeZone3.getID();
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
        mutableDateTime39.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.millisOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.era();
        boolean boolean44 = dateTimeZone3.equals((java.lang.Object) mutableDateTime39);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.util.TimeZone timeZone46 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 10, dateTimeZone3);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 547, dateTimeZone3);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.MutableDateTime mutableDateTime51 = instant50.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.DurationField durationField27 = chronology21.eras();
        org.joda.time.DurationField durationField28 = chronology21.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.util.Date date16 = localDate15.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtStartOfDay(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(554);
        org.joda.time.DateTime dateTime25 = dateTime23.plusDays(359);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology29);
        mutablePeriod30.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod30.add(0L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        mutablePeriod30.add(0L, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (-1), chronology44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) 10, chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight47.toMutableDateTime(chronology56);
        mutableDateTime59.setYear(2022);
        mutableDateTime59.addMillis(26574655);
        mutableDateTime59.setMillis(117L);
        mutableDateTime59.setMillisOfDay((int) (byte) 100);
        mutableDateTime59.addSeconds(2011);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int73 = dateTimeZone71.getOffsetFromLocal((long) 23);
        int int75 = dateTimeZone71.getOffset((long) 'a');
        java.lang.String str76 = dateTimeZone71.toString();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime59.toMutableDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime78 = dateTime25.withZoneRetainFields(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime59 and mutableDateTime77", (mutableDateTime59.compareTo(mutableDateTime77) == 0) == mutableDateTime59.equals(mutableDateTime77));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getSecondOfMinute();
        int int12 = property7.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateMidnight dateMidnight13 = property7.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight13.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears(1020);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        long long26 = dateMidnight23.getMillis();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.days();
        org.joda.time.Period period28 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        java.util.Date date29 = dateMidnight23.toDate();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(dateTimeZone31);
        java.lang.String str33 = dateTimeZone31.getID();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight23.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.weekyear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.millisOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime34.dayOfWeek();
        mutableDateTime34.setWeekyear(2022);
        java.lang.String str40 = mutableDateTime34.toString();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = mutableDateTime34.toDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime18, dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and mutableDateTime34", (dateMidnight1.compareTo(mutableDateTime34) == 0) == dateMidnight1.equals(mutableDateTime34));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Property[dayOfWeek]");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        calendar3.setMinimalDaysInFirstWeek(429);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar3);
        java.lang.String str7 = yearMonthDay6.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar3", (calendar2.compareTo(calendar3) == 0) == calendar2.equals(calendar3));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.lang.String str5 = dateTimeZone3.getID();
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
        mutableDateTime39.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.millisOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.era();
        boolean boolean44 = dateTimeZone3.equals((java.lang.Object) mutableDateTime39);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.util.TimeZone timeZone46 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 10, dateTimeZone3);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 547, dateTimeZone3);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.MutableDateTime mutableDateTime51 = instant50.toMutableDateTime();
        org.joda.time.Instant instant54 = instant50.withDurationAdded((long) 538, 599);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and mutableDateTime51", (dateTime49.compareTo(mutableDateTime51) == 0) == dateTime49.equals(mutableDateTime51));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Interval interval7 = interval5.withPeriodBeforeEnd(readablePeriod6);
        org.joda.time.MutableInterval mutableInterval8 = interval5.toMutableInterval();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        long long15 = dateMidnight12.getMillis();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.days();
        org.joda.time.Period period17 = duration10.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight12, periodType16);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime19 = yearMonthDay18.toDateTimeAtMidnight();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period17, (org.joda.time.ReadableInstant) dateTime19);
        boolean boolean21 = interval5.isAfter((org.joda.time.ReadableInterval) interval20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property25 = localDate23.dayOfMonth();
        boolean boolean26 = interval5.equals((java.lang.Object) property25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and yearMonthDay18", (localDate4.compareTo(yearMonthDay18) == 0) == localDate4.equals(yearMonthDay18));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Property[dayOfWeek]");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        calendar3.setMinimalDaysInFirstWeek(429);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar3", (calendar2.compareTo(calendar3) == 0) == calendar2.equals(calendar3));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.dayOfWeek();
        mutableDateTime14.setWeekyear(2022);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime14.toDateTime(dateTimeZone21);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = dateTimeFormatter26.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter29.getZone();
        java.lang.String str32 = dateTimeZone30.getShortName((long) 29);
        org.joda.time.DateTime dateTime33 = dateTime23.withZoneRetainFields(dateTimeZone30);
        org.joda.time.DateTime.Property property34 = dateTime23.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.lang.String str5 = dateTimeZone3.getID();
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
        mutableDateTime39.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.millisOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.era();
        boolean boolean44 = dateTimeZone3.equals((java.lang.Object) mutableDateTime39);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone3);
        java.util.TimeZone timeZone46 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) (short) 10, dateTimeZone3);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 547, dateTimeZone3);
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.MutableDateTime mutableDateTime51 = instant50.toMutableDateTime();
        org.joda.time.Chronology chronology52 = instant50.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and mutableDateTime51", (dateTime49.compareTo(mutableDateTime51) == 0) == dateTime49.equals(mutableDateTime51));
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(10);
        java.lang.String str26 = localDateTime22.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime31 = localDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime12.toDateTime(dateTimeZone28);
        org.joda.time.DateTime.Property property33 = dateTime12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime32", (dateTime12.compareTo(dateTime32) == 0) == dateTime12.equals(dateTime32));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration6);
        java.lang.Object obj8 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.Period period11 = new org.joda.time.Period(1645574400000L, periodType10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        int int13 = period12.getSeconds();
        org.joda.time.Period period15 = period12.withMinutes((int) (byte) -1);
        org.joda.time.Period period17 = period15.withSeconds(3);
        org.joda.time.DurationFieldType durationFieldType19 = period15.getFieldType(5);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime30.withChronology(chronology38);
        boolean boolean42 = durationFieldType19.isSupported(chronology38);
        org.joda.time.Period period43 = new org.joda.time.Period(obj8, chronology38);
        org.joda.time.DateTimeField dateTimeField44 = chronology38.secondOfMinute();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime3, chronology38);
        org.joda.time.Chronology chronology46 = chronology38.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime30", (dateTime3.compareTo(dateTime30) == 0) == dateTime3.equals(dateTime30));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long6 = dateTimeZone4.nextTransition((long) 22);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(56, 3, 9, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTimeISO();
        org.joda.time.Instant instant9 = dateMidnight7.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = instant9.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and dateTime10", (dateMidnight7.compareTo(dateTime10) == 0) == dateMidnight7.equals(dateTime10));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) '#');
        java.lang.String str3 = dateTimeZone0.getID();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter7.getZone();
        java.util.Locale locale10 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withDefaultYear((int) (byte) 10);
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = yearMonthDay14.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        int int20 = dateTimeZone18.getOffset((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight21 = yearMonthDay14.toDateMidnight(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter12.withZone(dateTimeZone18);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, 3600035L);
        boolean boolean25 = dateTimeZone0.isFixed();
        long long27 = dateTimeZone0.previousTransition(1642490701655L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime17", (mutableDateTime4.compareTo(dateTime17) == 0) == mutableDateTime4.equals(dateTime17));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        int int16 = dateTime15.getMonthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod21.add(0L);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        mutablePeriod21.add(0L, chronology35);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((long) (-1), chronology35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusDays((int) (short) -1);
        int int46 = dateMidnight45.getYearOfEra();
        org.joda.time.Chronology chronology47 = dateMidnight45.getChronology();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 10, chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = dateMidnight38.toMutableDateTime(chronology47);
        mutableDateTime50.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime50.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime50.toMutableDateTime(dateTimeZone54);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = yearMonthDay56.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime50, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType64 = periodType63.withWeeksRemoved();
        org.joda.time.Period period65 = new org.joda.time.Period((long) 1970, (long) 3, periodType63);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration60, periodType63);
        org.joda.time.DateTime dateTime67 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime69 = dateTime67.plusWeeks(4);
        int int70 = dateTime69.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime72 = dateTime69.toDateTime(dateTimeZone71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.minusDays((int) (short) -1);
        int int77 = dateMidnight76.getYearOfEra();
        org.joda.time.Chronology chronology78 = dateMidnight76.getChronology();
        long long79 = dateMidnight76.getMillis();
        org.joda.time.DateMidnight.Property property80 = dateMidnight76.weekyear();
        org.joda.time.DateMidnight dateMidnight81 = property80.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight82 = property80.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.withMonthOfYear(6);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight82.plusMonths(56);
        org.joda.time.Chronology chronology87 = dateMidnight86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime72.toMutableDateTime(chronology87);
        org.joda.time.YearMonthDay yearMonthDay89 = new org.joda.time.YearMonthDay((long) 26675856, chronology87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and dateTime72", (dateTime69.compareTo(dateTime72) == 0) == dateTime69.equals(dateTime72));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        int int29 = dateTime14.getWeekyear();
        org.joda.time.DateTime.Property property30 = dateTime14.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime28", (dateTime14.compareTo(dateTime28) == 0) == dateTime14.equals(dateTime28));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        int int5 = calendar1.getActualMinimum(10);
        java.util.Date date6 = calendar1.getTime();
        boolean boolean7 = calendar1.isWeekDateSupported();
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromCalendarFields(calendar1);
        java.lang.Object obj9 = calendar1.clone();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.setFirstDayOfWeek(24);
        calendar11.clear(12);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        calendar11.setTimeZone(timeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        long long24 = dateMidnight21.getMillis();
        org.joda.time.DateMidnight.Property property25 = dateMidnight21.weekyear();
        org.joda.time.DateMidnight dateMidnight26 = property25.withMaximumValue();
        boolean boolean27 = calendar11.before((java.lang.Object) dateMidnight26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withCenturyOfEra(2000);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology32);
        mutablePeriod33.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod33.getValue(0);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        org.joda.time.Duration duration43 = mutablePeriod33.toDurationTo((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.halfdayOfDay();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight40, chronology51);
        org.joda.time.Chronology chronology56 = chronology51.withUTC();
        org.joda.time.DurationField durationField57 = chronology56.millis();
        org.joda.time.MutableDateTime mutableDateTime58 = dateMidnight26.toMutableDateTime(chronology56);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay(obj9, chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight26 and mutableDateTime58", (dateMidnight26.compareTo(mutableDateTime58) == 0) == dateMidnight26.equals(mutableDateTime58));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        int int6 = dateMidnight3.getSecondOfMinute();
        org.joda.time.Instant instant7 = dateMidnight3.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.minuteOfHour();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        int int26 = dateMidnight24.getWeekyear();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight24.toYearMonthDay();
        org.joda.time.tz.NameProvider nameProvider29 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider29);
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str34 = nameProvider29.getName(locale31, "2022-02-22T00:00:00.000Z/2022-02-22T00:00:00.000Z", "centuryOfEra");
        java.lang.String str35 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) yearMonthDay27, 53, locale31);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = dateTimeField20.getType();
        int int37 = dateMidnight3.get(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateMidnight14", (instant7.compareTo(dateMidnight14) == 0) == instant7.equals(dateMidnight14));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.minus((long) 572);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod13.getSeconds();
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
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime51.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) '#');
        long long59 = duration58.getMillis();
        boolean boolean60 = duration54.isEqual((org.joda.time.ReadableDuration) duration58);
        org.joda.time.Instant instant62 = instant8.withDurationAdded((org.joda.time.ReadableDuration) duration54, 652);
        long long63 = duration54.getStandardHours();
        org.joda.time.Instant instant64 = instant4.plus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Chronology chronology65 = instant64.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        int int14 = localDate12.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate16 = localDate12.minusWeeks(9);
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfMonth();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str20 = localDate19.toString();
        org.joda.time.LocalDate.Property property21 = localDate19.weekyear();
        java.lang.String str22 = property21.getAsString();
        org.joda.time.LocalDate localDate23 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate24 = property21.roundHalfFloorCopy();
        int int25 = localDate24.getWeekyear();
        org.joda.time.LocalDate localDate26 = localDate16.withFields((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant31 = instant29.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime32 = instant29.toMutableDateTimeISO();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology35);
        mutablePeriod36.setPeriod((long) (short) 10, (long) (short) -1);
        int int40 = mutablePeriod36.getSeconds();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology44);
        mutablePeriod45.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod45.add(0L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        int int58 = dateMidnight57.getYearOfEra();
        org.joda.time.Chronology chronology59 = dateMidnight57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology59);
        mutablePeriod45.add(0L, chronology59);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (-1), chronology59);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, chronology71);
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight62.toMutableDateTime(chronology71);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime74.add((org.joda.time.ReadableDuration) duration77);
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Duration duration81 = org.joda.time.Duration.standardDays((long) '#');
        long long82 = duration81.getMillis();
        boolean boolean83 = duration77.isEqual((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Instant instant84 = instant29.minus((org.joda.time.ReadableDuration) duration81);
        org.joda.time.DateTime dateTime85 = localDate26.toDateTime((org.joda.time.ReadableInstant) instant84);
        org.joda.time.DateTime dateTime86 = localDate26.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime32", (instant29.compareTo(mutableDateTime32) == 0) == instant29.equals(mutableDateTime32));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.yearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = property22.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime25 = property22.getLocalDateTime();
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.DurationField durationField28 = chronology26.days();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight9.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime30", (dateMidnight3.compareTo(mutableDateTime30) == 0) == dateMidnight3.equals(mutableDateTime30));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getSecondOfMinute();
        int int12 = property7.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateMidnight dateMidnight13 = property7.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay14 = dateMidnight13.toYearMonthDay();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight13, readableInstant15);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology20);
        mutablePeriod21.setPeriod((long) (short) 10, (long) (short) -1);
        int int26 = mutablePeriod21.getValue(0);
        mutablePeriod21.addMinutes(0);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration34 = duration30.withDurationAdded((org.joda.time.ReadableDuration) duration32, 12);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(10L);
        boolean boolean37 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration36);
        mutablePeriod21.add((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration40 = duration32.plus((-1L));
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardDays((long) '#');
        long long43 = duration42.getMillis();
        boolean boolean44 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Interval interval45 = interval16.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology48 = instant47.getChronology();
        org.joda.time.Instant instant50 = instant47.minus(31556952000L);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        long long57 = dateMidnight54.getMillis();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.days();
        org.joda.time.Period period59 = duration52.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight54, periodType58);
        java.util.Date date60 = dateMidnight54.toDate();
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours(10L);
        long long63 = duration62.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight64.withMillis((long) 24);
        long long67 = dateMidnight66.getMillis();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration62, (org.joda.time.ReadableInstant) dateMidnight66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight54.minus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Instant instant70 = instant50.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.MutableDateTime mutableDateTime71 = instant50.toMutableDateTime();
        org.joda.time.Interval interval72 = interval16.withStart((org.joda.time.ReadableInstant) instant50);
        org.joda.time.DateTime dateTime73 = instant50.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime74 = instant50.toMutableDateTimeISO();
        mutableDateTime74.setDate(1227565497600050L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant50 and mutableDateTime71", (instant50.compareTo(mutableDateTime71) == 0) == instant50.equals(mutableDateTime71));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        java.lang.String str8 = chronology7.toString();
        org.joda.time.DurationField durationField9 = chronology7.hours();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.util.Locale locale12 = locale10.stripExtensions();
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 1, chronology7, locale12, (java.lang.Integer) 35, (int) ' ');
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((-1504224000000L), chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 1969, 35);
        org.joda.time.DateTime dateTime6 = instant1.toDateTime();
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration13 = duration9.withDurationAdded((org.joda.time.ReadableDuration) duration11, 12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        boolean boolean20 = duration13.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfSecond(10);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours(10L);
        long long36 = duration35.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration35, (int) (short) 10);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableDuration) duration35, periodType39);
        int int41 = duration17.compareTo((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        int int44 = dateMidnight43.getMillisOfSecond();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', periodType46, chronology47);
        org.joda.time.Period period50 = period48.withDays((int) ' ');
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight43, (org.joda.time.ReadablePeriod) period50);
        java.lang.String str52 = period50.toString();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.weekyear();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        org.joda.time.DateMidnight dateMidnight61 = property59.roundCeilingCopy();
        org.joda.time.Duration duration62 = period50.toDurationTo((org.joda.time.ReadableInstant) dateMidnight61);
        org.joda.time.Duration duration64 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration62, (int) '#');
        org.joda.time.Instant instant66 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration62, 599);
        org.joda.time.DateTime dateTime67 = instant66.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime6", (instant1.compareTo(dateTime6) == 0) == instant1.equals(dateTime6));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-01T00:50:00.009-00:00:00.001");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1642454701L), 1439);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration11 = duration7.withDurationAdded((org.joda.time.ReadableDuration) duration9, 12);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = duration13.withDurationAdded((org.joda.time.ReadableDuration) duration15, 12);
        boolean boolean18 = duration11.isEqual((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        long long25 = dateMidnight22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfSecond(10);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours(10L);
        long long34 = duration33.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.withDurationAdded((org.joda.time.ReadableDuration) duration33, (int) (short) 10);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration33, periodType37);
        int int39 = duration15.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        int int42 = dateMidnight41.getMillisOfSecond();
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', periodType44, chronology45);
        org.joda.time.Period period48 = period46.withDays((int) ' ');
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight41, (org.joda.time.ReadablePeriod) period48);
        java.lang.String str50 = period48.toString();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateMidnight.Property property57 = dateMidnight56.weekyear();
        org.joda.time.DateTimeField dateTimeField58 = property57.getField();
        org.joda.time.DateMidnight dateMidnight59 = property57.roundCeilingCopy();
        org.joda.time.Duration duration60 = period48.toDurationTo((org.joda.time.ReadableInstant) dateMidnight59);
        org.joda.time.Duration duration62 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration60, (int) '#');
        org.joda.time.Instant instant63 = instant5.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant65 = instant5.plus((-5443200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DurationField durationField29 = chronology21.weeks();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(4);
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds((int) (short) 0);
        int int21 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime23 = dateTime15.minusDays(26737628);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale7.getDisplayCountry();
        boolean boolean10 = locale7.hasExtensions();
        java.lang.String str11 = dateTimeField5.getAsText(838616784008820000L, locale7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet0.clear();
        java.util.Iterator<java.lang.String> strItor2 = strSet0.iterator();
        java.lang.Object[] objArray3 = strSet0.toArray();
        java.lang.Object[] objArray4 = strSet0.toArray();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 10, chronology13);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(7);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = dateTime19.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property22 = dateTime19.millisOfSecond();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        long long30 = chronology26.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.weekyear();
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology26);
        org.joda.time.DateTime dateTime33 = dateTime19.toDateTime(chronology26);
        int int34 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology35 = dateTime19.getChronology();
        boolean boolean36 = strSet0.equals((java.lang.Object) chronology35);
        java.lang.String[] strArray46 = new java.lang.String[] { "gregory", "1969-12-31T17:00:00.015-00:00:00.001", "", "java.io.IOException", "Property[dayOfWeek]", "zh-CN", "hours", "Thu Jan 01 15:00:00 UTC 1970", "English" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        boolean boolean52 = strSet47.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50);
        boolean boolean53 = strSet47.isEmpty();
        int int54 = strSet47.size();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "Days", "PeriodType[Standard]", "ja", "-00:00:00.001", "Japan", "24", "Dec 31, 1898 12:00:00 AM", "1970", "24", "Sat Dec 31 00:00:00 UTC 1898", "Days" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale73, locale74 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale locale78 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.util.Locale>) localeList76);
        boolean boolean79 = strSet68.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap80 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList81 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, strMap80);
        boolean boolean82 = strSet47.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        boolean boolean83 = strSet0.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime33", (dateTime17.compareTo(dateTime33) == 0) == dateTime17.equals(dateTime33));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        java.util.Date date14 = dateMidnight8.toDate();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) 24);
        long long21 = dateMidnight20.getMillis();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight8.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Instant instant24 = instant4.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant29 = instant27.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime30 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology33);
        mutablePeriod34.setPeriod((long) (short) 10, (long) (short) -1);
        int int38 = mutablePeriod34.getSeconds();
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
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        org.joda.time.Duration duration75 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime72.add((org.joda.time.ReadableDuration) duration75);
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration75);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardDays((long) '#');
        long long80 = duration79.getMillis();
        boolean boolean81 = duration75.isEqual((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant82 = instant27.minus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Instant instant84 = instant24.withDurationAdded((org.joda.time.ReadableDuration) duration79, 999);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        java.lang.String str86 = dateTimeFieldType85.getName();
        boolean boolean87 = instant84.isSupported(dateTimeFieldType85);
        org.joda.time.Instant instant89 = instant84.withMillis((long) 28);
        org.joda.time.MutableDateTime mutableDateTime90 = instant84.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime30", (instant1.compareTo(mutableDateTime30) == 0) == instant1.equals(mutableDateTime30));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.DateMidnight dateMidnight9 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight11 = property7.addWrapFieldToCopy((int) 'u');
        org.joda.time.DateMidnight dateMidnight13 = property7.addToCopy(0);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str16 = localDate15.toString();
        int int17 = localDate15.getYearOfEra();
        org.joda.time.Chronology chronology18 = localDate15.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight13.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime21", (dateMidnight3.compareTo(mutableDateTime21) == 0) == dateMidnight3.equals(mutableDateTime21));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond(10);
        java.lang.String str26 = localDateTime22.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone28);
        java.lang.String str30 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime31 = localDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime12.toDateTime(dateTimeZone28);
        int int33 = dateTime12.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime32", (dateTime12.compareTo(dateTime32) == 0) == dateTime12.equals(dateTime32));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.days();
        long long7 = durationField4.getValueAsLong((long) 1, 1645660800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        int int6 = dateMidnight3.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight3);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.lang.String str12 = dateTimeZone10.getID();
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
        mutableDateTime46.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.millisOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.era();
        boolean boolean51 = dateTimeZone10.equals((java.lang.Object) mutableDateTime46);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay((long) 10, chronology55);
        org.joda.time.DateTimeField[] dateTimeFieldArray57 = timeOfDay56.getFields();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.TimeOfDay timeOfDay60 = new org.joda.time.TimeOfDay((long) 10, chronology59);
        org.joda.time.DateTimeField[] dateTimeFieldArray61 = timeOfDay60.getFields();
        org.joda.time.Period period62 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay56, (org.joda.time.ReadablePartial) timeOfDay60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay((long) 10, chronology64);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = timeOfDay65.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay68 = timeOfDay65.plusSeconds((int) '4');
        int int69 = timeOfDay56.compareTo((org.joda.time.ReadablePartial) timeOfDay65);
        org.joda.time.TimeOfDay timeOfDay71 = timeOfDay56.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime72 = timeOfDay56.toLocalTime();
        org.joda.time.LocalTime localTime74 = localTime72.withMillisOfDay(840);
        org.joda.time.DateTime dateTime75 = localTime72.toDateTimeToday();
        org.joda.time.DateTime dateTime77 = dateTime75.plusMonths(999);
        org.joda.time.DateTime.Property property78 = dateTime77.hourOfDay();
        int int79 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime77);
        mutableDateTime7.setZone(dateTimeZone10);
        long long84 = dateTimeZone10.convertLocalToUTC(1609459200180L, true, (long) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime7", (dateMidnight3.compareTo(mutableDateTime7) == 0) == dateMidnight3.equals(mutableDateTime7));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        int int8 = dateMidnight5.getSecondOfMinute();
        java.util.Locale locale13 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "07:22:45.446", "07:22:45.446");
        java.lang.String str14 = dateMidnight5.toString("07:22:45.446", locale13);
        int int15 = dateMidnight5.getSecondOfMinute();
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
        org.joda.time.DateTime dateTime35 = dateTime29.plus((long) 6);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology43);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime46.withChronology(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime35.toDateTime(chronology54);
        org.joda.time.DurationField durationField59 = chronology54.years();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(0L, chronology54);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime.Property property62 = dateTime60.secondOfMinute();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int67 = dateTimeZone65.getOffsetFromLocal((long) 23);
        int int69 = dateTimeZone65.getOffset((long) 'a');
        java.lang.String str70 = dateTimeZone65.toString();
        org.joda.time.DateTime dateTime71 = dateTime1.toDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime71", (dateTime1.compareTo(dateTime71) == 0) == dateTime1.equals(dateTime71));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        boolean boolean5 = instant3.isBefore((long) (short) 10);
        long long6 = instant3.getMillis();
        org.joda.time.Instant instant8 = instant3.minus((long) (-292275054));
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.joda.time.Instant instant10 = instant8.toInstant();
        org.joda.time.Instant instant12 = instant8.plus(26630848L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant6 = instant1.plus((long) 47);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        int int9 = dateMidnight8.getMillisOfSecond();
        org.joda.time.Interval interval10 = dateMidnight8.toInterval();
        org.joda.time.Instant instant11 = dateMidnight8.toInstant();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.DateTime dateTime13 = instant1.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant11", (dateMidnight8.compareTo(instant11) == 0) == dateMidnight8.equals(instant11));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Interval interval7 = interval5.withPeriodBeforeEnd(readablePeriod6);
        org.joda.time.MutableInterval mutableInterval8 = interval5.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Interval interval21 = interval5.gap((org.joda.time.ReadableInterval) interval20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and localDate14", (localDate4.compareTo(localDate14) == 0) == localDate4.equals(localDate14));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod13.getSeconds();
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
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime51.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) '#');
        long long59 = duration58.getMillis();
        boolean boolean60 = duration54.isEqual((org.joda.time.ReadableDuration) duration58);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType62 = periodType61.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration54, periodType62);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology68);
        mutablePeriod69.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod69.add(0L);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight(chronology78);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.minusDays((int) (short) -1);
        int int82 = dateMidnight81.getYearOfEra();
        org.joda.time.Chronology chronology83 = dateMidnight81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology83);
        mutablePeriod69.add(0L, chronology83);
        boolean boolean86 = dateTimeFieldType65.isSupported(chronology83);
        org.joda.time.DateTimeField dateTimeField87 = chronology83.millisOfSecond();
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((long) (short) 1, chronology83);
        org.joda.time.Period period89 = duration54.toPeriod(chronology83);
        org.joda.time.DurationField durationField90 = chronology83.weeks();
        org.joda.time.DurationField durationField91 = chronology83.eras();
        org.joda.time.DateTimeField dateTimeField92 = chronology83.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField90 and durationField91", Math.signum(durationField90.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField90)));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        long long11 = dateMidnight8.getMillis();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.Period period13 = duration6.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.Period period14 = duration6.toPeriod();
        long long15 = duration6.getStandardSeconds();
        org.joda.time.Instant instant17 = instant4.withDurationAdded((org.joda.time.ReadableDuration) duration6, 151);
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 10, chronology13);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(7);
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        java.util.GregorianCalendar gregorianCalendar21 = dateTime19.toGregorianCalendar();
        boolean boolean22 = interval1.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval24 = yearMonthDay23.toInterval();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval26 = yearMonthDay25.toInterval();
        org.joda.time.Interval interval27 = interval24.gap((org.joda.time.ReadableInterval) interval26);
        boolean boolean29 = interval24.isBefore(100L);
        org.joda.time.Interval interval31 = interval24.withStartMillis(0L);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval33 = yearMonthDay32.toInterval();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval35 = yearMonthDay34.toInterval();
        org.joda.time.Interval interval36 = interval33.gap((org.joda.time.ReadableInterval) interval35);
        boolean boolean38 = interval33.isBefore(100L);
        java.lang.String str39 = interval33.toString();
        boolean boolean40 = interval31.abuts((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Interval interval41 = interval1.gap((org.joda.time.ReadableInterval) interval31);
        long long42 = interval1.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay44.minusDays(32770);
        boolean boolean47 = interval1.equals((java.lang.Object) yearMonthDay46);
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale48);
        calendar49.setFirstDayOfWeek(24);
        calendar49.clear(12);
        java.util.TimeZone timeZone54 = java.util.TimeZone.getDefault();
        calendar49.setTimeZone(timeZone54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.minusDays((int) (short) -1);
        int int60 = dateMidnight59.getYearOfEra();
        org.joda.time.Chronology chronology61 = dateMidnight59.getChronology();
        long long62 = dateMidnight59.getMillis();
        org.joda.time.DateMidnight.Property property63 = dateMidnight59.weekyear();
        org.joda.time.DateMidnight dateMidnight64 = property63.withMaximumValue();
        boolean boolean65 = calendar49.before((java.lang.Object) dateMidnight64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight64.withCenturyOfEra(2000);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology70);
        mutablePeriod71.setPeriod((long) (short) 10, (long) (short) -1);
        int int76 = mutablePeriod71.getValue(0);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight(chronology77);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.minusDays((int) (short) -1);
        org.joda.time.Duration duration81 = mutablePeriod71.toDurationTo((org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight(chronology84);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight85.minusDays((int) (short) -1);
        int int88 = dateMidnight87.getYearOfEra();
        org.joda.time.Chronology chronology89 = dateMidnight87.getChronology();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology89);
        org.joda.time.DateTimeField dateTimeField91 = chronology89.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField92 = chronology89.halfdayOfDay();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight78, chronology89);
        org.joda.time.Chronology chronology94 = chronology89.withUTC();
        org.joda.time.DurationField durationField95 = chronology94.millis();
        org.joda.time.MutableDateTime mutableDateTime96 = dateMidnight64.toMutableDateTime(chronology94);
        org.joda.time.YearMonthDay yearMonthDay97 = yearMonthDay46.withChronologyRetainFields(chronology94);
        org.joda.time.DateMidnight dateMidnight98 = yearMonthDay46.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight64 and mutableDateTime96", (dateMidnight64.compareTo(mutableDateTime96) == 0) == dateMidnight64.equals(mutableDateTime96));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 10, chronology10);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(7);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 0);
        int int17 = dateTime16.getMonthOfYear();
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
        mutableDateTime51.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime51.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime51.toMutableDateTime(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = yearMonthDay57.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.Duration duration61 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime51, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType65 = periodType64.withWeeksRemoved();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 1970, (long) 3, periodType64);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableDuration) duration61, periodType64);
        org.joda.time.DateTime dateTime68 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime70 = dateTime68.plusWeeks(4);
        int int71 = dateTime70.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime73 = dateTime70.toDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        boolean boolean76 = dateTimeZone74.isStandardOffset((long) '#');
        java.lang.String str77 = dateTimeZone74.getID();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone74);
        long long80 = dateTimeZone72.getMillisKeepLocal(dateTimeZone74, (long) 339);
        org.joda.time.LocalDate localDate81 = org.joda.time.LocalDate.now(dateTimeZone74);
        org.joda.time.Interval interval82 = new org.joda.time.Interval((long) 26574907, 347155200000L, dateTimeZone74);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and mutableDateTime78", (dateTime60.compareTo(mutableDateTime78) == 0) == dateTime60.equals(mutableDateTime78));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.Period period9 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight4, periodType8);
        java.util.Date date10 = dateMidnight4.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
        java.lang.String str14 = dateTimeZone12.getID();
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight4.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.weekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.millisOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.dayOfWeek();
        mutableDateTime15.setWeekyear(2022);
        java.lang.String str21 = mutableDateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = mutableDateTime15.toDateTime(dateTimeZone22);
        int int26 = dateTimeZone22.getOffset(2304207674205000L);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and mutableDateTime15", (dateMidnight4.compareTo(mutableDateTime15) == 0) == dateMidnight4.equals(mutableDateTime15));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        int int16 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime14.toMutableDateTimeISO();
        mutableDateTime17.setWeekyear(550);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.Period period4 = new org.joda.time.Period(1645574400000L, periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(periodType3);
        int int6 = periodType3.size();
        org.joda.time.Period period7 = new org.joda.time.Period((-11000L), (long) 62, periodType3);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology15);
        mutablePeriod16.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod16.add(0L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        mutablePeriod16.add(0L, chronology30);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 0, (long) 6, chronology30);
        int int34 = period33.getSeconds();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(10L);
        long long37 = duration36.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.withMillis((long) 24);
        long long41 = dateMidnight40.getMillis();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) dateMidnight40);
        boolean boolean43 = period33.equals((java.lang.Object) dateMidnight40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology51.getZone();
        int int56 = dateTimeZone54.getOffset((long) 'u');
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight40.withZoneRetainFields(dateTimeZone54);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone54.getShortName((long) 840, locale59);
        boolean boolean61 = dateTimeZone54.isFixed();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime10.toMutableDateTime(dateTimeZone54);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(dateTimeZone54);
        boolean boolean64 = periodType3.equals((java.lang.Object) localTime63);
        org.joda.time.PeriodType periodType65 = periodType3.withDaysRemoved();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime62", (dateTime10.compareTo(mutableDateTime62) == 0) == dateTime10.equals(mutableDateTime62));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        boolean boolean16 = interval13.isAfter(6213563913600000L);
        org.joda.time.MutableInterval mutableInterval17 = interval13.toMutableInterval();
        org.joda.time.Instant instant19 = org.joda.time.Instant.parse("1970-01-01T00:50:00.009-00:00:00.001");
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        boolean boolean21 = interval13.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str24 = localDate23.toString();
        int int25 = localDate23.getYearOfEra();
        org.joda.time.LocalDate.Property property26 = localDate23.era();
        org.joda.time.LocalDate.Property property27 = localDate23.dayOfYear();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        boolean boolean29 = locale28.hasExtensions();
        java.lang.String str30 = locale28.getDisplayVariant();
        int int31 = property27.getMaximumShortTextLength(locale28);
        boolean boolean32 = interval13.equals((java.lang.Object) locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime20", (instant19.compareTo(dateTime20) == 0) == instant19.equals(dateTime20));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter7.getZone();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.Chronology chronology12 = dateTime10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withChronology(chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear(1182);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.millisOfDay();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter16.withChronology(chronology24);
        org.joda.time.DurationField durationField29 = chronology24.eras();
        org.joda.time.DateTimeField dateTimeField30 = chronology24.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField29", Math.signum(durationField13.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField13)));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.minus((long) 50);
        org.joda.time.Instant instant5 = instant1.minus(36000L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology14, locale18, (java.lang.Integer) 9, (int) (short) 0);
        long long23 = dateTimeParserBucket21.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (-1), chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight49.toMutableDateTime(chronology58);
        mutableDateTime61.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        boolean boolean66 = dateTimeZone25.equals((java.lang.Object) mutableDateTime61);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        dateTimeParserBucket21.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) instant1, dateTimeZone25);
        int int71 = dateTimeZone25.getStandardOffset((long) 34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime69", (instant1.compareTo(mutableDateTime69) == 0) == instant1.equals(mutableDateTime69));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.Interval interval7 = interval5.withPeriodBeforeEnd(readablePeriod6);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology18);
        org.joda.time.DateTime dateTime22 = dateTime20.minusHours(7);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) (byte) 0);
        int int25 = dateTime24.getMonthOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology29);
        mutablePeriod30.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod30.add(0L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        mutablePeriod30.add(0L, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (-1), chronology44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) 10, chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight47.toMutableDateTime(chronology56);
        mutableDateTime59.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime59.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime59.toMutableDateTime(dateTimeZone63);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = yearMonthDay65.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay65.toDateTimeAtCurrentTime(dateTimeZone67);
        org.joda.time.Duration duration69 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime59, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType73 = periodType72.withWeeksRemoved();
        org.joda.time.Period period74 = new org.joda.time.Period((long) 1970, (long) 3, periodType72);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration69, periodType72);
        org.joda.time.DateTime dateTime76 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime78 = dateTime76.plusWeeks(4);
        int int79 = dateTime78.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime81 = dateTime78.toDateTime(dateTimeZone80);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.UTC;
        boolean boolean84 = dateTimeZone82.isStandardOffset((long) '#');
        java.lang.String str85 = dateTimeZone82.getID();
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(dateTimeZone82);
        long long88 = dateTimeZone80.getMillisKeepLocal(dateTimeZone82, (long) 339);
        org.joda.time.LocalDate localDate89 = org.joda.time.LocalDate.now(dateTimeZone82);
        org.joda.time.Interval interval90 = new org.joda.time.Interval((long) 26574907, 347155200000L, dateTimeZone82);
        boolean boolean91 = interval7.isAfter((org.joda.time.ReadableInterval) interval90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and yearMonthDay65", (localDate4.compareTo(yearMonthDay65) == 0) == localDate4.equals(yearMonthDay65));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus((long) 572);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        int int11 = mutablePeriod7.getSeconds();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology15);
        mutablePeriod16.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod16.add(0L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        mutablePeriod16.add(0L, chronology30);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (-1), chronology30);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        int int41 = dateMidnight40.getYearOfEra();
        org.joda.time.Chronology chronology42 = dateMidnight40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (short) 10, chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight33.toMutableDateTime(chronology42);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime45.add((org.joda.time.ReadableDuration) duration48);
        mutablePeriod7.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardDays((long) '#');
        long long53 = duration52.getMillis();
        boolean boolean54 = duration48.isEqual((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Instant instant56 = instant2.withDurationAdded((org.joda.time.ReadableDuration) duration48, 652);
        org.joda.time.Duration duration59 = duration48.withDurationAdded(339L, 151);
        org.joda.time.Seconds seconds60 = duration59.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Instant instant3 = dateMidnight1.toInstant();
        org.joda.time.DateTime dateTime4 = dateMidnight1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.minusSeconds(26623257);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant3", (dateMidnight1.compareTo(instant3) == 0) == dateMidnight1.equals(instant3));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) calendar1);
        java.util.TimeZone timeZone5 = calendar1.getTimeZone();
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
        calendar1.setLenient(true);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        int int16 = dateMidnight15.getYearOfEra();
        org.joda.time.Chronology chronology17 = dateMidnight15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology17, locale21, (java.lang.Integer) 9, (int) (short) 0);
        java.lang.Integer int25 = dateTimeParserBucket24.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        dateTimeParserBucket24.saveField(dateTimeFieldType26, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket24.getZone();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate30.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMillisOfDay(158);
        boolean boolean34 = calendar1.equals((java.lang.Object) 158);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate4 and localDate30", (localDate4.compareTo(localDate30) == 0) == localDate4.equals(localDate30));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.DurationField durationField27 = chronology21.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.weekyear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.DurationField durationField41 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfHour();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        int int48 = dateMidnight46.getWeekyear();
        org.joda.time.YearMonthDay yearMonthDay49 = dateMidnight46.toYearMonthDay();
        org.joda.time.tz.NameProvider nameProvider51 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider51);
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.lang.String str56 = nameProvider51.getName(locale53, "2022-02-22T00:00:00.000Z/2022-02-22T00:00:00.000Z", "centuryOfEra");
        java.lang.String str57 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) yearMonthDay49, 53, locale53);
        java.lang.String str59 = locale53.getExtension('u');
        java.util.Locale locale60 = java.util.Locale.ITALY;
        java.lang.String str61 = locale53.getDisplayLanguage(locale60);
        java.util.Locale locale64 = new java.util.Locale("zh-CN", "00:00:00.001");
        java.lang.String str65 = locale60.getDisplayName(locale64);
        java.lang.String str66 = dateTimeField28.getAsText(121, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField41", Math.signum(durationField27.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField27)));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', periodType4, chronology5);
        org.joda.time.Period period8 = period6.withDays((int) ' ');
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadablePeriod) period8);
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime dateTime23 = dateTime21.minusSeconds(4);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime28 = dateTime23.minusSeconds((int) (short) 0);
        boolean boolean29 = interval9.isAfter((org.joda.time.ReadableInstant) dateTime23);
        long long30 = interval9.getStartMillis();
        org.joda.time.DateTime dateTime31 = interval9.getStart();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(dateTimeZone33);
        java.lang.String str35 = dateTimeZone33.getID();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology39);
        mutablePeriod40.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod40.add(0L);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        mutablePeriod40.add(0L, chronology54);
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((long) (-1), chronology54);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 10, chronology66);
        org.joda.time.MutableDateTime mutableDateTime69 = dateMidnight57.toMutableDateTime(chronology66);
        mutableDateTime69.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime69.millisOfDay();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.era();
        boolean boolean74 = dateTimeZone33.equals((java.lang.Object) mutableDateTime69);
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime76 = dateTime31.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.DateMidnight dateMidnight82 = new org.joda.time.DateMidnight(chronology81);
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight82.minusDays((int) (short) -1);
        int int85 = dateMidnight84.getYearOfEra();
        org.joda.time.Chronology chronology86 = dateMidnight84.getChronology();
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology86);
        org.joda.time.DateTimeField dateTimeField88 = chronology86.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone89 = chronology86.getZone();
        java.util.Locale locale90 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket((long) 2022, chronology86, locale90, (java.lang.Integer) 9, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone94 = dateTimeParserBucket93.getZone();
        org.joda.time.LocalDateTime localDateTime95 = new org.joda.time.LocalDateTime(838800010L, dateTimeZone94);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime95.plusWeeks(24);
        org.joda.time.LocalDateTime.Property property98 = localDateTime95.weekOfWeekyear();
        boolean boolean99 = dateTimeZone33.isLocalDateTimeGap(localDateTime95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime76", (dateMidnight1.compareTo(dateTime76) == 0) == dateMidnight1.equals(dateTime76));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        int int17 = mutablePeriod13.getSeconds();
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
        org.joda.time.Duration duration54 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime51.add((org.joda.time.ReadableDuration) duration54);
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardDays((long) '#');
        long long59 = duration58.getMillis();
        boolean boolean60 = duration54.isEqual((org.joda.time.ReadableDuration) duration58);
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType62 = periodType61.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration54, periodType62);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology68);
        mutablePeriod69.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod69.add(0L);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight(chronology78);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.minusDays((int) (short) -1);
        int int82 = dateMidnight81.getYearOfEra();
        org.joda.time.Chronology chronology83 = dateMidnight81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology83);
        mutablePeriod69.add(0L, chronology83);
        boolean boolean86 = dateTimeFieldType65.isSupported(chronology83);
        org.joda.time.DateTimeField dateTimeField87 = chronology83.millisOfSecond();
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((long) (short) 1, chronology83);
        org.joda.time.Period period89 = duration54.toPeriod(chronology83);
        org.joda.time.DurationField durationField90 = chronology83.weeks();
        org.joda.time.DurationField durationField91 = chronology83.eras();
        org.joda.time.DateTime dateTime92 = org.joda.time.DateTime.now(chronology83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField90 and durationField91", Math.signum(durationField90.compareTo(durationField91)) == -Math.signum(durationField91.compareTo(durationField90)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.plus((long) 100);
        org.joda.time.Instant instant5 = instant1.plus((long) 191);
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        int int20 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate22 = localDate19.withYear(13);
        org.joda.time.LocalDate localDate24 = localDate19.withYearOfCentury(5);
        int int25 = localDate19.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int29 = dateTimeZone27.getOffsetFromLocal((long) 23);
        int int31 = dateTimeZone27.getOffset((long) 'a');
        long long33 = dateTimeZone27.nextTransition((long) '#');
        org.joda.time.DateMidnight dateMidnight34 = localDate19.toDateMidnight(dateTimeZone27);
        java.lang.String str35 = dateTimeZone27.toString();
        mutableDateTime6.setZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withMillisOfSecond(10);
        java.lang.String str49 = localDateTime45.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone51);
        java.lang.String str53 = dateTimeZone51.getID();
        org.joda.time.DateTime dateTime54 = localDateTime45.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime55 = dateTime41.toDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime57 = dateTime41.withHourOfDay(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime55", (dateTime41.compareTo(dateTime55) == 0) == dateTime41.equals(dateTime55));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime16 = property14.addCopy(946684800000L);
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        long long24 = dateMidnight21.getMillis();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.Period period26 = duration19.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight21, periodType25);
        java.util.Date date27 = dateMidnight21.toDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
        java.lang.String str31 = dateTimeZone29.getID();
        org.joda.time.MutableDateTime mutableDateTime32 = dateMidnight21.toMutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.weekyear();
        int int34 = mutableDateTime32.getSecondOfMinute();
        int int35 = mutableDateTime32.getRoundingMode();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str37 = dateTimeFieldType36.toString();
        boolean boolean38 = mutableDateTime32.isSupported(dateTimeFieldType36);
        boolean boolean39 = localTime17.isSupported(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime32", (dateMidnight3.compareTo(mutableDateTime32) == 0) == dateMidnight3.equals(mutableDateTime32));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusDays((int) (short) -1);
        int int5 = dateMidnight4.getYearOfEra();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfDay();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(32770000L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getMillisOfSecond();
        org.joda.time.Instant instant12 = dateMidnight10.toInstant();
        boolean boolean14 = instant12.isBefore((long) (short) 10);
        long long15 = instant12.getMillis();
        org.joda.time.Instant instant17 = instant12.minus((long) (-292275054));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone19);
        java.lang.String str21 = dateTimeZone19.getID();
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
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime55.era();
        boolean boolean60 = dateTimeZone19.equals((java.lang.Object) mutableDateTime55);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime62 = instant17.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime63 = dateTime8.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime62", (instant17.compareTo(dateTime62) == 0) == instant17.equals(dateTime62));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
        java.lang.String str13 = dateTimeZone11.getID();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight3.toMutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.weekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime14", (dateMidnight3.compareTo(mutableDateTime14) == 0) == dateMidnight3.equals(mutableDateTime14));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        org.joda.time.Period period25 = new org.joda.time.Period((long) 0, (long) 6, chronology22);
        int int26 = period25.getSeconds();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours(10L);
        long long29 = duration28.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.withMillis((long) 24);
        long long33 = dateMidnight32.getMillis();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = period25.equals((java.lang.Object) dateMidnight32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        int int48 = dateTimeZone46.getOffset((long) 'u');
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight32.withZoneRetainFields(dateTimeZone46);
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone46.getShortName((long) 840, locale51);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) (byte) 10, 10L, dateTimeZone46);
        java.lang.String str55 = dateTimeZone46.getName((long) (short) 100);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((long) 1182, dateTimeZone46);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 10, chronology66);
        org.joda.time.DateTime dateTime70 = dateTime68.minusHours(7);
        org.joda.time.DateTime dateTime72 = dateTime70.plusYears((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property74 = dateTime70.property(dateTimeFieldType73);
        org.joda.time.DateTime dateTime76 = property74.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTime dateTime77 = dateTime76.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property78 = dateTime76.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight(dateTimeZone80);
        java.lang.String str82 = dateTimeZone80.getID();
        org.joda.time.DateTime dateTime83 = dateTime76.withZoneRetainFields(dateTimeZone80);
        java.lang.String str85 = dateTimeZone80.getName((long) 10);
        org.joda.time.DateTime dateTime86 = localTime57.toDateTimeToday(dateTimeZone80);
        org.joda.time.DateTime dateTime87 = org.joda.time.DateTime.now(dateTimeZone80);
        org.joda.time.DateMidnight dateMidnight88 = org.joda.time.DateMidnight.now(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and dateTime87", (dateTime56.compareTo(dateTime87) == 0) == dateTime56.equals(dateTime87));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property16 = dateTime13.centuryOfEra();
        int int17 = dateTime13.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime13.plus((long) 6);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime30.withChronology(chronology38);
        org.joda.time.DateTime dateTime42 = dateTime19.toDateTime(chronology38);
        org.joda.time.DurationField durationField43 = chronology38.years();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(0L, chronology38);
        org.joda.time.DateMidnight dateMidnight45 = dateTime44.toDateMidnight();
        java.lang.Object obj46 = null;
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.millis();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology51);
        mutablePeriod52.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod52.add(0L);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutablePeriod52.add(0L, chronology66);
        boolean boolean69 = dateTimeFieldType48.isSupported(chronology66);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long73 = dateTimeZone71.nextTransition((long) 22);
        org.joda.time.Chronology chronology74 = chronology66.withZone(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(dateTimeZone75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusMillis(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean80 = localDateTime78.isSupported(dateTimeFieldType79);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) (byte) 100);
        mutablePeriod82.setMillis(10);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime78.minus((org.joda.time.ReadablePeriod) mutablePeriod82);
        org.joda.time.MutablePeriod mutablePeriod86 = mutablePeriod82.copy();
        int[] intArray89 = chronology74.get((org.joda.time.ReadablePeriod) mutablePeriod86, 457104L, 1645514595578L);
        org.joda.time.Period period90 = new org.joda.time.Period(obj46, periodType47, chronology74);
        org.joda.time.DateTime dateTime91 = dateTime44.toDateTime(chronology74);
        org.joda.time.YearMonthDay yearMonthDay92 = new org.joda.time.YearMonthDay(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime91", (dateTime44.compareTo(dateTime91) == 0) == dateTime44.equals(dateTime91));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 0, 32769, (int) (byte) 10, (int) (short) 1);
        int int5 = mutablePeriod4.getMinutes();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology8);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.copy();
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval12 = yearMonthDay11.toInterval();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.Interval interval15 = interval12.gap((org.joda.time.ReadableInterval) interval14);
        boolean boolean17 = interval12.isBefore(100L);
        java.lang.String str18 = interval12.toString();
        boolean boolean19 = interval12.isBeforeNow();
        long long20 = interval12.getEndMillis();
        org.joda.time.Duration duration21 = interval12.toDuration();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology30.millis();
        org.joda.time.Period period36 = duration21.toPeriod(chronology30);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.clockhourOfDay();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology44);
        int int48 = dateTime47.getWeekOfWeekyear();
        boolean boolean49 = duration21.equals((java.lang.Object) dateTime47);
        org.joda.time.Period period51 = org.joda.time.Period.months((int) (short) 10);
        int int52 = period51.size();
        org.joda.time.DateTime dateTime53 = dateTime47.minus((org.joda.time.ReadablePeriod) period51);
        mutablePeriod10.mergePeriod((org.joda.time.ReadablePeriod) period51);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(chronology59);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.minusDays((int) (short) -1);
        int int63 = dateMidnight62.getYearOfEra();
        org.joda.time.Chronology chronology64 = dateMidnight62.getChronology();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (short) 10, chronology64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate69 = org.joda.time.LocalDate.now(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime66.toMutableDateTime(dateTimeZone68);
        mutableDateTime71.addMinutes(50);
        java.lang.String str74 = mutableDateTime71.toString();
        org.joda.time.Chronology chronology75 = null;
        mutableDateTime71.setChronology(chronology75);
        org.joda.time.Duration duration78 = new org.joda.time.Duration(946684800001L);
        org.joda.time.Interval interval79 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime71, (org.joda.time.ReadableDuration) duration78);
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval81 = yearMonthDay80.toInterval();
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval83 = yearMonthDay82.toInterval();
        org.joda.time.Interval interval84 = interval81.gap((org.joda.time.ReadableInterval) interval83);
        org.joda.time.DateTime dateTime85 = interval81.getStart();
        boolean boolean86 = interval81.containsNow();
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.Interval interval88 = interval81.withPeriodBeforeEnd(readablePeriod87);
        boolean boolean90 = interval88.isAfter((long) 'x');
        org.joda.time.ReadableInterval readableInterval91 = null;
        boolean boolean92 = interval88.overlaps(readableInterval91);
        org.joda.time.Period period93 = interval88.toPeriod();
        boolean boolean94 = interval79.overlaps((org.joda.time.ReadableInterval) interval88);
        mutablePeriod4.add((org.joda.time.ReadableInterval) interval88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime70", (dateTime47.compareTo(dateTime70) == 0) == dateTime47.equals(dateTime70));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        long long7 = dateMidnight4.getMillis();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.Period period9 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight4, periodType8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight4.toMutableDateTimeISO();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology13);
        mutablePeriod14.setPeriod((long) (short) 10, (long) (short) -1);
        int int18 = mutablePeriod14.getSeconds();
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
        org.joda.time.Duration duration55 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime52.add((org.joda.time.ReadableDuration) duration55);
        mutablePeriod14.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardDays((long) '#');
        long long60 = duration59.getMillis();
        boolean boolean61 = duration55.isEqual((org.joda.time.ReadableDuration) duration59);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableDuration) duration55, periodType63);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology69);
        mutablePeriod70.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod70.add(0L);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(chronology79);
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight80.minusDays((int) (short) -1);
        int int83 = dateMidnight82.getYearOfEra();
        org.joda.time.Chronology chronology84 = dateMidnight82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology84);
        mutablePeriod70.add(0L, chronology84);
        boolean boolean87 = dateTimeFieldType66.isSupported(chronology84);
        org.joda.time.DateTimeField dateTimeField88 = chronology84.millisOfSecond();
        org.joda.time.LocalTime localTime89 = new org.joda.time.LocalTime((long) (short) 1, chronology84);
        org.joda.time.Period period90 = duration55.toPeriod(chronology84);
        org.joda.time.DurationField durationField91 = chronology84.weeks();
        org.joda.time.DurationField durationField92 = chronology84.eras();
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(26699790L, chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField91 and durationField92", Math.signum(durationField91.compareTo(durationField92)) == -Math.signum(durationField92.compareTo(durationField91)));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus((long) 572);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.minuteOfHour();
        boolean boolean5 = property4.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(35);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableDuration) duration32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        org.joda.time.Instant instant61 = mutableDateTime33.toInstant();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTimeField dateTimeField71 = chronology69.clockhourOfDay();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(chronology69);
        int int73 = dateTime72.getWeekOfWeekyear();
        boolean boolean74 = instant61.isEqual((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Instant instant75 = instant61.toInstant();
        org.joda.time.Instant instant77 = instant61.minus((long) 369);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant61", (mutableDateTime33.compareTo(instant61) == 0) == mutableDateTime33.equals(instant61));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 1969, 35);
        org.joda.time.DateTime dateTime6 = instant1.toDateTime();
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration13 = duration9.withDurationAdded((org.joda.time.ReadableDuration) duration11, 12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        boolean boolean20 = duration13.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfSecond(10);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours(10L);
        long long36 = duration35.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration35, (int) (short) 10);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableDuration) duration35, periodType39);
        int int41 = duration17.compareTo((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(chronology42);
        int int44 = dateMidnight43.getMillisOfSecond();
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', periodType46, chronology47);
        org.joda.time.Period period50 = period48.withDays((int) ' ');
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight43, (org.joda.time.ReadablePeriod) period50);
        java.lang.String str52 = period50.toString();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withZoneRetainFields(dateTimeZone57);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.weekyear();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        org.joda.time.DateMidnight dateMidnight61 = property59.roundCeilingCopy();
        org.joda.time.Duration duration62 = period50.toDurationTo((org.joda.time.ReadableInstant) dateMidnight61);
        org.joda.time.Duration duration64 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration62, (int) '#');
        org.joda.time.Instant instant66 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration62, 599);
        org.joda.time.Duration duration68 = duration62.minus((long) 20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime6", (instant1.compareTo(dateTime6) == 0) == instant1.equals(dateTime6));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusDays((int) (short) -1);
        int int8 = dateMidnight7.getYearOfEra();
        org.joda.time.Chronology chronology9 = dateMidnight7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 10, chronology9);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(7);
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime15.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime15.millisOfSecond();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        long long26 = chronology22.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology22.weekyear();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology22);
        org.joda.time.DateTime dateTime29 = dateTime15.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField30 = chronology22.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "1182", chronology22);
        org.joda.time.DurationField durationField32 = chronology22.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.String str6 = dateTime5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) 24);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(4);
        org.joda.time.LocalTime localTime16 = dateTime15.toLocalTime();
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfSecond();
        org.joda.time.LocalTime localTime19 = localTime16.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight2.withFields((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusMonths(652);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        int int29 = dateMidnight26.getSecondOfMinute();
        org.joda.time.Instant instant30 = dateMidnight26.toInstant();
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        boolean boolean32 = dateMidnight20.isEqual((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant30", (dateMidnight8.compareTo(instant30) == 0) == dateMidnight8.equals(instant30));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.joda.time.DateTimeField dateTimeField17 = localDate12.getField((int) (byte) 0);
        int int18 = localDate12.getYearOfCentury();
        org.joda.time.LocalDate.Property property19 = localDate12.yearOfEra();
        org.joda.time.LocalDate localDate20 = property19.roundCeilingCopy();
        org.joda.time.LocalDate localDate22 = localDate20.plusYears(9);
        org.joda.time.DateTime dateTime23 = localDate22.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate25 = localDate22.plusDays(6);
        org.joda.time.LocalDate.Property property26 = localDate22.monthOfYear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime32 = instant31.toDateTimeISO();
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.days();
        boolean boolean35 = dateTimeFieldType28.isSupported(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime32", (instant31.compareTo(dateTime32) == 0) == instant31.equals(dateTime32));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        org.joda.time.TimeOfDay timeOfDay20 = property18.addToCopy((int) (byte) 0);
        org.joda.time.TimeOfDay timeOfDay21 = property18.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay23 = property18.setCopy(24);
        int int24 = property18.getMinimumValueOverall();
        java.lang.String str25 = property18.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay26 = property18.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay28 = property18.addWrapFieldToCopy((int) (byte) 10);
        int int29 = timeOfDay28.getMinuteOfHour();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.Period period32 = new org.joda.time.Period(1645574400000L, periodType31);
        org.joda.time.Period period33 = period32.normalizedStandard();
        int int34 = period33.getSeconds();
        org.joda.time.Period period36 = period33.withMinutes((int) (byte) -1);
        org.joda.time.Period period38 = period36.withSeconds(3);
        org.joda.time.Period period40 = period38.plusMillis(345);
        org.joda.time.Period period42 = period38.plusMinutes(197057);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay28.plus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        int int46 = dateMidnight45.getMillisOfSecond();
        org.joda.time.Instant instant47 = dateMidnight45.toInstant();
        boolean boolean49 = instant47.isBefore((long) (short) 10);
        long long50 = instant47.getMillis();
        org.joda.time.Instant instant52 = instant47.minus((long) (-292275054));
        org.joda.time.DateTime dateTime53 = instant52.toDateTimeISO();
        boolean boolean54 = period38.equals((java.lang.Object) dateTime53);
        org.joda.time.DateTime.Property property55 = dateTime53.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight45 and instant47", (dateMidnight45.compareTo(instant47) == 0) == dateMidnight45.equals(instant47));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths(10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.DateTime dateTime49 = dateTime37.toDateTime(chronology46);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology46);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = new org.joda.time.Period(1645574400000L, periodType54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withPeriodAdded((org.joda.time.ReadablePeriod) period55, (int) (byte) 0);
        int[] intArray59 = chronology46.get((org.joda.time.ReadablePartial) localDateTime57, (long) 3);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(chronology46);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight22.withChronology(chronology46);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology46, locale62);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.weekyearOfCentury();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology64);
        org.joda.time.DateTimeField dateTimeField67 = chronology64.halfdayOfDay();
        long long69 = dateTimeField67.roundFloor(1645514967191L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and dateTime66", (dateTime60.compareTo(dateTime66) == 0) == dateTime60.equals(dateTime66));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusDays((int) (short) -1);
        int int5 = dateMidnight4.getYearOfEra();
        org.joda.time.Chronology chronology6 = dateMidnight4.getChronology();
        java.lang.String str7 = chronology6.toString();
        org.joda.time.DurationField durationField8 = chronology6.hours();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 1, chronology6, locale11, (java.lang.Integer) 35, (int) ' ');
        org.joda.time.DurationField durationField16 = chronology6.eras();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withMillisOfSecond(10);
        java.lang.String str33 = localDateTime29.toString("1970-01-01");
        int[] intArray35 = chronology24.get((org.joda.time.ReadablePartial) localDateTime29, (long) (-1));
        org.joda.time.DurationField durationField36 = chronology24.seconds();
        boolean boolean37 = durationField36.isSupported();
        long long40 = durationField36.getMillis((long) (-11), 14L);
        int int41 = durationField16.compareTo(durationField36);
        java.lang.String str42 = durationField36.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField16", Math.signum(durationField8.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField8)));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight3.minusYears(10);
        boolean boolean13 = dateMidnight3.isAfter(1987L);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours(10L);
        long long16 = duration15.getStandardSeconds();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        long long27 = dateMidnight24.getMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfSecond(10);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours(10L);
        long long36 = duration35.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withDurationAdded((org.joda.time.ReadableDuration) duration35, (int) (short) 10);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableDuration) duration35, periodType39);
        int int41 = duration15.compareTo((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Seconds seconds42 = duration35.toStandardSeconds();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withMillisOfSecond(10);
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours(10L);
        long long55 = duration54.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.withDurationAdded((org.joda.time.ReadableDuration) duration54, (int) (short) 10);
        boolean boolean58 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology61);
        mutablePeriod62.setPeriod((long) (short) 10, (long) (short) -1);
        int int67 = mutablePeriod62.getValue(0);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(chronology68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.minusDays((int) (short) -1);
        org.joda.time.Duration duration72 = mutablePeriod62.toDurationTo((org.joda.time.ReadableInstant) dateMidnight69);
        org.joda.time.Duration duration75 = duration72.withDurationAdded((long) 32769, 0);
        org.joda.time.Duration duration77 = duration54.withDurationAdded((org.joda.time.ReadableDuration) duration75, 35);
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardHours((long) 100);
        org.joda.time.Duration duration80 = duration79.toDuration();
        int int81 = duration77.compareTo((org.joda.time.ReadableDuration) duration80);
        org.joda.time.Instant instant83 = new org.joda.time.Instant((long) (-1));
        org.joda.time.DateTime dateTime84 = instant83.toDateTimeISO();
        long long85 = instant83.getMillis();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration77, (org.joda.time.ReadableInstant) instant83);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration77);
        org.joda.time.Duration duration89 = duration77.minus(2764348044115000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant83 and dateTime84", (instant83.compareTo(dateTime84) == 0) == instant83.equals(dateTime84));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear(6);
        java.lang.String str15 = dateTime12.toString();
        org.joda.time.DateTime dateTime17 = dateTime12.plusMonths((-1));
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime20 = dateTime17.toLocalDateTime();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval22 = yearMonthDay21.toInterval();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval24 = yearMonthDay23.toInterval();
        org.joda.time.Interval interval25 = interval22.gap((org.joda.time.ReadableInterval) interval24);
        boolean boolean27 = interval22.isBefore(100L);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration33 = duration29.withDurationAdded((org.joda.time.ReadableDuration) duration31, 12);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(chronology34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.minusDays((int) (short) -1);
        int int38 = dateMidnight37.getYearOfEra();
        org.joda.time.Chronology chronology39 = dateMidnight37.getChronology();
        long long40 = dateMidnight37.getMillis();
        org.joda.time.DateMidnight.Property property41 = dateMidnight37.weekyear();
        org.joda.time.DateMidnight dateMidnight42 = property41.roundCeilingCopy();
        org.joda.time.Interval interval43 = duration29.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.Interval interval44 = interval22.withDurationAfterStart((org.joda.time.ReadableDuration) duration29);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(dateTimeZone46);
        java.lang.String str48 = dateTimeZone46.getID();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology52);
        mutablePeriod53.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod53.add(0L);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology67);
        mutablePeriod53.add(0L, chronology67);
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) (-1), chronology67);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(chronology74);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight75.minusDays((int) (short) -1);
        int int78 = dateMidnight77.getYearOfEra();
        org.joda.time.Chronology chronology79 = dateMidnight77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology79);
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (short) 10, chronology79);
        org.joda.time.MutableDateTime mutableDateTime82 = dateMidnight70.toMutableDateTime(chronology79);
        mutableDateTime82.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime82.millisOfDay();
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime82.era();
        boolean boolean87 = dateTimeZone46.equals((java.lang.Object) mutableDateTime82);
        boolean boolean88 = interval22.contains((org.joda.time.ReadableInstant) mutableDateTime82);
        org.joda.time.DateTime dateTime89 = mutableDateTime82.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime90 = mutableDateTime82.copy();
        org.joda.time.MutableDateTime mutableDateTime91 = mutableDateTime90.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.MutableDateTime mutableDateTime94 = mutableDateTime90.toMutableDateTime(dateTimeZone93);
        org.joda.time.DateTime dateTime95 = localDateTime20.toDateTime(dateTimeZone93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime82 and mutableDateTime94", (mutableDateTime82.compareTo(mutableDateTime94) == 0) == mutableDateTime82.equals(mutableDateTime94));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.getEndMillis();
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
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight29.withDayOfYear(54);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight29.withCenturyOfEra((int) '#');
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight29.withCenturyOfEra((int) (byte) 0);
        org.joda.time.Interval interval48 = interval1.withStart((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime65 = dateTime63.withEra((int) (short) 0);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = interval48.isBefore((org.joda.time.ReadableInstant) instant66);
        org.joda.time.MutableDateTime mutableDateTime68 = instant66.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime69 = instant66.toDateTime();
        org.joda.time.Duration duration71 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration75 = duration71.withDurationAdded((org.joda.time.ReadableDuration) duration73, 12);
        long long76 = duration71.getStandardMinutes();
        org.joda.time.Instant instant77 = instant66.minus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Period period79 = org.joda.time.Period.days(4);
        org.joda.time.Period period81 = period79.plusMinutes(32770);
        org.joda.time.Period period83 = period81.multipliedBy(35);
        org.joda.time.Duration duration84 = period83.toStandardDuration();
        boolean boolean85 = duration71.isLongerThan((org.joda.time.ReadableDuration) duration84);
        org.joda.time.PeriodType periodType88 = org.joda.time.PeriodType.days();
        org.joda.time.Period period89 = new org.joda.time.Period(1645574400000L, periodType88);
        org.joda.time.PeriodType periodType90 = periodType88.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(163L, periodType90);
        org.joda.time.Period period92 = duration84.toPeriod(periodType90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and instant66", (dateTime61.compareTo(instant66) == 0) == dateTime61.equals(instant66));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 164);
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay4.withChronologyRetainFields(chronology6);
        org.joda.time.DateTime dateTime8 = yearMonthDay4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime9 = yearMonthDay4.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology18);
        org.joda.time.DateTime dateTime22 = dateTime20.minusHours(7);
        org.joda.time.DateTime dateTime24 = dateTime22.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime26 = dateTime24.withEra((int) (short) 0);
        org.joda.time.Chronology chronology27 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime24.plusSeconds(9);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardDays((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration37, readableInstant38);
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology44);
        mutablePeriod45.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod45.add(0L);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) (short) -1);
        int int58 = dateMidnight57.getYearOfEra();
        org.joda.time.Chronology chronology59 = dateMidnight57.getChronology();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology59);
        mutablePeriod45.add(0L, chronology59);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) (-1), chronology59);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusDays((int) (short) -1);
        int int70 = dateMidnight69.getYearOfEra();
        org.joda.time.Chronology chronology71 = dateMidnight69.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 10, chronology71);
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight62.toMutableDateTime(chronology71);
        org.joda.time.DurationField durationField75 = chronology71.months();
        org.joda.time.DateTimeField dateTimeField76 = chronology71.dayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(36000L, periodType40, chronology71);
        org.joda.time.Period period78 = duration31.toPeriodTo((org.joda.time.ReadableInstant) dateTime35, periodType40);
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean80 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration83 = new org.joda.time.Duration((-1704067200000L), 3024000000L);
        org.joda.time.DateTime dateTime85 = dateTime35.withDurationAdded((org.joda.time.ReadableDuration) duration83, 339);
        org.joda.time.PeriodType periodType90 = org.joda.time.PeriodType.days();
        org.joda.time.Period period91 = new org.joda.time.Period(1645574400000L, periodType90);
        org.joda.time.Period period92 = new org.joda.time.Period((long) 23, periodType90);
        org.joda.time.PeriodType periodType93 = periodType90.withYearsRemoved();
        org.joda.time.Period period94 = new org.joda.time.Period(457104L, 34712668800000L, periodType90);
        org.joda.time.Period period95 = duration3.toPeriodTo((org.joda.time.ReadableInstant) dateTime35, periodType90);
        org.joda.time.Period period96 = new org.joda.time.Period((-259200000L), (long) 50400000, periodType90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime35", (dateTime8.compareTo(dateTime35) == 0) == dateTime8.equals(dateTime35));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
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
        mutableDateTime37.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.millisOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) mutableDateTime37);
        int int43 = mutableDateTime37.getSecondOfMinute();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology46);
        mutablePeriod47.setPeriod((long) (short) 10, (long) (short) -1);
        int int52 = mutablePeriod47.getValue(0);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        org.joda.time.Duration duration57 = mutablePeriod47.toDurationTo((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.halfdayOfDay();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight54, chronology65);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.days();
        org.joda.time.Period period72 = new org.joda.time.Period(1645574400000L, periodType71);
        org.joda.time.Period period73 = period72.normalizedStandard();
        int int74 = period73.getSeconds();
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight54.minus((org.joda.time.ReadablePeriod) period73);
        org.joda.time.DateMidnight.Property property76 = dateMidnight54.monthOfYear();
        org.joda.time.DateMidnight dateMidnight77 = property76.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight78 = property76.roundCeilingCopy();
        boolean boolean79 = mutableDateTime37.isEqual((org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight(chronology80);
        int int82 = dateMidnight81.getMillisOfSecond();
        org.joda.time.Instant instant83 = dateMidnight81.toInstant();
        org.joda.time.Chronology chronology84 = instant83.getChronology();
        int int85 = mutableDateTime37.compareTo((org.joda.time.ReadableInstant) instant83);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime37.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and instant83", (dateMidnight18.compareTo(instant83) == 0) == dateMidnight18.equals(instant83));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        org.joda.time.DateTime dateTime17 = dateTime14.minusHours(17);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(31);
        org.joda.time.DateTime.Property property20 = dateTime17.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy(47);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 10, chronology31);
        org.joda.time.DateTime dateTime35 = dateTime33.plusSeconds((int) ' ');
        org.joda.time.DateTime dateTime37 = dateTime35.withMillisOfDay(54);
        org.joda.time.DateTime dateTime39 = dateTime35.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) '#');
        java.lang.String str43 = dateTimeZone40.getID();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology45 = mutableDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime35.withChronology(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime22.toDateTime(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime46", (dateTime35.compareTo(dateTime46) == 0) == dateTime35.equals(dateTime46));
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
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime14.withEra((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.millisOfSecond();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        long long25 = chronology21.add((long) 6, (long) 16, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.weekyear();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1645574400000L, chronology21);
        org.joda.time.DateTime dateTime28 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime14.withZoneRetainFields(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime34 = dateTime33.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime28", (dateTime12.compareTo(dateTime28) == 0) == dateTime12.equals(dateTime28));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        org.joda.time.Duration duration21 = duration5.minus((org.joda.time.ReadableDuration) duration20);
        long long22 = duration20.getMillis();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        int int26 = dateMidnight25.getMillisOfSecond();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', periodType28, chronology29);
        org.joda.time.Period period32 = period30.withDays((int) ' ');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight25, (org.joda.time.ReadablePeriod) period32);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval35 = yearMonthDay34.toInterval();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval37 = yearMonthDay36.toInterval();
        org.joda.time.Interval interval38 = interval35.gap((org.joda.time.ReadableInterval) interval37);
        boolean boolean40 = interval35.isBefore(100L);
        org.joda.time.Interval interval41 = interval35.toInterval();
        org.joda.time.Interval interval42 = interval33.gap((org.joda.time.ReadableInterval) interval35);
        boolean boolean43 = interval33.isBeforeNow();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        int int48 = dateMidnight47.getYearOfEra();
        org.joda.time.Chronology chronology49 = dateMidnight47.getChronology();
        java.lang.String str50 = chronology49.toString();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.secondOfMinute();
        org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) interval33, chronology49);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay((long) 59, chronology49);
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfYear();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology57);
        mutablePeriod58.setPeriod((long) (short) 10, (long) (short) -1);
        int int63 = mutablePeriod58.getValue(0);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        org.joda.time.Duration duration68 = mutablePeriod58.toDurationTo((org.joda.time.ReadableInstant) dateMidnight65);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField79 = chronology76.halfdayOfDay();
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight65, chronology76);
        org.joda.time.LocalDate localDate82 = localDate80.withDayOfMonth(8);
        int int83 = localDate80.getMonthOfYear();
        org.joda.time.LocalDate localDate85 = localDate80.minusYears(840);
        org.joda.time.DateTime dateTime86 = localDate80.toDateTimeAtCurrentTime();
        int[] intArray88 = chronology49.get((org.joda.time.ReadablePartial) localDate80, (long) 2005);
        org.joda.time.DurationField durationField89 = chronology49.seconds();
        org.joda.time.Period period90 = duration20.toPeriod(chronology49);
        org.joda.time.DurationField durationField91 = chronology49.millis();
        org.joda.time.DurationField durationField92 = chronology49.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField89, and durationField91", !(durationField92.compareTo(durationField89) == 0) || (Math.signum(durationField92.compareTo(durationField91)) == Math.signum(durationField89.compareTo(durationField91))));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter3.getZone();
        java.util.Locale locale6 = dateTimeFormatter3.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withDefaultYear((int) (byte) 10);
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay10.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        int int16 = dateTimeZone14.getOffset((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight17 = yearMonthDay10.toDateMidnight(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withZone(dateTimeZone14);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 9, dateTimeZone14);
        org.joda.time.LocalDate localDate21 = localDate19.withYear(26674320);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(43);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (-1), chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight49.toMutableDateTime(chronology58);
        mutableDateTime61.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        boolean boolean66 = dateTimeZone25.equals((java.lang.Object) mutableDateTime61);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(dateTimeZone25);
        boolean boolean69 = dateTimeZone25.isFixed();
        org.joda.time.DateTime dateTime70 = localDate21.toDateTimeAtCurrentTime(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime67", (dateTime13.compareTo(mutableDateTime67) == 0) == dateTime13.equals(mutableDateTime67));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = chronology5.withZone(dateTimeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone13);
        java.lang.String str15 = dateTimeZone13.getID();
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
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.era();
        boolean boolean54 = dateTimeZone13.equals((java.lang.Object) mutableDateTime49);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone13);
        boolean boolean57 = dateTimeZone13.isFixed();
        org.joda.time.DateTime dateTime58 = dateTime10.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime60 = dateTime58.withMillisOfSecond(22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime55", (dateTime10.compareTo(mutableDateTime55) == 0) == dateTime10.equals(mutableDateTime55));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMonths(31);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.dayOfYear();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) 100);
        org.joda.time.Minutes minutes10 = duration9.toStandardMinutes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.add(0, 35, 100, 50400000, 547, 22, 292278969, (int) (byte) 100);
        org.joda.time.MutablePeriod mutablePeriod25 = mutablePeriod15.toMutablePeriod();
        org.joda.time.PeriodType periodType26 = mutablePeriod25.getPeriodType();
        org.joda.time.Period period27 = duration9.toPeriod(periodType26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property43 = dateTime40.centuryOfEra();
        int int44 = dateTime40.getMillisOfSecond();
        org.joda.time.DateTime dateTime46 = dateTime40.plus((long) 6);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.clockhourOfDay();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology54);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.millisOfDay();
        org.joda.time.DateTime dateTime68 = dateTime57.withChronology(chronology65);
        org.joda.time.DateTime dateTime69 = dateTime46.toDateTime(chronology65);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.withMillisOfSecond(10);
        java.lang.String str77 = localDateTime73.toString("1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(dateTimeZone79);
        java.lang.String str81 = dateTimeZone79.getID();
        org.joda.time.DateTime dateTime82 = localDateTime73.toDateTime(dateTimeZone79);
        org.joda.time.DateTime dateTime83 = dateTime69.toDateTime(dateTimeZone79);
        java.lang.String str84 = dateTime83.toString();
        org.joda.time.DateTime dateTime86 = dateTime83.minusYears(26674320);
        org.joda.time.DateTime.Property property87 = dateTime83.era();
        boolean boolean88 = duration9.equals((java.lang.Object) property87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime83", (dateTime46.compareTo(dateTime83) == 0) == dateTime46.equals(dateTime83));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
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
        org.joda.time.Period period25 = new org.joda.time.Period((long) 0, (long) 6, chronology22);
        int int26 = period25.getSeconds();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours(10L);
        long long29 = duration28.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.withMillis((long) 24);
        long long33 = dateMidnight32.getMillis();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateMidnight32);
        boolean boolean35 = period25.equals((java.lang.Object) dateMidnight32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology43.getZone();
        int int48 = dateTimeZone46.getOffset((long) 'u');
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight32.withZoneRetainFields(dateTimeZone46);
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone46.getShortName((long) 840, locale51);
        boolean boolean53 = dateTimeZone46.isFixed();
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime2.toMutableDateTime(dateTimeZone46);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime54", (dateTime2.compareTo(mutableDateTime54) == 0) == dateTime2.equals(mutableDateTime54));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.plus(1645514595578L);
        org.joda.time.Instant instant6 = instant1.minus(14L);
        org.joda.time.Instant instant8 = instant1.plus((-4L));
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.minuteOfDay();
        java.lang.Object obj11 = null;
        boolean boolean12 = property10.equals(obj11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant3 = instant1.minus((long) 50);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        org.joda.time.DateTime dateTime6 = instant1.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.Instant instant4 = instant1.minus(31556952000L);
        org.joda.time.Instant instant6 = instant1.plus((long) 47);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        int int9 = dateMidnight8.getMillisOfSecond();
        org.joda.time.Interval interval10 = dateMidnight8.toInterval();
        org.joda.time.Instant instant11 = dateMidnight8.toInstant();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.DateTime dateTime13 = instant1.toDateTime();
        org.joda.time.Instant instant16 = instant1.withDurationAdded(38L, 964);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant11", (dateMidnight8.compareTo(instant11) == 0) == dateMidnight8.equals(instant11));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.halfdayOfDay();
        mutableDateTime33.setRounding(dateTimeField46);
        int int49 = dateTimeField46.getMaximumValue(36000L);
        long long51 = dateTimeField46.roundFloor((long) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval53 = yearMonthDay52.toInterval();
        int int54 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay52);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        int int61 = dateTimeZone59.getOffset((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight62 = yearMonthDay55.toDateMidnight(dateTimeZone59);
        org.joda.time.DateTime dateTime63 = yearMonthDay52.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardHours((long) 655);
        org.joda.time.Seconds seconds66 = duration65.toStandardSeconds();
        org.joda.time.DateTime dateTime67 = dateTime63.plus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.DateTime.Property property68 = dateTime67.year();
        org.joda.time.DateTime dateTime70 = dateTime67.plusYears(2077);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime63", (dateTime58.compareTo(dateTime63) == 0) == dateTime58.equals(dateTime63));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        java.lang.String str7 = interval1.toString();
        boolean boolean8 = interval1.isBeforeNow();
        long long9 = interval1.getEndMillis();
        org.joda.time.Duration duration10 = interval1.toDuration();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 10, chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology19.millis();
        org.joda.time.Period period25 = duration10.toPeriod(chronology19);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.clockhourOfDay();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology33);
        int int37 = dateTime36.getWeekOfWeekyear();
        boolean boolean38 = duration10.equals((java.lang.Object) dateTime36);
        int int39 = dateTime36.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime44 = dateTime36.toDateTime(chronology43);
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime42", (dateTime36.compareTo(dateTime42) == 0) == dateTime36.equals(dateTime42));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 0);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTimeISO();
        mutableDateTime4.addMonths(359);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.Interval interval3 = dateMidnight1.toInterval();
        org.joda.time.Instant instant4 = dateMidnight1.toInstant();
        org.joda.time.Period period6 = org.joda.time.Period.months((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight1.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        long long12 = dateMidnight9.getMillis();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withMillis((long) 7);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        long long21 = dateMidnight18.getMillis();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.days();
        org.joda.time.Period period23 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight18, periodType22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight18.toMutableDateTimeISO();
        int int25 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime24.addYears(131485);
        int int28 = mutableDateTime24.getMillisOfDay();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        java.lang.String str31 = periodType29.getName();
        java.util.Date date35 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromDateFields(date35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay36.withFieldAdded(durationFieldType38, 0);
        int int41 = periodType29.indexOf(durationFieldType38);
        org.joda.time.PeriodType periodType42 = periodType29.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadableInstant) mutableDateTime24, periodType42);
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(259200000L);
        boolean boolean46 = periodType42.equals((java.lang.Object) 259200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant4", (dateMidnight1.compareTo(instant4) == 0) == dateMidnight1.equals(instant4));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime.Property property14 = dateTime12.dayOfWeek();
        int int15 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime12.withDayOfYear(6);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.lang.String str21 = dateTimeZone19.getShortName((long) 53);
        java.lang.String str23 = dateTimeZone19.getName((long) 9);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone19);
        long long26 = dateTimeZone19.convertUTCToLocal((long) 361);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime12.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime27", (dateTime12.compareTo(mutableDateTime27) == 0) == dateTime12.equals(mutableDateTime27));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillis(50399L);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours(10L);
        long long8 = duration7.getStandardSeconds();
        java.lang.String str9 = duration7.toString();
        org.joda.time.DateTime dateTime10 = dateTime5.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 10, chronology22);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours(7);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property29 = dateTime26.centuryOfEra();
        int int30 = dateTime26.getMillisOfSecond();
        org.joda.time.DateTime dateTime32 = dateTime26.plus((long) 6);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfDay();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.millisOfDay();
        org.joda.time.DateTime dateTime54 = dateTime43.withChronology(chronology51);
        org.joda.time.DateTime dateTime55 = dateTime32.toDateTime(chronology51);
        org.joda.time.DurationField durationField56 = chronology51.years();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(0L, chronology51);
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType12.getField(chronology51);
        org.joda.time.DateTimeField dateTimeField59 = chronology51.minuteOfDay();
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.lang.String str61 = locale60.toLanguageTag();
        java.lang.String str62 = locale60.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology51, locale60);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((java.lang.Object) dateTime10, chronology51);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(chronology51);
        org.joda.time.DateTimeField dateTimeField66 = chronology51.weekyearOfCentury();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime43", (dateTime3.compareTo(dateTime43) == 0) == dateTime3.equals(dateTime43));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillis(50399L);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours(10L);
        long long8 = duration7.getStandardSeconds();
        java.lang.String str9 = duration7.toString();
        org.joda.time.DateTime dateTime10 = dateTime5.plus((org.joda.time.ReadableDuration) duration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 10, chronology22);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours(7);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property29 = dateTime26.centuryOfEra();
        int int30 = dateTime26.getMillisOfSecond();
        org.joda.time.DateTime dateTime32 = dateTime26.plus((long) 6);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfDay();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.minusDays((int) (short) -1);
        int int50 = dateMidnight49.getYearOfEra();
        org.joda.time.Chronology chronology51 = dateMidnight49.getChronology();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.millisOfDay();
        org.joda.time.DateTime dateTime54 = dateTime43.withChronology(chronology51);
        org.joda.time.DateTime dateTime55 = dateTime32.toDateTime(chronology51);
        org.joda.time.DurationField durationField56 = chronology51.years();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(0L, chronology51);
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType12.getField(chronology51);
        org.joda.time.DateTimeField dateTimeField59 = chronology51.minuteOfDay();
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.lang.String str61 = locale60.toLanguageTag();
        java.lang.String str62 = locale60.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology51, locale60);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((java.lang.Object) dateTime10, chronology51);
        int int65 = dateMidnight64.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime43", (dateTime3.compareTo(dateTime43) == 0) == dateTime3.equals(dateTime43));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        int int16 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.plus((long) 6);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.withChronology(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(dateTimeZone43);
        java.lang.String str45 = dateTimeZone43.getID();
        org.joda.time.Chronology chronology46 = chronology37.withZone(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval48 = yearMonthDay47.toInterval();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay47.withChronologyRetainFields(chronology49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology53);
        mutablePeriod54.setPeriod((long) (short) 10, (long) (short) -1);
        int int59 = mutablePeriod54.getValue(0);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        org.joda.time.Duration duration64 = mutablePeriod54.toDurationTo((org.joda.time.ReadableInstant) dateMidnight61);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay50.minus((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        int int71 = dateTimeZone69.getOffset((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(840, 3, 4, dateTimeZone69);
        org.joda.time.DateMidnight dateMidnight73 = yearMonthDay50.toDateMidnight(dateTimeZone69);
        long long75 = dateTimeZone43.getMillisKeepLocal(dateTimeZone69, 25200000L);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight(chronology77);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.minusDays((int) (short) -1);
        int int81 = dateMidnight80.getYearOfEra();
        org.joda.time.Chronology chronology82 = dateMidnight80.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.Chronology chronology85 = chronology82.withZone(dateTimeZone84);
        org.joda.time.LocalDate localDate86 = org.joda.time.LocalDate.now(chronology85);
        org.joda.time.DateTime dateTime87 = localDate86.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone88 = dateTime87.getZone();
        org.joda.time.DateTime dateTime89 = dateTime76.withZone(dateTimeZone88);
        org.joda.time.TimeOfDay timeOfDay90 = dateTime89.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime76", (dateTime29.compareTo(dateTime76) == 0) == dateTime29.equals(dateTime76));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration12 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration10, 12);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        long long19 = dateMidnight16.getMillis();
        org.joda.time.DateMidnight.Property property20 = dateMidnight16.weekyear();
        org.joda.time.DateMidnight dateMidnight21 = property20.roundCeilingCopy();
        org.joda.time.Interval interval22 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.Interval interval23 = interval1.withDurationAfterStart((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(dateTimeZone25);
        java.lang.String str27 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology31);
        mutablePeriod32.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod32.add(0L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        mutablePeriod32.add(0L, chronology46);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (-1), chronology46);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight54.minusDays((int) (short) -1);
        int int57 = dateMidnight56.getYearOfEra();
        org.joda.time.Chronology chronology58 = dateMidnight56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (short) 10, chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight49.toMutableDateTime(chronology58);
        mutableDateTime61.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.millisOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.era();
        boolean boolean66 = dateTimeZone25.equals((java.lang.Object) mutableDateTime61);
        boolean boolean67 = interval1.contains((org.joda.time.ReadableInstant) mutableDateTime61);
        org.joda.time.MutableInterval mutableInterval68 = interval1.toMutableInterval();
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(locale69);
        calendar70.setFirstDayOfWeek(24);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((java.lang.Object) calendar70);
        org.joda.time.Interval interval74 = localDate73.toInterval();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.Interval interval76 = interval74.withPeriodBeforeEnd(readablePeriod75);
        long long77 = interval76.toDurationMillis();
        boolean boolean78 = mutableInterval68.isBefore((org.joda.time.ReadableInterval) interval76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay0 and localDate73", (yearMonthDay0.compareTo(localDate73) == 0) == yearMonthDay0.equals(localDate73));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        java.lang.Integer int6 = dateTimeFormatter5.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours(7);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property23 = dateTime20.centuryOfEra();
        int int24 = dateTime20.getMillisOfSecond();
        org.joda.time.DateTime dateTime26 = dateTime20.plus((long) 6);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.clockhourOfDay();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology34);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.minusDays((int) (short) -1);
        int int44 = dateMidnight43.getYearOfEra();
        org.joda.time.Chronology chronology45 = dateMidnight43.getChronology();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.millisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime37.withChronology(chronology45);
        org.joda.time.DateTime dateTime49 = dateTime26.toDateTime(chronology45);
        org.joda.time.DurationField durationField50 = chronology45.years();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter7.withChronology(chronology45);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(1645660800000L, chronology45);
        java.util.Locale.Category category53 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category53, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 31, chronology45, locale54);
        java.util.Locale locale57 = dateTimeParserBucket56.getLocale();
        org.joda.time.Chronology chronology58 = dateTimeParserBucket56.getChronology();
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(90629L, chronology58);
        org.joda.time.DurationField durationField60 = chronology58.eras();
        org.joda.time.DurationField durationField61 = chronology58.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField50 and durationField60", Math.signum(durationField50.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField50)));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.getID();
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
        mutableDateTime37.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.millisOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.era();
        boolean boolean42 = dateTimeZone1.equals((java.lang.Object) mutableDateTime37);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTime();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration52 = duration48.withDurationAdded((org.joda.time.ReadableDuration) duration50, 12);
        org.joda.time.Duration duration53 = duration50.toDuration();
        org.joda.time.Duration duration54 = duration53.toDuration();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(353, (int) '4', 21, 40, 0, 50, 18000010, 292278993);
        org.joda.time.PeriodType periodType64 = mutablePeriod63.getPeriodType();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(chronology67);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.minusDays((int) (short) -1);
        int int71 = dateMidnight70.getYearOfEra();
        org.joda.time.Chronology chronology72 = dateMidnight70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology72);
        org.joda.time.DateTimeField dateTimeField74 = chronology72.clockhourOfDay();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology72);
        org.joda.time.DateTimeField dateTimeField76 = chronology72.millisOfSecond();
        org.joda.time.DurationField durationField77 = chronology72.months();
        org.joda.time.Period period78 = duration54.toPeriod(periodType64, chronology72);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime46, (org.joda.time.ReadableDuration) duration54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime43 and dateTime75", (mutableDateTime43.compareTo(dateTime75) == 0) == mutableDateTime43.equals(dateTime75));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        int int8 = dateMidnight5.getSecondOfMinute();
        java.util.Locale locale13 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "07:22:45.446", "07:22:45.446");
        java.lang.String str14 = dateMidnight5.toString("07:22:45.446", locale13);
        int int15 = dateMidnight5.getSecondOfMinute();
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
        org.joda.time.DateTime dateTime35 = dateTime29.plus((long) 6);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology43);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.millisOfDay();
        org.joda.time.DateTime dateTime57 = dateTime46.withChronology(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime35.toDateTime(chronology54);
        org.joda.time.DurationField durationField59 = chronology54.years();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(0L, chronology54);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime.Property property62 = dateTime60.secondOfMinute();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int67 = dateTimeZone65.getOffsetFromLocal((long) 23);
        int int69 = dateTimeZone65.getOffset((long) 'a');
        java.lang.String str70 = dateTimeZone65.toString();
        org.joda.time.DateTime dateTime71 = dateTime1.toDateTime(dateTimeZone65);
        org.joda.time.DateTime.Property property72 = dateTime1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and dateTime71", (dateTime60.compareTo(dateTime71) == 0) == dateTime60.equals(dateTime71));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.joda.time.DateTime dateTime66 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime68 = dateTime66.plusWeeks(4);
        org.joda.time.DateTime dateTime71 = dateTime66.withDurationAdded(0L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long76 = dateTimeZone73.adjustOffset((long) 10, false);
        org.joda.time.DateTime dateTime77 = dateTime66.toDateTime(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        org.joda.time.PeriodType periodType81 = org.joda.time.PeriodType.days();
        org.joda.time.Period period82 = new org.joda.time.Period(1645574400000L, periodType81);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.withPeriodAdded((org.joda.time.ReadablePeriod) period82, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime79.withWeekyear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime79.minusSeconds(62);
        org.joda.time.LocalDateTime.Property property89 = localDateTime88.weekyear();
        org.joda.time.LocalDateTime localDateTime91 = property89.addToCopy((long) 59);
        org.joda.time.DateTime dateTime92 = localDateTime91.toDateTime();
        org.joda.time.LocalDateTime localDateTime94 = localDateTime91.plusMillis(23261167);
        boolean boolean95 = dateTimeZone73.isLocalDateTimeGap(localDateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight37 and dateTime77", (dateMidnight37.compareTo(dateTime77) == 0) == dateMidnight37.equals(dateTime77));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Chronology chronology3 = dateTime2.getChronology();
        int int4 = dateTime2.getCenturyOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        int int13 = mutablePeriod8.getValue(0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        org.joda.time.Duration duration18 = mutablePeriod8.toDurationTo((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.halfdayOfDay();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight15, chronology26);
        org.joda.time.Chronology chronology31 = chronology26.withUTC();
        org.joda.time.DurationField durationField32 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.yearOfEra();
        org.joda.time.DateTime dateTime34 = dateTime2.toDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField35 = chronology26.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime34", (dateTime2.compareTo(dateTime34) == 0) == dateTime2.equals(dateTime34));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withMillis(4406400000L);
        org.joda.time.Chronology chronology28 = dateMidnight27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.months();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.DurationField durationField31 = chronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.monthOfYear();
        org.joda.time.DurationField durationField33 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField23, and durationField29", !(durationField33.compareTo(durationField23) == 0) || (Math.signum(durationField33.compareTo(durationField29)) == Math.signum(durationField23.compareTo(durationField29))));
    }
}

