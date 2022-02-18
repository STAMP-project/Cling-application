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
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        boolean boolean41 = dateTime31.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime43 = dateTime31.plusHours(11);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        boolean boolean48 = dateTimeZone22.equals((java.lang.Object) instant47);
        boolean boolean50 = dateTimeZone22.isStandardOffset((long) 23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.String str16 = mutableDateTime1.toString();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology29 = dateTime22.getChronology();
        java.lang.String str30 = chronology29.toString();
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        long long41 = dateTimeZone38.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.Chronology chronology43 = chronology29.withZone(dateTimeZone38);
        mutableDateTime1.setChronology(chronology29);
        org.joda.time.DurationField durationField45 = chronology29.years();
        org.joda.time.DateTimeField dateTimeField46 = chronology29.secondOfMinute();
        org.joda.time.DurationField durationField47 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField48 = chronology29.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField47", Math.signum(durationField45.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField45)));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        boolean boolean41 = dateTime31.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime43 = dateTime31.plusHours(11);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        boolean boolean48 = dateTimeZone22.equals((java.lang.Object) instant47);
        java.util.Locale locale50 = java.util.Locale.ROOT;
        java.lang.String str51 = locale50.getDisplayScript();
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.util.Locale locale53 = java.util.Locale.FRENCH;
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.lang.String str55 = locale50.getDisplayCountry(locale52);
        java.lang.String str56 = locale50.getDisplayName();
        java.lang.String str57 = dateTimeZone22.getShortName(1648461008949L, locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime8.minus(readableDuration18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone17.toTimeZone();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone19, locale20);
        calendar21.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime29.setWeekyear(3);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime33.getZone();
        mutableDateTime29.setZoneRetainFields(dateTimeZone39);
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone41, locale42);
        calendar21.setTimeZone(timeZone41);
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone41, locale45);
        int int47 = property5.getMaximumShortTextLength(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar46", (calendar43.compareTo(calendar46) == 0) == calendar43.equals(calendar46));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.property(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.plusDays(11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale18.getScript();
        java.lang.String str21 = dateTimeZone16.getName(1646041809840L, locale18);
        int int23 = dateTimeZone16.getStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime1, dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime24", (dateTime14.compareTo(dateTime24) == 0) == dateTime14.equals(dateTime24));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusYears((int) (short) 1);
        long long19 = dateTime15.getMillis();
        java.util.Date date20 = dateTime15.toDate();
        boolean boolean21 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime15);
        long long22 = dateTime15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant6", (mutableDateTime1.compareTo(instant6) == 0) == mutableDateTime1.equals(instant6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.withDurationAdded(readableDuration6, (int) (byte) 10);
        java.util.Date date14 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean17 = localDate15.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = localDate15.withEra(0);
        org.joda.time.LocalDate localDate21 = localDate15.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate15.plus(readablePeriod22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime25.getZone();
        org.joda.time.DateMidnight dateMidnight32 = localDate15.toDateMidnight(dateTimeZone31);
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.plus(readablePeriod37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.plus(readableDuration39);
        java.util.Date date46 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromDateFields(date46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean49 = localDate47.isSupported(dateTimeFieldType48);
        boolean boolean50 = dateTime40.isSupported(dateTimeFieldType48);
        org.joda.time.DateTime dateTime52 = dateTime40.plusHours(11);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.withChronology(chronology53);
        org.joda.time.DateMidnight dateMidnight55 = dateTime54.toDateMidnight();
        org.joda.time.Instant instant56 = dateMidnight55.toInstant();
        boolean boolean57 = dateTimeZone31.equals((java.lang.Object) instant56);
        org.joda.time.DateTime dateTime58 = dateTime8.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight55 and instant56", (dateMidnight55.compareTo(instant56) == 0) == dateMidnight55.equals(instant56));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        java.lang.String str41 = locale39.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("gregory");
        double double2 = languageRange1.getWeight();
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        calendar8.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar8.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime14.setWeekyear(3);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone24.toTimeZone();
        java.util.Locale locale29 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.LocalDateTime localDateTime32 = dateTime31.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withDurationAdded(readableDuration33, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.minusMonths(0);
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours(0);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.minusMinutes((int) (byte) 10);
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.lang.String str45 = localDateTime37.toString("10", locale44);
        java.lang.String str46 = locale29.getDisplayName(locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone27, locale29);
        calendar8.setTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.Calendar.Builder builder50 = builder7.setTimeZone(timeZone27);
        boolean boolean51 = languageRange1.equals((java.lang.Object) builder50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar47", (calendar8.compareTo(calendar47) == 0) == calendar8.equals(calendar47));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.centuryOfEra();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DurationField durationField18 = chronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField18, and durationField16", !(durationField16.compareTo(durationField18) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField18.compareTo(durationField16))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        boolean boolean23 = dateTime22.isEqualNow();
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime25.getZone();
        long long34 = dateTimeZone31.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime35 = dateTime22.toDateTime(dateTimeZone31);
        org.joda.time.LocalTime localTime36 = dateTime22.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime22.getZone();
        org.joda.time.DateTime dateTime39 = dateTime22.withMillisOfSecond(625);
        boolean boolean40 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 35412);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime4.setWeekyear(3);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withPeriodAdded(readablePeriod11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime8.getZone();
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone16, locale17);
        java.lang.String str19 = locale17.toLanguageTag();
        java.util.Calendar.Builder builder20 = builder0.setLocale(locale17);
        java.util.Calendar.Builder builder22 = builder0.setInstant(0L);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance();
        calendar23.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar23.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime29.setWeekyear(3);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime33.getZone();
        mutableDateTime29.setZoneRetainFields(dateTimeZone39);
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone41, locale42);
        calendar23.setTimeZone(timeZone41);
        java.util.Calendar.Builder builder45 = builder22.setTimeZone(timeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar23", (calendar18.compareTo(calendar23) == 0) == calendar18.equals(calendar23));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale11 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.LocalDateTime localDateTime14 = dateTime13.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minusMonths(0);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMinutes((int) (byte) 10);
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = localDateTime19.toString("10", locale26);
        java.lang.String str28 = locale11.getDisplayName(locale26);
        java.lang.String str29 = locale9.getDisplayName(locale11);
        java.util.Calendar.Builder builder30 = builder4.setLocale(locale9);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        java.util.TimeZone timeZone44 = dateTimeZone42.toTimeZone();
        java.util.TimeZone timeZone45 = dateTimeZone42.toTimeZone();
        java.util.Locale locale47 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.LocalDateTime localDateTime50 = dateTime49.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDurationAdded(readableDuration51, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.minusMonths(0);
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours(0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.minusMinutes((int) (byte) 10);
        java.util.Locale locale62 = java.util.Locale.CHINESE;
        java.lang.String str63 = localDateTime55.toString("10", locale62);
        java.lang.String str64 = locale47.getDisplayName(locale62);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone45, locale47);
        java.util.Calendar.Builder builder66 = builder30.setTimeZone(timeZone45);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone45);
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar65 and calendar67", (calendar65.compareTo(calendar67) == 0) == calendar65.equals(calendar67));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology12.hours();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField13, and durationField14", !(durationField17.compareTo(durationField13) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.Instant instant13 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime15 = dateTime5.minusDays(21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11, (int) (short) -1);
        java.util.Date date14 = mutableDateTime1.toDate();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        calendar15.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar15.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime25.getZone();
        mutableDateTime21.setZoneRetainFields(dateTimeZone31);
        java.util.TimeZone timeZone33 = dateTimeZone31.toTimeZone();
        java.util.TimeZone timeZone34 = dateTimeZone31.toTimeZone();
        java.util.Locale locale36 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withDurationAdded(readableDuration40, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.minusMonths(0);
        org.joda.time.DateTime dateTime45 = localDateTime44.toDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusHours(0);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.minusMinutes((int) (byte) 10);
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = localDateTime44.toString("10", locale51);
        java.lang.String str53 = locale36.getDisplayName(locale51);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone34, locale36);
        calendar15.setTimeZone(timeZone34);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) date14, dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar54", (calendar15.compareTo(calendar54) == 0) == calendar15.equals(calendar54));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar0.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone18, locale19);
        calendar0.setTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar20", (calendar0.compareTo(calendar20) == 0) == calendar0.equals(calendar20));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekOfWeekyear(10);
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 22);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime15 = dateTime9.plusMillis(35476);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale11 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.LocalDateTime localDateTime14 = dateTime13.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minusMonths(0);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMinutes((int) (byte) 10);
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = localDateTime19.toString("10", locale26);
        java.lang.String str28 = locale11.getDisplayName(locale26);
        java.lang.String str29 = locale9.getDisplayName(locale11);
        java.util.Calendar.Builder builder30 = builder4.setLocale(locale9);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        java.util.TimeZone timeZone44 = dateTimeZone42.toTimeZone();
        java.util.TimeZone timeZone45 = dateTimeZone42.toTimeZone();
        java.util.Locale locale47 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.LocalDateTime localDateTime50 = dateTime49.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDurationAdded(readableDuration51, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.minusMonths(0);
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours(0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.minusMinutes((int) (byte) 10);
        java.util.Locale locale62 = java.util.Locale.CHINESE;
        java.lang.String str63 = localDateTime55.toString("10", locale62);
        java.lang.String str64 = locale47.getDisplayName(locale62);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone45, locale47);
        java.util.Calendar.Builder builder66 = builder30.setTimeZone(timeZone45);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar65 and calendar67", (calendar65.compareTo(calendar67) == 0) == calendar65.equals(calendar67));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.weekyear();
        org.joda.time.Instant instant17 = mutableDateTime1.toInstant();
        mutableDateTime1.addWeekyears(73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant17", (dateTime7.compareTo(instant17) == 0) == dateTime7.equals(instant17));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime7 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded((long) 35411, 35494);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant8", (dateTime5.compareTo(instant8) == 0) == dateTime5.equals(instant8));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter2.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        mutableDateTime9.setRounding(dateTimeField17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime9.add(readableDuration19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime9.era();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime9.add(readableDuration22);
        java.lang.String str24 = mutableDateTime9.toString();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        int int28 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime27);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime36 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Chronology chronology37 = dateTime30.getChronology();
        java.lang.String str38 = chronology37.toString();
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        long long49 = dateTimeZone46.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.Chronology chronology51 = chronology37.withZone(dateTimeZone46);
        mutableDateTime9.setChronology(chronology37);
        org.joda.time.DurationField durationField53 = chronology37.years();
        org.joda.time.DateTimeField dateTimeField54 = chronology37.secondOfMinute();
        org.joda.time.DurationField durationField55 = chronology37.eras();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone7, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField53 and durationField55", Math.signum(durationField53.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField53)));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        mutableDateTime1.setDayOfYear((int) 'x');
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime10.setWeekyear(3);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeField dateTimeField18 = null;
        mutableDateTime10.setRounding(dateTimeField18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime25.getZone();
        mutableDateTime21.setZoneRetainFields(dateTimeZone31);
        mutableDateTime10.setZone(dateTimeZone31);
        mutableDateTime10.addWeeks((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime10.millisOfDay();
        mutableDateTime10.setDate((long) 8);
        int int39 = mutableDateTime10.getDayOfMonth();
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime45 = dateTime41.withField(dateTimeFieldType43, 15);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime48 = dateTime45.withFieldAdded(durationFieldType46, 35408);
        mutableDateTime10.add(durationFieldType46, 249);
        mutableDateTime1.add(durationFieldType46, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime21", (instant6.compareTo(mutableDateTime21) == 0) == instant6.equals(mutableDateTime21));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusYears((int) (short) 1);
        long long19 = dateTime15.getMillis();
        java.util.Date date20 = dateTime15.toDate();
        boolean boolean21 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime15);
        java.lang.String str22 = mutableDateTime1.toString();
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.joda.time.DateTime dateTime30 = dateTime28.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfMonth();
        org.joda.time.DateTime dateTime33 = property31.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime35 = dateTime33.plusWeeks(0);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime39.setWeekyear(3);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withPeriodAdded(readablePeriod46, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime43.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone49);
        java.util.TimeZone timeZone51 = dateTimeZone49.toTimeZone();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(10L, dateTimeZone49);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime56 = dateTime54.minusDays(97);
        int int57 = dateTime54.getCenturyOfEra();
        org.joda.time.DateTime dateTime59 = dateTime54.plusMonths((int) '4');
        org.joda.time.DateTime dateTime60 = dateTime59.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime60.getZone();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime39", (instant6.compareTo(mutableDateTime39) == 0) == instant6.equals(mutableDateTime39));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, 53);
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime6", (instant2.compareTo(dateTime6) == 0) == instant2.equals(dateTime6));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        mutableDateTime1.setDayOfYear((int) 'x');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundFloor();
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.LocalDateTime localDateTime23 = dateTime22.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDurationAdded(readableDuration24, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.minusMonths(0);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime30.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime30.add(readableDuration33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.property(dateTimeFieldType35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime23.property(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime20.property(dateTimeFieldType35);
        int int39 = mutableDateTime1.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime30", (instant6.compareTo(mutableDateTime30) == 0) == instant6.equals(mutableDateTime30));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant19", (dateTime21.compareTo(instant19) == 0) == dateTime21.equals(instant19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DurationField durationField16 = chronology13.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField18 = chronology13.halfdays();
        org.joda.time.DurationField durationField19 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField16, and durationField18", !(durationField19.compareTo(durationField16) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField16.compareTo(durationField18))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add(10);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundCeiling();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime22.setWeekyear(3);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime26.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime22.add(readableDuration34, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = mutableDateTime22.toDateTime();
        org.joda.time.DateTime.Property property38 = dateTime37.minuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime37.plusWeeks((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.MIDNIGHT;
        int int45 = localTime43.compareTo((org.joda.time.ReadablePartial) localTime44);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTime dateTime53 = localTime44.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology54 = dateTime47.getChronology();
        boolean boolean55 = dateTimeFieldType41.isSupported(chronology54);
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.weekOfWeekyear();
        org.joda.time.Chronology chronology58 = chronology54.withUTC();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((java.lang.Object) dateTime37, chronology58);
        org.joda.time.DateTime dateTime60 = mutableDateTime19.toDateTime(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and dateTime59", (mutableDateTime22.compareTo(dateTime59) == 0) == mutableDateTime22.equals(dateTime59));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime30.minusMillis(2022);
        int int38 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime40 = dateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfMonth();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        mutableDateTime43.setMillis((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeField dateTimeField51 = null;
        mutableDateTime43.setRounding(dateTimeField51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime43.add(readableDuration53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.era();
        org.joda.time.ReadableDuration readableDuration56 = null;
        mutableDateTime43.add(readableDuration56);
        java.lang.String str58 = mutableDateTime43.toString();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.MIDNIGHT;
        int int62 = localTime60.compareTo((org.joda.time.ReadablePartial) localTime61);
        java.lang.Object obj63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj63);
        org.joda.time.DateTime dateTime66 = dateTime64.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withPeriodAdded(readablePeriod67, (int) (byte) 10);
        org.joda.time.DateTime dateTime70 = localTime61.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology71 = dateTime64.getChronology();
        java.lang.String str72 = chronology71.toString();
        java.lang.Object obj73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(obj73);
        org.joda.time.DateTime dateTime76 = dateTime74.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.DateTime dateTime79 = dateTime74.withPeriodAdded(readablePeriod77, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime74.getZone();
        long long83 = dateTimeZone80.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        org.joda.time.Chronology chronology85 = chronology71.withZone(dateTimeZone80);
        mutableDateTime43.setChronology(chronology71);
        org.joda.time.DurationField durationField87 = chronology71.years();
        org.joda.time.DateTimeField dateTimeField88 = chronology71.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(1646041809688L, chronology71);
        org.joda.time.DateTime dateTime90 = dateTime28.toDateTime(chronology71);
        org.joda.time.DurationField durationField91 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField92 = chronology71.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField87 and durationField91", (durationField87.compareTo(durationField91) == 0) == durationField87.equals(durationField91));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime3.getZone();
        org.joda.time.DateTime dateTime20 = dateTime3.withMillisOfSecond(625);
        org.joda.time.Instant instant21 = dateTime3.toInstant();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime3.withPeriodAdded(readablePeriod22, (-27409550));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.weekyear();
        org.joda.time.Instant instant17 = mutableDateTime1.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        int int22 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTime dateTime30 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology31 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType18.getField(chronology31);
        long long35 = dateTimeField33.roundHalfCeiling(5139153311000L);
        int int37 = dateTimeField33.getMaximumValue(3195669076754L);
        mutableDateTime1.setRounding(dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant17", (dateTime7.compareTo(instant17) == 0) == dateTime7.equals(instant17));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime30.minusMillis(2022);
        int int38 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime40 = dateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfMonth();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        mutableDateTime43.setMillis((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeField dateTimeField51 = null;
        mutableDateTime43.setRounding(dateTimeField51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime43.add(readableDuration53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.era();
        org.joda.time.ReadableDuration readableDuration56 = null;
        mutableDateTime43.add(readableDuration56);
        java.lang.String str58 = mutableDateTime43.toString();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.MIDNIGHT;
        int int62 = localTime60.compareTo((org.joda.time.ReadablePartial) localTime61);
        java.lang.Object obj63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj63);
        org.joda.time.DateTime dateTime66 = dateTime64.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withPeriodAdded(readablePeriod67, (int) (byte) 10);
        org.joda.time.DateTime dateTime70 = localTime61.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology71 = dateTime64.getChronology();
        java.lang.String str72 = chronology71.toString();
        java.lang.Object obj73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(obj73);
        org.joda.time.DateTime dateTime76 = dateTime74.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.DateTime dateTime79 = dateTime74.withPeriodAdded(readablePeriod77, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime74.getZone();
        long long83 = dateTimeZone80.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        org.joda.time.Chronology chronology85 = chronology71.withZone(dateTimeZone80);
        mutableDateTime43.setChronology(chronology71);
        org.joda.time.DurationField durationField87 = chronology71.years();
        org.joda.time.DateTimeField dateTimeField88 = chronology71.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(1646041809688L, chronology71);
        org.joda.time.DateTime dateTime90 = dateTime28.toDateTime(chronology71);
        org.joda.time.Instant instant91 = dateTime90.toInstant();
        int int92 = dateTime90.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime90 and instant91", (dateTime90.compareTo(instant91) == 0) == dateTime90.equals(instant91));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime9 = property8.withMaximumValue();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime11.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale22.getScript();
        java.lang.String str25 = dateTimeZone20.getName(1646041809840L, locale22);
        java.util.Calendar calendar26 = dateTime11.toCalendar(locale22);
        int int27 = property8.getMaximumTextLength(locale22);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime29.setWeekyear(3);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfMonth();
        org.joda.time.DateTime dateTime35 = property34.withMaximumValue();
        mutableDateTime29.setMillis((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeField dateTimeField37 = null;
        mutableDateTime29.setRounding(dateTimeField37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime29.add(readableDuration39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime29.era();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime29.millisOfDay();
        org.joda.time.Chronology chronology43 = mutableDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.millisOfSecond();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology43);
        org.joda.time.DateTimeField dateTimeField48 = chronology43.weekOfWeekyear();
        java.util.Locale locale50 = java.util.Locale.UK;
        java.lang.String str51 = dateTimeField48.getAsShortText(1646006400000L, locale50);
        java.lang.String str52 = locale22.getDisplayLanguage(locale50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter2.withLocale(locale22);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime55.setWeekyear(3);
        java.lang.Object obj58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(obj58);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfMonth();
        org.joda.time.DateTime dateTime61 = property60.withMaximumValue();
        mutableDateTime55.setMillis((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeField dateTimeField63 = null;
        mutableDateTime55.setRounding(dateTimeField63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        mutableDateTime55.add(readableDuration65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime55.era();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime55.millisOfDay();
        org.joda.time.Chronology chronology69 = mutableDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.clockhourOfHalfday();
        org.joda.time.DurationField durationField72 = chronology69.weekyears();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(dateTimeZone74);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(1646041805419L, dateTimeZone74);
        org.joda.time.Chronology chronology77 = chronology69.withZone(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField78 = chronology69.centuryOfEra();
        org.joda.time.DurationField durationField79 = chronology69.years();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter2.withChronology(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField72 and durationField79", (durationField72.compareTo(durationField79) == 0) == durationField72.equals(durationField79));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeField dateTimeField20 = null;
        mutableDateTime12.setRounding(dateTimeField20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime12.add(readableDuration22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime12.add(readableDuration24, (int) (byte) -1);
        mutableDateTime12.setMillis((long) 6);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.MIDNIGHT;
        int int32 = localTime30.compareTo((org.joda.time.ReadablePartial) localTime31);
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withPeriodAdded(readablePeriod37, (int) (byte) 10);
        org.joda.time.DateTime dateTime40 = localTime31.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology41 = dateTime34.getChronology();
        java.lang.String str42 = chronology41.toString();
        java.lang.Object obj43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj43);
        org.joda.time.DateTime dateTime46 = dateTime44.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime49 = dateTime44.withPeriodAdded(readablePeriod47, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime44.getZone();
        long long53 = dateTimeZone50.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.Chronology chronology55 = chronology41.withZone(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime57.setWeekyear(3);
        java.lang.Object obj60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(obj60);
        org.joda.time.DateTime dateTime63 = dateTime61.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.DateTime dateTime66 = dateTime61.withPeriodAdded(readablePeriod64, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime61.getZone();
        mutableDateTime57.setZoneRetainFields(dateTimeZone67);
        java.lang.String str70 = dateTimeZone67.getNameKey(1646041808949L);
        boolean boolean71 = dateTimeZone67.isFixed();
        org.joda.time.Chronology chronology72 = chronology55.withZone(dateTimeZone67);
        mutableDateTime12.setZone(dateTimeZone67);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime12.toMutableDateTime(dateTimeZone75);
        mutableDateTime1.setZoneRetainFields(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime76", (mutableDateTime12.compareTo(mutableDateTime76) == 0) == mutableDateTime12.equals(mutableDateTime76));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, 53);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant2", (dateTime5.compareTo(instant2) == 0) == dateTime5.equals(instant2));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 35412);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime4.setWeekyear(3);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withPeriodAdded(readablePeriod11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime8.getZone();
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone16, locale17);
        java.lang.String str19 = locale17.toLanguageTag();
        java.util.Calendar.Builder builder20 = builder0.setLocale(locale17);
        java.util.Calendar.Builder builder22 = builder0.setLenient(true);
        java.util.Date date28 = new java.util.Date(30, 969, 32, 10, 8);
        java.util.Calendar.Builder builder29 = builder22.setInstant(date28);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance();
        calendar30.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar30.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime36.setWeekyear(3);
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone46);
        java.util.TimeZone timeZone48 = dateTimeZone46.toTimeZone();
        java.util.TimeZone timeZone49 = dateTimeZone46.toTimeZone();
        java.util.Locale locale51 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.LocalDateTime localDateTime54 = dateTime53.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withDurationAdded(readableDuration55, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime54.minusMonths(0);
        org.joda.time.DateTime dateTime60 = localDateTime59.toDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.minusHours(0);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.minusMinutes((int) (byte) 10);
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.lang.String str67 = localDateTime59.toString("10", locale66);
        java.lang.String str68 = locale51.getDisplayName(locale66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone49, locale51);
        calendar30.setTimeZone(timeZone49);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.util.Calendar.Builder builder72 = builder29.setTimeZone(timeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar30", (calendar18.compareTo(calendar30) == 0) == calendar18.equals(calendar30));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime3.withYearOfEra(100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis(35425);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        long long13 = dateTimeZone10.nextTransition(1648461008949L);
        java.util.Date date19 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean22 = localDate20.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDate localDate24 = localDate20.withEra(0);
        org.joda.time.LocalDate localDate26 = localDate24.plusMonths(11);
        java.util.Date date27 = localDate26.toDate();
        org.joda.time.LocalDate.Property property28 = localDate26.centuryOfEra();
        org.joda.time.Chronology chronology29 = localDate26.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) long13, chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.DateTime dateTime33 = dateTime7.withChronology(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime32", (dateTime1.compareTo(mutableDateTime32) == 0) == dateTime1.equals(mutableDateTime32));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekOfWeekyear(10);
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 22);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        int int14 = dateTime9.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj1);
        org.joda.time.LocalDateTime localDateTime3 = dateTime2.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) -1);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj0, chronology6);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime7", (dateTime2.compareTo(mutableDateTime7) == 0) == dateTime2.equals(mutableDateTime7));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = dateTime16.plusWeeks((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        boolean boolean34 = dateTimeFieldType20.isSupported(chronology33);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekOfWeekyear();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime16, chronology37);
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime38", (mutableDateTime1.compareTo(dateTime38) == 0) == mutableDateTime1.equals(dateTime38));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale26.getDisplayCountry(locale28);
        java.lang.String str32 = locale26.getDisplayName();
        java.lang.String str33 = locale24.getDisplayName(locale26);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        java.util.Date date48 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        boolean boolean52 = dateTime42.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime dateTime54 = dateTime42.plusHours(11);
        org.joda.time.DateTime.Property property55 = dateTime42.yearOfEra();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = property55.getAsShortText(locale56);
        java.util.Locale.setDefault(locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone22, locale56);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar34", (calendar23.compareTo(calendar34) == 0) == calendar23.equals(calendar34));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 35412, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime9.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = dateTimeZone18.getName(1646041809840L, locale20);
        java.util.Calendar calendar24 = dateTime9.toCalendar(locale20);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        java.lang.String str32 = localDate5.toString("09:50:10.643", locale20);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale20);
        java.lang.String str35 = locale20.getExtension('x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar33", (calendar24.compareTo(calendar33) == 0) == calendar24.equals(calendar33));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime18.plusDays(845);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime3.getZone();
        org.joda.time.DateTime dateTime20 = dateTime3.withMillisOfSecond(625);
        org.joda.time.Instant instant21 = dateTime3.toInstant();
        java.lang.Object obj22 = null;
        boolean boolean23 = dateTime3.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant21", (dateTime8.compareTo(instant21) == 0) == dateTime8.equals(instant21));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        boolean boolean41 = dateTime31.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime43 = dateTime31.plusHours(11);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        boolean boolean48 = dateTimeZone22.equals((java.lang.Object) instant47);
        int int50 = dateTimeZone22.getOffset((long) 32769);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.plus(readablePeriod4);
        java.util.Date date11 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromDateFields(date11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean14 = localDate12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDate localDate16 = localDate12.withEra(0);
        org.joda.time.LocalDate localDate18 = localDate12.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate12.plus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = dateTime5.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTime.Property property22 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime23 = property22.roundFloorCopy();
        java.util.Date date29 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromDateFields(date29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDate localDate34 = localDate30.withEra(0);
        org.joda.time.LocalDate localDate36 = localDate30.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate30.plus(readablePeriod37);
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        org.joda.time.DateMidnight dateMidnight47 = localDate30.toDateMidnight(dateTimeZone46);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.plus(readablePeriod52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.plus(readableDuration54);
        java.util.Date date61 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.fromDateFields(date61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean64 = localDate62.isSupported(dateTimeFieldType63);
        boolean boolean65 = dateTime55.isSupported(dateTimeFieldType63);
        org.joda.time.DateTime dateTime67 = dateTime55.plusHours(11);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.withChronology(chronology68);
        org.joda.time.DateMidnight dateMidnight70 = dateTime69.toDateMidnight();
        org.joda.time.Instant instant71 = dateMidnight70.toInstant();
        boolean boolean72 = dateTimeZone46.equals((java.lang.Object) instant71);
        org.joda.time.DateTime dateTime73 = dateTime23.withZoneRetainFields(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight70 and instant71", (dateMidnight70.compareTo(instant71) == 0) == dateMidnight70.equals(instant71));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeField dateTimeField15 = null;
        mutableDateTime7.setRounding(dateTimeField15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone28);
        mutableDateTime7.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime7.secondOfDay();
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.plus(readablePeriod36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.plus(readableDuration38);
        java.util.Date date45 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.fromDateFields(date45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean48 = localDate46.isSupported(dateTimeFieldType47);
        boolean boolean49 = dateTime39.isSupported(dateTimeFieldType47);
        org.joda.time.DateTime dateTime51 = dateTime39.plusHours(11);
        org.joda.time.DateTime.Property property52 = dateTime39.yearOfEra();
        org.joda.time.DateTime dateTime54 = dateTime39.withYearOfEra(2);
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean56 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime58 = dateTime39.minusYears(35428);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale64 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.lang.String str66 = locale64.getScript();
        java.lang.String str67 = dateTimeZone62.getName(1646041809840L, locale64);
        int int69 = dateTimeZone62.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime60.toMutableDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime71 = dateTime58.withZone(dateTimeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime60 and mutableDateTime70", (mutableDateTime60.compareTo(mutableDateTime70) == 0) == mutableDateTime60.equals(mutableDateTime70));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime5.setWeekyear(3);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime5.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime5.add(readableDuration15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.era();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime5.add(readableDuration18);
        java.lang.String str20 = mutableDateTime5.toString();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        java.lang.String str34 = chronology33.toString();
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        long long45 = dateTimeZone42.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology33.withZone(dateTimeZone42);
        mutableDateTime5.setChronology(chronology33);
        org.joda.time.DurationField durationField49 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology33.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime3.toDateTime(chronology33);
        int int52 = dateTime51.getWeekOfWeekyear();
        java.lang.String str53 = dateTime51.toString();
        org.joda.time.Instant instant54 = dateTime51.toInstant();
        org.joda.time.DateTime dateTime55 = dateTime51.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant54", (dateTime51.compareTo(instant54) == 0) == dateTime51.equals(instant54));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar5.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime15.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone21);
        java.util.TimeZone timeZone23 = dateTimeZone21.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        java.util.Locale locale26 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withDurationAdded(readableDuration30, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.minusMonths(0);
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours(0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.minusMinutes((int) (byte) 10);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.lang.String str42 = localDateTime34.toString("10", locale41);
        java.lang.String str43 = locale26.getDisplayName(locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone24, locale26);
        calendar5.setTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.Calendar.Builder builder47 = builder4.setTimeZone(timeZone24);
        java.util.Calendar.Builder builder51 = builder47.setWeekDate(35524, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar44", (calendar5.compareTo(calendar44) == 0) == calendar5.equals(calendar44));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime2.add(readableDuration12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.era();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime2.add(readableDuration15);
        java.lang.String str17 = mutableDateTime2.toString();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        int int21 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTime dateTime29 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology30 = dateTime23.getChronology();
        java.lang.String str31 = chronology30.toString();
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime33.getZone();
        long long42 = dateTimeZone39.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.Chronology chronology44 = chronology30.withZone(dateTimeZone39);
        mutableDateTime2.setChronology(chronology30);
        org.joda.time.DurationField durationField46 = chronology30.years();
        org.joda.time.DateTimeField dateTimeField47 = chronology30.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(1646041809688L, chronology30);
        org.joda.time.DateTimeField dateTimeField49 = chronology30.monthOfYear();
        org.joda.time.DurationField durationField50 = chronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = chronology30.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField50", (durationField46.compareTo(durationField50) == 0) == durationField46.equals(durationField50));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.Instant instant13 = dateTime5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = instant13.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis(35525);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, 53);
        int int6 = dateTime1.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime1", (instant2.compareTo(dateTime1) == 0) == instant2.equals(dateTime1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        java.lang.String str14 = property13.getName();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology29 = dateTime22.getChronology();
        boolean boolean30 = dateTimeFieldType16.isSupported(chronology29);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(chronology29);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths((-1));
        org.joda.time.Instant instant35 = dateTime34.toInstant();
        org.joda.time.DateTime dateTime37 = dateTime34.minusSeconds(1902);
        boolean boolean38 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant35", (dateTime34.compareTo(instant35) == 0) == dateTime34.equals(instant35));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        int int16 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology25 = dateTime18.getChronology();
        boolean boolean26 = dateTimeFieldType12.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime11.withField(dateTimeFieldType12, 10);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime30.minusMillis(2022);
        int int38 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime40 = dateTime28.withWeekyear((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfMonth();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        mutableDateTime43.setMillis((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeField dateTimeField51 = null;
        mutableDateTime43.setRounding(dateTimeField51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime43.add(readableDuration53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.era();
        org.joda.time.ReadableDuration readableDuration56 = null;
        mutableDateTime43.add(readableDuration56);
        java.lang.String str58 = mutableDateTime43.toString();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.MIDNIGHT;
        int int62 = localTime60.compareTo((org.joda.time.ReadablePartial) localTime61);
        java.lang.Object obj63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj63);
        org.joda.time.DateTime dateTime66 = dateTime64.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withPeriodAdded(readablePeriod67, (int) (byte) 10);
        org.joda.time.DateTime dateTime70 = localTime61.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.Chronology chronology71 = dateTime64.getChronology();
        java.lang.String str72 = chronology71.toString();
        java.lang.Object obj73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(obj73);
        org.joda.time.DateTime dateTime76 = dateTime74.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.DateTime dateTime79 = dateTime74.withPeriodAdded(readablePeriod77, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime74.getZone();
        long long83 = dateTimeZone80.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        org.joda.time.Chronology chronology85 = chronology71.withZone(dateTimeZone80);
        mutableDateTime43.setChronology(chronology71);
        org.joda.time.DurationField durationField87 = chronology71.years();
        org.joda.time.DateTimeField dateTimeField88 = chronology71.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime(1646041809688L, chronology71);
        org.joda.time.DateTime dateTime90 = dateTime28.toDateTime(chronology71);
        org.joda.time.DurationField durationField91 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField92 = chronology71.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField87 and durationField91", (durationField87.compareTo(durationField91) == 0) == durationField87.equals(durationField91));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        java.util.Date date29 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromDateFields(date29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        boolean boolean33 = dateTime23.isSupported(dateTimeFieldType31);
        org.joda.time.DateTime dateTime35 = dateTime23.plusHours(11);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withChronology(chronology36);
        org.joda.time.DateMidnight dateMidnight38 = dateTime37.toDateMidnight();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str40 = mutableDateTime1.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        mutableDateTime1.setZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime43", (dateTime5.compareTo(mutableDateTime43) == 0) == dateTime5.equals(mutableDateTime43));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj0 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        int int17 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime16);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withPeriodAdded(readablePeriod22, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology26 = dateTime19.getChronology();
        boolean boolean27 = dateTimeFieldType13.isSupported(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime12.withField(dateTimeFieldType13, 10);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTime dateTime38 = dateTime31.minusMillis(2022);
        int int39 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime41 = dateTime29.withWeekyear((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime44.setWeekyear(3);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime.Property property49 = dateTime48.dayOfMonth();
        org.joda.time.DateTime dateTime50 = property49.withMaximumValue();
        mutableDateTime44.setMillis((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeField dateTimeField52 = null;
        mutableDateTime44.setRounding(dateTimeField52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime44.add(readableDuration54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime44.era();
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime44.add(readableDuration57);
        java.lang.String str59 = mutableDateTime44.toString();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        int int63 = localTime61.compareTo((org.joda.time.ReadablePartial) localTime62);
        java.lang.Object obj64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(obj64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withPeriodAdded(readablePeriod68, (int) (byte) 10);
        org.joda.time.DateTime dateTime71 = localTime62.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Chronology chronology72 = dateTime65.getChronology();
        java.lang.String str73 = chronology72.toString();
        java.lang.Object obj74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(obj74);
        org.joda.time.DateTime dateTime77 = dateTime75.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.DateTime dateTime80 = dateTime75.withPeriodAdded(readablePeriod78, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone81 = dateTime75.getZone();
        long long84 = dateTimeZone81.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime85 = org.joda.time.DateTime.now(dateTimeZone81);
        org.joda.time.Chronology chronology86 = chronology72.withZone(dateTimeZone81);
        mutableDateTime44.setChronology(chronology72);
        org.joda.time.DurationField durationField88 = chronology72.years();
        org.joda.time.DateTimeField dateTimeField89 = chronology72.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime(1646041809688L, chronology72);
        org.joda.time.DateTime dateTime91 = dateTime29.toDateTime(chronology72);
        org.joda.time.DurationField durationField92 = chronology72.weekyears();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate(obj0, chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField88 and durationField92", (durationField88.compareTo(durationField92) == 0) == durationField88.equals(durationField92));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plus(readablePeriod11);
        org.joda.time.Chronology chronology13 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime15", (dateTime1.compareTo(mutableDateTime15) == 0) == dateTime1.equals(mutableDateTime15));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        int int13 = mutableDateTime12.getYearOfCentury();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minusMonths(0);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, dateTimeZone29);
        mutableDateTime12.setZone(dateTimeZone29);
        long long33 = dateTimeZone29.nextTransition(1644573067314L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        java.util.Locale locale16 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMonths(0);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours(0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMinutes((int) (byte) 10);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = localDateTime24.toString("10", locale31);
        java.lang.String str33 = locale16.getDisplayName(locale31);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone14, locale16);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone14, locale36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone38);
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = dateTimeZone38.getShortName((-72064071665819000L), locale41);
        java.util.Locale locale48 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = locale49.getDisplayVariant();
        java.lang.String str51 = locale49.getCountry();
        java.lang.String str52 = locale48.getDisplayVariant(locale49);
        java.lang.String str53 = locale49.getDisplayCountry();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(locale49);
        java.lang.String str55 = dateTimeZone38.getName((long) 12, locale49);
        java.lang.String str56 = locale49.getDisplayName();
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone14, locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar34 and calendar54", (calendar34.compareTo(calendar54) == 0) == calendar34.equals(calendar54));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        int int13 = mutableDateTime12.getYearOfCentury();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minusMonths(0);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, dateTimeZone29);
        mutableDateTime12.setZone(dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        mutableDateTime1.setSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime1.setZoneRetainFields(dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime1.add(readableDuration17, 51);
        mutableDateTime1.add(1646041814162L);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime23.minusMillis(2022);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfYear();
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTime dateTime40 = dateTime33.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str46 = locale44.getScript();
        java.lang.String str47 = dateTimeZone42.getName(1646041809840L, locale44);
        java.util.Calendar calendar48 = dateTime33.toCalendar(locale44);
        boolean boolean49 = property31.equals((java.lang.Object) calendar48);
        org.joda.time.DateTime dateTime50 = property31.getDateTime();
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.plus(readablePeriod52);
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime.Property property56 = dateTime55.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime59 = dateTime55.withField(dateTimeFieldType57, 15);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime62 = dateTime59.withFieldAdded(durationFieldType60, 35408);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime64.setWeekyear(3);
        java.lang.Object obj67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(obj67);
        org.joda.time.DateTime.Property property69 = dateTime68.dayOfMonth();
        org.joda.time.DateTime dateTime70 = property69.withMaximumValue();
        mutableDateTime64.setMillis((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime73 = dateTime70.minusYears((int) (short) 1);
        long long74 = dateTime70.getMillis();
        java.util.Date date75 = dateTime70.toDate();
        org.joda.time.LocalTime localTime76 = org.joda.time.LocalTime.fromDateFields(date75);
        org.joda.time.Chronology chronology77 = localTime76.getChronology();
        boolean boolean78 = durationFieldType60.isSupported(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime53.toMutableDateTime(chronology77);
        mutableDateTime1.setChronology(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and mutableDateTime79", (dateTime30.compareTo(mutableDateTime79) == 0) == dateTime30.equals(mutableDateTime79));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar5.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime15.getZone();
        mutableDateTime11.setZoneRetainFields(dateTimeZone21);
        java.util.TimeZone timeZone23 = dateTimeZone21.toTimeZone();
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        java.util.Locale locale26 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withDurationAdded(readableDuration30, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.minusMonths(0);
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours(0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.minusMinutes((int) (byte) 10);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.lang.String str42 = localDateTime34.toString("10", locale41);
        java.lang.String str43 = locale26.getDisplayName(locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone24, locale26);
        calendar5.setTimeZone(timeZone24);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.Calendar.Builder builder47 = builder4.setTimeZone(timeZone24);
        java.util.Calendar.Builder builder51 = builder47.setWeekDate(35488622, 35452, 2000);
        java.util.Calendar.Builder builder55 = builder47.setDate(35418, 35484, (int) (byte) 10);
        java.util.Calendar.Builder builder59 = builder55.setTimeOfDay((int) 'a', 35506, 2010);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar44", (calendar5.compareTo(calendar44) == 0) == calendar5.equals(calendar44));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withYearOfEra(19);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 8);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.withField(dateTimeFieldType21, 15);
        int int24 = localDateTime14.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology25 = localDateTime14.getChronology();
        int int26 = localDateTime14.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone29.getShortName(1646041814507L, locale32);
        org.joda.time.DateTime dateTime34 = localDateTime14.toDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime30", (dateTime1.compareTo(mutableDateTime30) == 0) == dateTime1.equals(mutableDateTime30));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 35412, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime9.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = dateTimeZone18.getName(1646041809840L, locale20);
        java.util.Calendar calendar24 = dateTime9.toCalendar(locale20);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        java.lang.String str32 = localDate5.toString("09:50:10.643", locale20);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale20);
        java.util.Locale locale34 = locale20.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar33", (calendar24.compareTo(calendar33) == 0) == calendar24.equals(calendar33));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekOfWeekyear(10);
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded((long) 100, 22);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime26 = dateTime24.plusWeeks(0);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime28.setWeekyear(3);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfMonth();
        org.joda.time.DateTime dateTime34 = property33.withMaximumValue();
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeField dateTimeField36 = null;
        mutableDateTime28.setRounding(dateTimeField36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime28.add(readableDuration38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime28.era();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.roundHalfEven();
        int int44 = mutableDateTime43.getWeekOfWeekyear();
        mutableDateTime43.setMonthOfYear(8);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        int int50 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime49);
        java.lang.Object obj51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime57 = dateTime52.withPeriodAdded(readablePeriod55, (int) (byte) 10);
        org.joda.time.DateTime dateTime58 = localTime49.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Chronology chronology59 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.secondOfDay();
        org.joda.time.DurationField durationField61 = chronology59.millis();
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(chronology59);
        org.joda.time.DurationField durationField63 = chronology59.weeks();
        org.joda.time.DateTimeField dateTimeField64 = chronology59.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = dateTimeField64.getType();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime43.property(dateTimeFieldType65);
        boolean boolean67 = dateTime24.isSupported(dateTimeFieldType65);
        org.joda.time.DateTime.Property property68 = dateTime9.property(dateTimeFieldType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.lang.Object obj1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeField dateTimeField14 = null;
        mutableDateTime6.setRounding(dateTimeField14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime6.add(readableDuration16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.era();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime6.add(readableDuration19);
        java.lang.String str21 = mutableDateTime6.toString();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        int int25 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime24);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTime dateTime33 = localTime24.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology34 = dateTime27.getChronology();
        java.lang.String str35 = chronology34.toString();
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime37.getZone();
        long long46 = dateTimeZone43.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.Chronology chronology48 = chronology34.withZone(dateTimeZone43);
        mutableDateTime6.setChronology(chronology34);
        org.joda.time.DurationField durationField50 = chronology34.years();
        org.joda.time.DateTimeField dateTimeField51 = chronology34.secondOfMinute();
        org.joda.time.DateTime dateTime52 = dateTime4.toDateTime(chronology34);
        org.joda.time.DateTime.Property property53 = dateTime52.weekyear();
        org.joda.time.DateTime dateTime54 = property53.roundCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime57.setWeekyear(3);
        java.lang.Object obj60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(obj60);
        org.joda.time.DateTime dateTime63 = dateTime61.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.DateTime dateTime66 = dateTime61.withPeriodAdded(readablePeriod64, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime61.getZone();
        mutableDateTime57.setZoneRetainFields(dateTimeZone67);
        java.util.TimeZone timeZone69 = dateTimeZone67.toTimeZone();
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone69, locale70);
        org.joda.time.DateTime dateTime72 = property53.setCopy("9", locale70);
        java.util.Locale.setDefault(category0, locale70);
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale74.getLanguage();
        java.util.Locale.Category category76 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale77 = java.util.Locale.getDefault(category76);
        java.util.Locale locale78 = java.util.Locale.getDefault(category76);
        java.util.Locale locale79 = java.util.Locale.getDefault(category76);
        java.lang.String str80 = locale74.getDisplayCountry(locale79);
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale79);
        java.util.Locale locale83 = java.util.Locale.getDefault(category0);
        java.util.Locale locale84 = java.util.Locale.ROOT;
        java.lang.String str85 = locale84.getDisplayName();
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(locale84);
        java.util.Locale.setDefault(category0, locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar71 and calendar86", (calendar71.compareTo(calendar86) == 0) == calendar71.equals(calendar86));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.dayOfMonth();
        org.joda.time.Instant instant11 = mutableDateTime1.toInstant();
        int int12 = mutableDateTime1.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant11", (dateTime7.compareTo(instant11) == 0) == dateTime7.equals(instant11));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone13);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone13);
        calendar17.clear();
        long long19 = calendar17.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar16", (calendar15.compareTo(calendar16) == 0) == calendar15.equals(calendar16));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        int int18 = calendar15.getWeekYear();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime24.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone30);
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime35.setWeekyear(3);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField43 = null;
        mutableDateTime35.setRounding(dateTimeField43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime50.getZone();
        mutableDateTime46.setZoneRetainFields(dateTimeZone56);
        mutableDateTime35.setZone(dateTimeZone56);
        java.util.Locale locale60 = java.util.Locale.JAPAN;
        java.lang.String str61 = dateTimeZone56.getShortName((long) 3, locale60);
        long long63 = dateTimeZone30.getMillisKeepLocal(dateTimeZone56, 1L);
        boolean boolean65 = dateTimeZone30.isStandardOffset((long) 232);
        long long67 = dateTimeZone30.convertUTCToLocal((long) (byte) -1);
        java.lang.String str69 = dateTimeZone30.getNameKey(63781638607319L);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) calendar15, dateTimeZone30);
        int int71 = calendar15.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime70", (dateTime5.compareTo(mutableDateTime70) == 0) == dateTime5.equals(mutableDateTime70));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        java.util.Date date18 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean21 = localDate19.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDate localDate23 = localDate19.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int25 = localDate19.indexOf(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime1.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime1.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime30", (dateTime5.compareTo(mutableDateTime30) == 0) == dateTime5.equals(mutableDateTime30));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.setLenient(false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) calendar15);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withDurationAdded(readableDuration22, 31858915);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime24", (dateTime5.compareTo(dateTime24) == 0) == dateTime5.equals(dateTime24));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        java.lang.String str41 = locale39.getScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime15.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology12.withZone(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime28.setWeekyear(3);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        mutableDateTime28.setZoneRetainFields(dateTimeZone38);
        java.lang.String str41 = dateTimeZone38.getNameKey(1646041808949L);
        boolean boolean42 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology43 = chronology26.withZone(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone45);
        int int49 = dateTimeZone45.getOffsetFromLocal((long) 32769);
        org.joda.time.Chronology chronology50 = chronology26.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone52 = chronology50.getZone();
        org.joda.time.DurationField durationField53 = chronology50.eras();
        org.joda.time.DurationField durationField54 = chronology50.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField54, and durationField53", !(durationField53.compareTo(durationField54) == 0) || (Math.signum(durationField53.compareTo(durationField53)) == Math.signum(durationField54.compareTo(durationField53))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime12.setWeekyear(3);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        mutableDateTime1.addWeeks((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setDate((long) 8);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.addWrapField(35434);
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime37 = dateTime34.plusDays(11);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale41.getScript();
        java.lang.String str44 = dateTimeZone39.getName(1646041809840L, locale41);
        int int46 = dateTimeZone39.getStandardOffset((long) (short) 100);
        org.joda.time.DateTime dateTime47 = dateTime37.withZone(dateTimeZone39);
        mutableDateTime32.setZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime47", (dateTime37.compareTo(dateTime47) == 0) == dateTime37.equals(dateTime47));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((-1));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime18.minusSeconds(1902);
        org.joda.time.DateTime dateTime23 = dateTime18.plusDays(19);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime18.plus(readablePeriod24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant19", (dateTime25.compareTo(instant19) == 0) == dateTime25.equals(instant19));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        int int10 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology19 = dateTime12.getChronology();
        boolean boolean20 = dateTimeFieldType6.isSupported(chronology19);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekOfWeekyear();
        org.joda.time.Chronology chronology23 = chronology19.withUTC();
        java.lang.String str24 = chronology23.toString();
        org.joda.time.Chronology chronology25 = chronology23.withUTC();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.weekyearOfCentury();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay(1644573137008L, chronology23);
        mutableDateTime1.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField30 = chronology23.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime12", (mutableDateTime1.compareTo(dateTime12) == 0) == mutableDateTime1.equals(dateTime12));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        int int18 = calendar15.getWeekYear();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime24.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone30);
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime35.setWeekyear(3);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField43 = null;
        mutableDateTime35.setRounding(dateTimeField43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime50.getZone();
        mutableDateTime46.setZoneRetainFields(dateTimeZone56);
        mutableDateTime35.setZone(dateTimeZone56);
        java.util.Locale locale60 = java.util.Locale.JAPAN;
        java.lang.String str61 = dateTimeZone56.getShortName((long) 3, locale60);
        long long63 = dateTimeZone30.getMillisKeepLocal(dateTimeZone56, 1L);
        boolean boolean65 = dateTimeZone30.isStandardOffset((long) 232);
        long long67 = dateTimeZone30.convertUTCToLocal((long) (byte) -1);
        java.lang.String str69 = dateTimeZone30.getNameKey(63781638607319L);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) calendar15, dateTimeZone30);
        int int71 = calendar15.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime70", (dateTime5.compareTo(mutableDateTime70) == 0) == dateTime5.equals(mutableDateTime70));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property9 = dateTime3.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime3.toYearMonthDay();
        boolean boolean12 = dateTime3.isBefore((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime3.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime3.toMutableDateTimeISO();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        int int18 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime.Property property19 = localTime16.minuteOfHour();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime21 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime24 = property19.addCopy(15);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.lang.String str27 = locale26.getDisplayScript();
        org.joda.time.LocalTime localTime28 = property19.setCopy("10", locale26);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime28.withPeriodAdded(readablePeriod29, 46);
        org.joda.time.Chronology chronology32 = localTime28.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.era();
        mutableDateTime14.setRounding(dateTimeField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime34", (dateTime1.compareTo(mutableDateTime34) == 0) == dateTime1.equals(mutableDateTime34));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone11);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone28.toTimeZone();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone30, locale31);
        calendar32.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone39 = calendar32.getTimeZone();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone39);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale41.getDisplayScript();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = locale43.getDisplayScript();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.lang.String str48 = locale43.getDisplayCountry(locale45);
        java.lang.String str49 = locale43.getDisplayName();
        java.lang.String str50 = locale41.getDisplayName(locale43);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone39, locale41);
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.DateTime dateTime55 = dateTime53.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.plus(readablePeriod56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.plus(readableDuration58);
        java.util.Date date65 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.fromDateFields(date65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean68 = localDate66.isSupported(dateTimeFieldType67);
        boolean boolean69 = dateTime59.isSupported(dateTimeFieldType67);
        org.joda.time.DateTime dateTime71 = dateTime59.plusHours(11);
        org.joda.time.DateTime.Property property72 = dateTime59.yearOfEra();
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.lang.String str74 = property72.getAsShortText(locale73);
        java.util.Locale.setDefault(locale73);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone39, locale73);
        gregorianCalendar16.setTimeZone(timeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar40 and calendar51", (calendar40.compareTo(calendar51) == 0) == calendar40.equals(calendar51));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withPeriodAdded(readablePeriod19, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime16.getZone();
        org.joda.time.DateMidnight dateMidnight23 = localDate6.toDateMidnight(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.plus(readableDuration30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        boolean boolean41 = dateTime31.isSupported(dateTimeFieldType39);
        org.joda.time.DateTime dateTime43 = dateTime31.plusHours(11);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.withChronology(chronology44);
        org.joda.time.DateMidnight dateMidnight46 = dateTime45.toDateMidnight();
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        boolean boolean48 = dateTimeZone22.equals((java.lang.Object) instant47);
        long long50 = dateTimeZone22.convertUTCToLocal((long) 35619);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale26.getDisplayCountry(locale28);
        java.lang.String str32 = locale26.getDisplayName();
        java.lang.String str33 = locale24.getDisplayName(locale26);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        java.util.Date date48 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        boolean boolean52 = dateTime42.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime dateTime54 = dateTime42.plusHours(11);
        org.joda.time.DateTime.Property property55 = dateTime42.yearOfEra();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = property55.getAsShortText(locale56);
        java.util.Locale.setDefault(locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone22, locale56);
        java.lang.String str60 = locale56.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar34", (calendar23.compareTo(calendar34) == 0) == calendar23.equals(calendar34));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone14.getShortName(1646041814507L, locale17);
        java.lang.String str20 = dateTimeZone14.getShortName(1644573600000L);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 377, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) dateTime10, dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime15", (dateTime5.compareTo(mutableDateTime15) == 0) == dateTime5.equals(mutableDateTime15));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Calendar calendar8 = builder7.build();
        calendar8.setFirstDayOfWeek(41);
        calendar8.setLenient(false);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime14.setWeekyear(3);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone26, locale27);
        calendar28.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone35 = calendar28.getTimeZone();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.lang.String str38 = locale37.getDisplayScript();
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.lang.String str40 = locale39.getDisplayScript();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Locale locale42 = java.util.Locale.FRENCH;
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.lang.String str44 = locale39.getDisplayCountry(locale41);
        java.lang.String str45 = locale39.getDisplayName();
        java.lang.String str46 = locale37.getDisplayName(locale39);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone35, locale37);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.plus(readablePeriod52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.plus(readableDuration54);
        java.util.Date date61 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.fromDateFields(date61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean64 = localDate62.isSupported(dateTimeFieldType63);
        boolean boolean65 = dateTime55.isSupported(dateTimeFieldType63);
        org.joda.time.DateTime dateTime67 = dateTime55.plusHours(11);
        org.joda.time.DateTime.Property property68 = dateTime55.yearOfEra();
        java.util.Locale locale69 = java.util.Locale.JAPAN;
        java.lang.String str70 = property68.getAsShortText(locale69);
        java.util.Locale.setDefault(locale69);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone35, locale69);
        calendar8.setTimeZone(timeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar36 and calendar47", (calendar36.compareTo(calendar47) == 0) == calendar36.equals(calendar47));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeField dateTimeField26 = null;
        mutableDateTime18.setRounding(dateTimeField26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime18.add(readableDuration28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime18.era();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime18.setZone(dateTimeZone31);
        mutableDateTime18.setMillis((long) 10);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime37.setWeekyear(3);
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfMonth();
        org.joda.time.DateTime dateTime43 = property42.withMaximumValue();
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeField dateTimeField45 = null;
        mutableDateTime37.setRounding(dateTimeField45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime37.add(readableDuration47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime37.era();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime37.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = property50.add((int) ' ');
        mutableDateTime52.add((long) '4');
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) mutableDateTime52);
        int int56 = property16.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Instant instant57 = mutableDateTime18.toInstant();
        mutableDateTime18.addMinutes(903);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and instant57", (mutableDateTime37.compareTo(instant57) == 0) == mutableDateTime37.equals(instant57));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate14 = localDate6.withYearOfCentury((int) 'a');
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        org.joda.time.LocalDate.Property property16 = localDate14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getNameKey(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone28);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime32.toGregorianCalendar();
        mutableDateTime32.addWeekyears(35414);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime38.setWeekyear(3);
        java.lang.Object obj41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj41);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfMonth();
        org.joda.time.DateTime dateTime44 = property43.withMaximumValue();
        mutableDateTime38.setMillis((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeField dateTimeField46 = null;
        mutableDateTime38.setRounding(dateTimeField46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime38.add(readableDuration48);
        mutableDateTime38.setSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime38.setZoneRetainFields(dateTimeZone52);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.now(dateTimeZone52);
        java.lang.String str56 = dateTimeZone52.getNameKey((long) 710);
        boolean boolean57 = dateTimeZone52.isFixed();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime32.toMutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(292278993);
        mutableDateTime32.setZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = localDate14.toDateTimeAtMidnight(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime62", (dateTime22.compareTo(dateTime62) == 0) == dateTime22.equals(dateTime62));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.setSecondOfDay(4);
        mutableDateTime1.setMillisOfDay(590);
        mutableDateTime1.setMillisOfDay(17);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, (int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime13.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale24.getScript();
        java.lang.String str27 = dateTimeZone22.getName(1646041809840L, locale24);
        java.util.Calendar calendar28 = dateTime13.toCalendar(locale24);
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.lang.String str30 = locale29.getDisplayScript();
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale29.getDisplayCountry(locale31);
        java.lang.String str35 = locale24.getDisplayCountry(locale29);
        java.util.Calendar calendar36 = mutableDateTime1.toCalendar(locale29);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime38.setWeekyear(3);
        java.lang.Object obj41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj41);
        org.joda.time.DateTime dateTime44 = dateTime42.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime42.withPeriodAdded(readablePeriod45, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime42.getZone();
        mutableDateTime38.setZoneRetainFields(dateTimeZone48);
        java.util.TimeZone timeZone50 = dateTimeZone48.toTimeZone();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone50, locale51);
        calendar52.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone59 = calendar52.getTimeZone();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone59);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone59);
        calendar36.setTimeZone(timeZone59);
        boolean boolean63 = calendar36.isWeekDateSupported();
        calendar36.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar60", (calendar28.compareTo(calendar60) == 0) == calendar28.equals(calendar60));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        mutableDateTime21.setZone(dateTimeZone42);
        mutableDateTime21.addWeeks((int) (byte) -1);
        boolean boolean47 = dateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant48 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime61.setWeekyear(3);
        java.lang.Object obj64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(obj64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withPeriodAdded(readablePeriod68, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime65.getZone();
        mutableDateTime61.setZoneRetainFields(dateTimeZone71);
        mutableDateTime50.setZone(dateTimeZone71);
        java.lang.Object obj75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(obj75);
        org.joda.time.DateTime dateTime78 = dateTime76.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime80 = dateTime78.plus(readablePeriod79);
        org.joda.time.DateTime dateTime82 = dateTime80.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfMonth();
        org.joda.time.DateTime dateTime85 = property83.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime86 = property83.getDateTime();
        java.util.Locale locale87 = java.util.Locale.ITALY;
        java.lang.String str88 = property83.getAsText(locale87);
        java.lang.String str89 = dateTimeZone71.getShortName((long) 232, locale87);
        org.joda.time.DateTime dateTime90 = instant48.toDateTime(dateTimeZone71);
        org.joda.time.DateTime.Property property91 = dateTime90.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant48", (mutableDateTime21.compareTo(instant48) == 0) == mutableDateTime21.equals(instant48));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withYearOfEra(19);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 8);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.LocalDateTime localDateTime20 = dateTime19.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.minusMonths(0);
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusSeconds(2);
        int int29 = localDateTime28.getDayOfWeek();
        java.lang.String str30 = localDateTime28.toString();
        int int31 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology32 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DurationField durationField34 = chronology32.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, 53);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeField dateTimeField15 = null;
        mutableDateTime7.setRounding(dateTimeField15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime7.add(readableDuration17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime7.era();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime7.add(readableDuration20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime7.weekyear();
        org.joda.time.Instant instant23 = mutableDateTime7.toInstant();
        boolean boolean24 = dateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant2", (dateTime5.compareTo(instant2) == 0) == dateTime5.equals(instant2));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) ' ');
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeField dateTimeField19 = null;
        mutableDateTime11.setRounding(dateTimeField19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime11.add(readableDuration21);
        mutableDateTime11.setSecondOfMinute((int) ' ');
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        long long29 = dateTimeZone26.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime31.setWeekyear(3);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime35.getZone();
        mutableDateTime31.setZoneRetainFields(dateTimeZone41);
        long long44 = dateTimeZone26.getMillisKeepLocal(dateTimeZone41, (long) 35408);
        java.lang.String str46 = dateTimeZone26.getNameKey((long) 22);
        mutableDateTime11.setZone(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime49.setWeekyear(3);
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.DateTime dateTime55 = dateTime53.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime58 = dateTime53.withPeriodAdded(readablePeriod56, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = dateTime53.getZone();
        mutableDateTime49.setZoneRetainFields(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone59);
        long long63 = dateTimeZone26.getMillisKeepLocal(dateTimeZone59, (long) 35470);
        long long66 = dateTimeZone59.adjustOffset(0L, true);
        org.joda.time.DateTime dateTime67 = dateTime8.toDateTime(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime31", (instant6.compareTo(mutableDateTime31) == 0) == instant6.equals(mutableDateTime31));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.centuryOfEra();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DurationField durationField18 = chronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField18, and durationField16", !(durationField16.compareTo(durationField18) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField18.compareTo(durationField16))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Calendar.Builder builder7 = builder4.setLocale(locale5);
        java.util.Calendar.Builder builder11 = builder4.setWeekDate(2000, 24, 6);
        java.util.Calendar.Builder builder13 = builder11.setLenient(true);
        java.util.Calendar.Builder builder17 = builder11.setWeekDate(209, 0, 42);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime19.setWeekyear(3);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime23.getZone();
        mutableDateTime19.setZoneRetainFields(dateTimeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        java.util.Locale locale34 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.LocalDateTime localDateTime37 = dateTime36.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withDurationAdded(readableDuration38, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.minusMonths(0);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours(0);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.minusMinutes((int) (byte) 10);
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = localDateTime42.toString("10", locale49);
        java.lang.String str51 = locale34.getDisplayName(locale49);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone32, locale34);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.util.Locale locale54 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone32, locale54);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone32);
        java.util.Calendar.Builder builder57 = builder11.setTimeZone(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar52 and calendar56", (calendar52.compareTo(calendar56) == 0) == calendar52.equals(calendar56));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        java.lang.String str13 = chronology12.toString();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withPeriodAdded(readablePeriod18, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime15.getZone();
        long long24 = dateTimeZone21.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology12.withZone(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime28.setWeekyear(3);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withPeriodAdded(readablePeriod35, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime32.getZone();
        mutableDateTime28.setZoneRetainFields(dateTimeZone38);
        java.lang.String str41 = dateTimeZone38.getNameKey(1646041808949L);
        boolean boolean42 = dateTimeZone38.isFixed();
        org.joda.time.Chronology chronology43 = chronology26.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField44 = chronology43.millis();
        org.joda.time.DurationField durationField45 = chronology43.months();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology43.weeks();
        org.joda.time.DurationField durationField48 = chronology43.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField44, and durationField45", !(durationField48.compareTo(durationField44) == 0) || (Math.signum(durationField48.compareTo(durationField45)) == Math.signum(durationField44.compareTo(durationField45))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        int int13 = mutableDateTime12.getYearOfCentury();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withDurationAdded(readableDuration17, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minusMonths(0);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minusHours(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, dateTimeZone29);
        mutableDateTime12.setZone(dateTimeZone29);
        long long33 = dateTimeZone29.nextTransition(1646049600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-28T09:52:07.491Z");
        org.joda.time.DateTime dateTime2 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.era();
        int int5 = localDateTime3.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusMonths(14);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.plusMillis((int) (short) 1);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime17 = dateTime13.withField(dateTimeFieldType15, 15);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime20 = dateTime17.withFieldAdded(durationFieldType18, 35408);
        org.joda.time.DateTime dateTime21 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withSecondOfMinute(23);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        long long27 = dateTimeZone24.adjustOffset((long) 32972925, false);
        org.joda.time.DateTime dateTime28 = dateTime1.toDateTime(dateTimeZone24);
        java.util.Locale locale33 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale34.getDisplayVariant();
        java.lang.String str36 = locale34.getCountry();
        java.lang.String str37 = locale33.getDisplayVariant(locale34);
        java.util.Calendar.Builder builder38 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder40 = builder38.setInstant((long) 35412);
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("09:50:19.500");
        java.util.Calendar.Builder builder43 = builder40.setLocale(locale42);
        java.util.Calendar.Builder builder47 = builder43.setWeekDate(0, 100, 1997);
        java.util.Calendar.Builder builder49 = builder47.setLenient(false);
        java.util.Calendar.Builder builder53 = builder49.setTimeOfDay((int) (byte) 0, 35452018, 365);
        java.util.Locale locale54 = java.util.Locale.JAPANESE;
        java.util.Locale locale55 = java.util.Locale.ROOT;
        java.lang.String str56 = locale55.getDisplayScript();
        java.util.Locale locale57 = java.util.Locale.ROOT;
        java.util.Locale locale58 = java.util.Locale.FRENCH;
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.lang.String str60 = locale55.getDisplayCountry(locale57);
        java.lang.String str61 = locale55.getDisplayName();
        java.lang.String str62 = locale54.getDisplayLanguage(locale55);
        java.util.Calendar.Builder builder63 = builder49.setLocale(locale54);
        java.lang.String str64 = locale34.getDisplayVariant(locale54);
        java.lang.String str65 = dateTimeZone24.getShortName(1646041818754L, locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime28", (dateTime1.compareTo(dateTime28) == 0) == dateTime1.equals(dateTime28));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        java.util.Locale locale16 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMonths(0);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours(0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMinutes((int) (byte) 10);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = localDateTime24.toString("10", locale31);
        java.lang.String str33 = locale16.getDisplayName(locale31);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone14, locale16);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale16);
        java.util.Date date36 = calendar35.getTime();
        int int37 = date36.getDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar34 and calendar35", (calendar34.compareTo(calendar35) == 0) == calendar34.equals(calendar35));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime11.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale22.getScript();
        java.lang.String str25 = dateTimeZone20.getName(1646041809840L, locale22);
        java.util.Calendar calendar26 = dateTime11.toCalendar(locale22);
        boolean boolean27 = property9.equals((java.lang.Object) calendar26);
        org.joda.time.DateTime dateTime28 = property9.getDateTime();
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readablePeriod30);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime37 = dateTime33.withField(dateTimeFieldType35, 15);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime40 = dateTime37.withFieldAdded(durationFieldType38, 35408);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime42.setWeekyear(3);
        java.lang.Object obj45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfMonth();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        mutableDateTime42.setMillis((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = dateTime48.minusYears((int) (short) 1);
        long long52 = dateTime48.getMillis();
        java.util.Date date53 = dateTime48.toDate();
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromDateFields(date53);
        org.joda.time.Chronology chronology55 = localTime54.getChronology();
        boolean boolean56 = durationFieldType38.isSupported(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime31.toMutableDateTime(chronology55);
        int int58 = dateTime31.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and mutableDateTime57", (dateTime31.compareTo(mutableDateTime57) == 0) == dateTime31.equals(mutableDateTime57));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale26.getDisplayCountry(locale28);
        java.lang.String str32 = locale26.getDisplayName();
        java.lang.String str33 = locale24.getDisplayName(locale26);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        java.util.Date date48 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        boolean boolean52 = dateTime42.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime dateTime54 = dateTime42.plusHours(11);
        org.joda.time.DateTime.Property property55 = dateTime42.yearOfEra();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = property55.getAsShortText(locale56);
        java.util.Locale.setDefault(locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone22, locale56);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar34", (calendar23.compareTo(calendar34) == 0) == calendar23.equals(calendar34));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.setLenient(false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) calendar15);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTimeISO();
        int int21 = mutableDateTime20.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime19", (dateTime5.compareTo(dateTime19) == 0) == dateTime5.equals(dateTime19));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime7 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime5.toInstant();
        boolean boolean10 = dateTime5.equals((java.lang.Object) "java.util.GregorianCalendar[time=1644573030878,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=50,SECOND=30,MILLISECOND=878,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant8", (dateTime5.compareTo(instant8) == 0) == dateTime5.equals(instant8));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 377, dateTimeZone12);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readablePeriod23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.plus(readableDuration25);
        java.util.Date date32 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromDateFields(date32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean35 = localDate33.isSupported(dateTimeFieldType34);
        boolean boolean36 = dateTime26.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime38 = dateTime26.plusHours(11);
        org.joda.time.DateTime.Property property39 = dateTime38.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.year();
        int int41 = dateTime38.get(dateTimeFieldType40);
        org.joda.time.DateTime.Property property42 = dateTime38.weekOfWeekyear();
        org.joda.time.DateTime dateTime44 = property42.addToCopy((long) 35408);
        org.joda.time.DateTime dateTime45 = property42.withMinimumValue();
        org.joda.time.DateTime dateTime47 = dateTime45.minusWeeks(969);
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone49);
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant51", (dateTime6.compareTo(instant51) == 0) == dateTime6.equals(instant51));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.minuteOfDay();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale2);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.getLanguage();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone5, locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar7", (calendar4.compareTo(calendar7) == 0) == calendar4.equals(calendar7));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.dayOfMonth();
        org.joda.time.Instant instant11 = mutableDateTime1.toInstant();
        mutableDateTime1.setWeekyear(35434);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant11", (dateTime7.compareTo(instant11) == 0) == dateTime7.equals(instant11));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        int int5 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime4);
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.withPeriodAdded(readablePeriod10, (int) (byte) 10);
        org.joda.time.DateTime dateTime13 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology14 = dateTime7.getChronology();
        boolean boolean15 = dateTimeFieldType1.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.yearOfCentury();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1646041848042L, chronology14);
        java.lang.String str19 = localTime18.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(100);
        int int23 = dateTimeZone21.getOffset(1648461009000L);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        int int26 = dateTimeZone21.getOffset((long) 31951127);
        org.joda.time.DateTime dateTime27 = localTime18.toDateTimeToday(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime24", (dateTime7.compareTo(mutableDateTime24) == 0) == dateTime7.equals(mutableDateTime24));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        mutableDateTime21.setZone(dateTimeZone42);
        mutableDateTime21.addWeeks((int) (byte) -1);
        boolean boolean47 = dateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant48 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime61.setWeekyear(3);
        java.lang.Object obj64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(obj64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withPeriodAdded(readablePeriod68, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime65.getZone();
        mutableDateTime61.setZoneRetainFields(dateTimeZone71);
        mutableDateTime50.setZone(dateTimeZone71);
        java.lang.Object obj75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(obj75);
        org.joda.time.DateTime dateTime78 = dateTime76.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime80 = dateTime78.plus(readablePeriod79);
        org.joda.time.DateTime dateTime82 = dateTime80.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfMonth();
        org.joda.time.DateTime dateTime85 = property83.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime86 = property83.getDateTime();
        java.util.Locale locale87 = java.util.Locale.ITALY;
        java.lang.String str88 = property83.getAsText(locale87);
        java.lang.String str89 = dateTimeZone71.getShortName((long) 232, locale87);
        org.joda.time.DateTime dateTime90 = instant48.toDateTime(dateTimeZone71);
        org.joda.time.LocalDate localDate91 = org.joda.time.LocalDate.now(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant48", (mutableDateTime21.compareTo(instant48) == 0) == mutableDateTime21.equals(instant48));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.copy();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundHalfFloorCopy();
        java.lang.String str18 = property15.getAsText();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeField dateTimeField28 = null;
        mutableDateTime20.setRounding(dateTimeField28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime20.add(readableDuration30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime20.era();
        java.lang.String str33 = property32.getName();
        org.joda.time.DateTimeField dateTimeField34 = property32.getField();
        long long37 = dateTimeField34.addWrapField((long) 10, (int) (short) -1);
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = locale38.toLanguageTag();
        int int40 = dateTimeField34.getMaximumShortTextLength(locale38);
        int int41 = property15.getMaximumTextLength(locale38);
        java.util.Calendar calendar42 = mutableDateTime1.toCalendar(locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime13", (mutableDateTime11.compareTo(mutableDateTime13) == 0) == mutableDateTime11.equals(mutableDateTime13));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.Instant instant13 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime5.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        long long19 = dateTimeZone16.convertLocalToUTC((long) 11, true);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime7.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra(25);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeField dateTimeField33 = null;
        mutableDateTime25.setRounding(dateTimeField33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime25.add(readableDuration35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime25.era();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime25.millisOfDay();
        org.joda.time.Chronology chronology39 = mutableDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.millisOfSecond();
        org.joda.time.Chronology chronology43 = chronology39.withUTC();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime21.toMutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime44", (mutableDateTime1.compareTo(mutableDateTime44) == 0) == mutableDateTime1.equals(mutableDateTime44));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale26.getDisplayCountry(locale28);
        java.lang.String str32 = locale26.getDisplayName();
        java.lang.String str33 = locale24.getDisplayName(locale26);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        java.util.Locale locale38 = new java.util.Locale("2022-02-28T09:51:00.686Z", "2022-02-11T09:53:20.131Z", "1970-01-03T09:52:06.358Z");
        java.lang.String str39 = locale24.getDisplayName(locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar34", (calendar23.compareTo(calendar34) == 0) == calendar23.equals(calendar34));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        boolean boolean14 = localDateTime12.isSupported(durationFieldType13);
        boolean boolean15 = localDateTime10.isSupported(durationFieldType13);
        boolean boolean16 = localDateTime9.isSupported(durationFieldType13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusDays(97);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) 'u');
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis(35411);
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime29);
        boolean boolean31 = localDateTime23.equals((java.lang.Object) dateTime29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime33.setWeekyear(3);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfMonth();
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeField dateTimeField41 = null;
        mutableDateTime33.setRounding(dateTimeField41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime33.add(readableDuration43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime33.era();
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime33.add(readableDuration46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime33.year();
        mutableDateTime33.addDays((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(48);
        mutableDateTime33.setZone(dateTimeZone52);
        long long55 = dateTimeZone52.nextTransition((long) '4');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone52.getName((long) 1252, locale57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime29.toMutableDateTime(dateTimeZone52);
        long long61 = dateTimeZone52.convertUTCToLocal(1644573303313L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime59", (dateTime29.compareTo(mutableDateTime59) == 0) == dateTime29.equals(mutableDateTime59));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        boolean boolean14 = localDateTime12.isSupported(durationFieldType13);
        boolean boolean15 = localDateTime10.isSupported(durationFieldType13);
        boolean boolean16 = localDateTime9.isSupported(durationFieldType13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.year();
        int int20 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime9.plusSeconds(35473325);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime9.minus(readableDuration23);
        java.lang.String str25 = localDateTime9.toString();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.parse("2022-02-28T09:50:16.644Z");
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28);
        mutableDateTime27.addWeeks(35447363);
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        boolean boolean33 = localDateTime9.equals((java.lang.Object) dateTime32);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        boolean boolean38 = dateTime37.isEqualNow();
        org.joda.time.DateTime dateTime40 = dateTime37.withWeekOfWeekyear(10);
        org.joda.time.DateTime.Property property41 = dateTime37.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfMonth();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        mutableDateTime43.setMillis((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeField dateTimeField51 = null;
        mutableDateTime43.setRounding(dateTimeField51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime43.add(readableDuration53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.era();
        java.lang.String str56 = property55.getName();
        org.joda.time.MutableDateTime mutableDateTime57 = property55.roundHalfEven();
        long long58 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime57);
        mutableDateTime57.addWeekyears(10299894);
        org.joda.time.DateTimeField dateTimeField61 = mutableDateTime57.getRoundingField();
        boolean boolean62 = dateTime32.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.Instant instant63 = mutableDateTime57.toInstant();
        java.util.Date date64 = mutableDateTime57.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime57 and instant63", (mutableDateTime57.compareTo(instant63) == 0) == mutableDateTime57.equals(instant63));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.DurationField durationField16 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone13);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone13);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDate localDate28 = localDate24.withEra(0);
        org.joda.time.LocalDate localDate30 = localDate24.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate localDate32 = localDate24.withWeekOfWeekyear(9);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.millisOfDay();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) calendar17, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime35", (dateTime5.compareTo(dateTime35) == 0) == dateTime5.equals(dateTime35));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        mutableDateTime21.setZone(dateTimeZone42);
        mutableDateTime21.addWeeks((int) (byte) -1);
        boolean boolean47 = dateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant48 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime61.setWeekyear(3);
        java.lang.Object obj64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(obj64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withPeriodAdded(readablePeriod68, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime65.getZone();
        mutableDateTime61.setZoneRetainFields(dateTimeZone71);
        mutableDateTime50.setZone(dateTimeZone71);
        java.lang.Object obj75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(obj75);
        org.joda.time.DateTime dateTime78 = dateTime76.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime80 = dateTime78.plus(readablePeriod79);
        org.joda.time.DateTime dateTime82 = dateTime80.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfMonth();
        org.joda.time.DateTime dateTime85 = property83.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime86 = property83.getDateTime();
        java.util.Locale locale87 = java.util.Locale.ITALY;
        java.lang.String str88 = property83.getAsText(locale87);
        java.lang.String str89 = dateTimeZone71.getShortName((long) 232, locale87);
        org.joda.time.DateTime dateTime90 = instant48.toDateTime(dateTimeZone71);
        int int91 = dateTime90.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant48", (mutableDateTime21.compareTo(instant48) == 0) == mutableDateTime21.equals(instant48));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear(31915440);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withPivotYear(35419);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear(0);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime14.setWeekyear(3);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone26, locale27);
        int int30 = calendar28.getLeastMaximum(15);
        int int31 = calendar28.getWeekYear();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime33.setWeekyear(3);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime37.getZone();
        mutableDateTime33.setZoneRetainFields(dateTimeZone43);
        java.util.TimeZone timeZone45 = dateTimeZone43.toTimeZone();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime48.setWeekyear(3);
        java.lang.Object obj51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj51);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfMonth();
        org.joda.time.DateTime dateTime54 = property53.withMaximumValue();
        mutableDateTime48.setMillis((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTimeField dateTimeField56 = null;
        mutableDateTime48.setRounding(dateTimeField56);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime59.setWeekyear(3);
        java.lang.Object obj62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj62);
        org.joda.time.DateTime dateTime65 = dateTime63.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.DateTime dateTime68 = dateTime63.withPeriodAdded(readablePeriod66, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime63.getZone();
        mutableDateTime59.setZoneRetainFields(dateTimeZone69);
        mutableDateTime48.setZone(dateTimeZone69);
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.lang.String str74 = dateTimeZone69.getShortName((long) 3, locale73);
        long long76 = dateTimeZone43.getMillisKeepLocal(dateTimeZone69, 1L);
        boolean boolean78 = dateTimeZone43.isStandardOffset((long) 232);
        long long80 = dateTimeZone43.convertUTCToLocal((long) (byte) -1);
        java.lang.String str82 = dateTimeZone43.getNameKey(63781638607319L);
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime((java.lang.Object) calendar28, dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter10.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime83", (dateTime18.compareTo(mutableDateTime83) == 0) == dateTime18.equals(mutableDateTime83));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears((int) (short) 1);
        long long11 = dateTime7.getMillis();
        java.util.Date date12 = dateTime7.toDate();
        org.joda.time.DateTime.Property property13 = dateTime7.year();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        int int18 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime17);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withPeriodAdded(readablePeriod23, (int) (byte) 10);
        org.joda.time.DateTime dateTime26 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology27 = dateTime20.getChronology();
        java.lang.String str28 = chronology27.toString();
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime30.getZone();
        long long39 = dateTimeZone36.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.Chronology chronology41 = chronology27.withZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime47.getZone();
        mutableDateTime43.setZoneRetainFields(dateTimeZone53);
        java.lang.String str56 = dateTimeZone53.getNameKey(1646041808949L);
        boolean boolean57 = dateTimeZone53.isFixed();
        org.joda.time.Chronology chronology58 = chronology41.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField59 = chronology58.millis();
        org.joda.time.DurationField durationField60 = chronology58.months();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) 377, chronology58);
        org.joda.time.DateTime dateTime63 = dateTime7.toDateTime(chronology58);
        org.joda.time.DurationField durationField64 = chronology58.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField59, and durationField60", !(durationField64.compareTo(durationField59) == 0) || (Math.signum(durationField64.compareTo(durationField60)) == Math.signum(durationField59.compareTo(durationField60))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime13", (mutableDateTime11.compareTo(mutableDateTime13) == 0) == mutableDateTime11.equals(mutableDateTime13));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate6.plus(readablePeriod13);
        int int15 = localDate6.size();
        int int16 = localDate6.size();
        org.joda.time.LocalDate.Property property17 = localDate6.era();
        org.joda.time.LocalDate localDate18 = property17.roundFloorCopy();
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.millisOfSecond();
        int int30 = mutableDateTime21.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime21.add(readableDuration31);
        mutableDateTime21.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 35412, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime21.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = localDate18.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = dateTime40.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime43", (dateTime25.compareTo(mutableDateTime43) == 0) == dateTime25.equals(mutableDateTime43));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime1.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology29 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.secondOfDay();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology29);
        org.joda.time.DurationField durationField33 = chronology29.weeks();
        org.joda.time.DateTimeField dateTimeField34 = chronology29.clockhourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField34.getType();
        int int36 = mutableDateTime1.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime1.era();
        org.joda.time.Instant instant38 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant38", (dateTime7.compareTo(instant38) == 0) == dateTime7.equals(instant38));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime7 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant8 = dateTime5.toInstant();
        int int9 = dateTime5.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant8", (dateTime5.compareTo(instant8) == 0) == dateTime5.equals(instant8));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getActualMaximum(6);
        boolean boolean18 = calendar15.isWeekDateSupported();
        calendar15.setFirstDayOfWeek((int) (byte) 0);
        java.lang.String str21 = calendar15.getCalendarType();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar37", (calendar15.compareTo(calendar37) == 0) == calendar15.equals(calendar37));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.Instant instant13 = dateTime5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(33);
        org.joda.time.MutableDateTime mutableDateTime16 = instant13.toMutableDateTime(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime16.add(readablePeriod17, 35417252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.Date date6 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate localDate11 = localDate7.withEra(0);
        org.joda.time.LocalDate localDate13 = localDate7.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate7.plus(readablePeriod14);
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withPeriodAdded(readablePeriod20, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime17.getZone();
        org.joda.time.DateMidnight dateMidnight24 = localDate7.toDateMidnight(dateTimeZone23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readablePeriod29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.plus(readableDuration31);
        java.util.Date date38 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.fromDateFields(date38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean41 = localDate39.isSupported(dateTimeFieldType40);
        boolean boolean42 = dateTime32.isSupported(dateTimeFieldType40);
        org.joda.time.DateTime dateTime44 = dateTime32.plusHours(11);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withChronology(chronology45);
        org.joda.time.DateMidnight dateMidnight47 = dateTime46.toDateMidnight();
        org.joda.time.Instant instant48 = dateMidnight47.toInstant();
        boolean boolean49 = dateTimeZone23.equals((java.lang.Object) instant48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 68460865, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight47 and instant48", (dateMidnight47.compareTo(instant48) == 0) == dateMidnight47.equals(instant48));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        long long14 = dateTimeZone3.adjustOffset(1646042007320L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.DurationField durationField16 = chronology13.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime5.setWeekyear(3);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime5.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime5.add(readableDuration15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.era();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime5.add(readableDuration18);
        java.lang.String str20 = mutableDateTime5.toString();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        java.lang.String str34 = chronology33.toString();
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        long long45 = dateTimeZone42.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology33.withZone(dateTimeZone42);
        mutableDateTime5.setChronology(chronology33);
        org.joda.time.DurationField durationField49 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology33.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime3.toDateTime(chronology33);
        int int52 = dateTime51.getWeekOfWeekyear();
        java.lang.String str53 = dateTime51.toString();
        org.joda.time.Instant instant54 = dateTime51.toInstant();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime51.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant54", (dateTime51.compareTo(instant54) == 0) == dateTime51.equals(instant54));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(2022);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime5.setWeekyear(3);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime5.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime5.add(readableDuration15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.era();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime5.add(readableDuration18);
        java.lang.String str20 = mutableDateTime5.toString();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        java.lang.String str34 = chronology33.toString();
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        long long45 = dateTimeZone42.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone42);
        org.joda.time.Chronology chronology47 = chronology33.withZone(dateTimeZone42);
        mutableDateTime5.setChronology(chronology33);
        org.joda.time.DurationField durationField49 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology33.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime3.toDateTime(chronology33);
        org.joda.time.DurationField durationField52 = chronology33.minutes();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(chronology33);
        long long57 = chronology33.add((-61824297600000L), 1648461009000L, 1);
        org.joda.time.DurationField durationField58 = chronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField49, and durationField52", !(durationField58.compareTo(durationField49) == 0) || (Math.signum(durationField58.compareTo(durationField52)) == Math.signum(durationField49.compareTo(durationField52))));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.setLenient(false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) calendar15);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        int int24 = localDateTime22.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMonths(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean30 = localDateTime22.isSupported(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.eras();
        boolean boolean33 = localDateTime31.isSupported(durationFieldType32);
        boolean boolean34 = localDateTime22.isSupported(durationFieldType32);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.LocalDateTime localDateTime37 = dateTime36.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withDurationAdded(readableDuration38, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.minusMonths(0);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.plus(readablePeriod46);
        org.joda.time.Chronology chronology48 = localDateTime42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        boolean boolean50 = durationFieldType32.isSupported(chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime52.setWeekyear(3);
        java.lang.Object obj55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(obj55);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfMonth();
        org.joda.time.DateTime dateTime58 = property57.withMaximumValue();
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeField dateTimeField60 = null;
        mutableDateTime52.setRounding(dateTimeField60);
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutableDateTime52.add(readableDuration62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime52.era();
        org.joda.time.ReadableDuration readableDuration65 = null;
        mutableDateTime52.add(readableDuration65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime52.year();
        mutableDateTime52.addDays((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHours(48);
        mutableDateTime52.setZone(dateTimeZone71);
        long long74 = dateTimeZone71.nextTransition((long) '4');
        org.joda.time.Chronology chronology75 = chronology48.withZone(dateTimeZone71);
        org.joda.time.DateTime dateTime76 = dateTime21.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime21", (dateTime5.compareTo(dateTime21) == 0) == dateTime5.equals(dateTime21));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.minuteOfDay();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = dateTime0.toCalendar(locale2);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar7", (calendar4.compareTo(calendar7) == 0) == calendar4.equals(calendar7));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(10L);
        int int14 = localTime13.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalTime localTime17 = localTime13.withFieldAdded(durationFieldType15, (int) 'x');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DurationField durationField22 = durationFieldType15.getField(chronology20);
        mutableDateTime10.setChronology(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plus(readablePeriod11);
        org.joda.time.Chronology chronology13 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        long long18 = dateTimeZone15.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime24.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone30);
        long long33 = dateTimeZone15.getMillisKeepLocal(dateTimeZone30, (long) 35408);
        java.lang.String str35 = dateTimeZone30.getShortName((long) (byte) 0);
        org.joda.time.Chronology chronology36 = chronology13.withZone(dateTimeZone30);
        java.lang.String str37 = chronology36.toString();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField39 = chronology36.minutes();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = chronology36.add(readablePeriod40, 79660800249L, (-27409554));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField39", (durationField14.compareTo(durationField39) == 0) == durationField14.equals(durationField39));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundFloorCopy();
        boolean boolean20 = dateTime18.isBefore((long) 35435247);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = property24.addWrapFieldToCopy(12);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.era();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusWeeks((int) (short) 1);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime18.toDateTime(chronology30);
        java.util.Date date37 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean40 = localDate38.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDate localDate42 = localDate38.withEra(0);
        org.joda.time.LocalDate localDate44 = localDate38.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property45 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate46 = property45.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate48 = localDate46.withEra(1);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology50 = null;
        boolean boolean51 = durationFieldType49.isSupported(chronology50);
        java.lang.String str52 = durationFieldType49.toString();
        boolean boolean53 = localDate48.isSupported(durationFieldType49);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(100L);
        int int56 = localDate48.compareTo((org.joda.time.ReadablePartial) localDate55);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = localDate55.getFieldTypes();
        int int58 = localDate55.getDayOfWeek();
        org.joda.time.LocalDate.Property property59 = localDate55.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime62.setWeekyear(3);
        java.lang.Object obj65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(obj65);
        org.joda.time.DateTime dateTime68 = dateTime66.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.DateTime dateTime71 = dateTime66.withPeriodAdded(readablePeriod69, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime66.getZone();
        mutableDateTime62.setZoneRetainFields(dateTimeZone72);
        java.util.TimeZone timeZone74 = dateTimeZone72.toTimeZone();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate(dateTimeZone72);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate(10L, dateTimeZone72);
        int int78 = dateTimeZone72.getOffset((long) 58);
        org.joda.time.DateMidnight dateMidnight79 = localDate55.toDateMidnight(dateTimeZone72);
        org.joda.time.Chronology chronology80 = chronology30.withZone(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime31", (dateTime18.compareTo(dateTime31) == 0) == dateTime18.equals(dateTime31));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.fromCalendarFields(calendar40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.Instant instant13 = dateTime5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(33);
        org.joda.time.MutableDateTime mutableDateTime16 = instant13.toMutableDateTime(dateTimeZone15);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant13", (dateTime5.compareTo(instant13) == 0) == dateTime5.equals(instant13));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate localDate14 = property11.setCopy((int) (byte) 10);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears(0);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate.Property property18 = localDate16.dayOfMonth();
        org.joda.time.LocalDate localDate19 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight23 = localDate19.toDateMidnight(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        long long29 = dateTimeZone26.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime31.setWeekyear(3);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime35.getZone();
        mutableDateTime31.setZoneRetainFields(dateTimeZone41);
        long long44 = dateTimeZone26.getMillisKeepLocal(dateTimeZone41, (long) 35408);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 4, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((-50591052511272L), dateTimeZone26);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight23, dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and mutableDateTime27", (mutableDateTime22.compareTo(mutableDateTime27) == 0) == mutableDateTime22.equals(mutableDateTime27));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate6.plusMonths((int) (byte) -1);
        int int13 = localDate12.getWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate12.year();
        org.joda.time.LocalDate localDate15 = property14.withMinimumValue();
        int int16 = localDate15.getDayOfMonth();
        org.joda.time.LocalDate localDate18 = localDate15.minusMonths(35444867);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime.Property property21 = dateTime19.minuteOfHour();
        java.util.Date date27 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromDateFields(date27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean30 = localDate28.isSupported(dateTimeFieldType29);
        org.joda.time.LocalDate localDate32 = localDate28.withEra(0);
        org.joda.time.LocalDate localDate34 = localDate32.plusMonths(11);
        java.util.Date date35 = localDate34.toDate();
        org.joda.time.LocalDate.Property property36 = localDate34.centuryOfEra();
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.halfdayOfDay();
        java.lang.String str39 = chronology37.toString();
        org.joda.time.DurationField durationField40 = chronology37.minutes();
        org.joda.time.DateTime dateTime41 = dateTime19.withChronology(chronology37);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime41", (dateTime19.compareTo(dateTime41) == 0) == dateTime19.equals(dateTime41));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = dateTime16.plusWeeks((int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        int int24 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, (int) (byte) 10);
        org.joda.time.DateTime dateTime32 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        boolean boolean34 = dateTimeFieldType20.isSupported(chronology33);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekOfWeekyear();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime16, chronology37);
        org.joda.time.DurationField durationField39 = chronology37.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime38", (mutableDateTime1.compareTo(dateTime38) == 0) == mutableDateTime1.equals(dateTime38));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.nextTransition((long) 35417252);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime5.setWeekyear(3);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime5.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime5.add(readableDuration15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime5.add(readableDuration17, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime5.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime5.property(dateTimeFieldType21);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) property22);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        int int28 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime27);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime36 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Chronology chronology37 = dateTime30.getChronology();
        java.lang.String str38 = chronology37.toString();
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        long long49 = dateTimeZone46.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.Chronology chronology51 = chronology37.withZone(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime53.setWeekyear(3);
        java.lang.Object obj56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj56);
        org.joda.time.DateTime dateTime59 = dateTime57.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.withPeriodAdded(readablePeriod60, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone63 = dateTime57.getZone();
        mutableDateTime53.setZoneRetainFields(dateTimeZone63);
        java.lang.String str66 = dateTimeZone63.getNameKey(1646041808949L);
        boolean boolean67 = dateTimeZone63.isFixed();
        org.joda.time.Chronology chronology68 = chronology51.withZone(dateTimeZone63);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone63);
        long long73 = dateTimeZone63.adjustOffset((long) 33, false);
        java.lang.Object obj75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(obj75);
        org.joda.time.DateTime dateTime78 = dateTime76.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime81 = dateTime76.withPeriodAdded(readablePeriod79, (int) (byte) 10);
        org.joda.time.DateTime dateTime83 = dateTime76.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale87 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.lang.String str89 = locale87.getScript();
        java.lang.String str90 = dateTimeZone85.getName(1646041809840L, locale87);
        java.util.Calendar calendar91 = dateTime76.toCalendar(locale87);
        java.util.Locale locale92 = java.util.Locale.US;
        java.lang.String str93 = locale87.getDisplayLanguage(locale92);
        java.lang.String str94 = dateTimeZone63.getShortName(31536000000L, locale92);
        java.util.Calendar calendar95 = java.util.Calendar.getInstance(locale92);
        int int96 = property22.getMaximumShortTextLength(locale92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar91 and calendar95", (calendar91.compareTo(calendar95) == 0) == calendar91.equals(calendar95));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        java.util.Date date20 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.withEra(0);
        org.joda.time.LocalDate localDate27 = localDate21.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate21.withPeriodAdded(readablePeriod28, 100);
        org.joda.time.LocalDate.Property property31 = localDate21.weekyear();
        org.joda.time.LocalDate.Property property32 = localDate21.era();
        java.lang.String str33 = localDate21.toString();
        org.joda.time.LocalDate.Property property34 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = localDate21.minusMonths(377);
        org.joda.time.LocalDate localDate38 = localDate21.minusMonths(61200000);
        org.joda.time.Chronology chronology39 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfDay();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology39);
        boolean boolean42 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime14.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime41", (dateTime5.compareTo(dateTime41) == 0) == dateTime5.equals(dateTime41));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1040533061384116000L);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar2.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime8.setWeekyear(3);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime12.getZone();
        mutableDateTime8.setZoneRetainFields(dateTimeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone18.toTimeZone();
        java.util.Locale locale23 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.LocalDateTime localDateTime26 = dateTime25.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withDurationAdded(readableDuration27, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.minusMonths(0);
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours(0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.minusMinutes((int) (byte) 10);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.lang.String str39 = localDateTime31.toString("10", locale38);
        java.lang.String str40 = locale23.getDisplayName(locale38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone21, locale23);
        calendar2.setTimeZone(timeZone21);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime44.setWeekyear(3);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime dateTime50 = dateTime48.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime48.withPeriodAdded(readablePeriod51, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime48.getZone();
        mutableDateTime44.setZoneRetainFields(dateTimeZone54);
        java.util.TimeZone timeZone56 = dateTimeZone54.toTimeZone();
        java.util.TimeZone timeZone57 = dateTimeZone54.toTimeZone();
        java.util.Locale locale59 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(obj60);
        org.joda.time.LocalDateTime localDateTime62 = dateTime61.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withDurationAdded(readableDuration63, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime62.minusMonths(0);
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minusHours(0);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.minusMinutes((int) (byte) 10);
        java.util.Locale locale74 = java.util.Locale.CHINESE;
        java.lang.String str75 = localDateTime67.toString("10", locale74);
        java.lang.String str76 = locale59.getDisplayName(locale74);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone57, locale59);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        calendar2.setTimeZone(timeZone57);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.DateMidnight dateMidnight81 = localDate1.toDateMidnight(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar41", (calendar2.compareTo(calendar41) == 0) == calendar2.equals(calendar41));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 35412, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime9.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = dateTimeZone18.getName(1646041809840L, locale20);
        java.util.Calendar calendar24 = dateTime9.toCalendar(locale20);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        java.lang.String str32 = localDate5.toString("09:50:10.643", locale20);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar33", (calendar24.compareTo(calendar33) == 0) == calendar24.equals(calendar33));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        java.lang.String str14 = chronology12.toString();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology12.add(readablePeriod16, (long) (-4017), (int) (short) 100);
        org.joda.time.DurationField durationField20 = chronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField20, and durationField15", !(durationField15.compareTo(durationField20) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField20.compareTo(durationField15))));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfWeek();
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.minusYears(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime17.setWeekyear(3);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField25 = null;
        mutableDateTime17.setRounding(dateTimeField25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime17.add(readableDuration27);
        mutableDateTime17.setSecondOfMinute((int) ' ');
        int int31 = mutableDateTime17.getYear();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        int int35 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology44 = dateTime37.getChronology();
        java.lang.String str45 = chronology44.toString();
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime47.getZone();
        long long56 = dateTimeZone53.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.Chronology chronology58 = chronology44.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField59 = chronology44.years();
        org.joda.time.DateTime dateTime60 = mutableDateTime17.toDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField61 = chronology44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime14.toMutableDateTime(chronology44);
        org.joda.time.DurationField durationField64 = chronology44.weekyears();
        org.joda.time.DurationField durationField65 = chronology44.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate localDate12 = localDate10.plusMonths(11);
        java.util.Date date13 = localDate12.toDate();
        org.joda.time.LocalDate.Property property14 = localDate12.dayOfMonth();
        org.joda.time.LocalDate.Property property15 = localDate12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime17.setWeekyear(3);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField25 = null;
        mutableDateTime17.setRounding(dateTimeField25);
        org.joda.time.DateTimeField dateTimeField27 = null;
        mutableDateTime17.setRounding(dateTimeField27);
        mutableDateTime17.addWeeks((int) ' ');
        org.joda.time.Instant instant31 = mutableDateTime17.toInstant();
        int int32 = property15.compareTo((org.joda.time.ReadableInstant) instant31);
        long long33 = property15.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant31", (mutableDateTime17.compareTo(instant31) == 0) == mutableDateTime17.equals(instant31));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        int int18 = property16.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeField dateTimeField28 = null;
        mutableDateTime20.setRounding(dateTimeField28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime20.add(readableDuration30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime20.era();
        java.lang.String str33 = property32.getName();
        org.joda.time.DateTimeField dateTimeField34 = property32.getField();
        long long37 = dateTimeField34.addWrapField((long) 10, (int) (short) -1);
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = locale38.toLanguageTag();
        int int40 = dateTimeField34.getMaximumShortTextLength(locale38);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale41.getDisplayScript();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.lang.String str46 = locale41.getDisplayCountry(locale43);
        java.util.Set<java.lang.String> strSet47 = locale41.getUnicodeLocaleKeys();
        java.lang.String str48 = locale38.getDisplayCountry(locale41);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.lang.String str51 = locale38.getDisplayCountry(locale49);
        java.lang.String str52 = property16.getAsText(locale49);
        org.joda.time.MutableDateTime mutableDateTime53 = property16.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone55);
        mutableDateTime53.setZone(dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime57", (dateTime5.compareTo(dateTime57) == 0) == dateTime5.equals(dateTime57));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readablePeriod20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale27.getScript();
        java.lang.String str30 = dateTimeZone25.getName(1646041809840L, locale27);
        int int32 = dateTimeZone25.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime23.toMutableDateTime(dateTimeZone25);
        boolean boolean34 = dateTime18.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime18", (instant19.compareTo(dateTime18) == 0) == instant19.equals(dateTime18));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        long long20 = dateTimeField17.addWrapField(30939794112000L, 35513770);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar37.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime45.setWeekyear(3);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime dateTime51 = dateTime49.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.withPeriodAdded(readablePeriod52, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime49.getZone();
        mutableDateTime45.setZoneRetainFields(dateTimeZone55);
        java.util.TimeZone timeZone57 = dateTimeZone55.toTimeZone();
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone57, locale58);
        calendar37.setTimeZone(timeZone57);
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone57, locale61);
        java.lang.String str63 = dateTimeField17.getAsText((int) (byte) 100, locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar59 and calendar62", (calendar59.compareTo(calendar62) == 0) == calendar59.equals(calendar62));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.withWeekOfWeekyear(10);
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = dateTime3.isSupported(dateTimeFieldType8);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime11.minusMillis(2022);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = dateTime21.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale32.getScript();
        java.lang.String str35 = dateTimeZone30.getName(1646041809840L, locale32);
        java.util.Calendar calendar36 = dateTime21.toCalendar(locale32);
        boolean boolean37 = property19.equals((java.lang.Object) calendar36);
        org.joda.time.DateTime dateTime38 = property19.getDateTime();
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.plus(readablePeriod40);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime47 = dateTime43.withField(dateTimeFieldType45, 15);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateTime dateTime50 = dateTime47.withFieldAdded(durationFieldType48, 35408);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime52.setWeekyear(3);
        java.lang.Object obj55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(obj55);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfMonth();
        org.joda.time.DateTime dateTime58 = property57.withMaximumValue();
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears((int) (short) 1);
        long long62 = dateTime58.getMillis();
        java.util.Date date63 = dateTime58.toDate();
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.fromDateFields(date63);
        org.joda.time.Chronology chronology65 = localTime64.getChronology();
        boolean boolean66 = durationFieldType48.isSupported(chronology65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime41.toMutableDateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime3.toDateTime(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime67", (dateTime18.compareTo(mutableDateTime67) == 0) == dateTime18.equals(mutableDateTime67));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfWeek();
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.minusYears(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime17.setWeekyear(3);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField25 = null;
        mutableDateTime17.setRounding(dateTimeField25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime17.add(readableDuration27);
        mutableDateTime17.setSecondOfMinute((int) ' ');
        int int31 = mutableDateTime17.getYear();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        int int35 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withPeriodAdded(readablePeriod40, (int) (byte) 10);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology44 = dateTime37.getChronology();
        java.lang.String str45 = chronology44.toString();
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime47.getZone();
        long long56 = dateTimeZone53.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone53);
        org.joda.time.Chronology chronology58 = chronology44.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField59 = chronology44.years();
        org.joda.time.DateTime dateTime60 = mutableDateTime17.toDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField61 = chronology44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime14.toMutableDateTime(chronology44);
        org.joda.time.DurationField durationField64 = chronology44.weekyears();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = dateTimeZone0.getShortName((-72064071665819000L), locale3);
        java.util.Locale locale10 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale10.getDisplayVariant(locale11);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale11);
        java.lang.String str17 = dateTimeZone0.getName((long) 12, locale11);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        int int23 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology32 = dateTime25.getChronology();
        boolean boolean33 = dateTimeFieldType19.isSupported(chronology32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMonths((-1));
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.joda.time.DateTime dateTime40 = dateTime37.minusSeconds(1902);
        org.joda.time.DateTime dateTime42 = dateTime37.plusDays(19);
        boolean boolean43 = localTime18.equals((java.lang.Object) 19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant38", (dateTime37.compareTo(instant38) == 0) == dateTime37.equals(instant38));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 35412);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("09:50:19.500");
        java.util.Calendar.Builder builder5 = builder2.setLocale(locale4);
        java.util.Calendar.Builder builder9 = builder5.setWeekDate(0, 100, 1997);
        java.util.Calendar.Builder builder11 = builder9.setLenient(false);
        java.util.Calendar.Builder builder15 = builder11.setTimeOfDay((int) (byte) 0, 35452018, 365);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.lang.String str18 = locale17.getDisplayScript();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale17.getDisplayCountry(locale19);
        java.lang.String str23 = locale17.getDisplayName();
        java.lang.String str24 = locale16.getDisplayLanguage(locale17);
        java.util.Calendar.Builder builder25 = builder11.setLocale(locale16);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime27.setWeekyear(3);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime31.getZone();
        mutableDateTime27.setZoneRetainFields(dateTimeZone37);
        java.util.TimeZone timeZone39 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone40 = dateTimeZone37.toTimeZone();
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.lang.String str42 = locale41.getDisplayScript();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.lang.String str46 = locale41.getDisplayCountry(locale43);
        java.lang.String str47 = locale43.getScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone40, locale43);
        java.util.Calendar.Builder builder49 = builder25.setTimeZone(timeZone40);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime51.setWeekyear(3);
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime60 = dateTime55.withPeriodAdded(readablePeriod58, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime55.getZone();
        mutableDateTime51.setZoneRetainFields(dateTimeZone61);
        java.util.TimeZone timeZone63 = dateTimeZone61.toTimeZone();
        java.util.TimeZone timeZone64 = dateTimeZone61.toTimeZone();
        java.util.Locale locale66 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(obj67);
        org.joda.time.LocalDateTime localDateTime69 = dateTime68.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withDurationAdded(readableDuration70, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime69.minusMonths(0);
        org.joda.time.DateTime dateTime75 = localDateTime74.toDateTime();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.minusHours(0);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime74.minusMinutes((int) (byte) 10);
        java.util.Locale locale81 = java.util.Locale.CHINESE;
        java.lang.String str82 = localDateTime74.toString("10", locale81);
        java.lang.String str83 = locale66.getDisplayName(locale81);
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(timeZone64, locale66);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        java.util.Locale locale86 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone64, locale86);
        java.util.Calendar.Builder builder88 = builder49.setTimeZone(timeZone64);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        java.util.Calendar calendar91 = java.util.Calendar.getInstance(timeZone64);
        java.util.Calendar calendar92 = java.util.Calendar.getInstance(timeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar91", (calendar48.compareTo(calendar91) == 0) == calendar48.equals(calendar91));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime2.add(readableDuration12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.millisOfDay();
        org.joda.time.Chronology chronology16 = mutableDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(1646041848594L, chronology16);
        java.lang.String str22 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeField dateTimeField33 = null;
        mutableDateTime25.setRounding(dateTimeField33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime36.setWeekyear(3);
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        org.joda.time.DateTime dateTime42 = dateTime40.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime45 = dateTime40.withPeriodAdded(readablePeriod43, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime40.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone46);
        mutableDateTime25.setZone(dateTimeZone46);
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.lang.String str51 = dateTimeZone46.getShortName((long) 3, locale50);
        long long53 = dateTimeZone46.nextTransition((long) 50);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone46);
        org.joda.time.ReadableInstant readableInstant55 = null;
        int int56 = dateTimeZone46.getOffset(readableInstant55);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(dateTimeZone46);
        int int58 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDate57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime60.setWeekyear(3);
        java.lang.Object obj63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj63);
        org.joda.time.DateTime.Property property65 = dateTime64.dayOfMonth();
        org.joda.time.DateTime dateTime66 = property65.withMaximumValue();
        mutableDateTime60.setMillis((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeField dateTimeField68 = null;
        mutableDateTime60.setRounding(dateTimeField68, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime60.copy();
        int int72 = mutableDateTime71.getYearOfCentury();
        java.lang.Object obj73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(obj73);
        org.joda.time.LocalDateTime localDateTime75 = dateTime74.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withDurationAdded(readableDuration76, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime75.minusMonths(0);
        org.joda.time.DateTime dateTime81 = localDateTime80.toDateTime();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.minusHours(0);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime80.minusHours(0);
        org.joda.time.LocalDateTime.Property property86 = localDateTime85.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime85, dateTimeZone88);
        mutableDateTime71.setZone(dateTimeZone88);
        org.joda.time.DateTime dateTime91 = localDate57.toDateTimeAtMidnight(dateTimeZone88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime71", (mutableDateTime2.compareTo(mutableDateTime71) == 0) == mutableDateTime2.equals(mutableDateTime71));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(10L, dateTimeZone12);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime17.millisOfSecond();
        org.joda.time.DateTime dateTime20 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = chronology21.eras();
        org.joda.time.DurationField durationField25 = chronology21.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField25, and durationField24", !(durationField24.compareTo(durationField25) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField25.compareTo(durationField24))));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.setLenient(false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) calendar15);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime19", (dateTime5.compareTo(dateTime19) == 0) == dateTime5.equals(dateTime19));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        int int4 = dateTime3.getHourOfDay();
        int int5 = dateTime3.getYear();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property10 = localTime7.property(dateTimeFieldType9);
        org.joda.time.LocalTime localTime11 = property10.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        boolean boolean13 = durationFieldType6.isSupported(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime3.toMutableDateTime(chronology12);
        long long16 = dateTime3.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime15", (dateTime3.compareTo(mutableDateTime15) == 0) == dateTime3.equals(mutableDateTime15));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(10L, chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate5 = localDate2.minusMonths(22);
        org.joda.time.LocalDate localDate7 = localDate2.withYearOfCentury(13);
        java.util.Date date13 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean16 = localDate14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = localDate14.withEra(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        org.joda.time.LocalDate localDate20 = property19.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        org.joda.time.LocalDate localDate22 = property19.withMaximumValue();
        boolean boolean23 = localDate2.isAfter((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTime dateTime24 = localDate2.toDateTimeAtMidnight();
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readablePeriod29);
        org.joda.time.DateTime dateTime32 = dateTime30.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfMonth();
        org.joda.time.DateTime dateTime35 = property33.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime37 = dateTime35.plusWeeks(0);
        java.util.Date date43 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.fromDateFields(date43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean46 = localDate44.isSupported(dateTimeFieldType45);
        org.joda.time.LocalDate localDate48 = localDate44.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int50 = localDate44.indexOf(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = dateTime35.withField(dateTimeFieldType49, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType49.getRangeDurationType();
        org.joda.time.DateTime dateTime55 = dateTime24.withFieldAdded(durationFieldType53, 35468);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str63 = locale61.getScript();
        java.lang.String str64 = dateTimeZone59.getName(1646041809840L, locale61);
        int int66 = dateTimeZone59.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime57.toMutableDateTime(dateTimeZone59);
        int int68 = mutableDateTime57.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime57.copy();
        boolean boolean70 = dateTime24.isAfter((org.joda.time.ReadableInstant) mutableDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime67 and mutableDateTime69", (mutableDateTime67.compareTo(mutableDateTime69) == 0) == mutableDateTime67.equals(mutableDateTime69));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.LocalTime.Property property5 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = property5.addCopy((long) 1);
        java.lang.String str9 = property5.getAsText();
        int int10 = property5.getLeapAmount();
        org.joda.time.LocalTime localTime11 = property5.roundFloorCopy();
        int int12 = localTime11.size();
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTime dateTime28 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int32 = dateTime30.get(dateTimeFieldType31);
        boolean boolean33 = dateTime16.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime16.getZone();
        org.joda.time.Chronology chronology35 = chronology13.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology13);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(1644573451614L, chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime36", (dateTime16.compareTo(dateTime36) == 0) == dateTime16.equals(dateTime36));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-28T09:50:27.482Z");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 35414);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withPeriodAdded(readablePeriod4, 23);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime.Property property8 = dateTime3.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime3", (mutableDateTime1.compareTo(dateTime3) == 0) == mutableDateTime1.equals(dateTime3));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.hourOfDay();
        int int18 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime25.getZone();
        mutableDateTime21.setZoneRetainFields(dateTimeZone31);
        java.util.TimeZone timeZone33 = dateTimeZone31.toTimeZone();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone33, locale34);
        calendar35.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withPeriodAdded(readablePeriod50, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime47.getZone();
        mutableDateTime43.setZoneRetainFields(dateTimeZone53);
        java.util.TimeZone timeZone55 = dateTimeZone53.toTimeZone();
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone55, locale56);
        calendar35.setTimeZone(timeZone55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 665, dateTimeZone59);
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        mutableDateTime1.setChronology(chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime7", (mutableDateTime1.compareTo(dateTime7) == 0) == mutableDateTime1.equals(dateTime7));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = dateTimeZone1.getShortName((-72064071665819000L), locale4);
        java.util.Locale locale11 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale12.getCountry();
        java.lang.String str15 = locale11.getDisplayVariant(locale12);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale12);
        java.lang.String str18 = dateTimeZone1.getName((long) 12, locale12);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1646041819936L, dateTimeZone1);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        java.lang.Integer int24 = dateTimeFormatter23.getPivotYear();
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfMonth();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime30.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale41.getScript();
        java.lang.String str44 = dateTimeZone39.getName(1646041809840L, locale41);
        java.util.Calendar calendar45 = dateTime30.toCalendar(locale41);
        int int46 = property27.getMaximumTextLength(locale41);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime48.setWeekyear(3);
        java.lang.Object obj51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj51);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfMonth();
        org.joda.time.DateTime dateTime54 = property53.withMaximumValue();
        mutableDateTime48.setMillis((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTimeField dateTimeField56 = null;
        mutableDateTime48.setRounding(dateTimeField56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        mutableDateTime48.add(readableDuration58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime48.era();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime48.millisOfDay();
        org.joda.time.Chronology chronology62 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = chronology62.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.millisOfSecond();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology62);
        org.joda.time.DateTimeField dateTimeField67 = chronology62.weekOfWeekyear();
        java.util.Locale locale69 = java.util.Locale.UK;
        java.lang.String str70 = dateTimeField67.getAsShortText(1646006400000L, locale69);
        java.lang.String str71 = locale41.getDisplayLanguage(locale69);
        java.lang.String str72 = locale69.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter23.withLocale(locale69);
        java.util.Locale.setDefault(locale69);
        java.lang.String str75 = localTime19.toString("\u610f\u5927\u5229\u6587", locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar45", (calendar17.compareTo(calendar45) == 0) == calendar17.equals(calendar45));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.property(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.centuryOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) (byte) 10);
        boolean boolean17 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime19 = dateTime14.plusMonths(377);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.DateTime.Property property21 = dateTime19.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        mutableDateTime23.setRounding(dateTimeField31);
        org.joda.time.DateTimeField dateTimeField33 = null;
        mutableDateTime23.setRounding(dateTimeField33);
        int int35 = mutableDateTime23.getHourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.era();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime40 = property38.roundHalfFloorCopy();
        java.lang.String str41 = property38.getAsText();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime43.setWeekyear(3);
        java.lang.Object obj46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj46);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfMonth();
        org.joda.time.DateTime dateTime49 = property48.withMaximumValue();
        mutableDateTime43.setMillis((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeField dateTimeField51 = null;
        mutableDateTime43.setRounding(dateTimeField51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime43.add(readableDuration53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.era();
        java.lang.String str56 = property55.getName();
        org.joda.time.DateTimeField dateTimeField57 = property55.getField();
        long long60 = dateTimeField57.addWrapField((long) 10, (int) (short) -1);
        java.util.Locale locale61 = java.util.Locale.US;
        java.lang.String str62 = locale61.toLanguageTag();
        int int63 = dateTimeField57.getMaximumShortTextLength(locale61);
        int int64 = property38.getMaximumTextLength(locale61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property38.getFieldType();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime23.property(dateTimeFieldType65);
        org.joda.time.DateTime.Property property67 = dateTime19.property(dateTimeFieldType65);
        int int68 = mutableDateTime1.get(dateTimeFieldType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant20", (dateTime19.compareTo(instant20) == 0) == dateTime19.equals(instant20));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime3.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime32.setWeekyear(3);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime36.withPeriodAdded(readablePeriod39, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime36.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone42);
        mutableDateTime21.setZone(dateTimeZone42);
        mutableDateTime21.addWeeks((int) (byte) -1);
        boolean boolean47 = dateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant48 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime61.setWeekyear(3);
        java.lang.Object obj64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(obj64);
        org.joda.time.DateTime dateTime67 = dateTime65.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withPeriodAdded(readablePeriod68, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime65.getZone();
        mutableDateTime61.setZoneRetainFields(dateTimeZone71);
        mutableDateTime50.setZone(dateTimeZone71);
        java.lang.Object obj75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(obj75);
        org.joda.time.DateTime dateTime78 = dateTime76.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime80 = dateTime78.plus(readablePeriod79);
        org.joda.time.DateTime dateTime82 = dateTime80.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfMonth();
        org.joda.time.DateTime dateTime85 = property83.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime86 = property83.getDateTime();
        java.util.Locale locale87 = java.util.Locale.ITALY;
        java.lang.String str88 = property83.getAsText(locale87);
        java.lang.String str89 = dateTimeZone71.getShortName((long) 232, locale87);
        org.joda.time.DateTime dateTime90 = instant48.toDateTime(dateTimeZone71);
        org.joda.time.Instant instant91 = dateTime90.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant48", (mutableDateTime21.compareTo(instant48) == 0) == mutableDateTime21.equals(instant48));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime19.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property22 = localTime19.property(dateTimeFieldType21);
        org.joda.time.LocalTime localTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.LocalTime localTime26 = property24.addCopy((int) '4');
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DurationField durationField28 = durationFieldType17.getField(chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMillis(292278993);
        org.joda.time.DateTime dateTime32 = dateTime31.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime29", (dateTime5.compareTo(dateTime29) == 0) == dateTime5.equals(dateTime29));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        java.lang.String str14 = chronology12.toString();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology12.add(readablePeriod16, (long) (-4017), (int) (short) 100);
        org.joda.time.DurationField durationField20 = chronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField20, and durationField15", !(durationField15.compareTo(durationField20) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField20.compareTo(durationField15))));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime1);
        java.util.Date date17 = new java.util.Date((-1644539699), 42, 30);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromDateFields(date17);
        boolean boolean19 = localDateTime13.equals((java.lang.Object) date17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale8.getDisplayCountry(locale10);
        java.lang.String str14 = locale8.getDisplayName();
        java.lang.String str15 = locale7.getDisplayLanguage(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter6.withLocale(locale7);
        java.lang.Integer int17 = dateTimeFormatter6.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter6.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter6.withDefaultYear(0);
        int int21 = dateTimeFormatter20.getDefaultYear();
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withDurationAdded(readableDuration25, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMonths(0);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours(0);
        int int34 = localDateTime32.getValue((int) (byte) 1);
        int int35 = localDateTime32.size();
        int int36 = localDateTime32.getYear();
        org.joda.time.Chronology chronology37 = localDateTime32.getChronology();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter20.withChronology(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime38", (dateTime23.compareTo(dateTime38) == 0) == dateTime23.equals(dateTime38));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.fromCalendarFields(calendar40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusHours(443);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime2.setWeekyear(3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone14, locale15);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromCalendarFields(calendar16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean19 = localTime17.isSupported(durationFieldType18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        int int21 = localTime20.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property23 = localTime20.property(dateTimeFieldType22);
        org.joda.time.LocalTime localTime24 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfSecond();
        org.joda.time.LocalTime localTime27 = property25.addCopy((int) '4');
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DurationField durationField29 = durationFieldType18.getField(chronology28);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay(1646042186389L, chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale13);
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleAttributes();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale13);
        java.lang.String str18 = locale13.getDisplayVariant();
        java.lang.String str19 = dateTimeZone3.getShortName(1646041903633L, locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.year();
        int int17 = mutableDateTime1.getYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeField dateTimeField28 = null;
        mutableDateTime20.setRounding(dateTimeField28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime20.add(readableDuration30);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.plus(readablePeriod36);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime43 = dateTime39.withHourOfDay(21);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime45.setWeekyear(3);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfMonth();
        org.joda.time.DateTime dateTime51 = property50.withMaximumValue();
        mutableDateTime45.setMillis((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTimeField dateTimeField53 = null;
        mutableDateTime45.setRounding(dateTimeField53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime45.add(readableDuration55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime45.add(readableDuration57, (int) (byte) -1);
        mutableDateTime45.addDays(86399);
        java.util.Date date67 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate68 = org.joda.time.LocalDate.fromDateFields(date67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean70 = localDate68.isSupported(dateTimeFieldType69);
        org.joda.time.LocalDate localDate72 = localDate68.withEra(0);
        org.joda.time.LocalDate localDate74 = localDate72.plusMonths(11);
        org.joda.time.LocalDate localDate76 = localDate72.withWeekyear(10);
        org.joda.time.LocalDate.Property property77 = localDate72.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property77.getFieldType();
        java.lang.String str79 = dateTimeFieldType78.toString();
        java.lang.String str80 = dateTimeFieldType78.toString();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime45.property(dateTimeFieldType78);
        boolean boolean82 = dateTime43.isSupported(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime1.property(dateTimeFieldType78);
        org.joda.time.MutableDateTime mutableDateTime84 = property83.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime84.dayOfMonth();
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime(10L);
        int int88 = localTime87.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType89 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalTime localTime91 = localTime87.withFieldAdded(durationFieldType89, (int) 'x');
        org.joda.time.Chronology chronology92 = null;
        org.joda.time.LocalTime localTime93 = new org.joda.time.LocalTime(chronology92);
        org.joda.time.Chronology chronology94 = localTime93.getChronology();
        org.joda.time.DateTime dateTime95 = new org.joda.time.DateTime(chronology94);
        org.joda.time.DurationField durationField96 = durationFieldType89.getField(chronology94);
        mutableDateTime84.add(durationFieldType89, 292278994);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime95", (dateTime5.compareTo(dateTime95) == 0) == dateTime5.equals(dateTime95));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime1.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.weekyear();
        org.joda.time.Instant instant17 = mutableDateTime1.toInstant();
        mutableDateTime1.setMinuteOfDay(80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant17", (dateTime7.compareTo(instant17) == 0) == dateTime7.equals(instant17));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        org.joda.time.Instant instant8 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime1.withMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        boolean boolean8 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime10 = dateTime5.plusMonths(377);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.plus(readablePeriod14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime15", (instant11.compareTo(dateTime15) == 0) == instant11.equals(dateTime15));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy((int) (byte) 1);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = localTime6.toString("+00:00", locale8);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime10.toGregorianCalendar();
        org.joda.time.DateTime.Property property12 = dateTime10.yearOfEra();
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        long long18 = dateTimeZone15.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime20.setWeekyear(3);
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withPeriodAdded(readablePeriod27, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime24.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone30);
        long long33 = dateTimeZone15.getMillisKeepLocal(dateTimeZone30, (long) 35408);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 4, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone15);
        mutableDateTime35.addWeeks(19);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38, (int) (short) 0);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.secondOfMinute();
        long long42 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateTime dateTime43 = property13.getDateTime();
        org.joda.time.DateTime dateTime44 = property13.roundHalfCeilingCopy();
        int int45 = dateTime44.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        java.lang.String str53 = locale51.getScript();
        java.lang.String str54 = dateTimeZone49.getName(1646041809840L, locale51);
        int int56 = dateTimeZone49.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime47.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime58 = dateTime44.withZoneRetainFields(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime47 and mutableDateTime57", (mutableDateTime47.compareTo(mutableDateTime57) == 0) == mutableDateTime47.equals(mutableDateTime57));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        java.util.Date date17 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean20 = localDate18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate localDate22 = localDate18.withEra(0);
        org.joda.time.LocalDate localDate24 = localDate18.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate26 = localDate18.withYearOfCentury((int) 'a');
        int int27 = localDate18.size();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime29.setWeekyear(3);
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfMonth();
        org.joda.time.DateTime dateTime35 = property34.withMaximumValue();
        mutableDateTime29.setMillis((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.minusYears((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay39 = dateTime35.toYearMonthDay();
        org.joda.time.DateTime.Property property40 = dateTime35.dayOfMonth();
        org.joda.time.DateTime dateTime41 = property40.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime41.getZone();
        org.joda.time.DateMidnight dateMidnight43 = localDate18.toDateMidnight(dateTimeZone42);
        mutableDateTime10.setZoneRetainFields(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime11.getMillisOfSecond();
        mutableDateTime11.addSeconds((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime18.minusMillis(2022);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime28.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = dateTimeZone37.getName(1646041809840L, locale39);
        java.util.Calendar calendar43 = dateTime28.toCalendar(locale39);
        boolean boolean44 = property26.equals((java.lang.Object) calendar43);
        org.joda.time.DateTime dateTime45 = property26.getDateTime();
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.MIDNIGHT;
        int int52 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime51);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime dateTime56 = dateTime54.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime54.withPeriodAdded(readablePeriod57, (int) (byte) 10);
        org.joda.time.DateTime dateTime60 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology61 = dateTime54.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.months();
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(11L, chronology61);
        long long65 = chronology46.set((org.joda.time.ReadablePartial) localTime63, 1644573143740L);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(chronology46);
        org.joda.time.DateTimeField dateTimeField67 = chronology46.weekyear();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime11.toMutableDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField69 = chronology46.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime68", (mutableDateTime11.compareTo(mutableDateTime68) == 0) == mutableDateTime11.equals(mutableDateTime68));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar0.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        java.util.Locale locale21 = new java.util.Locale("09:50:02.357");
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withDurationAdded(readableDuration25, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minusMonths(0);
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours(0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.minusMinutes((int) (byte) 10);
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.lang.String str37 = localDateTime29.toString("10", locale36);
        java.lang.String str38 = locale21.getDisplayName(locale36);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone19, locale21);
        calendar0.setTimeZone(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.LocalDateTime localDateTime44 = dateTime43.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withDurationAdded(readableDuration45, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.minusMonths(0);
        org.joda.time.DateTime dateTime50 = localDateTime49.toDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours(0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.minusMinutes((int) (byte) 10);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = localDateTime49.toString("10", locale56);
        java.lang.String str58 = locale56.getScript();
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone19, locale56);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar39", (calendar0.compareTo(calendar39) == 0) == calendar0.equals(calendar39));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        int int5 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime4);
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.withPeriodAdded(readablePeriod10, (int) (byte) 10);
        org.joda.time.DateTime dateTime13 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology14 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime1.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 35418, chronology14);
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime5 = dateTime2.withField(dateTimeFieldType3, (int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(0);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths(591);
        int int10 = dateTime7.getDayOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.LocalDateTime localDateTime13 = dateTime12.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minusMonths(0);
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusSeconds(2);
        int int22 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.minusMillis(32772);
        org.joda.time.Chronology chronology25 = localDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime7.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime26", (dateTime5.compareTo(mutableDateTime26) == 0) == dateTime5.equals(mutableDateTime26));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(35651127);
        org.joda.time.DateTime dateTime18 = localDate15.toDateTimeAtCurrentTime(dateTimeZone17);
        long long20 = dateTimeZone17.convertUTCToLocal(1646041859237L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime18", (dateTime5.compareTo(dateTime18) == 0) == dateTime5.equals(dateTime18));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = dateTimeZone0.getShortName((-72064071665819000L), locale3);
        java.util.Locale locale10 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = locale11.getCountry();
        java.lang.String str14 = locale10.getDisplayVariant(locale11);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale11);
        java.lang.String str17 = dateTimeZone0.getName((long) 12, locale11);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 35412, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.plus(readablePeriod22);
        org.joda.time.LocalDate.Property property24 = localDate23.centuryOfEra();
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime27.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str40 = locale38.getScript();
        java.lang.String str41 = dateTimeZone36.getName(1646041809840L, locale38);
        java.util.Calendar calendar42 = dateTime27.toCalendar(locale38);
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = locale43.getDisplayScript();
        java.util.Locale locale45 = java.util.Locale.ROOT;
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.lang.String str48 = locale43.getDisplayCountry(locale45);
        java.lang.String str49 = locale38.getDisplayCountry(locale43);
        java.lang.String str50 = localDate23.toString("09:50:10.643", locale38);
        java.util.Calendar.Builder builder51 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder55 = builder51.setTimeOfDay(4, (int) (byte) 100, (int) (short) 0);
        java.util.Calendar.Builder builder60 = builder55.setTimeOfDay((int) '#', 2, 0, 7);
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("1997-11-13");
        java.util.Calendar.Builder builder63 = builder60.setLocale(locale62);
        java.lang.String str64 = locale38.getDisplayVariant(locale62);
        java.lang.String str65 = locale11.getDisplayScript(locale62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar42", (calendar16.compareTo(calendar42) == 0) == calendar16.equals(calendar42));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 35412, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.plus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate5.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withPeriodAdded(readablePeriod12, (int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime9.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = dateTimeZone18.getName(1646041809840L, locale20);
        java.util.Calendar calendar24 = dateTime9.toCalendar(locale20);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale25.getDisplayCountry(locale27);
        java.lang.String str31 = locale20.getDisplayCountry(locale25);
        java.lang.String str32 = localDate5.toString("09:50:10.643", locale20);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale20);
        java.lang.String str34 = locale20.getVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar33", (calendar24.compareTo(calendar33) == 0) == calendar24.equals(calendar33));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        calendar15.setLenient(false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) calendar15);
        boolean boolean20 = calendar15.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusSeconds((int) 'a');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withYearOfCentury(11);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfFloorCopy();
        boolean boolean31 = calendar15.after((java.lang.Object) property29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime19", (dateTime5.compareTo(dateTime19) == 0) == dateTime5.equals(dateTime19));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded(readableDuration3, 53);
        org.joda.time.DateTime.Property property6 = dateTime1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime1", (instant2.compareTo(dateTime1) == 0) == instant2.equals(dateTime1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        int int5 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime4);
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.withPeriodAdded(readablePeriod10, (int) (byte) 10);
        org.joda.time.DateTime dateTime13 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology14 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime1.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 35418, chronology14);
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DurationField durationField17 = chronology13.seconds();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(536457600000L, chronology13);
        org.joda.time.DurationField durationField19 = chronology13.weeks();
        org.joda.time.DurationField durationField20 = chronology13.halfdays();
        org.joda.time.DurationField durationField21 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField15, and durationField17", !(durationField21.compareTo(durationField15) == 0) || (Math.signum(durationField21.compareTo(durationField17)) == Math.signum(durationField15.compareTo(durationField17))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime23.setWeekyear(3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withPeriodAdded(readablePeriod30, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime27.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone33.toTimeZone();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone35, locale36);
        calendar15.setTimeZone(timeZone35);
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone35, locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone13);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone13);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) -1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.era();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1, chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime dateTime26 = dateTime23.withField(dateTimeFieldType24, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime23.withDurationAdded(readableDuration27, (int) (byte) 10);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.MIDNIGHT;
        int int33 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime32);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTime dateTime41 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime.Property property42 = dateTime41.weekOfWeekyear();
        org.joda.time.DateTime dateTime44 = property42.addWrapFieldToCopy(10);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        boolean boolean46 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property47 = dateTime29.minuteOfDay();
        org.joda.time.DateTime dateTime49 = property47.setCopy(0);
        org.joda.time.DateTime dateTime50 = property47.roundHalfFloorCopy();
        int int51 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean52 = calendar17.before((java.lang.Object) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar16", (calendar15.compareTo(calendar16) == 0) == calendar15.equals(calendar16));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        int int3 = dateTimeZone1.getOffset(1648461009000L);
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.plusMonths(14);
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusHours(317);
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.withDayOfYear((int) (short) 1);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy(2022);
        org.joda.time.DateTime dateTime29 = dateTime27.withYear(377);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime31.setWeekyear(3);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfMonth();
        org.joda.time.DateTime dateTime37 = property36.withMaximumValue();
        mutableDateTime31.setMillis((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeField dateTimeField39 = null;
        mutableDateTime31.setRounding(dateTimeField39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime31.add(readableDuration41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime31.era();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime31.millisOfDay();
        org.joda.time.Chronology chronology45 = mutableDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology45.getZone();
        org.joda.time.DateTime dateTime49 = dateTime27.toDateTime(dateTimeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((java.lang.Object) localDateTime13, dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime18", (mutableDateTime4.compareTo(dateTime18) == 0) == mutableDateTime4.equals(dateTime18));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime11.getMillisOfSecond();
        mutableDateTime11.addSeconds((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime18.minusMillis(2022);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime28.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = dateTimeZone37.getName(1646041809840L, locale39);
        java.util.Calendar calendar43 = dateTime28.toCalendar(locale39);
        boolean boolean44 = property26.equals((java.lang.Object) calendar43);
        org.joda.time.DateTime dateTime45 = property26.getDateTime();
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.MIDNIGHT;
        int int52 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime51);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime dateTime56 = dateTime54.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime54.withPeriodAdded(readablePeriod57, (int) (byte) 10);
        org.joda.time.DateTime dateTime60 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology61 = dateTime54.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.months();
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(11L, chronology61);
        long long65 = chronology46.set((org.joda.time.ReadablePartial) localTime63, 1644573143740L);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(chronology46);
        org.joda.time.DateTimeField dateTimeField67 = chronology46.weekyear();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime11.toMutableDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField69 = chronology46.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime68", (mutableDateTime11.compareTo(mutableDateTime68) == 0) == mutableDateTime11.equals(mutableDateTime68));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.add((long) 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        int int23 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology32 = dateTime25.getChronology();
        boolean boolean33 = dateTimeFieldType19.isSupported(chronology32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology32);
        mutableDateTime1.setChronology(chronology32);
        org.joda.time.DurationField durationField37 = chronology32.months();
        org.joda.time.DurationField durationField38 = chronology32.hours();
        org.joda.time.DurationField durationField39 = chronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField37, and durationField38", !(durationField39.compareTo(durationField37) == 0) || (Math.signum(durationField39.compareTo(durationField38)) == Math.signum(durationField37.compareTo(durationField38))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-28T09:50:27.482Z");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 35414);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withPeriodAdded(readablePeriod4, 23);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.property(dateTimeFieldType8);
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType8.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime3", (mutableDateTime1.compareTo(dateTime3) == 0) == mutableDateTime1.equals(dateTime3));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime11.getMillisOfSecond();
        mutableDateTime11.addSeconds((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withPeriodAdded(readablePeriod21, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime18.minusMillis(2022);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfYear();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime28.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = dateTimeZone37.getName(1646041809840L, locale39);
        java.util.Calendar calendar43 = dateTime28.toCalendar(locale39);
        boolean boolean44 = property26.equals((java.lang.Object) calendar43);
        org.joda.time.DateTime dateTime45 = property26.getDateTime();
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.MIDNIGHT;
        int int52 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime51);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime dateTime56 = dateTime54.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime54.withPeriodAdded(readablePeriod57, (int) (byte) 10);
        org.joda.time.DateTime dateTime60 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology61 = dateTime54.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.months();
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(11L, chronology61);
        long long65 = chronology46.set((org.joda.time.ReadablePartial) localTime63, 1644573143740L);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(chronology46);
        org.joda.time.DateTimeField dateTimeField67 = chronology46.weekyear();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime11.toMutableDateTime(chronology46);
        org.joda.time.DateTimeField dateTimeField69 = chronology46.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime68", (mutableDateTime11.compareTo(mutableDateTime68) == 0) == mutableDateTime11.equals(mutableDateTime68));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Date date23 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        date23.setYear((int) (short) 0);
        int int27 = date23.getHours();
        int int28 = date23.getHours();
        calendar15.setTime(date23);
        calendar15.set(9, 23, 100, 0, 2);
        int int36 = calendar15.getWeekYear();
        int int37 = calendar15.getMinimalDaysInFirstWeek();
        boolean boolean38 = calendar15.isWeekDateSupported();
        long long39 = calendar15.getTimeInMillis();
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfEra((int) (byte) 10);
        boolean boolean44 = dateTime43.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar45 = dateTime43.toGregorianCalendar();
        java.lang.String str46 = gregorianCalendar45.getCalendarType();
        java.time.Instant instant47 = gregorianCalendar45.toInstant();
        java.util.Date date48 = java.util.Date.from(instant47);
        java.util.Date date49 = java.util.Date.from(instant47);
        calendar15.setTime(date49);
        java.lang.String str51 = date49.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and gregorianCalendar45", (calendar15.compareTo(gregorianCalendar45) == 0) == calendar15.equals(gregorianCalendar45));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        java.util.Date date20 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.withEra(0);
        org.joda.time.LocalDate localDate27 = localDate21.plusMonths((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate21.withPeriodAdded(readablePeriod28, 100);
        org.joda.time.LocalDate.Property property31 = localDate21.weekyear();
        org.joda.time.LocalDate.Property property32 = localDate21.era();
        java.lang.String str33 = localDate21.toString();
        org.joda.time.LocalDate.Property property34 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = localDate21.minusMonths(377);
        org.joda.time.LocalDate localDate38 = localDate21.minusMonths(61200000);
        org.joda.time.Chronology chronology39 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfDay();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology39);
        boolean boolean42 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) dateTime41);
        java.util.Date date48 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        org.joda.time.LocalDate localDate53 = localDate49.withEra(0);
        org.joda.time.LocalDate.Property property54 = localDate53.year();
        org.joda.time.LocalDate localDate55 = property54.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate57 = property54.setCopy(1997);
        java.util.Date date63 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean66 = localDate64.isSupported(dateTimeFieldType65);
        org.joda.time.LocalDate localDate68 = localDate64.withEra(0);
        org.joda.time.LocalDate localDate70 = localDate64.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property71 = localDate64.yearOfCentury();
        org.joda.time.LocalDate localDate72 = property71.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate74 = localDate72.withEra(1);
        org.joda.time.DurationFieldType durationFieldType75 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology76 = null;
        boolean boolean77 = durationFieldType75.isSupported(chronology76);
        java.lang.String str78 = durationFieldType75.toString();
        boolean boolean79 = localDate74.isSupported(durationFieldType75);
        int int80 = localDate57.compareTo((org.joda.time.ReadablePartial) localDate74);
        org.joda.time.LocalDate localDate82 = localDate57.withWeekyear((int) (byte) 100);
        org.joda.time.DateTime dateTime83 = localDate57.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime84 = dateTime83.toDateTime();
        boolean boolean85 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime41", (dateTime5.compareTo(dateTime41) == 0) == dateTime5.equals(dateTime41));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        calendar15.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone22 = calendar15.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale26.getDisplayCountry(locale28);
        java.lang.String str32 = locale26.getDisplayName();
        java.lang.String str33 = locale24.getDisplayName(locale26);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        java.lang.Object obj35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj35);
        org.joda.time.DateTime dateTime38 = dateTime36.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        java.util.Date date48 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        boolean boolean52 = dateTime42.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime dateTime54 = dateTime42.plusHours(11);
        org.joda.time.DateTime.Property property55 = dateTime42.yearOfEra();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.lang.String str57 = property55.getAsShortText(locale56);
        java.util.Locale.setDefault(locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone22, locale56);
        calendar59.clear();
        long long61 = calendar59.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar34", (calendar23.compareTo(calendar34) == 0) == calendar23.equals(calendar34));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022-02-21T09:53:07.517Z");
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.util.Locale locale14 = new java.util.Locale("09:50:02.357", "", "09:50:02.357");
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getDisplayVariant();
        java.lang.String str17 = locale15.getCountry();
        java.lang.String str18 = locale14.getDisplayVariant(locale15);
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder21 = builder19.setInstant((long) 35412);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("09:50:19.500");
        java.util.Calendar.Builder builder24 = builder21.setLocale(locale23);
        java.util.Calendar.Builder builder28 = builder24.setWeekDate(0, 100, 1997);
        java.util.Calendar.Builder builder30 = builder28.setLenient(false);
        java.util.Calendar.Builder builder34 = builder30.setTimeOfDay((int) (byte) 0, 35452018, 365);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = locale36.getDisplayScript();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale36.getDisplayCountry(locale38);
        java.lang.String str42 = locale36.getDisplayName();
        java.lang.String str43 = locale35.getDisplayLanguage(locale36);
        java.util.Calendar.Builder builder44 = builder30.setLocale(locale35);
        java.lang.String str45 = locale15.getDisplayVariant(locale35);
        java.lang.String str46 = dateTimeZone6.getShortName((-72064071665819000L), locale15);
        org.joda.time.DateTime dateTime47 = dateTime4.toDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(1121538843789000L, dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime48", (mutableDateTime2.compareTo(mutableDateTime48) == 0) == mutableDateTime2.equals(mutableDateTime48));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((-1));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime18.minusSeconds(1902);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        int int25 = property24.get();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        int int29 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime28);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = localTime28.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property38 = dateTime37.weekOfWeekyear();
        org.joda.time.DateTime dateTime40 = property38.addWrapFieldToCopy(10);
        int int41 = property24.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DurationField durationField42 = property24.getDurationField();
        int int43 = property24.getMinimumValue();
        org.joda.time.DateTime dateTime44 = property24.roundFloorCopy();
        int int45 = dateTime44.getDayOfWeek();
        boolean boolean46 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime44);
        int int47 = dateTime44.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        org.joda.time.Chronology chronology19 = null;
        mutableDateTime11.setChronology(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime18", (instant16.compareTo(dateTime18) == 0) == instant16.equals(dateTime18));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) ' ');
        long long2 = dateTime1.getMillis();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime3.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property6 = localTime3.property(dateTimeFieldType5);
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property8.addCopy((int) '4');
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        java.lang.String str12 = chronology11.toString();
        org.joda.time.DateTime dateTime13 = dateTime1.toDateTime(chronology11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime15", (dateTime1.compareTo(dateTime15) == 0) == dateTime1.equals(dateTime15));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        mutableDateTime1.setDayOfYear((int) 'x');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.add(2023);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfFloor();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        boolean boolean18 = dateTime17.isEqualNow();
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withPeriodAdded(readablePeriod23, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime20.getZone();
        long long29 = dateTimeZone26.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime30 = dateTime17.toDateTime(dateTimeZone26);
        org.joda.time.LocalTime localTime31 = dateTime17.toLocalTime();
        org.joda.time.DateTime dateTime33 = dateTime17.plus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime35.setWeekyear(3);
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeField dateTimeField43 = null;
        mutableDateTime35.setRounding(dateTimeField43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime50.getZone();
        mutableDateTime46.setZoneRetainFields(dateTimeZone56);
        mutableDateTime35.setZone(dateTimeZone56);
        mutableDateTime35.addWeeks((int) (byte) -1);
        boolean boolean61 = dateTime33.isEqual((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime35.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime65 = property62.addWrapField(591);
        java.util.Locale locale67 = new java.util.Locale("09:50:02.357");
        java.lang.String str68 = locale67.getLanguage();
        int int69 = property62.getMaximumTextLength(locale67);
        int int70 = property9.getMaximumShortTextLength(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime46", (instant6.compareTo(mutableDateTime46) == 0) == instant6.equals(mutableDateTime46));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar0.setLenient(true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime6.setWeekyear(3);
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone18, locale19);
        calendar0.setTimeZone(timeZone18);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar20", (calendar0.compareTo(calendar20) == 0) == calendar0.equals(calendar20));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.property(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime1.add(readablePeriod8, 11);
        long long11 = mutableDateTime1.getMillis();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        java.util.Date date19 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean22 = localDate20.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDate localDate24 = localDate20.withEra(0);
        org.joda.time.LocalDate localDate26 = localDate24.plusMonths(11);
        org.joda.time.LocalDate.Property property27 = localDate26.weekyear();
        org.joda.time.LocalDate localDate29 = localDate26.minusWeeks((int) 'u');
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtStartOfDay();
        boolean boolean31 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime13.secondOfMinute();
        org.joda.time.Instant instant33 = mutableDateTime13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 2022, dateTimeZone37);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) 61200000, dateTimeZone37);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(1646042014821L, dateTimeZone37);
        mutableDateTime13.setZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant33", (mutableDateTime13.compareTo(instant33) == 0) == mutableDateTime13.equals(instant33));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.withEra(0);
        org.joda.time.LocalDate.Property property11 = localDate10.year();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        org.joda.time.LocalDate localDate14 = property11.withMaximumValue();
        org.joda.time.DurationField durationField15 = property11.getLeapDurationField();
        org.joda.time.LocalDate localDate16 = property11.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime18.setWeekyear(3);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime22.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone28.toTimeZone();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone30, locale31);
        calendar32.set(5, (-292275054), 0, 1, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime40.setWeekyear(3);
        java.lang.Object obj43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj43);
        org.joda.time.DateTime dateTime46 = dateTime44.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime49 = dateTime44.withPeriodAdded(readablePeriod47, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime44.getZone();
        mutableDateTime40.setZoneRetainFields(dateTimeZone50);
        java.util.TimeZone timeZone52 = dateTimeZone50.toTimeZone();
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone52, locale53);
        calendar32.setTimeZone(timeZone52);
        java.util.Locale locale56 = java.util.Locale.ITALY;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone52, locale56);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.fromCalendarFields(calendar57);
        org.joda.time.LocalDate localDate59 = localDate16.withFields((org.joda.time.ReadablePartial) localDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar54 and calendar57", (calendar54.compareTo(calendar57) == 0) == calendar54.equals(calendar57));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfDay();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField16", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.Date date5 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        int int6 = date5.getYear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis((-27409550));
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusSeconds((-27409550));
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.property(dateTimeFieldType18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        boolean boolean28 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.plusMonths(377);
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.DateTime.Property property32 = dateTime30.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime34.setWeekyear(3);
        java.lang.Object obj37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj37);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfMonth();
        org.joda.time.DateTime dateTime40 = property39.withMaximumValue();
        mutableDateTime34.setMillis((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeField dateTimeField42 = null;
        mutableDateTime34.setRounding(dateTimeField42);
        org.joda.time.DateTimeField dateTimeField44 = null;
        mutableDateTime34.setRounding(dateTimeField44);
        int int46 = mutableDateTime34.getHourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime34.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.era();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime51 = property49.roundHalfFloorCopy();
        java.lang.String str52 = property49.getAsText();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime54.setWeekyear(3);
        java.lang.Object obj57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(obj57);
        org.joda.time.DateTime.Property property59 = dateTime58.dayOfMonth();
        org.joda.time.DateTime dateTime60 = property59.withMaximumValue();
        mutableDateTime54.setMillis((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeField dateTimeField62 = null;
        mutableDateTime54.setRounding(dateTimeField62);
        org.joda.time.ReadableDuration readableDuration64 = null;
        mutableDateTime54.add(readableDuration64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime54.era();
        java.lang.String str67 = property66.getName();
        org.joda.time.DateTimeField dateTimeField68 = property66.getField();
        long long71 = dateTimeField68.addWrapField((long) 10, (int) (short) -1);
        java.util.Locale locale72 = java.util.Locale.US;
        java.lang.String str73 = locale72.toLanguageTag();
        int int74 = dateTimeField68.getMaximumShortTextLength(locale72);
        int int75 = property49.getMaximumTextLength(locale72);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property49.getFieldType();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime34.property(dateTimeFieldType76);
        org.joda.time.DateTime.Property property78 = dateTime30.property(dateTimeFieldType76);
        boolean boolean79 = localDateTime17.equals((java.lang.Object) dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant31", (dateTime30.compareTo(instant31) == 0) == dateTime30.equals(instant31));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime1.minusMillis(2022);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime11.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime11.add(readableDuration14);
        org.joda.time.Instant instant16 = mutableDateTime11.toInstant();
        int int17 = dateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar5 = dateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withPeriodAdded(readablePeriod14, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime7.add(readableDuration19, (int) (byte) 10);
        org.joda.time.DateTime dateTime22 = mutableDateTime7.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime24 = property23.roundFloorCopy();
        boolean boolean25 = gregorianCalendar5.before((java.lang.Object) dateTime24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTime.Property property27 = dateTime24.property(dateTimeFieldType26);
        org.joda.time.DateTime dateTime29 = dateTime24.plusDays(27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime31.setWeekyear(3);
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime35.getZone();
        mutableDateTime31.setZoneRetainFields(dateTimeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone41.toTimeZone();
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone43, locale44);
        calendar45.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone52 = calendar45.getTimeZone();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone52);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.lang.String str55 = locale54.getDisplayScript();
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.lang.String str57 = locale56.getDisplayScript();
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.util.Locale locale59 = java.util.Locale.FRENCH;
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.lang.String str61 = locale56.getDisplayCountry(locale58);
        java.lang.String str62 = locale56.getDisplayName();
        java.lang.String str63 = locale54.getDisplayName(locale56);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone52, locale54);
        java.lang.Object obj65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(obj65);
        org.joda.time.DateTime dateTime68 = dateTime66.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.plus(readablePeriod69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.DateTime dateTime72 = dateTime68.plus(readableDuration71);
        java.util.Date date78 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate79 = org.joda.time.LocalDate.fromDateFields(date78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean81 = localDate79.isSupported(dateTimeFieldType80);
        boolean boolean82 = dateTime72.isSupported(dateTimeFieldType80);
        org.joda.time.DateTime dateTime84 = dateTime72.plusHours(11);
        org.joda.time.DateTime.Property property85 = dateTime72.yearOfEra();
        java.util.Locale locale86 = java.util.Locale.JAPAN;
        java.lang.String str87 = property85.getAsShortText(locale86);
        java.util.Locale.setDefault(locale86);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone52, locale86);
        java.util.Calendar calendar90 = dateTime29.toCalendar(locale86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar53 and calendar89", (calendar53.compareTo(calendar89) == 0) == calendar53.equals(calendar89));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTime dateTime12 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology13 = dateTime6.getChronology();
        boolean boolean14 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((-1));
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime21.setWeekyear(3);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeField dateTimeField29 = null;
        mutableDateTime21.setRounding(dateTimeField29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime21.add(readableDuration31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime21.era();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime21.add(readableDuration34);
        java.lang.String str36 = mutableDateTime21.toString();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.MIDNIGHT;
        int int40 = localTime38.compareTo((org.joda.time.ReadablePartial) localTime39);
        java.lang.Object obj41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj41);
        org.joda.time.DateTime dateTime44 = dateTime42.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime42.withPeriodAdded(readablePeriod45, (int) (byte) 10);
        org.joda.time.DateTime dateTime48 = localTime39.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology49 = dateTime42.getChronology();
        java.lang.String str50 = chronology49.toString();
        java.lang.Object obj51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime57 = dateTime52.withPeriodAdded(readablePeriod55, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime52.getZone();
        long long61 = dateTimeZone58.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone58);
        org.joda.time.Chronology chronology63 = chronology49.withZone(dateTimeZone58);
        mutableDateTime21.setChronology(chronology49);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime66.setWeekyear(3);
        java.lang.Object obj69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(obj69);
        org.joda.time.DateTime dateTime72 = dateTime70.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.DateTime dateTime75 = dateTime70.withPeriodAdded(readablePeriod73, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime70.getZone();
        mutableDateTime66.setZoneRetainFields(dateTimeZone76);
        org.joda.time.ReadableDuration readableDuration78 = null;
        mutableDateTime66.add(readableDuration78, (int) (byte) 10);
        org.joda.time.DateTime dateTime81 = mutableDateTime66.toDateTime();
        boolean boolean82 = mutableDateTime21.isEqual((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime.Property property83 = dateTime81.millisOfDay();
        int int84 = dateTime81.getMinuteOfHour();
        boolean boolean85 = instant19.isBefore((org.joda.time.ReadableInstant) dateTime81);
        int int86 = dateTime81.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        boolean boolean14 = localDateTime12.isSupported(durationFieldType13);
        boolean boolean15 = localDateTime10.isSupported(durationFieldType13);
        boolean boolean16 = localDateTime9.isSupported(durationFieldType13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusDays(97);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) 'u');
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis(35411);
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime29);
        boolean boolean31 = localDateTime23.equals((java.lang.Object) dateTime29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime33.setWeekyear(3);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfMonth();
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeField dateTimeField41 = null;
        mutableDateTime33.setRounding(dateTimeField41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime33.add(readableDuration43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime33.era();
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime33.add(readableDuration46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime33.year();
        mutableDateTime33.addDays((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours(48);
        mutableDateTime33.setZone(dateTimeZone52);
        long long55 = dateTimeZone52.nextTransition((long) '4');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone52.getName((long) 1252, locale57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime29.toMutableDateTime(dateTimeZone52);
        boolean boolean60 = dateTimeZone52.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime59", (dateTime29.compareTo(mutableDateTime59) == 0) == dateTime29.equals(mutableDateTime59));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime16.setWeekyear(3);
        java.lang.Object obj19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj19);
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeField dateTimeField24 = null;
        mutableDateTime16.setRounding(dateTimeField24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime27.setWeekyear(3);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime31.getZone();
        mutableDateTime27.setZoneRetainFields(dateTimeZone37);
        mutableDateTime16.setZone(dateTimeZone37);
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.lang.String str42 = dateTimeZone37.getShortName((long) 3, locale41);
        long long44 = dateTimeZone11.getMillisKeepLocal(dateTimeZone37, 1L);
        int int46 = dateTimeZone11.getOffsetFromLocal(1646041808949L);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        long long51 = dateTimeZone11.getMillisKeepLocal(dateTimeZone48, 1646042252611L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime49", (dateTime5.compareTo(mutableDateTime49) == 0) == dateTime5.equals(mutableDateTime49));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        int int17 = calendar15.getLeastMaximum(15);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = calendar15.getDisplayName((int) (byte) 1, (int) (short) 1, locale20);
        java.lang.String str23 = locale20.getDisplayCountry();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime25.setWeekyear(3);
        java.lang.Object obj28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj28);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withPeriodAdded(readablePeriod32, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime29.getZone();
        mutableDateTime25.setZoneRetainFields(dateTimeZone35);
        java.util.TimeZone timeZone37 = dateTimeZone35.toTimeZone();
        java.util.Locale locale38 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone37, locale38);
        int int41 = calendar39.getLeastMaximum(15);
        int int42 = calendar39.getFirstDayOfWeek();
        calendar39.setMinimalDaysInFirstWeek((int) 'x');
        boolean boolean45 = locale20.equals((java.lang.Object) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar39", (calendar15.compareTo(calendar39) == 0) == calendar15.equals(calendar39));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.property(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime1.add(readablePeriod8, 11);
        long long11 = mutableDateTime1.getMillis();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        java.util.Date date19 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean22 = localDate20.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDate localDate24 = localDate20.withEra(0);
        org.joda.time.LocalDate localDate26 = localDate24.plusMonths(11);
        org.joda.time.LocalDate.Property property27 = localDate26.weekyear();
        org.joda.time.LocalDate localDate29 = localDate26.minusWeeks((int) 'u');
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtStartOfDay();
        boolean boolean31 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime13.secondOfMinute();
        org.joda.time.Instant instant33 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime13.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant33", (mutableDateTime13.compareTo(instant33) == 0) == mutableDateTime13.equals(instant33));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        int int3 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime2);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTime dateTime11 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        int int14 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property15 = localTime13.millisOfDay();
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.Instant instant6 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime9.setWeekyear(3);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusYears((int) (short) 1);
        long long19 = dateTime15.getMillis();
        java.util.Date date20 = dateTime15.toDate();
        boolean boolean21 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime15);
        int int22 = dateTime15.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant6", (mutableDateTime1.compareTo(instant6) == 0) == mutableDateTime1.equals(instant6));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter4.getParser();
        java.lang.Integer int6 = dateTimeFormatter4.getPivotYear();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.MIDNIGHT;
        int int9 = localTime7.getValue(0);
        org.joda.time.LocalTime.Property property10 = localTime7.millisOfDay();
        org.joda.time.Chronology chronology11 = localTime7.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) int6, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfHalfday();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        int int19 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime18);
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withPeriodAdded(readablePeriod24, (int) (byte) 10);
        org.joda.time.DateTime dateTime27 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology28 = dateTime21.getChronology();
        java.lang.String str29 = chronology28.toString();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.yearOfCentury();
        int int34 = dateTimeField32.get(1646041808985L);
        long long37 = dateTimeField32.add(1644573021143L, 625L);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime40.setWeekyear(3);
        java.lang.Object obj43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj43);
        org.joda.time.DateTime dateTime46 = dateTime44.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime49 = dateTime44.withPeriodAdded(readablePeriod47, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime44.getZone();
        mutableDateTime40.setZoneRetainFields(dateTimeZone50);
        java.util.TimeZone timeZone52 = dateTimeZone50.toTimeZone();
        java.util.Locale locale53 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone52, locale53);
        calendar54.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone61 = calendar54.getTimeZone();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone61);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.lang.String str64 = locale63.getDisplayScript();
        java.util.Locale locale65 = java.util.Locale.ROOT;
        java.lang.String str66 = locale65.getDisplayScript();
        java.util.Locale locale67 = java.util.Locale.ROOT;
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        java.lang.String str69 = locale67.getDisplayCountry(locale68);
        java.lang.String str70 = locale65.getDisplayCountry(locale67);
        java.lang.String str71 = locale65.getDisplayName();
        java.lang.String str72 = locale63.getDisplayName(locale65);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone61, locale63);
        java.lang.String str74 = dateTimeField32.getAsShortText(35659602, locale63);
        java.lang.String str75 = dateTimeField14.getAsShortText((-61848021742887L), locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar62 and calendar73", (calendar62.compareTo(calendar73) == 0) == calendar62.equals(calendar73));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = dateTime1.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusMonths(0);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withYearOfEra(19);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 8);
        java.lang.Object obj18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj18);
        org.joda.time.LocalDateTime localDateTime20 = dateTime19.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withDurationAdded(readableDuration21, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.minusMonths(0);
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusSeconds(2);
        int int29 = localDateTime28.getDayOfWeek();
        java.lang.String str30 = localDateTime28.toString();
        int int31 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology32 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DurationField durationField34 = chronology32.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(1);
        org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks(97);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTimeISO();
        java.lang.String str9 = dateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime5.toMutableDateTime();
        java.util.Date date16 = new java.util.Date((int) 'a', 10, 14, (-1), (int) (short) 1);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean19 = localDate17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDate localDate21 = localDate17.withEra(0);
        org.joda.time.LocalDate localDate23 = localDate17.plusMonths((int) (byte) -1);
        org.joda.time.LocalDate.Property property24 = localDate17.yearOfCentury();
        org.joda.time.LocalDate localDate25 = property24.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate27 = localDate25.withEra(1);
        org.joda.time.LocalDate localDate29 = localDate25.minusYears(12);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate32 = property30.setCopy(17);
        org.joda.time.LocalDate localDate33 = property30.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate.Property property35 = localDate33.property(dateTimeFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType34.getRangeDurationType();
        boolean boolean37 = mutableDateTime10.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(1644573009070L);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTimeISO();
        int int41 = mutableDateTime40.getDayOfWeek();
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone45.getShortName(1646041814507L, locale48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime40.toMutableDateTime(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime46", (dateTime1.compareTo(mutableDateTime46) == 0) == dateTime1.equals(mutableDateTime46));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime19.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property22 = localTime19.property(dateTimeFieldType21);
        org.joda.time.LocalTime localTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.LocalTime localTime26 = property24.addCopy((int) '4');
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DurationField durationField28 = durationFieldType17.getField(chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime29", (dateTime5.compareTo(dateTime29) == 0) == dateTime5.equals(dateTime29));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property3 = localTime0.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, (int) (short) 1);
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) (byte) 10);
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) (byte) 10);
        boolean boolean18 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime21 = dateTime19.plus(345600000L);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded(readableDuration22, (int) '4');
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime26.setWeekyear(3);
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withPeriodAdded(readablePeriod33, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime30.getZone();
        mutableDateTime26.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime26.add(readableDuration38, (int) (byte) 10);
        org.joda.time.DateTime dateTime41 = mutableDateTime26.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime43 = property42.roundCeilingCopy();
        org.joda.time.Instant instant44 = dateTime43.toInstant();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readablePeriod45);
        int int47 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and dateTime43", (instant44.compareTo(dateTime43) == 0) == instant44.equals(dateTime43));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        mutableDateTime1.setSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime1.setZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        int int20 = localTime19.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.LocalTime.Property property22 = localTime19.property(dateTimeFieldType21);
        org.joda.time.LocalTime localTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.LocalTime localTime26 = property24.addCopy((int) '4');
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime29", (dateTime5.compareTo(dateTime29) == 0) == dateTime5.equals(dateTime29));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.withPeriodAdded(readablePeriod4, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours((int) (byte) 1);
        boolean boolean9 = dateTime6.isAfterNow();
        org.joda.time.DateTime dateTime10 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime6.minus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekyear(19);
        int int15 = dateTime14.getMillisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime14.withEarlierOffsetAtOverlap();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.minusHours((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.era();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.eras();
        boolean boolean31 = localDateTime29.isSupported(durationFieldType30);
        boolean boolean32 = localDateTime27.isSupported(durationFieldType30);
        boolean boolean33 = localDateTime26.isSupported(durationFieldType30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.withWeekyear(20);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusDays(97);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusWeeks((int) 'u');
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 24);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis(35411);
        org.joda.time.DateTime.Property property45 = dateTime44.era();
        org.joda.time.DateTime dateTime46 = property45.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime46);
        boolean boolean48 = localDateTime40.equals((java.lang.Object) dateTime46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime50.setWeekyear(3);
        java.lang.Object obj53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj53);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = property55.withMaximumValue();
        mutableDateTime50.setMillis((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeField dateTimeField58 = null;
        mutableDateTime50.setRounding(dateTimeField58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime50.add(readableDuration60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime50.era();
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime50.add(readableDuration63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime50.year();
        mutableDateTime50.addDays((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours(48);
        mutableDateTime50.setZone(dateTimeZone69);
        long long72 = dateTimeZone69.nextTransition((long) '4');
        java.util.Locale locale74 = null;
        java.lang.String str75 = dateTimeZone69.getName((long) 1252, locale74);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime46.toMutableDateTime(dateTimeZone69);
        boolean boolean77 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime47 and mutableDateTime76", (mutableDateTime47.compareTo(mutableDateTime76) == 0) == mutableDateTime47.equals(mutableDateTime76));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 50400000);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = dateTimeZone3.getName(1646041809840L, locale5);
        int int10 = dateTimeZone3.getStandardOffset((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime1.toMutableDateTime(dateTimeZone3);
        int int12 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime13", (mutableDateTime11.compareTo(mutableDateTime13) == 0) == mutableDateTime11.equals(mutableDateTime13));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime5.setWeekyear(3);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime5.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime5.add(readableDuration15);
        mutableDateTime5.setSecondOfMinute((int) ' ');
        int int19 = mutableDateTime5.getYear();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        int int23 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime22);
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withPeriodAdded(readablePeriod28, (int) (byte) 10);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Chronology chronology32 = dateTime25.getChronology();
        java.lang.String str33 = chronology32.toString();
        java.lang.Object obj34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime35.getZone();
        long long44 = dateTimeZone41.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now(dateTimeZone41);
        org.joda.time.Chronology chronology46 = chronology32.withZone(dateTimeZone41);
        org.joda.time.DurationField durationField47 = chronology32.years();
        org.joda.time.DateTime dateTime48 = mutableDateTime5.toDateTime(chronology32);
        org.joda.time.DateTime dateTime49 = mutableDateTime3.toDateTime(chronology32);
        org.joda.time.DurationField durationField50 = chronology32.weeks();
        org.joda.time.DateTimeField dateTimeField51 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = chronology32.dayOfYear();
        org.joda.time.DurationField durationField53 = dateTimeField52.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime56.setWeekyear(3);
        java.lang.Object obj59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(obj59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.DateTime dateTime65 = dateTime60.withPeriodAdded(readablePeriod63, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime60.getZone();
        mutableDateTime56.setZoneRetainFields(dateTimeZone66);
        java.util.TimeZone timeZone68 = dateTimeZone66.toTimeZone();
        java.util.Locale locale69 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone68, locale69);
        calendar70.set(5, (-292275054), 0, 1, (int) (byte) 100);
        java.util.TimeZone timeZone77 = calendar70.getTimeZone();
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone77);
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.lang.String str80 = locale79.getDisplayScript();
        java.util.Locale locale81 = java.util.Locale.ROOT;
        java.lang.String str82 = locale81.getDisplayScript();
        java.util.Locale locale83 = java.util.Locale.ROOT;
        java.util.Locale locale84 = java.util.Locale.FRENCH;
        java.lang.String str85 = locale83.getDisplayCountry(locale84);
        java.lang.String str86 = locale81.getDisplayCountry(locale83);
        java.lang.String str87 = locale81.getDisplayName();
        java.lang.String str88 = locale79.getDisplayName(locale81);
        java.util.Calendar calendar89 = java.util.Calendar.getInstance(timeZone77, locale79);
        java.util.Set<java.lang.String> strSet90 = locale79.getUnicodeLocaleAttributes();
        java.lang.String str91 = dateTimeField52.getAsText(35834, locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar78 and calendar89", (calendar78.compareTo(calendar89) == 0) == calendar78.equals(calendar89));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfEra((int) (byte) 10);
        boolean boolean4 = dateTime3.isEqualNow();
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withPeriodAdded(readablePeriod9, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        long long15 = dateTimeZone12.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone12);
        org.joda.time.LocalTime localTime17 = dateTime3.toLocalTime();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime3.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        int int26 = dateTimeFormatter25.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withZoneUTC();
        org.joda.time.Chronology chronology28 = dateTimeFormatter25.getChronology();
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfMonth();
        org.joda.time.DateTime dateTime32 = property31.withMaximumValue();
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withPeriodAdded(readablePeriod37, (int) (byte) 10);
        org.joda.time.DateTime dateTime41 = dateTime34.minusMillis(2022);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(232);
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale45.getScript();
        java.lang.String str48 = dateTimeZone43.getName(1646041809840L, locale45);
        java.util.Calendar calendar49 = dateTime34.toCalendar(locale45);
        int int50 = property31.getMaximumTextLength(locale45);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime52.setWeekyear(3);
        java.lang.Object obj55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(obj55);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfMonth();
        org.joda.time.DateTime dateTime58 = property57.withMaximumValue();
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeField dateTimeField60 = null;
        mutableDateTime52.setRounding(dateTimeField60);
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutableDateTime52.add(readableDuration62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime52.era();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime52.millisOfDay();
        org.joda.time.Chronology chronology66 = mutableDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = chronology66.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField69 = chronology66.millisOfSecond();
        org.joda.time.DateTime dateTime70 = org.joda.time.DateTime.now(chronology66);
        org.joda.time.DateTimeField dateTimeField71 = chronology66.weekOfWeekyear();
        java.util.Locale locale73 = java.util.Locale.UK;
        java.lang.String str74 = dateTimeField71.getAsShortText(1646006400000L, locale73);
        java.lang.String str75 = locale45.getDisplayLanguage(locale73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter25.withLocale(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter76.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter76.withOffsetParsed();
        boolean boolean80 = dateTimeFormatter76.isOffsetParsed();
        java.util.Locale locale81 = dateTimeFormatter76.getLocale();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone20, locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar49", (calendar21.compareTo(calendar49) == 0) == calendar21.equals(calendar49));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.util.Date date6 = new java.util.Date((int) ' ', 32972563, 0, 845, 5, 590);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        int int8 = localDate7.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate10 = localDate7.plusYears((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.DateTime dateTime14 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        int int15 = localDate7.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.withPeriodAdded(readablePeriod8, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime5.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13, locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        int int19 = calendar15.getActualMaximum(9);
        long long20 = calendar15.getTimeInMillis();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        long long25 = dateTimeZone22.previousTransition(1L);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime27.setWeekyear(3);
        java.lang.Object obj30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withPeriodAdded(readablePeriod34, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime31.getZone();
        mutableDateTime27.setZoneRetainFields(dateTimeZone37);
        long long40 = dateTimeZone22.getMillisKeepLocal(dateTimeZone37, (long) 35408);
        java.lang.String str42 = dateTimeZone22.getNameKey((long) 22);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 19, dateTimeZone22);
        boolean boolean44 = calendar15.before((java.lang.Object) 19);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime50.getZone();
        mutableDateTime46.setZoneRetainFields(dateTimeZone56);
        java.util.TimeZone timeZone58 = dateTimeZone56.toTimeZone();
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58, locale59);
        int int62 = calendar60.getActualMaximum(6);
        boolean boolean63 = calendar60.isWeekDateSupported();
        calendar60.setFirstDayOfWeek((int) (byte) 0);
        java.lang.String str66 = calendar60.getCalendarType();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime68.setWeekyear(3);
        java.lang.Object obj71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(obj71);
        org.joda.time.DateTime dateTime74 = dateTime72.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.DateTime dateTime77 = dateTime72.withPeriodAdded(readablePeriod75, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone78 = dateTime72.getZone();
        mutableDateTime68.setZoneRetainFields(dateTimeZone78);
        java.util.TimeZone timeZone80 = dateTimeZone78.toTimeZone();
        java.util.Locale locale81 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone80, locale81);
        calendar60.setTimeZone(timeZone80);
        calendar15.setTimeZone(timeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar60 and calendar82", (calendar60.compareTo(calendar82) == 0) == calendar60.equals(calendar82));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime1.add(readableDuration13, (int) (byte) -1);
        mutableDateTime1.setMillis((long) 6);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        int int21 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withPeriodAdded(readablePeriod26, (int) (byte) 10);
        org.joda.time.DateTime dateTime29 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology30 = dateTime23.getChronology();
        java.lang.String str31 = chronology30.toString();
        java.lang.Object obj32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withPeriodAdded(readablePeriod36, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime33.getZone();
        long long42 = dateTimeZone39.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone39);
        org.joda.time.Chronology chronology44 = chronology30.withZone(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime46.setWeekyear(3);
        java.lang.Object obj49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj49);
        org.joda.time.DateTime dateTime52 = dateTime50.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withPeriodAdded(readablePeriod53, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime50.getZone();
        mutableDateTime46.setZoneRetainFields(dateTimeZone56);
        java.lang.String str59 = dateTimeZone56.getNameKey(1646041808949L);
        boolean boolean60 = dateTimeZone56.isFixed();
        org.joda.time.Chronology chronology61 = chronology44.withZone(dateTimeZone56);
        mutableDateTime1.setZone(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime1.toMutableDateTime(dateTimeZone64);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime65", (mutableDateTime1.compareTo(mutableDateTime65) == 0) == mutableDateTime1.equals(mutableDateTime65));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime1.setWeekyear(3);
        java.lang.Object obj4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj4);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeField dateTimeField9 = null;
        mutableDateTime1.setRounding(dateTimeField9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime1.add(readableDuration11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology15 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        int int26 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime25);
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withPeriodAdded(readablePeriod31, (int) (byte) 10);
        org.joda.time.DateTime dateTime34 = localTime25.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology35 = dateTime28.getChronology();
        boolean boolean36 = dateTimeFieldType22.isSupported(chronology35);
        org.joda.time.DurationField durationField37 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.minuteOfDay();
        long long40 = dateTimeField38.roundFloor((long) 946);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(chronology42);
        org.joda.time.LocalTime localTime45 = localTime43.withSecondOfMinute((int) (short) 1);
        java.lang.String str46 = localTime43.toString();
        org.joda.time.LocalTime localTime48 = localTime43.withMinuteOfHour(15);
        org.joda.time.LocalTime localTime50 = localTime48.plusMillis(590);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.withYearOfEra((int) (byte) 10);
        boolean boolean58 = dateTime57.isEqualNow();
        java.lang.Object obj59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(obj59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfEra((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.DateTime dateTime65 = dateTime60.withPeriodAdded(readablePeriod63, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime60.getZone();
        long long69 = dateTimeZone66.convertLocalToUTC((long) 11, true);
        org.joda.time.DateTime dateTime70 = dateTime57.toDateTime(dateTimeZone66);
        org.joda.time.LocalTime localTime71 = dateTime57.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalTime localTime74 = localTime71.withPeriodAdded(readablePeriod72, 365);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) (byte) -1);
        mutableDateTime76.setWeekyear(3);
        org.joda.time.ReadableDuration readableDuration79 = null;
        mutableDateTime76.add(readableDuration79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime76.property(dateTimeFieldType81);
        org.joda.time.LocalTime.Property property83 = localTime74.property(dateTimeFieldType81);
        org.joda.time.LocalTime localTime84 = property83.roundCeilingCopy();
        org.joda.time.LocalTime localTime85 = property83.getLocalTime();
        java.util.Locale locale87 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.lang.String str89 = dateTimeField53.getAsShortText((org.joda.time.ReadablePartial) localTime85, 637, locale87);
        java.lang.String str90 = locale87.getDisplayLanguage();
        java.util.Locale locale94 = new java.util.Locale("Cina", "2022-02-28T09:52:31.082Z", "2258-09-18T09:54:42.751Z");
        java.lang.String str95 = locale87.getDisplayScript(locale94);
        java.lang.String str96 = dateTimeField38.getAsShortText(18, locale87);
        java.lang.String str97 = dateTimeField20.getAsShortText((long) 35775772, locale87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField37", Math.signum(durationField18.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField18)));
    }
}

