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
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.Chronology chronology5 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.secondOfMinute();
        java.lang.String str5 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        long long10 = iSOChronology1.add((long) 53178951, (long) (short) 10, (int) (byte) -1);
        boolean boolean11 = durationFieldType0.isSupported((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField15 = iSOChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField15, and durationField12", !(durationField12.compareTo(durationField15) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField15.compareTo(durationField12))));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int5 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfDay();
        java.lang.String str7 = property6.getAsString();
        int int8 = property6.getLeapAmount();
        long long9 = property6.remainder();
        org.joda.time.LocalDateTime localDateTime11 = property6.addToCopy(4595195458082052L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int15 = dateTimeZone13.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        int int24 = localDateTime23.getWeekyear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfYear();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        int int30 = dateTimeZone28.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDateTime31.getFieldTypes();
        int int33 = property26.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        int int34 = localDateTime31.getYearOfCentury();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean37 = dateTime35.isSupported(dateTimeFieldType36);
        long long38 = dateTime35.getMillis();
        int int39 = property18.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime35.getZone();
        org.joda.time.Instant instant41 = dateTime35.toInstant();
        org.joda.time.DateTime dateTime42 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) instant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant41", (dateTime35.compareTo(instant41) == 0) == dateTime35.equals(instant41));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology0.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.centuryOfEra();
        org.joda.time.DurationField durationField12 = iSOChronology9.days();
        org.joda.time.DurationField durationField13 = iSOChronology9.centuries();
        org.joda.time.DurationField durationField14 = iSOChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology9.getZone();
        int int18 = dateTimeZone16.getOffsetFromLocal(1677697524341279911L);
        org.joda.time.Chronology chronology19 = iSOChronology0.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField12", Math.signum(durationField7.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField7)));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.centuryOfEra();
        org.joda.time.DurationField durationField14 = iSOChronology11.eras();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.year();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.lang.String str18 = locale17.getDisplayScript();
        java.lang.String str20 = locale17.getExtension('x');
        java.util.Set<java.lang.Character> charSet21 = locale17.getExtensionKeys();
        java.lang.String str22 = dateTimeField15.getAsText(1645454774909L, locale17);
        boolean boolean23 = locale17.hasExtensions();
        java.util.Locale locale24 = java.util.Locale.JAPANESE;
        java.lang.String str25 = locale24.getDisplayLanguage();
        java.lang.String str26 = locale24.getISO3Language();
        java.lang.String str27 = locale24.getISO3Language();
        java.lang.String str28 = locale24.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = locale17.getDisplayCountry(locale30);
        java.lang.String str34 = property10.getAsText(locale30);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.hourOfHalfday();
        long long42 = iSOChronology35.getDateTimeMillis((-1), 8, 3, 365);
        org.joda.time.DurationField durationField43 = iSOChronology35.seconds();
        long long47 = iSOChronology35.add(1645454774909L, (long) 53178951, 53166088);
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology35.yearOfCentury();
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime55.toDateTime(readableInstant56);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        int int61 = dateTimeZone59.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusYears(2022);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.era();
        int int67 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime65);
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.lang.String str69 = dateTimeField50.getAsShortText((org.joda.time.ReadablePartial) localDateTime65, locale68);
        boolean boolean70 = locale68.hasExtensions();
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale68.getDisplayScript(locale71);
        java.lang.String str73 = locale30.getDisplayScript(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField43", Math.signum(durationField14.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField14)));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int4 = dateTimeZone2.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime5.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int8 = localDateTime5.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.dayOfWeek();
        boolean boolean10 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime0.withPeriodAdded(readablePeriod11, (int) (short) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(53189779);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(32);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        int int21 = dateTimeZone19.getOffset(100L);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) '4');
        java.lang.String str27 = dateTimeZone23.getNameKey(1645454784654L);
        org.joda.time.DateTime dateTime28 = localDateTime15.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.hourOfHalfday();
        java.lang.String str32 = iSOChronology30.toString();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology30.era();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset(100L);
        java.util.TimeZone timeZone38 = dateTimeZone35.toTimeZone();
        java.lang.String str39 = dateTimeZone35.toString();
        org.joda.time.Chronology chronology40 = iSOChronology30.withZone(dateTimeZone35);
        java.util.TimeZone timeZone41 = dateTimeZone35.toTimeZone();
        java.util.TimeZone timeZone42 = dateTimeZone35.toTimeZone();
        int int44 = dateTimeZone35.getOffsetFromLocal((long) 47);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        int int48 = dateTimeZone46.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime(readableInstant50);
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        int int53 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime51);
        int int54 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology55 = dateTime51.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant52", (dateTime51.compareTo(instant52) == 0) == dateTime51.equals(instant52));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        int int13 = localDateTime12.getWeekyear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.millisOfDay();
        int int15 = property14.get();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundCeilingCopy();
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor19 = charSet18.iterator();
        java.util.ArrayList[] arrayListArray21 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray22 = (java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray21;
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray23 = charSet18.toArray((java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray21);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        int int27 = dateTimeZone25.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = localDateTime28.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int31 = localDateTime28.get(dateTimeFieldType30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.dayOfWeek();
        org.joda.time.LocalDateTime.Property property33 = localDateTime28.weekOfWeekyear();
        boolean boolean34 = charSet18.remove((java.lang.Object) localDateTime28);
        boolean boolean35 = property14.equals((java.lang.Object) boolean34);
        org.joda.time.LocalDateTime localDateTime36 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime37 = property14.roundHalfEvenCopy();
        org.joda.time.DurationField durationField38 = property14.getDurationField();
        org.joda.time.LocalDateTime localDateTime40 = property14.addToCopy(2841283);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        int int44 = dateTimeZone42.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        int int56 = localDateTime55.getWeekyear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.minusMillis(2022);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime55.withDurationAdded(readableDuration60, (int) 'x');
        boolean boolean63 = localDateTime46.isBefore((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.plusMonths(49681);
        int[] intArray66 = localDateTime62.getValues();
        int int67 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localDateTime40, intArray66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField38", Math.signum(durationField5.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField5)));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(1645488000000L, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.secondOfDay();
        long long15 = iSOChronology1.add(0L, (long) 2841283, 36);
        org.joda.time.DurationField durationField16 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField16", Math.signum(durationField4.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField4)));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime4.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int7 = localDateTime4.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusMonths(4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.minusYears(2855123);
        org.joda.time.LocalDateTime.Property property13 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str18 = dateTimeZone16.getShortName(100L);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.centuryOfEra();
        org.joda.time.DurationField durationField23 = iSOChronology20.centuries();
        org.joda.time.DurationField durationField24 = iSOChronology20.hours();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        int int28 = dateTimeZone26.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        int int30 = localDateTime29.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfEra(2022);
        long long34 = iSOChronology20.set((org.joda.time.ReadablePartial) localDateTime32, (long) 0);
        org.joda.time.DateTime dateTime35 = localDateTime32.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getDurationType();
        boolean boolean38 = dateTime35.isSupported(dateTimeFieldType36);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        int int42 = dateTimeZone40.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone40);
        int int44 = localDateTime43.getWeekyear();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.millisOfDay();
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        int int49 = dateTimeZone47.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(dateTimeZone47);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime(readableInstant51);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        int int56 = dateTimeZone54.getOffset(100L);
        org.joda.time.DateTime dateTime57 = localDateTime50.toDateTime(dateTimeZone54);
        int int58 = property45.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDateTime localDateTime59 = property45.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.property(dateTimeFieldType60);
        boolean boolean62 = dateTime35.isSupported(dateTimeFieldType60);
        org.joda.time.Instant instant63 = dateTime35.toInstant();
        int int64 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) instant63);
        int int65 = property13.compareTo((org.joda.time.ReadableInstant) instant63);
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        int int69 = dateTimeZone67.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        int int71 = localDateTime70.getWeekyear();
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.millisOfDay();
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.lang.String str75 = locale73.getDisplayCountry(locale74);
        java.util.Locale locale76 = locale73.stripExtensions();
        int int77 = property72.getMaximumShortTextLength(locale73);
        org.joda.time.Interval interval78 = property72.toInterval();
        org.joda.time.LocalDateTime localDateTime80 = property72.setCopy(1);
        int int81 = localDateTime80.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.minusMonths(2022);
        int int84 = localDateTime80.getYear();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime80.minusSeconds(2807077);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalDateTime localDateTime88 = localDateTime80.plus(readablePeriod87);
        int int89 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant63", (dateTime35.compareTo(instant63) == 0) == dateTime35.equals(instant63));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) (short) 10);
        int int18 = localDateTime15.size();
        boolean boolean19 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withMillisOfSecond(52);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMinutes(0);
        int int24 = localDateTime23.getHourOfDay();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        int int28 = dateTimeZone26.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = localDateTime29.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int32 = localDateTime29.get(dateTimeFieldType31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minusHours(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime29.getFieldType((int) (byte) 1);
        boolean boolean38 = localDateTime23.isSupported(dateTimeFieldType37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        int int44 = dateTimeZone42.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime(readableInstant46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        int int51 = dateTimeZone49.getOffset(100L);
        org.joda.time.DateTime dateTime52 = localDateTime45.toDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime45.plusMinutes((-1));
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.withMinimumValue();
        java.lang.String str57 = property55.getAsText();
        org.joda.time.LocalDateTime localDateTime58 = property55.roundCeilingCopy();
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        int int62 = dateTimeZone60.getOffset(100L);
        java.util.TimeZone timeZone63 = dateTimeZone60.toTimeZone();
        java.lang.String str64 = dateTimeZone60.getID();
        java.util.TimeZone timeZone65 = dateTimeZone60.toTimeZone();
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        int int69 = dateTimeZone67.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        int int71 = localDateTime70.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withYearOfEra(2022);
        java.util.TimeZone timeZone74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        int int77 = dateTimeZone75.getOffset(100L);
        java.util.TimeZone timeZone78 = dateTimeZone75.toTimeZone();
        int int80 = dateTimeZone75.getStandardOffset((long) ' ');
        org.joda.time.DateTime dateTime81 = localDateTime73.toDateTime(dateTimeZone75);
        int int82 = dateTimeZone60.getOffset((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime83 = localDateTime58.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Instant instant84 = dateTime83.toInstant();
        int int85 = property39.getDifference((org.joda.time.ReadableInstant) dateTime83);
        java.lang.String str86 = property39.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime83 and instant84", (dateTime83.compareTo(instant84) == 0) == dateTime83.equals(instant84));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.hourOfHalfday();
        long long7 = iSOChronology0.getDateTimeMillis((-1), 8, 3, 365);
        org.joda.time.DurationField durationField8 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField11 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField8, and durationField10", !(durationField11.compareTo(durationField8) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.weekyearOfCentury();
        java.lang.String str12 = iSOChronology8.toString();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.dayOfYear();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        int int18 = dateTimeZone16.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime19.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusHours((int) '4');
        int int25 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.centuryOfEra();
        org.joda.time.DurationField durationField29 = iSOChronology26.centuries();
        org.joda.time.DurationField durationField30 = iSOChronology26.hours();
        org.joda.time.DurationField durationField31 = iSOChronology26.years();
        org.joda.time.DurationField durationField32 = iSOChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology26.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology26.getZone();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        int int39 = dateTimeZone37.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = localDateTime40.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int43 = localDateTime40.get(dateTimeFieldType42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.dayOfWeek();
        boolean boolean45 = localDateTime35.isEqual((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime40.withYearOfEra((int) (byte) 10);
        boolean boolean49 = dateTimeZone34.equals((java.lang.Object) localDateTime48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withYearOfCentury((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.plusHours(49623);
        org.joda.time.tz.NameProvider nameProvider55 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str60 = nameProvider55.getShortName(locale56, "Koordinierte Universalzeit", "+00:00");
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder61.setExtension('x', "jpn");
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Locale locale68 = locale65.stripExtensions();
        java.lang.String str69 = locale65.getDisplayName();
        java.util.Locale.Builder builder70 = builder64.setLocale(locale65);
        java.util.Locale locale71 = builder70.build();
        java.lang.String str72 = locale71.getScript();
        java.lang.String str75 = nameProvider55.getName(locale71, "hourOfDay", "");
        java.lang.String str76 = locale71.getDisplayCountry();
        java.util.Locale locale77 = locale71.stripExtensions();
        java.lang.String str78 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, 2847, locale71);
        java.util.Locale locale79 = locale71.stripExtensions();
        java.lang.String str80 = dateTimeField6.getAsText(895, locale71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField29", Math.signum(durationField3.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField3)));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime4.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int7 = localDateTime4.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfWeek();
        boolean boolean9 = property8.isLeap();
        long long10 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime11 = property8.getLocalDateTime();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getOffset(100L);
        java.util.TimeZone timeZone17 = dateTimeZone14.toTimeZone();
        java.lang.String str18 = dateTimeZone14.getID();
        java.util.TimeZone timeZone19 = dateTimeZone14.toTimeZone();
        long long21 = dateTimeZone14.nextTransition((long) 100);
        java.lang.String str23 = dateTimeZone14.getNameKey(1645454778469L);
        org.joda.time.DateTime dateTime24 = localDateTime11.toDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        boolean boolean27 = dateTime24.isSupported(dateTimeFieldType25);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        int int31 = dateTimeZone29.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        int int33 = localDateTime32.getDayOfYear();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        int int39 = localDateTime38.getWeekyear();
        org.joda.time.LocalDateTime.Property property40 = localDateTime38.minuteOfHour();
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.dayOfYear();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        int int45 = dateTimeZone43.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = localDateTime46.getFieldTypes();
        int int48 = property41.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        int int49 = localDateTime46.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime.Property property51 = localDateTime46.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        boolean boolean53 = localDateTime32.isSupported(dateTimeFieldType52);
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology54.centuryOfEra();
        org.joda.time.DurationField durationField57 = iSOChronology54.seconds();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType52.getField((org.joda.time.Chronology) iSOChronology54);
        boolean boolean59 = dateTime24.isSupported(dateTimeFieldType52);
        java.lang.String str60 = dateTimeFieldType52.getName();
        org.joda.time.chrono.ISOChronology iSOChronology61 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology61.centuryOfEra();
        org.joda.time.DurationField durationField64 = iSOChronology61.days();
        org.joda.time.DateTimeField dateTimeField65 = iSOChronology61.era();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType52.getField((org.joda.time.Chronology) iSOChronology61);
        org.joda.time.DurationField durationField67 = iSOChronology61.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField67, durationField57, and durationField64", !(durationField67.compareTo(durationField57) == 0) || (Math.signum(durationField67.compareTo(durationField64)) == Math.signum(durationField57.compareTo(durationField64))));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int5 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfDay();
        java.lang.String str7 = property6.getAsString();
        int int8 = property6.getLeapAmount();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(100L);
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateTime20.isSupported(dateTimeFieldType21);
        int int23 = property6.getDifference((org.joda.time.ReadableInstant) dateTime20);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        int int27 = dateTimeZone25.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusSeconds((int) (short) 10);
        int int42 = localDateTime39.size();
        boolean boolean43 = localDateTime33.isBefore((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.withMillisOfSecond(52);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusMinutes(0);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plusDays(53166088);
        int int50 = localDateTime49.getDayOfYear();
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        int int56 = localDateTime55.getWeekyear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.millisOfDay();
        java.lang.String str58 = property57.getAsString();
        int int59 = property57.getLeapAmount();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        int int63 = dateTimeZone61.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(dateTimeZone61);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime(readableInstant65);
        java.util.TimeZone timeZone67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone67);
        int int70 = dateTimeZone68.getOffset(100L);
        org.joda.time.DateTime dateTime71 = localDateTime64.toDateTime(dateTimeZone68);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        boolean boolean73 = dateTime71.isSupported(dateTimeFieldType72);
        int int74 = property57.getDifference((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime75 = localDateTime49.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean76 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.Instant instant77 = dateTime75.toInstant();
        org.joda.time.Instant instant78 = dateTime75.toInstant();
        org.joda.time.Instant instant79 = instant78.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and instant77", (dateTime75.compareTo(instant77) == 0) == dateTime75.equals(instant77));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DurationField durationField6 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor4 = charSet3.iterator();
        java.util.ArrayList[] arrayListArray6 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray7 = (java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray6;
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray8 = charSet3.toArray((java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        int int12 = dateTimeZone10.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone10);
        int int14 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.millisOfDay();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int26 = dateTimeZone24.getOffset(100L);
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone24);
        int int28 = property15.compareTo((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean29 = charSet3.equals((java.lang.Object) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime27.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = iSOChronology31.centuries();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology31.secondOfMinute();
        org.joda.time.Chronology chronology35 = iSOChronology31.withUTC();
        org.joda.time.DurationField durationField36 = durationFieldType1.getField(chronology35);
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.hourOfHalfday();
        java.lang.String str39 = iSOChronology37.toString();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.era();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DurationField durationField42 = iSOChronology37.weeks();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology37.dayOfYear();
        boolean boolean44 = durationFieldType1.isSupported((org.joda.time.Chronology) iSOChronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField36", Math.signum(durationField33.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField33)));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = durationFieldType0.getField((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.joda.time.DurationFieldType durationFieldType10 = durationField9.getType();
        java.lang.String str11 = durationFieldType10.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField9", Math.signum(durationField4.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField4)));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int5 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfDay();
        java.lang.String str7 = property6.getAsString();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(readableInstant13);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        long long16 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        int int20 = dateTimeZone18.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        int int22 = localDateTime21.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(2022);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        int int28 = dateTimeZone26.getOffset(100L);
        java.util.TimeZone timeZone29 = dateTimeZone26.toTimeZone();
        int int31 = dateTimeZone26.getStandardOffset((long) ' ');
        org.joda.time.DateTime dateTime32 = localDateTime24.toDateTime(dateTimeZone26);
        boolean boolean33 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Instant instant34 = dateTime32.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology2.years();
        boolean boolean7 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) iSOChronology2);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        int int13 = localDateTime12.getWeekyear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfYear();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime20.getFieldTypes();
        int int22 = property15.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        int int23 = localDateTime20.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.millisOfDay();
        org.joda.time.LocalDateTime.Property property25 = localDateTime20.era();
        int int26 = localDateTime20.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.plusSeconds(53166088);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime20.withFieldAdded(durationFieldType29, (-1));
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        int int35 = dateTimeZone33.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime(readableInstant37);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.hours();
        org.joda.time.DurationField durationField41 = chronology39.months();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfYear();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        int int46 = dateTimeZone44.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        int[] intArray50 = new int[] { (short) 0, (short) 0 };
        int int51 = dateTimeField42.getMinimumValue((org.joda.time.ReadablePartial) localDateTime47, intArray50);
        int int53 = dateTimeField42.getMinimumValue((long) 100);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        int int57 = dateTimeZone55.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        int int59 = localDateTime58.getWeekyear();
        org.joda.time.LocalDateTime.Property property60 = localDateTime58.minuteOfHour();
        int int61 = dateTimeField42.getMaximumValue((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.hourOfDay();
        org.joda.time.DurationField durationField65 = property64.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime66 = property64.roundHalfFloorCopy();
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.eras();
        java.lang.String str68 = durationFieldType67.getName();
        boolean boolean69 = localDateTime66.isSupported(durationFieldType67);
        boolean boolean70 = localDateTime31.isSupported(durationFieldType67);
        org.joda.time.chrono.ISOChronology iSOChronology71 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField72 = iSOChronology71.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField73 = iSOChronology71.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = iSOChronology71.weekyearOfCentury();
        org.joda.time.DurationField durationField75 = iSOChronology71.weekyears();
        boolean boolean76 = durationFieldType67.isSupported((org.joda.time.Chronology) iSOChronology71);
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField75", (durationField6.compareTo(durationField75) == 0) == durationField6.equals(durationField75));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.year();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = iSOChronology8.add(readablePeriod12, 14L, 4);
        org.joda.time.DurationField durationField16 = durationFieldType7.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField17 = iSOChronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField17, and durationField3", !(durationField3.compareTo(durationField17) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField17.compareTo(durationField3))));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfHour();
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField11, and durationField5", !(durationField5.compareTo(durationField11) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField11.compareTo(durationField5))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = iSOChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(readableInstant5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset(100L);
        org.joda.time.DateTime dateTime11 = localDateTime4.toDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.plusMinutes((-1));
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        int int15 = property14.getMinimumValue();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime(readableInstant21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int26 = dateTimeZone24.getOffset(100L);
        org.joda.time.DateTime dateTime27 = localDateTime20.toDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.plusMinutes((-1));
        int int30 = property14.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusMonths((int) 'u');
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.yearOfCentury();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        long long42 = instant41.getMillis();
        int int43 = property33.compareTo((org.joda.time.ReadableInstant) instant41);
        java.util.Locale locale44 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.util.Iterator<java.lang.Character> charItor46 = charSet45.iterator();
        java.util.ArrayList[] arrayListArray48 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray49 = (java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray48;
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray50 = charSet45.toArray((java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray48);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        int int56 = localDateTime55.getWeekyear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.millisOfDay();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        int int61 = dateTimeZone59.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime(readableInstant63);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        int int68 = dateTimeZone66.getOffset(100L);
        org.joda.time.DateTime dateTime69 = localDateTime62.toDateTime(dateTimeZone66);
        int int70 = property57.compareTo((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = charSet45.equals((java.lang.Object) dateTime69);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime69.getZone();
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        int int76 = dateTimeZone74.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(dateTimeZone74);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray78 = localDateTime77.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int80 = localDateTime77.get(dateTimeFieldType79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime77.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.minusHours(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = localDateTime77.getFieldType((int) (byte) 1);
        int int86 = dateTime69.get(dateTimeFieldType85);
        boolean boolean87 = instant41.isEqual((org.joda.time.ReadableInstant) dateTime69);
        java.lang.String str88 = dateTime69.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant41", (dateTime6.compareTo(instant41) == 0) == dateTime6.equals(instant41));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField2 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField2, and durationField4", !(durationField6.compareTo(durationField2) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField2.compareTo(durationField4))));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int11 = dateTimeZone9.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(readableInstant13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        org.joda.time.DurationField durationField17 = chronology15.months();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        int[] intArray26 = new int[] { (short) 0, (short) 0 };
        int int27 = dateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localDateTime23, intArray26);
        int int29 = dateTimeField18.getMinimumValue((long) 100);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        int int33 = dateTimeZone31.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        int int35 = localDateTime34.getWeekyear();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.minuteOfHour();
        int int37 = dateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withCenturyOfEra(1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.hourOfDay();
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        int int44 = dateTimeZone42.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        int int54 = dateTimeZone52.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds((int) (short) 10);
        int int59 = localDateTime56.size();
        boolean boolean60 = localDateTime50.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withMillisOfSecond(52);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusMinutes(0);
        boolean boolean65 = property40.equals((java.lang.Object) localDateTime62);
        int int66 = localDateTime62.size();
        int int67 = localDateTime62.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(1645454821576L);
        int[] intArray70 = localDateTime69.getValues();
        iSOChronology0.validate((org.joda.time.ReadablePartial) localDateTime62, intArray70);
        org.joda.time.DurationField durationField72 = iSOChronology0.millis();
        org.joda.time.DurationField durationField73 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField3, and durationField6", !(durationField73.compareTo(durationField3) == 0) || (Math.signum(durationField73.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField4 = iSOChronology0.months();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.centuryOfEra();
        org.joda.time.DurationField durationField13 = iSOChronology10.eras();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology10.year();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(dateTimeZone17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime20.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int23 = localDateTime20.get(dateTimeFieldType22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minusHours(20);
        int[] intArray28 = iSOChronology10.get((org.joda.time.ReadablePartial) localDateTime26, (long) 21);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology10.centuryOfEra();
        org.joda.time.DurationField durationField31 = iSOChronology10.eras();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, (org.joda.time.Chronology) iSOChronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField13", Math.signum(durationField3.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField3)));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        java.lang.String str4 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readablePeriod8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.dayOfMonth();
        boolean boolean11 = property10.isLeap();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int15 = dateTimeZone13.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime(readableInstant17);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.hours();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfYear();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int26 = dateTimeZone24.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        int[] intArray30 = new int[] { (short) 0, (short) 0 };
        int int31 = dateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) localDateTime27, intArray30);
        java.lang.String str33 = dateTimeField22.getAsShortText((long) 53166088);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.lang.String str39 = locale35.getDisplayLanguage(locale37);
        java.lang.String str40 = dateTimeField22.getAsText(0L, locale37);
        java.lang.String str41 = property10.getAsText(locale37);
        org.joda.time.LocalDateTime localDateTime42 = property10.getLocalDateTime();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        int int46 = dateTimeZone44.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusSeconds((int) (short) 10);
        int int51 = localDateTime48.size();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime();
        int int53 = property10.getDifference((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getDurationType();
        java.lang.String str56 = dateTimeFieldType54.getName();
        boolean boolean57 = dateTime52.isSupported(dateTimeFieldType54);
        long long58 = dateTime52.getMillis();
        java.lang.String str59 = dateTime52.toString();
        org.joda.time.Instant instant60 = dateTime52.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology61 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology61.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology61.minuteOfHour();
        org.joda.time.Chronology chronology65 = iSOChronology61.withUTC();
        org.joda.time.DurationField durationField66 = iSOChronology61.eras();
        java.util.TimeZone timeZone67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone67);
        int int70 = dateTimeZone68.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now(dateTimeZone68);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = localDateTime71.getFieldTypes();
        int int73 = localDateTime71.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property74 = localDateTime71.year();
        int[] intArray76 = iSOChronology61.get((org.joda.time.ReadablePartial) localDateTime71, 1645454769600L);
        org.joda.time.DateTimeField dateTimeField77 = iSOChronology61.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = dateTimeField77.getType();
        java.lang.String str79 = dateTimeFieldType78.getName();
        boolean boolean80 = instant60.isSupported(dateTimeFieldType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField66", Math.signum(durationField20.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField20)));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.hourOfHalfday();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        int int6 = dateTimeZone4.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime(readableInstant8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears(2022);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        int int19 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.hourOfHalfday();
        java.lang.String str22 = iSOChronology20.toString();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int26 = dateTimeZone24.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime(readableInstant28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DurationField durationField32 = chronology30.months();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfYear();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        int int37 = dateTimeZone35.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        int[] intArray41 = new int[] { (short) 0, (short) 0 };
        int int42 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localDateTime38, intArray41);
        java.lang.String str44 = dateTimeField33.getAsShortText((long) 53166088);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        int int48 = dateTimeZone46.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        int int50 = localDateTime49.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withFieldAdded(durationFieldType51, 53166088);
        java.util.Locale locale54 = java.util.Locale.ROOT;
        java.lang.String str55 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime53, locale54);
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        int int59 = dateTimeZone57.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        int int61 = localDateTime60.getWeekyear();
        boolean boolean62 = localDateTime53.isEqual((org.joda.time.ReadablePartial) localDateTime60);
        int[] intArray64 = iSOChronology20.get((org.joda.time.ReadablePartial) localDateTime60, (long) 53166088);
        iSOChronology0.validate((org.joda.time.ReadablePartial) localDateTime7, intArray64);
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone67 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone68 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField69 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField70 = iSOChronology0.days();
        org.joda.time.DurationField durationField71 = iSOChronology0.months();
        org.joda.time.DurationField durationField72 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField73 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField74 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField31, and durationField32", !(durationField74.compareTo(durationField31) == 0) || (Math.signum(durationField74.compareTo(durationField32)) == Math.signum(durationField31.compareTo(durationField32))));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime4.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int7 = localDateTime4.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusHours(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime4.getFieldType((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withDurationAdded(readableDuration13, 46);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean17 = localDateTime4.isSupported(dateTimeFieldType16);
        int int18 = localDateTime4.getHourOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology19.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, (org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField27 = iSOChronology19.eras();
        org.joda.time.DurationField durationField28 = iSOChronology19.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds((int) (short) 10);
        int int8 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property9.setCopy((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay(53166088);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.centuryOfEra();
        org.joda.time.DurationField durationField17 = iSOChronology14.centuries();
        org.joda.time.DurationField durationField18 = iSOChronology14.hours();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        int int22 = dateTimeZone20.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone20);
        int int24 = localDateTime23.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfEra(2022);
        long long28 = iSOChronology14.set((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTime dateTime29 = localDateTime26.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        boolean boolean32 = dateTime29.isSupported(dateTimeFieldType30);
        int int33 = localDateTime13.get(dateTimeFieldType30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime13.year();
        long long35 = property34.remainder();
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.centuryOfEra();
        org.joda.time.DurationField durationField39 = iSOChronology36.eras();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology36.year();
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.lang.String str43 = locale42.getDisplayScript();
        java.lang.String str45 = locale42.getExtension('x');
        java.util.Set<java.lang.Character> charSet46 = locale42.getExtensionKeys();
        java.lang.String str47 = dateTimeField40.getAsText(1645454774909L, locale42);
        boolean boolean48 = locale42.hasExtensions();
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder52 = builder49.setExtension('x', "jpn");
        java.util.Locale.Builder builder54 = builder49.removeUnicodeLocaleAttribute("53169126");
        java.util.Locale.Builder builder56 = builder54.addUnicodeLocaleAttribute("German");
        java.util.Locale locale57 = builder54.build();
        java.lang.String str58 = locale42.getDisplayName(locale57);
        java.lang.String str59 = locale57.toLanguageTag();
        java.lang.String str60 = locale57.getVariant();
        java.lang.String str61 = property34.getAsShortText(locale57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField39", Math.signum(durationField17.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField17)));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(readableInstant5);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.centuryOfEra();
        org.joda.time.DurationField durationField12 = iSOChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology9.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField16.getType();
        boolean boolean18 = instant7.isSupported(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime(readableInstant5);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = dateTime6.isSupported(dateTimeFieldType8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        int int23 = dateTimeZone21.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime(readableInstant25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        int int30 = dateTimeZone28.getOffset(100L);
        java.util.TimeZone timeZone31 = dateTimeZone28.toTimeZone();
        int int33 = dateTimeZone28.getStandardOffset((long) ' ');
        boolean boolean35 = dateTimeZone28.isStandardOffset((long) '4');
        boolean boolean36 = dateTimeZone28.isFixed();
        long long38 = dateTimeZone28.convertUTCToLocal(0L);
        boolean boolean39 = dateTimeZone28.isFixed();
        org.joda.time.DateTime dateTime40 = localDateTime24.toDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        long long42 = dateTime40.getMillis();
        org.joda.time.DateTime dateTime43 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime40);
        boolean boolean44 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime26", (instant7.compareTo(dateTime26) == 0) == instant7.equals(dateTime26));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfHalfday();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        long long8 = iSOChronology0.add((long) 53195125, 1645454791872L, 31);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.minuteOfDay();
        java.lang.String str10 = iSOChronology0.toString();
        org.joda.time.Chronology chronology11 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField14 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField14, and durationField3", !(durationField3.compareTo(durationField14) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField14.compareTo(durationField3))));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str7 = dateTimeZone5.getName(31556995199999L);
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekOfWeekyear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getName(31556995199999L);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField8", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2801);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        int int5 = dateTimeZone3.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        int int7 = localDateTime6.getWeekyear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int13 = dateTimeZone11.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDateTime14.getFieldTypes();
        int int16 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        int int17 = localDateTime14.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plus(readablePeriod18);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology20.dayOfYear();
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str29 = dateTimeZone27.getName(31556995199999L);
        java.lang.String str30 = dateTimeZone27.getID();
        org.joda.time.Chronology chronology31 = iSOChronology20.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = localDateTime14.toDateTime(dateTimeZone27);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.centuryOfEra();
        org.joda.time.DurationField durationField36 = iSOChronology33.eras();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology33.year();
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str42 = locale39.getExtension('x');
        java.util.Set<java.lang.Character> charSet43 = locale39.getExtensionKeys();
        java.lang.String str44 = dateTimeField37.getAsText(1645454774909L, locale39);
        boolean boolean45 = dateTime32.equals((java.lang.Object) str44);
        org.joda.time.Instant instant46 = dateTime32.toInstant();
        int int47 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        int int51 = dateTimeZone49.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone49);
        int int53 = localDateTime52.getWeekyear();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.minuteOfHour();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.dayOfYear();
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        int int59 = dateTimeZone57.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = localDateTime60.getFieldTypes();
        int int62 = property55.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        int int63 = localDateTime60.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.plus(readablePeriod64);
        org.joda.time.chrono.ISOChronology iSOChronology66 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField67 = iSOChronology66.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField68 = iSOChronology66.yearOfEra();
        org.joda.time.DateTimeField dateTimeField69 = iSOChronology66.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField70 = iSOChronology66.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField71 = iSOChronology66.dayOfYear();
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        java.lang.String str75 = dateTimeZone73.getName(31556995199999L);
        java.lang.String str76 = dateTimeZone73.getID();
        org.joda.time.Chronology chronology77 = iSOChronology66.withZone(dateTimeZone73);
        org.joda.time.DateTime dateTime78 = localDateTime60.toDateTime(dateTimeZone73);
        org.joda.time.chrono.ISOChronology iSOChronology79 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField80 = iSOChronology79.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField81 = iSOChronology79.centuryOfEra();
        org.joda.time.DurationField durationField82 = iSOChronology79.eras();
        org.joda.time.DateTimeField dateTimeField83 = iSOChronology79.year();
        java.util.Locale locale85 = java.util.Locale.GERMAN;
        java.lang.String str86 = locale85.getDisplayScript();
        java.lang.String str88 = locale85.getExtension('x');
        java.util.Set<java.lang.Character> charSet89 = locale85.getExtensionKeys();
        java.lang.String str90 = dateTimeField83.getAsText(1645454774909L, locale85);
        boolean boolean91 = dateTime78.equals((java.lang.Object) str90);
        org.joda.time.Instant instant92 = dateTime78.toInstant();
        boolean boolean93 = instant46.equals((java.lang.Object) dateTime78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant92", (dateTime32.compareTo(instant92) == 0) == dateTime32.equals(instant92));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int5 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfDay();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime(readableInstant12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffset(100L);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone15);
        int int19 = property6.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = property6.roundHalfEvenCopy();
        org.joda.time.Interval interval21 = property6.toInterval();
        org.joda.time.LocalDateTime localDateTime22 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime23 = property6.roundHalfCeilingCopy();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.dayOfMonth();
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        int int32 = dateTimeZone30.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        int int39 = dateTimeZone37.getOffset(100L);
        org.joda.time.DateTime dateTime40 = localDateTime33.toDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.withYear(52);
        org.joda.time.Chronology chronology43 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.minusSeconds(2827402);
        int int48 = dateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) localDateTime42);
        boolean boolean49 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.chrono.ISOChronology iSOChronology50 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology50.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology50.centuryOfEra();
        org.joda.time.DurationField durationField53 = iSOChronology50.eras();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology50.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology50.year();
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        int int59 = dateTimeZone57.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(dateTimeZone57);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = localDateTime60.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int63 = localDateTime60.get(dateTimeFieldType62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime60.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.minusHours(20);
        int[] intArray68 = iSOChronology50.get((org.joda.time.ReadablePartial) localDateTime66, (long) 21);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.minus(readablePeriod69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalDateTime.Property property72 = localDateTime66.property(dateTimeFieldType71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime42.property(dateTimeFieldType71);
        org.joda.time.LocalDateTime.Property property74 = localDateTime42.weekyear();
        org.joda.time.DurationField durationField75 = property74.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField75, and durationField53", !(durationField53.compareTo(durationField75) == 0) || (Math.signum(durationField53.compareTo(durationField53)) == Math.signum(durationField75.compareTo(durationField53))));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField8 = iSOChronology0.minutes();
        long long12 = iSOChronology0.add(1645454771211L, 1644849998618L, (int) 'u');
        org.joda.time.Chronology chronology13 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField14 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField14", Math.signum(durationField8.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField8)));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfHalfday();
        long long9 = iSOChronology0.add((long) (short) 100, 1644849973425L, 2720);
        org.joda.time.DurationField durationField10 = iSOChronology0.weekyears();
        long long14 = iSOChronology0.add(57854412000L, (long) 'x', 5);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = iSOChronology0.years();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField17", (durationField10.compareTo(durationField17) == 0) == durationField10.equals(durationField17));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField4 = iSOChronology0.months();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        int[] intArray10 = localDateTime9.getValues();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        int int14 = dateTimeZone12.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusWeeks((int) (byte) 10);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        int int24 = dateTimeZone22.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusSeconds((int) (short) 10);
        int int29 = localDateTime26.size();
        boolean boolean30 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime20.year();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime20.withYearOfEra(49675097);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        int int39 = dateTimeZone37.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone37);
        int int41 = localDateTime40.getWeekyear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.minuteOfHour();
        org.joda.time.chrono.ISOChronology iSOChronology43 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology43.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology43.centuryOfEra();
        org.joda.time.DurationField durationField46 = iSOChronology43.seconds();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology43.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology43.hourOfHalfday();
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        int int52 = dateTimeZone50.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = localDateTime53.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int56 = localDateTime53.get(dateTimeFieldType55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.minusWeeks(1);
        long long60 = iSOChronology43.set((org.joda.time.ReadablePartial) localDateTime58, (long) 0);
        boolean boolean61 = localDateTime40.isAfter((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.chrono.ISOChronology iSOChronology62 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology62.hourOfHalfday();
        java.lang.String str64 = iSOChronology62.toString();
        org.joda.time.DurationField durationField65 = iSOChronology62.centuries();
        org.joda.time.Chronology chronology66 = iSOChronology62.withUTC();
        org.joda.time.DurationField durationField67 = iSOChronology62.years();
        boolean boolean68 = localDateTime40.equals((java.lang.Object) iSOChronology62);
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        int int72 = dateTimeZone70.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(dateTimeZone70);
        int int74 = localDateTime73.getWeekyear();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.millisOfDay();
        java.lang.String str76 = property75.toString();
        int int77 = property75.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime79 = property75.addToCopy(2L);
        org.joda.time.chrono.ISOChronology iSOChronology80 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField81 = iSOChronology80.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField82 = iSOChronology80.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField83 = iSOChronology80.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField84 = iSOChronology80.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone85 = iSOChronology80.getZone();
        org.joda.time.DateTime dateTime86 = localDateTime79.toDateTime(dateTimeZone85);
        org.joda.time.DateTime dateTime87 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.DateTime dateTime88 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.DateTime dateTime89 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField67", (durationField5.compareTo(durationField67) == 0) == durationField5.equals(durationField67));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        int int5 = localDateTime4.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.millisOfDay();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime(readableInstant12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getOffset(100L);
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime(dateTimeZone15);
        int int19 = property6.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.property(dateTimeFieldType21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withFieldAdded(durationFieldType23, (int) 'a');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.plusMonths(27424246);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.withYear(21);
        java.lang.String str30 = localDateTime29.toString();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        int int34 = dateTimeZone32.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = localDateTime35.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusWeeks(2022);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plusHours((int) '4');
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plus(readableDuration41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = localDateTime42.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withCenturyOfEra(2843364);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime29.withFields((org.joda.time.ReadablePartial) localDateTime45);
        int int47 = localDateTime46.getYearOfCentury();
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        int int51 = dateTimeZone49.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.hourOfDay();
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.minuteOfHour();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        int int61 = dateTimeZone59.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone59);
        int int63 = localDateTime62.getWeekyear();
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.millisOfDay();
        org.joda.time.LocalDateTime localDateTime65 = property64.roundCeilingCopy();
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        int int69 = dateTimeZone67.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(dateTimeZone67);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.DateTime dateTime72 = localDateTime70.toDateTime(readableInstant71);
        org.joda.time.Instant instant73 = dateTime72.toInstant();
        java.lang.String str74 = instant73.toString();
        int int75 = property64.getDifference((org.joda.time.ReadableInstant) instant73);
        long long76 = instant73.getMillis();
        org.joda.time.DateTime dateTime77 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.DateTime dateTime78 = localDateTime46.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime46.minus(readableDuration79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant73", (dateTime13.compareTo(instant73) == 0) == dateTime13.equals(instant73));
    }
}

