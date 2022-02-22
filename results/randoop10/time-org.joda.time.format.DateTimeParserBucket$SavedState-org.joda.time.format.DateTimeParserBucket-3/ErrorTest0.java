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
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology13.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readablePeriod23);
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField29 = durationFieldType1.getField(chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = chronology26.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = chronology13.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField24 = durationFieldType0.getField(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField15, and durationField24", !(durationField25.compareTo(durationField15) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField15.compareTo(durationField24))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str21 = dateTimeZone19.getNameKey((long) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        int int28 = localDateTime27.getYearOfCentury();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(dateTimeZone32);
        long long37 = dateTimeZone32.convertLocalToUTC(315569520000L, false, (long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        int int40 = dateTimeZone32.getOffsetFromLocal(0L);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone32);
        long long43 = dateTimeZone19.getMillisKeepLocal(dateTimeZone32, (long) ' ');
        org.joda.time.Chronology chronology44 = chronology12.withZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        long long29 = durationField26.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        long long46 = durationField43.add((long) 'x', 70);
        boolean boolean47 = durationField43.isSupported();
        int int48 = durationField26.compareTo(durationField43);
        boolean boolean49 = durationField43.isSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology13.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        long long29 = durationField26.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        long long46 = durationField43.add((long) 'x', 70);
        boolean boolean47 = durationField43.isSupported();
        int int48 = durationField26.compareTo(durationField43);
        long long51 = durationField43.getMillis(1970, (-62167219199948L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        long long29 = durationField26.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        long long46 = durationField43.add((long) 'x', 70);
        boolean boolean47 = durationField43.isSupported();
        int int48 = durationField26.compareTo(durationField43);
        int int51 = durationField43.getValue((long) (short) 100, (-62167213909883L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readablePeriod23);
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField29 = durationFieldType1.getField(chronology26);
        java.lang.String str30 = durationFieldType1.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology13.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = property24.getMaximumValueOverall();
        int int26 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfFloorCopy();
        int int28 = property24.getMinimumValue();
        boolean boolean29 = property24.isLeap();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.hourOfHalfday();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.lang.String str53 = locale47.getDisplayCountry(locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        java.util.Locale locale58 = dateTimeParserBucket56.getLocale();
        int int59 = dateTimeField44.getMaximumShortTextLength(locale58);
        java.lang.String str60 = property24.getAsText(locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale58);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.Chronology chronology63 = chronology17.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField64 = chronology63.weekyears();
        org.joda.time.DurationField durationField65 = chronology63.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField64", (durationField43.compareTo(durationField64) == 0) == durationField43.equals(durationField64));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField13, and durationField14", !(durationField15.compareTo(durationField13) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfWeek();
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        java.lang.String str31 = nameProvider21.getShortName(locale25, "hi!", "");
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.millis();
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.lang.String str51 = nameProvider47.getName(locale48, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology45, locale48, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str57 = nameProvider21.getName(locale48, "ISOChronology[UTC]", "DurationField[years]");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale48, (java.lang.Integer) 2, (int) (short) 1);
        java.lang.Integer int61 = dateTimeParserBucket60.getPivotYear();
        org.joda.time.Chronology chronology62 = dateTimeParserBucket60.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField14, and durationField46", !(durationField63.compareTo(durationField14) == 0) || (Math.signum(durationField63.compareTo(durationField46)) == Math.signum(durationField14.compareTo(durationField46))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        int int28 = localDateTime27.getYearOfCentury();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField35 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField37 = chronology12.eras();
        org.joda.time.DurationField durationField38 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField37", Math.signum(durationField14.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField14)));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readablePeriod23);
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField29 = durationFieldType1.getField(chronology26);
        java.lang.String str30 = chronology26.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        java.lang.String str18 = chronology13.toString();
        org.joda.time.DurationField durationField19 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField14, and durationField15", !(durationField19.compareTo(durationField14) == 0) || (Math.signum(durationField19.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = property24.getMaximumValueOverall();
        int int26 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfFloorCopy();
        int int28 = property24.getMinimumValue();
        boolean boolean29 = property24.isLeap();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.hourOfHalfday();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.lang.String str53 = locale47.getDisplayCountry(locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        java.util.Locale locale58 = dateTimeParserBucket56.getLocale();
        int int59 = dateTimeField44.getMaximumShortTextLength(locale58);
        java.lang.String str60 = property24.getAsText(locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology17, locale58);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.Chronology chronology63 = chronology17.withZone(dateTimeZone62);
        org.joda.time.DurationField durationField64 = chronology63.weekyears();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField64", (durationField43.compareTo(durationField64) == 0) == durationField43.equals(durationField64));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        int int28 = localDateTime27.getYearOfCentury();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField35 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField37 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology12.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField37", Math.signum(durationField14.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField14)));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DurationField durationField15 = chronology12.weeks();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField13, and durationField15", !(durationField16.compareTo(durationField13) == 0) || (Math.signum(durationField16.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket14.getZone();
        org.joda.time.Chronology chronology21 = dateTimeParserBucket14.getChronology();
        java.lang.String str22 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfDay();
        long long27 = chronology21.add((long) 'a', 10L, (int) (short) 0);
        boolean boolean28 = durationFieldType1.isSupported(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        java.lang.String str31 = durationFieldType30.toString();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket43.getLocale();
        boolean boolean47 = dateTimeParserBucket43.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology48 = dateTimeParserBucket43.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.year();
        org.joda.time.Chronology chronology51 = chronology48.withUTC();
        org.joda.time.DurationField durationField52 = durationFieldType30.getField(chronology51);
        org.joda.time.DurationField durationField53 = durationFieldType1.getField(chronology51);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = null;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = null;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        java.lang.String str62 = locale56.getDisplayCountry(locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology55, locale56, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology66 = dateTimeParserBucket65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.years();
        org.joda.time.DateTimeField dateTimeField68 = chronology66.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField69 = chronology66.dayOfWeek();
        org.joda.time.DurationField durationField70 = dateTimeField69.getRangeDurationField();
        int int71 = durationField53.compareTo(durationField70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField53 and durationField67", (durationField53.compareTo(durationField67) == 0) == durationField53.equals(durationField67));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 0, 0);
        dateTimeParserBucket26.setOffset((java.lang.Integer) 10);
        java.lang.Object obj29 = dateTimeParserBucket26.saveState();
        java.lang.Integer int30 = dateTimeParserBucket26.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket26.getZone();
        org.joda.time.Chronology chronology32 = chronology12.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField33 = chronology32.centuries();
        org.joda.time.DurationField durationField34 = chronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField13, and durationField33", !(durationField34.compareTo(durationField13) == 0) || (Math.signum(durationField34.compareTo(durationField33)) == Math.signum(durationField13.compareTo(durationField33))));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.lang.String str16 = locale10.getDisplayCountry(locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType7.getField(chronology20);
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = null;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale27.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.hourOfHalfday();
        org.joda.time.DurationField durationField40 = chronology37.hours();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.yearOfEra();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundFloorCopy();
        int int48 = localDateTime47.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.year();
        org.joda.time.LocalDateTime localDateTime50 = property49.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime51 = property49.roundHalfCeilingCopy();
        long long53 = chronology37.set((org.joda.time.ReadablePartial) localDateTime51, 1097L);
        org.joda.time.DurationField durationField54 = durationFieldType24.getField(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField38, and durationField40", !(durationField54.compareTo(durationField38) == 0) || (Math.signum(durationField54.compareTo(durationField40)) == Math.signum(durationField38.compareTo(durationField40))));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        long long29 = durationField26.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        long long46 = durationField43.add((long) 'x', 70);
        boolean boolean47 = durationField43.isSupported();
        int int48 = durationField26.compareTo(durationField43);
        long long49 = durationField43.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        int int25 = property21.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime26 = property21.roundCeilingCopy();
        int[] intArray28 = chronology12.get((org.joda.time.ReadablePartial) localDateTime26, (-1104537600000L));
        org.joda.time.DateTimeField dateTimeField29 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField30 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField13, and durationField14", !(durationField30.compareTo(durationField13) == 0) || (Math.signum(durationField30.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        long long25 = chronology17.getDateTimeMillis((-62167219199948L), (int) (short) 1, 28, (int) (byte) 10, (int) 'u');
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(2726520621264000000L, chronology17, locale26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.millisOfDay();
        java.lang.String str45 = chronology41.toString();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.lang.String str55 = locale49.getDisplayCountry(locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) '#', chronology59);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plus(readableDuration62);
        org.joda.time.DateTimeField dateTimeField65 = localDateTime61.getField((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.dayOfWeek();
        int int70 = localDateTime68.getHourOfDay();
        boolean boolean71 = localDateTime61.isAfter((org.joda.time.ReadablePartial) localDateTime68);
        int[] intArray73 = chronology41.get((org.joda.time.ReadablePartial) localDateTime61, 283996800000L);
        org.joda.time.DurationField durationField74 = chronology41.years();
        org.joda.time.DateTimeField dateTimeField75 = chronology41.millisOfDay();
        org.joda.time.DurationField durationField76 = durationFieldType28.getField(chronology41);
        boolean boolean77 = dateTimeParserBucket27.restoreState((java.lang.Object) chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField76", (durationField74.compareTo(durationField76) == 0) == durationField74.equals(durationField76));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField19", Math.signum(durationField17.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField17)));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        long long20 = chronology14.add(54999L, 25252904995199999L, 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.hours();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) '#', chronology14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths((int) (short) 10);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField15, and durationField21", !(durationField22.compareTo(durationField15) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField15.compareTo(durationField21))));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DurationField durationField15 = chronology12.weeks();
        org.joda.time.DurationField durationField16 = chronology12.seconds();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField13, and durationField15", !(durationField17.compareTo(durationField13) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale15.getDisplayCountry(locale18);
        dateTimeParserBucket11.saveField(dateTimeFieldType13, "", locale15);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.seconds();
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField25", Math.signum(durationField24.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField24)));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        java.lang.String str16 = chronology12.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.yearOfEra();
        int int24 = property23.getMaximumValueOverall();
        int int25 = property23.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime26 = property23.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.yearOfEra();
        int int33 = property32.getMaximumValueOverall();
        int int34 = property32.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime35 = property32.roundHalfFloorCopy();
        int int36 = property23.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.minus(readablePeriod39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plus(readablePeriod41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        int int45 = localDateTime40.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = localDateTime40.toDateTime();
        int int47 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime40);
        int int48 = localDateTime40.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property49 = localDateTime40.dayOfYear();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = null;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.lang.String str59 = locale53.getDisplayCountry(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology52, locale53, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.hourOfHalfday();
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale66.getDisplayCountry(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology63, locale66, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField76 = chronology63.weekyears();
        org.joda.time.DurationFieldType durationFieldType77 = durationField76.getType();
        boolean boolean78 = localDateTime40.isSupported(durationFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField76", (durationField64.compareTo(durationField76) == 0) == durationField64.equals(durationField76));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale15 = dateTimeParserBucket13.getLocale();
        boolean boolean17 = dateTimeParserBucket13.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.hourOfDay();
        boolean boolean21 = durationFieldType1.isSupported(chronology18);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.hourOfHalfday();
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.lang.String str45 = locale39.getDisplayCountry(locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology36, locale39, (java.lang.Integer) 2, 70);
        org.joda.time.DateTimeField dateTimeField49 = chronology36.year();
        org.joda.time.DateTimeField dateTimeField50 = chronology36.dayOfYear();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((-1104537600000L), chronology36);
        org.joda.time.DateTimeField dateTimeField52 = chronology36.dayOfWeek();
        org.joda.time.DurationField durationField53 = chronology36.eras();
        boolean boolean54 = durationFieldType1.isSupported(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField37 and durationField53", Math.signum(durationField37.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField37)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        org.joda.time.DateTimeField dateTimeField27 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((-1104537600000L), chronology14);
        org.joda.time.DateTimeField dateTimeField30 = chronology14.dayOfWeek();
        org.joda.time.DurationField durationField31 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology14.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField31", Math.signum(durationField15.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField15)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.hours();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '#', chronology31);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plus(readableDuration34);
        org.joda.time.DateTimeField dateTimeField37 = localDateTime33.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withMonthOfYear(4);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime33.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.minuteOfHour();
        long long44 = chronology16.set((org.joda.time.ReadablePartial) localDateTime41, 469L);
        org.joda.time.DurationField durationField45 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField17, and durationField32", !(durationField45.compareTo(durationField17) == 0) || (Math.signum(durationField45.compareTo(durationField32)) == Math.signum(durationField17.compareTo(durationField32))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfSecond();
        boolean boolean18 = dateTimeField16.isLeap((-61851579048000L));
        org.joda.time.DurationField durationField19 = dateTimeField16.getRangeDurationField();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.year();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.minuteOfDay();
        org.joda.time.DurationField durationField38 = chronology32.weekyears();
        int int39 = durationField19.compareTo(durationField38);
        int int41 = durationField19.getValue((-13783L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField38", (durationField13.compareTo(durationField38) == 0) == durationField13.equals(durationField38));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.year();
        org.joda.time.Chronology chronology22 = chronology19.withUTC();
        org.joda.time.DurationField durationField23 = durationFieldType1.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.lang.String str35 = locale29.getDisplayCountry(locale32);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology39 = dateTimeParserBucket38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.year();
        org.joda.time.DurationField durationField41 = chronology39.years();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minus(readablePeriod46);
        boolean boolean48 = dateTimeZone42.isLocalDateTimeGap(localDateTime47);
        org.joda.time.Chronology chronology49 = chronology39.withZone(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (-1), chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 46);
        int[] intArray55 = chronology22.get((org.joda.time.ReadablePartial) localDateTime53, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField41", (durationField23.compareTo(durationField41) == 0) == durationField23.equals(durationField41));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.year();
        org.joda.time.Chronology chronology22 = chronology19.withUTC();
        org.joda.time.DurationField durationField23 = durationFieldType1.getField(chronology22);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.year();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField42 = chronology36.weekyears();
        long long45 = durationField42.subtract((long) (byte) 10, (int) (short) 1);
        long long47 = durationField42.getValueAsLong((long) 31);
        boolean boolean48 = durationField42.isSupported();
        int int50 = durationField42.getValue((long) 372);
        long long52 = durationField42.getMillis((long) (-52));
        int int53 = durationField23.compareTo(durationField42);
        long long56 = durationField42.getDifferenceAsLong(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField37", (durationField42.compareTo(durationField37) == 0) == durationField42.equals(durationField37));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        boolean boolean17 = durationFieldType1.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.secondOfMinute();
        org.joda.time.DurationField durationField19 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readablePeriod23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.yearOfEra();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundFloorCopy();
        int int27 = localDateTime26.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.yearOfEra();
        int int29 = property28.getLeapAmount();
        org.joda.time.DurationField durationField30 = property28.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean37 = localDateTime33.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property38 = localDateTime33.era();
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.monthOfYear();
        org.joda.time.LocalDateTime.Property property40 = localDateTime33.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.withDayOfMonth(2);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusMillis((-1));
        org.joda.time.DateTime dateTime45 = localDateTime44.toDateTime();
        int int46 = property28.getDifference((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.lang.String str55 = locale49.getDisplayCountry(locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale49, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = dateTimeField60.getType();
        long long63 = dateTimeField60.roundHalfEven((long) (-1));
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale66.getDisplayCountry(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.millisOfDay();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField79 = chronology76.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField80 = chronology76.millisOfDay();
        org.joda.time.DateTimeField dateTimeField81 = chronology76.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime(chronology76);
        java.util.Locale locale86 = new java.util.Locale("10", "DurationField[years]");
        java.lang.String str87 = locale86.getVariant();
        java.util.Set<java.lang.Character> charSet88 = locale86.getExtensionKeys();
        java.lang.String str89 = dateTimeField60.getAsText((org.joda.time.ReadablePartial) localDateTime82, (int) (short) 100, locale86);
        java.lang.String str90 = property28.getAsShortText(locale86);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket((long) (-9), chronology14, locale86, (java.lang.Integer) 6, 1937);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField19", (durationField15.compareTo(durationField19) == 0) == durationField15.equals(durationField19));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology13);
        org.joda.time.DurationField durationField16 = chronology13.days();
        org.joda.time.DurationField durationField17 = chronology13.eras();
        org.joda.time.DurationField durationField18 = chronology13.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField17", Math.signum(durationField16.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField16)));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        org.joda.time.DurationField durationField16 = chronology13.months();
        org.joda.time.DurationField durationField17 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField14, and durationField16", !(durationField17.compareTo(durationField14) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.hours();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '#', chronology29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMonths((int) (short) 10);
        boolean boolean34 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime();
        long long36 = dateTime35.getMillis();
        org.joda.time.Instant instant37 = dateTime35.toInstant();
        long long38 = instant37.getMillis();
        org.joda.time.DateTimeZone dateTimeZone39 = instant37.getZone();
        org.joda.time.Instant instant40 = instant37.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = instant40.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant40", (dateTime35.compareTo(instant40) == 0) == dateTime35.equals(instant40));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        java.lang.String str6 = property5.getName();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.lang.String str16 = locale10.getDisplayCountry(locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.hours();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '#', chronology20);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.hours();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) '#', chronology36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMonths((int) (short) 10);
        boolean boolean41 = localDateTime22.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTime dateTime42 = localDateTime38.toDateTime();
        long long43 = dateTime42.getMillis();
        org.joda.time.Instant instant44 = dateTime42.toInstant();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.hours();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) '#', chronology58);
        org.joda.time.Chronology chronology63 = null;
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = null;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        java.util.Locale locale68 = null;
        java.lang.String str69 = locale67.getDisplayVariant(locale68);
        java.lang.String str70 = locale64.getDisplayCountry(locale67);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology63, locale64, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology74 = dateTimeParserBucket73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.hours();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) '#', chronology74);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusMonths((int) (short) 10);
        boolean boolean79 = localDateTime60.isBefore((org.joda.time.ReadablePartial) localDateTime76);
        org.joda.time.DateTime dateTime80 = localDateTime76.toDateTime();
        long long81 = dateTime80.getMillis();
        org.joda.time.Instant instant82 = dateTime80.toInstant();
        boolean boolean83 = dateTime42.isAfter((org.joda.time.ReadableInstant) instant82);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone85);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.minus(readablePeriod87);
        int int89 = localDateTime88.getYearOfCentury();
        java.util.Date date90 = localDateTime88.toDate();
        org.joda.time.LocalDateTime localDateTime92 = localDateTime88.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime94 = localDateTime92.toDateTime(dateTimeZone93);
        org.joda.time.Instant instant95 = dateTime94.toInstant();
        boolean boolean96 = instant82.isBefore((org.joda.time.ReadableInstant) dateTime94);
        long long97 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant82);
        org.joda.time.LocalDateTime localDateTime99 = property5.addToCopy(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant44", (dateTime42.compareTo(instant44) == 0) == dateTime42.equals(instant44));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        java.lang.String str28 = durationFieldType27.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField15", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DurationField durationField19 = chronology13.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField18", (durationField14.compareTo(durationField18) == 0) == durationField14.equals(durationField18));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfDay();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField17", Math.signum(durationField13.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField13)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology13);
        org.joda.time.DurationField durationField16 = chronology13.days();
        org.joda.time.DurationField durationField17 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField17", Math.signum(durationField16.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField16)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        int int28 = localDateTime27.getYearOfCentury();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField35 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField37 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField37", Math.signum(durationField14.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField14)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        int int5 = localDateTime2.getMillisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = null;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        java.lang.String str14 = locale8.getDisplayCountry(locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        org.joda.time.DurationField durationField20 = chronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        boolean boolean27 = dateTimeZone21.isLocalDateTimeGap(localDateTime26);
        org.joda.time.Chronology chronology28 = chronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.util.TimeZone timeZone30 = dateTimeZone21.toTimeZone();
        java.lang.String str32 = dateTimeZone21.getNameKey(10L);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime34 = localDateTime2.toDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property35 = localDateTime2.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = property35.getRangeDurationField();
        int int37 = property35.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField36", (durationField20.compareTo(durationField36) == 0) == durationField20.equals(durationField36));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.year();
        org.joda.time.Chronology chronology22 = chronology19.withUTC();
        org.joda.time.DurationField durationField23 = durationFieldType1.getField(chronology22);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.year();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField42 = chronology36.weekyears();
        long long45 = durationField42.subtract((long) (byte) 10, (int) (short) 1);
        long long47 = durationField42.getValueAsLong((long) 31);
        boolean boolean48 = durationField42.isSupported();
        int int50 = durationField42.getValue((long) 372);
        long long52 = durationField42.getMillis((long) (-52));
        int int53 = durationField23.compareTo(durationField42);
        long long56 = durationField23.getDifferenceAsLong(5183563620L, 9223309849824000010L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField23", (durationField37.compareTo(durationField23) == 0) == durationField37.equals(durationField23));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology12.add(readablePeriod19, 3287L, 3);
        org.joda.time.DurationField durationField23 = chronology12.eras();
        org.joda.time.DurationField durationField24 = chronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField24, and durationField23", !(durationField23.compareTo(durationField24) == 0) || (Math.signum(durationField23.compareTo(durationField23)) == Math.signum(durationField24.compareTo(durationField23))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale43 = dateTimeParserBucket41.getLocale();
        int int44 = dateTimeField29.getMaximumShortTextLength(locale43);
        java.lang.String str45 = locale43.getLanguage();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.minuteOfHour();
        long long63 = dateTimeField60.getDifferenceAsLong(10L, 883612800035L);
        java.util.Locale locale65 = new java.util.Locale("Koordinierte Universalzeit");
        int int66 = dateTimeField60.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale43.getDisplayCountry(locale65);
        java.lang.String str69 = locale65.getExtension('x');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((-1753151L), chronology13, locale65, (java.lang.Integer) 86399999, 44);
        org.joda.time.DurationField durationField73 = chronology13.weekyears();
        org.joda.time.DurationField durationField74 = chronology13.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField73", (durationField14.compareTo(durationField73) == 0) == durationField14.equals(durationField73));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        boolean boolean10 = localDateTime6.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.era();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.monthOfYear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.plusWeeks(19);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfEra();
        int int31 = property30.getMaximumValueOverall();
        int int32 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        int int34 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        boolean boolean36 = locale35.hasExtensions();
        int int37 = property21.getMaximumTextLength(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property21.getFieldType();
        int int39 = localDateTime15.get(dateTimeFieldType38);
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.lang.String str48 = locale42.getDisplayCountry(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology41, locale42, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology52 = dateTimeParserBucket51.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = null;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale55.getDisplayCountry(locale58);
        dateTimeParserBucket51.saveField(dateTimeFieldType53, "", locale55);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket51.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.weekyear();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType38.getField(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now(chronology63);
        org.joda.time.DurationField durationField67 = chronology63.years();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.era();
        boolean boolean69 = dateTimeFieldType2.isSupported(chronology63);
        org.joda.time.DurationField durationField70 = durationFieldType0.getField(chronology63);
        org.joda.time.DurationField durationField71 = chronology63.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField71, durationField67, and durationField70", !(durationField71.compareTo(durationField67) == 0) || (Math.signum(durationField71.compareTo(durationField70)) == Math.signum(durationField67.compareTo(durationField70))));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField23 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField27 = chronology12.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = chronology12.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField27", Math.signum(durationField14.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField14)));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfWeek();
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        java.lang.String str31 = nameProvider21.getShortName(locale25, "hi!", "");
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.millis();
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.lang.String str51 = nameProvider47.getName(locale48, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology45, locale48, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str57 = nameProvider21.getName(locale48, "ISOChronology[UTC]", "DurationField[years]");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale48, (java.lang.Integer) 2, (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = chronology13.add(readablePeriod61, 0L, 86399999);
        org.joda.time.DateTimeField dateTimeField65 = chronology13.weekyear();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.Chronology chronology67 = chronology13.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField68 = chronology13.months();
        org.joda.time.DateTimeField dateTimeField69 = chronology13.hourOfHalfday();
        org.joda.time.DurationField durationField70 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField71 = chronology13.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField70", (durationField14.compareTo(durationField70) == 0) == durationField14.equals(durationField70));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology12.hours();
        org.joda.time.DurationField durationField17 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = chronology13.withZone(dateTimeZone16);
        boolean boolean24 = dateTimeFieldType0.isSupported(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfYear();
        org.joda.time.DurationField durationField29 = chronology23.weeks();
        org.joda.time.DurationField durationField30 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField15, and durationField29", !(durationField30.compareTo(durationField15) == 0) || (Math.signum(durationField30.compareTo(durationField29)) == Math.signum(durationField15.compareTo(durationField29))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket12.getZone();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (-61851579048000L), (int) (short) 0);
        org.joda.time.DurationField durationField26 = durationFieldType0.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField26", Math.signum(durationField21.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField21)));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfDay();
        java.lang.String str17 = chronology13.toString();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.hours();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '#', chronology31);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plus(readableDuration34);
        org.joda.time.DateTimeField dateTimeField37 = localDateTime33.getField((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfWeek();
        int int42 = localDateTime40.getHourOfDay();
        boolean boolean43 = localDateTime33.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        int[] intArray45 = chronology13.get((org.joda.time.ReadablePartial) localDateTime33, 283996800000L);
        org.joda.time.DurationField durationField46 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField47 = chronology13.millisOfDay();
        org.joda.time.DurationField durationField48 = durationFieldType0.getField(chronology13);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology13.add(readablePeriod49, (-10L), 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField48", (durationField46.compareTo(durationField48) == 0) == durationField46.equals(durationField48));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekyearOfCentury();
        int int27 = dateTimeField25.get(1672876800000L);
        int int30 = dateTimeField25.getDifference((long) 100, 3707467781629L);
        int int31 = dateTimeField25.getMinimumValue();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.year();
        org.joda.time.DurationField durationField46 = chronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.secondOfDay();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now(chronology44);
        java.util.Locale locale53 = new java.util.Locale("Englisch", "italien (Italie)", "69");
        java.lang.String str54 = locale53.getDisplayName();
        java.lang.String str55 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime48, 6, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField46", (durationField14.compareTo(durationField46) == 0) == durationField14.equals(durationField46));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.hours();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) '#', chronology29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMonths((int) (short) 10);
        boolean boolean34 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime();
        long long36 = dateTime35.getMillis();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readablePeriod40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        int int44 = localDateTime43.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        int int47 = dateTime35.get(dateTimeFieldType46);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.lang.String str56 = locale50.getDisplayCountry(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.years();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        long long65 = chronology60.add(readablePeriod62, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField66 = chronology60.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology60.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime35, chronology60);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusDays(100);
        org.joda.time.DurationFieldType durationFieldType71 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str72 = durationFieldType71.getName();
        org.joda.time.Chronology chronology75 = null;
        java.util.Locale locale76 = java.util.Locale.GERMAN;
        java.util.Locale locale77 = null;
        java.lang.String str78 = locale76.getDisplayVariant(locale77);
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.util.Locale locale80 = null;
        java.lang.String str81 = locale79.getDisplayVariant(locale80);
        java.lang.String str82 = locale76.getDisplayCountry(locale79);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket85 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology75, locale76, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology86 = dateTimeParserBucket85.getChronology();
        org.joda.time.DurationField durationField87 = chronology86.millis();
        org.joda.time.tz.NameProvider nameProvider88 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale89 = java.util.Locale.TAIWAN;
        java.lang.String str92 = nameProvider88.getName(locale89, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket95 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology86, locale89, (java.lang.Integer) 28, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField96 = chronology86.era();
        org.joda.time.DurationField durationField97 = durationFieldType71.getField(chronology86);
        org.joda.time.LocalDateTime localDateTime99 = localDateTime70.withFieldAdded(durationFieldType71, 38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField61 and durationField97", (durationField61.compareTo(durationField97) == 0) == durationField61.equals(durationField97));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        int int4 = property3.getMinimumValueOverall();
        int int5 = property3.getLeapAmount();
        java.lang.String str6 = property3.getAsString();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        long long10 = durationField7.getMillis(86390001, 2L);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale14.getDisplayCountry(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.hourOfHalfday();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = null;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale27.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology24, locale27, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField37 = chronology24.weekyears();
        long long40 = durationField37.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = null;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.lang.String str49 = locale43.getDisplayCountry(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket52.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.years();
        long long57 = durationField54.add((long) 'x', 70);
        boolean boolean58 = durationField54.isSupported();
        int int59 = durationField37.compareTo(durationField54);
        int int60 = durationField7.compareTo(durationField54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField54 and durationField37", (durationField54.compareTo(durationField37) == 0) == durationField54.equals(durationField37));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        java.lang.String str16 = chronology12.toString();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.year();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.millisOfDay();
        java.lang.String str35 = chronology31.toString();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.lang.String str45 = locale39.getDisplayCountry(locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology38, locale39, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket48.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.hours();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) '#', chronology49);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plus(readableDuration52);
        org.joda.time.DateTimeField dateTimeField55 = localDateTime51.getField((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfWeek();
        int int60 = localDateTime58.getHourOfDay();
        boolean boolean61 = localDateTime51.isAfter((org.joda.time.ReadablePartial) localDateTime58);
        int[] intArray63 = chronology31.get((org.joda.time.ReadablePartial) localDateTime51, 283996800000L);
        org.joda.time.DurationField durationField64 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology31.millisOfDay();
        org.joda.time.DurationField durationField66 = durationFieldType18.getField(chronology31);
        boolean boolean67 = localDateTime17.isSupported(durationFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField66", (durationField64.compareTo(durationField66) == 0) == durationField64.equals(durationField66));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfWeek();
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        java.lang.String str31 = nameProvider21.getShortName(locale25, "hi!", "");
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.millis();
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.lang.String str51 = nameProvider47.getName(locale48, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology45, locale48, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str57 = nameProvider21.getName(locale48, "ISOChronology[UTC]", "DurationField[years]");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale48, (java.lang.Integer) 2, (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = chronology13.add(readablePeriod61, 0L, 86399999);
        org.joda.time.DateTimeField dateTimeField65 = chronology13.weekyear();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.Chronology chronology67 = chronology13.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField68 = chronology13.months();
        org.joda.time.DateTimeField dateTimeField69 = chronology13.hourOfHalfday();
        org.joda.time.DurationField durationField70 = chronology13.weekyears();
        org.joda.time.DurationField durationField71 = chronology13.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField70", (durationField14.compareTo(durationField70) == 0) == durationField14.equals(durationField70));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField18", (durationField14.compareTo(durationField18) == 0) == durationField14.equals(durationField18));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = dateTimeField13.getMaximumValue(readablePartial14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfEra();
        int int31 = property30.getMaximumValueOverall();
        int int32 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        int int34 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean36 = localDateTime33.isSupported(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withPeriodAdded(readablePeriod37, (int) 'a');
        int[] intArray40 = new int[] {};
        int int41 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime33, intArray40);
        java.lang.String str42 = dateTimeField13.toString();
        long long44 = dateTimeField13.roundCeiling(0L);
        org.joda.time.DurationField durationField45 = dateTimeField13.getLeapDurationField();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.years();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology58.minuteOfDay();
        org.joda.time.DurationField durationField64 = chronology58.weekyears();
        long long67 = durationField64.subtract((long) (byte) 10, (int) (short) 1);
        long long69 = durationField64.getValueAsLong((long) 31);
        boolean boolean70 = durationField64.isSupported();
        int int72 = durationField64.getValue((long) 372);
        long long74 = durationField64.getMillis((long) (-52));
        long long77 = durationField64.getMillis(0L, 3600000L);
        int int78 = durationField45.compareTo(durationField64);
        int int81 = durationField45.getDifference(86399988L, 187200000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket12.getZone();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (-61851579048000L), (int) (short) 0);
        org.joda.time.DurationField durationField26 = durationFieldType0.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField27 = chronology19.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField26", Math.signum(durationField21.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField21)));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        int int15 = property14.getMaximumValueOverall();
        int int16 = property14.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        int int18 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean22 = localDateTime20.isSupported(dateTimeFieldType21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withPeriodAdded(readablePeriod23, 2);
        org.joda.time.Chronology chronology26 = localDateTime20.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale30.getDisplayCountry(locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.hours();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '#', chronology40);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayVariant(locale50);
        java.lang.String str52 = locale46.getDisplayCountry(locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.hours();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) '#', chronology56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMonths((int) (short) 10);
        boolean boolean61 = localDateTime42.isBefore((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime();
        long long63 = dateTime62.getMillis();
        org.joda.time.Instant instant64 = dateTime62.toInstant();
        long long65 = instant64.getMillis();
        org.joda.time.DateTime dateTime66 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Chronology chronology67 = dateTime66.getChronology();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology67.getZone();
        long long71 = dateTimeZone68.convertLocalToUTC(19L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant64", (dateTime62.compareTo(instant64) == 0) == dateTime62.equals(instant64));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology13.add(readablePeriod16, 883612800000L, (int) ' ');
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.year();
        boolean boolean34 = dateTimeField33.isSupported();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.yearOfEra();
        int int41 = property40.getMaximumValueOverall();
        int int42 = property40.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMonths((int) (byte) -1);
        java.util.Locale locale48 = new java.util.Locale("Koordinierte Universalzeit");
        java.lang.String str49 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime43, (int) (byte) 1, locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale48, (java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField52 = chronology13.yearOfEra();
        org.joda.time.DurationField durationField53 = chronology13.days();
        org.joda.time.DurationField durationField54 = chronology13.millis();
        org.joda.time.DurationField durationField55 = chronology13.years();
        org.joda.time.DurationField durationField56 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField56, durationField14, and durationField53", !(durationField56.compareTo(durationField14) == 0) || (Math.signum(durationField56.compareTo(durationField53)) == Math.signum(durationField14.compareTo(durationField53))));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        boolean boolean20 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime18);
        int int21 = localDateTime15.getDayOfYear();
        int int22 = localDateTime15.getCenturyOfEra();
        int int23 = localDateTime15.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        int int26 = dateTimeZone24.getOffset((long) (short) 0);
        long long29 = dateTimeZone24.convertLocalToUTC(283996800000L, true);
        long long32 = dateTimeZone24.convertLocalToUTC((long) 9, true);
        java.lang.String str33 = dateTimeZone24.toString();
        long long37 = dateTimeZone24.convertLocalToUTC((long) (short) 100, true, (long) 0);
        org.joda.time.DateTime dateTime38 = localDateTime15.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minus(readablePeriod42);
        int int44 = localDateTime41.getMillisOfSecond();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.lang.String str53 = locale47.getDisplayCountry(locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.year();
        org.joda.time.DurationField durationField59 = chronology57.years();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minus(readablePeriod64);
        boolean boolean66 = dateTimeZone60.isLocalDateTimeGap(localDateTime65);
        org.joda.time.Chronology chronology67 = chronology57.withZone(dateTimeZone60);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        java.util.TimeZone timeZone69 = dateTimeZone60.toTimeZone();
        java.lang.String str71 = dateTimeZone60.getNameKey(10L);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime73 = localDateTime41.toDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime.Property property74 = localDateTime41.weekOfWeekyear();
        org.joda.time.DurationField durationField75 = property74.getRangeDurationField();
        boolean boolean76 = localDateTime15.equals((java.lang.Object) property74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField75", (durationField13.compareTo(durationField75) == 0) == durationField13.equals(durationField75));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale22, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        java.util.Locale locale33 = dateTimeParserBucket31.getLocale();
        boolean boolean35 = dateTimeParserBucket31.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology36 = dateTimeParserBucket31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket31.getZone();
        org.joda.time.Chronology chronology38 = dateTimeParserBucket31.getChronology();
        java.lang.String str39 = chronology38.toString();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.joda.time.DurationField durationField42 = durationFieldType19.getField(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField42", (durationField14.compareTo(durationField42) == 0) == durationField14.equals(durationField42));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology13.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology14);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.years();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfHalfday();
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = null;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.lang.String str50 = locale44.getDisplayCountry(locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology41, locale44, (java.lang.Integer) 2, 70);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.Chronology chronology55 = dateTimeParserBucket53.getChronology();
        java.lang.String str56 = chronology55.toString();
        org.joda.time.DurationField durationField57 = chronology55.weekyears();
        boolean boolean58 = dateTimeFieldType0.isSupported(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField57", (durationField15.compareTo(durationField57) == 0) == durationField15.equals(durationField57));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = dateTimeField13.getMaximumValue(readablePartial14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfEra();
        int int31 = property30.getMaximumValueOverall();
        int int32 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        int int34 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean36 = localDateTime33.isSupported(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withPeriodAdded(readablePeriod37, (int) 'a');
        int[] intArray40 = new int[] {};
        int int41 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime33, intArray40);
        java.lang.String str42 = dateTimeField13.toString();
        long long44 = dateTimeField13.roundCeiling(0L);
        org.joda.time.DurationField durationField45 = dateTimeField13.getLeapDurationField();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.years();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology58.minuteOfDay();
        org.joda.time.DurationField durationField64 = chronology58.weekyears();
        long long67 = durationField64.subtract((long) (byte) 10, (int) (short) 1);
        long long69 = durationField64.getValueAsLong((long) 31);
        boolean boolean70 = durationField64.isSupported();
        int int72 = durationField64.getValue((long) 372);
        long long74 = durationField64.getMillis((long) (-52));
        long long77 = durationField64.getMillis(0L, 3600000L);
        int int78 = durationField45.compareTo(durationField64);
        long long81 = durationField45.add((long) 38, 87668);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology12.weekyears();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology12.add(readablePeriod18, 22074595200000L, (-2));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readableDuration16);
        org.joda.time.DateTimeField dateTimeField19 = localDateTime15.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withMonthOfYear(4);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.withSecondOfMinute((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.yearOfEra();
        int int39 = property38.getMaximumValueOverall();
        int int40 = property38.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime41 = property38.roundHalfFloorCopy();
        int int42 = property29.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        boolean boolean44 = locale43.hasExtensions();
        int int45 = property29.getMaximumTextLength(locale43);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property29.getFieldType();
        int int47 = localDateTime23.indexOf(dateTimeFieldType46);
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType46.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType46.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology51 = null;
        boolean boolean52 = dateTimeFieldType50.isSupported(chronology51);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = null;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = null;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        java.lang.String str62 = locale56.getDisplayCountry(locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology55, locale56, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology66 = dateTimeParserBucket65.getChronology();
        org.joda.time.DurationField durationField67 = chronology66.hours();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) '#', chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField70 = chronology66.era();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType50.getField(chronology66);
        org.joda.time.DateTimeField dateTimeField72 = chronology66.secondOfMinute();
        org.joda.time.DurationField durationField73 = chronology66.weekyears();
        org.joda.time.DurationField durationField74 = durationFieldType49.getField(chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField14, and durationField73", !(durationField74.compareTo(durationField14) == 0) || (Math.signum(durationField74.compareTo(durationField73)) == Math.signum(durationField14.compareTo(durationField73))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField28 = chronology14.millisOfSecond();
        org.joda.time.DurationField durationField29 = chronology14.years();
        org.joda.time.DurationField durationField30 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField31 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = chronology14.secondOfDay();
        org.joda.time.DurationField durationField33 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField15, and durationField30", !(durationField33.compareTo(durationField15) == 0) || (Math.signum(durationField33.compareTo(durationField30)) == Math.signum(durationField15.compareTo(durationField30))));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.millis();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DurationField durationField15 = chronology12.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        int int15 = property14.getMaximumValueOverall();
        int int16 = property14.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        int int18 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean20 = localDateTime17.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        java.lang.String str25 = property24.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = localDateTime17.get(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType26.getDurationType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        org.joda.time.DurationField durationField43 = chronology41.years();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minus(readablePeriod48);
        boolean boolean50 = dateTimeZone44.isLocalDateTimeGap(localDateTime49);
        org.joda.time.Chronology chronology51 = chronology41.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField52 = chronology41.weekyears();
        boolean boolean53 = durationFieldType28.isSupported(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField52", (durationField43.compareTo(durationField52) == 0) == durationField43.equals(durationField52));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.year();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology16.eras();
        org.joda.time.DurationField durationField22 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField22, and durationField21", !(durationField21.compareTo(durationField22) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField22.compareTo(durationField21))));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        int int8 = property5.getLeapAmount();
        java.lang.String str9 = property5.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        java.lang.String str12 = durationFieldType11.toString();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale16, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.years();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        boolean boolean29 = durationFieldType13.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.secondOfMinute();
        java.lang.String str31 = chronology26.toString();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DurationField durationField33 = durationFieldType11.getField(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField27, and durationField28", !(durationField33.compareTo(durationField27) == 0) || (Math.signum(durationField33.compareTo(durationField28)) == Math.signum(durationField27.compareTo(durationField28))));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.weekyear();
        org.joda.time.DurationField durationField18 = durationFieldType1.getField(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.lang.String str29 = locale23.getDisplayCountry(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology22, locale23, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfHalfday();
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology33, locale36, (java.lang.Integer) 2, 70);
        boolean boolean46 = dateTimeFieldType19.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField47 = chronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField48 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology33.clockhourOfDay();
        boolean boolean50 = durationFieldType1.isSupported(chronology33);
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = null;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.lang.String str59 = locale53.getDisplayCountry(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology52, locale53, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket62.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.years();
        org.joda.time.Chronology chronology65 = chronology63.withUTC();
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.GERMAN;
        java.util.Locale locale69 = null;
        java.lang.String str70 = locale68.getDisplayVariant(locale69);
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = null;
        java.lang.String str73 = locale71.getDisplayVariant(locale72);
        java.lang.String str74 = locale68.getDisplayCountry(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 0, 0);
        dateTimeParserBucket77.setOffset((java.lang.Integer) 10);
        java.lang.Object obj80 = dateTimeParserBucket77.saveState();
        java.lang.Integer int81 = dateTimeParserBucket77.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTimeParserBucket77.getZone();
        org.joda.time.Chronology chronology83 = chronology63.withZone(dateTimeZone82);
        org.joda.time.DateTimeField dateTimeField84 = chronology63.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField85 = chronology63.secondOfMinute();
        org.joda.time.DurationField durationField86 = chronology63.eras();
        boolean boolean87 = durationFieldType1.isSupported(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField86", Math.signum(durationField18.compareTo(durationField86)) == -Math.signum(durationField86.compareTo(durationField18)));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        int int16 = dateTimeField14.get((-62167215000000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField14.getType();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.lang.String str26 = locale20.getDisplayCountry(locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        java.util.Locale locale31 = dateTimeParserBucket29.getLocale();
        boolean boolean33 = dateTimeParserBucket29.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology34 = dateTimeParserBucket29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket29.getZone();
        org.joda.time.Chronology chronology36 = dateTimeParserBucket29.getChronology();
        java.lang.String str37 = chronology36.toString();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.millisOfDay();
        long long42 = chronology36.add((long) 'a', 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField43 = chronology36.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType17.getField(chronology36);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.lang.String str53 = locale47.getDisplayCountry(locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.years();
        org.joda.time.Chronology chronology59 = chronology57.withUTC();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = chronology57.yearOfCentury();
        org.joda.time.DurationField durationField62 = chronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType17.getField(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField58 and durationField62", (durationField58.compareTo(durationField62) == 0) == durationField58.equals(durationField62));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology12.hours();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField13, and durationField15", !(durationField18.compareTo(durationField13) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths((int) (short) 10);
        int int18 = localDateTime15.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = property24.getMaximumValueOverall();
        int int26 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.yearOfEra();
        int int34 = property33.getMaximumValueOverall();
        int int35 = property33.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfFloorCopy();
        int int37 = property24.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYearOfCentury((int) ' ');
        int int41 = localDateTime40.size();
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime();
        org.joda.time.Instant instant43 = dateTime42.toInstant();
        org.joda.time.DateTime dateTime44 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int46 = dateTime42.get(dateTimeFieldType45);
        java.lang.String str47 = dateTimeFieldType45.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant43", (dateTime42.compareTo(instant43) == 0) == dateTime42.equals(instant43));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        int int9 = property5.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundCeilingCopy();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale14.getDisplayCountry(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.hours();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '#', chronology24);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale30.getDisplayCountry(locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.hours();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '#', chronology40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusMonths((int) (short) 10);
        boolean boolean45 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime();
        long long47 = dateTime46.getMillis();
        org.joda.time.Instant instant48 = dateTime46.toInstant();
        int int49 = property5.getDifference((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalDateTime localDateTime51 = property5.addWrapFieldToCopy((int) '4');
        int int52 = property5.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime53 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfYear(32);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant48", (dateTime46.compareTo(instant48) == 0) == dateTime46.equals(instant48));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.weekyear();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType28.getField(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.years();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology41.getZone();
        org.joda.time.Chronology chronology47 = chronology16.withZone(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField45", Math.signum(durationField20.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField20)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        long long17 = durationField14.getMillis(23, (long) 2041);
        int int19 = durationField14.getValue(3600100L);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.lang.String str29 = locale23.getDisplayCountry(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology22, locale23, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfHalfday();
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology33, locale36, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField46 = chronology33.weekyears();
        long long49 = durationField46.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.lang.String str58 = locale52.getDisplayCountry(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology51, locale52, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology62 = dateTimeParserBucket61.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.years();
        long long66 = durationField63.add((long) 'x', 70);
        boolean boolean67 = durationField63.isSupported();
        int int68 = durationField46.compareTo(durationField63);
        long long71 = durationField46.getMillis((long) 7, 12620102400000L);
        java.lang.String str72 = durationField46.getName();
        int int73 = durationField14.compareTo(durationField46);
        long long76 = durationField14.add((-723180L), 86399L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField46", (durationField13.compareTo(durationField46) == 0) == durationField13.equals(durationField46));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType28.getField(chronology41);
        java.util.Locale locale47 = new java.util.Locale("10", "DurationField[years]");
        java.lang.String str48 = locale47.getVariant();
        java.util.Set<java.lang.Character> charSet49 = locale47.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(170208000010L, chronology41, locale47, (java.lang.Integer) 365, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(95L, chronology41);
        org.joda.time.DurationField durationField54 = chronology41.weeks();
        long long56 = durationField54.getMillis(86399);
        int int57 = durationField18.compareTo(durationField54);
        boolean boolean58 = durationField54.isPrecise();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField18", (durationField14.compareTo(durationField18) == 0) == durationField14.equals(durationField18));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.year();
        org.joda.time.Chronology chronology22 = chronology19.withUTC();
        org.joda.time.DurationField durationField23 = durationFieldType1.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.centuryOfEra();
        org.joda.time.DurationField durationField26 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField26", (durationField23.compareTo(durationField26) == 0) == durationField23.equals(durationField26));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DurationField durationField15 = chronology12.seconds();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField13, and durationField15", !(durationField18.compareTo(durationField13) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField19", Math.signum(durationField17.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField17)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.dayOfWeek();
        org.joda.time.tz.NameProvider nameProvider21 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale25);
        java.lang.String str31 = nameProvider21.getShortName(locale25, "hi!", "");
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.millis();
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale48 = java.util.Locale.TAIWAN;
        java.lang.String str51 = nameProvider47.getName(locale48, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology45, locale48, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str57 = nameProvider21.getName(locale48, "ISOChronology[UTC]", "DurationField[years]");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale48, (java.lang.Integer) 2, (int) (short) 1);
        java.lang.Integer int61 = dateTimeParserBucket60.getPivotYear();
        org.joda.time.Chronology chronology62 = dateTimeParserBucket60.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.minuteOfHour();
        org.joda.time.DurationField durationField64 = chronology62.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField14, and durationField46", !(durationField64.compareTo(durationField14) == 0) || (Math.signum(durationField64.compareTo(durationField46)) == Math.signum(durationField14.compareTo(durationField46))));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        org.joda.time.DateTimeField dateTimeField27 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((-1104537600000L), chronology14);
        org.joda.time.DateTimeField dateTimeField30 = chronology14.dayOfWeek();
        org.joda.time.DurationField durationField31 = chronology14.eras();
        org.joda.time.DurationField durationField32 = chronology14.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField31", Math.signum(durationField15.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField15)));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        java.lang.String str19 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        org.joda.time.DurationField durationField21 = chronology18.minutes();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        int int27 = localDateTime24.getMillisOfSecond();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale30.getDisplayCountry(locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.year();
        org.joda.time.DurationField durationField42 = chronology40.years();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        boolean boolean49 = dateTimeZone43.isLocalDateTimeGap(localDateTime48);
        org.joda.time.Chronology chronology50 = chronology40.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        java.util.TimeZone timeZone52 = dateTimeZone43.toTimeZone();
        java.lang.String str54 = dateTimeZone43.getNameKey(10L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime56 = localDateTime24.toDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property57 = localDateTime24.weekOfWeekyear();
        org.joda.time.DurationField durationField58 = property57.getRangeDurationField();
        int int59 = durationField21.compareTo(durationField58);
        long long62 = durationField21.getMillis((-1514764800000L), 2208988800120L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField58", (durationField42.compareTo(durationField58) == 0) == durationField42.equals(durationField58));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        long long19 = durationField16.getValueAsLong((long) (short) -1, 1970L);
        int int22 = durationField16.getDifference(19L, (-252000001L));
        long long25 = durationField16.getDifferenceAsLong(2209075200000L, 72576000000L);
        int int28 = durationField16.getValue(2208988800120L, 0L);
        org.joda.time.DurationFieldType durationFieldType29 = durationField16.getType();
        java.lang.String str30 = durationFieldType29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale18.getDisplayCountry(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 0, 0);
        dateTimeParserBucket27.setOffset((java.lang.Integer) 10);
        java.lang.Object obj30 = dateTimeParserBucket27.saveState();
        java.lang.Integer int31 = dateTimeParserBucket27.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket27.getZone();
        org.joda.time.Chronology chronology33 = chronology13.withZone(dateTimeZone32);
        org.joda.time.tz.NameProvider nameProvider34 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        java.lang.String str44 = nameProvider34.getShortName(locale38, "hi!", "");
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.millis();
        org.joda.time.tz.NameProvider nameProvider60 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.lang.String str64 = nameProvider60.getName(locale61, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology58, locale61, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str70 = nameProvider34.getName(locale61, "ISOChronology[UTC]", "DurationField[years]");
        java.lang.String str71 = locale61.getISO3Language();
        java.lang.String str72 = locale61.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(62135596800000L, chronology33, locale61);
        org.joda.time.DurationField durationField74 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField75 = chronology33.minuteOfHour();
        boolean boolean76 = dateTimeField75.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField74", (durationField59.compareTo(durationField74) == 0) == durationField59.equals(durationField74));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.DurationField durationField10 = property5.getDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfEra();
        int int18 = property17.getMaximumValueOverall();
        int int19 = property17.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime20 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withSecondOfMinute(23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfFloorCopy();
        int int33 = property29.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime34 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMonths((int) (byte) 100);
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = null;
        java.lang.String str43 = locale41.getDisplayVariant(locale42);
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = null;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.lang.String str47 = locale41.getDisplayCountry(locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.hours();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) '#', chronology51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMonths((int) (short) 10);
        int int56 = localDateTime53.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime59.yearOfEra();
        int int63 = property62.getMaximumValueOverall();
        int int64 = property62.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime65 = property62.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minus(readablePeriod69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime68.yearOfEra();
        int int72 = property71.getMaximumValueOverall();
        int int73 = property71.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime74 = property71.roundHalfFloorCopy();
        int int75 = property62.compareTo((org.joda.time.ReadablePartial) localDateTime74);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime74);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withYearOfCentury((int) ' ');
        int int79 = localDateTime78.size();
        org.joda.time.DateTime dateTime80 = localDateTime78.toDateTime();
        org.joda.time.Instant instant81 = dateTime80.toInstant();
        org.joda.time.DateTime dateTime82 = localDateTime53.toDateTime((org.joda.time.ReadableInstant) dateTime80);
        long long83 = dateTime82.getMillis();
        org.joda.time.DateTime dateTime84 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime85 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        int int86 = property5.compareTo((org.joda.time.ReadableInstant) dateTime85);
        long long87 = dateTime85.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime80 and instant81", (dateTime80.compareTo(instant81) == 0) == dateTime80.equals(instant81));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        int int16 = dateTimeField14.get((-62167215000000L));
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField14.getType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType17.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.yearOfEra();
        int int27 = property26.getMaximumValueOverall();
        int int28 = property26.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime29 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minus(readablePeriod33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.yearOfEra();
        int int36 = property35.getMaximumValueOverall();
        int int37 = property35.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime38 = property35.roundHalfFloorCopy();
        int int39 = property26.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean43 = localDateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withPeriodAdded(readablePeriod44, 2);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime localDateTime49 = property47.addToCopy((-52));
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property47.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property47.getFieldType();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = locale54.getDisplayCountry(locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        java.util.Locale locale65 = dateTimeParserBucket63.getLocale();
        boolean boolean67 = dateTimeParserBucket63.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology68 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket63.getZone();
        org.joda.time.Chronology chronology70 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.minuteOfHour();
        org.joda.time.DurationField durationField72 = chronology70.seconds();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.yearOfEra();
        boolean boolean74 = dateTimeFieldType51.isSupported(chronology70);
        org.joda.time.DateTimeField dateTimeField75 = chronology70.year();
        org.joda.time.DurationField durationField76 = chronology70.eras();
        org.joda.time.DurationField durationField77 = durationFieldType20.getField(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField72 and durationField76", Math.signum(durationField72.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField72)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.previousTransition((long) 28);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(22);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.lang.String str16 = locale10.getDisplayCountry(locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.hours();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) '#', chronology20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMonths((int) (short) 10);
        int int25 = localDateTime22.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minus(readablePeriod29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.yearOfEra();
        int int32 = property31.getMaximumValueOverall();
        int int33 = property31.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime34 = property31.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.yearOfEra();
        int int41 = property40.getMaximumValueOverall();
        int int42 = property40.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfFloorCopy();
        int int44 = property31.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime43);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withYearOfCentury((int) ' ');
        int int48 = localDateTime47.size();
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime();
        org.joda.time.Instant instant50 = dateTime49.toInstant();
        org.joda.time.DateTime dateTime51 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = null;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale55.getDisplayCountry(locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale55, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) '#', chronology65);
        org.joda.time.Chronology chronology70 = null;
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = null;
        java.lang.String str73 = locale71.getDisplayVariant(locale72);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.util.Locale locale75 = null;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.lang.String str77 = locale71.getDisplayCountry(locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology70, locale71, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology81 = dateTimeParserBucket80.getChronology();
        org.joda.time.DurationField durationField82 = chronology81.hours();
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) '#', chronology81);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.plusMonths((int) (short) 10);
        boolean boolean86 = localDateTime67.isBefore((org.joda.time.ReadablePartial) localDateTime83);
        org.joda.time.DateTime dateTime87 = localDateTime83.toDateTime();
        boolean boolean88 = dateTime51.isAfter((org.joda.time.ReadableInstant) dateTime87);
        int int89 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime51);
        int int91 = dateTimeZone6.getOffsetFromLocal((long) 4);
        long long93 = dateTimeZone6.convertUTCToLocal(9223309849910400000L);
        java.util.TimeZone timeZone94 = dateTimeZone6.toTimeZone();
        boolean boolean95 = timeZone94.observesDaylightTime();
        boolean boolean96 = timeZone4.hasSameRules(timeZone94);
        int int97 = timeZone4.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        int int9 = property5.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundCeilingCopy();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale14.getDisplayCountry(locale17);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.hours();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) '#', chronology24);
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale30.getDisplayCountry(locale33);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology29, locale30, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket39.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.hours();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) '#', chronology40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusMonths((int) (short) 10);
        boolean boolean45 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime();
        long long47 = dateTime46.getMillis();
        org.joda.time.Instant instant48 = dateTime46.toInstant();
        int int49 = property5.getDifference((org.joda.time.ReadableInstant) dateTime46);
        java.lang.String str50 = dateTime46.toString();
        org.joda.time.Chronology chronology51 = dateTime46.getChronology();
        java.lang.String str52 = dateTime46.toString();
        org.joda.time.Chronology chronology53 = dateTime46.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant48", (dateTime46.compareTo(instant48) == 0) == dateTime46.equals(instant48));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        int int15 = property14.getMaximumValueOverall();
        int int16 = property14.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        int int18 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean22 = localDateTime20.isSupported(dateTimeFieldType21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withPeriodAdded(readablePeriod23, 2);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime28 = property26.addToCopy((-52));
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property26.getFieldType();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.lang.String str39 = locale33.getDisplayCountry(locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        java.util.Locale locale44 = dateTimeParserBucket42.getLocale();
        boolean boolean46 = dateTimeParserBucket42.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology47 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket42.getZone();
        org.joda.time.Chronology chronology49 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.minuteOfHour();
        org.joda.time.DurationField durationField51 = chronology49.seconds();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.yearOfEra();
        boolean boolean53 = dateTimeFieldType30.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField54 = chronology49.year();
        org.joda.time.DurationField durationField55 = chronology49.eras();
        org.joda.time.DateTimeField dateTimeField56 = chronology49.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField51 and durationField55", Math.signum(durationField51.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField51)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        java.lang.String str3 = durationFieldType1.getName();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readablePeriod23);
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = chronology16.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfDay();
        org.joda.time.DurationField durationField29 = durationFieldType1.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.years();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket43.getLocale();
        int int46 = dateTimeField31.getMaximumShortTextLength(locale45);
        java.lang.String str47 = locale45.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale45, (java.lang.Integer) 31, 292278993);
        org.joda.time.DurationField durationField51 = chronology14.weeks();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minus(readablePeriod55);
        int int57 = localDateTime56.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusSeconds(1);
        int[] intArray61 = chronology14.get((org.joda.time.ReadablePartial) localDateTime56, 3155760000072L);
        org.joda.time.DateTimeField dateTimeField62 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology14.secondOfDay();
        org.joda.time.DurationField durationField64 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = chronology14.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField64", (durationField30.compareTo(durationField64) == 0) == durationField30.equals(durationField64));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.Chronology chronology20 = chronology17.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.halfdays();
        org.joda.time.DurationField durationField22 = durationFieldType0.getField(chronology20);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale25.getDisplayCountry(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket34.getLocale();
        boolean boolean38 = dateTimeParserBucket34.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology39 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.year();
        org.joda.time.Chronology chronology42 = chronology39.withUTC();
        org.joda.time.DurationField durationField43 = durationFieldType0.getField(chronology39);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        int int49 = localDateTime48.getYearOfCentury();
        java.util.Date date50 = localDateTime48.toDate();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(dateTimeZone53);
        long long58 = dateTimeZone53.convertLocalToUTC(315569520000L, false, (long) (short) 100);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withYear(1970);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.yearOfEra();
        int int68 = property67.getMaximumValueOverall();
        int int69 = property67.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime70 = property67.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minus(readablePeriod74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime73.yearOfEra();
        int int77 = property76.getMaximumValueOverall();
        int int78 = property76.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime79 = property76.roundHalfFloorCopy();
        int int80 = property67.compareTo((org.joda.time.ReadablePartial) localDateTime79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray83 = localDateTime82.getFields();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.withWeekyear((int) (byte) 0);
        int int88 = localDateTime85.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime85.withMillisOfDay(100);
        org.joda.time.LocalDateTime.Property property91 = localDateTime85.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.LocalDateTime.Property property93 = localDateTime85.property(dateTimeFieldType92);
        int int94 = localDateTime59.get(dateTimeFieldType92);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime59.plusDays(2041);
        long long98 = chronology39.set((org.joda.time.ReadablePartial) localDateTime96, (-144719999947L));
        org.joda.time.DurationField durationField99 = chronology39.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField99, durationField21, and durationField22", !(durationField99.compareTo(durationField21) == 0) || (Math.signum(durationField99.compareTo(durationField22)) == Math.signum(durationField21.compareTo(durationField22))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.years();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket43.getLocale();
        int int46 = dateTimeField31.getMaximumShortTextLength(locale45);
        java.lang.String str47 = locale45.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale45, (java.lang.Integer) 31, 292278993);
        org.joda.time.DurationField durationField51 = chronology14.weeks();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minus(readablePeriod55);
        int int57 = localDateTime56.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusSeconds(1);
        int[] intArray61 = chronology14.get((org.joda.time.ReadablePartial) localDateTime56, 3155760000072L);
        org.joda.time.DateTimeField dateTimeField62 = chronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology14.secondOfDay();
        org.joda.time.DurationField durationField64 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = chronology14.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField64", (durationField30.compareTo(durationField64) == 0) == durationField30.equals(durationField64));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        dateTimeParserBucket11.setPivotYear((java.lang.Integer) 80700);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale18.getDisplayCountry(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket27.getChronology();
        java.util.Locale locale29 = dateTimeParserBucket27.getLocale();
        boolean boolean30 = dateTimeParserBucket11.restoreState((java.lang.Object) dateTimeParserBucket27);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.lang.String str39 = locale33.getDisplayCountry(locale36);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.year();
        org.joda.time.ReadablePartial readablePartial45 = null;
        int int46 = dateTimeField44.getMaximumValue(readablePartial45);
        long long49 = dateTimeField44.getDifferenceAsLong((-62167219199948L), (-62167219199948L));
        org.joda.time.DurationField durationField50 = dateTimeField44.getRangeDurationField();
        java.util.Locale locale52 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale52);
        java.util.Locale locale54 = locale52.stripExtensions();
        java.util.Set<java.lang.String> strSet55 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str56 = dateTimeField44.getAsText(12620102400000L, locale52);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = dateTimeField44.getType();
        dateTimeParserBucket11.saveField(dateTimeFieldType57, (int) 'a');
        org.joda.time.Chronology chronology61 = null;
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.util.Locale locale63 = null;
        java.lang.String str64 = locale62.getDisplayVariant(locale63);
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = null;
        java.lang.String str67 = locale65.getDisplayVariant(locale66);
        java.lang.String str68 = locale62.getDisplayCountry(locale65);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology61, locale62, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology72 = dateTimeParserBucket71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.year();
        org.joda.time.DurationField durationField74 = chronology72.years();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minus(readablePeriod79);
        boolean boolean81 = dateTimeZone75.isLocalDateTimeGap(localDateTime80);
        org.joda.time.Chronology chronology82 = chronology72.withZone(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readablePeriod86);
        int int88 = localDateTime87.getYearOfCentury();
        java.util.Date date89 = localDateTime87.toDate();
        org.joda.time.LocalDateTime localDateTime91 = localDateTime87.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime93 = localDateTime91.toDateTime(dateTimeZone92);
        org.joda.time.Chronology chronology94 = chronology72.withZone(dateTimeZone92);
        org.joda.time.DateTimeField dateTimeField95 = chronology72.halfdayOfDay();
        org.joda.time.DurationField durationField96 = chronology72.weekyears();
        boolean boolean97 = dateTimeFieldType57.isSupported(chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField74 and durationField96", (durationField74.compareTo(durationField96) == 0) == durationField74.equals(durationField96));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology13.weekyears();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.lang.String str29 = locale23.getDisplayCountry(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology22, locale23, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale34 = dateTimeParserBucket32.getLocale();
        boolean boolean36 = dateTimeParserBucket32.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology37 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.year();
        java.util.Locale locale43 = new java.util.Locale("italiano", "1970-01-01T00:00:00.000", "1");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-31449599990L), chronology37, locale43);
        java.lang.Object obj45 = dateTimeParserBucket44.saveState();
        org.joda.time.Chronology chronology46 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.weekyear();
        org.joda.time.DurationField durationField49 = durationFieldType19.getField(chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField49", (durationField14.compareTo(durationField49) == 0) == durationField14.equals(durationField49));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        int int5 = localDateTime2.getMillisOfSecond();
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = null;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        java.lang.String str14 = locale8.getDisplayCountry(locale11);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        org.joda.time.DurationField durationField20 = chronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        boolean boolean27 = dateTimeZone21.isLocalDateTimeGap(localDateTime26);
        org.joda.time.Chronology chronology28 = chronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.util.TimeZone timeZone30 = dateTimeZone21.toTimeZone();
        java.lang.String str32 = dateTimeZone21.getNameKey(10L);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.DateTime dateTime34 = localDateTime2.toDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property35 = localDateTime2.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = property35.getRangeDurationField();
        org.joda.time.DurationField durationField37 = property35.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField36", (durationField20.compareTo(durationField36) == 0) == durationField20.equals(durationField36));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.DurationField durationField16 = chronology12.hours();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField15, and durationField16", !(durationField17.compareTo(durationField15) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology12.seconds();
        org.joda.time.DurationField durationField20 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField16, and durationField19", !(durationField20.compareTo(durationField16) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField16.compareTo(durationField19))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = null;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.lang.String str25 = locale19.getDisplayCountry(locale22);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology29 = dateTimeParserBucket28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.years();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.hourOfHalfday();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket43.getLocale();
        int int46 = dateTimeField31.getMaximumShortTextLength(locale45);
        java.lang.String str47 = locale45.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale45, (java.lang.Integer) 31, 292278993);
        org.joda.time.DateTimeField dateTimeField51 = chronology14.yearOfEra();
        org.joda.time.DurationField durationField52 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField53 = chronology14.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField52", Math.signum(durationField30.compareTo(durationField52)) == -Math.signum(durationField52.compareTo(durationField30)));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.lang.String str16 = locale10.getDisplayCountry(locale13);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType7.getField(chronology20);
        org.joda.time.DurationField durationField24 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology20);
        long long30 = chronology20.add(365L, (long) 365, 22);
        org.joda.time.DurationField durationField31 = chronology20.centuries();
        org.joda.time.DurationFieldType durationFieldType32 = durationField31.getType();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.years();
        org.joda.time.Chronology chronology47 = chronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.yearOfCentury();
        org.joda.time.DurationField durationField50 = chronology45.weekyears();
        org.joda.time.DurationField durationField51 = durationFieldType32.getField(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField50", (durationField24.compareTo(durationField50) == 0) == durationField24.equals(durationField50));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 0, 0);
        dateTimeParserBucket26.setOffset((java.lang.Integer) 10);
        java.lang.Object obj29 = dateTimeParserBucket26.saveState();
        java.lang.Integer int30 = dateTimeParserBucket26.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket26.getZone();
        org.joda.time.Chronology chronology32 = chronology12.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = chronology12.secondOfMinute();
        long long37 = chronology12.add((long) 9, 1L, 20);
        org.joda.time.DurationField durationField38 = chronology12.minutes();
        org.joda.time.DurationField durationField39 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField13, and durationField38", !(durationField39.compareTo(durationField13) == 0) || (Math.signum(durationField39.compareTo(durationField38)) == Math.signum(durationField13.compareTo(durationField38))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField26 = chronology13.weekyears();
        long long29 = durationField26.getMillis((int) (byte) 0, (long) (-1));
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.years();
        long long46 = durationField43.add((long) 'x', 70);
        boolean boolean47 = durationField43.isSupported();
        int int48 = durationField26.compareTo(durationField43);
        int int50 = durationField43.getValue(117L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfHour();
        org.joda.time.DurationField durationField20 = chronology18.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.hourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology18.seconds();
        org.joda.time.DurationField durationField23 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.secondOfMinute();
        org.joda.time.DurationField durationField26 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField20, and durationField23", !(durationField26.compareTo(durationField20) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField20.compareTo(durationField23))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime22);
        org.joda.time.Chronology chronology24 = chronology14.withZone(dateTimeZone17);
        boolean boolean25 = dateTimeFieldType1.isSupported(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = chronology24.year();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = chronology24.hourOfDay();
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(1009843200003L, chronology24, locale31, (java.lang.Integer) 70);
        org.joda.time.DateTimeField dateTimeField34 = chronology24.monthOfYear();
        org.joda.time.DurationField durationField35 = chronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = chronology24.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField35", (durationField16.compareTo(durationField35) == 0) == durationField16.equals(durationField35));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        java.util.Locale locale15 = dateTimeParserBucket13.getLocale();
        boolean boolean17 = dateTimeParserBucket13.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology18 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = durationFieldType1.getField(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.minutes();
        org.joda.time.DurationField durationField22 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField20, and durationField21", !(durationField22.compareTo(durationField20) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket12.getZone();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (-61851579048000L), (int) (short) 0);
        org.joda.time.DurationField durationField26 = durationFieldType0.getField(chronology19);
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale42 = dateTimeParserBucket40.getLocale();
        boolean boolean44 = dateTimeParserBucket40.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology45 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.year();
        org.joda.time.Chronology chronology48 = chronology45.withUTC();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology45.add(readablePeriod49, (-61851599999948L), 0);
        java.util.Locale.Category category53 = java.util.Locale.Category.DISPLAY;
        org.joda.time.tz.NameProvider nameProvider54 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = null;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale55.getDisplayCountry(locale58);
        java.lang.String str64 = nameProvider54.getShortName(locale58, "hi!", "");
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.GERMAN;
        java.util.Locale locale69 = null;
        java.lang.String str70 = locale68.getDisplayVariant(locale69);
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = null;
        java.lang.String str73 = locale71.getDisplayVariant(locale72);
        java.lang.String str74 = locale68.getDisplayCountry(locale71);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology78 = dateTimeParserBucket77.getChronology();
        org.joda.time.DurationField durationField79 = chronology78.millis();
        org.joda.time.tz.NameProvider nameProvider80 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale81 = java.util.Locale.TAIWAN;
        java.lang.String str84 = nameProvider80.getName(locale81, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology78, locale81, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str90 = nameProvider54.getName(locale81, "ISOChronology[UTC]", "DurationField[years]");
        java.util.Locale.setDefault(category53, locale81);
        java.util.Locale locale92 = java.util.Locale.getDefault(category53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket(0L, chronology45, locale92);
        org.joda.time.DateTimeField dateTimeField94 = chronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField95 = chronology45.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField96 = chronology45.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField97 = chronology45.clockhourOfHalfday();
        boolean boolean98 = durationFieldType27.isSupported(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField26", Math.signum(durationField21.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField21)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DurationField durationField16 = chronology14.minutes();
        boolean boolean17 = durationFieldType1.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.halfdayOfDay();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.year();
        org.joda.time.DurationField durationField33 = chronology31.years();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        boolean boolean40 = dateTimeZone34.isLocalDateTimeGap(localDateTime39);
        org.joda.time.Chronology chronology41 = chronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.year();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.yearOfEra();
        int int50 = property49.getMaximumValueOverall();
        int int51 = property49.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime52 = property49.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = localDateTime52.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.plusYears((int) 'u');
        java.lang.String str56 = localDateTime55.toString();
        int int57 = localDateTime55.getHourOfDay();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        java.util.Locale locale62 = null;
        java.lang.String str63 = locale61.getDisplayVariant(locale62);
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = null;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        java.lang.String str67 = locale61.getDisplayCountry(locale64);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology71 = dateTimeParserBucket70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.year();
        boolean boolean73 = dateTimeField72.isSupported();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone75);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.minus(readablePeriod77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime76.yearOfEra();
        int int80 = property79.getMaximumValueOverall();
        int int81 = property79.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime82 = property79.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.plusMonths((int) (byte) -1);
        java.util.Locale locale87 = new java.util.Locale("Koordinierte Universalzeit");
        java.lang.String str88 = dateTimeField72.getAsShortText((org.joda.time.ReadablePartial) localDateTime82, (int) (byte) 1, locale87);
        java.lang.String str89 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localDateTime55, (-8), locale87);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology14, locale87);
        org.joda.time.DateTimeField dateTimeField91 = chronology14.dayOfMonth();
        org.joda.time.Chronology chronology92 = chronology14.withUTC();
        org.joda.time.DurationField durationField93 = chronology14.weekyears();
        org.joda.time.DurationField durationField94 = chronology14.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField93", (durationField15.compareTo(durationField93) == 0) == durationField15.equals(durationField93));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = chronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long24 = dateTimeZone22.convertUTCToLocal((long) 'a');
        org.joda.time.Chronology chronology25 = chronology12.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField20", (durationField13.compareTo(durationField20) == 0) == durationField13.equals(durationField20));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        long long21 = durationField18.subtract((long) (byte) 10, (int) (short) 1);
        long long23 = durationField18.getValueAsLong((long) 31);
        long long26 = durationField18.subtract(10L, (long) (-292275054));
        int int29 = durationField18.getValue(31536000000L, (long) 7);
        int int32 = durationField18.getValue((long) 1969, (long) (short) -1);
        long long35 = durationField18.getMillis(53, (-14726880L));
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = null;
        java.lang.String str43 = locale41.getDisplayVariant(locale42);
        java.lang.String str44 = locale38.getDisplayCountry(locale41);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology37, locale38, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology48 = dateTimeParserBucket47.getChronology();
        java.util.Locale locale49 = dateTimeParserBucket47.getLocale();
        boolean boolean51 = dateTimeParserBucket47.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology52 = dateTimeParserBucket47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeParserBucket47.getZone();
        org.joda.time.Chronology chronology54 = dateTimeParserBucket47.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfDay();
        org.joda.time.DurationField durationField57 = chronology54.seconds();
        int int58 = durationField18.compareTo(durationField57);
        org.joda.time.DurationFieldType durationFieldType59 = durationField57.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        java.util.Locale locale16 = dateTimeParserBucket14.getLocale();
        boolean boolean18 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology19 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket14.getZone();
        org.joda.time.Chronology chronology21 = dateTimeParserBucket14.getChronology();
        java.lang.String str22 = chronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfDay();
        long long27 = chronology21.add((long) 'a', 10L, (int) (short) 0);
        boolean boolean28 = durationFieldType1.isSupported(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        java.lang.String str31 = durationFieldType30.toString();
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale34.getDisplayCountry(locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology33, locale34, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology44 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket43.getLocale();
        boolean boolean47 = dateTimeParserBucket43.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology48 = dateTimeParserBucket43.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.year();
        org.joda.time.Chronology chronology51 = chronology48.withUTC();
        org.joda.time.DurationField durationField52 = durationFieldType30.getField(chronology51);
        org.joda.time.DurationField durationField53 = durationFieldType1.getField(chronology51);
        org.joda.time.DurationField durationField54 = chronology51.halfdays();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField56 = chronology51.era();
        org.joda.time.DateTimeField dateTimeField57 = chronology51.clockhourOfDay();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        java.util.Locale locale62 = null;
        java.lang.String str63 = locale61.getDisplayVariant(locale62);
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = null;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        java.lang.String str67 = locale61.getDisplayCountry(locale64);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology71 = dateTimeParserBucket70.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.year();
        org.joda.time.DurationField durationField73 = chronology71.years();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.minus(readablePeriod78);
        boolean boolean80 = dateTimeZone74.isLocalDateTimeGap(localDateTime79);
        org.joda.time.Chronology chronology81 = chronology71.withZone(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField82 = chronology81.dayOfMonth();
        java.util.Locale locale83 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((-1052190046800000L), chronology81, locale83);
        dateTimeParserBucket84.setOffset(52);
        int int87 = dateTimeParserBucket84.getOffset();
        org.joda.time.DateTimeZone dateTimeZone88 = dateTimeParserBucket84.getZone();
        org.joda.time.Chronology chronology89 = chronology51.withZone(dateTimeZone88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField52 and durationField73", (durationField52.compareTo(durationField73) == 0) == durationField52.equals(durationField73));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField27 = chronology14.weekyears();
        boolean boolean28 = durationFieldType0.isSupported(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField27", (durationField15.compareTo(durationField27) == 0) == durationField15.equals(durationField27));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfEra();
        int int9 = property8.get();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        int int12 = dateTimeZone10.getOffset((long) (short) 0);
        long long15 = dateTimeZone10.convertLocalToUTC(283996800000L, true);
        long long18 = dateTimeZone10.convertLocalToUTC((long) 9, true);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = property24.getMaximumValueOverall();
        int int26 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.yearOfEra();
        int int34 = property33.getMaximumValueOverall();
        int int35 = property33.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfFloorCopy();
        int int37 = property24.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime36);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYearOfCentury((int) ' ');
        int int41 = localDateTime40.size();
        org.joda.time.DateTime dateTime42 = localDateTime40.toDateTime();
        int int43 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime42);
        long long44 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("deutsch");
        boolean boolean47 = dateTime42.equals((java.lang.Object) locale46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime42.getZone();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.lang.String str58 = locale52.getDisplayCountry(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology51, locale52, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology62 = dateTimeParserBucket61.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.hours();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) '#', chronology62);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusMonths((int) (short) 10);
        int int67 = localDateTime64.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minus(readablePeriod71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.yearOfEra();
        int int74 = property73.getMaximumValueOverall();
        int int75 = property73.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime76 = property73.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone78);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.minus(readablePeriod80);
        org.joda.time.LocalDateTime.Property property82 = localDateTime79.yearOfEra();
        int int83 = property82.getMaximumValueOverall();
        int int84 = property82.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime85 = property82.roundHalfFloorCopy();
        int int86 = property73.compareTo((org.joda.time.ReadablePartial) localDateTime85);
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime85);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.withYearOfCentury((int) ' ');
        int int90 = localDateTime89.size();
        org.joda.time.DateTime dateTime91 = localDateTime89.toDateTime();
        org.joda.time.Instant instant92 = dateTime91.toInstant();
        org.joda.time.DateTime dateTime93 = localDateTime64.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        long long94 = dateTime93.getMillis();
        org.joda.time.Chronology chronology95 = dateTime93.getChronology();
        boolean boolean96 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime91 and instant92", (dateTime91.compareTo(instant92) == 0) == dateTime91.equals(instant92));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        int int28 = localDateTime27.getYearOfCentury();
        java.util.Date date29 = localDateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField35 = chronology12.halfdayOfDay();
        org.joda.time.DurationField durationField36 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology12.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField36", (durationField14.compareTo(durationField36) == 0) == durationField14.equals(durationField36));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        boolean boolean16 = durationFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfMinute();
        int int19 = dateTimeField17.getLeapAmount((long) 19);
        boolean boolean21 = dateTimeField17.isLeap((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.yearOfEra();
        int int28 = property27.getMaximumValueOverall();
        int int29 = property27.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime30 = property27.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        boolean boolean38 = localDateTime34.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.era();
        org.joda.time.LocalDateTime.Property property40 = localDateTime34.monthOfYear();
        int int41 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.withYear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withYearOfCentury(28);
        int int46 = localDateTime43.getEra();
        int int47 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusMillis(20161391);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minus(readablePeriod53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.yearOfEra();
        int int56 = property55.getMaximumValueOverall();
        int int57 = property55.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime58 = property55.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minus(readablePeriod62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime61.yearOfEra();
        int int65 = property64.getMaximumValueOverall();
        int int66 = property64.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime67 = property64.roundHalfFloorCopy();
        int int68 = property55.compareTo((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean72 = localDateTime70.isSupported(dateTimeFieldType71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime74 = property73.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withWeekOfWeekyear(10);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.minusMinutes(7);
        org.joda.time.Chronology chronology79 = localDateTime74.getChronology();
        org.joda.time.DurationField durationField80 = chronology79.eras();
        org.joda.time.DateTimeField dateTimeField81 = chronology79.clockhourOfDay();
        boolean boolean82 = localDateTime49.equals((java.lang.Object) chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField80", Math.signum(durationField14.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField14)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.halfdayOfDay();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = null;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = null;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.lang.String str33 = locale27.getDisplayCountry(locale30);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.years();
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        boolean boolean45 = localDateTime40.isEqual((org.joda.time.ReadablePartial) localDateTime43);
        int int46 = localDateTime40.getDayOfYear();
        long long48 = chronology22.set((org.joda.time.ReadablePartial) localDateTime40, 283996800000L);
        org.joda.time.DateTimeField dateTimeField49 = chronology22.weekyearOfCentury();
        org.joda.time.DurationField durationField50 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField50, durationField14, and durationField39", !(durationField50.compareTo(durationField14) == 0) || (Math.signum(durationField50.compareTo(durationField39)) == Math.signum(durationField14.compareTo(durationField39))));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.millis();
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str19 = nameProvider15.getName(locale16, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology13, locale16, (java.lang.Integer) 28, (int) (short) 10);
        org.joda.time.DurationField durationField23 = chronology13.weekyears();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.year();
        org.joda.time.DurationField durationField38 = chronology36.years();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.yearOfCentury();
        org.joda.time.DurationField durationField40 = chronology36.years();
        int int41 = durationField23.compareTo(durationField40);
        long long44 = durationField23.add((long) (-52), 10);
        long long47 = durationField23.getValueAsLong((-6959820001L), 3187036800000L);
        long long49 = durationField23.getMillis(1931);
        org.joda.time.DurationFieldType durationFieldType50 = durationField23.getType();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = locale54.getDisplayCountry(locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket63.getChronology();
        java.util.Locale locale65 = dateTimeParserBucket63.getLocale();
        boolean boolean67 = dateTimeParserBucket63.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology68 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket63.getZone();
        org.joda.time.Chronology chronology70 = dateTimeParserBucket63.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.minuteOfHour();
        org.joda.time.DurationField durationField72 = chronology70.seconds();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.yearOfEra();
        java.util.Locale locale74 = java.util.Locale.CHINA;
        boolean boolean75 = locale74.hasExtensions();
        java.lang.String str76 = locale74.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) 31, chronology70, locale74, (java.lang.Integer) 31, 1);
        org.joda.time.Chronology chronology80 = dateTimeParserBucket79.getChronology();
        org.joda.time.DurationField durationField81 = durationFieldType50.getField(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField81 and durationField38", (durationField81.compareTo(durationField38) == 0) == durationField81.equals(durationField38));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DurationField durationField16 = chronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime22);
        org.joda.time.Chronology chronology24 = chronology14.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(220898664000L, chronology24, locale26, (java.lang.Integer) 80700, 6);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        org.joda.time.tz.NameProvider nameProvider32 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.lang.String str39 = locale33.getDisplayCountry(locale36);
        java.lang.String str42 = nameProvider32.getShortName(locale36, "hi!", "");
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayVariant(locale50);
        java.lang.String str52 = locale46.getDisplayCountry(locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology45, locale46, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket55.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.millis();
        org.joda.time.tz.NameProvider nameProvider58 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.lang.String str62 = nameProvider58.getName(locale59, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology56, locale59, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str68 = nameProvider32.getName(locale59, "ISOChronology[UTC]", "DurationField[years]");
        java.util.Locale.setDefault(category31, locale59);
        java.util.Locale locale70 = java.util.Locale.getDefault(category31);
        java.util.Locale locale71 = java.util.Locale.getDefault(category31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((-33342L), chronology30, locale71, (java.lang.Integer) 86399948);
        org.joda.time.DurationField durationField74 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField16, and durationField57", !(durationField74.compareTo(durationField16) == 0) || (Math.signum(durationField74.compareTo(durationField57)) == Math.signum(durationField16.compareTo(durationField57))));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.weekyear();
        org.joda.time.DurationField durationField21 = chronology16.weeks();
        org.joda.time.DurationField durationField22 = chronology16.eras();
        org.joda.time.DurationField durationField23 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField22", Math.signum(durationField17.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField17)));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket12.getZone();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = null;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.lang.String str30 = locale24.getDisplayCountry(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology23, locale24, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.year();
        org.joda.time.ReadablePartial readablePartial36 = null;
        int int37 = dateTimeField35.getMaximumValue(readablePartial36);
        long long40 = dateTimeField35.getDifferenceAsLong((-62167219199948L), (-62167219199948L));
        org.joda.time.DurationField durationField41 = dateTimeField35.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.yearOfEra();
        int int48 = property47.getMaximumValueOverall();
        int int49 = property47.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime50 = property47.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minus(readablePeriod54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.yearOfEra();
        int int57 = property56.getMaximumValueOverall();
        int int58 = property56.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundHalfFloorCopy();
        int int60 = property47.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withMinuteOfHour((int) ' ');
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.lang.String str65 = dateTimeField35.getAsShortText((org.joda.time.ReadablePartial) localDateTime62, (-1), locale64);
        org.joda.time.tz.NameProvider nameProvider66 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean67 = localDateTime62.equals((java.lang.Object) nameProvider66);
        org.joda.time.tz.NameProvider nameProvider68 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = null;
        java.lang.String str74 = locale72.getDisplayVariant(locale73);
        java.lang.String str75 = locale69.getDisplayCountry(locale72);
        java.lang.String str78 = nameProvider68.getShortName(locale69, "", "hi!");
        java.util.Locale locale80 = new java.util.Locale("0");
        java.lang.String str83 = nameProvider68.getShortName(locale80, "Italian", "Ora media di Greenwich");
        java.lang.String str86 = nameProvider66.getName(locale80, "1970-01-01T00:00:00.000Z", "gio");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket(1380000L, chronology19, locale80);
        org.joda.time.DurationField durationField88 = chronology19.millis();
        org.joda.time.DurationField durationField89 = chronology19.seconds();
        org.joda.time.DurationField durationField90 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField90, durationField88, and durationField89", !(durationField90.compareTo(durationField88) == 0) || (Math.signum(durationField90.compareTo(durationField89)) == Math.signum(durationField88.compareTo(durationField89))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = dateTimeField13.getMaximumValue(readablePartial14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfEra();
        int int31 = property30.getMaximumValueOverall();
        int int32 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        int int34 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean36 = localDateTime33.isSupported(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withPeriodAdded(readablePeriod37, (int) 'a');
        int[] intArray40 = new int[] {};
        int int41 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime33, intArray40);
        java.lang.String str42 = dateTimeField13.toString();
        long long44 = dateTimeField13.roundCeiling(0L);
        org.joda.time.DurationField durationField45 = dateTimeField13.getLeapDurationField();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.years();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.year();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology58.minuteOfDay();
        org.joda.time.DurationField durationField64 = chronology58.weekyears();
        long long67 = durationField64.subtract((long) (byte) 10, (int) (short) 1);
        long long69 = durationField64.getValueAsLong((long) 31);
        boolean boolean70 = durationField64.isSupported();
        int int72 = durationField64.getValue((long) 372);
        long long74 = durationField64.getMillis((long) (-52));
        long long77 = durationField64.getMillis(0L, 3600000L);
        int int78 = durationField45.compareTo(durationField64);
        long long81 = durationField45.subtract(4354860456000000000L, (-28531));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField64", (durationField59.compareTo(durationField64) == 0) == durationField59.equals(durationField64));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology12.add(readablePeriod19, 3287L, 3);
        org.joda.time.DurationField durationField23 = chronology12.seconds();
        org.joda.time.DateTimeField dateTimeField24 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField25 = chronology12.eras();
        org.joda.time.DurationField durationField26 = chronology12.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField25", Math.signum(durationField26.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField26)));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        java.lang.String str16 = chronology12.toString();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.lang.String str26 = locale20.getDisplayCountry(locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) '#', chronology30);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plus(readableDuration33);
        org.joda.time.DateTimeField dateTimeField36 = localDateTime32.getField((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfWeek();
        int int41 = localDateTime39.getHourOfDay();
        boolean boolean42 = localDateTime32.isAfter((org.joda.time.ReadablePartial) localDateTime39);
        int[] intArray44 = chronology12.get((org.joda.time.ReadablePartial) localDateTime32, 283996800000L);
        long long48 = chronology12.add((-1212019167965L), (long) 9, 11323);
        org.joda.time.DurationField durationField49 = chronology12.eras();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        long long53 = chronology12.add(readablePeriod50, (long) 292277024, 241);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField31 and durationField49", Math.signum(durationField31.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField31)));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField28 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = chronology14.monthOfYear();
        org.joda.time.DurationField durationField32 = chronology14.eras();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.year();
        org.joda.time.DurationField durationField47 = chronology45.years();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        boolean boolean54 = dateTimeZone48.isLocalDateTimeGap(localDateTime53);
        org.joda.time.Chronology chronology55 = chronology45.withZone(dateTimeZone48);
        org.joda.time.DurationField durationField56 = chronology45.weekyears();
        boolean boolean57 = durationField56.isPrecise();
        org.joda.time.DurationFieldType durationFieldType58 = durationField56.getType();
        int int59 = durationField32.compareTo(durationField56);
        long long60 = durationField32.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField56", (durationField15.compareTo(durationField56) == 0) == durationField15.equals(durationField56));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale15.getDisplayCountry(locale18);
        dateTimeParserBucket11.saveField(dateTimeFieldType13, "", locale15);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.seconds();
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DurationField durationField26 = chronology23.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField25", Math.signum(durationField24.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField24)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear((int) ' ');
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readableDuration13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plus(readableDuration15);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.lang.String str26 = locale20.getDisplayCountry(locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology30 = dateTimeParserBucket29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        org.joda.time.tz.NameProvider nameProvider38 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.lang.String str45 = locale39.getDisplayCountry(locale42);
        java.lang.String str48 = nameProvider38.getShortName(locale39, "", "hi!");
        java.lang.String str49 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localDateTime34, (int) (byte) 10, locale39);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime34.withMillisOfSecond(10);
        java.util.Locale locale53 = java.util.Locale.ITALY;
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = locale54.getDisplayCountry(locale57);
        java.lang.String str61 = locale53.getDisplayScript(locale57);
        java.lang.String str62 = locale53.getDisplayCountry();
        java.lang.String str63 = localDateTime34.toString("-1", locale53);
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale66.getDisplayCountry(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.year();
        org.joda.time.DurationField durationField78 = chronology76.years();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone81);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.minus(readablePeriod83);
        boolean boolean85 = dateTimeZone79.isLocalDateTimeGap(localDateTime84);
        org.joda.time.Chronology chronology86 = chronology76.withZone(dateTimeZone79);
        org.joda.time.DateTime dateTime87 = localDateTime34.toDateTime(dateTimeZone79);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType89 = dateTimeFieldType88.getRangeDurationType();
        int int90 = dateTime87.get(dateTimeFieldType88);
        long long91 = dateTime87.getMillis();
        int int92 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Chronology chronology93 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField94 = chronology93.dayOfYear();
        org.joda.time.DateTimeField dateTimeField95 = chronology93.weekyear();
        org.joda.time.DurationField durationField96 = chronology93.years();
        org.joda.time.DateTimeField dateTimeField97 = chronology93.millisOfDay();
        org.joda.time.DateTimeField dateTimeField98 = chronology93.monthOfYear();
        org.joda.time.DateTimeField dateTimeField99 = chronology93.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField78 and durationField96", (durationField78.compareTo(durationField96) == 0) == durationField78.equals(durationField96));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = chronology13.withZone(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, 46);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withPeriodAdded(readablePeriod28, 3940);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.plusSeconds((-292275054));
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withYearOfEra(217);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.yearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        int int43 = property40.getLeapAmount();
        java.lang.String str44 = property40.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getRangeDurationType();
        java.lang.String str47 = durationFieldType46.toString();
        boolean boolean48 = localDateTime32.isSupported(durationFieldType46);
        java.lang.String str49 = durationFieldType46.toString();
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str51 = durationFieldType50.getName();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = null;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.lang.String str61 = locale55.getDisplayCountry(locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology54, locale55, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology65 = dateTimeParserBucket64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.millis();
        org.joda.time.tz.NameProvider nameProvider67 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale68 = java.util.Locale.TAIWAN;
        java.lang.String str71 = nameProvider67.getName(locale68, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology65, locale68, (java.lang.Integer) 28, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField75 = chronology65.era();
        org.joda.time.DurationField durationField76 = durationFieldType50.getField(chronology65);
        org.joda.time.DateTimeZone dateTimeZone77 = chronology65.getZone();
        org.joda.time.DateTimeField dateTimeField78 = chronology65.dayOfMonth();
        org.joda.time.DurationField durationField79 = durationFieldType46.getField(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField76", (durationField15.compareTo(durationField76) == 0) == durationField15.equals(durationField76));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = chronology13.withZone(dateTimeZone16);
        boolean boolean24 = dateTimeFieldType0.isSupported(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.millisOfSecond();
        long long29 = dateTimeField26.addWrapField(3155760000002L, 70);
        int int30 = dateTimeField26.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = dateTimeField26.getType();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.yearOfEra();
        int int39 = property38.getMaximumValueOverall();
        int int40 = property38.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime41 = property38.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.yearOfEra();
        int int48 = property47.getMaximumValueOverall();
        int int49 = property47.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime50 = property47.roundHalfFloorCopy();
        int int51 = property38.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean55 = localDateTime53.isSupported(dateTimeFieldType54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withPeriodAdded(readablePeriod56, 2);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.weekyear();
        org.joda.time.LocalDateTime localDateTime61 = property59.addToCopy((-52));
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property59.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property59.getFieldType();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale66.getDisplayCountry(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket75.getChronology();
        java.util.Locale locale77 = dateTimeParserBucket75.getLocale();
        boolean boolean79 = dateTimeParserBucket75.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology80 = dateTimeParserBucket75.getChronology();
        org.joda.time.DateTimeZone dateTimeZone81 = dateTimeParserBucket75.getZone();
        org.joda.time.Chronology chronology82 = dateTimeParserBucket75.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.minuteOfHour();
        org.joda.time.DurationField durationField84 = chronology82.seconds();
        org.joda.time.DateTimeField dateTimeField85 = chronology82.yearOfEra();
        boolean boolean86 = dateTimeFieldType63.isSupported(chronology82);
        org.joda.time.DurationField durationField87 = chronology82.seconds();
        org.joda.time.DateTimeField dateTimeField88 = chronology82.weekyear();
        org.joda.time.DurationField durationField89 = chronology82.eras();
        boolean boolean90 = durationFieldType32.isSupported(chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField89", Math.signum(durationField15.compareTo(durationField89)) == -Math.signum(durationField89.compareTo(durationField15)));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        int int9 = localDateTime8.size();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) '#', chronology23);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readableDuration26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        boolean boolean29 = localDateTime27.isSupported(durationFieldType28);
        java.lang.String str30 = localDateTime27.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str33 = dateTimeZone31.getNameKey((long) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        long long36 = dateTimeZone31.nextTransition(283996800000L);
        long long38 = dateTimeZone31.convertUTCToLocal(1969L);
        org.joda.time.DateTime dateTime39 = localDateTime27.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime40 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weeks();
        org.joda.time.DurationField durationField43 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField24, and durationField42", !(durationField43.compareTo(durationField24) == 0) || (Math.signum(durationField43.compareTo(durationField42)) == Math.signum(durationField24.compareTo(durationField42))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(22);
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) '#', chronology15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths((int) (short) 10);
        int int20 = localDateTime17.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.yearOfEra();
        int int27 = property26.getMaximumValueOverall();
        int int28 = property26.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime29 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minus(readablePeriod33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.yearOfEra();
        int int36 = property35.getMaximumValueOverall();
        int int37 = property35.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime38 = property35.roundHalfFloorCopy();
        int int39 = property26.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withYearOfCentury((int) ' ');
        int int43 = localDateTime42.size();
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime();
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.DateTime dateTime46 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.lang.String str56 = locale50.getDisplayCountry(locale53);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology49, locale50, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology60 = dateTimeParserBucket59.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.hours();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) '#', chronology60);
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.lang.String str72 = locale66.getDisplayCountry(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket75 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket75.getChronology();
        org.joda.time.DurationField durationField77 = chronology76.hours();
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) '#', chronology76);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plusMonths((int) (short) 10);
        boolean boolean81 = localDateTime62.isBefore((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.DateTime dateTime82 = localDateTime78.toDateTime();
        boolean boolean83 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime82);
        int int84 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime46);
        int int86 = dateTimeZone1.getOffsetFromLocal((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime88 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant45", (dateTime44.compareTo(instant45) == 0) == dateTime44.equals(instant45));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfEra();
        int int14 = property13.getMaximumValueOverall();
        int int15 = property13.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.yearOfEra();
        int int23 = property22.getMaximumValueOverall();
        int int24 = property22.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        int int26 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean30 = localDateTime28.isSupported(dateTimeFieldType29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withPeriodAdded(readablePeriod31, 2);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = property34.addToCopy((-52));
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property34.getFieldType();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime7.withField(dateTimeFieldType37, 36000000);
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType37.getDurationType();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.days();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = null;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.lang.String str50 = locale44.getDisplayCountry(locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.years();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.secondOfDay();
        org.joda.time.DurationField durationField59 = durationFieldType41.getField(chronology54);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.DurationField durationField61 = chronology54.days();
        org.joda.time.DurationField durationField62 = durationFieldType40.getField(chronology54);
        org.joda.time.DurationField durationField63 = chronology54.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField55 and durationField62", (durationField55.compareTo(durationField62) == 0) == durationField55.equals(durationField62));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        boolean boolean6 = localDateTime2.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.era();
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        int int17 = localDateTime14.getMillisOfSecond();
        int int18 = localDateTime14.getEra();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime14.toDateTime(readableInstant19);
        int int21 = property11.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale25.getDisplayCountry(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.hours();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) '#', chronology35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusMonths((int) (short) 10);
        int int40 = localDateTime37.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime43.yearOfEra();
        int int47 = property46.getMaximumValueOverall();
        int int48 = property46.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime49 = property46.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minus(readablePeriod53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.yearOfEra();
        int int56 = property55.getMaximumValueOverall();
        int int57 = property55.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime58 = property55.roundHalfFloorCopy();
        int int59 = property46.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime58);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withYearOfCentury((int) ' ');
        int int63 = localDateTime62.size();
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime();
        org.joda.time.Instant instant65 = dateTime64.toInstant();
        org.joda.time.DateTime dateTime66 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        long long67 = dateTime66.getMillis();
        boolean boolean69 = dateTime66.equals((java.lang.Object) "jpn");
        boolean boolean70 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime66);
        long long71 = dateTime20.getMillis();
        java.lang.String str72 = dateTime20.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and instant65", (dateTime64.compareTo(instant65) == 0) == dateTime64.equals(instant65));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfEra();
        int int14 = property13.getMaximumValueOverall();
        int int15 = property13.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.yearOfEra();
        int int23 = property22.getMaximumValueOverall();
        int int24 = property22.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        int int26 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.minus(readablePeriod29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plus(readablePeriod31);
        org.joda.time.DateTime dateTime33 = localDateTime30.toDateTime();
        long long34 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.yearOfEra();
        int int41 = property40.getMaximumValueOverall();
        int int42 = property40.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.yearOfEra();
        int int50 = property49.getMaximumValueOverall();
        int int51 = property49.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime52 = property49.roundHalfFloorCopy();
        int int53 = property40.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean55 = localDateTime52.isSupported(dateTimeFieldType54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.withPeriodAdded(readablePeriod56, (int) 'a');
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMonths((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minus(readablePeriod64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime63.yearOfEra();
        int int67 = property66.getMaximumValueOverall();
        int int68 = property66.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime69 = property66.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minus(readablePeriod73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime72.yearOfEra();
        int int76 = property75.getMaximumValueOverall();
        int int77 = property75.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime78 = property75.roundHalfFloorCopy();
        int int79 = property66.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean81 = localDateTime78.isSupported(dateTimeFieldType80);
        boolean boolean82 = localDateTime58.isSupported(dateTimeFieldType80);
        org.joda.time.LocalDateTime.Property property83 = localDateTime58.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime58.plusWeeks(32);
        org.joda.time.DateTime dateTime86 = localDateTime85.toDateTime();
        org.joda.time.Instant instant87 = dateTime86.toInstant();
        boolean boolean88 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime86);
        java.lang.String str89 = dateTime33.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime86 and instant87", (dateTime86.compareTo(instant87) == 0) == dateTime86.equals(instant87));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DurationField durationField15 = chronology12.seconds();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        java.lang.String str18 = dateTimeField16.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfDay();
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = null;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.lang.String str29 = locale23.getDisplayCountry(locale26);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology22, locale23, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.year();
        org.joda.time.DurationField durationField35 = chronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readablePeriod40);
        boolean boolean42 = dateTimeZone36.isLocalDateTimeGap(localDateTime41);
        org.joda.time.Chronology chronology43 = chronology33.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField44 = durationFieldType20.getField(chronology43);
        org.joda.time.DurationField durationField45 = chronology43.hours();
        int int48 = durationField45.getDifference((long) 3287, 29L);
        int int50 = durationField45.getValue((long) 34);
        int int51 = durationField19.compareTo(durationField45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField17, and durationField35", !(durationField19.compareTo(durationField17) == 0) || (Math.signum(durationField19.compareTo(durationField35)) == Math.signum(durationField17.compareTo(durationField35))));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        long long19 = chronology12.add((-1920001L), 117L, (int) '#');
        org.joda.time.DateTimeField dateTimeField20 = chronology12.year();
        org.joda.time.DurationField durationField21 = chronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.monthOfYear();
        org.joda.time.DurationField durationField23 = chronology12.hours();
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField14, and durationField21", !(durationField24.compareTo(durationField14) == 0) || (Math.signum(durationField24.compareTo(durationField21)) == Math.signum(durationField14.compareTo(durationField21))));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology14);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale locale35 = null;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale34);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology41 = dateTimeParserBucket40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.weekyear();
        org.joda.time.DurationField durationField45 = chronology41.seconds();
        org.joda.time.DurationField durationField46 = durationFieldType28.getField(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField15, and durationField45", !(durationField46.compareTo(durationField15) == 0) || (Math.signum(durationField46.compareTo(durationField45)) == Math.signum(durationField15.compareTo(durationField45))));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.millis();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology12.weekyears();
        org.joda.time.DurationField durationField19 = chronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField18", (durationField13.compareTo(durationField18) == 0) == durationField13.equals(durationField18));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale15.getDisplayCountry(locale18);
        dateTimeParserBucket11.saveField(dateTimeFieldType13, "", locale15);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.seconds();
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField25", Math.signum(durationField24.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField24)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = null;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.years();
        org.joda.time.Chronology chronology17 = chronology15.withUTC();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.util.Locale.Builder builder22 = builder18.addUnicodeLocaleAttribute("1970");
        java.util.Locale locale23 = builder22.build();
        java.lang.String str24 = locale23.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (-9), chronology17, locale23);
        org.joda.time.DurationField durationField26 = chronology17.weekyears();
        org.joda.time.DurationField durationField27 = durationFieldType1.getField(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField27", (durationField16.compareTo(durationField27) == 0) == durationField16.equals(durationField27));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology12.hours();
        int int18 = durationField15.getDifference(117L, 117L);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology31 = dateTimeParserBucket30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.years();
        org.joda.time.Chronology chronology33 = chronology31.withUTC();
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 0, 0);
        dateTimeParserBucket45.setOffset((java.lang.Integer) 10);
        java.lang.Object obj48 = dateTimeParserBucket45.saveState();
        java.lang.Integer int49 = dateTimeParserBucket45.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeParserBucket45.getZone();
        org.joda.time.Chronology chronology51 = chronology31.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField52 = chronology31.weekyears();
        int int53 = durationField15.compareTo(durationField52);
        long long56 = durationField15.getMillis((-23518L), 8640000035L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField52", (durationField13.compareTo(durationField52) == 0) == durationField13.equals(durationField52));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale43 = dateTimeParserBucket41.getLocale();
        int int44 = dateTimeField29.getMaximumShortTextLength(locale43);
        java.lang.String str45 = locale43.getLanguage();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.minuteOfHour();
        long long63 = dateTimeField60.getDifferenceAsLong(10L, 883612800035L);
        java.util.Locale locale65 = new java.util.Locale("Koordinierte Universalzeit");
        int int66 = dateTimeField60.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale43.getDisplayCountry(locale65);
        java.lang.String str69 = locale65.getExtension('x');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((-1753151L), chronology13, locale65, (java.lang.Integer) 86399999, 44);
        org.joda.time.DurationField durationField73 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField74 = chronology13.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField73", (durationField14.compareTo(durationField73) == 0) == durationField14.equals(durationField73));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.yearOfEra();
        int int15 = property14.getMaximumValueOverall();
        int int16 = property14.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        int int18 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean22 = localDateTime20.isSupported(dateTimeFieldType21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withPeriodAdded(readablePeriod23, 2);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime28 = property26.addToCopy((-52));
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property26.getFieldType();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology45 = dateTimeParserBucket44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology45.days();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((-61851599999948L), chronology45);
        org.joda.time.DateTimeField dateTimeField51 = chronology45.halfdayOfDay();
        org.joda.time.DurationField durationField52 = durationFieldType31.getField(chronology45);
        org.joda.time.Chronology chronology57 = null;
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        java.util.Locale locale59 = null;
        java.lang.String str60 = locale58.getDisplayVariant(locale59);
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        java.util.Locale locale62 = null;
        java.lang.String str63 = locale61.getDisplayVariant(locale62);
        java.lang.String str64 = locale58.getDisplayCountry(locale61);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology57, locale58, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology68 = dateTimeParserBucket67.getChronology();
        java.util.Locale locale69 = dateTimeParserBucket67.getLocale();
        boolean boolean71 = dateTimeParserBucket67.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology72 = dateTimeParserBucket67.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField74 = chronology72.year();
        java.util.Locale locale78 = new java.util.Locale("italiano", "1970-01-01T00:00:00.000", "1");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((-31449599990L), chronology72, locale78);
        dateTimeParserBucket79.setOffset((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology82 = dateTimeParserBucket79.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.minuteOfHour();
        org.joda.time.DurationField durationField84 = chronology82.weeks();
        java.util.Locale.Builder builder85 = new java.util.Locale.Builder();
        java.util.Locale locale86 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale86);
        java.util.Locale locale88 = locale86.stripExtensions();
        java.util.Locale.Builder builder89 = builder85.setLocale(locale88);
        java.util.Locale locale90 = builder89.build();
        java.util.Locale locale91 = builder89.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket92 = new org.joda.time.format.DateTimeParserBucket(61850372199L, chronology82, locale91);
        org.joda.time.LocalDateTime localDateTime93 = new org.joda.time.LocalDateTime((long) 15, chronology82);
        org.joda.time.DurationField durationField94 = chronology82.eras();
        boolean boolean95 = durationFieldType31.isSupported(chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField49 and durationField94", Math.signum(durationField49.compareTo(durationField94)) == -Math.signum(durationField94.compareTo(durationField49)));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale18.getDisplayCountry(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 0, 0);
        dateTimeParserBucket27.setOffset((java.lang.Integer) 10);
        java.lang.Object obj30 = dateTimeParserBucket27.saveState();
        java.lang.Integer int31 = dateTimeParserBucket27.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket27.getZone();
        org.joda.time.Chronology chronology33 = chronology13.withZone(dateTimeZone32);
        java.util.Locale locale36 = new java.util.Locale("weekyear", "GMT");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-33342L), chronology13, locale36);
        long long38 = dateTimeParserBucket37.computeMillis();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str40 = durationFieldType39.getName();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.util.Locale locale45 = null;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale locale48 = null;
        java.lang.String str49 = locale47.getDisplayVariant(locale48);
        java.lang.String str50 = locale44.getDisplayCountry(locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket53.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.millis();
        org.joda.time.tz.NameProvider nameProvider56 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale57 = java.util.Locale.TAIWAN;
        java.lang.String str60 = nameProvider56.getName(locale57, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology54, locale57, (java.lang.Integer) 28, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField64 = chronology54.era();
        org.joda.time.DurationField durationField65 = durationFieldType39.getField(chronology54);
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now(chronology54);
        java.lang.String str68 = localDateTime66.toString("0");
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.plusMinutes(79200001);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone74);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.minus(readablePeriod76);
        int int78 = localDateTime77.getYearOfCentury();
        java.util.Date date79 = localDateTime77.toDate();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime77.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime83 = localDateTime81.toDateTime(dateTimeZone82);
        long long87 = dateTimeZone82.convertLocalToUTC(315569520000L, false, (long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone82);
        java.lang.String str90 = dateTimeZone82.getNameKey((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime(32L, dateTimeZone82);
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime((-144719999947L), dateTimeZone82);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone82);
        boolean boolean94 = localDateTime66.equals((java.lang.Object) dateTimeZone82);
        dateTimeParserBucket37.setZone(dateTimeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField65", (durationField14.compareTo(durationField65) == 0) == durationField14.equals(durationField65));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DurationField durationField15 = chronology12.months();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology12.add(readablePeriod19, (-10372770057600000L), 25);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale25.getDisplayCountry(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        long long39 = dateTimeField36.set((long) '4', (int) (short) 0);
        long long41 = dateTimeField36.roundFloor((long) (byte) 0);
        long long44 = dateTimeField36.set((-62167219199948L), "10");
        long long46 = dateTimeField36.roundCeiling(2208988800120L);
        long long49 = dateTimeField36.set((long) ' ', "10");
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale locale53 = null;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.GERMAN;
        java.util.Locale locale56 = null;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.lang.String str58 = locale52.getDisplayCountry(locale55);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology51, locale52, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology62 = dateTimeParserBucket61.getChronology();
        org.joda.time.DurationField durationField63 = chronology62.years();
        org.joda.time.DurationField durationField64 = chronology62.minutes();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology62);
        int int66 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.DurationField durationField67 = dateTimeField36.getLeapDurationField();
        long long70 = dateTimeField36.set(31556952000L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minus(readablePeriod74);
        int int76 = localDateTime75.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusSeconds(1);
        int[] intArray79 = null;
        int int80 = dateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) localDateTime78, intArray79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime78.yearOfEra();
        org.joda.time.LocalDateTime localDateTime82 = property81.roundHalfFloorCopy();
        int int83 = property81.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime85 = property81.setCopy(305);
        int[] intArray87 = chronology12.get((org.joda.time.ReadablePartial) localDateTime85, (long) 292278993);
        org.joda.time.DurationField durationField88 = chronology12.days();
        org.joda.time.DurationField durationField89 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField90 = chronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField89", (durationField13.compareTo(durationField89) == 0) == durationField13.equals(durationField89));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayCountry(locale7);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology14, locale17, (java.lang.Integer) 2, 70);
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField28 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology14.clockhourOfDay();
        org.joda.time.DurationField durationField31 = chronology14.weekyears();
        org.joda.time.DurationField durationField32 = chronology14.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField31", (durationField15.compareTo(durationField31) == 0) == durationField15.equals(durationField31));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = null;
        java.lang.String str18 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = null;
        java.lang.String str21 = locale19.getDisplayVariant(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology13, locale16, (java.lang.Integer) 2, 70);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket25.getChronology();
        java.lang.String str28 = chronology27.toString();
        org.joda.time.DurationField durationField29 = chronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField29", (durationField14.compareTo(durationField29) == 0) == durationField14.equals(durationField29));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        java.util.Locale locale14 = dateTimeParserBucket12.getLocale();
        boolean boolean16 = dateTimeParserBucket12.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology17 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket12.getZone();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfHour();
        org.joda.time.DurationField durationField21 = chronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (-61851579048000L), (int) (short) 0);
        org.joda.time.DurationField durationField26 = durationFieldType0.getField(chronology19);
        java.lang.String str27 = durationFieldType0.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField26", Math.signum(durationField21.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField21)));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property6.getFieldType();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale12.getDisplayVariant(locale13);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.lang.String str18 = locale12.getDisplayCountry(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology11, locale12, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology22);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType8.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField26 = chronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.dayOfWeek();
        org.joda.time.Chronology chronology28 = chronology22.withUTC();
        java.util.Locale locale31 = new java.util.Locale("", "GMT+00:00");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 59, chronology28, locale31, (java.lang.Integer) 55);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology35, locale36, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.year();
        org.joda.time.DurationField durationField48 = chronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minus(readablePeriod53);
        boolean boolean55 = dateTimeZone49.isLocalDateTimeGap(localDateTime54);
        org.joda.time.Chronology chronology56 = chronology46.withZone(dateTimeZone49);
        int int58 = dateTimeZone49.getOffsetFromLocal(1L);
        int int60 = dateTimeZone49.getOffsetFromLocal((long) 80700);
        org.joda.time.Chronology chronology61 = chronology28.withZone(dateTimeZone49);
        org.joda.time.DurationField durationField62 = chronology61.eras();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField48 and durationField62", Math.signum(durationField48.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField48)));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology15 = chronology13.withUTC();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale18.getDisplayCountry(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology17, locale18, (java.lang.Integer) 0, 0);
        dateTimeParserBucket27.setOffset((java.lang.Integer) 10);
        java.lang.Object obj30 = dateTimeParserBucket27.saveState();
        java.lang.Integer int31 = dateTimeParserBucket27.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket27.getZone();
        org.joda.time.Chronology chronology33 = chronology13.withZone(dateTimeZone32);
        org.joda.time.tz.NameProvider nameProvider34 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        java.lang.String str44 = nameProvider34.getShortName(locale38, "hi!", "");
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.millis();
        org.joda.time.tz.NameProvider nameProvider60 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.lang.String str64 = nameProvider60.getName(locale61, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology58, locale61, (java.lang.Integer) 28, (int) (short) 10);
        java.lang.String str70 = nameProvider34.getName(locale61, "ISOChronology[UTC]", "DurationField[years]");
        java.lang.String str71 = locale61.getISO3Language();
        java.lang.String str72 = locale61.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(62135596800000L, chronology33, locale61);
        org.joda.time.DurationField durationField74 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField75 = chronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField76 = chronology33.halfdayOfDay();
        org.joda.time.DurationField durationField77 = chronology33.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField59 and durationField74", (durationField59.compareTo(durationField74) == 0) == durationField59.equals(durationField74));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale3.getDisplayCountry(locale6);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology2, locale3, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = null;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = null;
        java.lang.String str22 = locale20.getDisplayVariant(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale20);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket26.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfHalfday();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale43 = dateTimeParserBucket41.getLocale();
        int int44 = dateTimeField29.getMaximumShortTextLength(locale43);
        java.lang.String str45 = locale43.getLanguage();
        org.joda.time.Chronology chronology47 = null;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology47, locale48, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology58 = dateTimeParserBucket57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.minuteOfHour();
        long long63 = dateTimeField60.getDifferenceAsLong(10L, 883612800035L);
        java.util.Locale locale65 = new java.util.Locale("Koordinierte Universalzeit");
        int int66 = dateTimeField60.getMaximumShortTextLength(locale65);
        java.lang.String str67 = locale43.getDisplayCountry(locale65);
        java.lang.String str69 = locale65.getExtension('x');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((-1753151L), chronology13, locale65, (java.lang.Integer) 86399999, 44);
        org.joda.time.DurationField durationField73 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField74 = chronology13.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField73", (durationField14.compareTo(durationField73) == 0) == durationField14.equals(durationField73));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket11.getChronology();
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        java.lang.String str19 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        org.joda.time.DurationField durationField21 = chronology18.minutes();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.dayOfYear();
        org.joda.time.DurationField durationField23 = chronology18.hours();
        org.joda.time.DurationField durationField24 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField21, and durationField23", !(durationField24.compareTo(durationField21) == 0) || (Math.signum(durationField24.compareTo(durationField23)) == Math.signum(durationField21.compareTo(durationField23))));
    }
}

