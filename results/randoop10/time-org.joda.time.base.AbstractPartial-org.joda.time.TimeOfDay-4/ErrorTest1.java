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
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder4 = builder0.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder4.setWeekDate(26086690, 0, 0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime9.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime9.toGregorianCalendar();
        long long12 = gregorianCalendar11.getTimeInMillis();
        java.util.TimeZone timeZone13 = gregorianCalendar11.getTimeZone();
        java.util.Calendar.Builder builder14 = builder8.setTimeZone(timeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (short) 1, chronology16);
        int int18 = localDate17.getDayOfYear();
        org.joda.time.LocalTime localTime19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTime(localTime19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) (short) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) (short) 1, chronology27);
        java.lang.String str29 = localDate28.toString();
        org.joda.time.LocalDate localDate31 = localDate28.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekyearOfCentury();
        org.joda.time.Period period34 = new org.joda.time.Period((long) 7, 100L, chronology32);
        org.joda.time.DateTime dateTime36 = dateTime23.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 26076640);
        org.joda.time.Period period38 = period34.minusMillis(26072320);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = period34.withPeriodType(periodType39);
        int[] intArray41 = period40.getValues();
        java.util.Calendar.Builder builder42 = builder8.setFields(intArray41);
        java.util.Calendar.Builder builder46 = builder8.setWeekDate(99, 26113565, 26186369);
        java.util.Calendar.Builder builder50 = builder8.setWeekDate(26521881, 441, 26374940);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = dateTime51.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar53 = dateTime51.toGregorianCalendar();
        long long54 = gregorianCalendar53.getTimeInMillis();
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar53);
        java.util.TimeZone timeZone56 = gregorianCalendar53.getTimeZone();
        timeZone56.setRawOffset(26346097);
        java.util.Calendar.Builder builder59 = builder8.setTimeZone(timeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar11 and gregorianCalendar53", (gregorianCalendar11.compareTo(gregorianCalendar53) == 0) == gregorianCalendar11.equals(gregorianCalendar53));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateMidnight.Property property21 = dateMidnight19.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight19.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = yearMonthDay22.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight29 = yearMonthDay22.toDateMidnight(dateTimeZone25);
        int[] intArray31 = chronology11.get((org.joda.time.ReadablePartial) yearMonthDay22, (long) 26069970);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration32, readableInstant33, periodType34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod35.add(readableDuration36);
        mutablePeriod35.addSeconds(26061238);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay22.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod35, 1970);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay41.minusYears((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone45 = dateMidnight44.getZone();
        org.joda.time.DateMidnight.Property property46 = dateMidnight44.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay47 = dateMidnight44.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = yearMonthDay47.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight49.getZone();
        boolean boolean52 = dateTimeZone50.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight54 = yearMonthDay47.toDateMidnight(dateTimeZone50);
        org.joda.time.YearMonthDay.Property property55 = yearMonthDay47.year();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = yearMonthDay47.toDateTimeAtCurrentTime(dateTimeZone56);
        org.joda.time.DateTime dateTime58 = yearMonthDay43.toDateTimeAtCurrentTime(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone60 = dateMidnight59.getZone();
        org.joda.time.DateMidnight.Property property61 = dateMidnight59.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay62 = dateMidnight59.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray63 = yearMonthDay62.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone65 = dateMidnight64.getZone();
        boolean boolean67 = dateTimeZone65.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight69 = yearMonthDay62.toDateMidnight(dateTimeZone65);
        org.joda.time.YearMonthDay.Property property70 = yearMonthDay62.year();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime72 = yearMonthDay62.toDateTimeAtCurrentTime(dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight73 = yearMonthDay43.toDateMidnight(dateTimeZone71);
        org.joda.time.YearMonthDay.Property property74 = yearMonthDay43.monthOfYear();
        java.lang.String str75 = property74.getAsString();
        org.joda.time.DateTimeField dateTimeField76 = property74.getField();
        org.joda.time.YearMonthDay yearMonthDay78 = property74.addToCopy(26592403);
        org.joda.time.DurationField durationField79 = property74.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField79, and durationField12", !(durationField12.compareTo(durationField79) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField79.compareTo(durationField12))));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) '#');
        long long3 = instant2.getMillis();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.LocalTime localTime5 = dateTime4.toLocalTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        mutableDateTime8.setZone(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfDay();
        mutableDateTime12.addWeeks(46);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) 1, chronology18);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        org.joda.time.DateTime dateTime22 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        mutableDateTime12.setZone(dateTimeZone21);
        long long27 = dateTimeZone21.convertLocalToUTC((long) 20, false, 1645514137865L);
        boolean boolean28 = localTime5.equals((java.lang.Object) 20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime7", (instant0.compareTo(mutableDateTime7) == 0) == instant0.equals(mutableDateTime7));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval6 = yearMonthDay3.toInterval(dateTimeZone5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, chronology9);
        java.lang.String str11 = localDate10.toString();
        org.joda.time.LocalDate localDate13 = localDate10.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.Period period17 = new org.joda.time.Period((long) 8, chronology14);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology14);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        java.lang.String str21 = property19.getAsText();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.DateMidnight.Property property24 = dateMidnight22.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay25 = dateMidnight22.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = yearMonthDay25.getFieldTypes();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (short) 1, chronology28);
        java.lang.String str30 = localDate29.toString();
        org.joda.time.LocalDate localDate32 = localDate29.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.year();
        long long39 = chronology33.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay25.withChronologyRetainFields(chronology33);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay25.year();
        java.util.Locale locale42 = java.util.Locale.ITALY;
        int int43 = property41.getMaximumShortTextLength(locale42);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale42.getDisplayCountry(locale44);
        java.util.Locale.setDefault(locale44);
        java.lang.String str47 = property19.getAsText(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField34", Math.signum(durationField20.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField20)));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusMinutes(44);
        org.joda.time.Chronology chronology4 = timeOfDay3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DurationField durationField6 = chronology4.halfdays();
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField5, and durationField6", !(durationField7.compareTo(durationField5) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.Chronology chronology15 = chronology7.withZone(dateTimeZone11);
        java.lang.String str17 = dateTimeZone11.getNameKey((long) 26061790);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 26369208, dateTimeZone11);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = dateMidnight27.isSupported(dateTimeFieldType30);
        org.joda.time.Period period36 = new org.joda.time.Period((int) (byte) 10, (-1), 22, 100);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight27.minus((org.joda.time.ReadablePeriod) period36);
        int int38 = dateMidnight27.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone39.convertLocalToUTC((-27424365L), false, (long) 4);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone39);
        long long46 = dateTimeZone39.convertUTCToLocal((long) 164);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight27.withZoneRetainFields(dateTimeZone39);
        int int48 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateMidnight47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and dateTime44", (mutableDateTime14.compareTo(dateTime44) == 0) == mutableDateTime14.equals(dateTime44));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, chronology4);
        java.lang.String str6 = localDate5.toString();
        org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        mutableDateTime1.setChronology(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 26085513, chronology9);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.millisOfSecond();
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = new java.util.Locale("1970", "PT0.100S");
        java.lang.String str24 = nameProvider18.getName(locale21, "14", "PT0.100S");
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.lang.String str29 = nameProvider18.getName(locale25, "ISOChronology[UTC]", "PT0.100S");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider18);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone36 = dateMidnight35.getZone();
        mutableDateTime33.setZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDate31.toDateTimeAtStartOfDay(dateTimeZone36);
        int int40 = dateTimeZone36.getOffsetFromLocal((long) 26092895);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.lang.String str44 = locale42.getCountry();
        java.lang.String str45 = locale42.getVariant();
        java.lang.String str46 = dateTimeZone36.getShortName((long) 26125319, locale42);
        java.lang.String str49 = nameProvider18.getShortName(locale42, "years", "434");
        java.lang.String str50 = dateTimeField16.getAsText((-27424357L), locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime33", (mutableDateTime1.compareTo(mutableDateTime33) == 0) == mutableDateTime1.equals(mutableDateTime33));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear((int) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds(26072939);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(periodType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) periodType6, dateTimeZone8);
        int int10 = localDateTime9.getDayOfMonth();
        int int11 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfSecond();
        int int13 = localDateTime9.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withField(dateTimeFieldType14, 190);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableDuration17, readableInstant18, periodType19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutablePeriod20.add(readableDuration21);
        mutablePeriod20.addSeconds(26061238);
        mutablePeriod20.addMillis((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.Duration duration29 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime9.plusHours(26079825);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime9.plusWeeks(26068833);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        int int36 = localDateTime9.indexOf(dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = localDateTime9.getChronology();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(readableDuration38, readableInstant39, periodType40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutablePeriod41.add(readableDuration42);
        mutablePeriod41.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableDuration46, readableInstant47, periodType48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        mutablePeriod49.add(readableDuration50);
        mutablePeriod49.addMonths((int) '#');
        mutablePeriod41.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod49);
        int int55 = mutablePeriod49.getHours();
        int[] intArray58 = chronology37.get((org.joda.time.ReadablePeriod) mutablePeriod49, 824948080329600666L, (long) 26177564);
        org.joda.time.DurationField durationField59 = chronology37.days();
        org.joda.time.DateTime dateTime60 = dateTime1.toDateTime(chronology37);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 26416032, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime60", (dateTime1.compareTo(dateTime60) == 0) == dateTime1.equals(dateTime60));
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
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withDayOfMonth(1);
        int int11 = dateMidnight10.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight10.withFieldAdded(durationFieldType12, 26074093);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.DateMidnight.Property property17 = dateMidnight15.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay18 = dateMidnight15.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = yearMonthDay18.getFieldTypes();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, chronology21);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.LocalDate localDate25 = localDate22.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.year();
        long long32 = chronology26.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay18.withChronologyRetainFields(chronology26);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight14.withChronology(chronology26);
        org.joda.time.DateMidnight.Property property35 = dateMidnight14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight34", (dateMidnight14.compareTo(dateMidnight34) == 0) == dateMidnight14.equals(dateMidnight34));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, chronology1);
        java.lang.String str3 = localDate2.toString();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) (byte) 100);
        int int6 = localDate2.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate2.plusWeeks(26081086);
        org.joda.time.LocalDate localDate10 = localDate2.plusDays(26071829);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        org.joda.time.LocalDate localDate14 = localDate2.withFieldAdded(durationFieldType12, 26375796);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.yearOfEra();
        mutableDateTime16.addSeconds(292278993);
        org.joda.time.DateTime dateTime20 = mutableDateTime16.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime20.plusMillis(4);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone25 = dateMidnight24.getZone();
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay27 = dateMidnight24.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = yearMonthDay27.getFieldTypes();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) 1, chronology30);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.LocalDate localDate34 = localDate31.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.year();
        long long41 = chronology35.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay27.withChronologyRetainFields(chronology35);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone44 = dateMidnight43.getZone();
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay46 = dateMidnight43.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = yearMonthDay46.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone49 = dateMidnight48.getZone();
        boolean boolean51 = dateTimeZone49.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight53 = yearMonthDay46.toDateMidnight(dateTimeZone49);
        int[] intArray55 = chronology35.get((org.joda.time.ReadablePartial) yearMonthDay46, (long) 26069970);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 26072939, chronology35);
        org.joda.time.DateTime dateTime57 = dateTime20.toDateTime(chronology35);
        org.joda.time.DurationField durationField58 = durationFieldType12.getField(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and dateTime57", (mutableDateTime16.compareTo(dateTime57) == 0) == mutableDateTime16.equals(dateTime57));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) 26063026);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        long long10 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) dateMidnight8);
        mutableDateTime5.addMillis((int) (byte) 100);
        boolean boolean15 = mutableDateTime5.isAfter((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.year();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property18 = localTime17.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        long long21 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.LocalTime localTime23 = property18.addCopy((long) (-292275054));
        org.joda.time.LocalTime localTime25 = localTime23.plusHours(26075615);
        org.joda.time.Chronology chronology26 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime5, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime27", (mutableDateTime2.compareTo(mutableDateTime27) == 0) == mutableDateTime2.equals(mutableDateTime27));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        mutableDateTime5.setYear(26074093);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        mutablePeriod10.setPeriod((long) (byte) 100, (long) 26062367, chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfYear();
        mutableDateTime5.setChronology(chronology19);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime5.getZone();
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(26061877, (int) (short) 1, 10, 12, 26063479, (int) '#', 26061790, (int) (byte) 100);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 100, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime39.copy();
        org.joda.time.Duration duration41 = period37.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.String str42 = duration41.toString();
        long long43 = duration41.getMillis();
        java.lang.String str44 = duration41.toString();
        mutablePeriod34.add((org.joda.time.ReadableDuration) duration41);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight25.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) (short) 1, chronology48);
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = dateMidnight50.getZone();
        org.joda.time.DateTime dateTime52 = localDate49.toDateTimeAtCurrentTime(dateTimeZone51);
        long long54 = dateTimeZone51.convertUTCToLocal(2505600000L);
        org.joda.time.DateMidnight dateMidnight55 = org.joda.time.DateMidnight.now(dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight46.withZoneRetainFields(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and dateMidnight50", (dateMidnight25.compareTo(dateMidnight50) == 0) == dateMidnight25.equals(dateMidnight50));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) '#');
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 26170219);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.minusYears(100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(26076640);
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
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
        org.joda.time.DateMidnight.Property property25 = dateMidnight22.year();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = property25.getAsText(locale26);
        java.lang.String str28 = property25.getAsShortText();
        org.joda.time.DateMidnight dateMidnight30 = property25.setCopy(10);
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
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 100, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        org.joda.time.Duration duration48 = period44.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight39.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight30.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTime dateTime51 = dateTime13.minus((org.joda.time.ReadableDuration) duration48);
        java.lang.String str52 = duration48.toString();
        org.joda.time.Duration duration53 = duration48.toDuration();
        org.joda.time.Instant instant55 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration48, 26573846);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime46", (instant0.compareTo(mutableDateTime46) == 0) == instant0.equals(mutableDateTime46));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 100, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        org.joda.time.Duration duration6 = period2.toDurationTo((org.joda.time.ReadableInstant) mutableDateTime5);
        mutableDateTime5.setYear(26074093);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (short) 1, chronology14);
        java.lang.String str16 = localDate15.toString();
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        mutablePeriod10.setPeriod((long) (byte) 100, (long) 26062367, chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfYear();
        mutableDateTime5.setChronology(chronology19);
        long long27 = chronology19.add((long) 26088764, (long) 26061877, 219);
        org.joda.time.DurationField durationField28 = chronology19.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField28, and durationField20", !(durationField20.compareTo(durationField28) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField28.compareTo(durationField20))));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        org.joda.time.DateMidnight.Property property4 = dateMidnight2.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay5 = dateMidnight2.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = yearMonthDay5.getFieldTypes();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, chronology8);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.year();
        long long19 = chronology13.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay5.withChronologyRetainFields(chronology13);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone22 = dateMidnight21.getZone();
        org.joda.time.DateMidnight.Property property23 = dateMidnight21.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay24 = dateMidnight21.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = yearMonthDay24.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = dateMidnight26.getZone();
        boolean boolean29 = dateTimeZone27.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = yearMonthDay24.toDateMidnight(dateTimeZone27);
        int[] intArray33 = chronology13.get((org.joda.time.ReadablePartial) yearMonthDay24, (long) 26069970);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 26072939, chronology13);
        org.joda.time.DateTimeZone dateTimeZone35 = chronology13.getZone();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((long) 26322994, chronology13);
        org.joda.time.DurationField durationField37 = chronology13.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField37, and durationField14", !(durationField14.compareTo(durationField37) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField37.compareTo(durationField14))));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay3 = dateMidnight0.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonthDay3.getFieldTypes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (short) 1, chronology6);
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        long long17 = chronology11.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay3.withChronologyRetainFields(chronology11);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay3.year();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.YearMonthDay yearMonthDay22 = property19.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight23 = yearMonthDay22.toDateMidnight();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (short) 1, chronology25);
        java.lang.String str27 = localDate26.toString();
        org.joda.time.LocalDate localDate29 = localDate26.withYearOfEra((int) (byte) 100);
        int int30 = localDate26.getDayOfYear();
        org.joda.time.LocalDate localDate32 = localDate26.plusWeeks(26081086);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (short) 1, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = localDate32.toDateMidnight(dateTimeZone34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) 1, chronology38);
        java.lang.String str40 = localDate39.toString();
        org.joda.time.LocalDate localDate42 = localDate39.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime47 = dateMidnight36.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight23.withChronology(chronology43);
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight23 and dateMidnight49", (dateMidnight23.compareTo(dateMidnight49) == 0) == dateMidnight23.equals(dateMidnight49));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (short) 1, chronology2);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        int int7 = localDate3.getDayOfYear();
        org.joda.time.LocalDate localDate9 = localDate3.plusWeeks(26081086);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((long) (short) 1, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = localDate9.toDateMidnight(dateTimeZone11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (short) 1, chronology15);
        java.lang.String str17 = localDate16.toString();
        org.joda.time.LocalDate localDate19 = localDate16.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.year();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight13.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(30156L, chronology20);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = chronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology20.millisOfDay();
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight31.getZone();
        org.joda.time.DateMidnight.Property property33 = dateMidnight31.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay34 = dateMidnight31.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = yearMonthDay34.getFieldTypes();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) (short) 1, chronology37);
        java.lang.String str39 = localDate38.toString();
        org.joda.time.LocalDate localDate41 = localDate38.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.year();
        long long48 = chronology42.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay34.withChronologyRetainFields(chronology42);
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay34.year();
        java.lang.String str51 = property50.getAsString();
        java.lang.String str52 = property50.getName();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (short) 1, chronology54);
        int int56 = localDate55.getDayOfYear();
        org.joda.time.LocalTime localTime57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate55.toDateTime(localTime57, dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = localDate55.toDateMidnight(dateTimeZone60);
        java.util.Locale locale63 = java.util.Locale.KOREA;
        java.util.Locale locale64 = java.util.Locale.ITALY;
        java.lang.String str65 = locale64.getDisplayLanguage();
        java.lang.String str66 = locale63.getDisplayCountry(locale64);
        java.lang.String str67 = localDate55.toString("14", locale63);
        java.lang.String str68 = locale63.getDisplayName();
        java.util.Locale locale71 = new java.util.Locale("1970", "PT0.100S");
        java.lang.String str72 = locale63.getDisplayCountry(locale71);
        int int73 = property50.getMaximumShortTextLength(locale63);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(locale63);
        java.util.Locale locale75 = locale63.stripExtensions();
        java.lang.String str76 = dateTimeField29.getAsText(26449821, locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateMidnight61", (dateMidnight12.compareTo(dateMidnight61) == 0) == dateMidnight12.equals(dateMidnight61));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight8.plusYears((int) ' ');
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight8.plusDays(26063479);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (short) 1, chronology17);
        java.lang.String str19 = localDate18.toString();
        org.joda.time.LocalDate localDate21 = localDate18.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfHour();
        org.joda.time.DateTime dateTime25 = dateMidnight8.toDateTime(chronology22);
        org.joda.time.DurationField durationField26 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateTime25", (dateMidnight8.compareTo(dateTime25) == 0) == dateMidnight8.equals(dateTime25));
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
        org.joda.time.DateTime dateTime8 = dateTime6.plusYears((int) (short) 10);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 100);
        int int11 = dateTime10.getWeekOfWeekyear();
        boolean boolean13 = dateTime10.isBefore((long) 26062445);
        int int14 = dateTime10.getYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 100, chronology16);
        org.joda.time.Seconds seconds18 = period17.toStandardSeconds();
        org.joda.time.DateTime dateTime19 = dateTime10.plus((org.joda.time.ReadablePeriod) seconds18);
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        org.joda.time.DateTime dateTime22 = dateTime19.minus((long) 915);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        org.joda.time.DateMidnight.Property property25 = dateMidnight23.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight23.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = yearMonthDay26.getFieldTypes();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = dateMidnight28.getZone();
        boolean boolean31 = dateTimeZone29.isStandardOffset((long) 'a');
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight33 = yearMonthDay26.toDateMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime19.withZone(dateTimeZone29);
        org.joda.time.DateTime dateTime36 = dateTime19.plusMonths(26070203);
        org.joda.time.Instant instant37 = dateTime19.toInstant();
        org.joda.time.DateTime.Property property38 = dateTime19.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant37", (dateTime19.compareTo(instant37) == 0) == dateTime19.equals(instant37));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone1 = dateMidnight0.getZone();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.yearOfEra();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.Instant instant5 = instant3.plus((long) '#');
        org.joda.time.Instant instant6 = instant5.toInstant();
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) instant6);
        org.joda.time.MutableDateTime mutableDateTime8 = instant6.toMutableDateTime();
        java.lang.Class<?> wildcardClass9 = instant6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime8", (instant6.compareTo(mutableDateTime8) == 0) == instant6.equals(mutableDateTime8));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime1.addMinutes(0);
        mutableDateTime1.setSecondOfDay(22);
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime1.set(dateTimeFieldType9, 26069958);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) 1, chronology20);
        java.lang.String str22 = localDate21.toString();
        org.joda.time.LocalDate localDate24 = localDate21.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekyearOfCentury();
        org.joda.time.Period period27 = new org.joda.time.Period((long) 7, 100L, chronology25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, chronology25);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfCentury();
        java.lang.String str30 = mutableDateTime28.toString();
        java.util.Locale locale34 = new java.util.Locale("T07:15:06.424", "years", "fr_CA");
        java.lang.String str35 = locale34.toLanguageTag();
        java.util.Calendar calendar36 = mutableDateTime28.toCalendar(locale34);
        java.lang.String str37 = calendar36.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime28", (mutableDateTime13.compareTo(mutableDateTime28) == 0) == mutableDateTime13.equals(mutableDateTime28));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) (short) 1, chronology3);
        int int5 = localDate4.getDayOfYear();
        org.joda.time.LocalTime localTime6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate4.toDateTime(localTime6, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = localDate4.toDateMidnight(dateTimeZone9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.yearOfEra();
        int int12 = dateMidnight10.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property13 = dateMidnight10.year();
        org.joda.time.DateMidnight dateMidnight14 = property13.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.DateMidnight.Property property17 = dateMidnight15.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay18 = dateMidnight15.toYearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = yearMonthDay18.getFieldTypes();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, chronology21);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.LocalDate localDate25 = localDate22.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.year();
        long long32 = chronology26.add(0L, (long) 26069500, 44);
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay18.withChronologyRetainFields(chronology26);
        int int34 = yearMonthDay18.size();
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone36 = dateMidnight35.getZone();
        boolean boolean38 = dateTimeZone36.isStandardOffset((long) 'a');
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.now(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight40 = yearMonthDay18.toDateMidnight(dateTimeZone36);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight14, dateTimeZone36);
        mutableDateTime0.setZoneRetainFields(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1, periodType2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        mutablePeriod3.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.millis();
        mutablePeriod3.add(durationFieldType8, 5);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod3.toMutablePeriod();
        mutablePeriod11.setPeriod(26084973, 26, 26097985, 26102728, 219, 26072939, 573, 26081440);
        java.lang.String str21 = mutablePeriod11.toString();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (short) 1, chronology23);
        int int25 = localDate24.getDayOfYear();
        org.joda.time.LocalTime localTime26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTime(localTime26, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = localDate24.toDateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfEra();
        int int32 = dateMidnight30.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property33 = dateMidnight30.year();
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.lang.String str35 = property33.getAsText(locale34);
        java.lang.String str36 = property33.getAsShortText();
        org.joda.time.DateMidnight dateMidnight37 = property33.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withYearOfEra((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plusMonths((int) '4');
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.Instant instant44 = instant42.plus((long) '#');
        org.joda.time.Instant instant46 = instant42.minus((long) 59);
        org.joda.time.Instant instant48 = instant46.plus(31562062367L);
        mutablePeriod11.setPeriod((org.joda.time.ReadableInstant) dateMidnight41, (org.joda.time.ReadableInstant) instant46);
        org.joda.time.MutableDateTime mutableDateTime50 = instant46.toMutableDateTime();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (short) 1, chronology52);
        int int54 = localDate53.getDayOfYear();
        org.joda.time.LocalTime localTime55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate53.toDateTime(localTime55, dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = localDate53.toDateMidnight(dateTimeZone58);
        org.joda.time.DateMidnight.Property property60 = dateMidnight59.yearOfEra();
        int int61 = dateMidnight59.getMinuteOfHour();
        org.joda.time.DateMidnight.Property property62 = dateMidnight59.year();
        java.util.Locale locale63 = java.util.Locale.FRENCH;
        java.lang.String str64 = property62.getAsText(locale63);
        java.lang.String str65 = property62.getAsShortText();
        org.joda.time.DateMidnight dateMidnight66 = property62.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.withYearOfEra((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.withWeekyear(26084032);
        org.joda.time.DateMidnight.Property property71 = dateMidnight68.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight72 = property71.withMinimumValue();
        boolean boolean73 = mutableDateTime50.isAfter((org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        boolean boolean75 = dateMidnight72.isBefore(readableInstant74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant46 and mutableDateTime50", (instant46.compareTo(mutableDateTime50) == 0) == instant46.equals(mutableDateTime50));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 1);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 26091425);
        org.joda.time.Instant instant7 = instant5.plus((long) 26193054);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) periodType8, dateTimeZone10);
        int int12 = localDateTime11.getDayOfMonth();
        int int13 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.millisOfSecond();
        int int15 = localDateTime11.getEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime11.era();
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.dayOfMonth();
        int int18 = localDateTime11.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime11.plusMinutes(26085513);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plusMinutes(111);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.DateTime dateTime27 = instant26.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.yearOfEra();
        mutableDateTime30.addSeconds(292278993);
        org.joda.time.DateTime dateTime34 = mutableDateTime30.toDateTimeISO();
        org.joda.time.DateTime dateTime36 = dateTime34.plusMillis(4);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(periodType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) periodType37, dateTimeZone39);
        int int41 = localDateTime40.getDayOfMonth();
        int int42 = localDateTime40.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.millisOfSecond();
        int int44 = localDateTime40.getEra();
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.era();
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.dayOfMonth();
        int int47 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property48 = localDateTime40.millisOfSecond();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 1, (long) 0, periodType51, chronology52);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime40.minus((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) periodType55, dateTimeZone57);
        int int59 = localDateTime58.getDayOfMonth();
        int int60 = localDateTime58.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.millisOfSecond();
        int int62 = localDateTime58.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime58.withField(dateTimeFieldType63, 190);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableDuration66, readableInstant67, periodType68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        mutablePeriod69.add(readableDuration70);
        mutablePeriod69.addSeconds(26061238);
        mutablePeriod69.addMillis((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.Duration duration78 = mutablePeriod69.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime77);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime58.plus((org.joda.time.ReadableDuration) duration78);
        org.joda.time.Period period80 = duration78.toPeriod();
        long long81 = duration78.getMillis();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime54.plus((org.joda.time.ReadableDuration) duration78);
        org.joda.time.DateTime dateTime84 = dateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration78, 345);
        org.joda.time.Instant instant86 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration78, 26301038);
        org.joda.time.Instant instant88 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration78, 26396248);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant26", (mutableDateTime25.compareTo(instant26) == 0) == mutableDateTime25.equals(instant26));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean2 = localTime0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime4 = localTime0.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 'u');
        int int7 = timeOfDay6.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.withMinuteOfHour(3);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) timeOfDay6);
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
        org.joda.time.Period period26 = period19.plusWeeks(26073687);
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period26, 119);
        int int30 = timeOfDay6.getMinuteOfHour();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property32 = localTime31.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.DateTimeZone dateTimeZone34 = dateMidnight33.getZone();
        long long35 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.LocalTime localTime37 = property32.addCopy((long) (-292275054));
        org.joda.time.LocalTime localTime39 = localTime37.plusHours(26075615);
        org.joda.time.Chronology chronology40 = localTime37.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay6.withChronologyRetainFields(chronology40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime42", (mutableDateTime15.compareTo(dateTime42) == 0) == mutableDateTime15.equals(dateTime42));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) '#');
        org.joda.time.Instant instant4 = instant0.minus((long) 59);
        org.joda.time.Period period7 = new org.joda.time.Period((long) (-1), (long) 26061444);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.Weeks weeks10 = period7.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = period7.toString(periodFormatter11);
        org.joda.time.Duration duration13 = period7.toStandardDuration();
        org.joda.time.Instant instant14 = instant4.minus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration15, readableInstant16, periodType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutablePeriod18.add(readableDuration19);
        mutablePeriod18.addMonths((int) '#');
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.millis();
        mutablePeriod18.add(durationFieldType23, 5);
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod18.toMutablePeriod();
        mutablePeriod26.addSeconds(26115921);
        java.lang.Object obj29 = mutablePeriod26.clone();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(periodType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) periodType30, dateTimeZone32);
        int int34 = localDateTime33.getDayOfMonth();
        int int35 = localDateTime33.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.millisOfSecond();
        int int37 = localDateTime33.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withField(dateTimeFieldType38, 190);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableDuration41, readableInstant42, periodType43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        mutablePeriod44.add(readableDuration45);
        mutablePeriod44.addSeconds(26061238);
        mutablePeriod44.addMillis((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.Duration duration53 = mutablePeriod44.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime33.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime56.copy();
        mutableDateTime56.addMinutes(0);
        mutableDateTime56.setSecondOfDay(22);
        org.joda.time.Chronology chronology62 = null;
        mutableDateTime56.setChronology(chronology62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime56.set(dateTimeFieldType64, 26069958);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(chronology67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime68.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime70 = property69.roundCeiling();
        mutableDateTime56.setTime((org.joda.time.ReadableInstant) mutableDateTime70);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(10L, (-1L), periodType74, chronology75);
        org.joda.time.Period period78 = period76.withSeconds(26071);
        int int79 = period78.getMonths();
        mutableDateTime70.add((org.joda.time.ReadablePeriod) period78);
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) mutableDateTime70);
        mutablePeriod26.add((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant83 = instant4.plus((org.joda.time.ReadableDuration) duration53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime57", (instant0.compareTo(mutableDateTime57) == 0) == instant0.equals(mutableDateTime57));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableDuration2, readableInstant3, periodType4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutablePeriod5.add(readableDuration6);
        mutablePeriod5.addSeconds(26061238);
        mutablePeriod5.addMillis((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.parse("2022-02-22T07:14:26.152Z");
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom((org.joda.time.ReadableInstant) mutableDateTime13);
        long long15 = duration14.getMillis();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property18 = localTime17.minuteOfHour();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond(894);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime17.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMonths(10);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime26 = property25.getDateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime30 = dateTime28.minusWeeks(26200565);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(readableDuration33, readableInstant34, periodType35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutablePeriod36.add(readableDuration37);
        mutablePeriod36.addYears((int) (short) 100);
        java.lang.Object obj41 = mutablePeriod36.clone();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) (short) 1, chronology44);
        java.lang.String str46 = localDate45.toString();
        org.joda.time.LocalDate localDate48 = localDate45.withYearOfEra((int) (byte) 100);
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.years();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology49);
        org.joda.time.DurationField durationField52 = chronology49.years();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.millisOfDay();
        mutablePeriod36.setPeriod(readableDuration42, chronology49);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 26156205, chronology49);
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime30, chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime51", (mutableDateTime1.compareTo(dateTime51) == 0) == mutableDateTime1.equals(dateTime51));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) '#');
        long long3 = instant2.getMillis();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        int int9 = mutableDateTime8.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableDuration10, readableInstant11, periodType12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutablePeriod13.add(readableDuration14);
        mutablePeriod13.addMonths((int) '#');
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableDuration18, readableInstant19, periodType20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutablePeriod21.add(readableDuration22);
        mutablePeriod21.addMonths((int) '#');
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
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
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration56 = duration52.toDuration();
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration56);
        java.lang.String str58 = duration56.toString();
        org.joda.time.Instant instant60 = instant2.withDurationAdded((org.joda.time.ReadableDuration) duration56, 26117532);
        long long61 = duration56.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime50", (instant0.compareTo(mutableDateTime50) == 0) == instant0.equals(mutableDateTime50));
    }
}

