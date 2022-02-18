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
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        org.joda.time.DateMidnight.Property property19 = dateMidnight11.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.DurationField durationField30 = chronology26.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance();
        calendar64.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay68 = org.joda.time.YearMonthDay.fromCalendarFields(calendar64);
        calendar64.setFirstDayOfWeek(2022);
        int int72 = calendar64.getMinimum(2);
        java.util.TimeZone timeZone73 = calendar64.getTimeZone();
        org.joda.time.Interval interval76 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime77 = interval76.getEnd();
        org.joda.time.Chronology chronology78 = interval76.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.year();
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleKeys();
        java.lang.String str82 = locale80.getDisplayCountry();
        int int83 = dateTimeField79.getMaximumTextLength(locale80);
        java.lang.String str84 = locale80.getDisplayScript();
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(locale80);
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(timeZone73, locale80);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        calendar63.setTimeZone(timeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        java.lang.String str64 = calendar63.getCalendarType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromCalendarFields(calendar19);
        boolean boolean22 = localTime20.equals((java.lang.Object) 16);
        java.lang.String str23 = localTime20.toString();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromCalendarFields(calendar24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property27 = localTime25.property(dateTimeFieldType26);
        org.joda.time.LocalTime.Property property28 = localTime20.property(dateTimeFieldType26);
        org.joda.time.LocalTime localTime30 = localTime20.plusHours((int) (short) -1);
        int int31 = localTime20.getMillisOfSecond();
        org.joda.time.DateTime dateTime32 = localTime20.toDateTimeToday();
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear(8);
        org.joda.time.DateTime dateTime36 = dateTime32.plusYears(86399);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        calendar63.set((int) '#', 19, 50, 47, 371);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getVariant();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone9, locale24);
        java.lang.String str27 = locale24.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar26", (calendar21.compareTo(calendar26) == 0) == calendar21.equals(calendar26));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        org.joda.time.DateMidnight.Property property19 = dateMidnight11.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight31", (dateMidnight14.compareTo(dateMidnight31) == 0) == dateMidnight14.equals(dateMidnight31));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTime dateTime50 = yearMonthDay4.toDateTimeAtMidnight(dateTimeZone20);
        int int51 = dateTime50.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.days();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime18.toDateTime(chronology26);
        boolean boolean28 = interval11.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDate localDate29 = dateTime27.toLocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.withYear((int) (short) -1);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 16, chronology38);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str56 = interval55.toString();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.Interval interval67 = interval59.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = yearMonthDay69.toDateTime(timeOfDay70, dateTimeZone71);
        boolean boolean73 = dateTime72.isBeforeNow();
        org.joda.time.DateTime dateTime75 = dateTime72.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime77 = dateTime75.withMinuteOfHour((int) (short) 0);
        boolean boolean78 = interval67.contains((org.joda.time.ReadableInstant) dateTime75);
        boolean boolean79 = interval55.contains((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.Interval interval81 = interval55.withPeriodBeforeEnd(readablePeriod80);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = interval55.toPeriod(periodType82);
        org.joda.time.Interval interval84 = interval52.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        long long87 = chronology38.add((org.joda.time.ReadablePeriod) period83, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod88 = period83.toMutablePeriod();
        org.joda.time.LocalDate localDate89 = localDate31.minus((org.joda.time.ReadablePeriod) period83);
        long long92 = chronology4.add((org.joda.time.ReadablePeriod) period83, (long) 35281, 306);
        org.joda.time.DurationField durationField93 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField5, and durationField6", !(durationField93.compareTo(durationField5) == 0) || (Math.signum(durationField93.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight11.withYear((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime8 = dateTime5.withMonthOfYear((int) (byte) 1);
        int int9 = dateTime5.getYear();
        org.joda.time.DateTime.Property property10 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        boolean boolean12 = dateTime11.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        org.joda.time.DateTime dateTime30 = dateTime11.withChronology(chronology27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((long) (-1), chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime30", (dateTime11.compareTo(dateTime30) == 0) == dateTime11.equals(dateTime30));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        int int19 = dateMidnight11.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        java.util.Locale.setDefault(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTime(timeOfDay39, dateTimeZone40);
        boolean boolean42 = dateTime41.isBeforeNow();
        org.joda.time.DateTime dateTime44 = dateTime41.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.DateTime dateTime50 = dateTime41.toDateTime(chronology49);
        boolean boolean51 = interval34.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay54.toDateTime(timeOfDay55, dateTimeZone56);
        boolean boolean58 = dateTime57.isBeforeNow();
        org.joda.time.DateTime dateTime60 = dateTime57.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval63 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime64 = interval63.getEnd();
        org.joda.time.Chronology chronology65 = interval63.getChronology();
        org.joda.time.DateTime dateTime66 = dateTime57.toDateTime(chronology65);
        boolean boolean67 = durationFieldType52.isSupported(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime50.toDateTime(chronology65);
        org.joda.time.DateTimeField dateTimeField69 = chronology65.halfdayOfDay();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight14.withChronology(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateMidnight31", (dateTime15.compareTo(dateMidnight31) == 0) == dateTime15.equals(dateMidnight31));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay5.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        int int17 = property9.compareTo((org.joda.time.ReadablePartial) yearMonthDay11);
        org.joda.time.Chronology chronology18 = yearMonthDay11.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getWeekOfWeekyear();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) dateTime19);
        int int22 = property3.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime19", (dateTime8.compareTo(dateTime19) == 0) == dateTime8.equals(dateTime19));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.minutes();
        org.joda.time.DurationField durationField9 = chronology5.centuries();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField9", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime dateTime7 = dateTime4.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone13);
        boolean boolean15 = dateMidnight11.isAfter((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight11.minusWeeks(4);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay25.monthOfYear();
        org.joda.time.DateTime dateTime30 = yearMonthDay25.toDateTimeAtCurrentTime();
        int int31 = property23.compareTo((org.joda.time.ReadablePartial) yearMonthDay25);
        org.joda.time.Chronology chronology32 = yearMonthDay25.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight17.withChronology(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime4.toDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and dateMidnight34", (dateMidnight17.compareTo(dateMidnight34) == 0) == dateMidnight17.equals(dateMidnight34));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime4.withWeekyear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime13.withZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar1);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay5.year();
        int[] intArray9 = yearMonthDay5.getValues();
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay5.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime18.getZone();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long47 = dateTimeZone45.previousTransition((long) 8);
        long long49 = dateTimeZone21.getMillisKeepLocal(dateTimeZone45, (long) (byte) 0);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.DateTime dateTime51 = yearMonthDay5.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(10L, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar22", (calendar1.compareTo(calendar22) == 0) == calendar1.equals(calendar22));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
        boolean boolean7 = dateMidnight3.isAfter((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusWeeks(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight26", (dateMidnight9.compareTo(dateMidnight26) == 0) == dateMidnight9.equals(dateMidnight26));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime61.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(22);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.year();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTime dateTime19 = yearMonthDay14.toDateTimeAtCurrentTime();
        int int20 = property12.compareTo((org.joda.time.ReadablePartial) yearMonthDay14);
        org.joda.time.YearMonthDay yearMonthDay21 = property12.withMinimumValue();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval32 = interval24.overlap((org.joda.time.ReadableInterval) interval29);
        org.joda.time.Duration duration33 = interval32.toDuration();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay35.toDateTime(timeOfDay36, dateTimeZone37);
        boolean boolean39 = dateTime38.isBeforeNow();
        org.joda.time.DateTime dateTime41 = dateTime38.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime43 = dateTime41.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime45 = dateTime43.minusHours((int) (byte) 100);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime43);
        int int47 = property12.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = yearMonthDay49.toDateTime(timeOfDay50, dateTimeZone51);
        org.joda.time.YearMonthDay.Property property53 = yearMonthDay49.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTime(timeOfDay56, dateTimeZone57);
        org.joda.time.YearMonthDay.Property property59 = yearMonthDay55.monthOfYear();
        org.joda.time.DateTime dateTime60 = yearMonthDay55.toDateTimeAtCurrentTime();
        int int61 = property53.compareTo((org.joda.time.ReadablePartial) yearMonthDay55);
        org.joda.time.Chronology chronology62 = yearMonthDay55.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.clockhourOfHalfday();
        org.joda.time.DurationField durationField64 = chronology62.days();
        org.joda.time.DateTime dateTime65 = dateTime43.toDateTime(chronology62);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay(dateTimeZone66);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = yearMonthDay67.toDateTime(timeOfDay68, dateTimeZone69);
        boolean boolean71 = dateTime70.isBeforeNow();
        org.joda.time.DateTime dateTime73 = dateTime70.withMonthOfYear((int) (byte) 1);
        int int74 = dateTime70.getYear();
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.DateTime dateTime77 = dateTime70.withDurationAdded(readableDuration75, (int) (short) 100);
        org.joda.time.DateTime.Property property78 = dateTime77.secondOfMinute();
        org.joda.time.DateTime dateTime81 = dateTime77.withDurationAdded((-62100742323530L), 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property83 = dateTime81.property(dateTimeFieldType82);
        boolean boolean84 = dateTime65.isSupported(dateTimeFieldType82);
        int int85 = yearMonthDay5.indexOf(dateTimeFieldType82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime65", (dateTime43.compareTo(dateTime65) == 0) == dateTime43.equals(dateTime65));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay14.property(dateTimeFieldType19);
        org.joda.time.DateTime.Property property21 = dateTime11.property(dateTimeFieldType19);
        boolean boolean22 = localDate0.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate.Property property23 = localDate0.dayOfYear();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        calendar24.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromCalendarFields(calendar24);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay28.year();
        int[] intArray32 = yearMonthDay28.getValues();
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay28.year();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay35.toDateTime(timeOfDay36, dateTimeZone37);
        boolean boolean39 = dateTime38.isBeforeNow();
        org.joda.time.DateTime dateTime41 = dateTime38.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime43 = dateTime41.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime41.getZone();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        calendar45.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromCalendarFields(calendar45);
        calendar45.setFirstDayOfWeek(2022);
        int int53 = calendar45.getMinimum(2);
        java.util.TimeZone timeZone54 = calendar45.getTimeZone();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Chronology chronology59 = interval57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.year();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleKeys();
        java.lang.String str63 = locale61.getDisplayCountry();
        int int64 = dateTimeField60.getMaximumTextLength(locale61);
        java.lang.String str65 = locale61.getDisplayScript();
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(locale61);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone54, locale61);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        long long70 = dateTimeZone68.previousTransition((long) 8);
        long long72 = dateTimeZone44.getMillisKeepLocal(dateTimeZone68, (long) (byte) 0);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.DateTime dateTime74 = yearMonthDay28.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.Interval interval75 = localDate0.toInterval(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar45", (calendar24.compareTo(calendar45) == 0) == calendar24.equals(calendar45));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        java.lang.String str10 = yearMonthDay4.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime18.getZone();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long47 = dateTimeZone45.previousTransition((long) 8);
        long long49 = dateTimeZone21.getMillisKeepLocal(dateTimeZone45, (long) (byte) 0);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone21);
        int int52 = dateTimeZone21.getStandardOffset((long) 42);
        org.joda.time.DateMidnight dateMidnight53 = yearMonthDay4.toDateMidnight(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar22", (calendar0.compareTo(calendar22) == 0) == calendar0.equals(calendar22));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.minutes();
        org.joda.time.DurationField durationField64 = chronology62.weekyears();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DurationField durationField66 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField67 = chronology62.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight53.withChronology(chronology62);
        org.joda.time.DurationField durationField69 = chronology62.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant55", (dateMidnight53.compareTo(instant55) == 0) == dateMidnight53.equals(instant55));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = dateTimeField13.getAsShortText(3, locale15);
        int int18 = dateTimeField13.getMaximumValue();
        long long21 = dateTimeField13.addWrapField((long) (-1), (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) long21, dateTimeZone22);
        boolean boolean24 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime23);
        java.util.Date date25 = dateTime23.toDate();
        long long26 = date25.getTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay28.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay34.toDateTime(timeOfDay35, dateTimeZone36);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay34.monthOfYear();
        org.joda.time.DateTime dateTime39 = yearMonthDay34.toDateTimeAtCurrentTime();
        int int40 = property32.compareTo((org.joda.time.ReadablePartial) yearMonthDay34);
        org.joda.time.Chronology chronology41 = yearMonthDay34.getChronology();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        boolean boolean43 = date25.equals((java.lang.Object) chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        calendar11.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay15 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay15.year();
        int[] intArray19 = yearMonthDay15.getValues();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay15.year();
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale23.getDisplayScript();
        java.lang.String str26 = locale23.toLanguageTag();
        java.lang.String str27 = locale23.toLanguageTag();
        java.lang.String str28 = locale22.getDisplayVariant(locale23);
        java.lang.String str29 = yearMonthDay15.toString("-0001-02-11", locale22);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone9, locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar11", (calendar0.compareTo(calendar11) == 0) == calendar0.equals(calendar11));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime29", (dateTime10.compareTo(dateTime29) == 0) == dateTime10.equals(dateTime29));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight31", (dateMidnight14.compareTo(dateMidnight31) == 0) == dateMidnight14.equals(dateMidnight31));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar.Builder builder8 = builder4.setWeekDate(99, (-1), 10);
        java.util.Calendar.Builder builder10 = builder4.setLenient(true);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        calendar11.add(3, 22);
        calendar11.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date17 = calendar11.getTime();
        calendar11.setFirstDayOfWeek(35271);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        calendar20.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields(calendar20);
        calendar20.setFirstDayOfWeek(2022);
        int int28 = calendar20.getMinimum(2);
        java.util.TimeZone timeZone29 = calendar20.getTimeZone();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Chronology chronology34 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.year();
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleKeys();
        java.lang.String str38 = locale36.getDisplayCountry();
        int int39 = dateTimeField35.getMaximumTextLength(locale36);
        java.lang.String str40 = locale36.getDisplayScript();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale36);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone29, locale36);
        calendar11.setTimeZone(timeZone29);
        java.util.Calendar.Builder builder44 = builder10.setTimeZone(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar20", (calendar11.compareTo(calendar20) == 0) == calendar11.equals(calendar20));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        java.util.Calendar.Builder builder8 = builder3.setTimeOfDay(0, 461, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.minutes();
        org.joda.time.DurationField durationField64 = chronology62.weekyears();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DurationField durationField66 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField67 = chronology62.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight53.withChronology(chronology62);
        org.joda.time.DateTimeField dateTimeField69 = chronology62.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant55", (dateMidnight53.compareTo(instant55) == 0) == dateMidnight53.equals(instant55));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        calendar0.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date6 = calendar0.getTime();
        int int7 = date6.getMinutes();
        date6.setSeconds(621);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.add(3, 22);
        java.util.Date date14 = calendar10.getTime();
        int int15 = date14.getTimezoneOffset();
        boolean boolean16 = date6.before(date14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar10", (calendar0.compareTo(calendar10) == 0) == calendar0.equals(calendar10));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getWeekYear();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        long long18 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone15);
        calendar0.set(871, 47, 49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay9 and localDate19", (yearMonthDay9.compareTo(localDate19) == 0) == yearMonthDay9.equals(localDate19));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getWeekYear();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        long long18 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay22.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay22.property(dateTimeFieldType27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay22.plusMonths((int) 'u');
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.plusYears(883);
        java.util.Locale locale35 = new java.util.Locale("Fri Feb 11 09:47:52 UTC 2022");
        java.lang.String str36 = locale35.toLanguageTag();
        java.lang.String str37 = yearMonthDay32.toString("-1", locale35);
        java.lang.String str38 = dateTimeZone15.getShortName((long) 411, locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay9 and localDate19", (yearMonthDay9.compareTo(localDate19) == 0) == yearMonthDay9.equals(localDate19));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        java.util.Calendar.Builder builder8 = builder3.setWeekDate(120003, (int) '4', 33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfHour();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        org.joda.time.DurationField durationField10 = chronology4.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay9.monthOfYear();
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        int int15 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay9);
        org.joda.time.Chronology chronology16 = yearMonthDay9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.Interval interval28 = interval20.overlap((org.joda.time.ReadableInterval) interval25);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str32 = interval31.toString();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval43 = interval35.overlap((org.joda.time.ReadableInterval) interval40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone44);
        org.joda.time.TimeOfDay timeOfDay46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = yearMonthDay45.toDateTime(timeOfDay46, dateTimeZone47);
        boolean boolean49 = dateTime48.isBeforeNow();
        org.joda.time.DateTime dateTime51 = dateTime48.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime53 = dateTime51.withMinuteOfHour((int) (short) 0);
        boolean boolean54 = interval43.contains((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean55 = interval31.contains((org.joda.time.ReadableInterval) interval43);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.Interval interval57 = interval31.withPeriodBeforeEnd(readablePeriod56);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = interval31.toPeriod(periodType58);
        org.joda.time.Interval interval60 = interval28.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period59);
        long long63 = chronology16.add((org.joda.time.ReadablePeriod) period59, (long) 'a', 4);
        org.joda.time.DurationField durationField64 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField65 = chronology16.centuryOfEra();
        org.joda.time.DateTime dateTime66 = dateMidnight1.toDateTime(chronology16);
        org.joda.time.DurationField durationField67 = chronology16.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and dateTime66", (dateMidnight1.compareTo(dateTime66) == 0) == dateMidnight1.equals(dateTime66));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromCalendarFields(calendar1);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay5.year();
        int[] intArray9 = yearMonthDay5.getValues();
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay5.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime18.getZone();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long47 = dateTimeZone45.previousTransition((long) 8);
        long long49 = dateTimeZone21.getMillisKeepLocal(dateTimeZone45, (long) (byte) 0);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.DateTime dateTime51 = yearMonthDay5.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(992L, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar22", (calendar1.compareTo(calendar22) == 0) == calendar1.equals(calendar22));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime4.weekOfWeekyear();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields(calendar13);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay21.toDateTime(timeOfDay22, dateTimeZone23);
        int int25 = dateTime24.getCenturyOfEra();
        org.joda.time.DateTime dateTime27 = dateTime24.plusMillis((int) (byte) 0);
        int int28 = dateTime27.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay30.property(dateTimeFieldType35);
        org.joda.time.DateTime.Property property37 = dateTime27.property(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.Chronology chronology41 = yearMonthDay40.getChronology();
        org.joda.time.DurationField durationField42 = durationFieldType38.getField(chronology41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay17.withFieldAdded(durationFieldType38, (int) (short) 100);
        org.joda.time.DateTime dateTime45 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay17);
        int int46 = dateTime4.getWeekyear();
        org.joda.time.DateTime.Property property47 = dateTime4.minuteOfHour();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance();
        calendar48.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay52 = org.joda.time.YearMonthDay.fromCalendarFields(calendar48);
        calendar48.setFirstDayOfWeek(2022);
        int int56 = calendar48.getMinimum(2);
        java.util.TimeZone timeZone57 = calendar48.getTimeZone();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.year();
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleKeys();
        java.lang.String str66 = locale64.getDisplayCountry();
        int int67 = dateTimeField63.getMaximumTextLength(locale64);
        java.lang.String str68 = locale64.getDisplayScript();
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(locale64);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone57, locale64);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        long long73 = dateTimeZone71.previousTransition((long) 8);
        java.lang.String str74 = dateTimeZone71.toString();
        java.util.TimeZone timeZone75 = dateTimeZone71.toTimeZone();
        long long79 = dateTimeZone71.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone80 = dateTimeZone71.toTimeZone();
        org.joda.time.DateTime dateTime81 = dateTime4.toDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar48", (calendar13.compareTo(calendar48) == 0) == calendar13.equals(calendar48));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        boolean boolean12 = interval2.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        int int21 = dateTime17.getYear();
        org.joda.time.DateTime.Property property22 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfDay();
        int int25 = dateTime23.getSecondOfDay();
        int int26 = dateTime23.getSecondOfMinute();
        int int27 = dateTime23.getDayOfMonth();
        boolean boolean28 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime23);
        int int29 = dateTime23.getMonthOfYear();
        org.joda.time.DateTime dateTime31 = dateTime23.withYear(19);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.TimeOfDay timeOfDay36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = yearMonthDay35.toDateTime(timeOfDay36, dateTimeZone37);
        int int39 = dateTime38.getCenturyOfEra();
        org.joda.time.DateTime dateTime41 = dateTime38.plusMillis((int) (byte) 0);
        int int42 = dateTime41.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTime(timeOfDay45, dateTimeZone46);
        org.joda.time.YearMonthDay.Property property48 = yearMonthDay44.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay44.property(dateTimeFieldType49);
        org.joda.time.DateTime.Property property51 = dateTime41.property(dateTimeFieldType49);
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType49.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.Chronology chronology55 = yearMonthDay54.getChronology();
        org.joda.time.DurationField durationField56 = durationFieldType52.getField(chronology55);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(chronology55);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (-1), chronology55);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((-62100742311688L), chronology55);
        org.joda.time.DateTimeField dateTimeField60 = chronology55.dayOfYear();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTime dateTime62 = dateTime23.withChronology(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime61", (dateTime17.compareTo(dateTime61) == 0) == dateTime17.equals(dateTime61));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Interval interval4 = interval2.withDurationBeforeEnd(readableDuration3);
        org.joda.time.Interval interval5 = interval4.toInterval();
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(0);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        int int63 = dateTime6.get(dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime62 = interval61.getEnd();
        org.joda.time.Chronology chronology63 = interval61.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.minutes();
        org.joda.time.DurationField durationField65 = chronology63.weekyears();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology63);
        org.joda.time.DurationField durationField67 = chronology63.days();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.dayOfYear();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((java.lang.Object) dateTime58, chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField57 and durationField67", (durationField57.compareTo(durationField67) == 0) == durationField57.equals(durationField67));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property63 = dateTime62.era();
        org.joda.time.DateTime dateTime65 = dateTime62.minusYears(44);
        int int66 = dateTime65.getMonthOfYear();
        boolean boolean67 = dateTime58.isEqual((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = yearMonthDay69.toDateTime(timeOfDay70, dateTimeZone71);
        org.joda.time.YearMonthDay.Property property73 = yearMonthDay69.monthOfYear();
        java.lang.String str74 = property73.toString();
        java.lang.String str75 = property73.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property73.getFieldType();
        org.joda.time.DateTime.Property property77 = dateTime65.property(dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Interval interval4 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.Chronology chronology6 = interval4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.minutes();
        org.joda.time.DurationField durationField8 = chronology6.weekyears();
        org.joda.time.DurationField durationField9 = chronology6.millis();
        org.joda.time.DurationField durationField10 = chronology6.months();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 70, chronology6);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology6);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField29 = chronology27.days();
        org.joda.time.DurationField durationField30 = chronology27.millis();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay12.withChronologyRetainFields(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField30", (durationField9.compareTo(durationField30) == 0) == durationField9.equals(durationField30));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        java.util.Calendar.Builder builder8 = builder3.setWeekDate(16, 35335, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        int int7 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusYears(2022);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.Interval interval23 = interval15.overlap((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Duration duration24 = interval23.toDuration();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (byte) 100);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration24, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Duration duration38 = duration24.toDuration();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime11.minus((org.joda.time.ReadableDuration) duration24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Interval interval4 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.Chronology chronology6 = interval4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.minutes();
        org.joda.time.DurationField durationField8 = chronology6.weekyears();
        org.joda.time.DurationField durationField9 = chronology6.millis();
        org.joda.time.DurationField durationField10 = chronology6.months();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 70, chronology6);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology6);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DurationField durationField14 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField7, and durationField8", !(durationField14.compareTo(durationField7) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology4.years();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime7.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime7.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        java.lang.Integer int14 = dateTimeFormatter13.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter13.withPivotYear(44);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale18.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter13.withLocale(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        boolean boolean29 = dateTime28.isBeforeNow();
        org.joda.time.DateTime dateTime31 = dateTime28.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime31.getZone();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance();
        calendar35.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay39 = org.joda.time.YearMonthDay.fromCalendarFields(calendar35);
        calendar35.setFirstDayOfWeek(2022);
        int int43 = calendar35.getMinimum(2);
        java.util.TimeZone timeZone44 = calendar35.getTimeZone();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.year();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleKeys();
        java.lang.String str53 = locale51.getDisplayCountry();
        int int54 = dateTimeField50.getMaximumTextLength(locale51);
        java.lang.String str55 = locale51.getDisplayScript();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(locale51);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone44, locale51);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        long long60 = dateTimeZone58.previousTransition((long) 8);
        long long62 = dateTimeZone34.getMillisKeepLocal(dateTimeZone58, (long) (byte) 0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 35277, dateTimeZone58);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter21.withZone(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.YearMonthDay yearMonthDay67 = new org.joda.time.YearMonthDay(dateTimeZone66);
        org.joda.time.TimeOfDay timeOfDay68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = yearMonthDay67.toDateTime(timeOfDay68, dateTimeZone69);
        boolean boolean71 = dateTime70.isBeforeNow();
        org.joda.time.DateTime dateTime73 = dateTime70.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime75 = dateTime73.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime73.getZone();
        int int78 = dateTimeZone76.getStandardOffset((long) 13);
        long long82 = dateTimeZone76.convertLocalToUTC(229L, false, (long) 49);
        int int84 = dateTimeZone76.getOffset(0L);
        boolean boolean86 = dateTimeZone76.isStandardOffset((long) 35275);
        org.joda.time.YearMonthDay yearMonthDay87 = new org.joda.time.YearMonthDay(dateTimeZone76);
        long long89 = dateTimeZone58.getMillisKeepLocal(dateTimeZone76, (long) 79);
        org.joda.time.DateTime dateTime90 = yearMonthDay10.toDateTimeAtMidnight(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar9 and calendar56", (gregorianCalendar9.compareTo(calendar56) == 0) == gregorianCalendar9.equals(calendar56));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        org.joda.time.LocalTime localTime9 = localTime6.minusSeconds(183);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        int int50 = dateTimeZone44.getOffsetFromLocal(8L);
        org.joda.time.DateTime dateTime51 = localTime9.toDateTimeToday(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar42", (calendar0.compareTo(calendar42) == 0) == calendar0.equals(calendar42));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight31", (dateMidnight14.compareTo(dateMidnight31) == 0) == dateMidnight14.equals(dateMidnight31));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        boolean boolean41 = locale40.hasExtensions();
        boolean boolean42 = locale40.hasExtensions();
        java.lang.String str43 = locale40.toLanguageTag();
        java.util.Calendar.Builder builder44 = builder4.setLocale(locale40);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        calendar45.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromCalendarFields(calendar45);
        calendar45.setFirstDayOfWeek(2022);
        int int53 = calendar45.getMinimum(2);
        java.util.TimeZone timeZone54 = calendar45.getTimeZone();
        java.util.Date date55 = calendar45.getTime();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        calendar56.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromCalendarFields(calendar56);
        calendar56.setFirstDayOfWeek(2022);
        int int64 = calendar56.getMinimum(2);
        java.util.TimeZone timeZone65 = calendar56.getTimeZone();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.year();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str74 = locale72.getDisplayCountry();
        int int75 = dateTimeField71.getMaximumTextLength(locale72);
        java.lang.String str76 = locale72.getDisplayScript();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone65, locale72);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.lang.String str81 = locale80.getVariant();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone65, locale80);
        calendar45.setTimeZone(timeZone65);
        java.util.Calendar.Builder builder84 = builder44.setTimeZone(timeZone65);
        java.util.Calendar.Builder builder88 = builder84.setWeekDate(160, 444, 44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar82", (calendar26.compareTo(calendar82) == 0) == calendar26.equals(calendar82));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = locale31.getDisplayCountry();
        int int34 = dateTimeField30.getMaximumTextLength(locale31);
        java.lang.String str35 = locale31.getVariant();
        java.lang.String str36 = locale31.getCountry();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone9, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar24", (calendar21.compareTo(calendar24) == 0) == calendar21.equals(calendar24));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        long long50 = dateTimeZone10.nextTransition((long) 35297);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long25 = dateTimeZone23.previousTransition((long) 8);
        java.lang.String str26 = dateTimeZone23.toString();
        java.util.TimeZone timeZone27 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone32 = dateTimeZone23.toTimeZone();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar33", (calendar21.compareTo(calendar33) == 0) == calendar21.equals(calendar33));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        int int5 = calendar0.getFirstDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now();
        long long10 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateMidnight dateMidnight11 = property8.roundHalfEvenCopy();
        boolean boolean12 = calendar0.after((java.lang.Object) dateMidnight11);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields(calendar13);
        calendar13.setFirstDayOfWeek(2022);
        int int21 = calendar13.getMinimum(2);
        java.util.TimeZone timeZone22 = calendar13.getTimeZone();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = locale29.getDisplayCountry();
        int int32 = dateTimeField28.getMaximumTextLength(locale29);
        java.lang.String str33 = locale29.getDisplayScript();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale29);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone22, locale29);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone22);
        calendar0.setTimeZone(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar34 and calendar36", (calendar34.compareTo(calendar36) == 0) == calendar34.equals(calendar36));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        long long50 = dateTimeZone10.nextTransition((long) 35297);
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now();
        int int52 = dateMidnight51.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight51.withYearOfCentury((int) (short) 1);
        long long55 = dateMidnight51.getMillis();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight51.plus((long) 32769);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance();
        calendar58.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay62 = org.joda.time.YearMonthDay.fromCalendarFields(calendar58);
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay62.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property65 = yearMonthDay62.monthOfYear();
        int int67 = yearMonthDay62.getValue((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        boolean boolean71 = dateTimeZone69.isStandardOffset(743L);
        org.joda.time.Interval interval72 = yearMonthDay62.toInterval(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime73 = dateMidnight57.toMutableDateTime(dateTimeZone69);
        long long75 = dateTimeZone10.getMillisKeepLocal(dateTimeZone69, (-525628200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime8 = dateTime5.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        int int13 = dateTimeZone11.getStandardOffset((long) 13);
        long long17 = dateTimeZone11.convertLocalToUTC(229L, false, (long) 49);
        long long20 = dateTimeZone11.convertLocalToUTC(229L, true);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getVariant();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone31, locale46);
        java.lang.String str49 = dateTimeZone11.getShortName((long) 371, locale46);
        long long51 = dateTimeZone11.nextTransition((long) 35297);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 597, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar48", (calendar43.compareTo(calendar48) == 0) == calendar43.equals(calendar48));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight31", (dateMidnight14.compareTo(dateMidnight31) == 0) == dateMidnight14.equals(dateMidnight31));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar23", (calendar21.compareTo(calendar23) == 0) == calendar21.equals(calendar23));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        org.joda.time.LocalTime localTime6 = localTime1.minusMinutes(22);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 55);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        java.lang.String str12 = localDate9.toString("1");
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        calendar24.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromCalendarFields(calendar24);
        calendar24.setFirstDayOfWeek(2022);
        int int32 = calendar24.getMinimum(2);
        java.util.TimeZone timeZone33 = calendar24.getTimeZone();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.lang.String str42 = locale40.getDisplayCountry();
        int int43 = dateTimeField39.getMaximumTextLength(locale40);
        java.lang.String str44 = locale40.getDisplayScript();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale40);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone33, locale40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long49 = dateTimeZone47.previousTransition((long) 8);
        long long51 = dateTimeZone23.getMillisKeepLocal(dateTimeZone47, (long) (byte) 0);
        org.joda.time.DateTime dateTime52 = localDate9.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(52L, dateTimeZone23);
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str57 = interval56.toString();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime66 = interval65.getEnd();
        org.joda.time.Chronology chronology67 = interval65.getChronology();
        org.joda.time.Interval interval68 = interval60.overlap((org.joda.time.ReadableInterval) interval65);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay(dateTimeZone69);
        org.joda.time.TimeOfDay timeOfDay71 = null;
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = yearMonthDay70.toDateTime(timeOfDay71, dateTimeZone72);
        boolean boolean74 = dateTime73.isBeforeNow();
        org.joda.time.DateTime dateTime76 = dateTime73.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime78 = dateTime76.withMinuteOfHour((int) (short) 0);
        boolean boolean79 = interval68.contains((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean80 = interval56.contains((org.joda.time.ReadableInterval) interval68);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.Interval interval82 = interval56.withPeriodBeforeEnd(readablePeriod81);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = interval56.toPeriod(periodType83);
        org.joda.time.LocalDate localDate86 = localDate53.withPeriodAdded((org.joda.time.ReadablePeriod) period84, 538);
        org.joda.time.MutablePeriod mutablePeriod87 = period84.toMutablePeriod();
        org.joda.time.LocalTime localTime88 = localTime6.minus((org.joda.time.ReadablePeriod) mutablePeriod87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar45", (calendar0.compareTo(calendar45) == 0) == calendar0.equals(calendar45));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        int int17 = property15.getMaximumTextLength(locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone9, locale16);
        calendar18.set(371, (int) (short) 10, (int) (byte) 10, 857, 35280);
        calendar18.set(876, 11, 292278994, 453, (int) ' ');
        java.util.Calendar calendar31 = java.util.Calendar.getInstance();
        calendar31.add(3, 22);
        java.util.Date date35 = calendar31.getTime();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        boolean boolean41 = dateTime40.isBeforeNow();
        org.joda.time.DateTime dateTime43 = dateTime40.withMonthOfYear((int) (byte) 1);
        int int44 = dateTime40.getYear();
        org.joda.time.DateTime.Property property45 = dateTime40.weekyear();
        org.joda.time.DateTime dateTime46 = property45.withMaximumValue();
        org.joda.time.DateTime dateTime47 = property45.roundHalfCeilingCopy();
        java.util.Date date48 = dateTime47.toDate();
        int int49 = date48.getDate();
        org.joda.time.YearMonthDay yearMonthDay50 = org.joda.time.YearMonthDay.fromDateFields(date48);
        boolean boolean51 = date35.before(date48);
        date48.setSeconds(1970);
        java.time.Instant instant54 = date48.toInstant();
        calendar18.setTime(date48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar31", (calendar0.compareTo(calendar31) == 0) == calendar0.equals(calendar31));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = property3.addNoWrapToCopy(35272);
        org.joda.time.LocalTime localTime7 = property3.roundCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        java.lang.Integer int12 = dateTimeFormatter11.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter11.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withPivotYear(44);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter11.withLocale(locale16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter19.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        boolean boolean27 = dateTime26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = dateTime26.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime29.getZone();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance();
        calendar33.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay37 = org.joda.time.YearMonthDay.fromCalendarFields(calendar33);
        calendar33.setFirstDayOfWeek(2022);
        int int41 = calendar33.getMinimum(2);
        java.util.TimeZone timeZone42 = calendar33.getTimeZone();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Chronology chronology47 = interval45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.year();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleKeys();
        java.lang.String str51 = locale49.getDisplayCountry();
        int int52 = dateTimeField48.getMaximumTextLength(locale49);
        java.lang.String str53 = locale49.getDisplayScript();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(locale49);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone42, locale49);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long58 = dateTimeZone56.previousTransition((long) 8);
        long long60 = dateTimeZone32.getMillisKeepLocal(dateTimeZone56, (long) (byte) 0);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 35277, dateTimeZone56);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter19.withZone(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) 495, dateTimeZone56);
        org.joda.time.DateTime dateTime65 = localTime7.toDateTimeToday(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar54", (calendar0.compareTo(calendar54) == 0) == calendar0.equals(calendar54));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTime dateTime50 = yearMonthDay4.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        calendar4.setFirstDayOfWeek(23);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears(379);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.LocalDate localDate62 = dateTime58.toLocalDate();
        org.joda.time.LocalDate.Property property63 = localDate62.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Interval interval4 = interval2.withDurationBeforeEnd(readableDuration3);
        org.joda.time.Interval interval5 = interval4.toInterval();
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(0);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.TimeOfDay timeOfDay11 = dateTime6.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now();
        int int2 = dateMidnight1.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withYearOfCentury((int) (short) 1);
        long long5 = dateMidnight1.getMillis();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight1.plus((long) 32769);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        calendar8.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromCalendarFields(calendar8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay12.monthOfYear();
        int int17 = yearMonthDay12.getValue((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        boolean boolean21 = dateTimeZone19.isStandardOffset(743L);
        org.joda.time.Interval interval22 = yearMonthDay12.toInterval(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight7.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(1641894487215L, dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and mutableDateTime23", (dateMidnight1.compareTo(mutableDateTime23) == 0) == dateMidnight1.equals(mutableDateTime23));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        java.util.Date date10 = calendar0.getTime();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        calendar11.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay15 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
        calendar11.setFirstDayOfWeek(2022);
        int int19 = calendar11.getMinimum(2);
        java.util.TimeZone timeZone20 = calendar11.getTimeZone();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayCountry();
        int int30 = dateTimeField26.getMaximumTextLength(locale27);
        java.lang.String str31 = locale27.getDisplayScript();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale27);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone20, locale27);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.lang.String str36 = locale35.getVariant();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone20, locale35);
        calendar0.setTimeZone(timeZone20);
        calendar0.clear(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar37", (calendar32.compareTo(calendar37) == 0) == calendar32.equals(calendar37));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
        boolean boolean7 = dateMidnight3.isAfter((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusWeeks(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.withChronology(chronology24);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight26", (dateMidnight9.compareTo(dateMidnight26) == 0) == dateMidnight9.equals(dateMidnight26));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay14.property(dateTimeFieldType19);
        org.joda.time.DateTime.Property property21 = dateTime11.property(dateTimeFieldType19);
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType19.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.Chronology chronology25 = yearMonthDay24.getChronology();
        org.joda.time.DurationField durationField26 = durationFieldType22.getField(chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        java.lang.String str28 = chronology27.toString();
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(0L, 1L);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 16, chronology38);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str56 = interval55.toString();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.Interval interval67 = interval59.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = yearMonthDay69.toDateTime(timeOfDay70, dateTimeZone71);
        boolean boolean73 = dateTime72.isBeforeNow();
        org.joda.time.DateTime dateTime75 = dateTime72.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime77 = dateTime75.withMinuteOfHour((int) (short) 0);
        boolean boolean78 = interval67.contains((org.joda.time.ReadableInstant) dateTime75);
        boolean boolean79 = interval55.contains((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.Interval interval81 = interval55.withPeriodBeforeEnd(readablePeriod80);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = interval55.toPeriod(periodType82);
        org.joda.time.Interval interval84 = interval52.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        long long87 = chronology38.add((org.joda.time.ReadablePeriod) period83, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod88 = period83.toMutablePeriod();
        org.joda.time.Interval interval89 = interval32.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        boolean boolean90 = interval32.containsNow();
        org.joda.time.Period period91 = interval32.toPeriod();
        java.lang.String str92 = period91.toString();
        long long95 = chronology27.add((org.joda.time.ReadablePeriod) period91, (long) 706, (-1));
        org.joda.time.DateTime dateTime96 = dateTime3.plus((org.joda.time.ReadablePeriod) period91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        boolean boolean41 = locale40.hasExtensions();
        boolean boolean42 = locale40.hasExtensions();
        java.lang.String str43 = locale40.toLanguageTag();
        java.util.Calendar.Builder builder44 = builder4.setLocale(locale40);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        calendar45.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromCalendarFields(calendar45);
        calendar45.setFirstDayOfWeek(2022);
        int int53 = calendar45.getMinimum(2);
        java.util.TimeZone timeZone54 = calendar45.getTimeZone();
        java.util.Date date55 = calendar45.getTime();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        calendar56.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromCalendarFields(calendar56);
        calendar56.setFirstDayOfWeek(2022);
        int int64 = calendar56.getMinimum(2);
        java.util.TimeZone timeZone65 = calendar56.getTimeZone();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.year();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str74 = locale72.getDisplayCountry();
        int int75 = dateTimeField71.getMaximumTextLength(locale72);
        java.lang.String str76 = locale72.getDisplayScript();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone65, locale72);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.lang.String str81 = locale80.getVariant();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone65, locale80);
        calendar45.setTimeZone(timeZone65);
        java.util.Calendar.Builder builder84 = builder44.setTimeZone(timeZone65);
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar82", (calendar26.compareTo(calendar82) == 0) == calendar26.equals(calendar82));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.property(dateTimeFieldType6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        int int9 = property7.getMaximumTextLength(locale8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromCalendarFields(calendar10);
        calendar10.setFirstDayOfWeek(2022);
        int int18 = calendar10.getMinimum(2);
        java.util.TimeZone timeZone19 = calendar10.getTimeZone();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.lang.String str28 = locale26.getDisplayCountry();
        int int29 = dateTimeField25.getMaximumTextLength(locale26);
        java.lang.String str30 = locale26.getDisplayScript();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone19, locale26);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.lang.String str35 = locale34.getVariant();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone19, locale34);
        java.lang.String str37 = locale34.getDisplayName();
        int int38 = property7.getMaximumTextLength(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar36", (calendar31.compareTo(calendar36) == 0) == calendar31.equals(calendar36));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getVariant();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone9, locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar26", (calendar21.compareTo(calendar26) == 0) == calendar21.equals(calendar26));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(44);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        calendar24.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromCalendarFields(calendar24);
        calendar24.setFirstDayOfWeek(2022);
        int int32 = calendar24.getMinimum(2);
        java.util.TimeZone timeZone33 = calendar24.getTimeZone();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.lang.String str42 = locale40.getDisplayCountry();
        int int43 = dateTimeField39.getMaximumTextLength(locale40);
        java.lang.String str44 = locale40.getDisplayScript();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale40);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone33, locale40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long49 = dateTimeZone47.previousTransition((long) 8);
        long long51 = dateTimeZone23.getMillisKeepLocal(dateTimeZone47, (long) (byte) 0);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 35277, dateTimeZone47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter10.withZone(dateTimeZone47);
        org.joda.time.format.DateTimePrinter dateTimePrinter55 = dateTimeFormatter10.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTime(timeOfDay58, dateTimeZone59);
        boolean boolean61 = dateTime60.isBeforeNow();
        org.joda.time.DateTime dateTime63 = dateTime60.withMonthOfYear((int) (byte) 1);
        int int64 = dateTime60.getYear();
        org.joda.time.DateTime.Property property65 = dateTime60.weekyear();
        org.joda.time.DateTime dateTime66 = property65.withMaximumValue();
        org.joda.time.DateTime dateTime67 = property65.roundHalfCeilingCopy();
        int int68 = property65.get();
        org.joda.time.DateTime dateTime69 = property65.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime72 = dateTime69.withZone(dateTimeZone71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter10.withZone(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and dateTime72", (dateTime67.compareTo(dateTime72) == 0) == dateTime67.equals(dateTime72));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        java.util.Calendar.Builder builder6 = builder3.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        boolean boolean67 = dateTime66.isBeforeNow();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        boolean boolean75 = dateTime74.isBeforeNow();
        org.joda.time.DateTime dateTime77 = dateTime74.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Chronology chronology82 = interval80.getChronology();
        org.joda.time.DateTime dateTime83 = dateTime74.toDateTime(chronology82);
        boolean boolean84 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property86 = dateTime66.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.minutes();
        org.joda.time.DurationField durationField64 = chronology62.weekyears();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DurationField durationField66 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField67 = chronology62.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight53.withChronology(chronology62);
        org.joda.time.DateMidnight.Property property69 = dateMidnight53.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant55 and dateMidnight53", (instant55.compareTo(dateMidnight53) == 0) == instant55.equals(dateMidnight53));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getWeekYear();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        long long18 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone15);
        org.joda.time.LocalDate localDate21 = localDate19.minusYears(896);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.year();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 81, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        int int5 = calendar0.getFirstDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now();
        long long10 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateMidnight dateMidnight11 = property8.roundHalfEvenCopy();
        boolean boolean12 = calendar0.after((java.lang.Object) dateMidnight11);
        calendar0.clear();
        calendar0.clear();
        java.time.Instant instant15 = calendar0.toInstant();
        java.util.Calendar.Builder builder16 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder20 = builder16.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        java.lang.String str47 = dateTimeZone44.toString();
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        java.util.Calendar.Builder builder49 = builder20.setTimeZone(timeZone48);
        java.util.Calendar.Builder builder53 = builder20.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder55 = builder20.setLenient(true);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        calendar56.add(3, 22);
        java.util.Date date60 = calendar56.getTime();
        long long61 = calendar56.getTimeInMillis();
        java.util.TimeZone timeZone62 = calendar56.getTimeZone();
        java.util.Calendar.Builder builder63 = builder55.setTimeZone(timeZone62);
        calendar0.setTimeZone(timeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar56", (calendar21.compareTo(calendar56) == 0) == calendar21.equals(calendar56));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DurationField durationField8 = chronology4.months();
        org.joda.time.DurationField durationField9 = chronology4.months();
        org.joda.time.DurationField durationField10 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime10.minusMillis(7);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, (int) '#');
        org.joda.time.DateTime.Property property17 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundFloorCopy();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property22 = localDate19.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        int int28 = dateTime27.getCenturyOfEra();
        org.joda.time.DateTime dateTime30 = dateTime27.plusMillis((int) (byte) 0);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = yearMonthDay33.toDateTime(timeOfDay34, dateTimeZone35);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay33.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property39 = yearMonthDay33.property(dateTimeFieldType38);
        org.joda.time.DateTime.Property property40 = dateTime30.property(dateTimeFieldType38);
        boolean boolean41 = localDate19.isSupported(dateTimeFieldType38);
        boolean boolean42 = dateTime18.isSupported(dateTimeFieldType38);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTime(timeOfDay45, dateTimeZone46);
        boolean boolean48 = dateTime47.isBeforeNow();
        org.joda.time.DateTime dateTime50 = dateTime47.withMonthOfYear((int) (byte) 1);
        int int51 = dateTime47.getYear();
        org.joda.time.DateTime.Property property52 = dateTime47.weekyear();
        org.joda.time.DateTime dateTime53 = property52.withMaximumValue();
        boolean boolean54 = dateTime53.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTime(timeOfDay57, dateTimeZone58);
        org.joda.time.YearMonthDay.Property property60 = yearMonthDay56.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay(dateTimeZone61);
        org.joda.time.TimeOfDay timeOfDay63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTime(timeOfDay63, dateTimeZone64);
        org.joda.time.YearMonthDay.Property property66 = yearMonthDay62.monthOfYear();
        org.joda.time.DateTime dateTime67 = yearMonthDay62.toDateTimeAtCurrentTime();
        int int68 = property60.compareTo((org.joda.time.ReadablePartial) yearMonthDay62);
        org.joda.time.Chronology chronology69 = yearMonthDay62.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.halfdays();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.era();
        org.joda.time.DateTime dateTime72 = dateTime53.withChronology(chronology69);
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType38.getField(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime72", (dateTime10.compareTo(dateTime72) == 0) == dateTime10.equals(dateTime72));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar.Builder builder8 = builder0.setWeekDate(6, 99, 784);
        java.util.Calendar.Builder builder12 = builder0.setDate(2698, 8, 1970);
        java.util.Calendar.Builder builder15 = builder12.set(7, 934);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        calendar16.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromCalendarFields(calendar16);
        calendar16.setFirstDayOfWeek(2022);
        int int24 = calendar16.getMinimum(2);
        java.util.TimeZone timeZone25 = calendar16.getTimeZone();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.year();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.lang.String str34 = locale32.getDisplayCountry();
        int int35 = dateTimeField31.getMaximumTextLength(locale32);
        java.lang.String str36 = locale32.getDisplayScript();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale32);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone25, locale32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.lang.String str41 = locale40.getVariant();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone25, locale40);
        java.util.Calendar.Builder builder43 = builder12.setTimeZone(timeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar42", (calendar37.compareTo(calendar42) == 0) == calendar37.equals(calendar42));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime.Property property31 = dateTime10.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime30", (dateTime29.compareTo(mutableDateTime30) == 0) == dateTime29.equals(mutableDateTime30));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) (byte) 0);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay12.property(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime9.property(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology23);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-62100742311688L), chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime dateTime31 = dateTime29.plus((long) 6);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillisOfDay(35279);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay7.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean18 = yearMonthDay7.isSupported(dateTimeFieldType17);
        org.joda.time.DateMidnight dateMidnight19 = yearMonthDay7.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay7.plusDays(25);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean38 = dateTime36.isSupported(dateTimeFieldType37);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.DateTime.Property property40 = dateTime28.property(dateTimeFieldType37);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay43.toDateTime(timeOfDay44, dateTimeZone45);
        int int47 = dateTime46.getYearOfCentury();
        org.joda.time.DateTime dateTime49 = dateTime46.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTime dateTime51 = dateTime46.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime52 = dateTime51.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime55 = dateTime52.withFieldAdded(durationFieldType53, 0);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTime(timeOfDay58, dateTimeZone59);
        org.joda.time.YearMonthDay.Property property61 = yearMonthDay57.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        org.joda.time.YearMonthDay.Property property67 = yearMonthDay63.monthOfYear();
        org.joda.time.DateTime dateTime68 = yearMonthDay63.toDateTimeAtCurrentTime();
        int int69 = property61.compareTo((org.joda.time.ReadablePartial) yearMonthDay63);
        org.joda.time.Chronology chronology70 = yearMonthDay63.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.dayOfWeek();
        org.joda.time.DurationField durationField72 = durationFieldType53.getField(chronology70);
        boolean boolean73 = durationFieldType41.isSupported(chronology70);
        org.joda.time.DateTimeField dateTimeField74 = chronology70.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight(chronology70);
        org.joda.time.YearMonthDay yearMonthDay76 = new org.joda.time.YearMonthDay((java.lang.Object) yearMonthDay7, chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight19 and dateMidnight75", (dateMidnight19.compareTo(dateMidnight75) == 0) == dateMidnight19.equals(dateMidnight75));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        calendar0.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date6 = calendar0.getTime();
        java.time.Instant instant7 = calendar0.toInstant();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        calendar8.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromCalendarFields(calendar8);
        calendar8.setFirstDayOfWeek(2022);
        int int16 = calendar8.getMinimum(2);
        java.util.TimeZone timeZone17 = calendar8.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        int int25 = dateTimeField24.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay27.withYear(22);
        int int32 = yearMonthDay27.size();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance();
        calendar33.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay37 = org.joda.time.YearMonthDay.fromCalendarFields(calendar33);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay37.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay37.year();
        int[] intArray41 = yearMonthDay37.getValues();
        int int42 = dateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay27, intArray41);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate45 = localDate43.withYearOfCentury(10);
        org.joda.time.LocalDate localDate47 = localDate45.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = yearMonthDay49.toDateTime(timeOfDay50, dateTimeZone51);
        org.joda.time.YearMonthDay.Property property53 = yearMonthDay49.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTime(timeOfDay56, dateTimeZone57);
        org.joda.time.YearMonthDay.Property property59 = yearMonthDay55.monthOfYear();
        org.joda.time.DateTime dateTime60 = yearMonthDay55.toDateTimeAtCurrentTime();
        int int61 = property53.compareTo((org.joda.time.ReadablePartial) yearMonthDay55);
        org.joda.time.Chronology chronology62 = yearMonthDay55.getChronology();
        org.joda.time.YearMonthDay yearMonthDay64 = yearMonthDay55.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean66 = yearMonthDay55.isSupported(dateTimeFieldType65);
        boolean boolean67 = localDate47.isSupported(dateTimeFieldType65);
        java.util.Locale locale69 = java.util.Locale.UK;
        java.lang.String str70 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDate47, 9, locale69);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone17, locale69);
        calendar0.setTimeZone(timeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar33", (calendar8.compareTo(calendar33) == 0) == calendar8.equals(calendar33));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        int int6 = dateTime5.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMillis((int) (byte) 0);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay11.property(dateTimeFieldType16);
        org.joda.time.DateTime.Property property18 = dateTime8.property(dateTimeFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType16.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.Chronology chronology22 = yearMonthDay21.getChronology();
        org.joda.time.DurationField durationField23 = durationFieldType19.getField(chronology22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(chronology22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (-1), chronology22);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.minutes();
        org.joda.time.DurationField durationField32 = chronology30.weekyears();
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.joda.time.DurationField durationField34 = chronology30.months();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.weekyear();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime25.toMutableDateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField34", (durationField23.compareTo(durationField34) == 0) == durationField23.equals(durationField34));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear((int) (byte) 1);
        int int14 = dateTime10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateTime10.toDateMidnight();
        org.joda.time.DateTime dateTime16 = yearMonthDay2.toDateTime((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay24.monthOfYear();
        org.joda.time.DateTime dateTime29 = yearMonthDay24.toDateTimeAtCurrentTime();
        int int30 = property22.compareTo((org.joda.time.ReadablePartial) yearMonthDay24);
        org.joda.time.Chronology chronology31 = yearMonthDay24.getChronology();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.withChronology(chronology31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(0L, chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and dateMidnight32", (dateMidnight15.compareTo(dateMidnight32) == 0) == dateMidnight15.equals(dateMidnight32));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight14.plusMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateMidnight31", (dateTime15.compareTo(dateMidnight31) == 0) == dateTime15.equals(dateMidnight31));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getWeekYear();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        long long18 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone15);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = dateTimeZone15.getShortName((long) 122, locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        boolean boolean29 = interval28.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTime(timeOfDay32, dateTimeZone33);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay37.monthOfYear();
        org.joda.time.DateTime dateTime42 = yearMonthDay37.toDateTimeAtCurrentTime();
        int int43 = property35.compareTo((org.joda.time.ReadablePartial) yearMonthDay37);
        org.joda.time.Chronology chronology44 = yearMonthDay37.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekyear(35280);
        boolean boolean48 = interval28.contains((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime45", (dateTime19.compareTo(dateTime45) == 0) == dateTime19.equals(dateTime45));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight17 = property16.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight18 = property16.roundHalfEvenCopy();
        int int19 = property16.get();
        org.joda.time.DateMidnight dateMidnight20 = property16.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        int int26 = dateTime25.getCenturyOfEra();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis((int) (byte) 0);
        int int29 = dateTime28.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTime(timeOfDay32, dateTimeZone33);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay31.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay31.property(dateTimeFieldType36);
        org.joda.time.DateTime.Property property38 = dateTime28.property(dateTimeFieldType36);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType36.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.Chronology chronology42 = yearMonthDay41.getChronology();
        org.joda.time.DurationField durationField43 = durationFieldType39.getField(chronology42);
        org.joda.time.Chronology chronology44 = chronology42.withUTC();
        org.joda.time.DurationField durationField45 = chronology42.hours();
        org.joda.time.DateTime dateTime46 = dateMidnight20.toDateTime(chronology42);
        org.joda.time.DurationField durationField47 = chronology42.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight20 and dateTime46", (dateMidnight20.compareTo(dateTime46) == 0) == dateMidnight20.equals(dateTime46));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance();
        calendar40.add(3, 22);
        java.util.Date date44 = calendar40.getTime();
        long long45 = calendar40.getTimeInMillis();
        java.util.TimeZone timeZone46 = calendar40.getTimeZone();
        java.util.Calendar.Builder builder47 = builder39.setTimeZone(timeZone46);
        java.util.Calendar calendar48 = builder47.build();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar40", (calendar5.compareTo(calendar40) == 0) == calendar5.equals(calendar40));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        boolean boolean41 = locale40.hasExtensions();
        boolean boolean42 = locale40.hasExtensions();
        java.lang.String str43 = locale40.toLanguageTag();
        java.util.Calendar.Builder builder44 = builder4.setLocale(locale40);
        java.util.Calendar.Builder builder47 = builder4.set((int) (short) 10, 453);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance();
        calendar48.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay52 = org.joda.time.YearMonthDay.fromCalendarFields(calendar48);
        calendar48.setFirstDayOfWeek(2022);
        int int56 = calendar48.getMinimum(2);
        java.util.TimeZone timeZone57 = calendar48.getTimeZone();
        java.util.Date date58 = calendar48.getTime();
        java.util.Calendar calendar59 = java.util.Calendar.getInstance();
        calendar59.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay63 = org.joda.time.YearMonthDay.fromCalendarFields(calendar59);
        calendar59.setFirstDayOfWeek(2022);
        int int67 = calendar59.getMinimum(2);
        java.util.TimeZone timeZone68 = calendar59.getTimeZone();
        org.joda.time.Interval interval71 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime72 = interval71.getEnd();
        org.joda.time.Chronology chronology73 = interval71.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.year();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleKeys();
        java.lang.String str77 = locale75.getDisplayCountry();
        int int78 = dateTimeField74.getMaximumTextLength(locale75);
        java.lang.String str79 = locale75.getDisplayScript();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(locale75);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone68, locale75);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        java.util.Locale locale83 = java.util.Locale.GERMAN;
        java.lang.String str84 = locale83.getVariant();
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone68, locale83);
        calendar48.setTimeZone(timeZone68);
        java.util.Calendar.Builder builder87 = builder4.setTimeZone(timeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar85", (calendar26.compareTo(calendar85) == 0) == calendar26.equals(calendar85));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMillis((long) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime4.isBefore(readableInstant10);
        org.joda.time.DateTime dateTime13 = dateTime4.plusWeeks(0);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfCentury(60);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfCentury(10);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate18.minusYears(51);
        java.lang.String str23 = localDate22.toString();
        int int24 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property25 = localDate22.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.dayOfWeek();
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight30 = property29.roundFloorCopy();
        boolean boolean31 = localDate22.equals((java.lang.Object) dateMidnight30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        boolean boolean34 = localDate22.isSupported(dateTimeFieldType32);
        boolean boolean35 = dateTime13.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay37.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay43.toDateTime(timeOfDay44, dateTimeZone45);
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay43.monthOfYear();
        org.joda.time.DateTime dateTime48 = yearMonthDay43.toDateTimeAtCurrentTime();
        int int49 = property41.compareTo((org.joda.time.ReadablePartial) yearMonthDay43);
        org.joda.time.Chronology chronology50 = yearMonthDay43.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.era();
        org.joda.time.DateMidnight dateMidnight53 = org.joda.time.DateMidnight.now(chronology50);
        org.joda.time.DurationField durationField54 = chronology50.days();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType32.getField(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight27 and dateMidnight53", (dateMidnight27.compareTo(dateMidnight53) == 0) == dateMidnight27.equals(dateMidnight53));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        boolean boolean5 = localTime3.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight1.withDayOfMonth(1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = property9.roundHalfCeilingCopy();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((java.lang.Object) dateMidnight10);
        int[] intArray12 = timeOfDay11.getValues();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime21.getZone();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        calendar25.setFirstDayOfWeek(2022);
        int int33 = calendar25.getMinimum(2);
        java.util.TimeZone timeZone34 = calendar25.getTimeZone();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Chronology chronology39 = interval37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.year();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleKeys();
        java.lang.String str43 = locale41.getDisplayCountry();
        int int44 = dateTimeField40.getMaximumTextLength(locale41);
        java.lang.String str45 = locale41.getDisplayScript();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale41);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone34, locale41);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        long long50 = dateTimeZone48.previousTransition((long) 8);
        long long52 = dateTimeZone24.getMillisKeepLocal(dateTimeZone48, (long) (byte) 0);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 35277, dateTimeZone48);
        org.joda.time.DateTime dateTime54 = timeOfDay11.toDateTimeToday(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar46", (calendar2.compareTo(calendar46) == 0) == calendar2.equals(calendar46));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTime(timeOfDay5, dateTimeZone6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay10.monthOfYear();
        org.joda.time.DateTime dateTime15 = yearMonthDay10.toDateTimeAtCurrentTime();
        int int16 = property8.compareTo((org.joda.time.ReadablePartial) yearMonthDay10);
        org.joda.time.Chronology chronology17 = yearMonthDay10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.Interval interval29 = interval21.overlap((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str33 = interval32.toString();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.Interval interval44 = interval36.overlap((org.joda.time.ReadableInterval) interval41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone45);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTime(timeOfDay47, dateTimeZone48);
        boolean boolean50 = dateTime49.isBeforeNow();
        org.joda.time.DateTime dateTime52 = dateTime49.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime54 = dateTime52.withMinuteOfHour((int) (short) 0);
        boolean boolean55 = interval44.contains((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean56 = interval32.contains((org.joda.time.ReadableInterval) interval44);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.Interval interval58 = interval32.withPeriodBeforeEnd(readablePeriod57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = interval32.toPeriod(periodType59);
        org.joda.time.Interval interval61 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period60);
        long long64 = chronology17.add((org.joda.time.ReadablePeriod) period60, (long) 'a', 4);
        org.joda.time.DurationField durationField65 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField66 = chronology17.centuryOfEra();
        org.joda.time.DateTime dateTime67 = dateMidnight2.toDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) 992, chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime67", (dateMidnight2.compareTo(dateTime67) == 0) == dateMidnight2.equals(dateTime67));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("days");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        calendar4.setFirstDayOfWeek(2022);
        int int12 = calendar4.getMinimum(2);
        java.util.TimeZone timeZone13 = calendar4.getTimeZone();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str22 = locale20.getDisplayCountry();
        int int23 = dateTimeField19.getMaximumTextLength(locale20);
        java.lang.String str24 = locale20.getDisplayScript();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone13, locale20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.lang.String str29 = locale28.getVariant();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone13, locale28);
        java.lang.String str31 = locale28.getDisplayName();
        java.util.Locale.Builder builder32 = builder3.setLocale(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar30", (calendar25.compareTo(calendar30) == 0) == calendar25.equals(calendar30));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtCurrentTime(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtMidnight();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        boolean boolean14 = dateTime13.isBeforeNow();
        org.joda.time.DateTime dateTime16 = dateTime13.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime13.toDateTime(chronology21);
        boolean boolean23 = interval6.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime29.toDateTime(chronology37);
        boolean boolean39 = durationFieldType24.isSupported(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime22.toDateTime(chronology37);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str44 = interval43.toString();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime53 = interval52.getEnd();
        org.joda.time.Chronology chronology54 = interval52.getChronology();
        org.joda.time.Interval interval55 = interval47.overlap((org.joda.time.ReadableInterval) interval52);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTime(timeOfDay58, dateTimeZone59);
        boolean boolean61 = dateTime60.isBeforeNow();
        org.joda.time.DateTime dateTime63 = dateTime60.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime65 = dateTime63.withMinuteOfHour((int) (short) 0);
        boolean boolean66 = interval55.contains((org.joda.time.ReadableInstant) dateTime63);
        boolean boolean67 = interval43.contains((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.Interval interval69 = interval43.withPeriodBeforeEnd(readablePeriod68);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = interval43.toPeriod(periodType70);
        org.joda.time.DateTime dateTime72 = dateTime22.minus((org.joda.time.ReadablePeriod) period71);
        org.joda.time.DateTime dateTime74 = dateTime3.withPeriodAdded((org.joda.time.ReadablePeriod) period71, 660);
        org.joda.time.DurationFieldType durationFieldType75 = org.joda.time.DurationFieldType.eras();
        boolean boolean76 = period71.isSupported(durationFieldType75);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Chronology chronology82 = interval80.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.year();
        org.joda.time.DurationField durationField84 = chronology82.minutes();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) 16, chronology82);
        org.joda.time.DateTimeField dateTimeField86 = chronology82.yearOfCentury();
        org.joda.time.DurationField durationField87 = chronology82.seconds();
        org.joda.time.DurationField durationField88 = durationFieldType75.getField(chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField88, durationField84, and durationField87", !(durationField88.compareTo(durationField84) == 0) || (Math.signum(durationField88.compareTo(durationField87)) == Math.signum(durationField84.compareTo(durationField87))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay14.property(dateTimeFieldType19);
        org.joda.time.DateTime.Property property21 = dateTime11.property(dateTimeFieldType19);
        boolean boolean22 = localDate0.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate.Property property23 = localDate0.dayOfYear();
        org.joda.time.Chronology chronology24 = localDate0.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime25", (dateTime17.compareTo(dateTime25) == 0) == dateTime17.equals(dateTime25));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        boolean boolean12 = dateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        int int30 = dateTime10.get(dateTimeField29);
        org.joda.time.DurationField durationField31 = dateTimeField29.getRangeDurationField();
        org.joda.time.DurationField durationField32 = dateTimeField29.getDurationField();
        boolean boolean33 = dateTimeField29.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField32", Math.signum(durationField28.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField28)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTime dateTime10 = localTime1.toDateTimeToday();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfHalfday();
        long long22 = chronology15.add((-968634479000L), (long) 86399, (int) '#');
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((java.lang.Object) dateTime10, chronology15);
        org.joda.time.DurationField durationField24 = chronology15.hours();
        org.joda.time.DurationField durationField25 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField17, and durationField24", !(durationField25.compareTo(durationField17) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField17.compareTo(durationField24))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.millis();
        org.joda.time.DurationField durationField9 = chronology5.months();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 70, chronology5);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField12 = chronology5.clockhourOfHalfday();
        java.lang.String str13 = chronology5.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField7", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight47 = dateTime46.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTime(timeOfDay61, dateTimeZone62);
        boolean boolean64 = dateTime63.isBeforeNow();
        org.joda.time.DateTime dateTime66 = dateTime63.withMonthOfYear((int) (byte) 1);
        int int67 = dateTime63.getYear();
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime70 = dateTime63.withDurationAdded(readableDuration68, (int) (short) 100);
        org.joda.time.DateTime.Property property71 = dateTime70.secondOfMinute();
        org.joda.time.DateTime dateTime74 = dateTime70.withDurationAdded((-62100742323530L), 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property76 = dateTime74.property(dateTimeFieldType75);
        boolean boolean77 = dateTime58.isSupported(dateTimeFieldType75);
        java.lang.String str78 = dateTimeFieldType75.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        int int12 = property9.get();
        org.joda.time.DateTime dateTime13 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime16 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) 18008);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear((int) (byte) 1);
        int int27 = dateTime23.getYear();
        org.joda.time.DateTime.Property property28 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTime dateTime30 = property28.roundHalfCeilingCopy();
        java.util.Date date31 = dateTime30.toDate();
        int int32 = date31.getDate();
        org.joda.time.YearMonthDay yearMonthDay33 = org.joda.time.YearMonthDay.fromDateFields(date31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight18.withFields((org.joda.time.ReadablePartial) yearMonthDay33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.withMillis(0L);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval47 = interval39.overlap((org.joda.time.ReadableInterval) interval44);
        org.joda.time.Duration duration48 = interval47.toDuration();
        long long49 = duration48.getMillis();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight36.plus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Chronology chronology55 = interval53.getChronology();
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime59 = interval58.getEnd();
        org.joda.time.Chronology chronology60 = interval58.getChronology();
        org.joda.time.Interval interval61 = interval53.overlap((org.joda.time.ReadableInterval) interval58);
        org.joda.time.Duration duration62 = interval61.toDuration();
        long long63 = duration62.getMillis();
        boolean boolean64 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DateTime dateTime65 = dateTime13.minus((org.joda.time.ReadableDuration) duration48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        java.lang.String str2 = date1.toLocaleString();
        int int3 = date1.getDay();
        date1.setMinutes(51);
        int int6 = date1.getMinutes();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        java.util.Date date8 = calendar7.getTime();
        calendar7.setFirstDayOfWeek(32770);
        int int11 = calendar7.getFirstDayOfWeek();
        java.util.Date date12 = calendar7.getTime();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.add(3, 22);
        java.util.Date date17 = calendar13.getTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        boolean boolean23 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime22.withMonthOfYear((int) (byte) 1);
        int int26 = dateTime22.getYear();
        org.joda.time.DateTime.Property property27 = dateTime22.weekyear();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime29 = property27.roundHalfCeilingCopy();
        java.util.Date date30 = dateTime29.toDate();
        int int31 = date30.getDate();
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromDateFields(date30);
        boolean boolean33 = date17.before(date30);
        date30.setSeconds(1970);
        boolean boolean36 = date12.before(date30);
        int int37 = date30.getDay();
        org.joda.time.YearMonthDay yearMonthDay38 = org.joda.time.YearMonthDay.fromDateFields(date30);
        java.lang.String str39 = date30.toLocaleString();
        int int40 = date30.getMinutes();
        int int41 = date30.getDate();
        int int42 = date1.compareTo(date30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar7", (calendar0.compareTo(calendar7) == 0) == calendar0.equals(calendar7));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        int int12 = dateTime4.getYear();
        org.joda.time.DateTime dateTime14 = dateTime4.withSecondOfMinute(8);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(32);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.Chronology chronology19 = yearMonthDay18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTime(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime20", (dateTime14.compareTo(dateTime20) == 0) == dateTime14.equals(dateTime20));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate3 = localDate1.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.Interval interval8 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Chronology chronology10 = interval8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime15.toDateTime(chronology23);
        boolean boolean25 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Chronology chronology39 = interval37.getChronology();
        org.joda.time.DateTime dateTime40 = dateTime31.toDateTime(chronology39);
        boolean boolean41 = durationFieldType26.isSupported(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime24.toDateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField43 = chronology39.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology39.era();
        org.joda.time.Chronology chronology45 = chronology39.withUTC();
        org.joda.time.DateTime dateTime46 = dateTime5.toDateTime(chronology45);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(0L, chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime46", (dateTime5.compareTo(dateTime46) == 0) == dateTime5.equals(dateTime46));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime dateTime7 = dateTime4.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        int int9 = dateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        int int18 = dateTime14.getYear();
        org.joda.time.DateTime.Property property19 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime20 = property19.withMaximumValue();
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(2);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfYear();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 16, chronology29);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval43 = interval35.overlap((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str47 = interval46.toString();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Chronology chronology52 = interval50.getChronology();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Chronology chronology57 = interval55.getChronology();
        org.joda.time.Interval interval58 = interval50.overlap((org.joda.time.ReadableInterval) interval55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTime(timeOfDay61, dateTimeZone62);
        boolean boolean64 = dateTime63.isBeforeNow();
        org.joda.time.DateTime dateTime66 = dateTime63.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime68 = dateTime66.withMinuteOfHour((int) (short) 0);
        boolean boolean69 = interval58.contains((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean70 = interval46.contains((org.joda.time.ReadableInterval) interval58);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.Interval interval72 = interval46.withPeriodBeforeEnd(readablePeriod71);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = interval46.toPeriod(periodType73);
        org.joda.time.Interval interval75 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period74);
        long long78 = chronology29.add((org.joda.time.ReadablePeriod) period74, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod79 = period74.toMutablePeriod();
        org.joda.time.DateTime dateTime81 = dateTime20.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod79, 32770);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.YearMonthDay yearMonthDay83 = new org.joda.time.YearMonthDay(dateTimeZone82);
        org.joda.time.YearMonthDay yearMonthDay85 = yearMonthDay83.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay83.withYear(22);
        org.joda.time.Chronology chronology88 = yearMonthDay87.getChronology();
        org.joda.time.DateTimeField dateTimeField89 = chronology88.year();
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime((java.lang.Object) dateTime81, chronology88);
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime7.toMutableDateTime(chronology88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime81 and dateTime90", (dateTime81.compareTo(dateTime90) == 0) == dateTime81.equals(dateTime90));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTime dateTime16 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        int int23 = dateTime22.getCenturyOfEra();
        org.joda.time.DateTime dateTime25 = dateTime22.plusMillis((int) (byte) 0);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay28.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay28.property(dateTimeFieldType33);
        org.joda.time.DateTime.Property property35 = dateTime25.property(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType33.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.Chronology chronology39 = yearMonthDay38.getChronology();
        org.joda.time.DurationField durationField40 = durationFieldType36.getField(chronology39);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        calendar41.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay45 = org.joda.time.YearMonthDay.fromCalendarFields(calendar41);
        calendar41.setFirstDayOfWeek(2022);
        int int49 = calendar41.getMinimum(2);
        java.util.TimeZone timeZone50 = calendar41.getTimeZone();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Chronology chronology55 = interval53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.year();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleKeys();
        java.lang.String str59 = locale57.getDisplayCountry();
        int int60 = dateTimeField56.getMaximumTextLength(locale57);
        java.lang.String str61 = locale57.getDisplayScript();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(locale57);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone50, locale57);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long66 = dateTimeZone64.previousTransition((long) 8);
        java.lang.String str67 = dateTimeZone64.toString();
        java.util.TimeZone timeZone68 = dateTimeZone64.toTimeZone();
        org.joda.time.Chronology chronology69 = chronology39.withZone(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight((long) 29, chronology39);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime16.toMutableDateTime(chronology39);
        int int72 = dateTime16.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime71", (dateTime4.compareTo(mutableDateTime71) == 0) == dateTime4.equals(mutableDateTime71));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.property(dateTimeFieldType6);
        int int8 = yearMonthDay1.getMonthOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property26 = localDate24.centuryOfEra();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay31 = org.joda.time.YearMonthDay.fromCalendarFields(calendar27);
        calendar27.setFirstDayOfWeek(2022);
        int int35 = calendar27.getMinimum(2);
        java.util.TimeZone timeZone36 = calendar27.getTimeZone();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayCountry();
        int int46 = dateTimeField42.getMaximumTextLength(locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale43);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone36, locale43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long52 = dateTimeZone50.previousTransition((long) 8);
        org.joda.time.Interval interval53 = localDate24.toInterval(dateTimeZone50);
        org.joda.time.Chronology chronology54 = chronology14.withZone(dateTimeZone50);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(obj9, dateTimeZone50);
        org.joda.time.DateTime dateTime56 = yearMonthDay1.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(dateTimeZone57);
        org.joda.time.TimeOfDay timeOfDay59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = yearMonthDay58.toDateTime(timeOfDay59, dateTimeZone60);
        boolean boolean62 = dateTime61.isBeforeNow();
        org.joda.time.DateTime dateTime64 = dateTime61.withMonthOfYear((int) (byte) 1);
        int int65 = dateTime61.getYear();
        org.joda.time.DateTime.Property property66 = dateTime61.weekyear();
        org.joda.time.DateTime dateTime67 = property66.withMaximumValue();
        org.joda.time.DateTime dateTime68 = property66.roundHalfCeilingCopy();
        int int69 = property66.get();
        org.joda.time.DateTime dateTime70 = property66.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime73 = dateTime70.withZone(dateTimeZone72);
        org.joda.time.DateMidnight dateMidnight74 = yearMonthDay1.toDateMidnight(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime68 and dateTime73", (dateTime68.compareTo(dateTime73) == 0) == dateTime68.equals(dateTime73));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) 0);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay17.property(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime14.property(dateTimeFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType22.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        org.joda.time.DurationField durationField29 = durationFieldType25.getField(chronology28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay4.withFieldAdded(durationFieldType25, (int) (short) 100);
        int int32 = yearMonthDay31.getDayOfMonth();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance();
        calendar33.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay37 = org.joda.time.YearMonthDay.fromCalendarFields(calendar33);
        calendar33.setFirstDayOfWeek(2022);
        int int41 = calendar33.getMinimum(2);
        java.util.TimeZone timeZone42 = calendar33.getTimeZone();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Chronology chronology47 = interval45.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.year();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleKeys();
        java.lang.String str51 = locale49.getDisplayCountry();
        int int52 = dateTimeField48.getMaximumTextLength(locale49);
        java.lang.String str53 = locale49.getDisplayScript();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(locale49);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone42, locale49);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long58 = dateTimeZone56.previousTransition((long) 8);
        java.lang.String str59 = dateTimeZone56.toString();
        long long61 = dateTimeZone56.nextTransition((long) (short) 1);
        java.lang.String str63 = dateTimeZone56.getShortName((long) 18);
        org.joda.time.DateTime dateTime64 = yearMonthDay31.toDateTimeAtCurrentTime(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar33", (calendar0.compareTo(calendar33) == 0) == calendar0.equals(calendar33));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        int int65 = calendar63.getActualMaximum(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        calendar11.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay15 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
        calendar11.setFirstDayOfWeek(2022);
        int int19 = calendar11.getMinimum(2);
        java.util.TimeZone timeZone20 = calendar11.getTimeZone();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayCountry();
        int int30 = dateTimeField26.getMaximumTextLength(locale27);
        java.lang.String str31 = locale27.getDisplayScript();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale27);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone20, locale27);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long36 = dateTimeZone34.previousTransition((long) 8);
        long long38 = dateTimeZone10.getMillisKeepLocal(dateTimeZone34, (long) (byte) 0);
        int int40 = dateTimeZone34.getOffsetFromLocal(8L);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone34);
        boolean boolean42 = dateTimeZone34.isFixed();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        java.lang.String str46 = locale44.getDisplayLanguage();
        java.lang.String str47 = dateTimeZone34.getName(1155831456L, locale44);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale44);
        java.lang.String str49 = calendar48.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar45", (calendar32.compareTo(calendar45) == 0) == calendar32.equals(calendar45));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant55", (dateMidnight53.compareTo(instant55) == 0) == dateMidnight53.equals(instant55));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar2);
        calendar2.setFirstDayOfWeek(2022);
        int int10 = calendar2.getMinimum(2);
        java.util.TimeZone timeZone11 = calendar2.getTimeZone();
        java.util.Date date12 = calendar2.getTime();
        boolean boolean13 = date1.after(date12);
        int int14 = date12.getMonth();
        int int15 = date12.getSeconds();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        calendar16.add(3, 22);
        java.util.Date date20 = calendar16.getTime();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        int int29 = dateTime25.getYear();
        org.joda.time.DateTime.Property property30 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime31 = property30.withMaximumValue();
        org.joda.time.DateTime dateTime32 = property30.roundHalfCeilingCopy();
        java.util.Date date33 = dateTime32.toDate();
        int int34 = date33.getDate();
        org.joda.time.YearMonthDay yearMonthDay35 = org.joda.time.YearMonthDay.fromDateFields(date33);
        boolean boolean36 = date20.before(date33);
        date33.setTime((long) (byte) 0);
        int int39 = date33.getTimezoneOffset();
        boolean boolean40 = date12.after(date33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar16", (calendar2.compareTo(calendar16) == 0) == calendar2.equals(calendar16));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime51 = dateTime49.plusWeeks(211);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.era();
        int int3 = localDate0.size();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime11 = dateTime8.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        int int14 = localDate0.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate localDate16 = localDate0.withDayOfYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        boolean boolean22 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime24 = dateTime21.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime24.getZone();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        calendar28.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromCalendarFields(calendar28);
        calendar28.setFirstDayOfWeek(2022);
        int int36 = calendar28.getMinimum(2);
        java.util.TimeZone timeZone37 = calendar28.getTimeZone();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.year();
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.lang.String str46 = locale44.getDisplayCountry();
        int int47 = dateTimeField43.getMaximumTextLength(locale44);
        java.lang.String str48 = locale44.getDisplayScript();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale44);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone37, locale44);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long53 = dateTimeZone51.previousTransition((long) 8);
        long long55 = dateTimeZone27.getMillisKeepLocal(dateTimeZone51, (long) (byte) 0);
        org.joda.time.DateMidnight dateMidnight56 = localDate16.toDateMidnight(dateTimeZone27);
        org.joda.time.LocalDate.Property property57 = localDate16.dayOfYear();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance();
        java.util.Date date59 = calendar58.getTime();
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromDateFields(date59);
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay60.minusMonths(35279414);
        boolean boolean63 = localDate16.equals((java.lang.Object) 35279414);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar49 and calendar58", (calendar49.compareTo(calendar58) == 0) == calendar49.equals(calendar58));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight31", (dateMidnight14.compareTo(dateMidnight31) == 0) == dateMidnight14.equals(dateMidnight31));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property3.roundHalfFloorCopy();
        int int8 = property3.getMaximumValueOverall();
        java.lang.String str9 = property3.getAsShortText();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromCalendarFields(calendar10);
        calendar10.setFirstDayOfWeek(2022);
        int int18 = calendar10.getMinimum(2);
        java.util.TimeZone timeZone19 = calendar10.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay21.toDateTime(timeOfDay22, dateTimeZone23);
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay21.monthOfYear();
        java.util.Locale locale26 = java.util.Locale.ITALY;
        int int27 = property25.getMaximumTextLength(locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone19, locale26);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale29);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone19, locale29);
        int int32 = property3.getMaximumShortTextLength(locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar31", (calendar0.compareTo(calendar31) == 0) == calendar0.equals(calendar31));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        boolean boolean41 = locale40.hasExtensions();
        boolean boolean42 = locale40.hasExtensions();
        java.lang.String str43 = locale40.toLanguageTag();
        java.util.Calendar.Builder builder44 = builder4.setLocale(locale40);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        calendar45.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromCalendarFields(calendar45);
        calendar45.setFirstDayOfWeek(2022);
        int int53 = calendar45.getMinimum(2);
        java.util.TimeZone timeZone54 = calendar45.getTimeZone();
        java.util.Date date55 = calendar45.getTime();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        calendar56.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromCalendarFields(calendar56);
        calendar56.setFirstDayOfWeek(2022);
        int int64 = calendar56.getMinimum(2);
        java.util.TimeZone timeZone65 = calendar56.getTimeZone();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.year();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str74 = locale72.getDisplayCountry();
        int int75 = dateTimeField71.getMaximumTextLength(locale72);
        java.lang.String str76 = locale72.getDisplayScript();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone65, locale72);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.lang.String str81 = locale80.getVariant();
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(timeZone65, locale80);
        calendar45.setTimeZone(timeZone65);
        java.util.Calendar.Builder builder84 = builder44.setTimeZone(timeZone65);
        java.util.Calendar.Builder builder86 = builder44.setLenient(true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar82", (calendar26.compareTo(calendar82) == 0) == calendar26.equals(calendar82));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval5 = interval2.withEndMillis((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear((int) (byte) 1);
        int int14 = dateTime10.getYear();
        org.joda.time.DateTime.Property property15 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay25.monthOfYear();
        org.joda.time.DateTime dateTime30 = yearMonthDay25.toDateTimeAtCurrentTime();
        int int31 = property23.compareTo((org.joda.time.ReadablePartial) yearMonthDay25);
        org.joda.time.Chronology chronology32 = yearMonthDay25.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.era();
        org.joda.time.DateTime dateTime35 = dateTime16.withChronology(chronology32);
        org.joda.time.Interval interval36 = interval5.withChronology(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime35", (dateTime16.compareTo(dateTime35) == 0) == dateTime16.equals(dateTime35));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
        boolean boolean7 = dateMidnight3.isAfter((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusWeeks(4);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight3.plus((long) 818);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.YearMonthDay yearMonthDay26 = property17.withMinimumValue();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        int int52 = property17.compareTo((org.joda.time.ReadableInstant) dateTime48);
        java.lang.String str53 = property17.toString();
        org.joda.time.YearMonthDay yearMonthDay55 = property17.addToCopy(621);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTime(timeOfDay58, dateTimeZone59);
        int int61 = dateTime60.getYearOfCentury();
        org.joda.time.DateTime dateTime63 = dateTime60.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTime dateTime65 = dateTime60.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime66 = dateTime65.withEarlierOffsetAtOverlap();
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime69 = dateTime66.withFieldAdded(durationFieldType67, 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        org.joda.time.YearMonthDay.Property property75 = yearMonthDay71.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay(dateTimeZone76);
        org.joda.time.TimeOfDay timeOfDay78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay77.toDateTime(timeOfDay78, dateTimeZone79);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay77.monthOfYear();
        org.joda.time.DateTime dateTime82 = yearMonthDay77.toDateTimeAtCurrentTime();
        int int83 = property75.compareTo((org.joda.time.ReadablePartial) yearMonthDay77);
        org.joda.time.Chronology chronology84 = yearMonthDay77.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.dayOfWeek();
        org.joda.time.DurationField durationField86 = durationFieldType67.getField(chronology84);
        org.joda.time.YearMonthDay yearMonthDay88 = yearMonthDay55.withFieldAdded(durationFieldType67, 0);
        org.joda.time.DateMidnight dateMidnight90 = dateMidnight3.withFieldAdded(durationFieldType67, 1069);
        org.joda.time.Instant instant91 = dateMidnight3.toInstant();
        org.joda.time.LocalDate localDate92 = dateMidnight3.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and instant91", (dateMidnight1.compareTo(instant91) == 0) == dateMidnight1.equals(instant91));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(44);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.lang.String str9 = locale7.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        calendar24.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromCalendarFields(calendar24);
        calendar24.setFirstDayOfWeek(2022);
        int int32 = calendar24.getMinimum(2);
        java.util.TimeZone timeZone33 = calendar24.getTimeZone();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleKeys();
        java.lang.String str42 = locale40.getDisplayCountry();
        int int43 = dateTimeField39.getMaximumTextLength(locale40);
        java.lang.String str44 = locale40.getDisplayScript();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale40);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone33, locale40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long49 = dateTimeZone47.previousTransition((long) 8);
        long long51 = dateTimeZone23.getMillisKeepLocal(dateTimeZone47, (long) (byte) 0);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 35277, dateTimeZone47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter10.withZone(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTime(timeOfDay57, dateTimeZone58);
        int int60 = dateTime59.getCenturyOfEra();
        org.joda.time.DateTime dateTime62 = dateTime59.plusMillis((int) (byte) 0);
        int int63 = dateTime59.getHourOfDay();
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Calendar calendar65 = dateTime59.toCalendar(locale64);
        java.lang.String str66 = locale64.getScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter54.withLocale(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar45 and calendar65", (calendar45.compareTo(calendar65) == 0) == calendar45.equals(calendar65));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.joda.time.LocalTime localTime8 = property5.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(371);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(86399);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        int int19 = dateTime18.getCenturyOfEra();
        org.joda.time.DateTime dateTime21 = dateTime18.plusMillis((int) (byte) 0);
        int int22 = dateTime18.getHourOfDay();
        java.util.Locale locale23 = java.util.Locale.JAPAN;
        java.util.Calendar calendar24 = dateTime18.toCalendar(locale23);
        java.lang.String str25 = locale23.getDisplayVariant();
        java.lang.String str26 = locale23.getDisplayVariant();
        java.lang.String str27 = localTime12.toString("09:49:31.376", locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar24", (calendar0.compareTo(calendar24) == 0) == calendar0.equals(calendar24));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = dateTimeField5.getMaximumTextLength(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale6);
        calendar11.setMinimalDaysInFirstWeek(12);
        java.time.Instant instant14 = calendar11.toInstant();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        calendar16.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromCalendarFields(calendar16);
        calendar16.setFirstDayOfWeek(2022);
        int int24 = calendar16.getMinimum(2);
        java.util.TimeZone timeZone25 = calendar16.getTimeZone();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.year();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.lang.String str34 = locale32.getDisplayCountry();
        int int35 = dateTimeField31.getMaximumTextLength(locale32);
        java.lang.String str36 = locale32.getDisplayScript();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale32);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone25, locale32);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.lang.String str41 = locale40.getVariant();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone25, locale40);
        calendar11.setTimeZone(timeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar42", (calendar37.compareTo(calendar42) == 0) == calendar37.equals(calendar42));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = interval2.toPeriod(periodType29);
        org.joda.time.Chronology chronology31 = interval2.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTime(timeOfDay39, dateTimeZone40);
        boolean boolean42 = dateTime41.isBeforeNow();
        org.joda.time.DateTime dateTime44 = dateTime41.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.DateTime dateTime50 = dateTime41.toDateTime(chronology49);
        boolean boolean51 = interval34.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay54.toDateTime(timeOfDay55, dateTimeZone56);
        boolean boolean58 = dateTime57.isBeforeNow();
        org.joda.time.DateTime dateTime60 = dateTime57.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval63 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime64 = interval63.getEnd();
        org.joda.time.Chronology chronology65 = interval63.getChronology();
        org.joda.time.DateTime dateTime66 = dateTime57.toDateTime(chronology65);
        boolean boolean67 = durationFieldType52.isSupported(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime50.toDateTime(chronology65);
        org.joda.time.DateTimeField dateTimeField69 = chronology65.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField70 = chronology65.era();
        org.joda.time.DateTimeField dateTimeField71 = chronology65.minuteOfDay();
        org.joda.time.DurationField durationField72 = chronology65.eras();
        org.joda.time.DateTimeField dateTimeField73 = chronology65.dayOfWeek();
        org.joda.time.Interval interval74 = interval2.withChronology(chronology65);
        org.joda.time.DurationField durationField75 = chronology65.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField72, durationField75, and durationField72", !(durationField72.compareTo(durationField75) == 0) || (Math.signum(durationField72.compareTo(durationField72)) == Math.signum(durationField75.compareTo(durationField72))));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.centuries();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((-1L), chronology5);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.DurationField durationField11 = property10.getRangeDurationField();
        org.joda.time.LocalDate localDate12 = property10.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar2);
        calendar2.setFirstDayOfWeek(2022);
        int int10 = calendar2.getMinimum(2);
        java.util.TimeZone timeZone11 = calendar2.getTimeZone();
        java.util.Date date12 = calendar2.getTime();
        boolean boolean13 = date1.after(date12);
        java.time.Instant instant14 = date1.toInstant();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        int int21 = dateTimeField20.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay23.withYear(22);
        int int28 = yearMonthDay23.size();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance();
        calendar29.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay33 = org.joda.time.YearMonthDay.fromCalendarFields(calendar29);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay33.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay33.year();
        int[] intArray37 = yearMonthDay33.getValues();
        int int38 = dateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay23, intArray37);
        long long41 = dateTimeField20.addWrapField((-359L), 538);
        boolean boolean42 = date1.equals((java.lang.Object) 538);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar29", (calendar2.compareTo(calendar29) == 0) == calendar2.equals(calendar29));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        int int12 = property9.get();
        org.joda.time.DateTime dateTime13 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime16 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.LocalDate localDate17 = dateTime13.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond(42);
        java.lang.Object obj8 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.minuteOfHour();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate21 = localDate19.withYearOfCentury(10);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property24 = localDate23.weekyear();
        org.joda.time.LocalDate.Property property25 = localDate23.centuryOfEra();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        calendar26.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromCalendarFields(calendar26);
        calendar26.setFirstDayOfWeek(2022);
        int int34 = calendar26.getMinimum(2);
        java.util.TimeZone timeZone35 = calendar26.getTimeZone();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.year();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleKeys();
        java.lang.String str44 = locale42.getDisplayCountry();
        int int45 = dateTimeField41.getMaximumTextLength(locale42);
        java.lang.String str46 = locale42.getDisplayScript();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(locale42);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone35, locale42);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long51 = dateTimeZone49.previousTransition((long) 8);
        org.joda.time.Interval interval52 = localDate23.toInterval(dateTimeZone49);
        org.joda.time.Chronology chronology53 = chronology13.withZone(dateTimeZone49);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(obj8, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight((long) 473, dateTimeZone49);
        org.joda.time.DateTime dateTime56 = localTime1.toDateTimeToday(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar47", (calendar0.compareTo(calendar47) == 0) == calendar0.equals(calendar47));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 134, chronology5);
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField11", (durationField7.compareTo(durationField11) == 0) == durationField7.equals(durationField11));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay7.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean18 = yearMonthDay7.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType17.getDurationType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getDurationType();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.era();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology25);
        boolean boolean28 = durationFieldType20.isSupported(chronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        int int37 = dateTime33.getYear();
        org.joda.time.DateTime.Property property38 = dateTime33.weekyear();
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        boolean boolean40 = dateTime39.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.halfdays();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.era();
        org.joda.time.DateTime dateTime58 = dateTime39.withChronology(chronology55);
        boolean boolean59 = durationFieldType20.isSupported(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime58", (dateTime39.compareTo(dateTime58) == 0) == dateTime39.equals(dateTime58));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay5.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        int int17 = property9.compareTo((org.joda.time.ReadablePartial) yearMonthDay11);
        org.joda.time.Chronology chronology18 = yearMonthDay11.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getWeekOfWeekyear();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) dateTime19);
        int int22 = property3.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime19", (dateTime8.compareTo(dateTime19) == 0) == dateTime8.equals(dateTime19));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) '4', chronology5);
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField7", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) (byte) 0);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay12.property(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime9.property(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology23);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-62100742311688L), chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime dateTime31 = dateTime29.plus((long) 6);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(dateTimeZone32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight33.monthOfYear();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now();
        long long36 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone37);
        boolean boolean39 = dateMidnight35.isAfter((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight35.minusWeeks(4);
        java.util.Date date42 = dateMidnight35.toDate();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTime(timeOfDay45, dateTimeZone46);
        boolean boolean48 = dateTime47.isBeforeNow();
        org.joda.time.DateTime dateTime50 = dateTime47.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime52 = dateTime50.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = dateTime50.getZone();
        int int55 = dateTimeZone53.getStandardOffset((long) 13);
        long long59 = dateTimeZone53.convertLocalToUTC(229L, false, (long) 49);
        int int61 = dateTimeZone53.getOffset(0L);
        boolean boolean63 = dateTimeZone53.isStandardOffset((long) 35275);
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone53);
        boolean boolean66 = dateTimeZone53.isStandardOffset((long) 35309838);
        org.joda.time.MutableDateTime mutableDateTime67 = dateMidnight35.toMutableDateTime(dateTimeZone53);
        java.lang.String str69 = dateTimeZone53.getShortName(1645142400000L);
        long long71 = dateTimeZone53.previousTransition((long) 481);
        org.joda.time.DateTime dateTime72 = dateTime29.toDateTime(dateTimeZone53);
        int int74 = dateTimeZone53.getStandardOffset((long) 405);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.DurationField durationField46 = chronology44.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusYears(35389961);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        calendar0.roll(13, 42);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        int int15 = dateTime14.getCenturyOfEra();
        org.joda.time.DateTime dateTime17 = dateTime14.plusMillis((int) (byte) 0);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay20.property(dateTimeFieldType25);
        org.joda.time.DateTime.Property property27 = dateTime17.property(dateTimeFieldType25);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType25.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.Chronology chronology31 = yearMonthDay30.getChronology();
        org.joda.time.DurationField durationField32 = durationFieldType28.getField(chronology31);
        boolean boolean33 = calendar0.after((java.lang.Object) durationFieldType28);
        org.joda.time.YearMonthDay yearMonthDay34 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        java.util.Date date35 = calendar0.getTime();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance();
        calendar36.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay40 = org.joda.time.YearMonthDay.fromCalendarFields(calendar36);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay40.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property43 = yearMonthDay40.monthOfYear();
        int int45 = yearMonthDay40.getValue((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        boolean boolean49 = dateTimeZone47.isStandardOffset(743L);
        org.joda.time.Interval interval50 = yearMonthDay40.toInterval(dateTimeZone47);
        java.lang.String str51 = dateTimeZone47.getID();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.joda.time.Chronology chronology58 = interval56.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.minutes();
        org.joda.time.DurationField durationField60 = chronology58.weekyears();
        org.joda.time.DurationField durationField61 = chronology58.millis();
        org.joda.time.DurationField durationField62 = chronology58.months();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 70, chronology58);
        org.joda.time.DateTimeField dateTimeField64 = chronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial66 = null;
        int int67 = dateTimeField65.getMinimumValue(readablePartial66);
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.lang.String str69 = locale68.toLanguageTag();
        java.lang.String str70 = locale68.getScript();
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate73 = localDate71.withYearOfCentury(10);
        org.joda.time.LocalDate localDate75 = localDate73.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property76 = localDate75.weekyear();
        org.joda.time.LocalDate localDate77 = property76.roundCeilingCopy();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Chronology chronology82 = interval80.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.year();
        java.util.Locale locale85 = java.util.Locale.GERMAN;
        java.lang.String str86 = locale85.getVariant();
        java.lang.String str87 = dateTimeField83.getAsShortText(3, locale85);
        long long89 = dateTimeField83.roundHalfCeiling((long) 8);
        java.util.Locale locale91 = java.util.Locale.KOREA;
        java.lang.String str92 = dateTimeField83.getAsShortText(434, locale91);
        int int93 = property76.getMaximumTextLength(locale91);
        java.lang.String str94 = locale68.getDisplayLanguage(locale91);
        int int95 = dateTimeField65.getMaximumShortTextLength(locale68);
        java.lang.String str96 = dateTimeZone47.getShortName((long) 71, locale68);
        java.util.TimeZone timeZone97 = dateTimeZone47.toTimeZone();
        calendar0.setTimeZone(timeZone97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField62", (durationField32.compareTo(durationField62) == 0) == durationField32.equals(durationField62));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(2);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfYear();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 16, chronology19);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Chronology chronology32 = interval30.getChronology();
        org.joda.time.Interval interval33 = interval25.overlap((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str37 = interval36.toString();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Chronology chronology47 = interval45.getChronology();
        org.joda.time.Interval interval48 = interval40.overlap((org.joda.time.ReadableInterval) interval45);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = yearMonthDay50.toDateTime(timeOfDay51, dateTimeZone52);
        boolean boolean54 = dateTime53.isBeforeNow();
        org.joda.time.DateTime dateTime56 = dateTime53.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime58 = dateTime56.withMinuteOfHour((int) (short) 0);
        boolean boolean59 = interval48.contains((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = interval36.contains((org.joda.time.ReadableInterval) interval48);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.Interval interval62 = interval36.withPeriodBeforeEnd(readablePeriod61);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = interval36.toPeriod(periodType63);
        org.joda.time.Interval interval65 = interval33.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period64);
        long long68 = chronology19.add((org.joda.time.ReadablePeriod) period64, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod69 = period64.toMutablePeriod();
        org.joda.time.DateTime dateTime71 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod69, 32770);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay(dateTimeZone72);
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay73.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay73.withYear(22);
        org.joda.time.Chronology chronology78 = yearMonthDay77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.year();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((java.lang.Object) dateTime71, chronology78);
        org.joda.time.LocalDateTime localDateTime81 = org.joda.time.LocalDateTime.now(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and dateTime80", (dateTime71.compareTo(dateTime80) == 0) == dateTime71.equals(dateTime80));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.DateMidnight dateMidnight6 = property4.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight7 = property4.roundHalfFloorCopy();
        int int8 = dateMidnight7.getDayOfWeek();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withCenturyOfEra(13);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay18.monthOfYear();
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtCurrentTime();
        int int24 = property16.compareTo((org.joda.time.ReadablePartial) yearMonthDay18);
        org.joda.time.Chronology chronology25 = yearMonthDay18.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekOfWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str41 = interval40.toString();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay54.toDateTime(timeOfDay55, dateTimeZone56);
        boolean boolean58 = dateTime57.isBeforeNow();
        org.joda.time.DateTime dateTime60 = dateTime57.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime62 = dateTime60.withMinuteOfHour((int) (short) 0);
        boolean boolean63 = interval52.contains((org.joda.time.ReadableInstant) dateTime60);
        boolean boolean64 = interval40.contains((org.joda.time.ReadableInterval) interval52);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.Interval interval66 = interval40.withPeriodBeforeEnd(readablePeriod65);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = interval40.toPeriod(periodType67);
        org.joda.time.Interval interval69 = interval37.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        long long72 = chronology25.add((org.joda.time.ReadablePeriod) period68, (long) 'a', 4);
        org.joda.time.DurationField durationField73 = chronology25.hours();
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight7.toMutableDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone75 = dateMidnight7.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight7 and mutableDateTime74", (dateMidnight7.compareTo(mutableDateTime74) == 0) == dateMidnight7.equals(mutableDateTime74));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime11 = property8.withMinimumValue();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property15 = localDate12.weekyear();
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtMidnight();
        int int17 = localDate12.getEra();
        org.joda.time.LocalDate.Property property18 = localDate12.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean20 = localDate12.isSupported(dateTimeFieldType19);
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType19.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        int int29 = dateTime28.getCenturyOfEra();
        org.joda.time.DateTime dateTime31 = dateTime28.plusMillis((int) (byte) 0);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay34.toDateTime(timeOfDay35, dateTimeZone36);
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay34.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay34.property(dateTimeFieldType39);
        org.joda.time.DateTime.Property property41 = dateTime31.property(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.Chronology chronology45 = yearMonthDay44.getChronology();
        org.joda.time.DurationField durationField46 = durationFieldType42.getField(chronology45);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(chronology45);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (-1), chronology45);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((-62100742311688L), chronology45);
        org.joda.time.DateTimeField dateTimeField50 = chronology45.clockhourOfDay();
        org.joda.time.DurationField durationField51 = chronology45.millis();
        org.joda.time.DurationField durationField52 = chronology45.minutes();
        org.joda.time.DurationField durationField53 = durationFieldType21.getField(chronology45);
        boolean boolean54 = localDateTime11.isSupported(durationFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField52", (durationField6.compareTo(durationField52) == 0) == durationField6.equals(durationField52));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Interval interval4 = interval2.withDurationBeforeEnd(readableDuration3);
        org.joda.time.Interval interval5 = interval4.toInterval();
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(0);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        int int11 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra(1248);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        boolean boolean22 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime24 = dateTime21.withMonthOfYear((int) (byte) 1);
        int int25 = dateTime21.getYear();
        org.joda.time.DateTime.Property property26 = dateTime21.weekyear();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = yearMonthDay36.toDateTime(timeOfDay37, dateTimeZone38);
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay36.monthOfYear();
        org.joda.time.DateTime dateTime41 = yearMonthDay36.toDateTimeAtCurrentTime();
        int int42 = property34.compareTo((org.joda.time.ReadablePartial) yearMonthDay36);
        org.joda.time.Chronology chronology43 = yearMonthDay36.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.halfdays();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.era();
        org.joda.time.DateTime dateTime46 = dateTime27.withChronology(chronology43);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(57);
        int int49 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime46);
        int int50 = dateTime16.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime46", (dateTime10.compareTo(dateTime46) == 0) == dateTime10.equals(dateTime46));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.Interval interval42 = interval34.overlap((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Duration duration43 = interval42.toDuration();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Chronology chronology48 = interval46.getChronology();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
        org.joda.time.Chronology chronology53 = interval51.getChronology();
        org.joda.time.Interval interval54 = interval46.overlap((org.joda.time.ReadableInterval) interval51);
        org.joda.time.Duration duration55 = interval54.toDuration();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.YearMonthDay yearMonthDay57 = new org.joda.time.YearMonthDay(dateTimeZone56);
        org.joda.time.TimeOfDay timeOfDay58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = yearMonthDay57.toDateTime(timeOfDay58, dateTimeZone59);
        boolean boolean61 = dateTime60.isBeforeNow();
        org.joda.time.DateTime dateTime63 = dateTime60.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime65 = dateTime63.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime67 = dateTime65.minusHours((int) (byte) 100);
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration69 = duration55.toDuration();
        boolean boolean70 = duration43.isEqual((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Interval interval73 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str74 = interval73.toString();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime78 = interval77.getEnd();
        org.joda.time.Chronology chronology79 = interval77.getChronology();
        org.joda.time.Interval interval82 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime83 = interval82.getEnd();
        org.joda.time.Chronology chronology84 = interval82.getChronology();
        org.joda.time.Interval interval85 = interval77.overlap((org.joda.time.ReadableInterval) interval82);
        org.joda.time.Duration duration86 = interval85.toDuration();
        long long87 = duration86.getMillis();
        org.joda.time.Interval interval88 = interval73.withDurationAfterStart((org.joda.time.ReadableDuration) duration86);
        boolean boolean89 = duration69.isShorterThan((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Period period90 = duration69.toPeriod();
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight14.withDurationAdded((org.joda.time.ReadableDuration) duration69, 2698);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateMidnight31", (dateTime15.compareTo(dateMidnight31) == 0) == dateTime15.equals(dateMidnight31));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology5);
        org.joda.time.DurationField durationField9 = chronology5.hours();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField7", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.minutes();
        org.joda.time.DurationField durationField64 = chronology62.weekyears();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DurationField durationField66 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField67 = chronology62.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight53.withChronology(chronology62);
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight53.minusMonths(455);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant55 and dateMidnight53", (instant55.compareTo(dateMidnight53) == 0) == instant55.equals(dateMidnight53));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        int int12 = property9.get();
        org.joda.time.DateTime dateTime13 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime16 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime16", (dateTime11.compareTo(dateTime16) == 0) == dateTime11.equals(dateTime16));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTime dateTime50 = yearMonthDay4.toDateTimeAtMidnight(dateTimeZone20);
        long long53 = dateTimeZone20.adjustOffset(1235273932799641L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.Interval interval26 = interval18.overlap((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str30 = interval29.toString();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.Interval interval41 = interval33.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay43.toDateTime(timeOfDay44, dateTimeZone45);
        boolean boolean47 = dateTime46.isBeforeNow();
        org.joda.time.DateTime dateTime49 = dateTime46.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour((int) (short) 0);
        boolean boolean52 = interval41.contains((org.joda.time.ReadableInstant) dateTime49);
        boolean boolean53 = interval29.contains((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.Interval interval55 = interval29.withPeriodBeforeEnd(readablePeriod54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = interval29.toPeriod(periodType56);
        org.joda.time.Interval interval58 = interval26.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period57);
        long long61 = chronology14.add((org.joda.time.ReadablePeriod) period57, (long) 'a', 4);
        org.joda.time.DurationField durationField62 = chronology14.hours();
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DurationField durationField64 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField65 = chronology14.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField62 and durationField64", Math.signum(durationField62.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField62)));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = property5.getAsShortText(locale6);
        org.joda.time.YearMonthDay yearMonthDay10 = property5.addToCopy(10);
        boolean boolean12 = property5.equals((java.lang.Object) "35322");
        int int13 = property5.getMaximumValue();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        java.lang.Integer int18 = dateTimeFormatter17.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withPivotYear(44);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale22.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter17.withLocale(locale22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.year();
        org.joda.time.DurationField durationField33 = chronology31.weekyears();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter25.withChronology(chronology31);
        java.lang.String str35 = chronology31.toString();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 35389875, chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.dayOfWeek();
        boolean boolean38 = property5.equals((java.lang.Object) dateTimeField37);
        org.joda.time.DurationField durationField39 = property5.getRangeDurationField();
        int int40 = property5.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField39", (durationField33.compareTo(durationField39) == 0) == durationField33.equals(durationField39));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.util.Locale locale5 = null;
        java.lang.String str6 = localTime1.toString("-1", locale5);
        org.joda.time.LocalTime localTime8 = localTime1.plusMillis(51);
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(2922789);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime dateTime18 = dateTime15.plusMillis((int) (byte) 0);
        int int19 = dateTime15.getHourOfDay();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Calendar calendar21 = dateTime15.toCalendar(locale20);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 16, chronology27);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.Interval interval41 = interval33.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str45 = interval44.toString();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.joda.time.Chronology chronology50 = interval48.getChronology();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Chronology chronology55 = interval53.getChronology();
        org.joda.time.Interval interval56 = interval48.overlap((org.joda.time.ReadableInterval) interval53);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(dateTimeZone57);
        org.joda.time.TimeOfDay timeOfDay59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = yearMonthDay58.toDateTime(timeOfDay59, dateTimeZone60);
        boolean boolean62 = dateTime61.isBeforeNow();
        org.joda.time.DateTime dateTime64 = dateTime61.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime66 = dateTime64.withMinuteOfHour((int) (short) 0);
        boolean boolean67 = interval56.contains((org.joda.time.ReadableInstant) dateTime64);
        boolean boolean68 = interval44.contains((org.joda.time.ReadableInterval) interval56);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.Interval interval70 = interval44.withPeriodBeforeEnd(readablePeriod69);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = interval44.toPeriod(periodType71);
        org.joda.time.Interval interval73 = interval41.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period72);
        long long76 = chronology27.add((org.joda.time.ReadablePeriod) period72, 0L, 35271);
        org.joda.time.DateTime dateTime78 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period72, 9);
        org.joda.time.Period period79 = period72.toPeriod();
        org.joda.time.LocalTime localTime80 = localTime10.minus((org.joda.time.ReadablePeriod) period72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        int int9 = property7.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight13 = property12.getDateMidnight();
        int int14 = property7.compareTo((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfCentury(10);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        org.joda.time.LocalDate.Property property21 = localDate19.centuryOfEra();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long47 = dateTimeZone45.previousTransition((long) 8);
        org.joda.time.Interval interval48 = localDate19.toInterval(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((java.lang.Object) dateMidnight13, dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar22", (calendar0.compareTo(calendar22) == 0) == calendar0.equals(calendar22));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long25 = dateTimeZone23.previousTransition((long) 8);
        java.lang.String str26 = dateTimeZone23.toString();
        java.util.TimeZone timeZone27 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone32 = dateTimeZone23.toTimeZone();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone32);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar33", (calendar21.compareTo(calendar33) == 0) == calendar21.equals(calendar33));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Interval interval11 = interval2.toInterval();
        org.joda.time.Chronology chronology12 = interval2.getChronology();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.Interval interval23 = interval15.overlap((org.joda.time.ReadableInterval) interval20);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        boolean boolean29 = dateTime28.isBeforeNow();
        org.joda.time.DateTime dateTime31 = dateTime28.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour((int) (short) 0);
        boolean boolean34 = interval23.contains((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean35 = interval23.isBeforeNow();
        boolean boolean36 = interval2.isBefore((org.joda.time.ReadableInterval) interval23);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfCentury();
        org.joda.time.LocalDate.Property property39 = localDate37.era();
        int int40 = localDate37.size();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        boolean boolean46 = dateTime45.isBeforeNow();
        org.joda.time.DateTime dateTime48 = dateTime45.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean50 = dateTime48.isSupported(dateTimeFieldType49);
        int int51 = localDate37.indexOf(dateTimeFieldType49);
        org.joda.time.LocalDate localDate53 = localDate37.withDayOfYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTime(timeOfDay56, dateTimeZone57);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime63 = dateTime61.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime61.getZone();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance();
        calendar65.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay69 = org.joda.time.YearMonthDay.fromCalendarFields(calendar65);
        calendar65.setFirstDayOfWeek(2022);
        int int73 = calendar65.getMinimum(2);
        java.util.TimeZone timeZone74 = calendar65.getTimeZone();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime78 = interval77.getEnd();
        org.joda.time.Chronology chronology79 = interval77.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.year();
        java.util.Locale locale81 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleKeys();
        java.lang.String str83 = locale81.getDisplayCountry();
        int int84 = dateTimeField80.getMaximumTextLength(locale81);
        java.lang.String str85 = locale81.getDisplayScript();
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(locale81);
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone74, locale81);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        long long90 = dateTimeZone88.previousTransition((long) 8);
        long long92 = dateTimeZone64.getMillisKeepLocal(dateTimeZone88, (long) (byte) 0);
        org.joda.time.DateMidnight dateMidnight93 = localDate53.toDateMidnight(dateTimeZone64);
        org.joda.time.DateMidnight dateMidnight95 = dateMidnight93.minusMonths(587);
        org.joda.time.Instant instant96 = dateMidnight95.toInstant();
        boolean boolean97 = interval2.isAfter((org.joda.time.ReadableInstant) dateMidnight95);
        org.joda.time.Period period98 = interval2.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight95 and instant96", (dateMidnight95.compareTo(instant96) == 0) == dateMidnight95.equals(instant96));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay13.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTime dateTime24 = yearMonthDay19.toDateTimeAtCurrentTime();
        int int25 = property17.compareTo((org.joda.time.ReadablePartial) yearMonthDay19);
        org.joda.time.Chronology chronology26 = yearMonthDay19.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTime dateTime29 = dateTime10.withChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime10.toMutableDateTime();
        long long31 = dateTime10.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime30", (dateTime29.compareTo(mutableDateTime30) == 0) == dateTime29.equals(mutableDateTime30));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        int int12 = dateTime4.getYear();
        org.joda.time.DateTime dateTime14 = dateTime4.withSecondOfMinute(8);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(32);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.Chronology chronology19 = yearMonthDay18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime14.toDateTime(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime20", (dateTime14.compareTo(dateTime20) == 0) == dateTime14.equals(dateTime20));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        boolean boolean12 = dateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        int int30 = dateTime10.get(dateTimeField29);
        org.joda.time.DurationField durationField31 = dateTimeField29.getRangeDurationField();
        org.joda.time.DurationField durationField32 = dateTimeField29.getDurationField();
        org.joda.time.DurationField durationField33 = dateTimeField29.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField33", Math.signum(durationField28.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField28)));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withPeriodAdded(readablePeriod1, 0);
        int int4 = dateMidnight0.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight0.plusWeeks((-292275054));
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) 0);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay17.property(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime14.property(dateTimeFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType22.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay27.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = yearMonthDay33.toDateTime(timeOfDay34, dateTimeZone35);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay33.monthOfYear();
        org.joda.time.DateTime dateTime38 = yearMonthDay33.toDateTimeAtCurrentTime();
        int int39 = property31.compareTo((org.joda.time.ReadablePartial) yearMonthDay33);
        org.joda.time.Chronology chronology40 = yearMonthDay33.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.weekOfWeekyear();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str56 = interval55.toString();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.Interval interval67 = interval59.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = yearMonthDay69.toDateTime(timeOfDay70, dateTimeZone71);
        boolean boolean73 = dateTime72.isBeforeNow();
        org.joda.time.DateTime dateTime75 = dateTime72.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime77 = dateTime75.withMinuteOfHour((int) (short) 0);
        boolean boolean78 = interval67.contains((org.joda.time.ReadableInstant) dateTime75);
        boolean boolean79 = interval55.contains((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.Interval interval81 = interval55.withPeriodBeforeEnd(readablePeriod80);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = interval55.toPeriod(periodType82);
        org.joda.time.Interval interval84 = interval52.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        long long87 = chronology40.add((org.joda.time.ReadablePeriod) period83, (long) 'a', 4);
        org.joda.time.DateTimeField dateTimeField88 = dateTimeFieldType22.getField(chronology40);
        org.joda.time.LocalDate localDate89 = org.joda.time.LocalDate.now(chronology40);
        org.joda.time.DateMidnight dateMidnight90 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.Chronology chronology91 = chronology40.withUTC();
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime((java.lang.Object) dateMidnight0, chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and dateMidnight90", (dateMidnight0.compareTo(dateMidnight90) == 0) == dateMidnight0.equals(dateMidnight90));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay10.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay10.property(dateTimeFieldType15);
        org.joda.time.DateTime.Property property17 = dateTime7.property(dateTimeFieldType15);
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType15.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.dayOfWeek();
        org.joda.time.DateMidnight.Property property22 = dateMidnight20.dayOfWeek();
        org.joda.time.DateMidnight.Property property23 = dateMidnight20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.DateMidnight dateMidnight25 = property23.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight26 = property23.roundHalfFloorCopy();
        int int27 = dateMidnight26.getDayOfWeek();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withCenturyOfEra(13);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTime(timeOfDay32, dateTimeZone33);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay37.monthOfYear();
        org.joda.time.DateTime dateTime42 = yearMonthDay37.toDateTimeAtCurrentTime();
        int int43 = property35.compareTo((org.joda.time.ReadablePartial) yearMonthDay37);
        org.joda.time.Chronology chronology44 = yearMonthDay37.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.weekOfWeekyear();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.joda.time.Chronology chronology50 = interval48.getChronology();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Chronology chronology55 = interval53.getChronology();
        org.joda.time.Interval interval56 = interval48.overlap((org.joda.time.ReadableInterval) interval53);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str60 = interval59.toString();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime64 = interval63.getEnd();
        org.joda.time.Chronology chronology65 = interval63.getChronology();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.Interval interval71 = interval63.overlap((org.joda.time.ReadableInterval) interval68);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.YearMonthDay yearMonthDay73 = new org.joda.time.YearMonthDay(dateTimeZone72);
        org.joda.time.TimeOfDay timeOfDay74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = yearMonthDay73.toDateTime(timeOfDay74, dateTimeZone75);
        boolean boolean77 = dateTime76.isBeforeNow();
        org.joda.time.DateTime dateTime79 = dateTime76.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime81 = dateTime79.withMinuteOfHour((int) (short) 0);
        boolean boolean82 = interval71.contains((org.joda.time.ReadableInstant) dateTime79);
        boolean boolean83 = interval59.contains((org.joda.time.ReadableInterval) interval71);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.Interval interval85 = interval59.withPeriodBeforeEnd(readablePeriod84);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = interval59.toPeriod(periodType86);
        org.joda.time.Interval interval88 = interval56.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period87);
        long long91 = chronology44.add((org.joda.time.ReadablePeriod) period87, (long) 'a', 4);
        org.joda.time.DurationField durationField92 = chronology44.hours();
        org.joda.time.MutableDateTime mutableDateTime93 = dateMidnight26.toMutableDateTime(chronology44);
        boolean boolean94 = durationFieldType18.isSupported(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight20 and mutableDateTime93", (dateMidnight20.compareTo(mutableDateTime93) == 0) == dateMidnight20.equals(mutableDateTime93));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getWeekYear();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.getID();
        long long18 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) calendar0, dateTimeZone15);
        java.util.Date date20 = localDate19.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long25 = dateTimeZone23.previousTransition((long) 8);
        java.lang.String str26 = dateTimeZone23.toString();
        java.util.TimeZone timeZone27 = dateTimeZone23.toTimeZone();
        long long31 = dateTimeZone23.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone32 = dateTimeZone23.toTimeZone();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        java.lang.String str35 = locale33.getDisplayLanguage();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone32, locale33);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone32, locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar36", (calendar21.compareTo(calendar36) == 0) == calendar21.equals(calendar36));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        boolean boolean24 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime30.toDateTime(chronology38);
        boolean boolean40 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime23.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.era();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        org.joda.time.DateTime dateTime45 = dateTime4.toDateTime(chronology44);
        org.joda.time.DurationField durationField46 = chronology44.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime45", (dateTime4.compareTo(dateTime45) == 0) == dateTime4.equals(dateTime45));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        long long5 = calendar0.getTimeInMillis();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTime(timeOfDay8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        calendar10.add(3, 22);
        calendar10.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date16 = calendar10.getTime();
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromCalendarFields(calendar10);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(588);
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay17.plusMillis(768);
        org.joda.time.DateTime dateTime23 = yearMonthDay7.toDateTime(timeOfDay17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar10", (calendar0.compareTo(calendar10) == 0) == calendar0.equals(calendar10));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 134, chronology5);
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField11", (durationField7.compareTo(durationField11) == 0) == durationField7.equals(durationField11));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        int int59 = dateTime36.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime36.plus(readableDuration60);
        org.joda.time.DateTime.Property property62 = dateTime61.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and dateTime58", (dateTime61.compareTo(dateTime58) == 0) == dateTime61.equals(dateTime58));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfYear(49);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfWeek();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.centuryOfEra();
        org.joda.time.Instant instant9 = dateMidnight6.toInstant();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withCenturyOfEra(35281);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMillis((int) (byte) 0);
        int int20 = dateTime19.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay22.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay22.property(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime19.property(dateTimeFieldType27);
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType27.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.Chronology chronology33 = yearMonthDay32.getChronology();
        org.joda.time.DurationField durationField34 = durationFieldType30.getField(chronology33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(chronology33);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str37 = dateTimeFieldType36.toString();
        int int38 = localDate35.get(dateTimeFieldType36);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.minuteOfHour();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology43);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate51 = localDate49.withYearOfCentury(10);
        org.joda.time.LocalDate localDate53 = localDate51.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property54 = localDate53.weekyear();
        org.joda.time.LocalDate.Property property55 = localDate53.centuryOfEra();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        calendar56.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromCalendarFields(calendar56);
        calendar56.setFirstDayOfWeek(2022);
        int int64 = calendar56.getMinimum(2);
        java.util.TimeZone timeZone65 = calendar56.getTimeZone();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.year();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str74 = locale72.getDisplayCountry();
        int int75 = dateTimeField71.getMaximumTextLength(locale72);
        java.lang.String str76 = locale72.getDisplayScript();
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone65, locale72);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        long long81 = dateTimeZone79.previousTransition((long) 8);
        org.joda.time.Interval interval82 = localDate53.toInterval(dateTimeZone79);
        org.joda.time.Chronology chronology83 = chronology43.withZone(dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType36.getField(chronology43);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight11.withField(dateTimeFieldType36, 589);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and instant9", (dateMidnight6.compareTo(instant9) == 0) == dateMidnight6.equals(instant9));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        boolean boolean23 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime22.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType26.getRangeDurationType();
        org.joda.time.DateTime.Property property29 = dateTime17.property(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType26.getRangeDurationType();
        int int31 = localDate7.get(dateTimeFieldType26);
        int int32 = yearMonthDay4.get(dateTimeFieldType26);
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay4.dayOfMonth();
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = yearMonthDay4.toDateMidnight(dateTimeZone35);
        org.joda.time.Interval interval37 = yearMonthDay4.toInterval();
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay4.plusMonths(134);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        boolean boolean46 = dateTime45.isBeforeNow();
        org.joda.time.DateTime dateTime48 = dateTime45.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime50 = dateTime48.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime48.getZone();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance();
        calendar52.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay56 = org.joda.time.YearMonthDay.fromCalendarFields(calendar52);
        calendar52.setFirstDayOfWeek(2022);
        int int60 = calendar52.getMinimum(2);
        java.util.TimeZone timeZone61 = calendar52.getTimeZone();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.year();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.lang.String str70 = locale68.getDisplayCountry();
        int int71 = dateTimeField67.getMaximumTextLength(locale68);
        java.lang.String str72 = locale68.getDisplayScript();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(locale68);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(timeZone61, locale68);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        long long77 = dateTimeZone75.previousTransition((long) 8);
        long long79 = dateTimeZone51.getMillisKeepLocal(dateTimeZone75, (long) (byte) 0);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) 35277, dateTimeZone75);
        long long82 = dateTimeZone75.convertUTCToLocal((long) 'a');
        java.lang.String str84 = dateTimeZone75.getName((long) 35334189);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(dateTimeZone75);
        org.joda.time.DateTime dateTime86 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar52", (calendar0.compareTo(calendar52) == 0) == calendar0.equals(calendar52));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Interval interval4 = interval2.withDurationBeforeEnd(readableDuration3);
        org.joda.time.Interval interval5 = interval4.toInterval();
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.withMinuteOfHour(0);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) instant10, dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        int int17 = dateMidnight14.getMinuteOfDay();
        org.joda.time.Instant instant18 = dateMidnight14.toInstant();
        int int19 = dateMidnight14.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DurationField durationField8 = chronology4.months();
        org.joda.time.DurationField durationField9 = chronology4.months();
        org.joda.time.DurationField durationField10 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField6", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        boolean boolean24 = interval13.equals((java.lang.Object) dateTime18);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Chronology chronology34 = interval32.getChronology();
        org.joda.time.Interval interval35 = interval27.overlap((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str39 = interval38.toString();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.Interval interval50 = interval42.overlap((org.joda.time.ReadableInterval) interval47);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone51);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay52.toDateTime(timeOfDay53, dateTimeZone54);
        boolean boolean56 = dateTime55.isBeforeNow();
        org.joda.time.DateTime dateTime58 = dateTime55.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour((int) (short) 0);
        boolean boolean61 = interval50.contains((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean62 = interval38.contains((org.joda.time.ReadableInterval) interval50);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.Interval interval64 = interval38.withPeriodBeforeEnd(readablePeriod63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = interval38.toPeriod(periodType65);
        org.joda.time.Interval interval67 = interval35.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period66);
        org.joda.time.MutablePeriod mutablePeriod68 = period66.toMutablePeriod();
        org.joda.time.Interval interval69 = interval13.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        org.joda.time.YearMonthDay.Property property75 = yearMonthDay71.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay(dateTimeZone76);
        org.joda.time.TimeOfDay timeOfDay78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay77.toDateTime(timeOfDay78, dateTimeZone79);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay77.monthOfYear();
        org.joda.time.DateTime dateTime82 = yearMonthDay77.toDateTimeAtCurrentTime();
        int int83 = property75.compareTo((org.joda.time.ReadablePartial) yearMonthDay77);
        org.joda.time.Chronology chronology84 = yearMonthDay77.getChronology();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(chronology84);
        org.joda.time.DateTime dateTime87 = dateTime85.withWeekyear(35280);
        org.joda.time.Interval interval88 = interval69.withEnd((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime dateTime89 = interval69.getEnd();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime74 and dateTime85", (dateTime74.compareTo(dateTime85) == 0) == dateTime74.equals(dateTime85));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        int int17 = property15.getMaximumTextLength(locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone9, locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone9, locale19);
        int int22 = calendar21.getWeeksInWeekYear();
        java.util.TimeZone timeZone23 = calendar21.getTimeZone();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar21", (calendar18.compareTo(calendar21) == 0) == calendar18.equals(calendar21));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder33.setWeekDate(871, 37, 444);
        java.util.Calendar.Builder builder41 = builder33.setWeekDate(31, 68, 343);
        java.util.Calendar.Builder builder46 = builder41.setTimeOfDay(52, (-292275054), 111, 764);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        int int52 = dateTime51.getCenturyOfEra();
        org.joda.time.DateTime dateTime54 = dateTime51.plusMillis((int) (byte) 0);
        int int55 = dateTime51.getHourOfDay();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.util.Calendar calendar57 = dateTime51.toCalendar(locale56);
        java.lang.String str58 = locale56.getDisplayVariant();
        java.lang.String str59 = locale56.getDisplayScript();
        boolean boolean60 = locale56.hasExtensions();
        java.util.Calendar.Builder builder61 = builder41.setLocale(locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar57", (calendar26.compareTo(calendar57) == 0) == calendar26.equals(calendar57));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.Interval interval15 = interval7.overlap((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str19 = interval18.toString();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.Interval interval30 = interval22.overlap((org.joda.time.ReadableInterval) interval27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.TimeOfDay timeOfDay33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = yearMonthDay32.toDateTime(timeOfDay33, dateTimeZone34);
        boolean boolean36 = dateTime35.isBeforeNow();
        org.joda.time.DateTime dateTime38 = dateTime35.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime40 = dateTime38.withMinuteOfHour((int) (short) 0);
        boolean boolean41 = interval30.contains((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean42 = interval18.contains((org.joda.time.ReadableInterval) interval30);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.Interval interval44 = interval18.withPeriodBeforeEnd(readablePeriod43);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = interval18.toPeriod(periodType45);
        org.joda.time.Interval interval47 = interval15.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period46);
        org.joda.time.MutablePeriod mutablePeriod48 = period46.toMutablePeriod();
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay1.minus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        boolean boolean54 = dateTimeZone51.isStandardOffset(35271L);
        long long58 = dateTimeZone51.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.DateTime dateTime59 = yearMonthDay1.toDateTimeAtMidnight(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime52", (dateTime4.compareTo(dateTime52) == 0) == dateTime4.equals(dateTime52));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfSecond();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 992, chronology5);
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField7", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        int int17 = dateMidnight14.getMinuteOfDay();
        org.joda.time.Instant instant18 = dateMidnight14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        int int24 = dateTime23.getCenturyOfEra();
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis((int) (byte) 0);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime23);
        int int28 = dateTime23.getEra();
        org.joda.time.DateMidnight dateMidnight29 = dateTime23.toDateMidnight();
        int int30 = dateMidnight14.compareTo((org.joda.time.ReadableInstant) dateMidnight29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay1.plusYears(962);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, 1L);
        org.joda.time.Interval interval9 = interval5.gap((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval20 = interval12.overlap((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Duration duration21 = interval20.toDuration();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        boolean boolean27 = dateTime26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = dateTime26.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (byte) 100);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime31);
        long long35 = duration21.getMillis();
        org.joda.time.Period period36 = duration21.toPeriod();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance();
        calendar37.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay41 = org.joda.time.YearMonthDay.fromCalendarFields(calendar37);
        calendar37.setFirstDayOfWeek(2022);
        int int45 = calendar37.getMinimum(2);
        java.util.TimeZone timeZone46 = calendar37.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        java.util.Locale locale53 = java.util.Locale.ITALY;
        int int54 = property52.getMaximumTextLength(locale53);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone46, locale53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone46);
        boolean boolean58 = duration21.equals((java.lang.Object) calendar57);
        org.joda.time.Interval interval59 = interval8.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar55 and calendar57", (calendar55.compareTo(calendar57) == 0) == calendar55.equals(calendar57));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar calendar34 = builder4.build();
        java.util.Calendar.Builder builder38 = builder4.setTimeOfDay(31, 35405, 35356782);
        java.util.Calendar.Builder builder40 = builder4.setLenient(false);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        int int46 = dateTime45.getCenturyOfEra();
        org.joda.time.DateTime dateTime48 = dateTime45.plusMillis((int) (byte) 0);
        int int49 = dateTime45.getHourOfDay();
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.util.Calendar calendar51 = dateTime45.toCalendar(locale50);
        java.lang.String str52 = locale50.getDisplayVariant();
        java.lang.String str53 = locale50.getDisplayVariant();
        java.lang.String str54 = locale50.getDisplayName();
        java.util.Calendar.Builder builder55 = builder40.setLocale(locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar51", (calendar26.compareTo(calendar51) == 0) == calendar26.equals(calendar51));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DurationField durationField8 = chronology4.months();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField6", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        int int59 = dateTime36.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime36.plus(readableDuration60);
        org.joda.time.DateTime dateTime62 = dateTime36.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime36", (dateTime58.compareTo(dateTime36) == 0) == dateTime58.equals(dateTime36));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 134, chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = chronology5.centuries();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField7", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.minusMonths(15);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusYears(35272);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        int int14 = dateTime13.getYearOfCentury();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfEra((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime26.getZone();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance();
        calendar30.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay34 = org.joda.time.YearMonthDay.fromCalendarFields(calendar30);
        calendar30.setFirstDayOfWeek(2022);
        int int38 = calendar30.getMinimum(2);
        java.util.TimeZone timeZone39 = calendar30.getTimeZone();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.year();
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleKeys();
        java.lang.String str48 = locale46.getDisplayCountry();
        int int49 = dateTimeField45.getMaximumTextLength(locale46);
        java.lang.String str50 = locale46.getDisplayScript();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale46);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone39, locale46);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long55 = dateTimeZone53.previousTransition((long) 8);
        long long57 = dateTimeZone29.getMillisKeepLocal(dateTimeZone53, (long) (byte) 0);
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 368, dateTimeZone29);
        long long62 = dateTimeZone29.adjustOffset((long) 93, false);
        org.joda.time.DateTime dateTime63 = dateTime13.withZone(dateTimeZone29);
        org.joda.time.LocalDate localDate64 = org.joda.time.LocalDate.now(dateTimeZone29);
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.Interval interval66 = yearMonthDay6.toInterval(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar30", (calendar0.compareTo(calendar30) == 0) == calendar0.equals(calendar30));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        boolean boolean13 = dateTime12.isBeforeNow();
        org.joda.time.DateTime dateTime15 = dateTime12.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime15.getZone();
        int int20 = dateTimeZone18.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime21 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTime dateTime30 = dateTime27.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime27.toDateTime(chronology35);
        boolean boolean37 = durationFieldType22.isSupported(chronology35);
        org.joda.time.DateTime dateTime39 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Chronology chronology45 = interval43.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.minutes();
        org.joda.time.DurationField durationField47 = chronology45.weekyears();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.minuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.clockhourOfHalfday();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((-62100742311688L), chronology45);
        org.joda.time.DateTimeField dateTimeField53 = chronology45.monthOfYear();
        org.joda.time.DurationField durationField54 = chronology45.hours();
        org.joda.time.DurationField durationField55 = durationFieldType22.getField(chronology45);
        org.joda.time.DateTimeField dateTimeField56 = chronology45.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField55", (durationField47.compareTo(durationField55) == 0) == durationField47.equals(durationField55));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime4.weekOfWeekyear();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        calendar13.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields(calendar13);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay21.toDateTime(timeOfDay22, dateTimeZone23);
        int int25 = dateTime24.getCenturyOfEra();
        org.joda.time.DateTime dateTime27 = dateTime24.plusMillis((int) (byte) 0);
        int int28 = dateTime27.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property36 = yearMonthDay30.property(dateTimeFieldType35);
        org.joda.time.DateTime.Property property37 = dateTime27.property(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.Chronology chronology41 = yearMonthDay40.getChronology();
        org.joda.time.DurationField durationField42 = durationFieldType38.getField(chronology41);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay17.withFieldAdded(durationFieldType38, (int) (short) 100);
        org.joda.time.DateTime dateTime45 = dateTime4.withFields((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.DateTime dateTime47 = dateTime45.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 55);
        org.joda.time.DateMidnight dateMidnight50 = localDate49.toDateMidnight();
        org.joda.time.DateTime dateTime51 = dateMidnight50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay(dateTimeZone52);
        org.joda.time.TimeOfDay timeOfDay54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = yearMonthDay53.toDateTime(timeOfDay54, dateTimeZone55);
        boolean boolean57 = dateTime56.isBeforeNow();
        org.joda.time.DateTime dateTime59 = dateTime56.withMonthOfYear((int) (byte) 1);
        int int60 = dateTime56.getYear();
        org.joda.time.DateTime.Property property61 = dateTime56.weekyear();
        org.joda.time.DateTime dateTime62 = property61.withMaximumValue();
        java.lang.String str63 = dateTime62.toString();
        org.joda.time.DateTime.Property property64 = dateTime62.year();
        org.joda.time.DateTime.Property property65 = dateTime62.weekOfWeekyear();
        int int66 = dateTime51.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Interval interval71 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime72 = interval71.getEnd();
        org.joda.time.Chronology chronology73 = interval71.getChronology();
        org.joda.time.DurationField durationField74 = chronology73.minutes();
        org.joda.time.DurationField durationField75 = chronology73.weekyears();
        org.joda.time.DurationField durationField76 = chronology73.millis();
        org.joda.time.DurationField durationField77 = chronology73.months();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 70, chronology73);
        org.joda.time.DateTimeField dateTimeField79 = chronology73.hourOfDay();
        org.joda.time.YearMonthDay yearMonthDay80 = new org.joda.time.YearMonthDay(45379L, chronology73);
        org.joda.time.DateTime dateTime81 = dateTime62.withChronology(chronology73);
        java.lang.String str82 = dateTime81.toString();
        int int83 = dateTime45.compareTo((org.joda.time.ReadableInstant) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField77", (durationField42.compareTo(durationField77) == 0) == durationField42.equals(durationField77));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.set(9, 1, (int) ' ', 0, 16);
        calendar0.setFirstDayOfWeek(35371);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar9);
        calendar9.setFirstDayOfWeek(2022);
        int int17 = calendar9.getMinimum(2);
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        int int26 = dateTimeField25.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay28.withYear(22);
        int int33 = yearMonthDay28.size();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        calendar34.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay38 = org.joda.time.YearMonthDay.fromCalendarFields(calendar34);
        org.joda.time.YearMonthDay yearMonthDay40 = yearMonthDay38.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay38.year();
        int[] intArray42 = yearMonthDay38.getValues();
        int int43 = dateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay28, intArray42);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate46 = localDate44.withYearOfCentury(10);
        org.joda.time.LocalDate localDate48 = localDate46.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = yearMonthDay50.toDateTime(timeOfDay51, dateTimeZone52);
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay50.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTime(timeOfDay57, dateTimeZone58);
        org.joda.time.YearMonthDay.Property property60 = yearMonthDay56.monthOfYear();
        org.joda.time.DateTime dateTime61 = yearMonthDay56.toDateTimeAtCurrentTime();
        int int62 = property54.compareTo((org.joda.time.ReadablePartial) yearMonthDay56);
        org.joda.time.Chronology chronology63 = yearMonthDay56.getChronology();
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay56.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean67 = yearMonthDay56.isSupported(dateTimeFieldType66);
        boolean boolean68 = localDate48.isSupported(dateTimeFieldType66);
        java.util.Locale locale70 = java.util.Locale.UK;
        java.lang.String str71 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDate48, 9, locale70);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone18, locale70);
        int int73 = calendar0.compareTo(calendar72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar34", (calendar9.compareTo(calendar34) == 0) == calendar9.equals(calendar34));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfYear(49);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfWeek();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.centuryOfEra();
        org.joda.time.Instant instant9 = dateMidnight6.toInstant();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property26 = localDate24.centuryOfEra();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay31 = org.joda.time.YearMonthDay.fromCalendarFields(calendar27);
        calendar27.setFirstDayOfWeek(2022);
        int int35 = calendar27.getMinimum(2);
        java.util.TimeZone timeZone36 = calendar27.getTimeZone();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayCountry();
        int int46 = dateTimeField42.getMaximumTextLength(locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale43);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone36, locale43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long52 = dateTimeZone50.previousTransition((long) 8);
        org.joda.time.Interval interval53 = localDate24.toInterval(dateTimeZone50);
        org.joda.time.Chronology chronology54 = chronology14.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = chronology14.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight6.withChronology(chronology14);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.withYear(768);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight56 and instant9", (dateMidnight56.compareTo(instant9) == 0) == dateMidnight56.equals(instant9));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.lang.String str25 = locale24.getVariant();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone9, locale24);
        java.lang.String str27 = locale24.getVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar26", (calendar21.compareTo(calendar26) == 0) == calendar21.equals(calendar26));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfDay();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(42);
        org.joda.time.DateTime dateTime8 = property5.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTime dateTime11 = dateTime8.withFieldAdded(durationFieldType9, 722);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay15.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay15.withYear(22);
        org.joda.time.Chronology chronology20 = yearMonthDay19.getChronology();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 75, (long) 35297, chronology20);
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.year();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology20);
        boolean boolean25 = durationFieldType9.isSupported(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime24", (dateTime4.compareTo(dateTime24) == 0) == dateTime4.equals(dateTime24));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        calendar0.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date6 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(35271);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar9);
        calendar9.setFirstDayOfWeek(2022);
        int int17 = calendar9.getMinimum(2);
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = locale25.getDisplayCountry();
        int int28 = dateTimeField24.getMaximumTextLength(locale25);
        java.lang.String str29 = locale25.getDisplayScript();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale25);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone18, locale25);
        calendar0.setTimeZone(timeZone18);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        int int7 = dateTime6.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMillis((int) (byte) 0);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay12.property(dateTimeFieldType17);
        org.joda.time.DateTime.Property property19 = dateTime9.property(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.Chronology chronology23 = yearMonthDay22.getChronology();
        org.joda.time.DurationField durationField24 = durationFieldType20.getField(chronology23);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (-1), chronology23);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-62100742311688L), chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DurationField durationField30 = chronology23.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withPeriodAdded(readablePeriod1, 0);
        int int4 = dateMidnight0.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight0.withYearOfCentury(79);
        org.joda.time.DateMidnight.Property property7 = dateMidnight0.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight9 = property7.setCopy(0);
        org.joda.time.DateMidnight dateMidnight10 = property7.roundHalfCeilingCopy();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        calendar11.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay15 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
        calendar11.setFirstDayOfWeek(2022);
        int int19 = calendar11.getMinimum(2);
        java.util.TimeZone timeZone20 = calendar11.getTimeZone();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getDisplayCountry();
        int int30 = dateTimeField26.getMaximumTextLength(locale27);
        java.lang.String str31 = locale27.getDisplayScript();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale27);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone20, locale27);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long36 = dateTimeZone34.previousTransition((long) 8);
        java.lang.String str37 = dateTimeZone34.toString();
        java.util.TimeZone timeZone38 = dateTimeZone34.toTimeZone();
        long long42 = dateTimeZone34.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone43 = dateTimeZone34.toTimeZone();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        java.lang.String str46 = locale44.getDisplayLanguage();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone43, locale44);
        java.lang.String str48 = property7.getAsText(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar47", (calendar32.compareTo(calendar47) == 0) == calendar32.equals(calendar47));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(2);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        java.lang.String str15 = dateTime14.toString();
        boolean boolean16 = dateTime14.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset(35271L);
        long long29 = dateTimeZone22.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.Interval interval30 = yearMonthDay18.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime31 = dateTime14.withZone(dateTimeZone22);
        int int33 = dateTimeZone22.getOffset((long) 125);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.year();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 16, chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay19.property(dateTimeFieldType24);
        int int26 = dateTime17.get(dateTimeFieldType24);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay32.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay32.withYear(22);
        org.joda.time.Chronology chronology37 = yearMonthDay36.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 75, (long) 35297, chronology37);
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.joda.time.DurationField durationField40 = chronology37.years();
        boolean boolean41 = durationFieldType28.isSupported(chronology37);
        org.joda.time.LocalDate localDate43 = localDate10.withFieldAdded(durationFieldType28, 35475000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField39", (durationField7.compareTo(durationField39) == 0) == durationField7.equals(durationField39));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone10);
        int int12 = localDateTime11.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusDays(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.centuryOfEra();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime();
        long long20 = chronology5.set((org.joda.time.ReadablePartial) localDateTime14, (long) 7);
        org.joda.time.DurationField durationField21 = chronology5.eras();
        org.joda.time.DurationField durationField22 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField22", Math.signum(durationField6.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField6)));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMillis((long) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime4.isBefore(readableInstant10);
        org.joda.time.DateTime dateTime13 = dateTime4.withMillisOfSecond((int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime4.withMillis((long) 7);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTime.Property property17 = dateTime15.hourOfDay();
        java.lang.String str18 = property17.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder33.setWeekDate(871, 37, 444);
        java.util.Calendar.Builder builder41 = builder33.setWeekDate(31, 68, 343);
        java.util.Calendar.Builder builder46 = builder41.setTimeOfDay(52, (-292275054), 111, 764);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance();
        calendar47.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay51 = org.joda.time.YearMonthDay.fromCalendarFields(calendar47);
        calendar47.setFirstDayOfWeek(2022);
        int int55 = calendar47.getMinimum(2);
        java.util.TimeZone timeZone56 = calendar47.getTimeZone();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.year();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = locale63.getDisplayCountry();
        int int66 = dateTimeField62.getMaximumTextLength(locale63);
        java.lang.String str67 = locale63.getDisplayScript();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(locale63);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone56, locale63);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        long long72 = dateTimeZone70.previousTransition((long) 8);
        java.lang.String str73 = dateTimeZone70.toString();
        java.util.TimeZone timeZone74 = dateTimeZone70.toTimeZone();
        long long78 = dateTimeZone70.convertLocalToUTC(1644572896626L, false, (long) 32);
        java.util.TimeZone timeZone79 = dateTimeZone70.toTimeZone();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone79);
        java.util.Calendar.Builder builder81 = builder41.setTimeZone(timeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar80", (calendar26.compareTo(calendar80) == 0) == calendar26.equals(calendar80));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone9);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar23", (calendar21.compareTo(calendar23) == 0) == calendar21.equals(calendar23));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTime dateTime50 = yearMonthDay4.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        int int6 = calendar0.getGreatestMinimum((int) (byte) 10);
        calendar0.clear();
        int int8 = calendar0.getFirstDayOfWeek();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        calendar9.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar9);
        calendar9.setFirstDayOfWeek(2022);
        int int17 = calendar9.getMinimum(2);
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = locale25.getDisplayCountry();
        int int28 = dateTimeField24.getMaximumTextLength(locale25);
        java.lang.String str29 = locale25.getDisplayScript();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale25);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone18, locale25);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        calendar0.setTimeZone(timeZone18);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone18);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.fromCalendarFields(calendar34);
        org.joda.time.LocalDate localDate37 = localDate35.minusDays(193);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar30 and calendar34", (calendar30.compareTo(calendar34) == 0) == calendar30.equals(calendar34));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(871);
        org.joda.time.LocalTime.Property property6 = localTime5.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property10 = timeOfDay9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        org.joda.time.TimeOfDay timeOfDay12 = property10.withMaximumValue();
        org.joda.time.TimeOfDay.Property property13 = timeOfDay12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.TimeOfDay timeOfDay15 = property13.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay17 = property13.addNoWrapToCopy(708);
        java.util.Locale locale20 = new java.util.Locale("2022-02-09T22:48:08.395Z", "09:48:11.954");
        java.lang.String str21 = property13.getAsShortText(locale20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        boolean boolean23 = property13.equals((java.lang.Object) localTime22);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = locale30.getDisplayCountry();
        int int33 = dateTimeField29.getMaximumTextLength(locale30);
        java.lang.String str34 = locale30.getDisplayScript();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale30);
        java.lang.String str36 = locale30.getScript();
        java.util.Set<java.lang.Character> charSet37 = locale30.getExtensionKeys();
        java.lang.String str38 = property13.getAsShortText(locale30);
        java.lang.String str39 = property6.getAsShortText(locale30);
        org.joda.time.LocalTime localTime41 = property6.addCopy(667);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar35", (calendar0.compareTo(calendar35) == 0) == calendar0.equals(calendar35));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        long long19 = dateTimeZone10.convertLocalToUTC(229L, true);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.lang.String str46 = locale45.getVariant();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone30, locale45);
        java.lang.String str48 = dateTimeZone10.getShortName((long) 371, locale45);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar47", (calendar42.compareTo(calendar47) == 0) == calendar42.equals(calendar47));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone10);
        int int12 = localDateTime11.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusDays(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.centuryOfEra();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime();
        long long20 = chronology5.set((org.joda.time.ReadablePartial) localDateTime14, (long) 7);
        org.joda.time.DurationField durationField21 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology5.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField21", Math.signum(durationField6.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField6)));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        java.lang.String str17 = dateTimeField15.getAsText((long) 292278994);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay25.monthOfYear();
        org.joda.time.DateTime dateTime30 = yearMonthDay25.toDateTimeAtCurrentTime();
        int int31 = property23.compareTo((org.joda.time.ReadablePartial) yearMonthDay25);
        org.joda.time.Chronology chronology32 = yearMonthDay25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay25.withMonthOfYear(10);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay34.withYear(35271);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = yearMonthDay36.getFieldTypes();
        int[] intArray42 = new int[] { (byte) 0, ' ', 708, 35275 };
        int int43 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay36, intArray42);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        calendar45.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay49 = org.joda.time.YearMonthDay.fromCalendarFields(calendar45);
        calendar45.setFirstDayOfWeek(2022);
        int int53 = calendar45.getMinimum(2);
        java.util.TimeZone timeZone54 = calendar45.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTime(timeOfDay57, dateTimeZone58);
        org.joda.time.YearMonthDay.Property property60 = yearMonthDay56.monthOfYear();
        java.util.Locale locale61 = java.util.Locale.ITALY;
        int int62 = property60.getMaximumTextLength(locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone54, locale61);
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale64);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone54, locale64);
        java.lang.String str67 = dateTimeField15.getAsShortText((long) 35333459, locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar63 and calendar66", (calendar63.compareTo(calendar66) == 0) == calendar63.equals(calendar66));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(chronology4);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusYears(5);
        java.lang.Object obj12 = null;
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.withDurationAdded((long) (short) 100, 22);
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(obj12, dateTimeZone20);
        org.joda.time.Interval interval23 = yearMonthDay11.toInterval(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusDays(2);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYearOfCentury((int) (byte) 1);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekyear();
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay11.withChronologyRetainFields(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField33", Math.signum(durationField5.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField5)));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone5);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.year();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayCountry();
        int int16 = dateTimeField12.getMaximumTextLength(locale13);
        long long19 = dateTimeField12.getDifferenceAsLong((long) 20, (long) 32772);
        java.lang.String str20 = dateTimeField12.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = dateTimeField12.getType();
        java.lang.String str22 = dateTimeField12.getName();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("months");
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.year();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getVariant();
        java.lang.String str35 = dateTimeField31.getAsShortText(3, locale33);
        java.lang.String str36 = locale33.getLanguage();
        java.lang.String str37 = locale33.getISO3Country();
        java.lang.String str38 = locale25.getDisplayScript(locale33);
        java.lang.String str39 = dateTimeField12.getAsShortText(563, locale25);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone5, locale25);
        java.lang.String str41 = locale25.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar40", (calendar6.compareTo(calendar40) == 0) == calendar6.equals(calendar40));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now();
        int int2 = dateMidnight1.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withYearOfCentury((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withPeriodAdded(readablePeriod5, 22);
        int int8 = dateMidnight7.getHourOfDay();
        int int9 = dateMidnight7.getWeekOfWeekyear();
        int int10 = dateMidnight7.getHourOfDay();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.minuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.DateTimeField dateTimeField21 = chronology15.clockhourOfHalfday();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight7.withChronology(chronology15);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Chronology chronology32 = interval30.getChronology();
        org.joda.time.Interval interval33 = interval25.overlap((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str37 = interval36.toString();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Chronology chronology47 = interval45.getChronology();
        org.joda.time.Interval interval48 = interval40.overlap((org.joda.time.ReadableInterval) interval45);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = yearMonthDay50.toDateTime(timeOfDay51, dateTimeZone52);
        boolean boolean54 = dateTime53.isBeforeNow();
        org.joda.time.DateTime dateTime56 = dateTime53.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime58 = dateTime56.withMinuteOfHour((int) (short) 0);
        boolean boolean59 = interval48.contains((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = interval36.contains((org.joda.time.ReadableInterval) interval48);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.Interval interval62 = interval36.withPeriodBeforeEnd(readablePeriod61);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = interval36.toPeriod(periodType63);
        org.joda.time.Interval interval65 = interval33.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period64);
        org.joda.time.MutablePeriod mutablePeriod66 = period64.toMutablePeriod();
        int[] intArray69 = chronology15.get((org.joda.time.ReadablePeriod) period64, (long) 668, (long) 34);
        org.joda.time.DurationField durationField70 = chronology15.years();
        org.joda.time.TimeOfDay timeOfDay71 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 35397, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField70", (durationField17.compareTo(durationField70) == 0) == durationField17.equals(durationField70));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) '4', chronology5);
        org.joda.time.LocalDate localDate12 = localDate10.minusDays((int) (byte) 10);
        org.joda.time.LocalDate localDate14 = localDate10.minusWeeks(2049);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getLanguage();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale16);
        java.lang.String str19 = localDate14.toString("09:49:37.804", locale16);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = builder20.build();
        java.util.Locale.Builder builder22 = builder20.clear();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder24 = builder22.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        int int30 = dateTime29.getCenturyOfEra();
        org.joda.time.DateTime dateTime32 = dateTime29.plusMillis((int) (byte) 0);
        int int33 = dateTime29.getHourOfDay();
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.util.Calendar calendar35 = dateTime29.toCalendar(locale34);
        java.lang.String str36 = locale34.getScript();
        java.util.Locale.Builder builder37 = builder22.setLocale(locale34);
        java.lang.String str38 = locale16.getDisplayName(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar35", (calendar18.compareTo(calendar35) == 0) == calendar18.equals(calendar35));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.LocalDate localDate62 = dateTime58.toLocalDate();
        org.joda.time.DateTime dateTime64 = dateTime58.plus(1834912128011L);
        org.joda.time.DateTime.Property property65 = dateTime58.minuteOfDay();
        org.joda.time.DateTime dateTime66 = property65.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtMidnight();
        int int5 = localDate0.getEra();
        org.joda.time.LocalDate.Property property6 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate7 = property6.withMinimumValue();
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 55);
        org.joda.time.DateMidnight dateMidnight11 = localDate10.toDateMidnight();
        org.joda.time.DateTime dateTime12 = dateMidnight11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        int int21 = dateTime17.getYear();
        org.joda.time.DateTime.Property property22 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateTime.Property property25 = dateTime23.year();
        org.joda.time.DateTime.Property property26 = dateTime23.weekOfWeekyear();
        int int27 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Chronology chronology34 = interval32.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.minutes();
        org.joda.time.DurationField durationField36 = chronology34.weekyears();
        org.joda.time.DurationField durationField37 = chronology34.millis();
        org.joda.time.DurationField durationField38 = chronology34.months();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 70, chronology34);
        org.joda.time.DateTimeField dateTimeField40 = chronology34.hourOfDay();
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(45379L, chronology34);
        org.joda.time.DateTime dateTime42 = dateTime23.withChronology(chronology34);
        java.lang.String str43 = dateTime42.toString();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.plus(readableDuration44);
        org.joda.time.DateTime dateTime46 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology51.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = yearMonthDay56.toDateTime(timeOfDay57, dateTimeZone58);
        boolean boolean60 = dateTime59.isBeforeNow();
        org.joda.time.DateTime dateTime62 = dateTime59.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime64 = dateTime62.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime62.getZone();
        int int67 = dateTimeZone65.getOffsetFromLocal((long) 871);
        long long69 = dateTimeZone54.getMillisKeepLocal(dateTimeZone65, (long) 35296);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance();
        calendar70.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay74 = org.joda.time.YearMonthDay.fromCalendarFields(calendar70);
        org.joda.time.YearMonthDay yearMonthDay76 = yearMonthDay74.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property77 = yearMonthDay74.monthOfYear();
        int int79 = yearMonthDay74.getValue((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        boolean boolean83 = dateTimeZone81.isStandardOffset(743L);
        org.joda.time.Interval interval84 = yearMonthDay74.toInterval(dateTimeZone81);
        boolean boolean85 = dateTimeZone81.isFixed();
        java.lang.String str86 = dateTimeZone81.toString();
        long long88 = dateTimeZone54.getMillisKeepLocal(dateTimeZone81, 1656633600000L);
        org.joda.time.DateTime dateTime89 = dateTime46.toDateTime(dateTimeZone81);
        long long91 = dateTimeZone81.convertUTCToLocal((long) 35331916);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime89", (dateTime46.compareTo(dateTime89) == 0) == dateTime46.equals(dateTime89));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.millisOfDay();
        org.joda.time.DurationField durationField9 = chronology4.years();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        int int22 = dateTimeZone20.getStandardOffset((long) 13);
        long long26 = dateTimeZone20.convertLocalToUTC(229L, false, (long) 49);
        int int28 = dateTimeZone20.getOffset(0L);
        org.joda.time.Chronology chronology29 = chronology4.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.isStandardOffset(35271L);
        long long12 = dateTimeZone5.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.Interval interval13 = yearMonthDay1.toInterval(dateTimeZone5);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.Interval interval24 = interval16.overlap((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour((int) (short) 0);
        boolean boolean35 = interval24.contains((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Interval interval36 = interval13.gap((org.joda.time.ReadableInterval) interval24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        int int6 = dateTime5.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMillis((int) (byte) 0);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay11.property(dateTimeFieldType16);
        org.joda.time.DateTime.Property property18 = dateTime8.property(dateTimeFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType16.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.Chronology chronology22 = yearMonthDay21.getChronology();
        org.joda.time.DurationField durationField23 = durationFieldType19.getField(chronology22);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(33L, chronology22);
        org.joda.time.DateMidnight.Property property25 = dateMidnight24.year();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.minusYears(2023);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime36.getZone();
        int int41 = dateTimeZone39.getStandardOffset((long) 13);
        long long45 = dateTimeZone39.convertLocalToUTC(229L, false, (long) 49);
        long long48 = dateTimeZone39.convertLocalToUTC(229L, true);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance();
        calendar50.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay54 = org.joda.time.YearMonthDay.fromCalendarFields(calendar50);
        calendar50.setFirstDayOfWeek(2022);
        int int58 = calendar50.getMinimum(2);
        java.util.TimeZone timeZone59 = calendar50.getTimeZone();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime63 = interval62.getEnd();
        org.joda.time.Chronology chronology64 = interval62.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.year();
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleKeys();
        java.lang.String str68 = locale66.getDisplayCountry();
        int int69 = dateTimeField65.getMaximumTextLength(locale66);
        java.lang.String str70 = locale66.getDisplayScript();
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(locale66);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(timeZone59, locale66);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.lang.String str75 = locale74.getVariant();
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone59, locale74);
        java.lang.String str77 = dateTimeZone39.getShortName((long) 371, locale74);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight27.withZoneRetainFields(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar71 and calendar76", (calendar71.compareTo(calendar76) == 0) == calendar71.equals(calendar76));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 134, chronology5);
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField11", (durationField7.compareTo(durationField11) == 0) == durationField7.equals(durationField11));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        calendar4.setFirstDayOfWeek(23);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        int int8 = localDate7.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        boolean boolean13 = dateTime12.isBeforeNow();
        org.joda.time.DateTime dateTime15 = dateTime12.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime12.toDateTime(chronology20);
        boolean boolean22 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime21.minusHours(35271);
        int int25 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.joda.time.DateMidnight.Property property28 = dateMidnight27.monthOfYear();
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now();
        long long30 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight29.withDayOfYear(49);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.dayOfWeek();
        org.joda.time.DateMidnight.Property property34 = dateMidnight32.centuryOfEra();
        org.joda.time.Instant instant35 = dateMidnight32.toInstant();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.year();
        org.joda.time.DurationField durationField42 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.minuteOfHour();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfCentury(10);
        org.joda.time.LocalDate localDate50 = localDate48.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property51 = localDate50.weekyear();
        org.joda.time.LocalDate.Property property52 = localDate50.centuryOfEra();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance();
        calendar53.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay57 = org.joda.time.YearMonthDay.fromCalendarFields(calendar53);
        calendar53.setFirstDayOfWeek(2022);
        int int61 = calendar53.getMinimum(2);
        java.util.TimeZone timeZone62 = calendar53.getTimeZone();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime66 = interval65.getEnd();
        org.joda.time.Chronology chronology67 = interval65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.year();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet70 = locale69.getUnicodeLocaleKeys();
        java.lang.String str71 = locale69.getDisplayCountry();
        int int72 = dateTimeField68.getMaximumTextLength(locale69);
        java.lang.String str73 = locale69.getDisplayScript();
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(locale69);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone62, locale69);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        long long78 = dateTimeZone76.previousTransition((long) 8);
        org.joda.time.Interval interval79 = localDate50.toInterval(dateTimeZone76);
        org.joda.time.Chronology chronology80 = chronology40.withZone(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField81 = chronology40.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight32.withChronology(chronology40);
        boolean boolean83 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateMidnight32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateMidnight32", (instant35.compareTo(dateMidnight32) == 0) == instant35.equals(dateMidnight32));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder4.setDate(22, 1970, 120003);
        java.util.Calendar.Builder builder39 = builder4.setLenient(true);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance();
        calendar40.add(3, 22);
        java.util.Date date44 = calendar40.getTime();
        long long45 = calendar40.getTimeInMillis();
        java.util.TimeZone timeZone46 = calendar40.getTimeZone();
        java.util.Calendar.Builder builder47 = builder39.setTimeZone(timeZone46);
        java.util.Calendar.Builder builder51 = builder39.setTimeOfDay(193, 576, 35349);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar40", (calendar5.compareTo(calendar40) == 0) == calendar5.equals(calendar40));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar.Builder builder37 = builder33.setWeekDate(871, 37, 444);
        java.util.Locale locale39 = new java.util.Locale("Fri Feb 11 09:47:52 UTC 2022");
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.util.Calendar.Builder builder42 = builder37.setLocale(locale39);
        java.util.Calendar.Builder builder46 = builder42.setTimeOfDay(368, 746, 35297);
        java.util.Calendar.Builder builder50 = builder46.setWeekDate(35356782, 315, 35333459);
        java.util.Calendar.Builder builder52 = builder50.setLenient(false);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Chronology chronology57 = interval55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.year();
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet60 = locale59.getUnicodeLocaleKeys();
        java.lang.String str61 = locale59.getDisplayCountry();
        int int62 = dateTimeField58.getMaximumTextLength(locale59);
        java.lang.String str63 = locale59.getDisplayScript();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(locale59);
        calendar64.setMinimalDaysInFirstWeek(12);
        java.util.TimeZone timeZone67 = calendar64.getTimeZone();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance();
        calendar68.add(3, 22);
        calendar68.setFirstDayOfWeek((int) (short) -1);
        java.util.Date date74 = calendar68.getTime();
        date74.setYear((int) (short) 0);
        java.time.Instant instant77 = date74.toInstant();
        calendar64.setTime(date74);
        java.util.TimeZone timeZone79 = calendar64.getTimeZone();
        java.util.Calendar.Builder builder80 = builder50.setTimeZone(timeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar68", (calendar5.compareTo(calendar68) == 0) == calendar5.equals(calendar68));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.add(3, 22);
        int int5 = calendar1.getWeekYear();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromCalendarFields(calendar6);
        calendar6.setFirstDayOfWeek(2022);
        int int14 = calendar6.getMinimum(2);
        java.util.TimeZone timeZone15 = calendar6.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.getID();
        long long19 = dateTimeZone16.previousTransition((long) '4');
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) calendar1, dateTimeZone16);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 91, dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar6", (calendar1.compareTo(calendar6) == 0) == calendar1.equals(calendar6));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear(44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 621);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter10.withChronology(chronology15);
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 2018, chronology15);
        org.joda.time.DurationField durationField21 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField16, and durationField19", !(durationField21.compareTo(durationField16) == 0) || (Math.signum(durationField21.compareTo(durationField19)) == Math.signum(durationField16.compareTo(durationField19))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime8 = dateTime5.withMonthOfYear((int) (byte) 1);
        int int9 = dateTime5.getYear();
        org.joda.time.DateTime.Property property10 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        int int13 = property10.get();
        org.joda.time.DateTime dateTime14 = property10.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        org.joda.time.DateTime dateTime17 = dateTime14.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((-1511222400000L), dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime8 = dateTime5.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        int int13 = dateTimeZone11.getStandardOffset((long) 13);
        long long17 = dateTimeZone11.convertLocalToUTC(229L, false, (long) 49);
        long long20 = dateTimeZone11.convertLocalToUTC(229L, true);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getVariant();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone31, locale46);
        java.lang.String str49 = dateTimeZone11.getShortName((long) 371, locale46);
        long long51 = dateTimeZone11.nextTransition((long) 35297);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 35386076, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar48", (calendar43.compareTo(calendar48) == 0) == calendar43.equals(calendar48));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay6.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        int int25 = dateTimeZone23.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime26 = yearMonthDay6.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withPivotYear(134);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withPivotYear(35373914);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight34.dayOfWeek();
        org.joda.time.DateMidnight.Property property36 = dateMidnight34.dayOfWeek();
        org.joda.time.DateMidnight.Property property37 = dateMidnight34.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight39 = property37.setCopy("4");
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay43.toDateTime(timeOfDay44, dateTimeZone45);
        int int47 = dateTime46.getCenturyOfEra();
        org.joda.time.DateTime dateTime49 = dateTime46.plusMillis((int) (byte) 0);
        int int50 = dateTime49.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone51);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay52.toDateTime(timeOfDay53, dateTimeZone54);
        org.joda.time.YearMonthDay.Property property56 = yearMonthDay52.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property58 = yearMonthDay52.property(dateTimeFieldType57);
        org.joda.time.DateTime.Property property59 = dateTime49.property(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType57.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay(dateTimeZone61);
        org.joda.time.Chronology chronology63 = yearMonthDay62.getChronology();
        org.joda.time.DurationField durationField64 = durationFieldType60.getField(chronology63);
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(33L, chronology63);
        org.joda.time.DurationField durationField66 = chronology63.millis();
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight39.withChronology(chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter30.withChronology(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight39 and dateMidnight67", (dateMidnight39.compareTo(dateMidnight67) == 0) == dateMidnight39.equals(dateMidnight67));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        calendar4.setFirstDayOfWeek(2022);
        int int12 = calendar4.getMinimum(2);
        java.util.TimeZone timeZone13 = calendar4.getTimeZone();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str22 = locale20.getDisplayCountry();
        int int23 = dateTimeField19.getMaximumTextLength(locale20);
        java.lang.String str24 = locale20.getDisplayScript();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone13, locale20);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long29 = dateTimeZone27.previousTransition((long) 8);
        java.lang.String str30 = dateTimeZone27.toString();
        org.joda.time.Interval interval31 = yearMonthDay1.toInterval(dateTimeZone27);
        org.joda.time.Period period32 = interval31.toPeriod();
        org.joda.time.DateTime dateTime33 = interval31.getEnd();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        int int41 = dateTime40.getCenturyOfEra();
        org.joda.time.DateTime dateTime43 = dateTime40.plusMillis((int) (byte) 0);
        int int44 = dateTime43.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone45);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTime(timeOfDay47, dateTimeZone48);
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay46.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay46.property(dateTimeFieldType51);
        org.joda.time.DateTime.Property property53 = dateTime43.property(dateTimeFieldType51);
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType51.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(dateTimeZone55);
        org.joda.time.Chronology chronology57 = yearMonthDay56.getChronology();
        org.joda.time.DurationField durationField58 = durationFieldType54.getField(chronology57);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(33L, chronology57);
        org.joda.time.DurationField durationField60 = chronology57.millis();
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((long) 21025144, chronology57);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime33.toMutableDateTime(chronology57);
        org.joda.time.DurationField durationField63 = chronology57.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and mutableDateTime62", (dateTime33.compareTo(mutableDateTime62) == 0) == dateTime33.equals(mutableDateTime62));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        calendar7.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromCalendarFields(calendar7);
        calendar7.setFirstDayOfWeek(2022);
        int int15 = calendar7.getMinimum(2);
        java.util.TimeZone timeZone16 = calendar7.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        calendar6.setTimeZone(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar7", (calendar0.compareTo(calendar7) == 0) == calendar0.equals(calendar7));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfYear(49);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfWeek();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.centuryOfEra();
        org.joda.time.Instant instant9 = dateMidnight6.toInstant();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property26 = localDate24.centuryOfEra();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay31 = org.joda.time.YearMonthDay.fromCalendarFields(calendar27);
        calendar27.setFirstDayOfWeek(2022);
        int int35 = calendar27.getMinimum(2);
        java.util.TimeZone timeZone36 = calendar27.getTimeZone();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayCountry();
        int int46 = dateTimeField42.getMaximumTextLength(locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale43);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone36, locale43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long52 = dateTimeZone50.previousTransition((long) 8);
        org.joda.time.Interval interval53 = localDate24.toInterval(dateTimeZone50);
        org.joda.time.Chronology chronology54 = chronology14.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = chronology14.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight6.withChronology(chronology14);
        org.joda.time.Instant instant57 = dateMidnight56.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight56 and instant9", (dateMidnight56.compareTo(instant9) == 0) == dateMidnight56.equals(instant9));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.monthOfYear();
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        int int14 = property6.compareTo((org.joda.time.ReadablePartial) yearMonthDay8);
        org.joda.time.Chronology chronology15 = yearMonthDay8.getChronology();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(1122195911230830000L, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime16", (dateTime5.compareTo(dateTime16) == 0) == dateTime5.equals(dateTime16));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now();
        long long12 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withDayOfYear((int) '#');
        int int19 = dateMidnight16.getWeekOfWeekyear();
        boolean boolean20 = dateMidnight11.isEqual((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.withDayOfYear((int) '#');
        int int25 = dateMidnight22.getWeekOfWeekyear();
        int int26 = dateMidnight22.getWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        boolean boolean44 = dateTime43.isBeforeNow();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime50 = dateTime48.minusHours((int) (byte) 100);
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight16.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime54 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.Instant instant55 = dateMidnight53.toInstant();
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.minus((-525628200000L));
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Chronology chronology62 = interval60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.minutes();
        org.joda.time.DurationField durationField64 = chronology62.weekyears();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(chronology62);
        org.joda.time.DurationField durationField66 = chronology62.days();
        org.joda.time.DateTimeField dateTimeField67 = chronology62.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight53.withChronology(chronology62);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight53 and instant55", (dateMidnight53.compareTo(instant55) == 0) == dateMidnight53.equals(instant55));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        boolean boolean5 = localTime3.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight1.withDayOfMonth(1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = property9.roundHalfCeilingCopy();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((java.lang.Object) dateMidnight10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.millisOfSecond();
        java.util.Locale locale16 = new java.util.Locale("", "DateTimeField[year]", "");
        java.lang.String str17 = locale16.getISO3Language();
        java.lang.String str18 = property12.getAsText(locale16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        int int24 = dateTime23.getCenturyOfEra();
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis((int) (byte) 0);
        int int27 = dateTime23.getHourOfDay();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.util.Calendar calendar29 = dateTime23.toCalendar(locale28);
        java.util.Locale locale33 = new java.util.Locale("zh_CN", "\u82f1\u6587\u7f8e\u56fd)", "2022-02-25T09:48:06.134Z");
        java.lang.String str34 = locale28.getDisplayName(locale33);
        java.util.Locale.setDefault(locale28);
        java.util.Locale locale36 = locale28.stripExtensions();
        java.lang.String str37 = locale16.getDisplayLanguage(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar29", (calendar2.compareTo(calendar29) == 0) == calendar2.equals(calendar29));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay21.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay24 = property22.setCopy(15);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay24.withChronologyRetainFields(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology29);
        boolean boolean33 = dateMidnight11.isBefore((org.joda.time.ReadableInstant) dateMidnight32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight11 and instant18", (dateMidnight11.compareTo(instant18) == 0) == dateMidnight11.equals(instant18));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = durationFieldType20.isSupported(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime18.toDateTime(chronology33);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readableDuration37);
        org.joda.time.LocalDate localDate39 = dateTime38.toLocalDate();
        java.util.GregorianCalendar gregorianCalendar40 = dateTime38.toGregorianCalendar();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        calendar41.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay45 = org.joda.time.YearMonthDay.fromCalendarFields(calendar41);
        int int47 = calendar41.getGreatestMinimum((int) (byte) 10);
        calendar41.setFirstDayOfWeek(461);
        int int50 = calendar41.getWeekYear();
        java.util.TimeZone timeZone51 = calendar41.getTimeZone();
        calendar41.setMinimalDaysInFirstWeek(32);
        int int54 = calendar41.getWeeksInWeekYear();
        long long55 = calendar41.getTimeInMillis();
        java.util.Date date56 = calendar41.getTime();
        gregorianCalendar40.setTime(date56);
        int int58 = date56.getDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar40 and calendar41", (gregorianCalendar40.compareTo(calendar41) == 0) == gregorianCalendar40.equals(calendar41));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay5.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        int int17 = property9.compareTo((org.joda.time.ReadablePartial) yearMonthDay11);
        org.joda.time.Chronology chronology18 = yearMonthDay11.getChronology();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getWeekOfWeekyear();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTime();
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime19", (dateTime8.compareTo(dateTime19) == 0) == dateTime8.equals(dateTime19));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(22);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime localTime11 = localTime8.minusSeconds(32769);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.year();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.lang.String str21 = locale19.getDisplayCountry();
        int int22 = dateTimeField18.getMaximumTextLength(locale19);
        java.lang.String str23 = locale19.getDisplayScript();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale19);
        int int25 = property12.getMaximumShortTextLength(locale19);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar24", (calendar0.compareTo(calendar24) == 0) == calendar0.equals(calendar24));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = dateTimeField5.getMaximumTextLength(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale6);
        calendar11.setMinimalDaysInFirstWeek(12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        calendar11.setFirstDayOfWeek(743);
        boolean boolean17 = calendar11.isWeekDateSupported();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        boolean boolean23 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime22.withMonthOfYear((int) (byte) 1);
        int int26 = dateTime22.getYear();
        org.joda.time.DateTime.Property property27 = dateTime22.weekyear();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime30 = dateTime28.withYear(2);
        long long31 = dateTime30.getMillis();
        java.util.GregorianCalendar gregorianCalendar32 = dateTime30.toGregorianCalendar();
        java.util.Date date38 = new java.util.Date(33, 706, 2000, 99, 35298);
        gregorianCalendar32.setTime(date38);
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder44 = builder40.setTimeOfDay((-52), 75, 0);
        java.util.Calendar.Builder builder48 = builder44.setWeekDate(99, (-1), 10);
        java.util.Calendar.Builder builder50 = builder44.setLenient(true);
        java.util.Locale locale51 = java.util.Locale.ITALY;
        java.util.Calendar.Builder builder52 = builder44.setLocale(locale51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.TimeOfDay timeOfDay56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTime(timeOfDay56, dateTimeZone57);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime63 = dateTime61.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime61.getZone();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance();
        calendar65.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay69 = org.joda.time.YearMonthDay.fromCalendarFields(calendar65);
        calendar65.setFirstDayOfWeek(2022);
        int int73 = calendar65.getMinimum(2);
        java.util.TimeZone timeZone74 = calendar65.getTimeZone();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime78 = interval77.getEnd();
        org.joda.time.Chronology chronology79 = interval77.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.year();
        java.util.Locale locale81 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleKeys();
        java.lang.String str83 = locale81.getDisplayCountry();
        int int84 = dateTimeField80.getMaximumTextLength(locale81);
        java.lang.String str85 = locale81.getDisplayScript();
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(locale81);
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone74, locale81);
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        long long90 = dateTimeZone88.previousTransition((long) 8);
        long long92 = dateTimeZone64.getMillisKeepLocal(dateTimeZone88, (long) (byte) 0);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((long) 35277, dateTimeZone88);
        java.util.TimeZone timeZone94 = dateTimeZone88.toTimeZone();
        java.util.Calendar.Builder builder95 = builder52.setTimeZone(timeZone94);
        gregorianCalendar32.setTimeZone(timeZone94);
        calendar11.setTimeZone(timeZone94);
        org.joda.time.DateTimeZone dateTimeZone98 = org.joda.time.DateTimeZone.forTimeZone(timeZone94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar86", (calendar11.compareTo(calendar86) == 0) == calendar11.equals(calendar86));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        calendar34.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay38 = org.joda.time.YearMonthDay.fromCalendarFields(calendar34);
        calendar34.setFirstDayOfWeek(2022);
        int int42 = calendar34.getMinimum(2);
        java.util.TimeZone timeZone43 = calendar34.getTimeZone();
        java.util.Calendar.Builder builder44 = builder4.setTimeZone(timeZone43);
        java.util.Calendar.Builder builder48 = builder44.setWeekDate(33, 808, 808);
        java.util.Calendar.Builder builder52 = builder44.setDate(35334, 183, 2022);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance();
        calendar53.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay57 = org.joda.time.YearMonthDay.fromCalendarFields(calendar53);
        int int59 = calendar53.getGreatestMinimum((int) (byte) 10);
        calendar53.setFirstDayOfWeek(461);
        int int62 = calendar53.getWeekYear();
        java.util.TimeZone timeZone63 = calendar53.getTimeZone();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone63);
        java.util.Calendar.Builder builder65 = builder52.setTimeZone(timeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar53", (calendar5.compareTo(calendar53) == 0) == calendar5.equals(calendar53));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        boolean boolean24 = interval13.equals((java.lang.Object) dateTime18);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Chronology chronology34 = interval32.getChronology();
        org.joda.time.Interval interval35 = interval27.overlap((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str39 = interval38.toString();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.Interval interval50 = interval42.overlap((org.joda.time.ReadableInterval) interval47);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(dateTimeZone51);
        org.joda.time.TimeOfDay timeOfDay53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = yearMonthDay52.toDateTime(timeOfDay53, dateTimeZone54);
        boolean boolean56 = dateTime55.isBeforeNow();
        org.joda.time.DateTime dateTime58 = dateTime55.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour((int) (short) 0);
        boolean boolean61 = interval50.contains((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean62 = interval38.contains((org.joda.time.ReadableInterval) interval50);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.Interval interval64 = interval38.withPeriodBeforeEnd(readablePeriod63);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = interval38.toPeriod(periodType65);
        org.joda.time.Interval interval67 = interval35.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period66);
        org.joda.time.MutablePeriod mutablePeriod68 = period66.toMutablePeriod();
        org.joda.time.Interval interval69 = interval13.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        org.joda.time.YearMonthDay.Property property75 = yearMonthDay71.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.YearMonthDay yearMonthDay77 = new org.joda.time.YearMonthDay(dateTimeZone76);
        org.joda.time.TimeOfDay timeOfDay78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = yearMonthDay77.toDateTime(timeOfDay78, dateTimeZone79);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay77.monthOfYear();
        org.joda.time.DateTime dateTime82 = yearMonthDay77.toDateTimeAtCurrentTime();
        int int83 = property75.compareTo((org.joda.time.ReadablePartial) yearMonthDay77);
        org.joda.time.Chronology chronology84 = yearMonthDay77.getChronology();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(chronology84);
        org.joda.time.DateTime dateTime87 = dateTime85.withWeekyear(35280);
        org.joda.time.Interval interval88 = interval69.withEnd((org.joda.time.ReadableInstant) dateTime85);
        boolean boolean89 = interval69.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime74 and dateTime85", (dateTime74.compareTo(dateTime85) == 0) == dateTime74.equals(dateTime85));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) '4', chronology5);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(chronology5);
        org.joda.time.DateTimeField dateTimeField12 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField7", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        boolean boolean12 = dateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        int int30 = dateTime10.get(dateTimeField29);
        org.joda.time.DurationField durationField31 = dateTimeField29.getRangeDurationField();
        org.joda.time.DurationField durationField32 = dateTimeField29.getDurationField();
        java.lang.String str34 = dateTimeField29.getAsShortText((long) 224);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField32", Math.signum(durationField28.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField28)));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime10.toDateTime(chronology18);
        boolean boolean20 = interval3.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        int int22 = localDate21.getEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTime dateTime30 = dateTime27.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime30.getZone();
        org.joda.time.DateTime dateTime34 = localDate21.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate21.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime37 = dateTime35.plusMillis(39);
        int int38 = dateTime37.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        int int45 = dateTime44.getCenturyOfEra();
        org.joda.time.DateTime dateTime47 = dateTime44.plusMillis((int) (byte) 0);
        int int48 = dateTime47.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = yearMonthDay50.toDateTime(timeOfDay51, dateTimeZone52);
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay50.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property56 = yearMonthDay50.property(dateTimeFieldType55);
        org.joda.time.DateTime.Property property57 = dateTime47.property(dateTimeFieldType55);
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType55.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.Chronology chronology61 = yearMonthDay60.getChronology();
        org.joda.time.DurationField durationField62 = durationFieldType58.getField(chronology61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance();
        calendar63.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay67 = org.joda.time.YearMonthDay.fromCalendarFields(calendar63);
        calendar63.setFirstDayOfWeek(2022);
        int int71 = calendar63.getMinimum(2);
        java.util.TimeZone timeZone72 = calendar63.getTimeZone();
        org.joda.time.Interval interval75 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime76 = interval75.getEnd();
        org.joda.time.Chronology chronology77 = interval75.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.year();
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleKeys();
        java.lang.String str81 = locale79.getDisplayCountry();
        int int82 = dateTimeField78.getMaximumTextLength(locale79);
        java.lang.String str83 = locale79.getDisplayScript();
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(locale79);
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone72, locale79);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        long long88 = dateTimeZone86.previousTransition((long) 8);
        java.lang.String str89 = dateTimeZone86.toString();
        java.util.TimeZone timeZone90 = dateTimeZone86.toTimeZone();
        org.joda.time.Chronology chronology91 = chronology61.withZone(dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight92 = new org.joda.time.DateMidnight((long) 29, chronology61);
        org.joda.time.YearMonthDay yearMonthDay93 = new org.joda.time.YearMonthDay(chronology61);
        org.joda.time.DateTime dateTime94 = dateTime37.toDateTime(chronology61);
        org.joda.time.TimeOfDay timeOfDay95 = new org.joda.time.TimeOfDay((long) 57176697, chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime94", (dateTime37.compareTo(dateTime94) == 0) == dateTime37.equals(dateTime94));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(32770);
        int int4 = calendar0.getFirstDayOfWeek();
        java.util.Date date5 = calendar0.getTime();
        calendar0.setLenient(true);
        calendar0.set(0, 0, 9, 12, 379, 1969);
        calendar0.clear();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        calendar16.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay20 = org.joda.time.YearMonthDay.fromCalendarFields(calendar16);
        calendar16.setFirstDayOfWeek(2022);
        int int24 = calendar16.getMinimum(2);
        java.util.TimeZone timeZone25 = calendar16.getTimeZone();
        java.util.Date date26 = calendar16.getTime();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay31 = org.joda.time.YearMonthDay.fromCalendarFields(calendar27);
        calendar27.setFirstDayOfWeek(2022);
        int int35 = calendar27.getMinimum(2);
        java.util.TimeZone timeZone36 = calendar27.getTimeZone();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayCountry();
        int int46 = dateTimeField42.getMaximumTextLength(locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale43);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone36, locale43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.lang.String str52 = locale51.getVariant();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone36, locale51);
        calendar16.setTimeZone(timeZone36);
        calendar0.setTimeZone(timeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar53", (calendar48.compareTo(calendar53) == 0) == calendar48.equals(calendar53));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        int int17 = property15.getMaximumTextLength(locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone9, locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.setDefault(locale19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone9, locale19);
        int int22 = calendar21.getWeeksInWeekYear();
        java.util.Date date23 = calendar21.getTime();
        int int24 = date23.getMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar21", (calendar18.compareTo(calendar21) == 0) == calendar18.equals(calendar21));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMillis((long) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime4.isBefore(readableInstant10);
        org.joda.time.DateTime dateTime13 = dateTime4.withMillisOfSecond((int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime4.withMillis((long) 7);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTime.Property property17 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
        boolean boolean7 = dateMidnight3.isAfter((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.minusWeeks(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight9.withChronology(chronology24);
        org.joda.time.DurationField durationField27 = chronology24.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight9 and dateMidnight26", (dateMidnight9.compareTo(dateMidnight26) == 0) == dateMidnight9.equals(dateMidnight26));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        long long5 = calendar0.getTimeInMillis();
        java.util.TimeZone timeZone6 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet12 = locale10.getExtensionKeys();
        java.lang.String str13 = yearMonthDay8.toString("\u4e8c\u6708", locale10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone6, locale10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        int int23 = dateTime19.getYear();
        org.joda.time.DateTime.Property property24 = dateTime19.weekyear();
        org.joda.time.DateTime.Property property25 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.roundCeilingCopy();
        org.joda.time.DateTime dateTime27 = property25.withMinimumValue();
        java.util.Locale.Category category28 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        int int37 = dateTime33.getYear();
        org.joda.time.DateTime.Property property38 = dateTime33.weekyear();
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        boolean boolean40 = dateTime39.isBeforeNow();
        org.joda.time.DateTime dateTime42 = dateTime39.minusMillis(7);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.withDurationAdded(readableDuration43, (int) '#');
        int int46 = dateTime42.getWeekyear();
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Calendar calendar48 = dateTime42.toCalendar(locale47);
        java.util.Locale.setDefault(category28, locale47);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.lang.String str52 = locale50.getCountry();
        java.util.Locale.setDefault(category28, locale50);
        java.lang.String str54 = property25.getAsText(locale50);
        java.util.Set<java.lang.String> strSet55 = locale50.getUnicodeLocaleKeys();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone6, locale50);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance();
        calendar57.add(3, 22);
        java.util.Date date61 = calendar57.getTime();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        boolean boolean67 = dateTime66.isBeforeNow();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear((int) (byte) 1);
        int int70 = dateTime66.getYear();
        org.joda.time.DateTime.Property property71 = dateTime66.weekyear();
        org.joda.time.DateTime dateTime72 = property71.withMaximumValue();
        org.joda.time.DateTime dateTime73 = property71.roundHalfCeilingCopy();
        java.util.Date date74 = dateTime73.toDate();
        int int75 = date74.getDate();
        org.joda.time.YearMonthDay yearMonthDay76 = org.joda.time.YearMonthDay.fromDateFields(date74);
        boolean boolean77 = date61.before(date74);
        date74.setTime((long) (byte) 0);
        date74.setYear(871);
        date74.setDate((-456566));
        java.util.Calendar calendar84 = java.util.Calendar.getInstance();
        java.util.Date date85 = calendar84.getTime();
        java.time.Instant instant86 = date85.toInstant();
        java.util.Date date87 = java.util.Date.from(instant86);
        long long88 = date87.getTime();
        boolean boolean89 = date74.after(date87);
        int int90 = date74.getSeconds();
        calendar56.setTime(date74);
        calendar56.setFirstDayOfWeek(633);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar57", (calendar0.compareTo(calendar57) == 0) == calendar0.equals(calendar57));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.monthOfYear();
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        int int14 = property6.compareTo((org.joda.time.ReadablePartial) yearMonthDay8);
        org.joda.time.Chronology chronology15 = yearMonthDay8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        boolean boolean17 = dateTimeFieldType0.isSupported(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.seconds();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        org.joda.time.YearMonthDay.Property property30 = yearMonthDay26.monthOfYear();
        org.joda.time.DateTime dateTime31 = yearMonthDay26.toDateTimeAtCurrentTime();
        int int32 = property24.compareTo((org.joda.time.ReadablePartial) yearMonthDay26);
        org.joda.time.YearMonthDay yearMonthDay33 = property24.withMinimumValue();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.Interval interval44 = interval36.overlap((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Duration duration45 = interval44.toDuration();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        boolean boolean51 = dateTime50.isBeforeNow();
        org.joda.time.DateTime dateTime53 = dateTime50.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime55 = dateTime53.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime57 = dateTime55.minusHours((int) (byte) 100);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime55);
        int int59 = property24.compareTo((org.joda.time.ReadableInstant) dateTime55);
        java.lang.String str60 = property24.toString();
        org.joda.time.YearMonthDay yearMonthDay62 = property24.addToCopy(621);
        org.joda.time.DateTime dateTime63 = yearMonthDay62.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate64 = yearMonthDay62.toLocalDate();
        int[] intArray66 = chronology15.get((org.joda.time.ReadablePartial) localDate64, 1644572964590L);
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DurationField durationField68 = chronology15.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime67", (dateTime11.compareTo(dateTime67) == 0) == dateTime11.equals(dateTime67));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear(35280);
        java.util.Date date18 = dateTime15.toDate();
        date18.setMinutes(35631);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property5.getAsText(locale8);
        org.joda.time.LocalTime localTime10 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField11 = property5.getField();
        long long13 = dateTimeField11.roundHalfFloor(35271L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.secondOfDay();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.Interval interval31 = interval23.overlap((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Duration duration32 = interval31.toDuration();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay34.toDateTime(timeOfDay35, dateTimeZone36);
        boolean boolean38 = dateTime37.isBeforeNow();
        org.joda.time.DateTime dateTime40 = dateTime37.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime44 = dateTime42.minusHours((int) (byte) 100);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration46 = duration32.toDuration();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone47);
        org.joda.time.DateMidnight.Property property49 = dateMidnight48.monthOfYear();
        org.joda.time.DateMidnight dateMidnight50 = org.joda.time.DateMidnight.now();
        long long51 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.plusWeeks(86399);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.withDayOfYear((int) '#');
        int int58 = dateMidnight55.getWeekOfWeekyear();
        boolean boolean59 = dateMidnight50.isEqual((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.withDayOfYear((int) '#');
        int int64 = dateMidnight61.getWeekOfWeekyear();
        int int65 = dateMidnight61.getWeekyear();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Chronology chronology70 = interval68.getChronology();
        org.joda.time.Interval interval73 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime74 = interval73.getEnd();
        org.joda.time.Chronology chronology75 = interval73.getChronology();
        org.joda.time.Interval interval76 = interval68.overlap((org.joda.time.ReadableInterval) interval73);
        org.joda.time.Duration duration77 = interval76.toDuration();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.YearMonthDay yearMonthDay79 = new org.joda.time.YearMonthDay(dateTimeZone78);
        org.joda.time.TimeOfDay timeOfDay80 = null;
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = yearMonthDay79.toDateTime(timeOfDay80, dateTimeZone81);
        boolean boolean83 = dateTime82.isBeforeNow();
        org.joda.time.DateTime dateTime85 = dateTime82.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime87 = dateTime85.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime89 = dateTime87.minusHours((int) (byte) 100);
        org.joda.time.Interval interval90 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration77, (org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Interval interval91 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight61, (org.joda.time.ReadableDuration) duration77);
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight55.minus((org.joda.time.ReadableDuration) duration77);
        boolean boolean93 = duration32.isLongerThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.DateTime dateTime94 = dateTime19.plus((org.joda.time.ReadableDuration) duration32);
        java.util.Locale locale96 = new java.util.Locale("Fri Feb 11 09:47:52 UTC 2022");
        java.util.Calendar calendar97 = dateTime19.toCalendar(locale96);
        java.lang.String str98 = dateTimeField11.getAsShortText(35351, locale96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar97", (calendar0.compareTo(calendar97) == 0) == calendar0.equals(calendar97));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        java.lang.String str17 = chronology14.toString();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology14);
        java.lang.String str19 = dateMidnight18.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone20);
        org.joda.time.TimeOfDay timeOfDay22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = yearMonthDay21.toDateTime(timeOfDay22, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear((int) (byte) 1);
        int int33 = dateTime29.getYear();
        org.joda.time.DateMidnight dateMidnight34 = dateTime29.toDateMidnight();
        org.joda.time.DateTime dateTime35 = yearMonthDay21.toDateTime((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight34.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight37 = property36.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight37.minusWeeks(789);
        boolean boolean42 = dateMidnight18.isEqual((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.Chronology chronology45 = yearMonthDay44.getChronology();
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay44.dayOfMonth();
        org.joda.time.YearMonthDay.Property property47 = yearMonthDay44.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay48 = property47.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property47.getFieldType();
        boolean boolean50 = dateMidnight37.isSupported(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and dateMidnight37", (dateMidnight18.compareTo(dateMidnight37) == 0) == dateMidnight18.equals(dateMidnight37));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        int int15 = yearMonthDay7.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay7.minusMonths((int) '#');
        java.lang.String str18 = yearMonthDay17.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.dayOfWeek();
        org.joda.time.DateMidnight.Property property22 = dateMidnight20.dayOfWeek();
        org.joda.time.DateMidnight.Property property23 = dateMidnight20.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight25 = property23.setCopy("4");
        org.joda.time.DateMidnight.Property property26 = dateMidnight25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone28);
        org.joda.time.TimeOfDay timeOfDay30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = yearMonthDay29.toDateTime(timeOfDay30, dateTimeZone31);
        int int33 = dateTime32.getCenturyOfEra();
        org.joda.time.DateTime dateTime35 = dateTime32.plusMillis((int) (byte) 0);
        int int36 = dateTime35.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTime(timeOfDay39, dateTimeZone40);
        org.joda.time.YearMonthDay.Property property42 = yearMonthDay38.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property44 = yearMonthDay38.property(dateTimeFieldType43);
        org.joda.time.DateTime.Property property45 = dateTime35.property(dateTimeFieldType43);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType43.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.Chronology chronology49 = yearMonthDay48.getChronology();
        org.joda.time.DurationField durationField50 = durationFieldType46.getField(chronology49);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(33L, chronology49);
        org.joda.time.DurationField durationField52 = chronology49.millis();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight25.withChronology(chronology49);
        org.joda.time.DateTime dateTime54 = yearMonthDay17.toDateTime((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.DateMidnight dateMidnight55 = yearMonthDay17.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and dateMidnight53", (dateMidnight25.compareTo(dateMidnight53) == 0) == dateMidnight25.equals(dateMidnight53));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra(1248);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        boolean boolean22 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime24 = dateTime21.withMonthOfYear((int) (byte) 1);
        int int25 = dateTime21.getYear();
        org.joda.time.DateTime.Property property26 = dateTime21.weekyear();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = yearMonthDay36.toDateTime(timeOfDay37, dateTimeZone38);
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay36.monthOfYear();
        org.joda.time.DateTime dateTime41 = yearMonthDay36.toDateTimeAtCurrentTime();
        int int42 = property34.compareTo((org.joda.time.ReadablePartial) yearMonthDay36);
        org.joda.time.Chronology chronology43 = yearMonthDay36.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.halfdays();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.era();
        org.joda.time.DateTime dateTime46 = dateTime27.withChronology(chronology43);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMinutes(57);
        int int49 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime46);
        int int50 = dateTime16.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime46", (dateTime10.compareTo(dateTime46) == 0) == dateTime10.equals(dateTime46));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 621);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter9.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withDefaultYear(10);
        java.lang.Object obj22 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.clockhourOfHalfday();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(obj22, chronology27);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology27);
        org.joda.time.Interval interval33 = new org.joda.time.Interval(0L, (long) 784, chronology27);
        org.joda.time.DurationField durationField34 = chronology27.days();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter17.withChronology(chronology27);
        boolean boolean36 = dateTimeFormatter35.isParser();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = yearMonthDay40.toDateTime(timeOfDay41, dateTimeZone42);
        int int44 = dateTime43.getCenturyOfEra();
        org.joda.time.DateTime dateTime46 = dateTime43.plusMillis((int) (byte) 0);
        int int47 = dateTime46.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone48);
        org.joda.time.TimeOfDay timeOfDay50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = yearMonthDay49.toDateTime(timeOfDay50, dateTimeZone51);
        org.joda.time.YearMonthDay.Property property53 = yearMonthDay49.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property55 = yearMonthDay49.property(dateTimeFieldType54);
        org.joda.time.DateTime.Property property56 = dateTime46.property(dateTimeFieldType54);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType54.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay(dateTimeZone58);
        org.joda.time.Chronology chronology60 = yearMonthDay59.getChronology();
        org.joda.time.DurationField durationField61 = durationFieldType57.getField(chronology60);
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.now(chronology60);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (-1), chronology60);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((-62100742311688L), chronology60);
        org.joda.time.DateTimeField dateTimeField65 = chronology60.clockhourOfDay();
        org.joda.time.DurationField durationField66 = chronology60.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter35.withChronology(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField66", Math.signum(durationField15.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField15)));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTime dateTime8 = dateTime5.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime8.getZone();
        int int13 = dateTimeZone11.getStandardOffset((long) 13);
        long long17 = dateTimeZone11.convertLocalToUTC(229L, false, (long) 49);
        long long20 = dateTimeZone11.convertLocalToUTC(229L, true);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        calendar22.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar22);
        calendar22.setFirstDayOfWeek(2022);
        int int30 = calendar22.getMinimum(2);
        java.util.TimeZone timeZone31 = calendar22.getTimeZone();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getDisplayCountry();
        int int41 = dateTimeField37.getMaximumTextLength(locale38);
        java.lang.String str42 = locale38.getDisplayScript();
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale38);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone31, locale38);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getVariant();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone31, locale46);
        java.lang.String str49 = dateTimeZone11.getShortName((long) 371, locale46);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(10855555200000L, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar48", (calendar43.compareTo(calendar48) == 0) == calendar43.equals(calendar48));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear(44);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = locale8.getCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter3.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.year();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter11.withChronology(chronology17);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 31, chronology17);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = dateTimeField22.getDurationField();
        java.lang.String str24 = dateTimeField22.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField23", (durationField19.compareTo(durationField23) == 0) == durationField19.equals(durationField23));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.Interval interval26 = interval18.overlap((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str30 = interval29.toString();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.Interval interval41 = interval33.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = yearMonthDay43.toDateTime(timeOfDay44, dateTimeZone45);
        boolean boolean47 = dateTime46.isBeforeNow();
        org.joda.time.DateTime dateTime49 = dateTime46.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour((int) (short) 0);
        boolean boolean52 = interval41.contains((org.joda.time.ReadableInstant) dateTime49);
        boolean boolean53 = interval29.contains((org.joda.time.ReadableInterval) interval41);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.Interval interval55 = interval29.withPeriodBeforeEnd(readablePeriod54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = interval29.toPeriod(periodType56);
        org.joda.time.Interval interval58 = interval26.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period57);
        long long61 = chronology14.add((org.joda.time.ReadablePeriod) period57, (long) 'a', 4);
        org.joda.time.DurationField durationField62 = chronology14.hours();
        org.joda.time.DateTime dateTime63 = org.joda.time.DateTime.now(chronology14);
        long long67 = chronology14.add((long) 35513, 185L, 398);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime63", (dateTime4.compareTo(dateTime63) == 0) == dateTime4.equals(dateTime63));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        int int1 = dateMidnight0.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withYearOfCentury((int) (short) 1);
        long long4 = dateMidnight0.getMillis();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight0.plus((long) 32769);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        calendar7.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay11 = org.joda.time.YearMonthDay.fromCalendarFields(calendar7);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay11.monthOfYear();
        int int16 = yearMonthDay11.getValue((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(488);
        boolean boolean20 = dateTimeZone18.isStandardOffset(743L);
        org.joda.time.Interval interval21 = yearMonthDay11.toInterval(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight6.toMutableDateTime(dateTimeZone18);
        java.lang.Class<?> wildcardClass23 = dateMidnight6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and mutableDateTime22", (dateMidnight6.compareTo(mutableDateTime22) == 0) == dateMidnight6.equals(mutableDateTime22));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar calendar4 = builder3.build();
        java.util.Calendar.Builder builder8 = builder3.setTimeOfDay(1128, 35595992, 37359);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar4", (calendar1.compareTo(calendar4) == 0) == calendar1.equals(calendar4));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime16.toDateTime(chronology24);
        boolean boolean26 = interval9.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDate localDate27 = dateTime25.toLocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.withYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTime(timeOfDay32, dateTimeZone33);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay31.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay37.monthOfYear();
        org.joda.time.DateTime dateTime42 = yearMonthDay37.toDateTimeAtCurrentTime();
        int int43 = property35.compareTo((org.joda.time.ReadablePartial) yearMonthDay37);
        org.joda.time.Chronology chronology44 = yearMonthDay37.getChronology();
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay37.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean48 = yearMonthDay37.isSupported(dateTimeFieldType47);
        boolean boolean49 = localDate27.equals((java.lang.Object) boolean48);
        org.joda.time.LocalDate.Property property50 = localDate27.yearOfEra();
        boolean boolean51 = localDate6.isEqual((org.joda.time.ReadablePartial) localDate27);
        int int52 = localDate6.getMonthOfYear();
        org.joda.time.LocalDate.Property property53 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate54 = property53.roundCeilingCopy();
        org.joda.time.LocalDate localDate56 = localDate54.withYear(440);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(35482320);
        int int60 = dateTimeZone58.getStandardOffset((long) 971);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime62 = localDate56.toDateTimeAtCurrentTime(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime61", (dateTime16.compareTo(dateTime61) == 0) == dateTime16.equals(dateTime61));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        int int18 = dateTimeZone10.getOffset(0L);
        boolean boolean20 = dateTimeZone10.isStandardOffset((long) 35275);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.minusMonths(79);
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset(35271L);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.Interval interval40 = yearMonthDay28.toInterval(dateTimeZone32);
        org.joda.time.DateTime dateTime41 = dateTime26.toDateTime(dateTimeZone32);
        boolean boolean42 = dateTimeZone32.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime33", (dateTime4.compareTo(dateTime33) == 0) == dateTime4.equals(dateTime33));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(32770);
        int int4 = calendar0.getFirstDayOfWeek();
        java.util.Date date5 = calendar0.getTime();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.add(3, 22);
        java.util.Date date10 = calendar6.getTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        int int19 = dateTime15.getYear();
        org.joda.time.DateTime.Property property20 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime21 = property20.withMaximumValue();
        org.joda.time.DateTime dateTime22 = property20.roundHalfCeilingCopy();
        java.util.Date date23 = dateTime22.toDate();
        int int24 = date23.getDate();
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromDateFields(date23);
        boolean boolean26 = date10.before(date23);
        date23.setSeconds(1970);
        boolean boolean29 = date5.before(date23);
        date5.setHours(35277);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.Date date33 = calendar32.getTime();
        java.time.Instant instant34 = date33.toInstant();
        java.util.Date date35 = java.util.Date.from(instant34);
        java.util.Date date36 = java.util.Date.from(instant34);
        int int37 = date36.getYear();
        int int38 = date36.getMonth();
        boolean boolean39 = date5.before(date36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar32", (calendar0.compareTo(calendar32) == 0) == calendar0.equals(calendar32));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        int int18 = dateTimeZone10.getOffset(0L);
        boolean boolean20 = dateTimeZone10.isStandardOffset((long) 35275);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.minusMonths(79);
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset(35271L);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.Interval interval40 = yearMonthDay28.toInterval(dateTimeZone32);
        org.joda.time.DateTime dateTime41 = dateTime26.toDateTime(dateTimeZone32);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) dateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime33", (dateTime4.compareTo(dateTime33) == 0) == dateTime4.equals(dateTime33));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.centuryOfEra();
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.millisOfSecond();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property16 = localDate15.weekyear();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate19 = localDate17.withYearOfCentury(10);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property22 = localDate21.weekyear();
        org.joda.time.LocalDate localDate23 = property22.roundCeilingCopy();
        int[] intArray24 = localDate23.getValues();
        int int25 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDate15, intArray24);
        org.joda.time.DurationField durationField26 = dateTimeField8.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField26, and durationField7", !(durationField7.compareTo(durationField26) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField26.compareTo(durationField7))));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        int int59 = dateTime36.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime36.plus(readableDuration60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay(dateTimeZone63);
        org.joda.time.TimeOfDay timeOfDay65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = yearMonthDay64.toDateTime(timeOfDay65, dateTimeZone66);
        boolean boolean68 = dateTime67.isBeforeNow();
        org.joda.time.DateTime dateTime70 = dateTime67.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime72 = dateTime70.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime70.getZone();
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((long) (byte) 1, dateTimeZone73);
        java.util.Locale locale78 = new java.util.Locale("292278993-02-08T09:50:19.811Z", "clockhourOfDay");
        java.lang.String str79 = dateTimeZone73.getShortName((long) 591, locale78);
        java.lang.String str81 = dateTimeZone73.getNameKey((long) 942);
        org.joda.time.DateTime dateTime82 = dateTime36.toDateTime(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime82", (dateTime58.compareTo(dateTime82) == 0) == dateTime58.equals(dateTime82));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        int int7 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusYears(2022);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        int int23 = dateTime19.getYear();
        org.joda.time.DateTime.Property property24 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime25 = property24.withMaximumValue();
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis(7);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withDurationAdded(readableDuration29, (int) '#');
        int int32 = dateTime28.getWeekyear();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Calendar calendar34 = dateTime28.toCalendar(locale33);
        java.util.Set<java.lang.String> strSet35 = locale33.getUnicodeLocaleKeys();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.minutes();
        org.joda.time.DurationField durationField42 = chronology40.weekyears();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.minuteOfDay();
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str48 = locale46.getExtension('a');
        java.lang.String str49 = dateTimeField44.getAsText(4, locale46);
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = locale51.getDisplayScript();
        java.lang.String str54 = locale51.toLanguageTag();
        java.lang.String str55 = locale51.toLanguageTag();
        java.lang.String str56 = locale50.getDisplayVariant(locale51);
        java.lang.String str57 = locale46.getDisplayLanguage(locale50);
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("de");
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        boolean boolean61 = locale60.hasExtensions();
        java.lang.String str62 = locale59.getDisplayLanguage(locale60);
        java.lang.String str63 = locale50.getDisplayVariant(locale59);
        java.lang.String str64 = locale33.getDisplayScript(locale59);
        java.lang.String str65 = locale33.toLanguageTag();
        java.util.Set<java.lang.String> strSet66 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str67 = localDateTime11.toString("09:49:38.896", locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime19", (dateTime2.compareTo(dateTime19) == 0) == dateTime2.equals(dateTime19));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime7.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime7.toGregorianCalendar();
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromCalendarFields((java.util.Calendar) gregorianCalendar9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay17.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone24);
        org.joda.time.TimeOfDay timeOfDay26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone27);
        boolean boolean29 = dateTime28.isBeforeNow();
        org.joda.time.DateTime dateTime31 = dateTime28.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime31.getZone();
        int int36 = dateTimeZone34.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime37 = yearMonthDay17.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter13.withZone(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeFormatter38.getZone();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        boolean boolean46 = dateTime45.isBeforeNow();
        org.joda.time.DateTime dateTime48 = dateTime45.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime50 = dateTime48.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime48.getZone();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance();
        calendar52.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay56 = org.joda.time.YearMonthDay.fromCalendarFields(calendar52);
        calendar52.setFirstDayOfWeek(2022);
        int int60 = calendar52.getMinimum(2);
        java.util.TimeZone timeZone61 = calendar52.getTimeZone();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.year();
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.lang.String str70 = locale68.getDisplayCountry();
        int int71 = dateTimeField67.getMaximumTextLength(locale68);
        java.lang.String str72 = locale68.getDisplayScript();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(locale68);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(timeZone61, locale68);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        long long77 = dateTimeZone75.previousTransition((long) 8);
        long long79 = dateTimeZone51.getMillisKeepLocal(dateTimeZone75, (long) (byte) 0);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) 35277, dateTimeZone75);
        long long82 = dateTimeZone75.convertUTCToLocal((long) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter38.withZone(dateTimeZone75);
        org.joda.time.LocalDate localDate84 = new org.joda.time.LocalDate((java.lang.Object) gregorianCalendar9, dateTimeZone75);
        boolean boolean86 = gregorianCalendar9.before((java.lang.Object) "09:53:24.901");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay1 and localDate84", (yearMonthDay1.compareTo(localDate84) == 0) == yearMonthDay1.equals(localDate84));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(22);
        org.joda.time.LocalTime localTime10 = localTime6.withMillisOfDay(43);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withYearOfCentury(10);
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight16 = localDate13.toDateMidnight();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        boolean boolean23 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime22.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime25.getZone();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance();
        calendar29.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay33 = org.joda.time.YearMonthDay.fromCalendarFields(calendar29);
        calendar29.setFirstDayOfWeek(2022);
        int int37 = calendar29.getMinimum(2);
        java.util.TimeZone timeZone38 = calendar29.getTimeZone();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleKeys();
        java.lang.String str47 = locale45.getDisplayCountry();
        int int48 = dateTimeField44.getMaximumTextLength(locale45);
        java.lang.String str49 = locale45.getDisplayScript();
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(locale45);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone38, locale45);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long54 = dateTimeZone52.previousTransition((long) 8);
        long long56 = dateTimeZone28.getMillisKeepLocal(dateTimeZone52, (long) (byte) 0);
        org.joda.time.DateMidnight dateMidnight57 = yearMonthDay17.toDateMidnight(dateTimeZone28);
        org.joda.time.DateTime dateTime58 = localDate13.toDateTimeAtStartOfDay(dateTimeZone28);
        int int60 = dateTimeZone28.getOffsetFromLocal(16977599999641L);
        int int62 = dateTimeZone28.getStandardOffset(1657878512644L);
        long long64 = dateTimeZone28.convertUTCToLocal((long) 80);
        java.lang.String str65 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime66 = localTime10.toDateTimeToday(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar50", (calendar0.compareTo(calendar50) == 0) == calendar0.equals(calendar50));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromCalendarFields(calendar23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(35275);
        java.lang.String str28 = dateTimeZone26.getNameKey(0L);
        org.joda.time.Interval interval29 = localDate24.toInterval(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar23", (calendar21.compareTo(calendar23) == 0) == calendar21.equals(calendar23));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(51);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekOfWeekyear(2);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        int int50 = dateTimeZone44.getOffsetFromLocal(8L);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone44);
        boolean boolean52 = dateTimeZone44.isFixed();
        long long56 = dateTimeZone44.convertLocalToUTC((long) (-52), false, (long) 706);
        long long58 = dateTimeZone44.convertUTCToLocal((long) 992);
        org.joda.time.DateTime dateTime59 = localDate8.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime59.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime51", (dateTime14.compareTo(dateTime51) == 0) == dateTime14.equals(dateTime51));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfMinute();
        org.joda.time.DateTime dateTime15 = dateTime11.withDurationAdded((-62100742323530L), 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.TimeOfDay timeOfDay20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = yearMonthDay19.toDateTime(timeOfDay20, dateTimeZone21);
        boolean boolean23 = dateTime22.isBeforeNow();
        org.joda.time.DateTime dateTime25 = dateTime22.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime22.toDateTime(chronology30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.hourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType16.getField(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField36", Math.signum(durationField33.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField33)));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology5);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        org.joda.time.LocalTime localTime11 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        int int15 = localDateTime14.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusDays(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury((int) (byte) 1);
        int int20 = localDateTime17.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.minutes();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DurationField durationField30 = chronology27.hours();
        long long34 = chronology27.add((long) (-456566), 864000000L, 55);
        org.joda.time.DurationField durationField35 = durationFieldType22.getField(chronology27);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Chronology chronology40 = interval38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.year();
        org.joda.time.DurationField durationField42 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.minuteOfDay();
        boolean boolean45 = durationFieldType22.isSupported(chronology40);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime17.withFieldAdded(durationFieldType22, 58670342);
        boolean boolean48 = localTime11.isSupported(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField35", (durationField7.compareTo(durationField35) == 0) == durationField7.equals(durationField35));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        boolean boolean67 = dateTime66.isBeforeNow();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        boolean boolean75 = dateTime74.isBeforeNow();
        org.joda.time.DateTime dateTime77 = dateTime74.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Chronology chronology82 = interval80.getChronology();
        org.joda.time.DateTime dateTime83 = dateTime74.toDateTime(chronology82);
        boolean boolean84 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime66);
        int int86 = dateTime66.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        int int18 = property10.compareTo((org.joda.time.ReadablePartial) yearMonthDay12);
        org.joda.time.Chronology chronology19 = yearMonthDay12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay12.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = yearMonthDay12.isSupported(dateTimeFieldType22);
        boolean boolean24 = localDate4.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = localDate4.plusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        int int35 = dateTime31.getYear();
        org.joda.time.DateTime.Property property36 = dateTime31.weekyear();
        org.joda.time.DateTime dateTime37 = property36.withMaximumValue();
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        boolean boolean39 = dateTime37.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.halfdays();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.era();
        int int57 = dateTime37.get(dateTimeField56);
        int int58 = dateTime37.getYear();
        org.joda.time.DateTime dateTime59 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime62 = dateTime37.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime63 = dateTime37.toDateTime();
        org.joda.time.DateTime dateTime65 = dateTime63.withMillisOfDay(807);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(2023);
        org.joda.time.DateTime dateTime68 = dateTime65.withZone(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = localDate26.toDateTimeAtCurrentTime(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime65 and dateTime68", (dateTime65.compareTo(dateTime68) == 0) == dateTime65.equals(dateTime68));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(134);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        boolean boolean67 = dateTime66.isBeforeNow();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay(dateTimeZone70);
        org.joda.time.TimeOfDay timeOfDay72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = yearMonthDay71.toDateTime(timeOfDay72, dateTimeZone73);
        boolean boolean75 = dateTime74.isBeforeNow();
        org.joda.time.DateTime dateTime77 = dateTime74.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval80 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Chronology chronology82 = interval80.getChronology();
        org.joda.time.DateTime dateTime83 = dateTime74.toDateTime(chronology82);
        boolean boolean84 = dateTime66.isAfter((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime87 = dateTime66.withYear(35403678);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime58", (dateTime36.compareTo(dateTime58) == 0) == dateTime36.equals(dateTime58));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar.Builder builder8 = builder4.setWeekDate(99, (-1), 10);
        java.util.Calendar.Builder builder12 = builder8.setTimeOfDay(715, (int) '4', 22);
        java.util.Calendar.Builder builder16 = builder8.setTimeOfDay(507, 28, 2922789);
        org.joda.time.DateMidnight dateMidnight17 = org.joda.time.DateMidnight.now();
        int int18 = dateMidnight17.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withYearOfCentury((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withPeriodAdded(readablePeriod21, 22);
        int int24 = dateMidnight23.getHourOfDay();
        int int25 = dateMidnight23.getWeekOfWeekyear();
        int int26 = dateMidnight23.getHourOfDay();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.minutes();
        org.joda.time.DurationField durationField33 = chronology31.weekyears();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.minuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.clockhourOfHalfday();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight23.withChronology(chronology31);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Chronology chronology48 = interval46.getChronology();
        org.joda.time.Interval interval49 = interval41.overlap((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str53 = interval52.toString();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.joda.time.Chronology chronology58 = interval56.getChronology();
        org.joda.time.Interval interval61 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime62 = interval61.getEnd();
        org.joda.time.Chronology chronology63 = interval61.getChronology();
        org.joda.time.Interval interval64 = interval56.overlap((org.joda.time.ReadableInterval) interval61);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.YearMonthDay yearMonthDay66 = new org.joda.time.YearMonthDay(dateTimeZone65);
        org.joda.time.TimeOfDay timeOfDay67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = yearMonthDay66.toDateTime(timeOfDay67, dateTimeZone68);
        boolean boolean70 = dateTime69.isBeforeNow();
        org.joda.time.DateTime dateTime72 = dateTime69.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime74 = dateTime72.withMinuteOfHour((int) (short) 0);
        boolean boolean75 = interval64.contains((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean76 = interval52.contains((org.joda.time.ReadableInterval) interval64);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.Interval interval78 = interval52.withPeriodBeforeEnd(readablePeriod77);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.Period period80 = interval52.toPeriod(periodType79);
        org.joda.time.Interval interval81 = interval49.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period80);
        org.joda.time.MutablePeriod mutablePeriod82 = period80.toMutablePeriod();
        int[] intArray85 = chronology31.get((org.joda.time.ReadablePeriod) period80, (long) 668, (long) 34);
        java.util.Calendar.Builder builder86 = builder8.setFields(intArray85);
        java.util.Calendar.Builder builder90 = builder8.setDate(350, 81, 35521);
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(dateTimeZone92);
        org.joda.time.DateTime dateTime94 = org.joda.time.DateTime.now(dateTimeZone92);
        java.util.TimeZone timeZone95 = dateTimeZone92.toTimeZone();
        java.util.Calendar.Builder builder96 = builder8.setTimeZone(timeZone95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime93", (dateTime34.compareTo(dateTime93) == 0) == dateTime34.equals(dateTime93));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay((-52), 75, 0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        calendar5.setFirstDayOfWeek(2022);
        int int13 = calendar5.getMinimum(2);
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.year();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getDisplayCountry();
        int int24 = dateTimeField20.getMaximumTextLength(locale21);
        java.lang.String str25 = locale21.getDisplayScript();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale21);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone14, locale21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long30 = dateTimeZone28.previousTransition((long) 8);
        java.lang.String str31 = dateTimeZone28.toString();
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        java.util.Calendar.Builder builder33 = builder4.setTimeZone(timeZone32);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        calendar34.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay38 = org.joda.time.YearMonthDay.fromCalendarFields(calendar34);
        calendar34.setFirstDayOfWeek(2022);
        int int42 = calendar34.getMinimum(2);
        java.util.TimeZone timeZone43 = calendar34.getTimeZone();
        java.util.Calendar.Builder builder44 = builder4.setTimeZone(timeZone43);
        java.util.Calendar.Builder builder48 = builder4.setDate(668, 522, 488);
        java.util.Calendar.Builder builder52 = builder4.setDate(985, 716, 182);
        java.util.Calendar.Builder builder55 = builder4.set(0, 100);
        java.util.Calendar.Builder builder60 = builder4.setTimeOfDay(611, 587, (int) (byte) 100, 32);
        java.util.Locale locale61 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder62 = builder60.setLocale(locale61);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) 18008);
        java.util.GregorianCalendar gregorianCalendar65 = dateMidnight64.toGregorianCalendar();
        java.util.TimeZone timeZone66 = gregorianCalendar65.getTimeZone();
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("");
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone66, locale68);
        java.util.Calendar.Builder builder70 = builder60.setTimeZone(timeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar69", (calendar26.compareTo(calendar69) == 0) == calendar26.equals(calendar69));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        int int18 = dateTimeZone10.getOffset(0L);
        boolean boolean20 = dateTimeZone10.isStandardOffset((long) 35275);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.minusMonths(79);
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset(35271L);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 999, true, (-62100742268123L));
        org.joda.time.Interval interval40 = yearMonthDay28.toInterval(dateTimeZone32);
        org.joda.time.DateTime dateTime41 = dateTime26.toDateTime(dateTimeZone32);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime33", (dateTime4.compareTo(dateTime33) == 0) == dateTime4.equals(dateTime33));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DurationField durationField7 = chronology4.millis();
        org.joda.time.DurationField durationField8 = chronology4.months();
        org.joda.time.DurationField durationField9 = chronology4.months();
        org.joda.time.DurationField durationField10 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.DateMidnight dateMidnight6 = property4.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight7 = property4.roundHalfFloorCopy();
        int int8 = dateMidnight7.getDayOfWeek();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withCenturyOfEra(13);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay18.monthOfYear();
        org.joda.time.DateTime dateTime23 = yearMonthDay18.toDateTimeAtCurrentTime();
        int int24 = property16.compareTo((org.joda.time.ReadablePartial) yearMonthDay18);
        org.joda.time.Chronology chronology25 = yearMonthDay18.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.weekOfWeekyear();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str41 = interval40.toString();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay(dateTimeZone53);
        org.joda.time.TimeOfDay timeOfDay55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = yearMonthDay54.toDateTime(timeOfDay55, dateTimeZone56);
        boolean boolean58 = dateTime57.isBeforeNow();
        org.joda.time.DateTime dateTime60 = dateTime57.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime62 = dateTime60.withMinuteOfHour((int) (short) 0);
        boolean boolean63 = interval52.contains((org.joda.time.ReadableInstant) dateTime60);
        boolean boolean64 = interval40.contains((org.joda.time.ReadableInterval) interval52);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.Interval interval66 = interval40.withPeriodBeforeEnd(readablePeriod65);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = interval40.toPeriod(periodType67);
        org.joda.time.Interval interval69 = interval37.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period68);
        long long72 = chronology25.add((org.joda.time.ReadablePeriod) period68, (long) 'a', 4);
        org.joda.time.DurationField durationField73 = chronology25.hours();
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight7.toMutableDateTime(chronology25);
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight1 and mutableDateTime74", (dateMidnight1.compareTo(mutableDateTime74) == 0) == dateMidnight1.equals(mutableDateTime74));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        boolean boolean13 = dateTime12.isBeforeNow();
        org.joda.time.DateTime dateTime15 = dateTime12.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime15.getZone();
        int int20 = dateTimeZone18.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime21 = yearMonthDay1.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTime dateTime30 = dateTime27.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime27.toDateTime(chronology35);
        boolean boolean37 = durationFieldType22.isSupported(chronology35);
        org.joda.time.DateTime dateTime39 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Chronology chronology45 = interval43.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.minutes();
        org.joda.time.DurationField durationField47 = chronology45.weekyears();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField49 = chronology45.minuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.clockhourOfHalfday();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((-62100742311688L), chronology45);
        org.joda.time.DateTimeField dateTimeField53 = chronology45.monthOfYear();
        org.joda.time.DurationField durationField54 = chronology45.hours();
        org.joda.time.DurationField durationField55 = durationFieldType22.getField(chronology45);
        java.lang.String str56 = durationFieldType22.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField55", (durationField47.compareTo(durationField55) == 0) == durationField47.equals(durationField55));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay1.plusYears(962);
        org.joda.time.Interval interval5 = yearMonthDay4.toInterval();
        org.joda.time.Interval interval8 = new org.joda.time.Interval(0L, 1L);
        org.joda.time.Interval interval9 = interval5.gap((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight.Property property13 = dateMidnight11.dayOfWeek();
        org.joda.time.DateMidnight.Property property14 = dateMidnight11.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight16 = property14.setCopy("4");
        org.joda.time.DateMidnight dateMidnight18 = property14.addToCopy((int) 'u');
        org.joda.time.DateMidnight dateMidnight20 = property14.addWrapFieldToCopy(35281);
        org.joda.time.DateMidnight dateMidnight21 = property14.roundHalfFloorCopy();
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfEra();
        boolean boolean23 = interval9.isBefore((org.joda.time.ReadableInstant) dateMidnight21);
        int int24 = dateMidnight21.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = yearMonthDay26.toDateTime(timeOfDay27, dateTimeZone28);
        boolean boolean30 = dateTime29.isBeforeNow();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear((int) (byte) 1);
        int int33 = dateTime29.getYear();
        org.joda.time.DateTime.Property property34 = dateTime29.weekyear();
        org.joda.time.DateTime dateTime35 = property34.withMaximumValue();
        org.joda.time.DateTime dateTime37 = dateTime35.withYear(2);
        org.joda.time.LocalDate localDate38 = dateTime37.toLocalDate();
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTimeISO();
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.minusDays(0);
        org.joda.time.DateTime dateTime43 = dateTime42.toDateTimeISO();
        int int44 = dateMidnight21.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.minutes();
        org.joda.time.DurationField durationField51 = chronology49.weekyears();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.millisOfSecond();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology49);
        org.joda.time.Chronology chronology54 = chronology49.withUTC();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.dayOfMonth();
        org.joda.time.DateTime dateTime56 = dateTime42.withChronology(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime42.plusMillis(136);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime56", (dateTime42.compareTo(dateTime56) == 0) == dateTime42.equals(dateTime56));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now();
        long long4 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfYear(49);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfWeek();
        org.joda.time.DateMidnight.Property property8 = dateMidnight6.centuryOfEra();
        org.joda.time.Instant instant9 = dateMidnight6.toInstant();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate.Property property25 = localDate24.weekyear();
        org.joda.time.LocalDate.Property property26 = localDate24.centuryOfEra();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay31 = org.joda.time.YearMonthDay.fromCalendarFields(calendar27);
        calendar27.setFirstDayOfWeek(2022);
        int int35 = calendar27.getMinimum(2);
        java.util.TimeZone timeZone36 = calendar27.getTimeZone();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getDisplayCountry();
        int int46 = dateTimeField42.getMaximumTextLength(locale43);
        java.lang.String str47 = locale43.getDisplayScript();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale43);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone36, locale43);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long52 = dateTimeZone50.previousTransition((long) 8);
        org.joda.time.Interval interval53 = localDate24.toInterval(dateTimeZone50);
        org.joda.time.Chronology chronology54 = chronology14.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = chronology14.minuteOfHour();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight6.withChronology(chronology14);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight6.plusDays(292278992);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateMidnight6", (instant9.compareTo(dateMidnight6) == 0) == instant9.equals(dateMidnight6));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        int int7 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusYears(2022);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMinimumValue();
        boolean boolean12 = dateTimeZone1.isLocalDateTimeGap(localDateTime11);
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime21.getZone();
        int int26 = dateTimeZone24.getStandardOffset((long) 13);
        java.lang.Object obj27 = null;
        boolean boolean28 = dateTimeZone24.equals(obj27);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone24);
        long long31 = dateTimeZone24.convertUTCToLocal((long) 35631);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay34.toDateTime(timeOfDay35, dateTimeZone36);
        boolean boolean38 = dateTime37.isBeforeNow();
        org.joda.time.DateTime dateTime40 = dateTime37.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime40.getZone();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance();
        calendar44.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay48 = org.joda.time.YearMonthDay.fromCalendarFields(calendar44);
        calendar44.setFirstDayOfWeek(2022);
        int int52 = calendar44.getMinimum(2);
        java.util.TimeZone timeZone53 = calendar44.getTimeZone();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
        org.joda.time.Chronology chronology58 = interval56.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str62 = locale60.getDisplayCountry();
        int int63 = dateTimeField59.getMaximumTextLength(locale60);
        java.lang.String str64 = locale60.getDisplayScript();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(locale60);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone53, locale60);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        long long69 = dateTimeZone67.previousTransition((long) 8);
        long long71 = dateTimeZone43.getMillisKeepLocal(dateTimeZone67, (long) (byte) 0);
        int int73 = dateTimeZone67.getOffsetFromLocal(8L);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone67);
        boolean boolean75 = dateTimeZone67.isFixed();
        long long79 = dateTimeZone67.convertLocalToUTC((long) (-52), false, (long) 706);
        java.util.Locale locale81 = java.util.Locale.getDefault();
        java.lang.String str82 = locale81.getLanguage();
        java.util.Set<java.lang.String> strSet83 = locale81.getUnicodeLocaleKeys();
        java.lang.String str84 = dateTimeZone67.getShortName((long) 183, locale81);
        boolean boolean85 = locale81.hasExtensions();
        java.lang.String str86 = dateTimeZone24.getName((-62132018677477L), locale81);
        org.joda.time.DateTime dateTime87 = localDateTime11.toDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime18", (dateTime2.compareTo(dateTime18) == 0) == dateTime2.equals(dateTime18));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.centuries();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((-1L), chronology5);
        org.joda.time.DurationField durationField10 = chronology5.hours();
        org.joda.time.DurationField durationField11 = chronology5.years();
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField11", (durationField12.compareTo(durationField11) == 0) == durationField12.equals(durationField11));
    }
}

