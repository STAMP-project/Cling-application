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
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime4.minus(readablePeriod11);
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfMinute();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) dateTime12);
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.DateTime dateTime16 = instant14.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant14", (dateTime4.compareTo(instant14) == 0) == dateTime4.equals(instant14));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        int int22 = property20.get();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = property20.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property27 = localDate23.era();
        org.joda.time.LocalDate.Property property28 = localDate23.weekyear();
        org.joda.time.LocalDate.Property property29 = localDate23.centuryOfEra();
        int int30 = localDate23.getMonthOfYear();
        org.joda.time.LocalDate localDate32 = localDate23.plusDays(53718253);
        org.joda.time.LocalDate.Property property33 = localDate23.weekyear();
        org.joda.time.LocalDate localDate34 = property33.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.Instant instant38 = instant37.toInstant();
        long long39 = instant37.getMillis();
        org.joda.time.Chronology chronology40 = instant37.getChronology();
        org.joda.time.Chronology chronology41 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType35.getField(chronology41);
        boolean boolean43 = localDate34.isSupported(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant37", (dateTime17.compareTo(instant37) == 0) == dateTime17.equals(instant37));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) (byte) 1, 86399999);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField11 = durationFieldType6.getField(chronology8);
        long long15 = chronology8.add(1646664841829L, (long) 25, (int) (byte) 10);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = localDate16.getDayOfWeek();
        int int19 = localDate16.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) (byte) 0);
        org.joda.time.Chronology chronology27 = chronology8.withZone(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime28 = instant1.toMutableDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology29 = instant1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime31 = instant1.toMutableDateTimeISO();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = mutableDateTime31.toDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant3.plus(readableDuration4);
        org.joda.time.Instant instant8 = instant3.withDurationAdded((long) 1, 142);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTimeISO();
        org.joda.time.Instant instant12 = instant8.minus((long) 53706753);
        org.joda.time.MutableDateTime mutableDateTime13 = instant8.toMutableDateTime();
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        org.joda.time.DurationFieldType durationFieldType6 = durationField5.getType();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        long long14 = durationField10.add((long) (byte) 1, 10L);
        int int15 = durationField5.compareTo(durationField10);
        boolean boolean16 = durationField10.isSupported();
        long long19 = durationField10.getMillis(53625652, 1646664826936L);
        boolean boolean20 = instant0.equals((java.lang.Object) 1646664826936L);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant0.withDurationAdded(readableDuration21, 0);
        long long24 = instant23.getMillis();
        org.joda.time.Instant instant26 = instant23.withMillis(946690800893L);
        org.joda.time.MutableDateTime mutableDateTime27 = instant23.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant23.plus(readableDuration28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime27", (instant29.compareTo(mutableDateTime27) == 0) == instant29.equals(mutableDateTime27));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DurationField durationField23 = chronology2.minutes();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeField dateTimeField25 = chronology2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime24", (dateTime7.compareTo(dateTime24) == 0) == dateTime7.equals(dateTime24));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        org.joda.time.Instant instant3 = instant0.withMillis(0L);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.Instant instant8 = instant5.plus(1646665301852L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyear();
        org.joda.time.DurationField durationField13 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType8.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField17 = chronology10.monthOfYear();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(chronology10);
        org.joda.time.DurationField durationField19 = chronology10.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField19, and durationField13", !(durationField13.compareTo(durationField19) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField19.compareTo(durationField13))));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        long long9 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime11, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusHours(507);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy(8);
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfCeilingCopy();
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        long long31 = dateTime29.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime29.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime33, dateTimeZone34);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.plusHours(507);
        int int40 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.weekyear();
        boolean boolean42 = mutableDateTime2.equals((java.lang.Object) property41);
        org.joda.time.LocalDateTime localDateTime43 = property41.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime44 = property41.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        long long2 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant0.plus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 53656897);
        org.joda.time.Instant instant10 = instant7.withDurationAdded((long) 53682380, 53675117);
        org.joda.time.Instant instant12 = instant7.withMillis(1646664919239L);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, 53646113);
        org.joda.time.DateTime dateTime16 = instant12.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(53849522);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        boolean boolean27 = dateTime25.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime25.minusDays(0);
        java.lang.Object obj30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj30, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime34.weekyear();
        java.lang.String str36 = property35.getAsText();
        org.joda.time.DurationField durationField37 = property35.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property35.getFieldType();
        int int39 = dateTime29.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = dateTime16.withField(dateTimeFieldType38, 53731337);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime32", (instant0.compareTo(dateTime32) == 0) == instant0.equals(dateTime32));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(0);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        java.lang.String str19 = property18.getAsText();
        int int20 = property18.get();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = property18.compareTo((org.joda.time.ReadablePartial) localDate21);
        int[] intArray29 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology10.validate((org.joda.time.ReadablePartial) localDate21, intArray29);
        org.joda.time.DateTimeField dateTimeField31 = chronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField33 = chronology10.centuries();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime6.toMutableDateTime(chronology10);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime6.withDurationAdded(readableDuration35, 53702694);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and mutableDateTime34", (dateTime37.compareTo(mutableDateTime34) == 0) == dateTime37.equals(mutableDateTime34));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.minuteOfDay();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = chronology10.withZone(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDate7.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime16", (dateTime5.compareTo(dateTime16) == 0) == dateTime5.equals(dateTime16));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.LocalDate.Property property16 = localDate9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.LocalDate localDate18 = property16.withMaximumValue();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = chronology26.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.hourOfHalfday();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) dateTime23, chronology30);
        org.joda.time.DateTime dateTime34 = dateTime23.withYear(52);
        int int35 = dateTime34.getYear();
        long long36 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.Instant instant38 = instant37.toInstant();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant38.plus(readableDuration39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant40.plus(readableDuration41);
        org.joda.time.Instant instant45 = instant40.withDurationAdded((long) 1, 142);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant45.minus(readableDuration47);
        boolean boolean49 = dateTime34.isEqual((org.joda.time.ReadableInstant) instant48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant37", (dateTime21.compareTo(instant37) == 0) == dateTime21.equals(instant37));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        java.util.Locale locale8 = new java.util.Locale("2022-02-21");
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale8);
        calendar10.roll(5, 53692270);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromCalendarFields(calendar10);
        calendar10.setLenient(true);
        int int18 = calendar10.getGreatestMinimum(0);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.Instant instant20 = instant19.toInstant();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        org.joda.time.DurationFieldType durationFieldType25 = durationField24.getType();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = dateTimeField28.getDurationField();
        org.joda.time.DurationFieldType durationFieldType30 = durationField29.getType();
        long long33 = durationField29.add((long) (byte) 1, 10L);
        int int34 = durationField24.compareTo(durationField29);
        boolean boolean35 = durationField29.isSupported();
        long long38 = durationField29.getMillis(53625652, 1646664826936L);
        boolean boolean39 = instant19.equals((java.lang.Object) 1646664826936L);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant42 = instant19.withDurationAdded(readableDuration40, 0);
        long long43 = instant42.getMillis();
        org.joda.time.Instant instant45 = instant42.withMillis(946690800893L);
        org.joda.time.Instant instant48 = instant42.withDurationAdded(1646665042601L, 0);
        org.joda.time.Instant instant51 = instant42.withDurationAdded((long) 893, 53724123);
        boolean boolean52 = calendar10.after((java.lang.Object) instant42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant42", (dateTime2.compareTo(instant42) == 0) == dateTime2.equals(instant42));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DateTimeField dateTimeField23 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfDay();
        boolean boolean28 = durationFieldType24.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        int int31 = localDate30.getDayOfWeek();
        org.joda.time.LocalDate localDate33 = localDate30.withDayOfWeek(1);
        java.util.Locale locale37 = new java.util.Locale("hi!", "", "");
        java.lang.String str38 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDate33, locale37);
        java.lang.Object obj39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj39, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property44 = dateTime43.weekyear();
        java.lang.String str45 = property44.getAsText();
        int int46 = property44.get();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        int int49 = property44.compareTo((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate localDate50 = localDate33.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.months();
        boolean boolean52 = localDate33.isSupported(durationFieldType51);
        org.joda.time.DateTime dateTime53 = localDate33.toDateTimeAtCurrentTime();
        int[] intArray55 = chronology2.get((org.joda.time.ReadablePartial) localDate33, (long) 53630702);
        org.joda.time.DateTimeField dateTimeField56 = chronology2.year();
        org.joda.time.DurationField durationField57 = chronology2.weeks();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DurationField durationField59 = chronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime58", (dateTime7.compareTo(dateTime58) == 0) == dateTime7.equals(dateTime58));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DurationField durationField23 = chronology2.minutes();
        org.joda.time.DateTimeField dateTimeField24 = chronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) 1646664860124L, dateTimeZone26);
        org.joda.time.Chronology chronology28 = chronology2.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone26);
        int int31 = dateTimeZone26.getStandardOffset((long) 54043513);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime29", (dateTime7.compareTo(dateTime29) == 0) == dateTime7.equals(dateTime29));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        int int9 = dateTime6.getEra();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.plus(readableDuration10);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        int int13 = dateTime11.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        long long7 = chronology1.add((long) 2, (long) 59, 53628688);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfEra();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        int int15 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate14.withDayOfWeek(1);
        java.util.Locale locale21 = new java.util.Locale("hi!", "", "");
        java.lang.String str22 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDate17, locale21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        int int30 = property28.get();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        int int33 = property28.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate34 = localDate17.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths(32769);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.minuteOfDay();
        boolean boolean41 = durationFieldType37.isSupported(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.yearOfEra();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) localDate43, (long) (-1));
        chronology1.validate((org.joda.time.ReadablePartial) localDate34, intArray47);
        org.joda.time.DurationField durationField49 = chronology1.eras();
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DurationField durationField51 = chronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime50", (dateTime25.compareTo(dateTime50) == 0) == dateTime25.equals(dateTime50));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = dateTimeZone3.getShortName(1646664825911L, locale6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        java.lang.String str14 = property13.getAsText();
        int int15 = property13.get();
        org.joda.time.DurationField durationField16 = property13.getLeapDurationField();
        boolean boolean17 = dateTimeZone3.equals((java.lang.Object) property13);
        org.joda.time.Interval interval18 = localDate0.toInterval(dateTimeZone3);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.Instant instant20 = instant19.toInstant();
        long long21 = instant19.getMillis();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant23 = instant19.plus(readableDuration22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 53656897);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        org.joda.time.Chronology chronology29 = instant26.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.weekyearOfCentury();
        long long34 = dateTimeField31.add(1646664988467L, 53695445);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = dateTimeField31.getType();
        int int36 = localDate0.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant19", (dateTime10.compareTo(instant19) == 0) == dateTime10.equals(instant19));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        boolean boolean5 = dateTime2.equals((java.lang.Object) 2000L);
        org.joda.time.DateTime.Property property6 = dateTime2.secondOfDay();
        org.joda.time.DateTime dateTime8 = dateTime2.plusYears(53708645);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        boolean boolean15 = dateTime2.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant12.withDurationAdded(readableDuration16, 21390779);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant18", (dateTime1.compareTo(instant18) == 0) == dateTime1.equals(instant18));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(0);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        java.lang.String str19 = property18.getAsText();
        int int20 = property18.get();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = property18.compareTo((org.joda.time.ReadablePartial) localDate21);
        int[] intArray29 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology10.validate((org.joda.time.ReadablePartial) localDate21, intArray29);
        org.joda.time.DateTimeField dateTimeField31 = chronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField33 = chronology10.centuries();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime6.toMutableDateTime(chronology10);
        java.lang.Object obj35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj35, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime39.weekyear();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.DurationField durationField42 = property40.getDurationField();
        org.joda.time.DateTime dateTime43 = property40.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone45);
        org.joda.time.LocalTime localTime48 = localTime46.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localTime46.toDateTimeToday(dateTimeZone49);
        int int51 = dateTime50.getWeekyear();
        org.joda.time.DateTime dateTime52 = dateTime50.toDateTime();
        org.joda.time.DateTime.Property property53 = dateTime50.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.toDateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withHourOfDay((int) (byte) 10);
        int int58 = property40.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime59 = dateTime57.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime59.toMutableDateTime();
        int int61 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime34", (dateTime6.compareTo(mutableDateTime34) == 0) == dateTime6.equals(mutableDateTime34));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readableDuration3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(53692992);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        int int9 = dateTimeZone7.getStandardOffset(1646664876203L);
        org.joda.time.DateTime dateTime10 = dateTime6.withZone(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMillis(0);
        int int13 = dateTime12.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime12", (dateTime6.compareTo(dateTime12) == 0) == dateTime6.equals(dateTime12));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        long long2 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant0.plus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 53656897);
        org.joda.time.Instant instant10 = instant7.withDurationAdded((long) 53682380, 53675117);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(53787989);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear(21402775);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readableDuration16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        java.lang.String str16 = durationFieldType15.getName();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.joda.time.DurationField durationField22 = durationFieldType17.getField(chronology19);
        org.joda.time.DurationField durationField23 = chronology19.years();
        org.joda.time.DurationField durationField24 = durationFieldType15.getField(chronology19);
        org.joda.time.DateTime dateTime26 = dateTime14.withFieldAdded(durationFieldType15, 21377786);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfEra();
        org.joda.time.LocalDate localDate29 = property28.roundHalfCeilingCopy();
        int int30 = property28.getMinimumValue();
        org.joda.time.LocalDate localDate31 = property28.getLocalDate();
        org.joda.time.LocalDate localDate32 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate33 = property28.withMinimumValue();
        org.joda.time.LocalDate localDate35 = localDate33.withYearOfEra(53666965);
        org.joda.time.LocalDate localDate37 = localDate35.plusMonths(53905051);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.hours();
        boolean boolean40 = localDate38.isSupported(durationFieldType39);
        org.joda.time.LocalDate localDate42 = localDate38.plusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate42.minus(readablePeriod43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        int int47 = localDate45.getDayOfWeek();
        int int48 = localDate45.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate45.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        long long55 = dateTimeZone49.getMillisKeepLocal(dateTimeZone52, (long) (byte) 0);
        java.util.TimeZone timeZone56 = dateTimeZone52.toTimeZone();
        java.lang.String str58 = dateTimeZone52.getShortName(0L);
        org.joda.time.DateMidnight dateMidnight59 = localDate44.toDateMidnight(dateTimeZone52);
        java.lang.Object obj61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj61, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property66 = dateTime65.weekyear();
        java.lang.String str67 = property66.getAsText();
        int int68 = property66.get();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology70 = localDate69.getChronology();
        int int71 = property66.compareTo((org.joda.time.ReadablePartial) localDate69);
        int int72 = localDate69.size();
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology74 = localDate73.getChronology();
        int int75 = localDate73.getDayOfWeek();
        int int76 = localDate73.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = localDate73.toDateTimeAtStartOfDay(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = localDate69.toDateTimeAtCurrentTime(dateTimeZone77);
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((long) ' ', dateTimeZone77);
        org.joda.time.DateTime dateTime82 = dateMidnight59.toDateTime(dateTimeZone77);
        java.lang.Object obj83 = null;
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(obj83, dateTimeZone84);
        org.joda.time.DateTime dateTime87 = dateTime85.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property88 = dateTime87.weekyear();
        java.lang.String str89 = property88.getAsText();
        org.joda.time.DurationField durationField90 = property88.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property88.getFieldType();
        org.joda.time.DurationFieldType durationFieldType92 = dateTimeFieldType91.getDurationType();
        int int93 = dateMidnight59.get(dateTimeFieldType91);
        org.joda.time.LocalDate.Property property94 = localDate37.property(dateTimeFieldType91);
        int int95 = dateTime14.get(dateTimeFieldType91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField90", (durationField23.compareTo(durationField90) == 0) == durationField23.equals(durationField90));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(2);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        int int20 = dateTime19.getWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property22 = dateTime19.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay((int) (byte) 10);
        int int27 = dateTime24.getCenturyOfEra();
        org.joda.time.DateTime dateTime29 = dateTime24.minusDays(24);
        boolean boolean31 = dateTime29.isAfter(48L);
        int int32 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime34 = dateTime29.plusMonths(53700350);
        org.joda.time.Instant instant35 = dateTime29.toInstant();
        org.joda.time.DateTime dateTime36 = instant35.toDateTime();
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant35", (dateTime29.compareTo(instant35) == 0) == dateTime29.equals(instant35));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 3);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.minus(1646664849222L);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant1.plus(readableDuration6);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime2", (instant7.compareTo(dateTime2) == 0) == instant7.equals(dateTime2));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) (byte) 1, 86399999);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.joda.time.DurationField durationField11 = durationFieldType6.getField(chronology8);
        long long15 = chronology8.add(1646664841829L, (long) 25, (int) (byte) 10);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = localDate16.getDayOfWeek();
        int int19 = localDate16.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) (byte) 0);
        org.joda.time.Chronology chronology27 = chronology8.withZone(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime28 = instant1.toMutableDateTime(dateTimeZone20);
        int int29 = mutableDateTime28.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant2.toInstant();
        long long4 = instant2.getMillis();
        org.joda.time.Chronology chronology5 = instant2.getChronology();
        org.joda.time.Chronology chronology6 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType0.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfYear();
        java.util.Locale locale13 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale18 = new java.util.Locale("hi!", "", "");
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleAttributes();
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.DurationField durationField29 = property27.getDurationField();
        org.joda.time.DateTime dateTime30 = property27.roundHalfEvenCopy();
        boolean boolean31 = strSet21.remove((java.lang.Object) property27);
        java.lang.Object obj32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj32, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withYear(86399);
        org.joda.time.DateTime dateTime38 = dateTime36.plusDays((int) (byte) 0);
        boolean boolean39 = strSet21.remove((java.lang.Object) (byte) 0);
        java.util.Locale locale43 = new java.util.Locale("hi!", "", "");
        java.lang.String str44 = locale43.getDisplayScript();
        java.util.Locale.setDefault(locale43);
        java.lang.String str46 = locale43.getDisplayLanguage();
        java.lang.String str47 = locale43.getDisplayCountry();
        boolean boolean48 = strSet21.remove((java.lang.Object) locale43);
        java.lang.String str49 = locale13.getDisplayLanguage(locale43);
        java.lang.String str50 = locale43.getDisplayLanguage();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.minuteOfDay();
        org.joda.time.DurationField durationField54 = chronology52.months();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology52.getZone();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.secondOfDay();
        int int59 = dateTimeField57.getMinimumValue(3155695200000L);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        int int61 = dateTimeField57.getMaximumTextLength(locale60);
        java.lang.String str62 = locale43.getDisplayScript(locale60);
        java.lang.String str63 = dateTimeField9.getAsShortText((long) 53882656, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime24", (instant2.compareTo(dateTime24) == 0) == instant2.equals(dateTime24));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DateTimeField dateTimeField23 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField25 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology2.dayOfMonth();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime.Property property28 = dateTime27.hourOfDay();
        java.lang.String str29 = property28.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime27", (dateTime7.compareTo(dateTime27) == 0) == dateTime7.equals(dateTime27));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str4 = dateTimeFieldType3.getName();
        int int5 = dateTime2.get(dateTimeFieldType3);
        java.lang.String str6 = dateTimeFieldType3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        long long2 = instant0.getMillis();
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfYear();
        long long8 = chronology3.add((long) 55, 0L, 142);
        org.joda.time.DateTimeField dateTimeField9 = chronology3.hourOfHalfday();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology3);
        org.joda.time.DurationField durationField11 = chronology3.years();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        int int16 = localTime14.getMillisOfDay();
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1646664874381L, chronology17);
        org.joda.time.LocalTime localTime21 = localTime19.withMillisOfDay(53792999);
        int int22 = localTime21.getMillisOfSecond();
        int[] intArray24 = chronology3.get((org.joda.time.ReadablePartial) localTime21, (long) 175);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.months();
        org.joda.time.DurationField durationField4 = chronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.millisOfSecond();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DurationField durationField7 = chronology1.weekyears();
        org.joda.time.DurationField durationField8 = chronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.halfdays();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.DurationField durationField9 = chronology3.days();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(1646664855142L, chronology3);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) 1646664865552L);
        org.joda.time.Instant instant15 = instant13.plus(1646664849450L);
        org.joda.time.Instant instant16 = instant13.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = instant13.toMutableDateTime();
        boolean boolean18 = dateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTime dateTime20 = dateTime10.plusSeconds(335);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime17", (instant13.compareTo(mutableDateTime17) == 0) == instant13.equals(mutableDateTime17));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        boolean boolean15 = durationFieldType11.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.yearOfEra();
        org.joda.time.DurationField durationField17 = chronology13.halfdays();
        org.joda.time.DurationField durationField18 = chronology13.centuries();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(2000L, chronology13);
        org.joda.time.DurationField durationField20 = durationFieldType9.getField(chronology13);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant22 = instant21.toInstant();
        long long23 = instant21.getMillis();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant21.plus(readableDuration24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant28 = instant25.withDurationAdded(readableDuration26, 53656897);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant28.plus(readableDuration29);
        org.joda.time.Chronology chronology31 = instant28.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.monthOfYear();
        boolean boolean34 = durationFieldType9.isSupported(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        org.joda.time.Instant instant3 = instant0.withMillis(0L);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, 8);
        org.joda.time.Chronology chronology7 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.millisOfDay();
        java.lang.String str9 = dateTimeField8.toString();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        long long16 = dateTime14.getMillis();
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime18, dateTimeZone19);
        int int22 = localDateTime21.getHourOfDay();
        int int23 = localDateTime21.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withSecondOfMinute(0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusYears(53919094);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusSeconds(53817887);
        java.lang.Object obj30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj30, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime34.weekyear();
        java.lang.String str36 = property35.getAsText();
        int int37 = property35.get();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        int int40 = property35.compareTo((org.joda.time.ReadablePartial) localDate38);
        int int41 = localDate38.size();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        int int44 = localDate42.getDayOfWeek();
        int int45 = localDate42.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate38.toDateTimeAtCurrentTime(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = localDate38.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate38.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale60 = new java.util.Locale("hi!", "", "");
        java.lang.String str61 = locale60.getDisplayScript();
        java.util.Locale.setDefault(locale60);
        java.lang.String str63 = locale60.getDisplayLanguage();
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.lang.String str65 = locale60.getDisplayCountry(locale64);
        java.lang.String str66 = dateTimeZone55.getName((long) 507, locale60);
        java.util.Set<java.lang.String> strSet67 = locale60.getUnicodeLocaleKeys();
        java.lang.String str68 = dateTimeZone51.getName(1646664906724L, locale60);
        java.util.Set<java.lang.String> strSet69 = locale60.getUnicodeLocaleKeys();
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology72 = localDate71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.minuteOfDay();
        boolean boolean74 = durationFieldType70.isSupported(chronology72);
        org.joda.time.DateTimeField dateTimeField75 = chronology72.millisOfDay();
        org.joda.time.DurationField durationField76 = chronology72.millis();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate();
        int int78 = localDate77.getDayOfWeek();
        org.joda.time.LocalDate localDate80 = localDate77.withCenturyOfEra((int) 'u');
        org.joda.time.LocalDate localDate82 = localDate77.withYearOfEra(19);
        int[] intArray84 = chronology72.get((org.joda.time.ReadablePartial) localDate82, 1646664955873L);
        boolean boolean85 = strSet69.remove((java.lang.Object) intArray84);
        int int86 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDateTime29, intArray84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        long long2 = instant0.getMillis();
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusWeeks(0);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(53637875);
        long long11 = dateTimeZone8.convertLocalToUTC((long) 53651536, true);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtMidnight(dateTimeZone8);
        java.lang.String str13 = dateTimeZone8.getID();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime dateTime15 = dateTime3.withZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekyear();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType1.getField(chronology3);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(1646664840498L, chronology3);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DurationField durationField10 = chronology3.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField10, and durationField6", !(durationField6.compareTo(durationField10) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField10.compareTo(durationField6))));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekyear();
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType2.getField(chronology4);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(1646664840498L, chronology4);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.minuteOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(1646665075867L, chronology4);
        org.joda.time.DurationField durationField13 = chronology4.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField13, and durationField7", !(durationField7.compareTo(durationField13) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField13.compareTo(durationField7))));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = chronology1.secondOfDay();
        org.joda.time.DurationField durationField7 = chronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = chronology1.centuryOfEra();
        org.joda.time.DurationField durationField9 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        int int3 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime1.era();
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(70);
        int int7 = dateTime6.getYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        boolean boolean13 = dateTimeFormatter10.isParser();
        int int14 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.Chronology chronology15 = dateTimeFormatter10.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekyear();
        org.joda.time.DurationField durationField21 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter10.withChronology(chronology18);
        org.joda.time.Chronology chronology25 = chronology18.withUTC();
        org.joda.time.DateTime dateTime26 = dateTime6.withChronology(chronology18);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        boolean boolean34 = dateTime31.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property35 = dateTime31.millisOfSecond();
        boolean boolean36 = dateTime31.isAfterNow();
        org.joda.time.Chronology chronology37 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfCentury();
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.now(chronology37);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.weekyear();
        org.joda.time.DurationField durationField42 = chronology37.minutes();
        org.joda.time.DurationFieldType durationFieldType43 = durationField42.getType();
        org.joda.time.DateTime dateTime45 = dateTime26.withFieldAdded(durationFieldType43, 53712706);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField42", Math.signum(durationField21.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField21)));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 53640182);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.time.ZoneId zoneId16 = timeZone14.toZoneId();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        java.util.Calendar.Builder builder18 = builder0.setTimeZone(timeZone14);
        java.util.Calendar.Builder builder20 = builder0.setLenient(false);
        java.util.Locale locale24 = new java.util.Locale("hi!", "", "");
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale.setDefault(locale24);
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder28 = builder20.setLocale(locale24);
        java.util.Calendar calendar29 = builder20.build();
        java.util.Calendar.Builder builder33 = builder20.setWeekDate(53711024, (-1025815), 42986241);
        java.util.Calendar.Builder builder37 = builder20.setTimeOfDay(53643687, 53821410, 53702439);
        java.util.Locale locale41 = new java.util.Locale("yearOfCentury", "months", "DateTimeField[dayOfYear]");
        java.lang.String str42 = locale41.getDisplayName();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale41);
        java.util.Calendar.Builder builder44 = builder20.setLocale(locale41);
        java.util.Calendar.Builder builder48 = builder44.setDate(0, 21393135, 54210992);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar43", (calendar17.compareTo(calendar43) == 0) == calendar17.equals(calendar43));
    }
}

