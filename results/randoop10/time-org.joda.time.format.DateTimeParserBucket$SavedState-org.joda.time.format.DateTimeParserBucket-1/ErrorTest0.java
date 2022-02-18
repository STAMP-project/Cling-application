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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField17, and durationField18", !(durationField20.compareTo(durationField17) == 0) || (Math.signum(durationField20.compareTo(durationField18)) == Math.signum(durationField17.compareTo(durationField18))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DurationField durationField28 = chronology25.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.DurationField durationField44 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField19, and durationField38", !(durationField44.compareTo(durationField19) == 0) || (Math.signum(durationField44.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology17.minuteOfHour();
        org.joda.time.DurationField durationField43 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField19, and durationField38", !(durationField43.compareTo(durationField19) == 0) || (Math.signum(durationField43.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        boolean boolean35 = dateTimeZone32.isFixed();
        org.joda.time.Chronology chronology36 = chronology26.withZone(dateTimeZone32);
        boolean boolean37 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology36);
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DurationField durationField39 = chronology36.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField38", Math.signum(durationField27.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField27)));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField28, and durationField27", !(durationField27.compareTo(durationField28) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField28.compareTo(durationField27))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        java.lang.String str24 = chronology16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField23", Math.signum(durationField17.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField17)));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology16.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField21, and durationField19", !(durationField19.compareTo(durationField21) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField21.compareTo(durationField19))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField25 = chronology17.weeks();
        org.joda.time.DurationField durationField26 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField19, and durationField23", !(durationField26.compareTo(durationField19) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        boolean boolean35 = dateTimeZone32.isFixed();
        org.joda.time.Chronology chronology36 = chronology26.withZone(dateTimeZone32);
        boolean boolean37 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology36);
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField38", Math.signum(durationField27.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField27)));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField17, and durationField18", !(durationField19.compareTo(durationField17) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField17.compareTo(durationField18))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfYear();
        java.util.Locale locale34 = new java.util.Locale("ja_JP", "35", "ja");
        java.lang.String str35 = dateTimeField29.getAsShortText((-11201), locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType39.getField(chronology40);
        boolean boolean42 = dateTimeField41.isLenient();
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str46 = locale45.getDisplayName();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.lang.String str48 = locale47.getLanguage();
        java.lang.String str49 = locale45.getDisplayName(locale47);
        java.lang.String str50 = dateTimeField41.getAsText(readablePartial43, (int) 'x', locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology38, locale47, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology53 = dateTimeParserBucket52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.seconds();
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfEra();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType36.getField(chronology53);
        org.joda.time.DurationField durationField57 = dateTimeField56.getRangeDurationField();
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.util.Locale locale59 = java.util.Locale.JAPAN;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale59.toLanguageTag();
        java.lang.String str62 = locale59.getLanguage();
        int int63 = dateTimeField56.getMaximumTextLength(locale59);
        int int64 = dateTimeField29.getMaximumTextLength(locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField54", Math.signum(durationField27.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField27)));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField17, and durationField18", !(durationField22.compareTo(durationField17) == 0) || (Math.signum(durationField22.compareTo(durationField18)) == Math.signum(durationField17.compareTo(durationField18))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DurationField durationField20 = chronology16.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField20, and durationField19", !(durationField19.compareTo(durationField20) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField20.compareTo(durationField19))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DurationField durationField20 = chronology17.eras();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology23, locale32, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.weekOfWeekyear();
        org.joda.time.DurationField durationField40 = chronology38.hours();
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology38, locale41, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField44 = chronology38.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = chronology38.yearOfEra();
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = dateTimeField45.getAsText((int) (byte) 10, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((-2L), chronology17, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField40", Math.signum(durationField19.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField19)));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        org.joda.time.DurationField durationField29 = chronology25.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField29, and durationField27", !(durationField27.compareTo(durationField29) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField29.compareTo(durationField27))));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType21.getDurationType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        java.lang.String str45 = chronology41.toString();
        java.lang.String str46 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        org.joda.time.DurationField durationField48 = chronology41.months();
        org.joda.time.DurationField durationField49 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.year();
        org.joda.time.DurationField durationField51 = chronology41.months();
        org.joda.time.DurationField durationField52 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField42, and durationField48", !(durationField52.compareTo(durationField42) == 0) || (Math.signum(durationField52.compareTo(durationField48)) == Math.signum(durationField42.compareTo(durationField48))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology16.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField21, and durationField19", !(durationField19.compareTo(durationField21) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField21.compareTo(durationField19))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, 1L);
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder33 = builder31.setLocale(locale32);
        java.util.Locale locale35 = new java.util.Locale("China");
        java.util.Locale.Builder builder36 = builder33.setLocale(locale35);
        java.util.Locale.Builder builder38 = builder36.addUnicodeLocaleAttribute("French");
        java.util.Locale locale39 = builder36.build();
        java.lang.String str40 = locale39.getDisplayName();
        java.lang.String str41 = dateTimeField29.getAsText((int) 'x', locale39);
        boolean boolean42 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType46.getField(chronology47);
        boolean boolean49 = dateTimeField48.isLenient();
        org.joda.time.ReadablePartial readablePartial50 = null;
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str53 = locale52.getDisplayName();
        java.util.Locale locale54 = java.util.Locale.ITALY;
        java.lang.String str55 = locale54.getLanguage();
        java.lang.String str56 = locale52.getDisplayName(locale54);
        java.lang.String str57 = dateTimeField48.getAsText(readablePartial50, (int) 'x', locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology45, locale54, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        java.lang.String str61 = chronology60.toString();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.hourOfDay();
        int int65 = dateTimeField62.getDifference((long) 292278993, 0L);
        org.joda.time.ReadablePartial readablePartial66 = null;
        java.util.Locale locale68 = null;
        java.lang.String str69 = dateTimeField62.getAsShortText(readablePartial66, 1439, locale68);
        org.joda.time.ReadablePartial readablePartial70 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType71.getField(chronology72);
        int int75 = dateTimeField73.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField76 = dateTimeField73.getDurationField();
        int int78 = dateTimeField73.getMaximumValue((long) (short) 1);
        long long80 = dateTimeField73.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial81 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType82.getField(chronology83);
        int int86 = dateTimeField84.getLeapAmount((long) 0);
        int int88 = dateTimeField84.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial89 = null;
        int[] intArray94 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int95 = dateTimeField84.getMaximumValue(readablePartial89, intArray94);
        int int96 = dateTimeField73.getMinimumValue(readablePartial81, intArray94);
        int int97 = dateTimeField62.getMinimumValue(readablePartial70, intArray94);
        int int98 = dateTimeField29.getMaximumValue(readablePartial43, intArray94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField76", (durationField28.compareTo(durationField76) == 0) == durationField28.equals(durationField76));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfDay();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        boolean boolean43 = dateTimeFieldType21.isSupported(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology40.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField44", Math.signum(durationField42.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField42)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, 1L);
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        java.lang.String str31 = dateTimeField29.getAsText(2678400081L);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType32.getField(chronology33);
        int int36 = dateTimeField34.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField37 = dateTimeField34.getDurationField();
        int int39 = dateTimeField34.getMaximumValue((long) (short) 1);
        long long41 = dateTimeField34.roundHalfEven((long) ' ');
        int int43 = dateTimeField34.getMinimumValue((long) 100);
        int int44 = dateTimeField34.getMinimumValue();
        java.util.Locale locale49 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str50 = dateTimeField34.getAsShortText((int) '#', locale49);
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        int int54 = dateTimeField34.getMaximumShortTextLength(locale51);
        int int55 = dateTimeField29.getMaximumTextLength(locale51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField37", (durationField28.compareTo(durationField37) == 0) == durationField28.equals(durationField37));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology17, locale19, (java.lang.Integer) 1970);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology17.eras();
        org.joda.time.DurationField durationField24 = chronology17.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField23", Math.signum(durationField24.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField24)));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfWeek();
        org.joda.time.DurationField durationField21 = chronology16.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField21, and durationField18", !(durationField18.compareTo(durationField21) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField21.compareTo(durationField18))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3, (java.lang.Integer) 1);
        java.lang.Object obj6 = dateTimeParserBucket5.saveState();
        long long7 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj8 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        boolean boolean16 = dateTimeField15.isLenient();
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str20 = locale19.getDisplayName();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale19.getDisplayName(locale21);
        java.lang.String str24 = dateTimeField15.getAsText(readablePartial17, (int) 'x', locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology12, locale21, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = chronology27.hours();
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology27);
        org.joda.time.DurationField durationField31 = chronology27.seconds();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.lang.String str33 = locale32.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(2065L, chronology27, locale32);
        org.joda.time.DurationField durationField35 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField29, and durationField31", !(durationField35.compareTo(durationField29) == 0) || (Math.signum(durationField35.compareTo(durationField31)) == Math.signum(durationField29.compareTo(durationField31))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.dayOfYear();
        org.joda.time.DurationField durationField25 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField19, and durationField23", !(durationField29.compareTo(durationField19) == 0) || (Math.signum(durationField29.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField5 = dateTimeField2.getDurationField();
        int int7 = dateTimeField2.getMaximumValue((long) (short) 1);
        long long9 = dateTimeField2.roundHalfEven((long) ' ');
        int int11 = dateTimeField2.getMinimumValue((long) 100);
        long long14 = dateTimeField2.add(0L, (long) 0);
        long long16 = dateTimeField2.remainder((long) 10);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("DateTimeField[minuteOfDay]");
        java.util.Locale locale21 = new java.util.Locale("", "Chinese (China)");
        java.lang.String str22 = locale21.getDisplayScript();
        java.lang.String str23 = locale18.getDisplayName(locale21);
        int int24 = dateTimeField2.getMaximumTextLength(locale18);
        java.lang.String str25 = locale18.getDisplayVariant();
        java.lang.String str26 = locale18.getISO3Language();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        boolean boolean32 = dateTimeField31.isLenient();
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = locale35.getDisplayName(locale37);
        java.lang.String str40 = dateTimeField31.getAsText(readablePartial33, (int) 'x', locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology28, locale37, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfDay();
        org.joda.time.DurationField durationField45 = chronology43.eras();
        org.joda.time.Chronology chronology46 = chronology43.withUTC();
        boolean boolean47 = locale18.equals((java.lang.Object) chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField45", Math.signum(durationField5.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField5)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology18, locale21, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, 1L);
        long long30 = dateTimeZone25.adjustOffset(1L, true);
        long long32 = dateTimeZone25.convertUTCToLocal(0L);
        java.lang.String str34 = dateTimeZone25.getNameKey(0L);
        int int36 = dateTimeZone25.getOffset((long) 10);
        org.joda.time.Chronology chronology37 = chronology18.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.dayOfWeek();
        org.joda.time.DurationField durationField40 = chronology37.years();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.millisOfDay();
        org.joda.time.Chronology chronology42 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.millisOfSecond();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale.setDefault(locale44);
        java.lang.String str47 = locale44.getScript();
        java.util.Set<java.lang.String> strSet48 = locale44.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((-58979923200000L), chronology37, locale44, (java.lang.Integer) 8, 31);
        org.joda.time.DateTimeField dateTimeField52 = chronology37.weekyearOfCentury();
        org.joda.time.DurationField durationField53 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField20, and durationField40", !(durationField53.compareTo(durationField20) == 0) || (Math.signum(durationField53.compareTo(durationField40)) == Math.signum(durationField20.compareTo(durationField40))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField31 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField19, and durationField23", !(durationField31.compareTo(durationField19) == 0) || (Math.signum(durationField31.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField22 = chronology16.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField22, and durationField20", !(durationField20.compareTo(durationField22) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField22.compareTo(durationField20))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        boolean boolean33 = dateTimeField32.isLenient();
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = locale36.getDisplayName(locale38);
        java.lang.String str41 = dateTimeField32.getAsText(readablePartial34, (int) 'x', locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology29, locale38, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.seconds();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.getMillisKeepLocal(dateTimeZone50, 1L);
        boolean boolean53 = dateTimeZone50.isFixed();
        org.joda.time.Chronology chronology54 = chronology44.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DurationField durationField56 = chronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfEra();
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder61 = builder59.setLocale(locale60);
        java.util.Locale locale63 = new java.util.Locale("China");
        java.util.Locale.Builder builder64 = builder61.setLocale(locale63);
        java.util.Locale.Builder builder66 = builder64.addUnicodeLocaleAttribute("French");
        java.util.Locale locale67 = builder64.build();
        java.lang.String str68 = locale67.getDisplayName();
        java.lang.String str69 = dateTimeField57.getAsText((int) 'x', locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(6048000052L, chronology27, locale67, (java.lang.Integer) 19, (-4200000));
        org.joda.time.DurationField durationField73 = chronology27.hours();
        org.joda.time.DurationField durationField74 = chronology27.centuries();
        org.joda.time.DurationField durationField75 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField76 = chronology27.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField56 and durationField75", (durationField56.compareTo(durationField75) == 0) == durationField56.equals(durationField75));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField24", Math.signum(durationField19.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField19)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long11 = dateTimeZone9.convertUTCToLocal(3061065600000L);
        org.joda.time.Chronology chronology12 = chronology7.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField13 = chronology7.millis();
        org.joda.time.DurationField durationField14 = chronology7.eras();
        org.joda.time.DurationField durationField15 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale40, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology18.dayOfWeek();
        java.lang.String str46 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField47 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology18.minutes();
        org.joda.time.DurationField durationField50 = chronology18.centuries();
        org.joda.time.DurationField durationField51 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField20, and durationField49", !(durationField51.compareTo(durationField20) == 0) || (Math.signum(durationField51.compareTo(durationField49)) == Math.signum(durationField20.compareTo(durationField49))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType1.getField(chronology18);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale24, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone30.getMillisKeepLocal(dateTimeZone31, 1L);
        int int35 = dateTimeZone30.getOffsetFromLocal((long) (short) 0);
        boolean boolean37 = dateTimeZone30.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology38 = chronology18.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField39 = chronology18.seconds();
        org.joda.time.DurationField durationField40 = chronology18.millis();
        org.joda.time.DurationField durationField41 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField19, and durationField40", !(durationField41.compareTo(durationField19) == 0) || (Math.signum(durationField41.compareTo(durationField40)) == Math.signum(durationField19.compareTo(durationField40))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField26 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField19, and durationField23", !(durationField26.compareTo(durationField19) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.seconds();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType0.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.weekyear();
        org.joda.time.DurationField durationField47 = chronology40.weeks();
        org.joda.time.DurationField durationField48 = chronology40.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField18, and durationField22", !(durationField48.compareTo(durationField18) == 0) || (Math.signum(durationField48.compareTo(durationField22)) == Math.signum(durationField18.compareTo(durationField22))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        long long30 = dateTimeField28.roundHalfFloor((-62104060799990L));
        long long32 = dateTimeField28.roundHalfCeiling(10L);
        long long35 = dateTimeField28.set(15604999L, 35);
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType41.getField(chronology42);
        boolean boolean44 = dateTimeField43.isLenient();
        org.joda.time.ReadablePartial readablePartial45 = null;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str48 = locale47.getDisplayName();
        java.util.Locale locale49 = java.util.Locale.ITALY;
        java.lang.String str50 = locale49.getLanguage();
        java.lang.String str51 = locale47.getDisplayName(locale49);
        java.lang.String str52 = dateTimeField43.getAsText(readablePartial45, (int) 'x', locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology40, locale49, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology55 = dateTimeParserBucket54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.weekOfWeekyear();
        org.joda.time.DurationField durationField57 = chronology55.weekyears();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = dateTimeField59.getType();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType63.getField(chronology64);
        boolean boolean66 = dateTimeField65.isLenient();
        org.joda.time.ReadablePartial readablePartial67 = null;
        java.util.Locale locale69 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str70 = locale69.getDisplayName();
        java.util.Locale locale71 = java.util.Locale.ITALY;
        java.lang.String str72 = locale71.getLanguage();
        java.lang.String str73 = locale69.getDisplayName(locale71);
        java.lang.String str74 = dateTimeField65.getAsText(readablePartial67, (int) 'x', locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology62, locale71, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology77 = dateTimeParserBucket76.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.weekOfWeekyear();
        org.joda.time.DurationField durationField79 = chronology77.weekyears();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.millisOfDay();
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType60.getField(chronology77);
        java.util.Locale locale86 = new java.util.Locale("DateTimeField[millisOfSecond]", "Italy", "halfdayOfDay");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket(439L, chronology77, locale86, (java.lang.Integer) 35, (-3600000));
        java.util.Locale locale90 = locale86.stripExtensions();
        java.lang.String str91 = dateTimeField28.getAsShortText(readablePartial36, 24, locale90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField57", Math.signum(durationField27.compareTo(durationField57)) == -Math.signum(durationField57.compareTo(durationField27)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DurationField durationField28 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField30 = chronology26.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField30, and durationField27", !(durationField27.compareTo(durationField30) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField30.compareTo(durationField27))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField21 = chronology16.weekyears();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology16.add(readablePeriod22, 1344L, 4);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField17, and durationField21", !(durationField27.compareTo(durationField17) == 0) || (Math.signum(durationField27.compareTo(durationField21)) == Math.signum(durationField17.compareTo(durationField21))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField29 = chronology17.hours();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = chronology17.add(readablePeriod30, (-1869L), 115200000);
        org.joda.time.DurationField durationField34 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField19, and durationField23", !(durationField34.compareTo(durationField19) == 0) || (Math.signum(durationField34.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField24", Math.signum(durationField17.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField17)));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.weekyear();
        java.util.Locale locale25 = new java.util.Locale("GBR", "weekOfWeekyear", "");
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder28 = builder26.setLocale(locale27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        int int33 = dateTimeField31.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField34 = dateTimeField31.getDurationField();
        int int36 = dateTimeField31.getMaximumValue((long) (short) 1);
        long long38 = dateTimeField31.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder41.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder45 = builder41.clearExtensions();
        java.util.Locale locale46 = builder45.build();
        java.lang.String str47 = dateTimeField31.getAsShortText(readablePartial39, (int) (byte) 100, locale46);
        java.util.Set<java.lang.String> strSet48 = locale46.getUnicodeLocaleKeys();
        java.lang.String str49 = locale27.getDisplayName(locale46);
        java.util.Locale locale53 = new java.util.Locale("zh", "weekyear", "en_US");
        java.lang.String str54 = locale27.getDisplayName(locale53);
        java.lang.String str55 = locale25.getDisplayScript(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(62577446400000L, chronology17, locale25);
        org.joda.time.DurationField durationField57 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField57, durationField20, and durationField34", !(durationField57.compareTo(durationField20) == 0) || (Math.signum(durationField57.compareTo(durationField34)) == Math.signum(durationField20.compareTo(durationField34))));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType21.getDurationType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        java.lang.String str45 = chronology41.toString();
        java.lang.String str46 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        org.joda.time.DurationField durationField48 = chronology41.months();
        org.joda.time.DurationField durationField49 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.year();
        org.joda.time.DurationField durationField51 = chronology41.months();
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        long long55 = dateTimeZone53.convertUTCToLocal(31536000116L);
        org.joda.time.Chronology chronology56 = chronology41.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField57 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField57, durationField42, and durationField48", !(durationField57.compareTo(durationField42) == 0) || (Math.signum(durationField57.compareTo(durationField48)) == Math.signum(durationField42.compareTo(durationField48))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean9 = dateTimeField8.isLenient();
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = dateTimeField8.getAsText(readablePartial10, (int) 'x', locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology5, locale14, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.seconds();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType3.getField(chronology20);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology25, locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology20, locale26, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone32.getMillisKeepLocal(dateTimeZone33, 1L);
        int int37 = dateTimeZone32.getOffsetFromLocal((long) (short) 0);
        boolean boolean39 = dateTimeZone32.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology40 = chronology20.withZone(dateTimeZone32);
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("china");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(4200000L, chronology20, locale42);
        org.joda.time.DateTimeField dateTimeField44 = chronology20.year();
        org.joda.time.DurationField durationField45 = chronology20.eras();
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 292278993, chronology20, locale46, (java.lang.Integer) 10, 292320000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField45", Math.signum(durationField21.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField21)));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.hourOfDay();
        boolean boolean26 = dateTimeField25.isSupported();
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        boolean boolean34 = dateTimeField33.isLenient();
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str38 = locale37.getDisplayName();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = locale39.getLanguage();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = dateTimeField33.getAsText(readablePartial35, (int) 'x', locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology30, locale39, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.weekOfWeekyear();
        org.joda.time.DurationField durationField47 = chronology45.hours();
        java.util.Locale locale48 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology45, locale48, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField51 = chronology45.months();
        org.joda.time.DateTimeField dateTimeField52 = chronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = chronology45.centuries();
        org.joda.time.DurationField durationField54 = chronology45.years();
        org.joda.time.DateTimeField dateTimeField55 = chronology45.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial56 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType57.getField(chronology58);
        int int61 = dateTimeField59.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField62 = dateTimeField59.getDurationField();
        int int64 = dateTimeField59.getMaximumValue((long) (short) 1);
        org.joda.time.ReadablePartial readablePartial65 = null;
        int[] intArray70 = new int[] { (byte) 100, 0, '4', (short) 1 };
        int int71 = dateTimeField59.getMaximumValue(readablePartial65, intArray70);
        int int72 = dateTimeField55.getMinimumValue(readablePartial56, intArray70);
        int int73 = dateTimeField25.getMinimumValue(readablePartial27, intArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField54 and durationField62", (durationField54.compareTo(durationField62) == 0) == durationField54.equals(durationField62));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField5 = dateTimeField2.getDurationField();
        int int7 = dateTimeField2.getMaximumValue((long) (short) 1);
        long long9 = dateTimeField2.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder16 = builder12.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        java.lang.String str18 = dateTimeField2.getAsShortText(readablePartial10, (int) (byte) 100, locale17);
        long long20 = dateTimeField2.roundHalfEven((long) '#');
        int int21 = dateTimeField2.getMinimumValue();
        java.lang.String str22 = dateTimeField2.toString();
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        boolean boolean31 = dateTimeField30.isLenient();
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str35 = locale34.getDisplayName();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = locale36.getLanguage();
        java.lang.String str38 = locale34.getDisplayName(locale36);
        java.lang.String str39 = dateTimeField30.getAsText(readablePartial32, (int) 'x', locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology27, locale36, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.hourOfDay();
        org.joda.time.DurationField durationField44 = chronology42.eras();
        org.joda.time.DurationField durationField45 = chronology42.eras();
        java.util.Locale locale47 = new java.util.Locale("yearOfEra");
        java.lang.String str48 = locale47.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(1982L, chronology42, locale47, (java.lang.Integer) 1);
        java.lang.String str51 = dateTimeField2.getAsText(readablePartial23, 53, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField44", Math.signum(durationField5.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField5)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField19, and durationField23", !(durationField28.compareTo(durationField19) == 0) || (Math.signum(durationField28.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField40 = chronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int44 = dateTimeZone42.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.lang.String str50 = dateTimeZone42.getShortName((long) 100, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(4200010L, chronology19, locale47, (java.lang.Integer) 366, 99);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long59 = dateTimeZone56.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType61.getField(chronology62);
        int int65 = dateTimeField63.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField66 = dateTimeField63.getDurationField();
        int int68 = dateTimeField63.getMaximumValue((long) (short) 1);
        long long70 = dateTimeField63.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale.Builder builder73 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder76 = builder73.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder77 = builder73.clearExtensions();
        java.util.Locale locale78 = builder77.build();
        java.lang.String str79 = dateTimeField63.getAsShortText(readablePartial71, (int) (byte) 100, locale78);
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleKeys();
        java.lang.String str81 = dateTimeZone56.getShortName((long) 1970, locale78);
        long long84 = dateTimeZone56.adjustOffset(3061065600000L, true);
        long long87 = dateTimeZone56.adjustOffset(127L, false);
        long long90 = dateTimeZone56.convertLocalToUTC(7200999L, true);
        org.joda.time.Chronology chronology91 = chronology19.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField92 = chronology91.halfdayOfDay();
        org.joda.time.DurationField durationField93 = chronology91.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField20, and durationField66", !(durationField93.compareTo(durationField20) == 0) || (Math.signum(durationField93.compareTo(durationField66)) == Math.signum(durationField20.compareTo(durationField66))));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DurationField durationField21 = chronology16.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.weekOfWeekyear();
        org.joda.time.DurationField durationField42 = chronology40.weekyears();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType23.getField(chronology40);
        java.util.Locale locale49 = new java.util.Locale("DateTimeField[millisOfSecond]", "Italy", "halfdayOfDay");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(439L, chronology40, locale49, (java.lang.Integer) 35, (-3600000));
        org.joda.time.DateTimeField dateTimeField53 = chronology40.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        int int58 = dateTimeField56.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField59 = dateTimeField56.getDurationField();
        int int61 = dateTimeField56.getMaximumValue((long) (short) 1);
        long long63 = dateTimeField56.roundHalfEven((long) ' ');
        int int65 = dateTimeField56.getMinimumValue((long) 100);
        long long68 = dateTimeField56.add(0L, (long) 0);
        long long70 = dateTimeField56.remainder((long) 10);
        java.util.Locale locale72 = java.util.Locale.forLanguageTag("DateTimeField[minuteOfDay]");
        java.util.Locale locale75 = new java.util.Locale("", "Chinese (China)");
        java.lang.String str76 = locale75.getDisplayScript();
        java.lang.String str77 = locale72.getDisplayName(locale75);
        int int78 = dateTimeField56.getMaximumTextLength(locale72);
        java.lang.String str79 = locale72.getDisplayVariant();
        java.lang.String str80 = locale72.getISO3Language();
        java.util.Locale locale81 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet82 = locale81.getUnicodeLocaleKeys();
        java.lang.String str83 = locale72.getDisplayLanguage(locale81);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket(43200009L, chronology40, locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField59", (durationField20.compareTo(durationField59) == 0) == durationField20.equals(durationField59));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        dateTimeParserBucket30.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType36.getField(chronology37);
        boolean boolean39 = dateTimeField38.isLenient();
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str43 = locale42.getDisplayName();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        java.lang.String str45 = locale44.getLanguage();
        java.lang.String str46 = locale42.getDisplayName(locale44);
        java.lang.String str47 = dateTimeField38.getAsText(readablePartial40, (int) 'x', locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology35, locale44, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.weekOfWeekyear();
        org.joda.time.DurationField durationField52 = chronology50.hours();
        java.util.Locale locale53 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology50, locale53, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField56 = chronology50.months();
        org.joda.time.DateTimeField dateTimeField57 = chronology50.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = chronology50.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField59 = chronology50.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone60.getMillisKeepLocal(dateTimeZone61, 1L);
        long long65 = dateTimeZone61.previousTransition(0L);
        org.joda.time.Chronology chronology66 = chronology50.withZone(dateTimeZone61);
        boolean boolean67 = dateTimeParserBucket30.restoreState((java.lang.Object) chronology50);
        java.util.Locale locale68 = java.util.Locale.ROOT;
        java.lang.String str69 = locale68.getISO3Language();
        java.util.Locale.setDefault(locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(360000000L, chronology50, locale68, (java.lang.Integer) 2922789, 53);
        org.joda.time.DurationField durationField74 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField20, and durationField52", !(durationField74.compareTo(durationField20) == 0) || (Math.signum(durationField74.compareTo(durationField52)) == Math.signum(durationField20.compareTo(durationField52))));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.util.Locale locale18 = java.util.Locale.UK;
        dateTimeParserBucket15.saveField(dateTimeFieldType16, "Chinese (China)", locale18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean25 = dateTimeField24.isLenient();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale28.getDisplayName();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale28.getDisplayName(locale30);
        java.lang.String str33 = dateTimeField24.getAsText(readablePartial26, (int) 'x', locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale30, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.seconds();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType16.getField(chronology36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        java.lang.String str59 = chronology58.toString();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfDay();
        org.joda.time.DurationField durationField61 = chronology58.centuries();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long67 = dateTimeZone64.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType69.getField(chronology70);
        int int73 = dateTimeField71.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField74 = dateTimeField71.getDurationField();
        int int76 = dateTimeField71.getMaximumValue((long) (short) 1);
        long long78 = dateTimeField71.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial79 = null;
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder84 = builder81.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder85 = builder81.clearExtensions();
        java.util.Locale locale86 = builder85.build();
        java.lang.String str87 = dateTimeField71.getAsShortText(readablePartial79, (int) (byte) 100, locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleKeys();
        java.lang.String str89 = dateTimeZone64.getShortName((long) 1970, locale86);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket(0L, chronology58, locale86);
        org.joda.time.DateTimeField dateTimeField91 = chronology58.weekyear();
        org.joda.time.DateTimeField dateTimeField92 = chronology58.millisOfSecond();
        boolean boolean93 = dateTimeFieldType16.isSupported(chronology58);
        org.joda.time.DateTimeZone dateTimeZone94 = chronology58.getZone();
        org.joda.time.DateTimeField dateTimeField95 = chronology58.secondOfMinute();
        org.joda.time.DurationField durationField96 = chronology58.weekyears();
        org.joda.time.DateTimeZone dateTimeZone97 = chronology58.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField96", (durationField74.compareTo(durationField96) == 0) == durationField74.equals(durationField96));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.era();
        org.joda.time.DurationField durationField30 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField19, and durationField23", !(durationField30.compareTo(durationField19) == 0) || (Math.signum(durationField30.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.getMillisKeepLocal(dateTimeZone24, 1L);
        long long29 = dateTimeZone24.adjustOffset(1L, true);
        long long31 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.String str33 = dateTimeZone24.getNameKey(0L);
        int int35 = dateTimeZone24.getOffset((long) 10);
        org.joda.time.Chronology chronology36 = chronology17.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField39 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.millisOfDay();
        org.joda.time.DurationField durationField41 = chronology36.days();
        org.joda.time.Chronology chronology42 = chronology36.withUTC();
        org.joda.time.DurationField durationField43 = chronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField19, and durationField39", !(durationField43.compareTo(durationField19) == 0) || (Math.signum(durationField43.compareTo(durationField39)) == Math.signum(durationField19.compareTo(durationField39))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.dayOfYear();
        org.joda.time.DurationField durationField25 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField19, and durationField23", !(durationField27.compareTo(durationField19) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology20, locale21, (java.lang.Integer) 1);
        java.lang.Object obj24 = dateTimeParserBucket23.saveState();
        long long25 = dateTimeParserBucket23.computeMillis();
        java.lang.Object obj26 = dateTimeParserBucket23.saveState();
        dateTimeParserBucket23.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket23.setOffset((int) (byte) 100);
        dateTimeParserBucket23.setOffset(421200000);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        long long36 = dateTimeZone33.getMillisKeepLocal(dateTimeZone34, 1L);
        int int38 = dateTimeZone33.getOffsetFromLocal((long) (short) 0);
        dateTimeParserBucket23.setZone(dateTimeZone33);
        org.joda.time.Chronology chronology40 = chronology16.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField41 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField42 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField44 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField18, and durationField42", !(durationField44.compareTo(durationField18) == 0) || (Math.signum(durationField44.compareTo(durationField42)) == Math.signum(durationField18.compareTo(durationField42))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale40, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology18.dayOfWeek();
        java.lang.String str46 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField47 = chronology18.monthOfYear();
        org.joda.time.DurationField durationField48 = chronology18.weeks();
        org.joda.time.DurationField durationField49 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology18.hourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField20, and durationField48", !(durationField52.compareTo(durationField20) == 0) || (Math.signum(durationField52.compareTo(durationField48)) == Math.signum(durationField20.compareTo(durationField48))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField24", Math.signum(durationField19.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField19)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.millis();
        boolean boolean43 = dateTimeFieldType17.isSupported(chronology41);
        org.joda.time.DurationField durationField44 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField44", Math.signum(durationField42.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField42)));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology18.getZone();
        boolean boolean21 = dateTimeFieldType1.isSupported(chronology18);
        org.joda.time.DurationField durationField22 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, 1L);
        int int30 = dateTimeZone25.getOffsetFromLocal((long) (short) 0);
        int int32 = dateTimeZone25.getOffsetFromLocal(4200000L);
        boolean boolean34 = dateTimeZone25.isStandardOffset((long) 1439);
        boolean boolean36 = dateTimeZone25.isStandardOffset(4L);
        org.joda.time.Chronology chronology37 = chronology18.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekOfWeekyear();
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale40.getDisplayVariant(locale41);
        java.lang.String str43 = locale40.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology37, locale40);
        org.joda.time.DurationField durationField45 = chronology37.years();
        long long49 = chronology37.add((long) 12, 0L, 3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField45", (durationField38.compareTo(durationField45) == 0) == durationField38.equals(durationField45));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology17.months();
        java.lang.String str30 = chronology17.toString();
        org.joda.time.DurationField durationField31 = chronology17.days();
        org.joda.time.DurationField durationField32 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField19, and durationField23", !(durationField32.compareTo(durationField19) == 0) || (Math.signum(durationField32.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        boolean boolean10 = dateTimeField9.isLenient();
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale13.getDisplayName(locale15);
        java.lang.String str18 = dateTimeField9.getAsText(readablePartial11, (int) 'x', locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology6, locale15, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType4.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType0.getField(chronology21);
        org.joda.time.DurationField durationField27 = chronology21.eras();
        java.lang.String str28 = chronology21.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField27", Math.signum(durationField22.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField22)));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.Object obj49 = dateTimeParserBucket48.saveState();
        long long50 = dateTimeParserBucket48.computeMillis();
        java.lang.Object obj51 = dateTimeParserBucket48.saveState();
        dateTimeParserBucket48.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology55 = chronology17.withZone(dateTimeZone54);
        java.lang.String str57 = dateTimeZone54.getNameKey(967766400010L);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType60.getField(chronology61);
        boolean boolean63 = dateTimeField62.isLenient();
        org.joda.time.ReadablePartial readablePartial64 = null;
        java.util.Locale locale66 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str67 = locale66.getDisplayName();
        java.util.Locale locale68 = java.util.Locale.ITALY;
        java.lang.String str69 = locale68.getLanguage();
        java.lang.String str70 = locale66.getDisplayName(locale68);
        java.lang.String str71 = dateTimeField62.getAsText(readablePartial64, (int) 'x', locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology59, locale68, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology74 = dateTimeParserBucket73.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.hourOfDay();
        org.joda.time.DurationField durationField76 = chronology74.eras();
        org.joda.time.Chronology chronology77 = chronology74.withUTC();
        boolean boolean78 = dateTimeZone54.equals((java.lang.Object) chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField76", Math.signum(durationField19.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField19)));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale43 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology41, locale43, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        java.lang.String str48 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField49 = chronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.weekyear();
        org.joda.time.DurationField durationField51 = chronology41.eras();
        org.joda.time.DurationField durationField52 = chronology41.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField52, and durationField51", !(durationField51.compareTo(durationField52) == 0) || (Math.signum(durationField51.compareTo(durationField51)) == Math.signum(durationField52.compareTo(durationField51))));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DurationField durationField22 = chronology16.centuries();
        org.joda.time.Chronology chronology23 = chronology16.withUTC();
        org.joda.time.DurationField durationField24 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.clockhourOfHalfday();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        boolean boolean33 = dateTimeField32.isLenient();
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = locale36.getDisplayName(locale38);
        java.lang.String str41 = dateTimeField32.getAsText(readablePartial34, (int) 'x', locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology29, locale38, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = chronology44.hours();
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology44, locale47, (java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField50 = chronology44.hourOfDay();
        org.joda.time.DurationField durationField51 = chronology44.years();
        org.joda.time.DateTimeField dateTimeField52 = chronology44.millisOfDay();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getDisplayName();
        java.lang.String str55 = locale53.getDisplayCountry();
        java.lang.String str56 = locale53.getScript();
        java.lang.String str57 = locale53.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((-54L), chronology44, locale53);
        int int59 = dateTimeField25.getMaximumShortTextLength(locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField51", (durationField24.compareTo(durationField51) == 0) == durationField24.equals(durationField51));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        dateTimeParserBucket4.saveField(dateTimeFieldType9, "zh_CN", locale13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        boolean boolean21 = dateTimeField20.isLenient();
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str25 = locale24.getDisplayName();
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.lang.String str27 = locale26.getLanguage();
        java.lang.String str28 = locale24.getDisplayName(locale26);
        java.lang.String str29 = dateTimeField20.getAsText(readablePartial22, (int) 'x', locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology17, locale26, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekOfWeekyear();
        org.joda.time.DurationField durationField34 = chronology32.hours();
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder37 = builder35.setLocale(locale36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        boolean boolean41 = dateTimeField40.isLenient();
        org.joda.time.ReadablePartial readablePartial42 = null;
        java.util.Locale locale44 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str45 = locale44.getDisplayName();
        java.util.Locale locale46 = java.util.Locale.ITALY;
        java.lang.String str47 = locale46.getLanguage();
        java.lang.String str48 = locale44.getDisplayName(locale46);
        java.lang.String str49 = dateTimeField40.getAsText(readablePartial42, (int) 'x', locale46);
        java.lang.String str50 = locale36.getDisplayLanguage(locale46);
        java.lang.String str51 = locale36.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology32, locale36);
        org.joda.time.DurationField durationField53 = chronology32.years();
        org.joda.time.DateTimeField dateTimeField54 = chronology32.dayOfMonth();
        long long58 = chronology32.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology60, locale61, (java.lang.Integer) 1);
        java.lang.Object obj64 = dateTimeParserBucket63.saveState();
        long long65 = dateTimeParserBucket63.computeMillis();
        java.lang.Object obj66 = dateTimeParserBucket63.saveState();
        dateTimeParserBucket63.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket63.getZone();
        org.joda.time.Chronology chronology70 = chronology32.withZone(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField71 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField72 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone73 = chronology32.getZone();
        boolean boolean74 = dateTimeFieldType9.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField75 = chronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField76 = chronology32.dayOfWeek();
        org.joda.time.DurationField durationField77 = chronology32.years();
        org.joda.time.DurationField durationField78 = chronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField78, durationField34, and durationField53", !(durationField78.compareTo(durationField34) == 0) || (Math.signum(durationField78.compareTo(durationField53)) == Math.signum(durationField34.compareTo(durationField53))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField35 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField19, and durationField23", !(durationField35.compareTo(durationField19) == 0) || (Math.signum(durationField35.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone27.getMillisKeepLocal(dateTimeZone28, 1L);
        long long32 = dateTimeZone28.previousTransition(0L);
        org.joda.time.Chronology chronology33 = chronology17.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField34 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField35 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField19, and durationField23", !(durationField35.compareTo(durationField19) == 0) || (Math.signum(durationField35.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        org.joda.time.DurationField durationField9 = chronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.weekyear();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.DurationField durationField33 = chronology27.years();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology35, locale36, (java.lang.Integer) 1);
        java.lang.Object obj39 = dateTimeParserBucket38.saveState();
        long long40 = dateTimeParserBucket38.computeMillis();
        org.joda.time.Chronology chronology41 = dateTimeParserBucket38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int45 = dateTimeZone43.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.util.Set<java.lang.String> strSet50 = locale48.getUnicodeLocaleKeys();
        java.lang.String str51 = dateTimeZone43.getShortName((long) 100, locale48);
        dateTimeParserBucket38.setZone(dateTimeZone43);
        java.lang.Integer int53 = dateTimeParserBucket38.getPivotYear();
        java.lang.Integer int54 = dateTimeParserBucket38.getOffsetInteger();
        java.util.Locale locale55 = dateTimeParserBucket38.getLocale();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType59.getField(chronology60);
        boolean boolean62 = dateTimeField61.isLenient();
        org.joda.time.ReadablePartial readablePartial63 = null;
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str66 = locale65.getDisplayName();
        java.util.Locale locale67 = java.util.Locale.ITALY;
        java.lang.String str68 = locale67.getLanguage();
        java.lang.String str69 = locale65.getDisplayName(locale67);
        java.lang.String str70 = dateTimeField61.getAsText(readablePartial63, (int) 'x', locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology58, locale67, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology73 = dateTimeParserBucket72.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.weekOfWeekyear();
        org.joda.time.DurationField durationField75 = chronology73.hours();
        java.util.Locale.Builder builder76 = new java.util.Locale.Builder();
        java.util.Locale locale77 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder78 = builder76.setLocale(locale77);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType79.getField(chronology80);
        boolean boolean82 = dateTimeField81.isLenient();
        org.joda.time.ReadablePartial readablePartial83 = null;
        java.util.Locale locale85 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str86 = locale85.getDisplayName();
        java.util.Locale locale87 = java.util.Locale.ITALY;
        java.lang.String str88 = locale87.getLanguage();
        java.lang.String str89 = locale85.getDisplayName(locale87);
        java.lang.String str90 = dateTimeField81.getAsText(readablePartial83, (int) 'x', locale87);
        java.lang.String str91 = locale77.getDisplayLanguage(locale87);
        java.lang.String str92 = locale77.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology73, locale77);
        java.lang.String str94 = locale55.getDisplayCountry(locale77);
        java.util.Set<java.lang.Character> charSet95 = locale77.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket97 = new org.joda.time.format.DateTimeParserBucket(15604999L, chronology27, locale77, (java.lang.Integer) 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField33", (durationField29.compareTo(durationField33) == 0) == durationField29.equals(durationField33));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology17.millis();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology22, locale31, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.util.Locale locale39 = java.util.Locale.UK;
        dateTimeParserBucket36.saveField(dateTimeFieldType37, "Chinese (China)", locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'x', chronology17, locale39, (java.lang.Integer) 12, 100);
        org.joda.time.DateTimeField dateTimeField44 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField45 = chronology17.era();
        org.joda.time.DurationField durationField46 = chronology17.minutes();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = chronology17.add(readablePeriod47, 4039374720031L, (-4200000));
        org.joda.time.DurationField durationField51 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField20, and durationField46", !(durationField51.compareTo(durationField20) == 0) || (Math.signum(durationField51.compareTo(durationField46)) == Math.signum(durationField20.compareTo(durationField46))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField40 = chronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int44 = dateTimeZone42.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.lang.String str50 = dateTimeZone42.getShortName((long) 100, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(4200010L, chronology19, locale47, (java.lang.Integer) 366, 99);
        org.joda.time.DurationField durationField54 = chronology19.millis();
        org.joda.time.DurationField durationField55 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField20, and durationField54", !(durationField55.compareTo(durationField20) == 0) || (Math.signum(durationField55.compareTo(durationField54)) == Math.signum(durationField20.compareTo(durationField54))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        boolean boolean23 = locale22.hasExtensions();
        java.lang.String str24 = locale22.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology17, locale22, (java.lang.Integer) 4, 1970);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = chronology17.add(readablePeriod28, 1009843200012L, (-4200000));
        org.joda.time.DurationField durationField32 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField18, and durationField21", !(durationField32.compareTo(durationField18) == 0) || (Math.signum(durationField32.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        boolean boolean33 = dateTimeField32.isLenient();
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = locale36.getDisplayName(locale38);
        java.lang.String str41 = dateTimeField32.getAsText(readablePartial34, (int) 'x', locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology29, locale38, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.seconds();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.getMillisKeepLocal(dateTimeZone50, 1L);
        boolean boolean53 = dateTimeZone50.isFixed();
        org.joda.time.Chronology chronology54 = chronology44.withZone(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DurationField durationField56 = chronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfEra();
        java.util.Locale.Builder builder59 = new java.util.Locale.Builder();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder61 = builder59.setLocale(locale60);
        java.util.Locale locale63 = new java.util.Locale("China");
        java.util.Locale.Builder builder64 = builder61.setLocale(locale63);
        java.util.Locale.Builder builder66 = builder64.addUnicodeLocaleAttribute("French");
        java.util.Locale locale67 = builder64.build();
        java.lang.String str68 = locale67.getDisplayName();
        java.lang.String str69 = dateTimeField57.getAsText((int) 'x', locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(6048000052L, chronology27, locale67, (java.lang.Integer) 19, (-4200000));
        org.joda.time.DateTimeField dateTimeField73 = chronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = chronology27.millisOfSecond();
        org.joda.time.DurationField durationField75 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField75, durationField18, and durationField56", !(durationField75.compareTo(durationField18) == 0) || (Math.signum(durationField75.compareTo(durationField56)) == Math.signum(durationField18.compareTo(durationField56))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = chronology16.hours();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField19, and durationField21", !(durationField22.compareTo(durationField19) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField19.compareTo(durationField21))));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        boolean boolean29 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology33, locale34, (java.lang.Integer) 1);
        java.lang.Object obj37 = dateTimeParserBucket36.saveState();
        long long38 = dateTimeParserBucket36.computeMillis();
        java.lang.Object obj39 = dateTimeParserBucket36.saveState();
        dateTimeParserBucket36.setOffset((java.lang.Integer) 1);
        java.lang.Integer int42 = dateTimeParserBucket36.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.String str46 = dateTimeZone44.getName((long) (-1));
        dateTimeParserBucket36.setZone(dateTimeZone44);
        org.joda.time.Chronology chronology48 = chronology26.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.hourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfHour();
        org.joda.time.DurationField durationField51 = chronology48.eras();
        org.joda.time.DurationField durationField52 = chronology48.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField51", Math.signum(durationField28.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField28)));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DateTimeField dateTimeField38 = chronology17.minuteOfHour();
        org.joda.time.Chronology chronology39 = chronology17.withUTC();
        java.lang.String str40 = chronology39.toString();
        org.joda.time.DurationField durationField41 = chronology39.weekyears();
        org.joda.time.DurationField durationField42 = chronology39.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology39.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField19, and durationField41", !(durationField44.compareTo(durationField19) == 0) || (Math.signum(durationField44.compareTo(durationField41)) == Math.signum(durationField19.compareTo(durationField41))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        int int28 = dateTimeField26.getLeapAmount((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        int int34 = dateTimeField32.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField35 = dateTimeField32.getDurationField();
        int int37 = dateTimeField32.getMaximumValue((long) (short) 1);
        long long39 = dateTimeField32.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder42.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder46 = builder42.clearExtensions();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = dateTimeField32.getAsShortText(readablePartial40, (int) (byte) 100, locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet50 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str51 = dateTimeField26.getAsText((int) 'u', locale47);
        java.lang.String str53 = locale47.getExtension('a');
        int int54 = dateTimeField23.getMaximumTextLength(locale47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        int int56 = dateTimeField23.getMaximumValue(readablePartial55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField35", (durationField21.compareTo(durationField35) == 0) == durationField21.equals(durationField35));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology17, locale19, (java.lang.Integer) 1970);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField23 = dateTimeField22.getRangeDurationField();
        java.lang.String str24 = dateTimeField22.toString();
        org.joda.time.ReadablePartial readablePartial25 = null;
        int int26 = dateTimeField22.getMaximumValue(readablePartial25);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        long long32 = dateTimeField30.roundHalfEven((long) 10);
        long long34 = dateTimeField30.roundHalfEven(120001L);
        org.joda.time.DurationField durationField35 = dateTimeField30.getRangeDurationField();
        org.joda.time.ReadablePartial readablePartial36 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        boolean boolean40 = dateTimeField39.isLenient();
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str44 = locale43.getDisplayName();
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale43.getDisplayName(locale45);
        java.lang.String str48 = dateTimeField39.getAsText(readablePartial41, (int) 'x', locale45);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        int int54 = dateTimeField52.getLeapAmount((long) 0);
        int int56 = dateTimeField52.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial57 = null;
        int[] intArray62 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int63 = dateTimeField52.getMaximumValue(readablePartial57, intArray62);
        org.joda.time.ReadablePartial readablePartial64 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType65.getField(chronology66);
        int int69 = dateTimeField67.getLeapAmount((long) 0);
        int int71 = dateTimeField67.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial72 = null;
        int[] intArray77 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int78 = dateTimeField67.getMaximumValue(readablePartial72, intArray77);
        int int79 = dateTimeField52.getMinimumValue(readablePartial64, intArray77);
        int int80 = dateTimeField39.getMaximumValue(readablePartial49, intArray77);
        int int81 = dateTimeField30.getMinimumValue(readablePartial36, intArray77);
        int int82 = dateTimeField22.getMinimumValue(readablePartial27, intArray77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField35", (durationField18.compareTo(durationField35) == 0) == durationField18.equals(durationField35));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField24", Math.signum(durationField19.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField19)));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        java.lang.String str42 = chronology41.toString();
        org.joda.time.DurationField durationField43 = chronology41.seconds();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType47.getField(chronology48);
        boolean boolean50 = dateTimeField49.isLenient();
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getDisplayName();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.lang.String str56 = locale55.getLanguage();
        java.lang.String str57 = locale53.getDisplayName(locale55);
        java.lang.String str58 = dateTimeField49.getAsText(readablePartial51, (int) 'x', locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology46, locale55, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.weekOfWeekyear();
        org.joda.time.DurationField durationField63 = chronology61.hours();
        java.util.Locale.Builder builder64 = new java.util.Locale.Builder();
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder66 = builder64.setLocale(locale65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType67.getField(chronology68);
        boolean boolean70 = dateTimeField69.isLenient();
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale locale73 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str74 = locale73.getDisplayName();
        java.util.Locale locale75 = java.util.Locale.ITALY;
        java.lang.String str76 = locale75.getLanguage();
        java.lang.String str77 = locale73.getDisplayName(locale75);
        java.lang.String str78 = dateTimeField69.getAsText(readablePartial71, (int) 'x', locale75);
        java.lang.String str79 = locale65.getDisplayLanguage(locale75);
        java.lang.String str80 = locale65.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology61, locale65);
        org.joda.time.DurationField durationField82 = chronology61.years();
        org.joda.time.DateTimeField dateTimeField83 = chronology61.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField84 = chronology61.weekOfWeekyear();
        java.util.Locale locale86 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleKeys();
        java.lang.String str88 = dateTimeField84.getAsText((long) 1439, locale86);
        java.lang.String str89 = locale86.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket(19L, chronology41, locale86);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket92 = new org.joda.time.format.DateTimeParserBucket((long) 'x', chronology23, locale86, (java.lang.Integer) 11);
        java.lang.String str93 = locale86.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = new org.joda.time.format.DateTimeParserBucket((-61851601977001L), chronology17, locale86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField82", (durationField19.compareTo(durationField82) == 0) == durationField19.equals(durationField82));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DurationField durationField39 = chronology18.years();
        org.joda.time.DurationField durationField40 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField41 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField42 = chronology18.weekyears();
        java.util.Locale locale44 = new java.util.Locale("cinese (Cina)");
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = locale44.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-30231579000000L), chronology18, locale44, (java.lang.Integer) 13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField42", (durationField39.compareTo(durationField42) == 0) == durationField39.equals(durationField42));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField24", Math.signum(durationField19.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField19)));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.millisOfSecond();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DurationField durationField23 = chronology17.weekyears();
        org.joda.time.DurationField durationField24 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.halfdayOfDay();
        java.util.Locale locale29 = new java.util.Locale("zh", "weekyear", "en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        int int34 = dateTimeField32.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField35 = dateTimeField32.getDurationField();
        int int37 = dateTimeField32.getMaximumValue((long) (short) 1);
        long long39 = dateTimeField32.roundHalfEven((long) ' ');
        int int41 = dateTimeField32.getMinimumValue((long) 100);
        long long44 = dateTimeField32.add(0L, (long) 0);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        int int46 = dateTimeField32.getMaximumTextLength(locale45);
        long long48 = dateTimeField32.roundHalfFloor(360000010L);
        int int50 = dateTimeField32.getMinimumValue((-61851591600000L));
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType53.getField(chronology54);
        int int57 = dateTimeField55.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField58 = dateTimeField55.getDurationField();
        int int60 = dateTimeField55.getMaximumValue((long) (short) 1);
        long long62 = dateTimeField55.roundHalfEven((long) ' ');
        int int64 = dateTimeField55.getMinimumValue((long) 100);
        int int65 = dateTimeField55.getMinimumValue();
        java.util.Locale locale70 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str71 = dateTimeField55.getAsShortText((int) '#', locale70);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType74.getField(chronology75);
        int int78 = dateTimeField76.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField79 = dateTimeField76.getDurationField();
        int int81 = dateTimeField76.getMaximumValue((long) (short) 1);
        long long83 = dateTimeField76.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial84 = null;
        java.util.Locale.Builder builder86 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder89 = builder86.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder90 = builder86.clearExtensions();
        java.util.Locale locale91 = builder90.build();
        java.lang.String str92 = dateTimeField76.getAsShortText(readablePartial84, (int) (byte) 100, locale91);
        java.lang.String str93 = locale73.getDisplayScript(locale91);
        java.lang.String str94 = dateTimeField55.getAsText(360000000L, locale91);
        java.lang.String str95 = locale91.toLanguageTag();
        java.lang.String str96 = dateTimeField32.getAsShortText(readablePartial51, 998, locale91);
        java.lang.String str97 = locale29.getDisplayVariant(locale91);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket98 = new org.joda.time.format.DateTimeParserBucket((-1703861321007L), chronology17, locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField35", (durationField23.compareTo(durationField35) == 0) == durationField23.equals(durationField35));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.year();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.joda.time.DurationField durationField24 = chronology16.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField23", Math.signum(durationField19.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField19)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField24", Math.signum(durationField17.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField17)));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.era();
        org.joda.time.DurationField durationField41 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField19, and durationField38", !(durationField41.compareTo(durationField19) == 0) || (Math.signum(durationField41.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        long long30 = dateTimeField28.remainder((long) 100);
        org.joda.time.ReadablePartial readablePartial31 = null;
        int int32 = dateTimeField28.getMaximumValue(readablePartial31);
        java.util.Locale locale34 = new java.util.Locale("UTC");
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.util.Locale locale36 = java.util.Locale.JAPAN;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Set<java.lang.String> strSet38 = locale35.getUnicodeLocaleKeys();
        java.lang.String str39 = locale35.getDisplayCountry();
        java.lang.String str40 = locale34.getDisplayCountry(locale35);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.clockhourOfHalfday();
        org.joda.time.DurationField durationField61 = chronology58.millis();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType64.getField(chronology65);
        boolean boolean67 = dateTimeField66.isLenient();
        org.joda.time.ReadablePartial readablePartial68 = null;
        java.util.Locale locale70 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str71 = locale70.getDisplayName();
        java.util.Locale locale72 = java.util.Locale.ITALY;
        java.lang.String str73 = locale72.getLanguage();
        java.lang.String str74 = locale70.getDisplayName(locale72);
        java.lang.String str75 = dateTimeField66.getAsText(readablePartial68, (int) 'x', locale72);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology63, locale72, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.util.Locale locale80 = java.util.Locale.UK;
        dateTimeParserBucket77.saveField(dateTimeFieldType78, "Chinese (China)", locale80);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 'x', chronology58, locale80, (java.lang.Integer) 12, 100);
        java.lang.String str85 = locale80.getDisplayVariant();
        boolean boolean86 = locale80.hasExtensions();
        java.lang.String str87 = locale80.getDisplayCountry();
        java.lang.String str88 = locale35.getDisplayCountry(locale80);
        int int89 = dateTimeField28.getMaximumTextLength(locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField61", Math.signum(durationField27.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField27)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = chronology17.days();
        long long45 = chronology17.add((long) 2, 998L, 31);
        org.joda.time.DurationField durationField46 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField19, and durationField38", !(durationField46.compareTo(durationField19) == 0) || (Math.signum(durationField46.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long29 = dateTimeZone26.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        int int35 = dateTimeField33.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField36 = dateTimeField33.getDurationField();
        int int38 = dateTimeField33.getMaximumValue((long) (short) 1);
        long long40 = dateTimeField33.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder43.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder47 = builder43.clearExtensions();
        java.util.Locale locale48 = builder47.build();
        java.lang.String str49 = dateTimeField33.getAsShortText(readablePartial41, (int) (byte) 100, locale48);
        java.util.Set<java.lang.String> strSet50 = locale48.getUnicodeLocaleKeys();
        java.lang.String str51 = dateTimeZone26.getShortName((long) 1970, locale48);
        long long54 = dateTimeZone26.adjustOffset(3061065600000L, true);
        long long57 = dateTimeZone26.adjustOffset(127L, false);
        org.joda.time.Chronology chronology58 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField59 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField17, and durationField18", !(durationField59.compareTo(durationField17) == 0) || (Math.signum(durationField59.compareTo(durationField18)) == Math.signum(durationField17.compareTo(durationField18))));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long11 = dateTimeZone9.convertUTCToLocal(3061065600000L);
        org.joda.time.Chronology chronology12 = chronology7.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField13 = chronology7.millis();
        org.joda.time.DurationField durationField14 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField13, and durationField14", !(durationField17.compareTo(durationField13) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField(chronology9);
        int int12 = dateTimeField10.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField13 = dateTimeField10.getDurationField();
        int int15 = dateTimeField10.getMaximumValue((long) (short) 1);
        dateTimeParserBucket5.saveField(dateTimeField10, 0);
        java.lang.Integer int18 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        boolean boolean22 = dateTimeField21.isLenient();
        int int25 = dateTimeField21.getDifference((long) (short) 1, (long) 10);
        long long28 = dateTimeField21.add(1L, 1L);
        long long30 = dateTimeField21.roundFloor((long) (byte) -1);
        long long32 = dateTimeField21.roundCeiling((long) (short) 100);
        dateTimeParserBucket5.saveField(dateTimeField21, 1);
        int int36 = dateTimeField21.getLeapAmount(4199999L);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField21.getType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        boolean boolean43 = dateTimeField42.isLenient();
        org.joda.time.ReadablePartial readablePartial44 = null;
        java.util.Locale locale46 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str47 = locale46.getDisplayName();
        java.util.Locale locale48 = java.util.Locale.ITALY;
        java.lang.String str49 = locale48.getLanguage();
        java.lang.String str50 = locale46.getDisplayName(locale48);
        java.lang.String str51 = dateTimeField42.getAsText(readablePartial44, (int) 'x', locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology39, locale48, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.weekOfWeekyear();
        org.joda.time.DurationField durationField56 = chronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.year();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType37.getField(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField56", (durationField13.compareTo(durationField56) == 0) == durationField13.equals(durationField56));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology18, locale21, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField24 = chronology18.months();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology18.months();
        org.joda.time.DateTimeField dateTimeField31 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology18.getZone();
        org.joda.time.DateTimeField dateTimeField33 = chronology18.dayOfMonth();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology35, locale36, (java.lang.Integer) 1);
        java.lang.Object obj39 = dateTimeParserBucket38.saveState();
        long long40 = dateTimeParserBucket38.computeMillis();
        dateTimeParserBucket38.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        java.util.Locale locale47 = java.util.Locale.FRANCE;
        dateTimeParserBucket38.saveField(dateTimeFieldType43, "zh_CN", locale47);
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology50, locale51, (java.lang.Integer) 1);
        java.lang.Object obj54 = dateTimeParserBucket53.saveState();
        long long55 = dateTimeParserBucket53.computeMillis();
        dateTimeParserBucket53.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType58.getField(chronology59);
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        dateTimeParserBucket53.saveField(dateTimeFieldType58, "zh_CN", locale62);
        java.lang.String str64 = locale62.getVariant();
        java.lang.String str65 = locale47.getDisplayVariant(locale62);
        java.lang.String str66 = locale62.getDisplayVariant();
        java.lang.String str67 = locale62.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket(630288005148L, chronology18, locale62);
        org.joda.time.DateTimeField dateTimeField69 = chronology18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = chronology18.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField71 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField72 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField72, durationField20, and durationField24", !(durationField72.compareTo(durationField20) == 0) || (Math.signum(durationField72.compareTo(durationField24)) == Math.signum(durationField20.compareTo(durationField24))));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        int int18 = dateTimeParserBucket15.getOffset();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        boolean boolean31 = dateTimeField30.isLenient();
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str35 = locale34.getDisplayName();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = locale36.getLanguage();
        java.lang.String str38 = locale34.getDisplayName(locale36);
        java.lang.String str39 = dateTimeField30.getAsText(readablePartial32, (int) 'x', locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology27, locale36, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.seconds();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType25.getField(chronology42);
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.util.Locale locale49 = java.util.Locale.JAPAN;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(0L, chronology47, locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology42, locale48, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        long long57 = dateTimeZone54.getMillisKeepLocal(dateTimeZone55, 1L);
        int int59 = dateTimeZone54.getOffsetFromLocal((long) (short) 0);
        boolean boolean61 = dateTimeZone54.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology62 = chronology42.withZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone63 = chronology62.getZone();
        int int65 = dateTimeZone63.getStandardOffset(3124224000010L);
        org.joda.time.Chronology chronology66 = chronology19.withZone(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField43", Math.signum(durationField21.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField21)));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        org.joda.time.DurationField durationField21 = chronology17.eras();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology23, locale32, (java.lang.Integer) (-1));
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.util.Locale locale42 = java.util.Locale.US;
        java.lang.String str43 = locale41.getDisplayVariant(locale42);
        java.lang.String str44 = locale41.getCountry();
        java.lang.String str45 = locale41.getISO3Country();
        dateTimeParserBucket37.saveField(dateTimeFieldType39, "CHN", locale41);
        org.joda.time.Chronology chronology47 = dateTimeParserBucket37.getChronology();
        org.joda.time.Chronology chronology48 = dateTimeParserBucket37.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        org.joda.time.DurationField durationField50 = chronology48.eras();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.dayOfYear();
        java.util.Locale locale54 = new java.util.Locale("cinese (Cina)");
        java.lang.String str55 = locale54.getDisplayCountry();
        java.util.Locale locale57 = new java.util.Locale("cinese (Cina)");
        java.lang.String str58 = locale54.getDisplayVariant(locale57);
        java.lang.String str59 = dateTimeField51.getAsText(421200000, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((-62104060799990L), chronology17, locale54, (java.lang.Integer) 1, 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType63.getDurationType();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        boolean boolean71 = dateTimeField70.isLenient();
        org.joda.time.ReadablePartial readablePartial72 = null;
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str75 = locale74.getDisplayName();
        java.util.Locale locale76 = java.util.Locale.ITALY;
        java.lang.String str77 = locale76.getLanguage();
        java.lang.String str78 = locale74.getDisplayName(locale76);
        java.lang.String str79 = dateTimeField70.getAsText(readablePartial72, (int) 'x', locale76);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology67, locale76, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology82 = dateTimeParserBucket81.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.weekOfWeekyear();
        org.joda.time.DurationField durationField84 = chronology82.hours();
        java.util.Locale locale85 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology82, locale85, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField88 = chronology82.months();
        org.joda.time.DateTimeField dateTimeField89 = chronology82.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField90 = chronology82.millisOfDay();
        org.joda.time.DateTimeField dateTimeField91 = dateTimeFieldType63.getField(chronology82);
        org.joda.time.DateTimeField dateTimeField92 = chronology82.monthOfYear();
        org.joda.time.DateTimeField dateTimeField93 = chronology82.monthOfYear();
        long long96 = dateTimeField93.add((-1893456000001L), 59);
        dateTimeParserBucket62.saveField(dateTimeField93, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField84", Math.signum(durationField21.compareTo(durationField84)) == -Math.signum(durationField84.compareTo(durationField21)));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DurationField durationField18 = chronology16.seconds();
        org.joda.time.DurationField durationField19 = chronology16.seconds();
        org.joda.time.DurationField durationField20 = chronology16.months();
        org.joda.time.DurationField durationField21 = chronology16.seconds();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField18, and durationField20", !(durationField22.compareTo(durationField18) == 0) || (Math.signum(durationField22.compareTo(durationField20)) == Math.signum(durationField18.compareTo(durationField20))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfWeek();
        org.joda.time.DurationField durationField21 = chronology16.weeks();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField18, and durationField21", !(durationField22.compareTo(durationField18) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DurationField durationField20 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean23 = dateTimeZone22.isFixed();
        java.lang.String str24 = dateTimeZone22.toString();
        long long26 = dateTimeZone22.convertUTCToLocal(378691200000L);
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField28 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology16.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField28", Math.signum(durationField20.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField20)));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField24", Math.signum(durationField17.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField17)));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfDay();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        boolean boolean43 = dateTimeFieldType21.isSupported(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.eras();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology40.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField44", Math.signum(durationField42.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField42)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField28 = chronology17.centuries();
        org.joda.time.DurationField durationField29 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField19, and durationField23", !(durationField29.compareTo(durationField19) == 0) || (Math.signum(durationField29.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField21.getType();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.weekOfWeekyear();
        org.joda.time.DurationField durationField43 = chronology41.hours();
        java.util.Locale locale44 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology41, locale44, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        long long50 = dateTimeZone47.getMillisKeepLocal(dateTimeZone48, 1L);
        long long53 = dateTimeZone48.adjustOffset(1L, true);
        long long55 = dateTimeZone48.convertUTCToLocal(0L);
        java.lang.String str57 = dateTimeZone48.getNameKey(0L);
        int int59 = dateTimeZone48.getOffset((long) 10);
        org.joda.time.Chronology chronology60 = chronology41.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.dayOfWeek();
        org.joda.time.Chronology chronology63 = chronology60.withUTC();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        long long67 = dateTimeZone64.getMillisKeepLocal(dateTimeZone65, 1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone65);
        java.util.TimeZone timeZone69 = dateTimeZone65.toTimeZone();
        java.util.Locale locale74 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str75 = dateTimeZone65.getShortName((long) 'x', locale74);
        long long78 = dateTimeZone65.adjustOffset((-31449599999L), true);
        org.joda.time.Chronology chronology79 = chronology60.withZone(dateTimeZone65);
        org.joda.time.DurationField durationField80 = chronology60.eras();
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType22.getField(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField80", Math.signum(durationField18.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField18)));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField24", Math.signum(durationField19.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField19)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        long long24 = chronology16.add(97L, 4L, 70);
        org.joda.time.DurationField durationField25 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.weekyear();
        org.joda.time.DurationField durationField28 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField17, and durationField25", !(durationField28.compareTo(durationField17) == 0) || (Math.signum(durationField28.compareTo(durationField25)) == Math.signum(durationField17.compareTo(durationField25))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        int int28 = dateTimeField26.getLeapAmount((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        int int34 = dateTimeField32.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField35 = dateTimeField32.getDurationField();
        int int37 = dateTimeField32.getMaximumValue((long) (short) 1);
        long long39 = dateTimeField32.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder42.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder46 = builder42.clearExtensions();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = dateTimeField32.getAsShortText(readablePartial40, (int) (byte) 100, locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet50 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str51 = dateTimeField26.getAsText((int) 'u', locale47);
        java.lang.String str53 = locale47.getExtension('a');
        int int54 = dateTimeField23.getMaximumTextLength(locale47);
        long long57 = dateTimeField23.add((-31531800000L), (long) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField35", (durationField21.compareTo(durationField35) == 0) == durationField21.equals(durationField35));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.year();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField17, and durationField21", !(durationField23.compareTo(durationField17) == 0) || (Math.signum(durationField23.compareTo(durationField21)) == Math.signum(durationField17.compareTo(durationField21))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("china");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(4200000L, chronology19, locale41);
        org.joda.time.DurationField durationField43 = chronology19.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology19.hourOfDay();
        org.joda.time.DurationField durationField45 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField20, and durationField43", !(durationField45.compareTo(durationField20) == 0) || (Math.signum(durationField45.compareTo(durationField43)) == Math.signum(durationField20.compareTo(durationField43))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        java.lang.String str18 = chronology16.toString();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology16.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField21, and durationField19", !(durationField19.compareTo(durationField21) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField21.compareTo(durationField19))));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.roundHalfEven((long) 10);
        long long6 = dateTimeField2.roundHalfEven(120001L);
        org.joda.time.DurationField durationField7 = dateTimeField2.getRangeDurationField();
        int int10 = dateTimeField2.getDifference((long) 12, (long) (byte) -1);
        org.joda.time.DurationField durationField11 = dateTimeField2.getLeapDurationField();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        boolean boolean19 = dateTimeField18.isLenient();
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str23 = locale22.getDisplayName();
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.lang.String str25 = locale24.getLanguage();
        java.lang.String str26 = locale22.getDisplayName(locale24);
        java.lang.String str27 = dateTimeField18.getAsText(readablePartial20, (int) 'x', locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale24, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.seconds();
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology30, locale32, (java.lang.Integer) 1970);
        java.util.Set<java.lang.Character> charSet35 = locale32.getExtensionKeys();
        java.lang.String str36 = locale32.getLanguage();
        java.lang.String str37 = dateTimeField2.getAsShortText((-6774364799561L), locale32);
        long long40 = dateTimeField2.set(0L, (int) (short) 100);
        int int42 = dateTimeField2.getMaximumValue(84177446400070L);
        int int44 = dateTimeField2.getLeapAmount((-14399999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField31", (durationField7.compareTo(durationField31) == 0) == durationField7.equals(durationField31));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale40, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology18.dayOfWeek();
        java.lang.String str46 = chronology18.toString();
        org.joda.time.DurationField durationField47 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField48 = chronology18.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField47", Math.signum(durationField20.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField20)));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale19 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology17, locale19, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.year();
        org.joda.time.DurationField durationField24 = chronology17.eras();
        long long28 = chronology17.add((long) ' ', (long) 1910, 53);
        org.joda.time.DateTimeField dateTimeField29 = chronology17.clockhourOfHalfday();
        boolean boolean31 = dateTimeField29.isLeap((long) (short) 100);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology35, locale36, (java.lang.Integer) 1);
        java.lang.Object obj39 = dateTimeParserBucket38.saveState();
        long long40 = dateTimeParserBucket38.computeMillis();
        java.lang.Object obj41 = dateTimeParserBucket38.saveState();
        dateTimeParserBucket38.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType46.getField(chronology47);
        boolean boolean49 = dateTimeField48.isLenient();
        org.joda.time.ReadablePartial readablePartial50 = null;
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str53 = locale52.getDisplayName();
        java.util.Locale locale54 = java.util.Locale.ITALY;
        java.lang.String str55 = locale54.getLanguage();
        java.lang.String str56 = locale52.getDisplayName(locale54);
        java.lang.String str57 = dateTimeField48.getAsText(readablePartial50, (int) 'x', locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology45, locale54, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.weekOfWeekyear();
        org.joda.time.DurationField durationField62 = chronology60.hours();
        boolean boolean63 = dateTimeParserBucket38.restoreState((java.lang.Object) chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField65 = chronology60.millisOfDay();
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("117");
        java.lang.String str68 = locale67.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 99, chronology60, locale67, (java.lang.Integer) 360000000);
        java.util.Set<java.lang.Character> charSet71 = locale67.getExtensionKeys();
        java.util.Locale.setDefault(locale67);
        java.lang.String str73 = locale67.getVariant();
        java.lang.String str74 = dateTimeField29.getAsShortText((-4200000), locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField62", Math.signum(durationField24.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField24)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.Object obj49 = dateTimeParserBucket48.saveState();
        long long50 = dateTimeParserBucket48.computeMillis();
        java.lang.Object obj51 = dateTimeParserBucket48.saveState();
        dateTimeParserBucket48.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology55 = chronology17.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField59 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField19, and durationField38", !(durationField59.compareTo(durationField19) == 0) || (Math.signum(durationField59.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField18, and durationField21", !(durationField23.compareTo(durationField18) == 0) || (Math.signum(durationField23.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.Object obj49 = dateTimeParserBucket48.saveState();
        long long50 = dateTimeParserBucket48.computeMillis();
        java.lang.Object obj51 = dateTimeParserBucket48.saveState();
        dateTimeParserBucket48.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology55 = chronology17.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = chronology17.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = chronology17.add(readablePeriod57, (long) 12, 0);
        org.joda.time.DateTimeField dateTimeField61 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField63 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField19, and durationField38", !(durationField63.compareTo(durationField19) == 0) || (Math.signum(durationField63.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setOffset((java.lang.Integer) 1);
        java.lang.Object obj10 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology12, locale13, (java.lang.Integer) 1);
        java.lang.Object obj16 = dateTimeParserBucket15.saveState();
        long long17 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        dateTimeParserBucket15.saveField(dateTimeFieldType20, "zh_CN", locale24);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        boolean boolean28 = locale27.hasExtensions();
        java.lang.String str29 = locale27.getISO3Country();
        boolean boolean30 = locale27.hasExtensions();
        java.lang.String str31 = locale27.getISO3Language();
        dateTimeParserBucket4.saveField(dateTimeFieldType20, "hi!", locale27);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket4.getZone();
        java.lang.Integer int34 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        boolean boolean40 = dateTimeField39.isLenient();
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale43 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str44 = locale43.getDisplayName();
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale43.getDisplayName(locale45);
        java.lang.String str48 = dateTimeField39.getAsText(readablePartial41, (int) 'x', locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology36, locale45, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.seconds();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        long long59 = dateTimeZone56.getMillisKeepLocal(dateTimeZone57, 1L);
        boolean boolean60 = dateTimeZone57.isFixed();
        org.joda.time.Chronology chronology61 = chronology51.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfCentury();
        org.joda.time.DurationField durationField63 = chronology61.weekyears();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.yearOfEra();
        java.util.Locale.Builder builder66 = new java.util.Locale.Builder();
        java.util.Locale locale67 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder68 = builder66.setLocale(locale67);
        java.util.Locale locale70 = new java.util.Locale("China");
        java.util.Locale.Builder builder71 = builder68.setLocale(locale70);
        java.util.Locale.Builder builder73 = builder71.addUnicodeLocaleAttribute("French");
        java.util.Locale locale74 = builder71.build();
        java.lang.String str75 = locale74.getDisplayName();
        java.lang.String str76 = dateTimeField64.getAsText((int) 'x', locale74);
        boolean boolean77 = dateTimeField64.isLenient();
        dateTimeParserBucket4.saveField(dateTimeField64, 19);
        long long81 = dateTimeField64.roundCeiling(259200000L);
        org.joda.time.DurationField durationField82 = dateTimeField64.getDurationField();
        long long84 = dateTimeField64.roundCeiling(32329822800L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField63 and durationField82", (durationField63.compareTo(durationField82) == 0) == durationField63.equals(durationField82));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.minuteOfDay();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, 1L);
        long long30 = dateTimeZone25.adjustOffset(1L, true);
        int int32 = dateTimeZone25.getOffsetFromLocal(0L);
        long long34 = dateTimeZone25.previousTransition((long) (byte) -1);
        long long36 = dateTimeZone25.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology37 = chronology17.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField38 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField40 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField18, and durationField38", !(durationField40.compareTo(durationField18) == 0) || (Math.signum(durationField40.compareTo(durationField38)) == Math.signum(durationField18.compareTo(durationField38))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField25 = chronology17.weeks();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.secondOfMinute();
        long long30 = chronology17.add(1982L, (long) (byte) 100, 8);
        org.joda.time.DurationField durationField31 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField19, and durationField23", !(durationField31.compareTo(durationField19) == 0) || (Math.signum(durationField31.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.days();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField18, and durationField21", !(durationField22.compareTo(durationField18) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField18.compareTo(durationField21))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.clockhourOfHalfday();
        int int23 = dateTimeField22.getMaximumValue();
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale26 = java.util.Locale.ITALY;
        java.lang.String str27 = dateTimeField22.getAsShortText(readablePartial24, 1, locale26);
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder29.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Set<java.lang.String> strSet37 = locale34.getUnicodeLocaleKeys();
        java.lang.String str38 = locale34.getDisplayCountry();
        java.util.Locale.Builder builder39 = builder33.setLocale(locale34);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale41 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale41);
        java.lang.String str43 = locale40.getDisplayCountry(locale41);
        java.util.Set<java.lang.String> strSet44 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale34.getDisplayCountry(locale40);
        java.util.Locale.setDefault(category0, locale34);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        boolean boolean53 = dateTimeField52.isLenient();
        org.joda.time.ReadablePartial readablePartial54 = null;
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str57 = locale56.getDisplayName();
        java.util.Locale locale58 = java.util.Locale.ITALY;
        java.lang.String str59 = locale58.getLanguage();
        java.lang.String str60 = locale56.getDisplayName(locale58);
        java.lang.String str61 = dateTimeField52.getAsText(readablePartial54, (int) 'x', locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology49, locale58, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.hourOfDay();
        org.joda.time.DurationField durationField66 = chronology64.eras();
        org.joda.time.DurationField durationField67 = chronology64.eras();
        java.util.Locale locale69 = new java.util.Locale("yearOfEra");
        java.lang.String str70 = locale69.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(1982L, chronology64, locale69, (java.lang.Integer) 1);
        java.util.Locale locale73 = locale69.stripExtensions();
        java.util.Locale.setDefault(category0, locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField66", Math.signum(durationField20.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField20)));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.centuryOfEra();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField19, and durationField22", !(durationField24.compareTo(durationField19) == 0) || (Math.signum(durationField24.compareTo(durationField22)) == Math.signum(durationField19.compareTo(durationField22))));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfYear();
        org.joda.time.DurationField durationField21 = chronology19.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField21, and durationField18", !(durationField18.compareTo(durationField21) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField21.compareTo(durationField18))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        long long24 = chronology16.add(97L, 4L, 70);
        org.joda.time.DurationField durationField25 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField25", Math.signum(durationField17.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField17)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        org.joda.time.DurationField durationField20 = chronology17.eras();
        java.util.Locale locale22 = new java.util.Locale("yearOfEra");
        java.lang.String str23 = locale22.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(1982L, chronology17, locale22, (java.lang.Integer) 1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        boolean boolean32 = dateTimeField31.isLenient();
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = locale35.getDisplayName(locale37);
        java.lang.String str40 = dateTimeField31.getAsText(readablePartial33, (int) 'x', locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology28, locale37, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.weekOfWeekyear();
        org.joda.time.DurationField durationField45 = chronology43.hours();
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology43, locale46, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField49 = chronology43.months();
        org.joda.time.DateTimeField dateTimeField50 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField51 = chronology43.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField51.getType();
        dateTimeParserBucket25.saveField(dateTimeFieldType52, 86411);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField45", Math.signum(durationField19.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField19)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology17.getZone();
        org.joda.time.DurationField durationField42 = chronology17.weeks();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        long long52 = dateTimeParserBucket48.computeMillis(true, "120");
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology54 = chronology17.withZone(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long60 = dateTimeZone57.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType62.getField(chronology63);
        int int66 = dateTimeField64.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField67 = dateTimeField64.getDurationField();
        int int69 = dateTimeField64.getMaximumValue((long) (short) 1);
        long long71 = dateTimeField64.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial72 = null;
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder77 = builder74.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder78 = builder74.clearExtensions();
        java.util.Locale locale79 = builder78.build();
        java.lang.String str80 = dateTimeField64.getAsShortText(readablePartial72, (int) (byte) 100, locale79);
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleKeys();
        java.lang.String str82 = dateTimeZone57.getShortName((long) 1970, locale79);
        long long85 = dateTimeZone57.adjustOffset(3061065600000L, true);
        int int87 = dateTimeZone57.getOffset((long) 998);
        org.joda.time.Chronology chronology88 = chronology54.withZone(dateTimeZone57);
        org.joda.time.DurationField durationField89 = chronology88.hours();
        org.joda.time.DateTimeField dateTimeField90 = chronology88.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField89", (durationField19.compareTo(durationField89) == 0) == durationField19.equals(durationField89));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfDay();
        org.joda.time.DurationField durationField20 = chronology16.weekyears();
        org.joda.time.DurationField durationField21 = chronology16.months();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField23 = chronology16.seconds();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField20, and durationField21", !(durationField24.compareTo(durationField20) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField26 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField26", (durationField24.compareTo(durationField26) == 0) == durationField24.equals(durationField26));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.minuteOfDay();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, 1L);
        long long30 = dateTimeZone25.adjustOffset(1L, true);
        int int32 = dateTimeZone25.getOffsetFromLocal(0L);
        long long34 = dateTimeZone25.previousTransition((long) (byte) -1);
        long long36 = dateTimeZone25.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology37 = chronology17.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField38 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.clockhourOfDay();
        org.joda.time.DurationField durationField40 = chronology17.seconds();
        org.joda.time.DurationField durationField41 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField18, and durationField38", !(durationField41.compareTo(durationField18) == 0) || (Math.signum(durationField41.compareTo(durationField38)) == Math.signum(durationField18.compareTo(durationField38))));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField44 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField19, and durationField38", !(durationField44.compareTo(durationField19) == 0) || (Math.signum(durationField44.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.centuryOfEra();
        org.joda.time.DurationField durationField22 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.year();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.weekOfWeekyear();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = dateTimeField41.getAsShortText(1439, locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((-31531800000L), chronology17, locale43, (java.lang.Integer) 99);
        org.joda.time.DurationField durationField47 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField48 = chronology17.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        int int54 = dateTimeField52.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField55 = dateTimeField52.getDurationField();
        int int57 = dateTimeField52.getMaximumValue((long) (short) 1);
        long long59 = dateTimeField52.roundHalfEven((long) ' ');
        int int61 = dateTimeField52.getMinimumValue((long) 100);
        long long64 = dateTimeField52.add(0L, (long) 0);
        java.util.Locale locale65 = java.util.Locale.CANADA_FRENCH;
        int int66 = dateTimeField52.getMaximumTextLength(locale65);
        org.joda.time.DurationField durationField67 = dateTimeField52.getLeapDurationField();
        java.util.Locale locale68 = java.util.Locale.UK;
        int int69 = dateTimeField52.getMaximumShortTextLength(locale68);
        int int71 = dateTimeField52.get((long) 53);
        org.joda.time.ReadablePartial readablePartial72 = null;
        int int73 = dateTimeField52.getMaximumValue(readablePartial72);
        org.joda.time.ReadablePartial readablePartial74 = null;
        int[] intArray75 = new int[] {};
        int int76 = dateTimeField52.getMinimumValue(readablePartial74, intArray75);
        int int77 = dateTimeField48.getMaximumValue(readablePartial49, intArray75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField55", (durationField47.compareTo(durationField55) == 0) == durationField47.equals(durationField55));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField33 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField19, and durationField23", !(durationField33.compareTo(durationField19) == 0) || (Math.signum(durationField33.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.monthOfYear();
        java.lang.String str21 = chronology17.toString();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology17.eras();
        java.util.Locale locale28 = new java.util.Locale("DateTimeField[millisOfSecond]", "Italy", "halfdayOfDay");
        java.lang.String str29 = locale28.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(30L, chronology17, locale28, (java.lang.Integer) 3368);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField24", Math.signum(durationField18.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField18)));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str34 = locale30.getExtension('a');
        java.lang.String str35 = locale29.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale29);
        org.joda.time.DurationField durationField37 = chronology27.years();
        org.joda.time.DurationField durationField38 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField18, and durationField37", !(durationField38.compareTo(durationField18) == 0) || (Math.signum(durationField38.compareTo(durationField37)) == Math.signum(durationField18.compareTo(durationField37))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField26 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField19, and durationField23", !(durationField26.compareTo(durationField19) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.dayOfWeek();
        org.joda.time.DurationField durationField41 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology17.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField41", (durationField38.compareTo(durationField41) == 0) == durationField38.equals(durationField41));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, 1L);
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.weekyear();
        org.joda.time.DurationField durationField31 = chronology26.centuries();
        org.joda.time.DurationField durationField32 = chronology26.years();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField32", (durationField28.compareTo(durationField32) == 0) == durationField28.equals(durationField32));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.DurationField durationField22 = chronology16.halfdays();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField17, and durationField21", !(durationField23.compareTo(durationField17) == 0) || (Math.signum(durationField23.compareTo(durationField21)) == Math.signum(durationField17.compareTo(durationField21))));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        java.lang.String str21 = dateTimeField19.getAsShortText(4200000L);
        org.joda.time.DurationField durationField22 = dateTimeField19.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField19.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        int int28 = dateTimeField26.getLeapAmount((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField26.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        boolean boolean37 = dateTimeField36.isLenient();
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str41 = locale40.getDisplayName();
        java.util.Locale locale42 = java.util.Locale.ITALY;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = dateTimeField36.getAsText(readablePartial38, (int) 'x', locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale42, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.seconds();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType31.getField(chronology48);
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.JAPAN;
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(0L, chronology53, locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology48, locale54, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        long long63 = dateTimeZone60.getMillisKeepLocal(dateTimeZone61, 1L);
        int int65 = dateTimeZone60.getOffsetFromLocal((long) (short) 0);
        boolean boolean67 = dateTimeZone60.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology68 = chronology48.withZone(dateTimeZone60);
        long long72 = chronology68.add(19L, 1L, (int) (byte) -1);
        boolean boolean73 = dateTimeFieldType29.isSupported(chronology68);
        org.joda.time.DurationField durationField74 = chronology68.weekyears();
        org.joda.time.DateTimeField dateTimeField75 = chronology68.clockhourOfHalfday();
        org.joda.time.DurationField durationField76 = chronology68.weeks();
        org.joda.time.DateTimeField dateTimeField77 = chronology68.millisOfSecond();
        org.joda.time.DurationField durationField78 = chronology68.years();
        boolean boolean79 = dateTimeFieldType23.isSupported(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField78", (durationField74.compareTo(durationField78) == 0) == durationField74.equals(durationField78));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfWeek();
        org.joda.time.DurationField durationField23 = chronology16.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField23, and durationField20", !(durationField20.compareTo(durationField23) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField23.compareTo(durationField20))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.millisOfDay();
        org.joda.time.DurationField durationField29 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField19, and durationField23", !(durationField29.compareTo(durationField19) == 0) || (Math.signum(durationField29.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.year();
        org.joda.time.Chronology chronology23 = chronology16.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, 1L);
        long long30 = dateTimeZone25.adjustOffset(1L, true);
        boolean boolean31 = dateTimeZone25.isFixed();
        long long33 = dateTimeZone25.convertUTCToLocal((long) 100);
        java.util.Locale locale36 = new java.util.Locale("China");
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        int int41 = dateTimeField39.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField42 = dateTimeField39.getDurationField();
        int int44 = dateTimeField39.getMaximumValue((long) (short) 1);
        long long46 = dateTimeField39.roundHalfEven((long) ' ');
        int int48 = dateTimeField39.getMinimumValue((long) 100);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale53 = new java.util.Locale("", "Chinese (China)");
        boolean boolean54 = locale53.hasExtensions();
        java.lang.String str55 = dateTimeField39.getAsShortText(readablePartial49, (int) (short) -1, locale53);
        java.util.Locale locale57 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale57);
        java.lang.String str59 = dateTimeField39.getAsShortText((long) (byte) 100, locale57);
        java.lang.String str60 = locale36.getDisplayLanguage(locale57);
        java.lang.String str61 = dateTimeZone25.getName((long) 9, locale57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        long long65 = dateTimeZone62.getMillisKeepLocal(dateTimeZone63, 1L);
        int int67 = dateTimeZone62.getOffsetFromLocal((long) (short) 0);
        int int69 = dateTimeZone62.getOffsetFromLocal(4200000L);
        long long72 = dateTimeZone62.adjustOffset((long) 100, true);
        int int74 = dateTimeZone62.getOffsetFromLocal((long) 0);
        org.joda.time.ReadableInstant readableInstant75 = null;
        int int76 = dateTimeZone62.getOffset(readableInstant75);
        long long78 = dateTimeZone25.getMillisKeepLocal(dateTimeZone62, (-58979923200001L));
        org.joda.time.Chronology chronology79 = chronology16.withZone(dateTimeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField42", (durationField18.compareTo(durationField42) == 0) == durationField18.equals(durationField42));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        java.util.Locale locale6 = dateTimeParserBucket4.getLocale();
        dateTimeParserBucket4.setOffset((int) (byte) 1);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        java.lang.String str10 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.millisOfDay();
        org.joda.time.DurationField durationField12 = chronology9.halfdays();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.joda.time.DurationField durationField23 = chronology16.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        dateTimeParserBucket4.setOffset(421200000);
        java.lang.Integer int14 = dateTimeParserBucket4.getPivotYear();
        dateTimeParserBucket4.setOffset((java.lang.Integer) (-292275054));
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        boolean boolean23 = dateTimeField22.isLenient();
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale locale28 = java.util.Locale.ITALY;
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale26.getDisplayName(locale28);
        java.lang.String str31 = dateTimeField22.getAsText(readablePartial24, (int) 'x', locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology19, locale28, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.seconds();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType17.getField(chronology34);
        java.util.Locale locale40 = new java.util.Locale("2069");
        dateTimeParserBucket4.saveField(dateTimeFieldType17, "100", locale40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology58.yearOfEra();
        org.joda.time.DateTimeField dateTimeField64 = chronology58.hourOfHalfday();
        org.joda.time.DurationField durationField65 = chronology58.eras();
        boolean boolean66 = dateTimeFieldType17.isSupported(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField65", Math.signum(durationField35.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField35)));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType8.getField(chronology9);
        int int12 = dateTimeField10.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField13 = dateTimeField10.getDurationField();
        int int15 = dateTimeField10.getMaximumValue((long) (short) 1);
        dateTimeParserBucket5.saveField(dateTimeField10, 0);
        java.lang.Integer int18 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        boolean boolean22 = dateTimeField21.isLenient();
        int int25 = dateTimeField21.getDifference((long) (short) 1, (long) 10);
        long long28 = dateTimeField21.add(1L, 1L);
        long long30 = dateTimeField21.roundFloor((long) (byte) -1);
        long long32 = dateTimeField21.roundCeiling((long) (short) 100);
        dateTimeParserBucket5.saveField(dateTimeField21, 1);
        int int36 = dateTimeField21.getLeapAmount(4199999L);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField21.getType();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.weekOfWeekyear();
        org.joda.time.DurationField durationField60 = chronology58.hours();
        java.util.Locale locale61 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology58, locale61, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField64 = chronology58.months();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = chronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType39.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField68 = chronology58.secondOfDay();
        boolean boolean69 = dateTimeFieldType37.isSupported(chronology58);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType72.getField(chronology73);
        boolean boolean75 = dateTimeField74.isLenient();
        org.joda.time.ReadablePartial readablePartial76 = null;
        java.util.Locale locale78 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str79 = locale78.getDisplayName();
        java.util.Locale locale80 = java.util.Locale.ITALY;
        java.lang.String str81 = locale80.getLanguage();
        java.lang.String str82 = locale78.getDisplayName(locale80);
        java.lang.String str83 = dateTimeField74.getAsText(readablePartial76, (int) 'x', locale80);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology71, locale80, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology86 = dateTimeParserBucket85.getChronology();
        java.lang.String str87 = chronology86.toString();
        org.joda.time.DateTimeField dateTimeField88 = chronology86.hourOfDay();
        org.joda.time.DateTimeField dateTimeField89 = chronology86.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField90 = chronology86.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField91 = chronology86.secondOfMinute();
        boolean boolean92 = dateTimeFieldType37.isSupported(chronology86);
        org.joda.time.DurationField durationField93 = chronology86.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField13, and durationField60", !(durationField93.compareTo(durationField13) == 0) || (Math.signum(durationField93.compareTo(durationField60)) == Math.signum(durationField13.compareTo(durationField60))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4, (java.lang.Integer) 1);
        java.lang.Object obj7 = dateTimeParserBucket6.saveState();
        long long8 = dateTimeParserBucket6.computeMillis();
        java.lang.Object obj9 = dateTimeParserBucket6.saveState();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType14.getField(chronology15);
        boolean boolean17 = dateTimeField16.isLenient();
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale20.getDisplayName(locale22);
        java.lang.String str25 = dateTimeField16.getAsText(readablePartial18, (int) 'x', locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology13, locale22, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField30 = chronology28.hours();
        boolean boolean31 = dateTimeParserBucket6.restoreState((java.lang.Object) chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType1.getField(chronology28);
        java.lang.String str34 = chronology28.toString();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology36, locale37, (java.lang.Integer) 1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(11400999L, chronology28, locale37);
        org.joda.time.DateTimeField dateTimeField41 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology28.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology28.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField42", Math.signum(durationField30.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField30)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        boolean boolean29 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket4.getZone();
        java.lang.Object obj31 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        boolean boolean38 = dateTimeField37.isLenient();
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str42 = locale41.getDisplayName();
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.lang.String str44 = locale43.getLanguage();
        java.lang.String str45 = locale41.getDisplayName(locale43);
        java.lang.String str46 = dateTimeField37.getAsText(readablePartial39, (int) 'x', locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology34, locale43, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.weekOfWeekyear();
        org.joda.time.DurationField durationField51 = chronology49.hours();
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology49, locale52, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField55 = chronology49.months();
        org.joda.time.DateTimeField dateTimeField56 = chronology49.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology49.centuries();
        org.joda.time.DurationField durationField58 = chronology49.years();
        org.joda.time.DateTimeField dateTimeField59 = chronology49.weekyearOfCentury();
        dateTimeParserBucket4.saveField(dateTimeField59, (int) 'x');
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType65.getField(chronology66);
        boolean boolean68 = dateTimeField67.isLenient();
        org.joda.time.ReadablePartial readablePartial69 = null;
        java.util.Locale locale71 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str72 = locale71.getDisplayName();
        java.util.Locale locale73 = java.util.Locale.ITALY;
        java.lang.String str74 = locale73.getLanguage();
        java.lang.String str75 = locale71.getDisplayName(locale73);
        java.lang.String str76 = dateTimeField67.getAsText(readablePartial69, (int) 'x', locale73);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology64, locale73, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology79 = dateTimeParserBucket78.getChronology();
        org.joda.time.DateTimeField dateTimeField80 = chronology79.weekOfWeekyear();
        org.joda.time.DurationField durationField81 = chronology79.hours();
        java.util.Locale locale82 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology79, locale82, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField85 = chronology79.months();
        org.joda.time.DateTimeField dateTimeField86 = chronology79.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField87 = chronology79.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField88 = chronology79.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField89 = chronology79.hourOfDay();
        org.joda.time.DateTimeField dateTimeField90 = chronology79.millisOfDay();
        boolean boolean91 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology79);
        org.joda.time.DurationField durationField92 = chronology79.weeks();
        org.joda.time.DateTimeField dateTimeField93 = chronology79.dayOfYear();
        org.joda.time.DurationField durationField94 = chronology79.weekyears();
        org.joda.time.DateTimeField dateTimeField95 = chronology79.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField58 and durationField94", (durationField58.compareTo(durationField94) == 0) == durationField58.equals(durationField94));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.centuries();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setOffset((int) (short) 100);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 81);
        java.lang.Integer int12 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        java.lang.String str16 = dateTimeFieldType13.getName();
        dateTimeParserBucket4.saveField(dateTimeFieldType13, 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean25 = dateTimeField24.isLenient();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale28.getDisplayName();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale28.getDisplayName(locale30);
        java.lang.String str33 = dateTimeField24.getAsText(readablePartial26, (int) 'x', locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale30, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.weekOfWeekyear();
        org.joda.time.DurationField durationField38 = chronology36.hours();
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder41 = builder39.setLocale(locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType42.getField(chronology43);
        boolean boolean45 = dateTimeField44.isLenient();
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str49 = locale48.getDisplayName();
        java.util.Locale locale50 = java.util.Locale.ITALY;
        java.lang.String str51 = locale50.getLanguage();
        java.lang.String str52 = locale48.getDisplayName(locale50);
        java.lang.String str53 = dateTimeField44.getAsText(readablePartial46, (int) 'x', locale50);
        java.lang.String str54 = locale40.getDisplayLanguage(locale50);
        java.lang.String str55 = locale40.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology36, locale40);
        org.joda.time.DurationField durationField57 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField58 = chronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = chronology36.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology36.getZone();
        org.joda.time.DurationField durationField61 = chronology36.weeks();
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale64 = java.util.Locale.JAPAN;
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket(0L, chronology63, locale64);
        java.lang.Integer int68 = dateTimeParserBucket67.getPivotYear();
        long long71 = dateTimeParserBucket67.computeMillis(true, "120");
        org.joda.time.DateTimeZone dateTimeZone72 = dateTimeParserBucket67.getZone();
        org.joda.time.Chronology chronology73 = chronology36.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField74 = chronology36.hourOfHalfday();
        org.joda.time.DurationField durationField75 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType13.getField(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField57 and durationField75", (durationField57.compareTo(durationField75) == 0) == durationField57.equals(durationField75));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType24.getField(chronology41);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology41, locale47, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone53.getMillisKeepLocal(dateTimeZone54, 1L);
        int int58 = dateTimeZone53.getOffsetFromLocal((long) (short) 0);
        boolean boolean60 = dateTimeZone53.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology61 = chronology41.withZone(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone62 = chronology61.getZone();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType64.getField(chronology65);
        int int68 = dateTimeField66.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField69 = dateTimeField66.getDurationField();
        int int71 = dateTimeField66.getMaximumValue((long) (short) 1);
        long long73 = dateTimeField66.roundHalfEven((long) ' ');
        int int75 = dateTimeField66.getMinimumValue((long) 100);
        long long78 = dateTimeField66.add(0L, (long) 0);
        long long80 = dateTimeField66.remainder((long) 10);
        java.util.Locale locale82 = java.util.Locale.forLanguageTag("DateTimeField[minuteOfDay]");
        java.util.Locale locale85 = new java.util.Locale("", "Chinese (China)");
        java.lang.String str86 = locale85.getDisplayScript();
        java.lang.String str87 = locale82.getDisplayName(locale85);
        int int88 = dateTimeField66.getMaximumTextLength(locale82);
        java.lang.String str89 = locale82.getDisplayVariant();
        java.lang.String str90 = locale82.getISO3Language();
        java.util.Locale locale91 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet92 = locale91.getUnicodeLocaleKeys();
        java.lang.String str93 = locale82.getDisplayLanguage(locale91);
        java.lang.String str94 = locale91.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket96 = new org.joda.time.format.DateTimeParserBucket((-8699192399000L), chronology61, locale91, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket99 = new org.joda.time.format.DateTimeParserBucket((-54600002L), chronology17, locale91, (java.lang.Integer) 180401792, 11201);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField69", (durationField19.compareTo(durationField69) == 0) == durationField19.equals(durationField69));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.util.Locale locale18 = java.util.Locale.UK;
        dateTimeParserBucket15.saveField(dateTimeFieldType16, "Chinese (China)", locale18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean25 = dateTimeField24.isLenient();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale28.getDisplayName();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale28.getDisplayName(locale30);
        java.lang.String str33 = dateTimeField24.getAsText(readablePartial26, (int) 'x', locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale30, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.seconds();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType16.getField(chronology36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        java.lang.String str59 = chronology58.toString();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfDay();
        org.joda.time.DurationField durationField61 = chronology58.centuries();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long67 = dateTimeZone64.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType69.getField(chronology70);
        int int73 = dateTimeField71.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField74 = dateTimeField71.getDurationField();
        int int76 = dateTimeField71.getMaximumValue((long) (short) 1);
        long long78 = dateTimeField71.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial79 = null;
        java.util.Locale.Builder builder81 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder84 = builder81.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder85 = builder81.clearExtensions();
        java.util.Locale locale86 = builder85.build();
        java.lang.String str87 = dateTimeField71.getAsShortText(readablePartial79, (int) (byte) 100, locale86);
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleKeys();
        java.lang.String str89 = dateTimeZone64.getShortName((long) 1970, locale86);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket(0L, chronology58, locale86);
        org.joda.time.DateTimeField dateTimeField91 = chronology58.weekyear();
        org.joda.time.DateTimeField dateTimeField92 = chronology58.millisOfSecond();
        boolean boolean93 = dateTimeFieldType16.isSupported(chronology58);
        org.joda.time.DateTimeZone dateTimeZone94 = chronology58.getZone();
        org.joda.time.DateTimeField dateTimeField95 = chronology58.secondOfMinute();
        org.joda.time.DurationField durationField96 = chronology58.weekyears();
        org.joda.time.DateTimeField dateTimeField97 = chronology58.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField96", (durationField74.compareTo(durationField96) == 0) == durationField74.equals(durationField96));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfEra();
        org.joda.time.ReadablePartial readablePartial21 = null;
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder25 = builder23.setLocale(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder27 = builder23.setLocale(locale26);
        java.lang.String str28 = dateTimeField20.getAsText(readablePartial21, (int) (byte) 100, locale26);
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        int int38 = dateTimeField36.getLeapAmount((long) 0);
        long long40 = dateTimeField36.roundHalfCeiling((long) (byte) 0);
        long long43 = dateTimeField36.set((-1L), 100);
        int int45 = dateTimeField36.get((long) (byte) 100);
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale50 = new java.util.Locale("", "tedesco");
        java.lang.String str51 = dateTimeField36.getAsText(readablePartial46, (int) (short) 100, locale50);
        java.lang.String str52 = locale30.getDisplayScript(locale50);
        java.lang.String str53 = locale50.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale50);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType58.getField(chronology59);
        boolean boolean61 = dateTimeField60.isLenient();
        org.joda.time.ReadablePartial readablePartial62 = null;
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str65 = locale64.getDisplayName();
        java.util.Locale locale66 = java.util.Locale.ITALY;
        java.lang.String str67 = locale66.getLanguage();
        java.lang.String str68 = locale64.getDisplayName(locale66);
        java.lang.String str69 = dateTimeField60.getAsText(readablePartial62, (int) 'x', locale66);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology57, locale66, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology72 = dateTimeParserBucket71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.hourOfDay();
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.joda.time.DurationField durationField75 = chronology72.eras();
        java.util.Locale locale77 = new java.util.Locale("yearOfEra");
        java.lang.String str78 = locale77.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(1982L, chronology72, locale77, (java.lang.Integer) 1);
        java.util.Locale locale81 = locale77.stripExtensions();
        java.lang.String str82 = locale77.getDisplayScript();
        java.util.Locale.setDefault(category0, locale77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField74", Math.signum(durationField18.compareTo(durationField74)) == -Math.signum(durationField74.compareTo(durationField18)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField40 = chronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int44 = dateTimeZone42.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.lang.String str50 = dateTimeZone42.getShortName((long) 100, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(4200010L, chronology19, locale47, (java.lang.Integer) 366, 99);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long59 = dateTimeZone56.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType61.getField(chronology62);
        int int65 = dateTimeField63.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField66 = dateTimeField63.getDurationField();
        int int68 = dateTimeField63.getMaximumValue((long) (short) 1);
        long long70 = dateTimeField63.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale.Builder builder73 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder76 = builder73.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder77 = builder73.clearExtensions();
        java.util.Locale locale78 = builder77.build();
        java.lang.String str79 = dateTimeField63.getAsShortText(readablePartial71, (int) (byte) 100, locale78);
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleKeys();
        java.lang.String str81 = dateTimeZone56.getShortName((long) 1970, locale78);
        long long84 = dateTimeZone56.adjustOffset(3061065600000L, true);
        long long87 = dateTimeZone56.adjustOffset(127L, false);
        long long90 = dateTimeZone56.convertLocalToUTC(7200999L, true);
        org.joda.time.Chronology chronology91 = chronology19.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField92 = chronology91.halfdayOfDay();
        org.joda.time.DurationField durationField93 = chronology91.years();
        org.joda.time.DateTimeField dateTimeField94 = chronology91.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField66 and durationField93", (durationField66.compareTo(durationField93) == 0) == durationField66.equals(durationField93));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, 1L);
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField29 = dateTimeField28.getDurationField();
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType32.getField(chronology33);
        int int36 = dateTimeField34.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField37 = dateTimeField34.getDurationField();
        int int39 = dateTimeField34.getMaximumValue((long) (short) 1);
        long long41 = dateTimeField34.roundHalfEven((long) ' ');
        int int43 = dateTimeField34.getMinimumValue((long) 100);
        long long46 = dateTimeField34.add(0L, (long) 0);
        java.util.Locale locale47 = java.util.Locale.CANADA_FRENCH;
        int int48 = dateTimeField34.getMaximumTextLength(locale47);
        java.lang.String str49 = locale47.getDisplayScript();
        java.util.Locale locale50 = java.util.Locale.ITALY;
        java.lang.String str51 = locale50.getLanguage();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.JAPAN;
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket(0L, chronology53, locale54);
        java.lang.Integer int58 = dateTimeParserBucket57.getPivotYear();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology60, locale61, (java.lang.Integer) 1);
        java.lang.Object obj64 = dateTimeParserBucket63.saveState();
        long long65 = dateTimeParserBucket63.computeMillis();
        dateTimeParserBucket63.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        java.util.Locale locale72 = java.util.Locale.FRANCE;
        dateTimeParserBucket63.saveField(dateTimeFieldType68, "zh_CN", locale72);
        boolean boolean74 = dateTimeParserBucket57.restoreState((java.lang.Object) locale72);
        java.lang.String str75 = locale50.getDisplayVariant(locale72);
        java.lang.String str76 = locale47.getDisplayName(locale72);
        java.lang.String str77 = dateTimeField28.getAsText(readablePartial30, (int) (short) -1, locale72);
        java.lang.String str78 = dateTimeField28.toString();
        long long81 = dateTimeField28.set((long) (-715580), 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField37", (durationField29.compareTo(durationField37) == 0) == durationField29.equals(durationField37));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType1.getField(chronology18);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale24, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long33 = dateTimeZone30.getMillisKeepLocal(dateTimeZone31, 1L);
        int int35 = dateTimeZone30.getOffsetFromLocal((long) (short) 0);
        boolean boolean37 = dateTimeZone30.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology38 = chronology18.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.dayOfWeek();
        org.joda.time.DurationField durationField40 = chronology18.weeks();
        org.joda.time.DurationField durationField41 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField19, and durationField40", !(durationField41.compareTo(durationField19) == 0) || (Math.signum(durationField41.compareTo(durationField40)) == Math.signum(durationField19.compareTo(durationField40))));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.Object obj49 = dateTimeParserBucket48.saveState();
        long long50 = dateTimeParserBucket48.computeMillis();
        java.lang.Object obj51 = dateTimeParserBucket48.saveState();
        dateTimeParserBucket48.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology55 = chronology17.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = chronology17.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = chronology17.add(readablePeriod57, (long) 12, 0);
        org.joda.time.DateTimeField dateTimeField61 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField63 = chronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField64 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField65 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField65, durationField19, and durationField38", !(durationField65.compareTo(durationField19) == 0) || (Math.signum(durationField65.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        boolean boolean35 = dateTimeZone32.isFixed();
        org.joda.time.Chronology chronology36 = chronology26.withZone(dateTimeZone32);
        boolean boolean37 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.dayOfMonth();
        dateTimeParserBucket5.saveField(dateTimeFieldType38, 99);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        boolean boolean47 = dateTimeField46.isLenient();
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str51 = locale50.getDisplayName();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.lang.String str53 = locale52.getLanguage();
        java.lang.String str54 = locale50.getDisplayName(locale52);
        java.lang.String str55 = dateTimeField46.getAsText(readablePartial48, (int) 'x', locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology43, locale52, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.weekOfWeekyear();
        org.joda.time.DurationField durationField60 = chronology58.hours();
        java.util.Locale locale61 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology58, locale61, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField64 = chronology58.months();
        org.joda.time.DateTimeField dateTimeField65 = chronology58.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = chronology58.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField67 = chronology58.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = chronology58.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField69 = chronology58.year();
        org.joda.time.DateTimeField dateTimeField70 = chronology58.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField71 = chronology58.monthOfYear();
        org.joda.time.Chronology chronology72 = chronology58.withUTC();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType38.getField(chronology72);
        org.joda.time.DurationField durationField74 = chronology72.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField27, and durationField60", !(durationField74.compareTo(durationField27) == 0) || (Math.signum(durationField74.compareTo(durationField60)) == Math.signum(durationField27.compareTo(durationField60))));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.millis();
        boolean boolean43 = dateTimeFieldType17.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.Chronology chronology47 = chronology41.withZone(dateTimeZone46);
        org.joda.time.DurationField durationField48 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField48", Math.signum(durationField42.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField42)));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology17.getZone();
        org.joda.time.DurationField durationField42 = chronology17.weeks();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        long long52 = dateTimeParserBucket48.computeMillis(true, "120");
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology54 = chronology17.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField56 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField57 = chronology17.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField56", (durationField38.compareTo(durationField56) == 0) == durationField38.equals(durationField56));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfSecond();
        long long33 = chronology17.add((-2L), 13L, (-4200000));
        org.joda.time.DateTimeField dateTimeField34 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology17.years();
        org.joda.time.DurationField durationField36 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField35", (durationField27.compareTo(durationField35) == 0) == durationField27.equals(durationField35));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        long long24 = chronology16.add(97L, 4L, 70);
        org.joda.time.DurationField durationField25 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.clockhourOfDay();
        org.joda.time.DurationField durationField27 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField17, and durationField25", !(durationField27.compareTo(durationField17) == 0) || (Math.signum(durationField27.compareTo(durationField25)) == Math.signum(durationField17.compareTo(durationField25))));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DateTimeField dateTimeField38 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField42 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField43 = chronology17.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField42", Math.signum(durationField19.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField19)));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.year();
        int int42 = dateTimeField40.getMinimumValue((long) 2922789);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField49 = dateTimeField46.getDurationField();
        int int51 = dateTimeField46.getMaximumValue((long) (short) 1);
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray57 = new int[] { (byte) 100, 0, '4', (short) 1 };
        int int58 = dateTimeField46.getMaximumValue(readablePartial52, intArray57);
        int int59 = dateTimeField40.getMaximumValue(readablePartial43, intArray57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField49", (durationField38.compareTo(durationField49) == 0) == durationField38.equals(durationField49));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType1.getField(chronology18);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology18, locale24, (java.lang.Integer) 292278993);
        dateTimeParserBucket29.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        boolean boolean38 = dateTimeField37.isLenient();
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str42 = locale41.getDisplayName();
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.lang.String str44 = locale43.getLanguage();
        java.lang.String str45 = locale41.getDisplayName(locale43);
        java.lang.String str46 = dateTimeField37.getAsText(readablePartial39, (int) 'x', locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology34, locale43, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.weekOfWeekyear();
        org.joda.time.DurationField durationField51 = chronology49.hours();
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology49, locale52, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField55 = chronology49.months();
        org.joda.time.DateTimeField dateTimeField56 = chronology49.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = chronology49.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField58 = chronology49.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        long long62 = dateTimeZone59.getMillisKeepLocal(dateTimeZone60, 1L);
        long long64 = dateTimeZone60.previousTransition(0L);
        org.joda.time.Chronology chronology65 = chronology49.withZone(dateTimeZone60);
        boolean boolean66 = dateTimeParserBucket29.restoreState((java.lang.Object) chronology49);
        org.joda.time.DurationField durationField67 = chronology49.weeks();
        org.joda.time.DateTimeField dateTimeField68 = chronology49.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long74 = dateTimeZone71.convertLocalToUTC(630288005148L, true);
        java.lang.String str76 = dateTimeZone71.getShortName(360000010L);
        org.joda.time.Chronology chronology77 = chronology49.withZone(dateTimeZone71);
        org.joda.time.DurationField durationField78 = chronology49.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField78, durationField19, and durationField51", !(durationField78.compareTo(durationField19) == 0) || (Math.signum(durationField78.compareTo(durationField51)) == Math.signum(durationField19.compareTo(durationField51))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology16.halfdays();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField20, and durationField22", !(durationField23.compareTo(durationField20) == 0) || (Math.signum(durationField23.compareTo(durationField22)) == Math.signum(durationField20.compareTo(durationField22))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        boolean boolean10 = dateTimeField9.isLenient();
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale13.getDisplayName(locale15);
        java.lang.String str18 = dateTimeField9.getAsText(readablePartial11, (int) 'x', locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology6, locale15, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType4.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType0.getField(chronology21);
        org.joda.time.DurationField durationField27 = chronology21.eras();
        org.joda.time.DurationField durationField28 = chronology21.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField27", Math.signum(durationField22.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField22)));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField29 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField30 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField31 = chronology17.weeks();
        org.joda.time.DateTimeField dateTimeField32 = chronology17.weekyear();
        org.joda.time.DurationField durationField33 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField19, and durationField23", !(durationField33.compareTo(durationField19) == 0) || (Math.signum(durationField33.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField21 = chronology16.weekyears();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology16.add(readablePeriod22, 1344L, 4);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.millisOfSecond();
        org.joda.time.Chronology chronology28 = chronology16.withUTC();
        org.joda.time.DurationField durationField29 = chronology16.months();
        org.joda.time.Chronology chronology30 = chronology16.withUTC();
        org.joda.time.DurationField durationField31 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField17, and durationField21", !(durationField31.compareTo(durationField17) == 0) || (Math.signum(durationField31.compareTo(durationField21)) == Math.signum(durationField17.compareTo(durationField21))));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        boolean boolean10 = dateTimeField9.isLenient();
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale13.getDisplayName(locale15);
        java.lang.String str18 = dateTimeField9.getAsText(readablePartial11, (int) 'x', locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology6, locale15, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType4.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType0.getField(chronology21);
        org.joda.time.DurationField durationField27 = chronology21.eras();
        long long31 = chronology21.add(132539450865000000L, 60L, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField27", Math.signum(durationField22.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField22)));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long26 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        int int32 = dateTimeField30.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField33 = dateTimeField30.getDurationField();
        int int35 = dateTimeField30.getMaximumValue((long) (short) 1);
        long long37 = dateTimeField30.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder40.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder44 = builder40.clearExtensions();
        java.util.Locale locale45 = builder44.build();
        java.lang.String str46 = dateTimeField30.getAsShortText(readablePartial38, (int) (byte) 100, locale45);
        java.util.Set<java.lang.String> strSet47 = locale45.getUnicodeLocaleKeys();
        java.lang.String str48 = dateTimeZone23.getShortName((long) 1970, locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale45);
        org.joda.time.Chronology chronology50 = chronology17.withUTC();
        org.joda.time.DurationField durationField51 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField20, and durationField33", !(durationField51.compareTo(durationField20) == 0) || (Math.signum(durationField51.compareTo(durationField33)) == Math.signum(durationField20.compareTo(durationField33))));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        int int18 = dateTimeParserBucket15.getOffset();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology19.weekyears();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology23, locale24, (java.lang.Integer) 1);
        java.lang.Object obj27 = dateTimeParserBucket26.saveState();
        long long28 = dateTimeParserBucket26.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long32 = dateTimeZone29.getMillisKeepLocal(dateTimeZone30, 1L);
        java.lang.String str33 = dateTimeZone30.getID();
        dateTimeParserBucket26.setZone(dateTimeZone30);
        dateTimeParserBucket26.setPivotYear((java.lang.Integer) 292278993);
        dateTimeParserBucket26.setOffset((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket26.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        int int44 = dateTimeField42.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField45 = dateTimeField42.getDurationField();
        int int47 = dateTimeField42.getMaximumValue((long) (short) 1);
        long long49 = dateTimeField42.roundHalfEven((long) ' ');
        int int51 = dateTimeField42.getMinimumValue((long) 100);
        org.joda.time.ReadablePartial readablePartial52 = null;
        int int53 = dateTimeField42.getMaximumValue(readablePartial52);
        int int55 = dateTimeField42.getLeapAmount((long) 'a');
        org.joda.time.ReadablePartial readablePartial56 = null;
        java.util.Locale locale58 = java.util.Locale.JAPAN;
        java.util.Locale locale59 = java.util.Locale.US;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleKeys();
        java.lang.String str62 = dateTimeField42.getAsShortText(readablePartial56, 100, locale59);
        long long64 = dateTimeField42.roundHalfEven(4039732800000L);
        long long66 = dateTimeField42.roundCeiling(1982L);
        dateTimeParserBucket26.saveField(dateTimeField42, 52);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket26.getZone();
        org.joda.time.Chronology chronology70 = chronology19.withZone(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField45", (durationField21.compareTo(durationField45) == 0) == durationField21.equals(durationField45));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        java.lang.String str3 = dateTimeFieldType0.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        int int8 = dateTimeField6.getLeapAmount((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = dateTimeField6.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType14.getField(chronology15);
        boolean boolean17 = dateTimeField16.isLenient();
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale locale22 = java.util.Locale.ITALY;
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale20.getDisplayName(locale22);
        java.lang.String str25 = dateTimeField16.getAsText(readablePartial18, (int) 'x', locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology13, locale22, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.seconds();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType11.getField(chronology28);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.JAPAN;
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(0L, chronology33, locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology28, locale34, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone40.getMillisKeepLocal(dateTimeZone41, 1L);
        int int45 = dateTimeZone40.getOffsetFromLocal((long) (short) 0);
        boolean boolean47 = dateTimeZone40.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology48 = chronology28.withZone(dateTimeZone40);
        long long52 = chronology48.add(19L, 1L, (int) (byte) -1);
        boolean boolean53 = dateTimeFieldType9.isSupported(chronology48);
        org.joda.time.DurationField durationField54 = chronology48.weekyears();
        org.joda.time.DurationField durationField55 = chronology48.years();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType0.getField(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField54 and durationField55", (durationField54.compareTo(durationField55) == 0) == durationField54.equals(durationField55));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology17.getZone();
        boolean boolean20 = dateTimeFieldType0.isSupported(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField22", Math.signum(durationField21.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField21)));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DurationField durationField18 = chronology16.seconds();
        org.joda.time.DurationField durationField19 = chronology16.seconds();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField18, and durationField20", !(durationField22.compareTo(durationField18) == 0) || (Math.signum(durationField22.compareTo(durationField20)) == Math.signum(durationField18.compareTo(durationField20))));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        int int28 = dateTimeField26.getLeapAmount((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        int int34 = dateTimeField32.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField35 = dateTimeField32.getDurationField();
        int int37 = dateTimeField32.getMaximumValue((long) (short) 1);
        long long39 = dateTimeField32.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder42.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder46 = builder42.clearExtensions();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = dateTimeField32.getAsShortText(readablePartial40, (int) (byte) 100, locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet50 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str51 = dateTimeField26.getAsText((int) 'u', locale47);
        java.lang.String str53 = locale47.getExtension('a');
        int int54 = dateTimeField23.getMaximumTextLength(locale47);
        int int56 = dateTimeField23.getMaximumValue((-66L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField35", (durationField21.compareTo(durationField35) == 0) == durationField21.equals(durationField35));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField40 = chronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        int int44 = dateTimeZone42.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Set<java.lang.String> strSet49 = locale47.getUnicodeLocaleKeys();
        java.lang.String str50 = dateTimeZone42.getShortName((long) 100, locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(4200010L, chronology19, locale47, (java.lang.Integer) 366, 99);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long59 = dateTimeZone56.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType61.getField(chronology62);
        int int65 = dateTimeField63.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField66 = dateTimeField63.getDurationField();
        int int68 = dateTimeField63.getMaximumValue((long) (short) 1);
        long long70 = dateTimeField63.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale.Builder builder73 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder76 = builder73.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder77 = builder73.clearExtensions();
        java.util.Locale locale78 = builder77.build();
        java.lang.String str79 = dateTimeField63.getAsShortText(readablePartial71, (int) (byte) 100, locale78);
        java.util.Set<java.lang.String> strSet80 = locale78.getUnicodeLocaleKeys();
        java.lang.String str81 = dateTimeZone56.getShortName((long) 1970, locale78);
        long long84 = dateTimeZone56.adjustOffset(3061065600000L, true);
        long long87 = dateTimeZone56.adjustOffset(127L, false);
        long long90 = dateTimeZone56.convertLocalToUTC(7200999L, true);
        org.joda.time.Chronology chronology91 = chronology19.withZone(dateTimeZone56);
        org.joda.time.DateTimeField dateTimeField92 = chronology91.halfdayOfDay();
        org.joda.time.DurationField durationField93 = chronology91.years();
        org.joda.time.DateTimeField dateTimeField94 = chronology91.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField66 and durationField93", (durationField66.compareTo(durationField93) == 0) == durationField66.equals(durationField93));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        java.lang.String str17 = locale16.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet18 = locale16.getExtensionKeys();
        java.lang.String str19 = locale16.getDisplayScript();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        boolean boolean25 = dateTimeField24.isLenient();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale28.getDisplayName();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale28.getDisplayName(locale30);
        java.lang.String str33 = dateTimeField24.getAsText(readablePartial26, (int) 'x', locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology21, locale30, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.seconds();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfMinute();
        org.joda.time.DurationField durationField41 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology36.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        int int54 = dateTimeField52.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField55 = dateTimeField52.getDurationField();
        int int57 = dateTimeField52.getMaximumValue((long) (short) 1);
        long long59 = dateTimeField52.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial60 = null;
        java.util.Locale.Builder builder62 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder65 = builder62.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder66 = builder62.clearExtensions();
        java.util.Locale locale67 = builder66.build();
        java.lang.String str68 = dateTimeField52.getAsShortText(readablePartial60, (int) (byte) 100, locale67);
        java.util.Set<java.lang.String> strSet69 = locale67.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet70 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str71 = dateTimeField46.getAsText((int) 'u', locale67);
        java.lang.String str73 = locale67.getExtension('a');
        int int74 = dateTimeField43.getMaximumTextLength(locale67);
        java.lang.String str75 = locale16.getDisplayVariant(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField55", (durationField41.compareTo(durationField55) == 0) == durationField41.equals(durationField55));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = dateTimeField2.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        boolean boolean13 = dateTimeField12.isLenient();
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale16.getDisplayName(locale18);
        java.lang.String str21 = dateTimeField12.getAsText(readablePartial14, (int) 'x', locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology9, locale18, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.seconds();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType7.getField(chronology24);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology24, locale30, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.getMillisKeepLocal(dateTimeZone37, 1L);
        int int41 = dateTimeZone36.getOffsetFromLocal((long) (short) 0);
        boolean boolean43 = dateTimeZone36.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology44 = chronology24.withZone(dateTimeZone36);
        long long48 = chronology44.add(19L, 1L, (int) (byte) -1);
        boolean boolean49 = dateTimeFieldType5.isSupported(chronology44);
        org.joda.time.DurationField durationField50 = chronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology44.weeks();
        org.joda.time.DateTimeField dateTimeField53 = chronology44.millisOfSecond();
        org.joda.time.DurationField durationField54 = chronology44.years();
        org.joda.time.DateTimeField dateTimeField55 = chronology44.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField50 and durationField54", (durationField50.compareTo(durationField54) == 0) == durationField50.equals(durationField54));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DurationField durationField22 = chronology16.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.millisOfDay();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField17, and durationField22", !(durationField24.compareTo(durationField17) == 0) || (Math.signum(durationField24.compareTo(durationField22)) == Math.signum(durationField17.compareTo(durationField22))));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.getMillisKeepLocal(dateTimeZone24, 1L);
        long long29 = dateTimeZone24.adjustOffset(1L, true);
        long long31 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.String str33 = dateTimeZone24.getNameKey(0L);
        int int35 = dateTimeZone24.getOffset((long) 10);
        org.joda.time.Chronology chronology36 = chronology17.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField39 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.millisOfDay();
        org.joda.time.Chronology chronology41 = chronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField43 = chronology36.weekyear();
        org.joda.time.ReadablePartial readablePartial44 = null;
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.util.Locale locale47 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale47);
        java.lang.String str49 = locale46.getDisplayCountry(locale47);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        int int54 = dateTimeField52.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField55 = dateTimeField52.getDurationField();
        int int57 = dateTimeField52.getMaximumValue((long) (short) 1);
        long long59 = dateTimeField52.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial60 = null;
        java.util.Locale.Builder builder62 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder65 = builder62.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder66 = builder62.clearExtensions();
        java.util.Locale locale67 = builder66.build();
        java.lang.String str68 = dateTimeField52.getAsShortText(readablePartial60, (int) (byte) 100, locale67);
        java.util.Set<java.lang.String> strSet69 = locale67.getUnicodeLocaleKeys();
        java.lang.String str70 = locale47.getDisplayScript(locale67);
        java.lang.String str71 = dateTimeField43.getAsShortText(readablePartial44, (int) 'a', locale47);
        org.joda.time.ReadablePartial readablePartial72 = null;
        int int73 = dateTimeField43.getMaximumValue(readablePartial72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField55", (durationField39.compareTo(durationField55) == 0) == durationField39.equals(durationField55));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale40, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology18.dayOfWeek();
        java.lang.String str46 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField47 = chronology18.monthOfYear();
        org.joda.time.DurationField durationField48 = chronology18.weeks();
        org.joda.time.DurationField durationField49 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology18.hourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology18.weekyears();
        org.joda.time.DurationField durationField53 = chronology18.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField49 and durationField52", (durationField49.compareTo(durationField52) == 0) == durationField49.equals(durationField52));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfDay();
        org.joda.time.DurationField durationField20 = chronology16.weekyears();
        org.joda.time.DurationField durationField21 = chronology16.months();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField23 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField24 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField25 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        boolean boolean34 = dateTimeField33.isLenient();
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str38 = locale37.getDisplayName();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = locale39.getLanguage();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = dateTimeField33.getAsText(readablePartial35, (int) 'x', locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology30, locale39, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        java.util.Locale locale47 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology45, locale47, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField52 = chronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField53 = chronology45.dayOfMonth();
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        boolean boolean56 = locale55.hasExtensions();
        java.lang.String str57 = locale55.getISO3Country();
        boolean boolean58 = locale55.hasExtensions();
        java.lang.String str59 = dateTimeField53.getAsText(20, locale55);
        org.joda.time.ReadablePartial readablePartial60 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType61.getField(chronology62);
        int int65 = dateTimeField63.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField66 = dateTimeField63.getDurationField();
        int int68 = dateTimeField63.getMaximumValue((long) (short) 1);
        org.joda.time.ReadablePartial readablePartial69 = null;
        int[] intArray75 = new int[] { '#', '4', '#', (byte) 0, (short) 1 };
        int int76 = dateTimeField63.getMaximumValue(readablePartial69, intArray75);
        int int77 = dateTimeField53.getMinimumValue(readablePartial60, intArray75);
        int int78 = dateTimeField26.getMinimumValue(readablePartial27, intArray75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField66", (durationField20.compareTo(durationField66) == 0) == durationField20.equals(durationField66));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.monthOfYear();
        java.lang.String str21 = chronology17.toString();
        long long25 = chronology17.add(97L, 4L, 70);
        org.joda.time.DurationField durationField26 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.centuryOfEra();
        java.util.Locale locale31 = new java.util.Locale("\u4e2d\u6587\u4e2d\u56fd)", "52");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(120001L, chronology17, locale31, (java.lang.Integer) (-59), 292278993);
        org.joda.time.DurationField durationField35 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField18, and durationField26", !(durationField35.compareTo(durationField18) == 0) || (Math.signum(durationField35.compareTo(durationField26)) == Math.signum(durationField18.compareTo(durationField26))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfSecond();
        org.joda.time.DurationField durationField21 = chronology16.hours();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField17, and durationField19", !(durationField22.compareTo(durationField17) == 0) || (Math.signum(durationField22.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology20, locale21, (java.lang.Integer) 1);
        java.lang.Object obj24 = dateTimeParserBucket23.saveState();
        long long25 = dateTimeParserBucket23.computeMillis();
        java.lang.Object obj26 = dateTimeParserBucket23.saveState();
        dateTimeParserBucket23.setOffset((java.lang.Integer) 1);
        java.lang.Object obj29 = dateTimeParserBucket23.saveState();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology31, locale32, (java.lang.Integer) 1);
        java.lang.Object obj35 = dateTimeParserBucket34.saveState();
        long long36 = dateTimeParserBucket34.computeMillis();
        dateTimeParserBucket34.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType39.getField(chronology40);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        dateTimeParserBucket34.saveField(dateTimeFieldType39, "zh_CN", locale43);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        boolean boolean47 = locale46.hasExtensions();
        java.lang.String str48 = locale46.getISO3Country();
        boolean boolean49 = locale46.hasExtensions();
        java.lang.String str50 = locale46.getISO3Language();
        dateTimeParserBucket23.saveField(dateTimeFieldType39, "hi!", locale46);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeParserBucket23.getZone();
        long long54 = dateTimeZone52.previousTransition((-58979923200001L));
        org.joda.time.Chronology chronology55 = chronology16.withZone(dateTimeZone52);
        org.joda.time.DurationField durationField56 = chronology55.centuries();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.weekyearOfCentury();
        org.joda.time.DurationField durationField58 = chronology55.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField18, and durationField56", !(durationField58.compareTo(durationField18) == 0) || (Math.signum(durationField58.compareTo(durationField56)) == Math.signum(durationField18.compareTo(durationField56))));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology17.getZone();
        org.joda.time.DurationField durationField42 = chronology17.weeks();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        long long52 = dateTimeParserBucket48.computeMillis(true, "120");
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology54 = chronology17.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField55 = chronology54.weeks();
        org.joda.time.DateTimeZone dateTimeZone56 = chronology54.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField55", (durationField42.compareTo(durationField55) == 0) == durationField42.equals(durationField55));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DurationField durationField21 = chronology16.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField20", Math.signum(durationField18.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField18)));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        java.util.Locale locale41 = dateTimeParserBucket40.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale44 = java.util.Locale.JAPAN;
        java.util.Locale locale45 = java.util.Locale.US;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.lang.String str47 = locale44.getCountry();
        java.lang.String str48 = locale44.getISO3Country();
        dateTimeParserBucket40.saveField(dateTimeFieldType42, "CHN", locale44);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket40.getChronology();
        org.joda.time.Chronology chronology51 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.eras();
        org.joda.time.DurationField durationField53 = chronology51.eras();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.dayOfYear();
        boolean boolean55 = dateTimeFieldType17.isSupported(chronology51);
        org.joda.time.DurationField durationField56 = chronology51.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField56, and durationField52", !(durationField52.compareTo(durationField56) == 0) || (Math.signum(durationField52.compareTo(durationField52)) == Math.signum(durationField56.compareTo(durationField52))));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.millisOfSecond();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getLanguage();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27);
        java.lang.Integer int31 = dateTimeParserBucket30.getPivotYear();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology33, locale34, (java.lang.Integer) 1);
        java.lang.Object obj37 = dateTimeParserBucket36.saveState();
        long long38 = dateTimeParserBucket36.computeMillis();
        dateTimeParserBucket36.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType41.getField(chronology42);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        dateTimeParserBucket36.saveField(dateTimeFieldType41, "zh_CN", locale45);
        boolean boolean47 = dateTimeParserBucket30.restoreState((java.lang.Object) locale45);
        java.lang.String str48 = locale23.getDisplayVariant(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(967766400010L, chronology17, locale45, (java.lang.Integer) 10);
        org.joda.time.DurationField durationField51 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField52 = chronology17.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField51", Math.signum(durationField20.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField20)));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.era();
        org.joda.time.DurationField durationField20 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.clockhourOfHalfday();
        org.joda.time.Chronology chronology23 = chronology16.withUTC();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        long long28 = chronology16.add((-4238564371201977L), 0L, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField24", Math.signum(durationField18.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField18)));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DurationField durationField39 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekyear();
        org.joda.time.DurationField durationField41 = dateTimeField40.getDurationField();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder43.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder47 = builder43.clearExtensions();
        java.util.Locale locale48 = builder47.build();
        java.util.Locale locale49 = builder47.build();
        java.lang.String str50 = locale49.getDisplayLanguage();
        java.lang.String str51 = dateTimeField40.getAsText(0, locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField41", (durationField38.compareTo(durationField41) == 0) == durationField38.equals(durationField41));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DurationField durationField39 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField41 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = chronology18.secondOfMinute();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("-1");
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType47.getField(chronology48);
        boolean boolean50 = dateTimeField49.isLenient();
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getDisplayName();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.lang.String str56 = locale55.getLanguage();
        java.lang.String str57 = locale53.getDisplayName(locale55);
        java.lang.String str58 = dateTimeField49.getAsText(readablePartial51, (int) 'x', locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology46, locale55, (java.lang.Integer) (-1));
        java.util.Locale locale61 = dateTimeParserBucket60.getLocale();
        java.lang.String str62 = locale61.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet63 = locale61.getExtensionKeys();
        java.lang.String str64 = locale44.getDisplayLanguage(locale61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType65.getField(chronology66);
        int int69 = dateTimeField67.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField70 = dateTimeField67.getDurationField();
        int int72 = dateTimeField67.getMaximumValue((long) (short) 1);
        long long74 = dateTimeField67.roundHalfEven((long) ' ');
        int int76 = dateTimeField67.getMinimumValue((long) 100);
        int int77 = dateTimeField67.getMinimumValue();
        java.util.Locale locale82 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str83 = dateTimeField67.getAsShortText((int) '#', locale82);
        java.util.Locale locale84 = java.util.Locale.JAPAN;
        java.util.Locale locale85 = java.util.Locale.JAPAN;
        java.lang.String str86 = locale84.getDisplayVariant(locale85);
        int int87 = dateTimeField67.getMaximumShortTextLength(locale84);
        java.lang.String str88 = locale44.getDisplayCountry(locale84);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((-31536025001L), chronology18, locale44, (java.lang.Integer) 3540000, 67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField70", (durationField39.compareTo(durationField70) == 0) == durationField39.equals(durationField70));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.minuteOfDay();
        java.lang.String str20 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField22 = chronology16.millis();
        org.joda.time.DurationField durationField23 = chronology16.days();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField18, and durationField23", !(durationField24.compareTo(durationField18) == 0) || (Math.signum(durationField24.compareTo(durationField23)) == Math.signum(durationField18.compareTo(durationField23))));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str34 = locale30.getExtension('a');
        java.lang.String str35 = locale29.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale29);
        org.joda.time.DurationField durationField37 = chronology27.years();
        long long41 = chronology27.add(631065605000L, 378687000001L, (-1));
        org.joda.time.DurationField durationField42 = chronology27.years();
        org.joda.time.DurationField durationField43 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField18, and durationField37", !(durationField43.compareTo(durationField18) == 0) || (Math.signum(durationField43.compareTo(durationField37)) == Math.signum(durationField18.compareTo(durationField37))));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        int int9 = dateTimeField7.getLeapAmount((long) 0);
        int int11 = dateTimeField7.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray17 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int18 = dateTimeField7.getMaximumValue(readablePartial12, intArray17);
        int int19 = dateTimeField7.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField7.getType();
        java.util.Locale locale25 = new java.util.Locale("zh_CN", "China", "");
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        dateTimeParserBucket4.saveField(dateTimeFieldType20, "120", locale25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        boolean boolean33 = dateTimeField32.isLenient();
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.lang.String str39 = locale38.getLanguage();
        java.lang.String str40 = locale36.getDisplayName(locale38);
        java.lang.String str41 = dateTimeField32.getAsText(readablePartial34, (int) 'x', locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology29, locale38, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.seconds();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.monthOfYear();
        boolean boolean49 = dateTimeFieldType20.isSupported(chronology44);
        org.joda.time.DurationField durationField50 = chronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField51 = chronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField52 = chronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = chronology44.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField54 = chronology44.millisOfDay();
        org.joda.time.DurationField durationField55 = chronology44.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField45, and durationField50", !(durationField55.compareTo(durationField45) == 0) || (Math.signum(durationField55.compareTo(durationField50)) == Math.signum(durationField45.compareTo(durationField50))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, 1L);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology27 = chronology17.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str34 = locale30.getExtension('a');
        java.lang.String str35 = locale29.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale29);
        org.joda.time.DurationField durationField37 = chronology27.minutes();
        org.joda.time.DurationField durationField38 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField18, and durationField37", !(durationField38.compareTo(durationField18) == 0) || (Math.signum(durationField38.compareTo(durationField37)) == Math.signum(durationField18.compareTo(durationField37))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.getMillisKeepLocal(dateTimeZone24, 1L);
        long long29 = dateTimeZone24.adjustOffset(1L, true);
        long long31 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.String str33 = dateTimeZone24.getNameKey(0L);
        int int35 = dateTimeZone24.getOffset((long) 10);
        org.joda.time.Chronology chronology36 = chronology17.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField39 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.millisOfDay();
        org.joda.time.DurationField durationField41 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField41", (durationField39.compareTo(durationField41) == 0) == durationField39.equals(durationField41));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = dateTimeField2.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        boolean boolean13 = dateTimeField12.isLenient();
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale16.getDisplayName(locale18);
        java.lang.String str21 = dateTimeField12.getAsText(readablePartial14, (int) 'x', locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology9, locale18, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.seconds();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType7.getField(chronology24);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology24, locale30, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.getMillisKeepLocal(dateTimeZone37, 1L);
        int int41 = dateTimeZone36.getOffsetFromLocal((long) (short) 0);
        boolean boolean43 = dateTimeZone36.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology44 = chronology24.withZone(dateTimeZone36);
        long long48 = chronology44.add(19L, 1L, (int) (byte) -1);
        boolean boolean49 = dateTimeFieldType5.isSupported(chronology44);
        org.joda.time.DurationField durationField50 = chronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField52 = chronology44.weeks();
        org.joda.time.DateTimeField dateTimeField53 = chronology44.millisOfSecond();
        org.joda.time.DurationField durationField54 = chronology44.years();
        org.joda.time.DateTimeField dateTimeField55 = chronology44.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField50 and durationField54", (durationField50.compareTo(durationField54) == 0) == durationField50.equals(durationField54));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("china");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(4200000L, chronology19, locale41);
        org.joda.time.DateTimeField dateTimeField43 = chronology19.year();
        org.joda.time.DurationField durationField44 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology19.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField44", Math.signum(durationField20.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField20)));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("UTC");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale3.getDisplayCountry(locale4);
        boolean boolean10 = locale3.hasExtensions();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale13 = new java.util.Locale("Chinook jargon");
        java.lang.String str15 = locale13.getExtension('x');
        java.util.Locale.setDefault(category0, locale13);
        java.lang.String str17 = locale13.getDisplayVariant();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        long long22 = dateTimeField20.roundHalfEven((long) 10);
        long long24 = dateTimeField20.roundHalfEven(120001L);
        org.joda.time.DurationField durationField25 = dateTimeField20.getRangeDurationField();
        int int28 = dateTimeField20.getDifference((long) 12, (long) (byte) -1);
        org.joda.time.DurationField durationField29 = dateTimeField20.getLeapDurationField();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        boolean boolean37 = dateTimeField36.isLenient();
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str41 = locale40.getDisplayName();
        java.util.Locale locale42 = java.util.Locale.ITALY;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = dateTimeField36.getAsText(readablePartial38, (int) 'x', locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale42, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.seconds();
        java.util.Locale locale50 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology48, locale50, (java.lang.Integer) 1970);
        java.util.Set<java.lang.Character> charSet53 = locale50.getExtensionKeys();
        java.lang.String str54 = locale50.getLanguage();
        java.lang.String str55 = dateTimeField20.getAsShortText((-6774364799561L), locale50);
        java.lang.String str56 = locale50.getLanguage();
        java.lang.String str57 = locale50.getDisplayCountry();
        java.lang.String str58 = locale13.getDisplayVariant(locale50);
        java.lang.String str59 = locale50.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField49", (durationField25.compareTo(durationField49) == 0) == durationField25.equals(durationField49));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        int int36 = dateTimeZone31.getOffsetFromLocal((long) (short) 0);
        boolean boolean38 = dateTimeZone31.equals((java.lang.Object) "it");
        org.joda.time.Chronology chronology39 = chronology19.withZone(dateTimeZone31);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("china");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(4200000L, chronology19, locale41);
        org.joda.time.DateTimeField dateTimeField43 = chronology19.year();
        org.joda.time.DurationField durationField44 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology19.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField44", Math.signum(durationField20.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField20)));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology17, locale19, (java.lang.Integer) 1970);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        java.lang.String str24 = dateTimeField22.getAsShortText((long) 'u');
        long long26 = dateTimeField22.roundHalfFloor((long) 10);
        boolean boolean27 = dateTimeField22.isSupported();
        org.joda.time.DurationField durationField28 = dateTimeField22.getLeapDurationField();
        long long30 = dateTimeField22.remainder((-1893455999001L));
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33, (java.lang.Integer) 1);
        java.lang.Object obj36 = dateTimeParserBucket35.saveState();
        long long37 = dateTimeParserBucket35.computeMillis();
        java.util.Locale locale38 = dateTimeParserBucket35.getLocale();
        int int39 = dateTimeField22.getMaximumShortTextLength(locale38);
        java.lang.String str40 = locale38.getISO3Language();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        boolean boolean46 = dateTimeField45.isLenient();
        org.joda.time.ReadablePartial readablePartial47 = null;
        java.util.Locale locale49 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str50 = locale49.getDisplayName();
        java.util.Locale locale51 = java.util.Locale.ITALY;
        java.lang.String str52 = locale51.getLanguage();
        java.lang.String str53 = locale49.getDisplayName(locale51);
        java.lang.String str54 = dateTimeField45.getAsText(readablePartial47, (int) 'x', locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology42, locale51, (java.lang.Integer) (-1));
        java.util.Locale locale57 = dateTimeParserBucket56.getLocale();
        long long58 = dateTimeParserBucket56.computeMillis();
        long long61 = dateTimeParserBucket56.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket56.saveField(dateTimeFieldType62, 9);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        boolean boolean71 = dateTimeField70.isLenient();
        org.joda.time.ReadablePartial readablePartial72 = null;
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str75 = locale74.getDisplayName();
        java.util.Locale locale76 = java.util.Locale.ITALY;
        java.lang.String str77 = locale76.getLanguage();
        java.lang.String str78 = locale74.getDisplayName(locale76);
        java.lang.String str79 = dateTimeField70.getAsText(readablePartial72, (int) 'x', locale76);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology67, locale76, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology82 = dateTimeParserBucket81.getChronology();
        java.util.Locale locale84 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology82, locale84, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField88 = dateTimeFieldType62.getField(chronology82);
        java.lang.String str89 = chronology82.toString();
        org.joda.time.DateTimeField dateTimeField90 = chronology82.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField91 = chronology82.weekyear();
        org.joda.time.DurationField durationField92 = chronology82.eras();
        org.joda.time.DateTimeField dateTimeField93 = chronology82.centuryOfEra();
        boolean boolean94 = locale38.equals((java.lang.Object) dateTimeField93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField92", Math.signum(durationField18.compareTo(durationField92)) == -Math.signum(durationField92.compareTo(durationField18)));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology16.getZone();
        org.joda.time.DurationField durationField19 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.era();
        org.joda.time.DurationField durationField21 = chronology16.weekyears();
        java.lang.String str22 = chronology16.toString();
        java.lang.String str23 = chronology16.toString();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField19, and durationField21", !(durationField24.compareTo(durationField19) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField19.compareTo(durationField21))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.millis();
        boolean boolean43 = dateTimeFieldType17.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.Chronology chronology47 = chronology41.withZone(dateTimeZone46);
        org.joda.time.DurationField durationField48 = chronology47.eras();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField48", Math.signum(durationField42.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField42)));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        java.lang.String str21 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology16.minutes();
        org.joda.time.DurationField durationField24 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField25 = chronology16.era();
        org.joda.time.DurationField durationField26 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField17, and durationField23", !(durationField26.compareTo(durationField17) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField17.compareTo(durationField23))));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfSecond();
        long long33 = chronology17.add((-2L), 13L, (-4200000));
        org.joda.time.DateTimeField dateTimeField34 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField36 = chronology17.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField35", (durationField27.compareTo(durationField35) == 0) == durationField27.equals(durationField35));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology19.millis();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField(chronology26);
        boolean boolean28 = dateTimeField27.isLenient();
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale31.getDisplayName();
        java.util.Locale locale33 = java.util.Locale.ITALY;
        java.lang.String str34 = locale33.getLanguage();
        java.lang.String str35 = locale31.getDisplayName(locale33);
        java.lang.String str36 = dateTimeField27.getAsText(readablePartial29, (int) 'x', locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology24, locale33, (java.lang.Integer) (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.util.Locale locale41 = java.util.Locale.UK;
        dateTimeParserBucket38.saveField(dateTimeFieldType39, "Chinese (China)", locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'x', chronology19, locale41, (java.lang.Integer) 12, 100);
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType0.getField(chronology19);
        org.joda.time.DurationField durationField47 = chronology19.minutes();
        org.joda.time.DateTimeField dateTimeField48 = chronology19.dayOfMonth();
        org.joda.time.DurationField durationField49 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField22, and durationField47", !(durationField49.compareTo(durationField22) == 0) || (Math.signum(durationField49.compareTo(durationField47)) == Math.signum(durationField22.compareTo(durationField47))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.getMillisKeepLocal(dateTimeZone24, 1L);
        long long29 = dateTimeZone24.adjustOffset(1L, true);
        long long31 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.String str33 = dateTimeZone24.getNameKey(0L);
        int int35 = dateTimeZone24.getOffset((long) 10);
        org.joda.time.Chronology chronology36 = chronology17.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField39 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.millisOfDay();
        org.joda.time.DurationField durationField41 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField41", (durationField39.compareTo(durationField41) == 0) == durationField39.equals(durationField41));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        long long43 = chronology17.add((long) 12, (long) (byte) 1, 10);
        org.joda.time.DurationField durationField44 = chronology17.minutes();
        org.joda.time.DurationField durationField45 = chronology17.hours();
        org.joda.time.DurationField durationField46 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField19, and durationField38", !(durationField46.compareTo(durationField19) == 0) || (Math.signum(durationField46.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3, (java.lang.Integer) 1);
        java.lang.Object obj6 = dateTimeParserBucket5.saveState();
        long long7 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj8 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        boolean boolean16 = dateTimeField15.isLenient();
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale locale19 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str20 = locale19.getDisplayName();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale19.getDisplayName(locale21);
        java.lang.String str24 = dateTimeField15.getAsText(readablePartial17, (int) 'x', locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology12, locale21, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = chronology27.hours();
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology27);
        org.joda.time.DateTimeField dateTimeField31 = chronology27.dayOfYear();
        org.joda.time.DurationField durationField32 = chronology27.weeks();
        org.joda.time.DurationField durationField33 = chronology27.weekyears();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        int int38 = dateTimeField36.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField39 = dateTimeField36.getDurationField();
        int int41 = dateTimeField36.getMaximumValue((long) (short) 1);
        long long43 = dateTimeField36.roundHalfEven((long) ' ');
        int int45 = dateTimeField36.getMinimumValue((long) 100);
        long long48 = dateTimeField36.add(0L, (long) 0);
        java.util.Locale locale49 = java.util.Locale.CANADA_FRENCH;
        int int50 = dateTimeField36.getMaximumTextLength(locale49);
        org.joda.time.DurationField durationField51 = dateTimeField36.getLeapDurationField();
        java.util.Locale locale52 = java.util.Locale.UK;
        int int53 = dateTimeField36.getMaximumShortTextLength(locale52);
        java.lang.String str54 = locale52.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 25200000, chronology27, locale52, (java.lang.Integer) (-762886), (-1789));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField39", (durationField33.compareTo(durationField39) == 0) == durationField33.equals(durationField39));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.year();
        org.joda.time.DurationField durationField29 = chronology25.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField29, and durationField27", !(durationField27.compareTo(durationField29) == 0) || (Math.signum(durationField27.compareTo(durationField27)) == Math.signum(durationField29.compareTo(durationField27))));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getName((long) (-1));
        boolean boolean25 = dateTimeZone21.isStandardOffset((long) 10);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField29 = dateTimeField28.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField29, and durationField18", !(durationField18.compareTo(durationField29) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField29.compareTo(durationField18))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfYear();
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        long long25 = dateTimeField23.roundHalfEven((long) 10);
        long long27 = dateTimeField23.roundHalfEven(120001L);
        org.joda.time.DurationField durationField28 = dateTimeField23.getRangeDurationField();
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType32.getField(chronology33);
        boolean boolean35 = dateTimeField34.isLenient();
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str39 = locale38.getDisplayName();
        java.util.Locale locale40 = java.util.Locale.ITALY;
        java.lang.String str41 = locale40.getLanguage();
        java.lang.String str42 = locale38.getDisplayName(locale40);
        java.lang.String str43 = dateTimeField34.getAsText(readablePartial36, (int) 'x', locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology31, locale40, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial49 = null;
        int[] intArray50 = null;
        int int51 = dateTimeField48.getMinimumValue(readablePartial49, intArray50);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        int int58 = dateTimeField56.getLeapAmount((long) 0);
        int int60 = dateTimeField56.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial61 = null;
        int[] intArray66 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int67 = dateTimeField56.getMaximumValue(readablePartial61, intArray66);
        int[] intArray69 = dateTimeField48.add(readablePartial52, (int) 'a', intArray66, (int) (short) 0);
        int int70 = dateTimeField23.getMinimumValue(readablePartial29, intArray69);
        int int71 = dateTimeField19.getMinimumValue(readablePartial20, intArray69);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = dateTimeField19.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField28", (durationField17.compareTo(durationField28) == 0) == durationField17.equals(durationField28));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        org.joda.time.Chronology chronology40 = chronology18.withUTC();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("ISOChronology[UTC]");
        java.lang.String str43 = locale42.getScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(946684800000L, chronology18, locale42, (java.lang.Integer) 421200000);
        org.joda.time.DateTimeField dateTimeField46 = chronology18.weekyear();
        org.joda.time.DurationField durationField47 = chronology18.weekyears();
        org.joda.time.DurationField durationField48 = chronology18.years();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        int int52 = dateTimeZone50.getOffsetFromLocal(100L);
        long long54 = dateTimeZone50.convertUTCToLocal((-259200000L));
        org.joda.time.Chronology chronology55 = chronology18.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField48", (durationField47.compareTo(durationField48) == 0) == durationField47.equals(durationField48));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType21.getDurationType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.seconds();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        java.lang.String str45 = chronology41.toString();
        java.lang.String str46 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        org.joda.time.DurationField durationField48 = chronology41.months();
        org.joda.time.DurationField durationField49 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField51 = chronology41.halfdayOfDay();
        org.joda.time.DurationField durationField52 = chronology41.seconds();
        long long56 = chronology41.add((long) 52, (-115200001L), 1969);
        org.joda.time.DurationField durationField57 = chronology41.weeks();
        org.joda.time.DurationField durationField58 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField42, and durationField48", !(durationField58.compareTo(durationField42) == 0) || (Math.signum(durationField58.compareTo(durationField48)) == Math.signum(durationField42.compareTo(durationField48))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology18, locale21, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField24 = chronology18.months();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology18.months();
        java.lang.String str31 = chronology18.toString();
        org.joda.time.DurationField durationField32 = chronology18.days();
        org.joda.time.Chronology chronology33 = chronology18.withUTC();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        long long38 = dateTimeField36.roundHalfEven((long) 10);
        long long40 = dateTimeField36.roundHalfEven(120001L);
        org.joda.time.DurationField durationField41 = dateTimeField36.getRangeDurationField();
        int int44 = dateTimeField36.getDifference((long) 12, (long) (byte) -1);
        org.joda.time.DurationField durationField45 = dateTimeField36.getLeapDurationField();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        boolean boolean53 = dateTimeField52.isLenient();
        org.joda.time.ReadablePartial readablePartial54 = null;
        java.util.Locale locale56 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str57 = locale56.getDisplayName();
        java.util.Locale locale58 = java.util.Locale.ITALY;
        java.lang.String str59 = locale58.getLanguage();
        java.lang.String str60 = locale56.getDisplayName(locale58);
        java.lang.String str61 = dateTimeField52.getAsText(readablePartial54, (int) 'x', locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology49, locale58, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.seconds();
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology64, locale66, (java.lang.Integer) 1970);
        java.util.Set<java.lang.Character> charSet69 = locale66.getExtensionKeys();
        java.lang.String str70 = locale66.getLanguage();
        java.lang.String str71 = dateTimeField36.getAsShortText((-6774364799561L), locale66);
        java.lang.String str72 = locale66.getLanguage();
        java.lang.String str73 = locale66.getDisplayVariant();
        java.util.Locale locale74 = locale66.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(62L, chronology18, locale66, (java.lang.Integer) 69, 363);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField65", (durationField41.compareTo(durationField65) == 0) == durationField41.equals(durationField65));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfWeek();
        boolean boolean24 = dateTimeField22.isLeap((-86399L));
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        boolean boolean34 = dateTimeField33.isLenient();
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str38 = locale37.getDisplayName();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = locale39.getLanguage();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = dateTimeField33.getAsText(readablePartial35, (int) 'x', locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology30, locale39, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.weekOfWeekyear();
        org.joda.time.DurationField durationField47 = chronology45.hours();
        java.util.Locale locale48 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology45, locale48, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField51 = chronology45.centuries();
        org.joda.time.DateTimeField dateTimeField52 = chronology45.hourOfDay();
        java.util.Locale locale54 = new java.util.Locale("cinese (Cina)");
        java.lang.String str55 = locale54.getDisplayLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 18000000, chronology45, locale54, (java.lang.Integer) (-51011448), (int) (byte) 10);
        java.util.Locale locale59 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str60 = locale59.getDisplayName();
        java.lang.String str61 = locale59.getDisplayCountry();
        java.lang.String str62 = locale59.getISO3Country();
        java.lang.String str63 = locale54.getDisplayCountry(locale59);
        java.util.Set<java.lang.String> strSet64 = locale54.getUnicodeLocaleAttributes();
        java.lang.String str65 = dateTimeField22.getAsText(readablePartial25, 0, locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField47", Math.signum(durationField20.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField20)));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.minuteOfDay();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        long long27 = dateTimeZone24.getMillisKeepLocal(dateTimeZone25, 1L);
        long long30 = dateTimeZone25.adjustOffset(1L, true);
        int int32 = dateTimeZone25.getOffsetFromLocal(0L);
        long long34 = dateTimeZone25.previousTransition((long) (byte) -1);
        long long36 = dateTimeZone25.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology37 = chronology17.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField38 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField40 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField18, and durationField38", !(durationField40.compareTo(durationField18) == 0) || (Math.signum(durationField40.compareTo(durationField38)) == Math.signum(durationField18.compareTo(durationField38))));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, 1L);
        boolean boolean25 = dateTimeZone22.isFixed();
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.year();
        org.joda.time.DurationField durationField31 = dateTimeField30.getDurationField();
        int int33 = dateTimeField30.getMinimumValue(967766399529L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField31", (durationField28.compareTo(durationField31) == 0) == durationField28.equals(durationField31));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long29 = dateTimeZone26.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType31.getField(chronology32);
        int int35 = dateTimeField33.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField36 = dateTimeField33.getDurationField();
        int int38 = dateTimeField33.getMaximumValue((long) (short) 1);
        long long40 = dateTimeField33.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder43.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder47 = builder43.clearExtensions();
        java.util.Locale locale48 = builder47.build();
        java.lang.String str49 = dateTimeField33.getAsShortText(readablePartial41, (int) (byte) 100, locale48);
        java.util.Set<java.lang.String> strSet50 = locale48.getUnicodeLocaleKeys();
        java.lang.String str51 = dateTimeZone26.getShortName((long) 1970, locale48);
        long long54 = dateTimeZone26.adjustOffset(3061065600000L, true);
        long long57 = dateTimeZone26.adjustOffset(127L, false);
        org.joda.time.Chronology chronology58 = chronology16.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology59 = chronology58.withUTC();
        org.joda.time.DurationField durationField60 = chronology58.seconds();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField60", (durationField17.compareTo(durationField60) == 0) == durationField17.equals(durationField60));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = chronology19.hours();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder24 = builder22.setLocale(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField(chronology26);
        boolean boolean28 = dateTimeField27.isLenient();
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale31.getDisplayName();
        java.util.Locale locale33 = java.util.Locale.ITALY;
        java.lang.String str34 = locale33.getLanguage();
        java.lang.String str35 = locale31.getDisplayName(locale33);
        java.lang.String str36 = dateTimeField27.getAsText(readablePartial29, (int) 'x', locale33);
        java.lang.String str37 = locale23.getDisplayLanguage(locale33);
        java.lang.String str38 = locale23.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology19, locale23);
        org.joda.time.DateTimeField dateTimeField40 = chronology19.minuteOfHour();
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale42 = null;
        java.lang.String str43 = locale41.getDisplayScript(locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(97L, chronology19, locale41, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField46 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = chronology19.clockhourOfHalfday();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType51.getField(chronology52);
        boolean boolean54 = dateTimeField53.isLenient();
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str58 = locale57.getDisplayName();
        java.util.Locale locale59 = java.util.Locale.ITALY;
        java.lang.String str60 = locale59.getLanguage();
        java.lang.String str61 = locale57.getDisplayName(locale59);
        java.lang.String str62 = dateTimeField53.getAsText(readablePartial55, (int) 'x', locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology50, locale59, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.clockhourOfDay();
        java.util.Locale locale69 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str70 = locale69.getDisplayName();
        java.util.Locale locale71 = java.util.Locale.ITALY;
        java.lang.String str72 = locale71.getLanguage();
        java.lang.String str73 = locale69.getDisplayName(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(967766400000L, chronology65, locale71, (java.lang.Integer) 70, 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(3124224000010L, chronology19, locale71, (java.lang.Integer) 2077);
        org.joda.time.Chronology chronology79 = chronology19.withUTC();
        org.joda.time.DurationField durationField80 = chronology79.eras();
        org.joda.time.DateTimeField dateTimeField81 = chronology79.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField80", Math.signum(durationField21.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField21)));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        long long24 = dateTimeField22.roundHalfEven((long) 10);
        org.joda.time.ReadablePartial readablePartial25 = null;
        int int26 = dateTimeField22.getMaximumValue(readablePartial25);
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale28.getExtension('a');
        java.lang.String str33 = dateTimeField22.getAsShortText(0L, locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale28);
        org.joda.time.DateTimeField dateTimeField35 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField36 = chronology17.years();
        org.joda.time.DurationField durationField37 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = chronology17.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField37", (durationField36.compareTo(durationField37) == 0) == durationField36.equals(durationField37));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        java.util.Locale locale6 = dateTimeParserBucket4.getLocale();
        dateTimeParserBucket4.setOffset((int) (byte) 1);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology9.weekyears();
        org.joda.time.DurationField durationField12 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.centuryOfEra();
        org.joda.time.DurationField durationField21 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.minuteOfDay();
        long long25 = dateTimeField22.set(4039372800000L, (int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField22.getType();
        long long29 = dateTimeField22.getDifferenceAsLong(97L, (long) 1910);
        long long31 = dateTimeField22.remainder((-1896400200L));
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        boolean boolean37 = dateTimeField36.isLenient();
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str41 = locale40.getDisplayName();
        java.util.Locale locale42 = java.util.Locale.ITALY;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = dateTimeField36.getAsText(readablePartial38, (int) 'x', locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale42, (java.lang.Integer) (-1));
        java.util.Locale locale48 = dateTimeParserBucket47.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.util.Locale locale52 = java.util.Locale.US;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale51.getCountry();
        java.lang.String str55 = locale51.getISO3Country();
        dateTimeParserBucket47.saveField(dateTimeFieldType49, "CHN", locale51);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket47.getChronology();
        org.joda.time.Chronology chronology58 = dateTimeParserBucket47.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.eras();
        org.joda.time.DurationField durationField60 = chronology58.eras();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.dayOfYear();
        java.util.Locale locale64 = new java.util.Locale("cinese (Cina)");
        java.lang.String str65 = locale64.getDisplayCountry();
        java.util.Locale locale67 = new java.util.Locale("cinese (Cina)");
        java.lang.String str68 = locale64.getDisplayVariant(locale67);
        java.lang.String str69 = dateTimeField61.getAsText(421200000, locale64);
        int int70 = dateTimeField22.getMaximumShortTextLength(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField59", Math.signum(durationField21.compareTo(durationField59)) == -Math.signum(durationField59.compareTo(durationField21)));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getISO3Country();
        dateTimeParserBucket15.saveField(dateTimeFieldType17, "CHN", locale19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.millis();
        boolean boolean43 = dateTimeFieldType17.isSupported(chronology41);
        org.joda.time.DurationField durationField44 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField44", Math.signum(durationField42.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField42)));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        boolean boolean23 = dateTimeField22.isLenient();
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale locale28 = java.util.Locale.ITALY;
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale26.getDisplayName(locale28);
        java.lang.String str31 = dateTimeField22.getAsText(readablePartial24, (int) 'x', locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology19, locale28, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.seconds();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.secondOfMinute();
        int int40 = dateTimeField38.getMaximumValue(0L);
        java.lang.String str41 = dateTimeField38.getName();
        dateTimeParserBucket15.saveField(dateTimeField38, 1969);
        java.lang.Object obj44 = dateTimeParserBucket15.saveState();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType47.getField(chronology48);
        boolean boolean50 = dateTimeField49.isLenient();
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale53.getDisplayName();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.lang.String str56 = locale55.getLanguage();
        java.lang.String str57 = locale53.getDisplayName(locale55);
        java.lang.String str58 = dateTimeField49.getAsText(readablePartial51, (int) 'x', locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology46, locale55, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial64 = null;
        int int65 = dateTimeField63.getMaximumValue(readablePartial64);
        dateTimeParserBucket15.saveField(dateTimeField63, (int) (byte) 1);
        java.lang.Integer int68 = dateTimeParserBucket15.getOffsetInteger();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 292320000);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType73.getField(chronology74);
        boolean boolean76 = dateTimeField75.isLenient();
        org.joda.time.ReadablePartial readablePartial77 = null;
        java.util.Locale locale79 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str80 = locale79.getDisplayName();
        java.util.Locale locale81 = java.util.Locale.ITALY;
        java.lang.String str82 = locale81.getLanguage();
        java.lang.String str83 = locale79.getDisplayName(locale81);
        java.lang.String str84 = dateTimeField75.getAsText(readablePartial77, (int) 'x', locale81);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology72, locale81, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology87 = dateTimeParserBucket86.getChronology();
        org.joda.time.DateTimeField dateTimeField88 = chronology87.hourOfDay();
        java.lang.String str89 = chronology87.toString();
        org.joda.time.DurationField durationField90 = chronology87.eras();
        org.joda.time.DateTimeField dateTimeField91 = chronology87.year();
        org.joda.time.DateTimeField dateTimeField92 = chronology87.millisOfSecond();
        dateTimeParserBucket15.saveField(dateTimeField92, 2067);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField90", Math.signum(durationField35.compareTo(durationField90)) == -Math.signum(durationField90.compareTo(durationField35)));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology16.millis();
        org.joda.time.DurationField durationField20 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField24 = chronology16.seconds();
        org.joda.time.DurationField durationField25 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField19, and durationField24", !(durationField25.compareTo(durationField19) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField19.compareTo(durationField24))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.joda.time.DurationField durationField23 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DurationField durationField18 = chronology16.months();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology16.weekyears();
        long long24 = chronology16.add(4039718400000L, 3155755800000L, 2067);
        org.joda.time.DateTimeField dateTimeField25 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField27 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField18, and durationField20", !(durationField27.compareTo(durationField18) == 0) || (Math.signum(durationField27.compareTo(durationField20)) == Math.signum(durationField18.compareTo(durationField20))));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField22 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType0.getField(chronology17);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.seconds();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType0.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.weekyear();
        org.joda.time.DurationField durationField47 = chronology40.weeks();
        org.joda.time.DateTimeField dateTimeField48 = chronology40.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.getMillisKeepLocal(dateTimeZone50, 1L);
        java.lang.String str54 = dateTimeZone49.getNameKey((long) '#');
        long long58 = dateTimeZone49.convertLocalToUTC((long) 'a', true, 0L);
        java.lang.String str60 = dateTimeZone49.getNameKey((-58979923200001L));
        java.lang.String str62 = dateTimeZone49.getShortName((long) (byte) -1);
        java.lang.String str64 = dateTimeZone49.getName((long) 9);
        long long67 = dateTimeZone49.convertLocalToUTC((long) 100, true);
        long long70 = dateTimeZone49.adjustOffset(132539198400000010L, false);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        long long74 = dateTimeZone71.getMillisKeepLocal(dateTimeZone72, 1L);
        long long77 = dateTimeZone72.adjustOffset(1L, true);
        boolean boolean78 = dateTimeZone72.isFixed();
        long long80 = dateTimeZone72.convertUTCToLocal((long) 100);
        java.util.TimeZone timeZone81 = dateTimeZone72.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        long long86 = dateTimeZone82.convertLocalToUTC((long) 1982, true, 0L);
        int int88 = dateTimeZone82.getStandardOffset(360000127L);
        long long90 = dateTimeZone49.getMillisKeepLocal(dateTimeZone82, 212400000L);
        org.joda.time.Chronology chronology91 = chronology40.withZone(dateTimeZone82);
        org.joda.time.DurationField durationField92 = chronology40.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField92, durationField18, and durationField22", !(durationField92.compareTo(durationField18) == 0) || (Math.signum(durationField92.compareTo(durationField22)) == Math.signum(durationField18.compareTo(durationField22))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.monthOfYear();
        java.lang.String str21 = chronology17.toString();
        long long25 = chronology17.add(97L, 4L, 70);
        org.joda.time.DurationField durationField26 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.centuryOfEra();
        java.util.Locale locale31 = new java.util.Locale("\u4e2d\u6587\u4e2d\u56fd)", "52");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(120001L, chronology17, locale31, (java.lang.Integer) (-59), 292278993);
        org.joda.time.DateTimeField dateTimeField35 = chronology17.hourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField18, and durationField26", !(durationField36.compareTo(durationField18) == 0) || (Math.signum(durationField36.compareTo(durationField26)) == Math.signum(durationField18.compareTo(durationField26))));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean9 = dateTimeField8.isLenient();
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = dateTimeField8.getAsText(readablePartial10, (int) 'x', locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology5, locale14, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekOfWeekyear();
        org.joda.time.DurationField durationField22 = chronology20.hours();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology20, locale23, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.getMillisKeepLocal(dateTimeZone27, 1L);
        long long32 = dateTimeZone27.adjustOffset(1L, true);
        long long34 = dateTimeZone27.convertUTCToLocal(0L);
        java.lang.String str36 = dateTimeZone27.getNameKey(0L);
        int int38 = dateTimeZone27.getOffset((long) 10);
        org.joda.time.Chronology chronology39 = chronology20.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.dayOfWeek();
        org.joda.time.DurationField durationField42 = chronology39.years();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.millisOfDay();
        org.joda.time.Chronology chronology44 = chronology39.withUTC();
        org.joda.time.DateTimeField dateTimeField45 = chronology39.millisOfSecond();
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.lang.String str47 = locale46.getCountry();
        java.util.Locale.setDefault(locale46);
        java.lang.String str49 = locale46.getScript();
        java.util.Set<java.lang.String> strSet50 = locale46.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((-58979923200000L), chronology39, locale46, (java.lang.Integer) 8, 31);
        org.joda.time.DateTimeField dateTimeField54 = chronology39.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField55 = chronology39.dayOfWeek();
        boolean boolean56 = dateTimeFieldType0.isSupported(chronology39);
        org.joda.time.DurationField durationField57 = chronology39.weeks();
        org.joda.time.DurationField durationField58 = chronology39.weekyears();
        org.joda.time.DurationField durationField59 = chronology39.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField59", (durationField42.compareTo(durationField59) == 0) == durationField42.equals(durationField59));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField27 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField19, and durationField23", !(durationField27.compareTo(durationField19) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.millisOfSecond();
        long long33 = chronology17.add((-2L), 13L, (-4200000));
        org.joda.time.DurationField durationField34 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField19, and durationField23", !(durationField34.compareTo(durationField19) == 0) || (Math.signum(durationField34.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.millisOfDay();
        boolean boolean21 = dateTimeField20.isLenient();
        java.lang.String str22 = dateTimeField20.getName();
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField(chronology26);
        int int29 = dateTimeField27.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField30 = dateTimeField27.getDurationField();
        int int32 = dateTimeField27.getMaximumValue((long) (short) 1);
        long long34 = dateTimeField27.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial35 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType36.getField(chronology37);
        int int40 = dateTimeField38.getLeapAmount((long) 0);
        int int42 = dateTimeField38.getLeapAmount((long) (byte) 1);
        org.joda.time.ReadablePartial readablePartial43 = null;
        int[] intArray48 = new int[] { (short) 0, 100, (byte) 10, (short) 0 };
        int int49 = dateTimeField38.getMaximumValue(readablePartial43, intArray48);
        int int50 = dateTimeField27.getMinimumValue(readablePartial35, intArray48);
        int[] intArray52 = dateTimeField20.add(readablePartial23, (-1789), intArray48, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField30", (durationField18.compareTo(durationField30) == 0) == durationField18.equals(durationField30));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        boolean boolean29 = dateTimeField28.isLenient();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getLanguage();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = dateTimeField28.getAsText(readablePartial30, (int) 'x', locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology25, locale34, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfDay();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        boolean boolean43 = dateTimeFieldType21.isSupported(chronology40);
        org.joda.time.DurationField durationField44 = chronology40.eras();
        org.joda.time.DateTimeField dateTimeField45 = chronology40.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField44", Math.signum(durationField42.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField42)));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.dayOfYear();
        long long46 = chronology17.getDateTimeMillis(3061105200000L, 0, (int) (short) 0, (int) (short) 0, 13);
        org.joda.time.DurationField durationField47 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField19, and durationField38", !(durationField47.compareTo(durationField19) == 0) || (Math.signum(durationField47.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.dayOfMonth();
        org.joda.time.DurationField durationField21 = chronology18.minutes();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.hourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology18.months();
        org.joda.time.DurationField durationField24 = chronology18.seconds();
        org.joda.time.DurationField durationField25 = chronology18.halfdays();
        boolean boolean26 = dateTimeFieldType0.isSupported(chronology18);
        org.joda.time.DurationField durationField27 = chronology18.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology18.getZone();
        org.joda.time.DurationField durationField29 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone32.getMillisKeepLocal(dateTimeZone33, 1L);
        java.lang.String str37 = dateTimeZone32.getNameKey((long) '#');
        long long41 = dateTimeZone32.convertLocalToUTC((long) 'a', true, 0L);
        long long44 = dateTimeZone32.convertLocalToUTC((long) ' ', false);
        java.lang.String str45 = dateTimeZone32.toString();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType48.getField(chronology49);
        int int52 = dateTimeField50.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField53 = dateTimeField50.getDurationField();
        int int55 = dateTimeField50.getMaximumValue((long) (short) 1);
        long long57 = dateTimeField50.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial58 = null;
        java.util.Locale.Builder builder60 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder63 = builder60.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder64 = builder60.clearExtensions();
        java.util.Locale locale65 = builder64.build();
        java.lang.String str66 = dateTimeField50.getAsShortText(readablePartial58, (int) (byte) 100, locale65);
        java.lang.String str67 = locale47.getDisplayScript(locale65);
        java.lang.String str68 = dateTimeZone32.getShortName((-63158400000L), locale47);
        java.lang.String str69 = dateTimeField30.getAsText((int) (short) 0, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField53", (durationField27.compareTo(durationField53) == 0) == durationField27.equals(durationField53));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale43 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology41, locale43, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        java.lang.String str48 = chronology41.toString();
        org.joda.time.DurationField durationField49 = chronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.dayOfYear();
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder54 = builder52.setLocale(locale53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType55.getField(chronology56);
        int int59 = dateTimeField57.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField60 = dateTimeField57.getDurationField();
        int int62 = dateTimeField57.getMaximumValue((long) (short) 1);
        long long64 = dateTimeField57.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial65 = null;
        java.util.Locale.Builder builder67 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder70 = builder67.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder71 = builder67.clearExtensions();
        java.util.Locale locale72 = builder71.build();
        java.lang.String str73 = dateTimeField57.getAsShortText(readablePartial65, (int) (byte) 100, locale72);
        java.util.Set<java.lang.String> strSet74 = locale72.getUnicodeLocaleKeys();
        java.lang.String str75 = locale53.getDisplayName(locale72);
        java.util.Locale locale79 = new java.util.Locale("zh", "weekyear", "en_US");
        java.lang.String str80 = locale53.getDisplayName(locale79);
        java.lang.String str81 = dateTimeField50.getAsText((int) (byte) 100, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField49 and durationField60", (durationField49.compareTo(durationField60) == 0) == durationField49.equals(durationField60));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2);
        java.lang.Integer int6 = dateTimeParserBucket5.getPivotYear();
        long long8 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Integer int9 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, 1L);
        boolean boolean35 = dateTimeZone32.isFixed();
        org.joda.time.Chronology chronology36 = chronology26.withZone(dateTimeZone32);
        boolean boolean37 = dateTimeParserBucket5.restoreState((java.lang.Object) chronology36);
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField38", Math.signum(durationField27.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField27)));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.seconds();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology17, locale19, (java.lang.Integer) 1970);
        org.joda.time.DateTimeField dateTimeField22 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField24 = chronology17.seconds();
        org.joda.time.Chronology chronology25 = chronology17.withUTC();
        org.joda.time.DurationField durationField26 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField26", Math.signum(durationField18.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField18)));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2, (java.lang.Integer) 1);
        java.lang.Object obj5 = dateTimeParserBucket4.saveState();
        long long6 = dateTimeParserBucket4.computeMillis();
        java.lang.Object obj7 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        boolean boolean15 = dateTimeField14.isLenient();
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale18.getDisplayName(locale20);
        java.lang.String str23 = dateTimeField14.getAsText(readablePartial16, (int) 'x', locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology11, locale20, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = chronology26.hours();
        boolean boolean29 = dateTimeParserBucket4.restoreState((java.lang.Object) chronology26);
        org.joda.time.DurationField durationField30 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.era();
        org.joda.time.DurationField durationField34 = chronology26.seconds();
        org.joda.time.DurationField durationField35 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField28, and durationField30", !(durationField35.compareTo(durationField28) == 0) || (Math.signum(durationField35.compareTo(durationField30)) == Math.signum(durationField28.compareTo(durationField30))));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        java.util.Locale locale16 = dateTimeParserBucket15.getLocale();
        long long17 = dateTimeParserBucket15.computeMillis();
        long long20 = dateTimeParserBucket15.computeMillis(true, "cinese (Cina)");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        dateTimeParserBucket15.saveField(dateTimeFieldType21, 9);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        boolean boolean30 = dateTimeField29.isLenient();
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getDisplayName();
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.lang.String str36 = locale35.getLanguage();
        java.lang.String str37 = locale33.getDisplayName(locale35);
        java.lang.String str38 = dateTimeField29.getAsText(readablePartial31, (int) 'x', locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology26, locale35, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale43 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology41, locale43, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType21.getField(chronology41);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType51.getField(chronology52);
        boolean boolean54 = dateTimeField53.isLenient();
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str58 = locale57.getDisplayName();
        java.util.Locale locale59 = java.util.Locale.ITALY;
        java.lang.String str60 = locale59.getLanguage();
        java.lang.String str61 = locale57.getDisplayName(locale59);
        java.lang.String str62 = dateTimeField53.getAsText(readablePartial55, (int) 'x', locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology50, locale59, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.weekOfWeekyear();
        org.joda.time.DurationField durationField67 = chronology65.hours();
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology65, locale68, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField71 = chronology65.months();
        org.joda.time.DateTimeField dateTimeField72 = chronology65.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField73 = chronology65.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField74 = chronology65.weekOfWeekyear();
        org.joda.time.DurationField durationField75 = chronology65.halfdays();
        boolean boolean76 = dateTimeFieldType21.isSupported(chronology65);
        org.joda.time.DateTimeField dateTimeField77 = chronology65.dayOfWeek();
        org.joda.time.Chronology chronology78 = chronology65.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.weekyearOfCentury();
        org.joda.time.DurationField durationField80 = chronology78.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField80, durationField67, and durationField71", !(durationField80.compareTo(durationField67) == 0) || (Math.signum(durationField80.compareTo(durationField71)) == Math.signum(durationField67.compareTo(durationField71))));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology17.getZone();
        org.joda.time.DurationField durationField42 = chronology17.weeks();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.JAPAN;
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45);
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
        long long52 = dateTimeParserBucket48.computeMillis(true, "120");
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeParserBucket48.getZone();
        org.joda.time.Chronology chronology54 = chronology17.withZone(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long60 = dateTimeZone57.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType62.getField(chronology63);
        int int66 = dateTimeField64.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField67 = dateTimeField64.getDurationField();
        int int69 = dateTimeField64.getMaximumValue((long) (short) 1);
        long long71 = dateTimeField64.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial72 = null;
        java.util.Locale.Builder builder74 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder77 = builder74.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder78 = builder74.clearExtensions();
        java.util.Locale locale79 = builder78.build();
        java.lang.String str80 = dateTimeField64.getAsShortText(readablePartial72, (int) (byte) 100, locale79);
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleKeys();
        java.lang.String str82 = dateTimeZone57.getShortName((long) 1970, locale79);
        long long85 = dateTimeZone57.adjustOffset(3061065600000L, true);
        int int87 = dateTimeZone57.getOffset((long) 998);
        org.joda.time.Chronology chronology88 = chronology54.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField89 = chronology88.monthOfYear();
        org.joda.time.DateTimeField dateTimeField90 = chronology88.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField91 = chronology88.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField67", (durationField38.compareTo(durationField67) == 0) == durationField38.equals(durationField67));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        java.util.Locale locale17 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale20.getCountry();
        java.lang.String str24 = locale20.getISO3Country();
        dateTimeParserBucket16.saveField(dateTimeFieldType18, "CHN", locale20);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology31, locale32, (java.lang.Integer) 1);
        java.lang.Object obj35 = dateTimeParserBucket34.saveState();
        long long36 = dateTimeParserBucket34.computeMillis();
        java.lang.Object obj37 = dateTimeParserBucket34.saveState();
        dateTimeParserBucket34.setOffset((java.lang.Integer) 1);
        java.lang.Object obj40 = dateTimeParserBucket34.saveState();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology42, locale43, (java.lang.Integer) 1);
        java.lang.Object obj46 = dateTimeParserBucket45.saveState();
        long long47 = dateTimeParserBucket45.computeMillis();
        dateTimeParserBucket45.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        dateTimeParserBucket45.saveField(dateTimeFieldType50, "zh_CN", locale54);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        boolean boolean58 = locale57.hasExtensions();
        java.lang.String str59 = locale57.getISO3Country();
        boolean boolean60 = locale57.hasExtensions();
        java.lang.String str61 = locale57.getISO3Language();
        dateTimeParserBucket34.saveField(dateTimeFieldType50, "hi!", locale57);
        java.util.Locale locale63 = java.util.Locale.JAPANESE;
        java.lang.String str64 = locale63.getCountry();
        java.lang.String str65 = locale57.getDisplayLanguage(locale63);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-86399902L), chronology27, locale57, (java.lang.Integer) 4);
        org.joda.time.DurationField durationField68 = chronology27.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField68, and durationField28", !(durationField28.compareTo(durationField68) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField68.compareTo(durationField28))));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        java.lang.String str17 = chronology16.toString();
        org.joda.time.DurationField durationField18 = chronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology16.years();
        org.joda.time.Chronology chronology22 = chronology16.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField21", (durationField18.compareTo(durationField21) == 0) == durationField18.equals(durationField21));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.era();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.joda.time.DurationField durationField23 = chronology16.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField22", Math.signum(durationField18.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField18)));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType5.getField(chronology6);
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale11 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale11.getDisplayName(locale13);
        java.lang.String str16 = dateTimeField7.getAsText(readablePartial9, (int) 'x', locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology4, locale13, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType2.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology19, locale25, (java.lang.Integer) 292278993);
        org.joda.time.DurationField durationField31 = chronology19.years();
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("Japan");
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        int int38 = dateTimeField36.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField39 = dateTimeField36.getDurationField();
        int int41 = dateTimeField36.getMaximumValue((long) (short) 1);
        long long43 = dateTimeField36.roundHalfEven((long) ' ');
        int int45 = dateTimeField36.getMinimumValue((long) 100);
        org.joda.time.ReadablePartial readablePartial46 = null;
        int int47 = dateTimeField36.getMaximumValue(readablePartial46);
        int int49 = dateTimeField36.getLeapAmount((long) 'a');
        org.joda.time.ReadablePartial readablePartial50 = null;
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.util.Locale locale53 = java.util.Locale.US;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Set<java.lang.String> strSet55 = locale53.getUnicodeLocaleKeys();
        java.lang.String str56 = dateTimeField36.getAsShortText(readablePartial50, 100, locale53);
        java.lang.String str57 = locale33.getDisplayName(locale53);
        java.util.Set<java.lang.String> strSet58 = locale53.getUnicodeLocaleAttributes();
        java.util.Locale locale61 = new java.util.Locale("CA", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str62 = locale53.getDisplayScript(locale61);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(2677637114L, chronology19, locale61, (java.lang.Integer) 0);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType67.getField(chronology68);
        boolean boolean70 = dateTimeField69.isLenient();
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale locale73 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str74 = locale73.getDisplayName();
        java.util.Locale locale75 = java.util.Locale.ITALY;
        java.lang.String str76 = locale75.getLanguage();
        java.lang.String str77 = locale73.getDisplayName(locale75);
        java.lang.String str78 = dateTimeField69.getAsText(readablePartial71, (int) 'x', locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology66, locale75, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology81 = dateTimeParserBucket80.getChronology();
        org.joda.time.DurationField durationField82 = chronology81.seconds();
        org.joda.time.DateTimeField dateTimeField83 = chronology81.yearOfEra();
        org.joda.time.DateTimeField dateTimeField84 = chronology81.yearOfEra();
        org.joda.time.ReadablePartial readablePartial85 = null;
        java.util.Locale.Builder builder87 = new java.util.Locale.Builder();
        java.util.Locale locale88 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder89 = builder87.setLocale(locale88);
        java.util.Locale locale90 = java.util.Locale.GERMAN;
        java.util.Locale.Builder builder91 = builder87.setLocale(locale90);
        java.lang.String str92 = dateTimeField84.getAsText(readablePartial85, (int) (byte) 100, locale90);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = dateTimeField84.getType();
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType93.getRangeDurationType();
        java.lang.String str95 = dateTimeFieldType93.toString();
        org.joda.time.Chronology chronology96 = null;
        boolean boolean97 = dateTimeFieldType93.isSupported(chronology96);
        dateTimeParserBucket64.saveField(dateTimeFieldType93, 2922789);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField31 and durationField39", (durationField31.compareTo(durationField39) == 0) == durationField31.equals(durationField39));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean9 = dateTimeField8.isLenient();
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = dateTimeField8.getAsText(readablePartial10, (int) 'x', locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology5, locale14, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        java.util.Locale locale22 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology20, locale22, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField26 = chronology20.centuryOfEra();
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology20);
        org.joda.time.DateTimeField dateTimeField28 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology20.millis();
        org.joda.time.DurationField durationField30 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField31 = chronology20.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField29 and durationField30", Math.signum(durationField29.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField29)));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfYear();
        org.joda.time.DurationField durationField24 = chronology18.seconds();
        org.joda.time.DurationField durationField25 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField19, and durationField20", !(durationField25.compareTo(durationField19) == 0) || (Math.signum(durationField25.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.lang.String str18 = chronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology17.getZone();
        org.joda.time.DurationField durationField23 = chronology17.weeks();
        org.joda.time.DurationField durationField24 = chronology17.halfdays();
        org.joda.time.DurationField durationField25 = chronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField29.getType();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone32.getMillisKeepLocal(dateTimeZone33, 1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        java.util.TimeZone timeZone37 = dateTimeZone33.toTimeZone();
        java.util.Locale locale42 = new java.util.Locale("zh_CN", "China", "");
        java.lang.String str43 = dateTimeZone33.getShortName((long) 'x', locale42);
        java.lang.String str44 = dateTimeField29.getAsText(0, locale42);
        java.util.Locale locale45 = locale42.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((-31449600000L), chronology17, locale45, (java.lang.Integer) 31);
        java.util.Locale.Category category48 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale49 = java.util.Locale.getDefault(category48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType50.getField(chronology51);
        int int54 = dateTimeField52.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField55 = dateTimeField52.getDurationField();
        int int57 = dateTimeField52.getMaximumValue((long) (short) 1);
        long long59 = dateTimeField52.roundHalfEven((long) ' ');
        int int61 = dateTimeField52.getMinimumValue((long) 100);
        org.joda.time.ReadablePartial readablePartial62 = null;
        java.util.Locale locale66 = new java.util.Locale("", "Chinese (China)");
        boolean boolean67 = locale66.hasExtensions();
        java.lang.String str68 = dateTimeField52.getAsShortText(readablePartial62, (int) (short) -1, locale66);
        java.util.Locale locale70 = java.util.Locale.UK;
        java.util.Locale.setDefault(locale70);
        java.lang.String str72 = dateTimeField52.getAsShortText((long) (byte) 100, locale70);
        java.util.Locale.setDefault(category48, locale70);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        long long77 = dateTimeZone74.getMillisKeepLocal(dateTimeZone75, 1L);
        long long80 = dateTimeZone75.adjustOffset(1L, true);
        boolean boolean81 = dateTimeZone75.isFixed();
        long long83 = dateTimeZone75.convertUTCToLocal((long) 100);
        java.util.TimeZone timeZone84 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone84);
        long long87 = dateTimeZone85.convertUTCToLocal((long) (short) 0);
        java.util.Locale locale90 = new java.util.Locale("cinese (Cina)");
        java.lang.String str91 = dateTimeZone85.getShortName(0L, locale90);
        java.util.Locale.setDefault(category48, locale90);
        java.util.Locale locale93 = java.util.Locale.getDefault(category48);
        java.lang.String str94 = locale93.getDisplayLanguage();
        java.lang.String str95 = locale93.getISO3Country();
        java.lang.String str96 = locale93.getISO3Country();
        java.lang.String str97 = locale45.getDisplayName(locale93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField55", (durationField25.compareTo(durationField55) == 0) == durationField25.equals(durationField55));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        int int28 = dateTimeField26.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField29 = dateTimeField26.getDurationField();
        int int31 = dateTimeField26.getMaximumValue((long) (short) 1);
        org.joda.time.ReadablePartial readablePartial32 = null;
        int[] intArray38 = new int[] { '#', '4', '#', (byte) 0, (short) 1 };
        int int39 = dateTimeField26.getMaximumValue(readablePartial32, intArray38);
        java.util.Locale locale43 = new java.util.Locale("", "Chinese (China)");
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.String str49 = locale46.getScript();
        java.lang.String str50 = locale43.getDisplayScript(locale46);
        java.util.Set<java.lang.String> strSet51 = locale46.getUnicodeLocaleAttributes();
        java.lang.String str52 = dateTimeField26.getAsText((long) (-1), locale46);
        java.util.Set<java.lang.Character> charSet53 = locale46.getExtensionKeys();
        java.lang.String str54 = dateTimeField21.getAsText(readablePartial22, 11201, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField29", Math.signum(durationField20.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField20)));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology17.centuries();
        org.joda.time.DurationField durationField26 = chronology17.years();
        org.joda.time.Chronology chronology27 = chronology17.withUTC();
        org.joda.time.DurationField durationField28 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField19, and durationField23", !(durationField28.compareTo(durationField19) == 0) || (Math.signum(durationField28.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.getMillisKeepLocal(dateTimeZone24, 1L);
        long long29 = dateTimeZone24.adjustOffset(1L, true);
        long long31 = dateTimeZone24.convertUTCToLocal(0L);
        java.lang.String str33 = dateTimeZone24.getNameKey(0L);
        int int35 = dateTimeZone24.getOffset((long) 10);
        org.joda.time.Chronology chronology36 = chronology17.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField37 = chronology17.year();
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.lang.String str41 = dateTimeField37.getAsShortText(readablePartial38, (int) 'x', locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField37.getType();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType42.getDurationType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType48.getField(chronology49);
        boolean boolean51 = dateTimeField50.isLenient();
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale54 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str55 = locale54.getDisplayName();
        java.util.Locale locale56 = java.util.Locale.ITALY;
        java.lang.String str57 = locale56.getLanguage();
        java.lang.String str58 = locale54.getDisplayName(locale56);
        java.lang.String str59 = dateTimeField50.getAsText(readablePartial52, (int) 'x', locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology47, locale56, (java.lang.Integer) (-1));
        java.util.Locale locale62 = dateTimeParserBucket61.getLocale();
        long long63 = dateTimeParserBucket61.computeMillis();
        int int64 = dateTimeParserBucket61.getOffset();
        org.joda.time.Chronology chronology65 = dateTimeParserBucket61.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfDay();
        org.joda.time.DurationField durationField67 = chronology65.eras();
        org.joda.time.DurationField durationField68 = chronology65.eras();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.monthOfYear();
        org.joda.time.DateTimeField dateTimeField70 = chronology65.centuryOfEra();
        java.util.Locale locale71 = java.util.Locale.ITALY;
        java.lang.String str72 = locale71.getVariant();
        java.util.Locale.setDefault(locale71);
        java.util.Locale locale76 = new java.util.Locale("", "tedesco");
        java.lang.String str77 = locale71.getDisplayScript(locale76);
        java.lang.String str78 = locale71.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 1893466200, chronology65, locale71, (java.lang.Integer) 25800000, 780);
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType42.getField(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField67", Math.signum(durationField19.compareTo(durationField67)) == -Math.signum(durationField67.compareTo(durationField19)));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Japan");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        int int6 = dateTimeField4.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField7 = dateTimeField4.getDurationField();
        int int9 = dateTimeField4.getMaximumValue((long) (short) 1);
        long long11 = dateTimeField4.roundHalfEven((long) ' ');
        int int13 = dateTimeField4.getMinimumValue((long) 100);
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = dateTimeField4.getMaximumValue(readablePartial14);
        int int17 = dateTimeField4.getLeapAmount((long) 'a');
        org.joda.time.ReadablePartial readablePartial18 = null;
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = dateTimeField4.getAsShortText(readablePartial18, 100, locale21);
        java.lang.String str25 = locale1.getDisplayName(locale21);
        java.util.Set<java.lang.String> strSet26 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale21.getISO3Country();
        java.util.Locale locale29 = new java.util.Locale("DateTimeField[minuteOfDay]");
        java.lang.String str30 = locale21.getDisplayLanguage(locale29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        boolean boolean37 = dateTimeField36.isLenient();
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str41 = locale40.getDisplayName();
        java.util.Locale locale42 = java.util.Locale.ITALY;
        java.lang.String str43 = locale42.getLanguage();
        java.lang.String str44 = locale40.getDisplayName(locale42);
        java.lang.String str45 = dateTimeField36.getAsText(readablePartial38, (int) 'x', locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology33, locale42, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.weekOfWeekyear();
        org.joda.time.DurationField durationField50 = chronology48.hours();
        java.util.Locale locale51 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology48, locale51, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField54 = chronology48.months();
        org.joda.time.DateTimeField dateTimeField55 = chronology48.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField56 = chronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField57 = chronology48.weekyearOfCentury();
        org.joda.time.DurationField durationField58 = chronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = chronology48.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology48.yearOfCentury();
        java.lang.String str62 = dateTimeField60.getAsText((-313907572800000L));
        int int64 = dateTimeField60.getLeapAmount((-31618199999L));
        boolean boolean65 = locale29.equals((java.lang.Object) dateTimeField60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField58", (durationField7.compareTo(durationField58) == 0) == durationField7.equals(durationField58));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.centuries();
        org.joda.time.DurationField durationField24 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField26 = chronology17.weekyears();
        org.joda.time.DurationField durationField27 = chronology17.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField26", (durationField24.compareTo(durationField26) == 0) == durationField24.equals(durationField26));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 10);
        long long5 = dateTimeZone2.convertLocalToUTC(0L, false);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        int int11 = dateTimeField9.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField12 = dateTimeField9.getDurationField();
        int int14 = dateTimeField9.getMaximumValue((long) (short) 1);
        long long16 = dateTimeField9.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial17 = null;
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder19.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder23 = builder19.clearExtensions();
        java.util.Locale locale24 = builder23.build();
        java.lang.String str25 = dateTimeField9.getAsShortText(readablePartial17, (int) (byte) 100, locale24);
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleKeys();
        java.lang.String str27 = dateTimeZone2.getShortName((long) 1970, locale24);
        long long30 = dateTimeZone2.adjustOffset(3061065600000L, true);
        long long33 = dateTimeZone2.adjustOffset(127L, false);
        long long36 = dateTimeZone2.convertLocalToUTC(7200999L, true);
        long long38 = dateTimeZone2.previousTransition(4039633920000L);
        long long40 = dateTimeZone2.previousTransition(0L);
        java.lang.String str42 = dateTimeZone2.getNameKey((long) 97);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology45, locale46, (java.lang.Integer) 1);
        java.lang.Object obj49 = dateTimeParserBucket48.saveState();
        long long52 = dateTimeParserBucket48.computeMillis(true, "halfdayOfDay");
        int int53 = dateTimeParserBucket48.getOffset();
        java.util.Locale locale54 = dateTimeParserBucket48.getLocale();
        java.util.Locale.Category category55 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale56 = java.util.Locale.getDefault(category55);
        java.util.Locale locale60 = new java.util.Locale("hi!", "DateTimeField[hourOfDay]", "USA");
        java.util.Locale.setDefault(category55, locale60);
        java.lang.String str62 = locale54.getDisplayScript(locale60);
        java.lang.String str63 = dateTimeZone2.getShortName((-2678399900L), locale54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long66 = dateTimeZone2.nextTransition((-30754200000L));
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        int int72 = dateTimeField70.getLeapAmount((long) 0);
        org.joda.time.DurationField durationField73 = dateTimeField70.getDurationField();
        int int75 = dateTimeField70.getMaximumValue((long) (short) 1);
        long long77 = dateTimeField70.roundHalfEven((long) ' ');
        org.joda.time.ReadablePartial readablePartial78 = null;
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder83 = builder80.setUnicodeLocaleKeyword("it", "China");
        java.util.Locale.Builder builder84 = builder80.clearExtensions();
        java.util.Locale locale85 = builder84.build();
        java.lang.String str86 = dateTimeField70.getAsShortText(readablePartial78, (int) (byte) 100, locale85);
        java.lang.String str87 = locale67.getDisplayScript(locale85);
        java.lang.String str88 = locale85.getDisplayVariant();
        boolean boolean89 = dateTimeZone2.equals((java.lang.Object) str88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField73", (durationField12.compareTo(durationField73) == 0) == durationField12.equals(durationField73));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.ReadablePartial readablePartial8 = null;
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayName(locale12);
        java.lang.String str15 = dateTimeField6.getAsText(readablePartial8, (int) 'x', locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology3, locale12, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.hours();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder23 = builder21.setLocale(locale22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        java.lang.String str36 = locale22.getDisplayLanguage(locale32);
        java.lang.String str37 = locale22.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale22);
        org.joda.time.DateTimeField dateTimeField39 = chronology18.minuteOfHour();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale40, (java.lang.Integer) 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology18.hourOfDay();
        org.joda.time.DurationField durationField46 = chronology18.millis();
        org.joda.time.Chronology chronology47 = chronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = chronology18.millisOfDay();
        org.joda.time.DurationField durationField49 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField20, and durationField46", !(durationField49.compareTo(durationField20) == 0) || (Math.signum(durationField49.compareTo(durationField46)) == Math.signum(durationField20.compareTo(durationField46))));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.minuteOfDay();
        java.lang.String str20 = chronology16.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField24 = chronology16.eras();
        org.joda.time.DurationField durationField25 = chronology16.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField24", Math.signum(durationField18.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField18)));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = dateTimeField2.getType();
        org.joda.time.DurationField durationField4 = dateTimeField2.getDurationField();
        long long7 = dateTimeField2.set(1L, (int) (short) 0);
        long long10 = dateTimeField2.getDifferenceAsLong((long) (byte) 10, (long) (short) 0);
        boolean boolean11 = dateTimeField2.isLenient();
        java.util.Locale locale16 = new java.util.Locale("French", "GB", "deu");
        java.lang.String str17 = dateTimeField2.getAsShortText(86399999, locale16);
        long long19 = dateTimeField2.roundHalfEven(86398L);
        long long21 = dateTimeField2.roundCeiling((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField2.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str24 = dateTimeFieldType23.toString();
        java.lang.String str25 = dateTimeFieldType23.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        boolean boolean32 = dateTimeField31.isLenient();
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = locale35.getDisplayName(locale37);
        java.lang.String str40 = dateTimeField31.getAsText(readablePartial33, (int) 'x', locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology28, locale37, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        java.util.Locale locale45 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology43, locale45, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField49 = chronology43.centuryOfEra();
        boolean boolean50 = dateTimeFieldType23.isSupported(chronology43);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        boolean boolean57 = dateTimeField56.isLenient();
        org.joda.time.ReadablePartial readablePartial58 = null;
        java.util.Locale locale60 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str61 = locale60.getDisplayName();
        java.util.Locale locale62 = java.util.Locale.ITALY;
        java.lang.String str63 = locale62.getLanguage();
        java.lang.String str64 = locale60.getDisplayName(locale62);
        java.lang.String str65 = dateTimeField56.getAsText(readablePartial58, (int) 'x', locale62);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology53, locale62, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology68 = dateTimeParserBucket67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.weekOfWeekyear();
        org.joda.time.DurationField durationField70 = chronology68.hours();
        java.util.Locale locale71 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology68, locale71, (java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        long long77 = dateTimeZone74.getMillisKeepLocal(dateTimeZone75, 1L);
        long long80 = dateTimeZone75.adjustOffset(1L, true);
        long long82 = dateTimeZone75.convertUTCToLocal(0L);
        java.lang.String str84 = dateTimeZone75.getNameKey(0L);
        int int86 = dateTimeZone75.getOffset((long) 10);
        org.joda.time.Chronology chronology87 = chronology68.withZone(dateTimeZone75);
        org.joda.time.DurationField durationField88 = chronology68.minutes();
        org.joda.time.DateTimeField dateTimeField89 = chronology68.minuteOfHour();
        org.joda.time.DurationField durationField90 = chronology68.weeks();
        boolean boolean91 = dateTimeFieldType23.isSupported(chronology68);
        boolean boolean92 = dateTimeFieldType22.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField93 = chronology68.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField88", (durationField4.compareTo(durationField88) == 0) == durationField4.equals(durationField88));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale19 = new java.util.Locale("UTC");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology17, locale19, (java.lang.Integer) 12, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.getMillisKeepLocal(dateTimeZone27, 1L);
        long long32 = dateTimeZone27.adjustOffset(1L, true);
        int int34 = dateTimeZone27.getOffsetFromLocal(0L);
        long long36 = dateTimeZone27.previousTransition((long) (byte) -1);
        java.lang.String str38 = dateTimeZone27.getNameKey((long) '#');
        org.joda.time.Chronology chronology39 = chronology17.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.joda.time.DurationField durationField41 = chronology39.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField41, and durationField40", !(durationField40.compareTo(durationField41) == 0) || (Math.signum(durationField40.compareTo(durationField40)) == Math.signum(durationField41.compareTo(durationField40))));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology17, locale20, (java.lang.Integer) 0);
        org.joda.time.DurationField durationField23 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology17.secondOfMinute();
        org.joda.time.DurationField durationField28 = chronology17.years();
        org.joda.time.DurationField durationField29 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField19, and durationField23", !(durationField29.compareTo(durationField19) == 0) || (Math.signum(durationField29.compareTo(durationField23)) == Math.signum(durationField19.compareTo(durationField23))));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        boolean boolean27 = dateTimeField26.isLenient();
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale locale32 = java.util.Locale.ITALY;
        java.lang.String str33 = locale32.getLanguage();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeField26.getAsText(readablePartial28, (int) 'x', locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology23, locale32, (java.lang.Integer) (-1));
        java.util.Locale locale38 = dateTimeParserBucket37.getLocale();
        java.util.Locale locale39 = dateTimeParserBucket37.getLocale();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology41, locale42, (java.lang.Integer) 1);
        java.lang.Object obj45 = dateTimeParserBucket44.saveState();
        long long46 = dateTimeParserBucket44.computeMillis();
        dateTimeParserBucket44.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType49.getField(chronology50);
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        dateTimeParserBucket44.saveField(dateTimeFieldType49, "zh_CN", locale53);
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology56, locale57, (java.lang.Integer) 1);
        java.lang.Object obj60 = dateTimeParserBucket59.saveState();
        long long61 = dateTimeParserBucket59.computeMillis();
        dateTimeParserBucket59.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType64.getField(chronology65);
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        dateTimeParserBucket59.saveField(dateTimeFieldType64, "zh_CN", locale68);
        java.lang.String str70 = locale68.getVariant();
        java.lang.String str71 = locale53.getDisplayVariant(locale68);
        java.lang.String str72 = locale39.getDisplayScript(locale68);
        java.lang.String str73 = locale39.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) (-4200000), chronology17, locale39);
        org.joda.time.DurationField durationField75 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField76 = chronology17.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField75", Math.signum(durationField19.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField19)));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.monthOfYear();
        java.lang.String str20 = chronology16.toString();
        long long24 = chronology16.add(97L, 4L, 70);
        org.joda.time.DurationField durationField25 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField25", Math.signum(durationField17.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField17)));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean6 = dateTimeField5.isLenient();
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = locale9.getDisplayName(locale11);
        java.lang.String str14 = dateTimeField5.getAsText(readablePartial7, (int) 'x', locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology2, locale11, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.hours();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder20.setLocale(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType23.getField(chronology24);
        boolean boolean26 = dateTimeField25.isLenient();
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale29.getDisplayName(locale31);
        java.lang.String str34 = dateTimeField25.getAsText(readablePartial27, (int) 'x', locale31);
        java.lang.String str35 = locale21.getDisplayLanguage(locale31);
        java.lang.String str36 = locale21.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale21);
        org.joda.time.DurationField durationField38 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology17.millisOfSecond();
        org.joda.time.DurationField durationField44 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField19, and durationField38", !(durationField44.compareTo(durationField19) == 0) || (Math.signum(durationField44.compareTo(durationField38)) == Math.signum(durationField19.compareTo(durationField38))));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfDay();
        org.joda.time.DurationField durationField20 = chronology16.weekyears();
        org.joda.time.DurationField durationField21 = chronology16.months();
        long long25 = chronology16.add(31463534344L, (-61914758391000L), 0);
        org.joda.time.DurationField durationField26 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField20, and durationField21", !(durationField26.compareTo(durationField20) == 0) || (Math.signum(durationField26.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        boolean boolean5 = dateTimeField4.isLenient();
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayName(locale10);
        java.lang.String str13 = dateTimeField4.getAsText(readablePartial6, (int) 'x', locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale10, (java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.String str23 = dateTimeZone21.getName((long) (-1));
        boolean boolean25 = dateTimeZone21.isStandardOffset((long) 10);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField27 = chronology16.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = chronology16.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField28, and durationField18", !(durationField18.compareTo(durationField28) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField28.compareTo(durationField18))));
    }
}

