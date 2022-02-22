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
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField13, and durationField15", !(durationField18.compareTo(durationField13) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        org.joda.time.DurationField durationField65 = chronology63.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField64", (durationField43.compareTo(durationField64) == 0) == durationField43.equals(durationField64));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        java.lang.String str28 = durationFieldType27.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.joda.time.DurationField durationField20 = chronology12.months();
        java.lang.String str21 = chronology12.toString();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.centuryOfEra();
        org.joda.time.DurationField durationField23 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField14, and durationField20", !(durationField23.compareTo(durationField14) == 0) || (Math.signum(durationField23.compareTo(durationField20)) == Math.signum(durationField14.compareTo(durationField20))));
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
        org.joda.time.DateTimeField dateTimeField65 = chronology63.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField64", (durationField43.compareTo(durationField64) == 0) == durationField43.equals(durationField64));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        java.lang.String str19 = localDateTime17.toString();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        int int27 = localDateTime26.getYearOfCentury();
        java.util.Date date28 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(dateTimeZone31);
        long long36 = dateTimeZone31.convertLocalToUTC(315569520000L, false, (long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        int int39 = dateTimeZone31.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        boolean boolean46 = localDateTime42.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.era();
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.monthOfYear();
        boolean boolean49 = dateTimeZone31.isLocalDateTimeGap(localDateTime42);
        int int50 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime42);
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
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology63);
        boolean boolean67 = localDateTime42.equals((java.lang.Object) chronology63);
        org.joda.time.DurationField durationField68 = chronology63.weekyears();
        org.joda.time.DateTimeField dateTimeField69 = chronology63.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField68", (durationField64.compareTo(durationField68) == 0) == durationField64.equals(durationField68));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.years();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minus(readablePeriod45);
        boolean boolean47 = dateTimeZone41.isLocalDateTimeGap(localDateTime46);
        org.joda.time.Chronology chronology48 = chronology38.withZone(dateTimeZone41);
        boolean boolean49 = dateTimeFieldType25.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.dayOfWeek();
        org.joda.time.DurationField durationField54 = durationFieldType24.getField(chronology48);
        java.lang.String str55 = durationFieldType24.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField54", Math.signum(durationField40.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField40)));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        org.joda.time.DateTimeField dateTimeField30 = chronology26.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.years();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minus(readablePeriod45);
        boolean boolean47 = dateTimeZone41.isLocalDateTimeGap(localDateTime46);
        org.joda.time.Chronology chronology48 = chronology38.withZone(dateTimeZone41);
        boolean boolean49 = dateTimeFieldType25.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.dayOfWeek();
        org.joda.time.DurationField durationField54 = durationFieldType24.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField55 = chronology48.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField54", Math.signum(durationField40.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField40)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '#', chronology17);
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
        org.joda.time.DurationField durationField34 = chronology33.hours();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '#', chronology33);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMonths((int) (short) 10);
        boolean boolean38 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime();
        long long40 = dateTime39.getMillis();
        org.joda.time.Instant instant41 = dateTime39.toInstant();
        long long42 = instant41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = instant41.getZone();
        int int44 = property3.getDifference((org.joda.time.ReadableInstant) instant41);
        org.joda.time.LocalDateTime localDateTime45 = property3.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant41", (dateTime39.compareTo(instant41) == 0) == dateTime39.equals(instant41));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
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
        org.joda.time.DurationField durationField15 = chronology14.hours();
        boolean boolean16 = durationFieldType1.isSupported(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.millis();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField15, and durationField17", !(durationField21.compareTo(durationField15) == 0) || (Math.signum(durationField21.compareTo(durationField17)) == Math.signum(durationField15.compareTo(durationField17))));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.joda.time.DateTimeField dateTimeField27 = chronology13.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.joda.time.DurationField durationField19 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField21 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((-252000L), chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField21", (durationField15.compareTo(durationField21) == 0) == durationField15.equals(durationField21));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property6.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = null;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale11.getDisplayCountry(locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType8.getField(chronology21);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        boolean boolean50 = dateTimeFieldType26.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.year();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfWeek();
        org.joda.time.DurationField durationField55 = durationFieldType25.getField(chronology49);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 38, chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField41 and durationField55", Math.signum(durationField41.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField41)));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        org.joda.time.DurationField durationField18 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField20 = chronology13.weekyears();
        org.joda.time.DurationField durationField21 = chronology13.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField20", (durationField14.compareTo(durationField20) == 0) == durationField14.equals(durationField20));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        org.joda.time.Chronology chronology38 = chronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField37", Math.signum(durationField14.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField14)));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        org.joda.time.LocalDateTime localDateTime46 = localDateTime15.plusMillis(99);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant43", (dateTime42.compareTo(instant43) == 0) == dateTime42.equals(instant43));
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
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
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
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField23 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology12.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField24", Math.signum(durationField14.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField14)));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology13.era();
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfEra();
        int int31 = property30.getMaximumValueOverall();
        int int32 = property30.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minus(readablePeriod37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.yearOfEra();
        int int40 = property39.getMaximumValueOverall();
        int int41 = property39.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime42 = property39.roundHalfFloorCopy();
        int int43 = property30.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray46 = localDateTime45.getFields();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean50 = localDateTime45.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.minusYears(10);
        int int53 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField24", Math.signum(durationField14.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField14)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        dateTimeParserBucket11.setOffset((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.DurationField durationField29 = chronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        org.joda.time.Chronology chronology37 = chronology27.withZone(dateTimeZone30);
        boolean boolean38 = dateTimeFieldType14.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.year();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology37.getZone();
        dateTimeParserBucket11.setZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        boolean boolean48 = dateTimeParserBucket11.restoreState((java.lang.Object) dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str50 = dateTimeFieldType49.toString();
        dateTimeParserBucket11.saveField(dateTimeFieldType49, (int) (byte) 10);
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
        org.joda.time.DurationField durationField66 = chronology65.years();
        org.joda.time.Chronology chronology67 = chronology65.withUTC();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.dayOfMonth();
        org.joda.time.DurationField durationField69 = chronology67.eras();
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType49.getField(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField29 and durationField69", Math.signum(durationField29.compareTo(durationField69)) == -Math.signum(durationField69.compareTo(durationField29)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
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
        org.joda.time.DateTimeField dateTimeField34 = chronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType20.getField(chronology33);
        int int37 = localDateTime12.get(dateTimeFieldType20);
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
        org.joda.time.DurationField durationField52 = chronology51.years();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.hourOfHalfday();
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = locale54.getDisplayCountry(locale57);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology51, locale54, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField64 = chronology51.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType20.getField(chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField52 and durationField64", (durationField52.compareTo(durationField64) == 0) == durationField52.equals(durationField64));
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
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
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
        boolean boolean37 = durationFieldType22.isSupported(chronology35);
        org.joda.time.DurationField durationField38 = durationFieldType20.getField(chronology35);
        java.util.Locale locale39 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology35, locale39, (java.lang.Integer) 1970);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        dateTimeParserBucket41.setZone(dateTimeZone42);
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
        dateTimeParserBucket41.setZone(dateTimeZone53);
        long long62 = dateTimeZone53.nextTransition((long) (short) 100);
        java.lang.String str63 = dateTimeZone53.toString();
        long long65 = dateTimeZone53.convertUTCToLocal((-3600000L));
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(obj17, dateTimeZone53);
        int[] intArray68 = chronology14.get((org.joda.time.ReadablePartial) localDateTime66, 172800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
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
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology15);
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
        org.joda.time.DurationField durationField31 = chronology30.years();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfHalfday();
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
        java.util.Locale locale46 = dateTimeParserBucket44.getLocale();
        int int47 = dateTimeField32.getMaximumShortTextLength(locale46);
        java.lang.String str48 = locale46.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale46, (java.lang.Integer) 31, 292278993);
        org.joda.time.DurationField durationField52 = chronology15.weeks();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minus(readablePeriod56);
        int int58 = localDateTime57.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.minusSeconds(1);
        int[] intArray62 = chronology15.get((org.joda.time.ReadablePartial) localDateTime57, 3155760000072L);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (-52), chronology15);
        org.joda.time.DateTimeField dateTimeField64 = chronology15.weekyear();
        org.joda.time.DurationField durationField65 = chronology15.seconds();
        org.joda.time.DurationField durationField66 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField31, and durationField52", !(durationField66.compareTo(durationField31) == 0) || (Math.signum(durationField66.compareTo(durationField52)) == Math.signum(durationField31.compareTo(durationField52))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        org.joda.time.DurationField durationField30 = chronology29.millis();
        org.joda.time.DurationField durationField31 = chronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.millisOfDay();
        boolean boolean33 = durationFieldType0.isSupported(chronology29);
        org.joda.time.DateTimeField dateTimeField34 = chronology29.era();
        org.joda.time.DurationField durationField35 = dateTimeField34.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField14, and durationField15", !(durationField35.compareTo(durationField14) == 0) || (Math.signum(durationField35.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        java.lang.String str49 = durationField43.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField26", (durationField43.compareTo(durationField26) == 0) == durationField43.equals(durationField26));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        org.joda.time.Chronology chronology30 = chronology26.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
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
        org.joda.time.DurationField durationField14 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = chronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
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
        org.joda.time.DateTimeField dateTimeField44 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType30.getField(chronology43);
        java.util.Locale locale49 = new java.util.Locale("10", "DurationField[years]");
        java.lang.String str50 = locale49.getVariant();
        java.util.Set<java.lang.Character> charSet51 = locale49.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(170208000010L, chronology43, locale49, (java.lang.Integer) 365, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(95L, chronology43);
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology43, locale56, (java.lang.Integer) (-52));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(7200000L, chronology13, locale56, (java.lang.Integer) (-5700000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField19", (durationField14.compareTo(durationField19) == 0) == durationField14.equals(durationField19));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        java.lang.String str19 = localDateTime17.toString();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        int int27 = localDateTime26.getYearOfCentury();
        java.util.Date date28 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(dateTimeZone31);
        long long36 = dateTimeZone31.convertLocalToUTC(315569520000L, false, (long) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        int int39 = dateTimeZone31.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        boolean boolean46 = localDateTime42.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.era();
        org.joda.time.LocalDateTime.Property property48 = localDateTime42.monthOfYear();
        boolean boolean49 = dateTimeZone31.isLocalDateTimeGap(localDateTime42);
        int int50 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime42);
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
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology63);
        boolean boolean67 = localDateTime42.equals((java.lang.Object) chronology63);
        org.joda.time.DurationField durationField68 = chronology63.weekyears();
        org.joda.time.DurationField durationField69 = chronology63.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField68", (durationField64.compareTo(durationField68) == 0) == durationField64.equals(durationField68));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        int int38 = dateTimeZone36.getOffset((long) (short) 0);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.lang.String str41 = dateTimeZone36.getName((long) (short) 1, locale40);
        long long43 = dateTimeZone35.getMillisKeepLocal(dateTimeZone36, (long) 31);
        org.joda.time.Chronology chronology44 = chronology34.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField45 = chronology34.weekyears();
        org.joda.time.DurationField durationField46 = chronology34.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField45", (durationField14.compareTo(durationField45) == 0) == durationField14.equals(durationField45));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.joda.time.DurationField durationField25 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField25", Math.signum(durationField14.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField14)));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology22);
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
        org.joda.time.DateTimeField dateTimeField38 = chronology37.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minus(readablePeriod42);
        org.joda.time.tz.NameProvider nameProvider45 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.util.Locale locale50 = null;
        java.lang.String str51 = locale49.getDisplayVariant(locale50);
        java.lang.String str52 = locale46.getDisplayCountry(locale49);
        java.lang.String str55 = nameProvider45.getShortName(locale46, "", "hi!");
        java.lang.String str56 = dateTimeField38.getAsShortText((org.joda.time.ReadablePartial) localDateTime41, (int) (byte) 10, locale46);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime41.withMillisOfSecond(10);
        java.util.Locale locale60 = java.util.Locale.ITALY;
        java.util.Locale locale61 = java.util.Locale.GERMAN;
        java.util.Locale locale62 = null;
        java.lang.String str63 = locale61.getDisplayVariant(locale62);
        java.util.Locale locale64 = java.util.Locale.GERMAN;
        java.util.Locale locale65 = null;
        java.lang.String str66 = locale64.getDisplayVariant(locale65);
        java.lang.String str67 = locale61.getDisplayCountry(locale64);
        java.lang.String str68 = locale60.getDisplayScript(locale64);
        java.lang.String str69 = locale60.getDisplayCountry();
        java.lang.String str70 = localDateTime41.toString("-1", locale60);
        org.joda.time.Chronology chronology72 = null;
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = null;
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        java.util.Locale locale76 = java.util.Locale.GERMAN;
        java.util.Locale locale77 = null;
        java.lang.String str78 = locale76.getDisplayVariant(locale77);
        java.lang.String str79 = locale73.getDisplayCountry(locale76);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology72, locale73, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology83 = dateTimeParserBucket82.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.year();
        org.joda.time.DurationField durationField85 = chronology83.years();
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone88);
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        org.joda.time.LocalDateTime localDateTime91 = localDateTime89.minus(readablePeriod90);
        boolean boolean92 = dateTimeZone86.isLocalDateTimeGap(localDateTime91);
        org.joda.time.Chronology chronology93 = chronology83.withZone(dateTimeZone86);
        org.joda.time.DateTime dateTime94 = localDateTime41.toDateTime(dateTimeZone86);
        org.joda.time.LocalDateTime localDateTime96 = localDateTime41.plusYears((int) 'u');
        org.joda.time.LocalDateTime.Property property97 = localDateTime96.era();
        int[] intArray99 = chronology22.get((org.joda.time.ReadablePartial) localDateTime96, (-48883L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField85", (durationField23.compareTo(durationField85) == 0) == durationField23.equals(durationField85));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayVariant(locale41);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = null;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.lang.String str46 = locale40.getDisplayCountry(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.years();
        org.joda.time.Chronology chronology52 = chronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.millisOfDay();
        boolean boolean55 = dateTime35.equals((java.lang.Object) dateTimeField54);
        long long57 = dateTimeField54.roundFloor(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant37", (dateTime35.compareTo(instant37) == 0) == dateTime35.equals(instant37));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray29 = new java.lang.String[] { "UTC", "1970", "Deutsch", "UTC", "UTC", "10", "10", "+00:00", "10", "UTC" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray45 = new java.lang.String[] { "UTC", "UTC", "+00:00", "DurationField[years]", "+00:00", "Italia", "UTC", "Italien", "Italia", "+00:00", "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.add("Italien");
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet46);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet46);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        java.util.Locale locale68 = null;
        java.lang.String str69 = locale67.getDisplayVariant(locale68);
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale70.getDisplayVariant(locale71);
        java.lang.String str73 = locale67.getDisplayCountry(locale70);
        dateTimeParserBucket63.saveField(dateTimeFieldType65, "", locale67);
        boolean boolean75 = strSet46.remove((java.lang.Object) dateTimeFieldType65);
        org.joda.time.Chronology chronology78 = null;
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.util.Locale locale80 = null;
        java.lang.String str81 = locale79.getDisplayVariant(locale80);
        java.util.Locale locale82 = java.util.Locale.GERMAN;
        java.util.Locale locale83 = null;
        java.lang.String str84 = locale82.getDisplayVariant(locale83);
        java.lang.String str85 = locale79.getDisplayCountry(locale82);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology78, locale79, (java.lang.Integer) 0, 0);
        dateTimeParserBucket11.saveField(dateTimeFieldType65, "1970-01-01T00:00:00.052", locale79);
        org.joda.time.Chronology chronology90 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.eras();
        org.joda.time.DurationField durationField92 = chronology90.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField91, durationField92, and durationField91", !(durationField91.compareTo(durationField92) == 0) || (Math.signum(durationField91.compareTo(durationField91)) == Math.signum(durationField92.compareTo(durationField91))));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.joda.time.DateTimeField dateTimeField30 = chronology26.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField29", (durationField18.compareTo(durationField29) == 0) == durationField18.equals(durationField29));
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
        org.joda.time.DateTimeField dateTimeField27 = chronology26.year();
        org.joda.time.DurationField durationField28 = chronology26.years();
        int int29 = durationField13.compareTo(durationField28);
        int int31 = durationField28.getValue((-1L));
        long long33 = durationField28.getMillis((long) 9);
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
        org.joda.time.DurationField durationField47 = chronology46.years();
        long long50 = durationField47.add((long) 'x', 70);
        boolean boolean51 = durationField47.isSupported();
        int int52 = durationField28.compareTo(durationField47);
        java.lang.String str53 = durationField47.getName();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale57.getDisplayCountry(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.years();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.hourOfHalfday();
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale70.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = null;
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        java.lang.String str76 = locale70.getDisplayCountry(locale73);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology67, locale70, (java.lang.Integer) 2, 70);
        org.joda.time.DurationField durationField80 = chronology67.weekyears();
        int int82 = durationField80.getValue((long) (short) -1);
        long long85 = durationField80.subtract((long) (short) -1, (long) 14);
        int int86 = durationField47.compareTo(durationField80);
        long long88 = durationField47.getValueAsLong((-68562000000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField80", (durationField47.compareTo(durationField80) == 0) == durationField47.equals(durationField80));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.joda.time.DurationField durationField26 = chronology23.centuries();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField26", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField26)) == Math.signum(durationField15.compareTo(durationField26))));
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
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        java.lang.String str19 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        java.lang.String str27 = durationFieldType26.toString();
        java.lang.String str28 = durationFieldType26.getName();
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
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.hourOfDay();
        org.joda.time.DurationField durationField54 = durationFieldType26.getField(chronology51);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime24.withFieldAdded(durationFieldType26, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField54", (durationField43.compareTo(durationField54) == 0) == durationField43.equals(durationField54));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        long long24 = chronology18.add((long) 'a', 10L, (int) (short) 0);
        org.joda.time.DurationField durationField25 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.dayOfWeek();
        org.joda.time.DurationField durationField27 = chronology18.years();
        org.joda.time.DurationField durationField28 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField25, and durationField27", !(durationField28.compareTo(durationField25) == 0) || (Math.signum(durationField28.compareTo(durationField27)) == Math.signum(durationField25.compareTo(durationField27))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        int int5 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds(1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfEra();
        int int14 = property13.getMaximumValueOverall();
        int int15 = property13.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear((int) ' ');
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
        int int45 = localDateTime20.get(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime20.withWeekyear(70);
        int int48 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusDays(28);
        org.joda.time.DateTime dateTime51 = localDateTime50.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int53 = dateTime51.get(dateTimeFieldType52);
        java.lang.String str54 = dateTimeFieldType52.toString();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale57.getDisplayCountry(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.years();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.year();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.minuteOfHour();
        org.joda.time.DurationField durationField72 = chronology67.eras();
        boolean boolean73 = dateTimeFieldType52.isSupported(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField68 and durationField72", Math.signum(durationField68.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField68)));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((-599990L), chronology17);
        org.joda.time.DurationField durationField27 = chronology17.days();
        org.joda.time.DurationField durationField28 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField28", Math.signum(durationField27.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField27)));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        int int5 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        int int13 = localDateTime12.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDateTime12.isSupported(durationFieldType14);
        int int16 = localDateTime12.getWeekyear();
        boolean boolean17 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        boolean boolean42 = dateTimeFieldType18.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = chronology41.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        boolean boolean54 = dateTimeZone48.isLocalDateTimeGap(localDateTime53);
        int int55 = localDateTime53.getYearOfEra();
        org.joda.time.Chronology chronology56 = localDateTime53.getChronology();
        int int57 = localDateTime53.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readablePeriod61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.yearOfEra();
        int int64 = property63.getMaximumValueOverall();
        int int65 = property63.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime66 = property63.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minus(readablePeriod70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.yearOfEra();
        int int73 = property72.getMaximumValueOverall();
        int int74 = property72.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime75 = property72.roundHalfFloorCopy();
        int int76 = property63.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime75.minus(readablePeriod79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plus(readablePeriod81);
        boolean boolean83 = localDateTime53.equals((java.lang.Object) localDateTime82);
        int[] intArray85 = chronology41.get((org.joda.time.ReadablePartial) localDateTime53, 1104537600009L);
        org.joda.time.DurationField durationField86 = chronology41.weekyears();
        boolean boolean87 = localDateTime7.equals((java.lang.Object) durationField86);
        org.joda.time.ReadableDuration readableDuration88 = null;
        org.joda.time.LocalDateTime localDateTime90 = localDateTime7.withDurationAdded(readableDuration88, 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField86", (durationField33.compareTo(durationField86) == 0) == durationField33.equals(durationField86));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        org.joda.time.DateTimeField dateTimeField51 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField52 = chronology14.weekyears();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        long long56 = chronology14.add(readablePeriod53, (long) 53, (-52));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField52", (durationField30.compareTo(durationField52) == 0) == durationField30.equals(durationField52));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str1 = durationFieldType0.toString();
        java.lang.String str2 = durationFieldType0.toString();
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
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DurationField durationField17 = chronology15.years();
        boolean boolean18 = durationFieldType0.isSupported(chronology15);
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.DurationField durationField20 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField17, and durationField19", !(durationField20.compareTo(durationField17) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        org.joda.time.DurationField durationField20 = chronology12.months();
        org.joda.time.DurationField durationField21 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField14, and durationField20", !(durationField21.compareTo(durationField14) == 0) || (Math.signum(durationField21.compareTo(durationField20)) == Math.signum(durationField14.compareTo(durationField20))));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        int int38 = dateTimeZone36.getOffset((long) (short) 0);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.lang.String str41 = dateTimeZone36.getName((long) (short) 1, locale40);
        long long43 = dateTimeZone35.getMillisKeepLocal(dateTimeZone36, (long) 31);
        org.joda.time.Chronology chronology44 = chronology34.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField45 = chronology34.weekyears();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology34.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField45", (durationField14.compareTo(durationField45) == 0) == durationField14.equals(durationField45));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField20", (durationField13.compareTo(durationField20) == 0) == durationField13.equals(durationField20));
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
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.Locale locale3 = new java.util.Locale("Englisch", "italien (Italie)", "69");
        org.joda.time.tz.NameProvider nameProvider4 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str8 = nameProvider4.getName(locale5, "1", "Ora media di Greenwich");
        java.lang.String str9 = locale3.getDisplayScript(locale5);
        java.lang.String str10 = locale5.getVariant();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readablePeriod14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.yearOfEra();
        int int17 = property16.getMaximumValueOverall();
        int int18 = property16.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime19 = property16.roundHalfFloorCopy();
        int int20 = property16.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime21 = property16.roundCeilingCopy();
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
        boolean boolean56 = localDateTime37.isBefore((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.DateTime dateTime57 = localDateTime53.toDateTime();
        long long58 = dateTime57.getMillis();
        org.joda.time.Instant instant59 = dateTime57.toInstant();
        int int60 = property16.getDifference((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDateTime localDateTime62 = property16.addWrapFieldToCopy((int) '4');
        int int63 = property16.getMaximumValue();
        boolean boolean64 = property16.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property16.getFieldType();
        boolean boolean66 = locale5.equals((java.lang.Object) property16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and instant59", (dateTime57.compareTo(instant59) == 0) == dateTime57.equals(instant59));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        java.lang.String str8 = property5.toString();
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy(31);
        org.joda.time.LocalDateTime localDateTime11 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getRangeDurationType();
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
        org.joda.time.DurationField durationField29 = durationFieldType15.getField(chronology28);
        java.lang.String str30 = durationFieldType15.getName();
        java.lang.String str31 = durationFieldType15.getName();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime13.withFieldAdded(durationFieldType15, 0);
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
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minus(readablePeriod60);
        int int62 = localDateTime61.getYearOfCentury();
        java.util.Date date63 = localDateTime61.toDate();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime67 = localDateTime65.toDateTime(dateTimeZone66);
        org.joda.time.Chronology chronology68 = chronology46.withZone(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        int int72 = dateTimeZone70.getOffset((long) (short) 0);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.lang.String str75 = dateTimeZone70.getName((long) (short) 1, locale74);
        long long77 = dateTimeZone69.getMillisKeepLocal(dateTimeZone70, (long) 31);
        org.joda.time.Chronology chronology78 = chronology68.withZone(dateTimeZone70);
        org.joda.time.DurationField durationField79 = chronology68.weekyears();
        boolean boolean80 = durationFieldType15.isSupported(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField79", (durationField48.compareTo(durationField79) == 0) == durationField48.equals(durationField79));
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
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DurationFieldType durationFieldType17 = durationField16.getType();
        java.lang.String str18 = durationFieldType17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        org.joda.time.DateTimeZone dateTimeZone14 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField17 = chronology12.days();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField13, and durationField17", !(durationField18.compareTo(durationField13) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField13.compareTo(durationField17))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology13);
        long long21 = chronology13.add((-31536000000L), (-115246022400000L), (int) 'x');
        org.joda.time.DurationField durationField22 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology13.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField22", Math.signum(durationField14.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField14)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        long long29 = durationField26.getMillis(2022, 3287L);
        org.joda.time.DurationFieldType durationFieldType30 = durationField26.getType();
        java.lang.String str31 = durationFieldType30.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DurationField durationField17 = chronology12.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        org.joda.time.DurationField durationField65 = chronology63.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField64", (durationField43.compareTo(durationField64) == 0) == durationField43.equals(durationField64));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.joda.time.DurationField durationField16 = chronology12.millis();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField13, and durationField14", !(durationField17.compareTo(durationField13) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.joda.time.LocalDateTime.Property property45 = localDateTime15.dayOfYear();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant43", (dateTime42.compareTo(instant43) == 0) == dateTime42.equals(instant43));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology14.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology14.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField29", (durationField15.compareTo(durationField29) == 0) == durationField15.equals(durationField29));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.centuryOfEra();
        org.joda.time.DurationField durationField23 = chronology12.weeks();
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField14, and durationField23", !(durationField24.compareTo(durationField14) == 0) || (Math.signum(durationField24.compareTo(durationField23)) == Math.signum(durationField14.compareTo(durationField23))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        org.joda.time.DurationField durationField18 = chronology13.years();
        org.joda.time.DurationField durationField19 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField14, and durationField15", !(durationField19.compareTo(durationField14) == 0) || (Math.signum(durationField19.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        java.lang.String str4 = durationFieldType3.toString();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale18 = dateTimeParserBucket16.getLocale();
        boolean boolean20 = dateTimeParserBucket16.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology21 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.year();
        org.joda.time.Chronology chronology24 = chronology21.withUTC();
        org.joda.time.DurationField durationField25 = durationFieldType3.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType0.getField(chronology24);
        org.joda.time.DurationField durationField28 = chronology24.hours();
        org.joda.time.DurationField durationField29 = chronology24.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField25, and durationField28", !(durationField29.compareTo(durationField25) == 0) || (Math.signum(durationField29.compareTo(durationField28)) == Math.signum(durationField25.compareTo(durationField28))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField13, and durationField15", !(durationField19.compareTo(durationField13) == 0) || (Math.signum(durationField19.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        java.lang.String str28 = chronology23.toString();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology23.weekyears();
        java.lang.String str31 = chronology23.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField30", (durationField15.compareTo(durationField30) == 0) == durationField15.equals(durationField30));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        org.joda.time.LocalDateTime.Property property24 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime.Property property25 = localDateTime15.weekyear();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.years();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.yearOfCentury();
        long long45 = chronology38.add((-1920001L), 117L, (int) '#');
        org.joda.time.DateTimeField dateTimeField46 = chronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField47 = chronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = chronology38.centuryOfEra();
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
        org.joda.time.DurationField durationField64 = chronology63.hours();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '#', chronology63);
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale69 = java.util.Locale.GERMAN;
        java.util.Locale locale70 = null;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = null;
        java.lang.String str74 = locale72.getDisplayVariant(locale73);
        java.lang.String str75 = locale69.getDisplayCountry(locale72);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology68, locale69, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology79 = dateTimeParserBucket78.getChronology();
        org.joda.time.DurationField durationField80 = chronology79.hours();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) '#', chronology79);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusMonths((int) (short) 10);
        boolean boolean84 = localDateTime65.isBefore((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.DateTime dateTime85 = localDateTime81.toDateTime();
        long long86 = dateTime85.getMillis();
        org.joda.time.Instant instant87 = dateTime85.toInstant();
        long long88 = instant87.getMillis();
        org.joda.time.DateTimeZone dateTimeZone89 = instant87.getZone();
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone89);
        org.joda.time.Chronology chronology91 = chronology38.withZone(dateTimeZone89);
        org.joda.time.DateTime dateTime92 = localDateTime15.toDateTime(dateTimeZone89);
        org.joda.time.ReadablePeriod readablePeriod93 = null;
        org.joda.time.LocalDateTime localDateTime94 = localDateTime15.plus(readablePeriod93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime85 and instant87", (dateTime85.compareTo(instant87) == 0) == dateTime85.equals(instant87));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMonths((int) (short) 10);
        boolean boolean35 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime();
        long long37 = dateTime36.getMillis();
        org.joda.time.Instant instant38 = dateTime36.toInstant();
        long long39 = instant38.getMillis();
        java.lang.String str40 = instant38.toString();
        org.joda.time.DateTimeZone dateTimeZone41 = instant38.getZone();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(99792000000L, dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant38", (dateTime36.compareTo(instant38) == 0) == dateTime36.equals(instant38));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.lang.String str39 = instant37.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = instant37.getZone();
        java.lang.String str41 = dateTimeZone40.toString();
        long long43 = dateTimeZone40.convertUTCToLocal((-20L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant37", (dateTime35.compareTo(instant37) == 0) == dateTime35.equals(instant37));
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minus(readablePeriod21);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusSeconds(1439);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localDateTime25.toString(dateTimeFormatter26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfWeek();
        int int38 = property37.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime40 = property37.addToCopy((int) (byte) 0);
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
        org.joda.time.DurationField durationField55 = chronology54.hours();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) '#', chronology54);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.util.Locale locale64 = null;
        java.lang.String str65 = locale63.getDisplayVariant(locale64);
        java.lang.String str66 = locale60.getDisplayCountry(locale63);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology70 = dateTimeParserBucket69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.hours();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) '#', chronology70);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusMonths((int) (short) 10);
        boolean boolean75 = localDateTime56.isBefore((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.DateTime dateTime76 = localDateTime72.toDateTime();
        long long77 = dateTime76.getMillis();
        org.joda.time.DateTime dateTime78 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        int int79 = property33.compareTo((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTimeZone dateTimeZone80 = dateTime78.getZone();
        org.joda.time.Instant instant81 = dateTime78.toInstant();
        org.joda.time.Instant instant82 = dateTime78.toInstant();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readablePeriod86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime85.dayOfYear();
        org.joda.time.LocalDateTime localDateTime89 = property88.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime90 = property88.roundFloorCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray91 = localDateTime90.getFields();
        org.joda.time.DateTime dateTime92 = localDateTime90.toDateTime();
        boolean boolean93 = instant82.isBefore((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.DateTime dateTime94 = localDateTime25.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime78 and instant81", (dateTime78.compareTo(instant81) == 0) == dateTime78.equals(instant81));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        org.joda.time.Interval interval5 = property3.toInterval();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = null;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale12.getDisplayVariant(locale13);
        java.lang.String str15 = locale9.getDisplayCountry(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology19 = dateTimeParserBucket18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.hours();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) '#', chronology19);
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
        boolean boolean40 = localDateTime21.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime();
        long long42 = dateTime41.getMillis();
        org.joda.time.Instant instant43 = dateTime41.toInstant();
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
        org.joda.time.DurationField durationField58 = chronology57.hours();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) '#', chronology57);
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.util.Locale locale64 = null;
        java.lang.String str65 = locale63.getDisplayVariant(locale64);
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = null;
        java.lang.String str68 = locale66.getDisplayVariant(locale67);
        java.lang.String str69 = locale63.getDisplayCountry(locale66);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology62, locale63, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology73 = dateTimeParserBucket72.getChronology();
        org.joda.time.DurationField durationField74 = chronology73.hours();
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) '#', chronology73);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime75.plusMonths((int) (short) 10);
        boolean boolean78 = localDateTime59.isBefore((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.DateTime dateTime79 = localDateTime75.toDateTime();
        long long80 = dateTime79.getMillis();
        org.joda.time.Instant instant81 = dateTime79.toInstant();
        boolean boolean82 = dateTime41.isAfter((org.joda.time.ReadableInstant) instant81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalDateTime localDateTime85 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readablePeriod86);
        int int88 = localDateTime87.getYearOfCentury();
        java.util.Date date89 = localDateTime87.toDate();
        org.joda.time.LocalDateTime localDateTime91 = localDateTime87.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone92 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime93 = localDateTime91.toDateTime(dateTimeZone92);
        org.joda.time.Instant instant94 = dateTime93.toInstant();
        boolean boolean95 = instant81.isBefore((org.joda.time.ReadableInstant) dateTime93);
        org.joda.time.Chronology chronology96 = instant81.getChronology();
        long long97 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) instant81);
        int int98 = property3.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and instant43", (dateTime41.compareTo(instant43) == 0) == dateTime41.equals(instant43));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime20.getFields();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime26);
        int int31 = localDateTime23.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int33 = localDateTime23.get(dateTimeFieldType32);
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
        org.joda.time.DateTimeField dateTimeField49 = chronology48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology48);
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
        java.util.Locale locale79 = dateTimeParserBucket77.getLocale();
        int int80 = dateTimeField65.getMaximumShortTextLength(locale79);
        java.lang.String str81 = locale79.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology48, locale79, (java.lang.Integer) 31, 292278993);
        org.joda.time.DurationField durationField85 = chronology48.weeks();
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone87);
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.minus(readablePeriod89);
        int int91 = localDateTime90.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime93 = localDateTime90.minusSeconds(1);
        int[] intArray95 = chronology48.get((org.joda.time.ReadablePartial) localDateTime90, 3155760000072L);
        org.joda.time.DateTimeField dateTimeField96 = chronology48.secondOfDay();
        boolean boolean97 = dateTimeFieldType32.isSupported(chronology48);
        org.joda.time.DurationField durationField98 = chronology48.weekyears();
        org.joda.time.DurationField durationField99 = chronology48.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField64 and durationField98", (durationField64.compareTo(durationField98) == 0) == durationField64.equals(durationField98));
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
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.weekyear();
        org.joda.time.DurationField durationField19 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = chronology12.days();
        org.joda.time.DurationField durationField22 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField13, and durationField14", !(durationField22.compareTo(durationField13) == 0) || (Math.signum(durationField22.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology12.eras();
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
        org.joda.time.DateTimeField dateTimeField31 = chronology30.year();
        org.joda.time.DurationField durationField32 = chronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minus(readablePeriod37);
        boolean boolean39 = dateTimeZone33.isLocalDateTimeGap(localDateTime38);
        org.joda.time.Chronology chronology40 = chronology30.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField41 = chronology30.dayOfMonth();
        org.joda.time.DurationField durationField42 = dateTimeField41.getDurationField();
        int int43 = durationField17.compareTo(durationField42);
        long long46 = durationField42.subtract(5183946000000L, 1914);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField17", Math.signum(durationField13.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField13)));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        java.lang.String str15 = chronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        int int37 = localDateTime35.getYearOfEra();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        int int39 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.yearOfEra();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.yearOfEra();
        int int55 = property54.getMaximumValueOverall();
        int int56 = property54.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime57 = property54.roundHalfFloorCopy();
        int int58 = property45.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.minus(readablePeriod61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plus(readablePeriod63);
        boolean boolean65 = localDateTime35.equals((java.lang.Object) localDateTime64);
        int[] intArray67 = chronology23.get((org.joda.time.ReadablePartial) localDateTime35, 1104537600009L);
        org.joda.time.DurationField durationField68 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField69 = chronology23.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField68", (durationField15.compareTo(durationField68) == 0) == durationField15.equals(durationField68));
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
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.lang.String str30 = nameProvider20.getShortName(locale21, "", "hi!");
        java.lang.String str31 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 10, locale21);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime16.withMillisOfSecond(10);
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        java.lang.String str43 = locale35.getDisplayScript(locale39);
        java.lang.String str44 = locale35.getDisplayCountry();
        java.lang.String str45 = localDateTime16.toString("-1", locale35);
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
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        org.joda.time.DurationField durationField60 = chronology58.years();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        boolean boolean67 = dateTimeZone61.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology68 = chronology58.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime69 = localDateTime16.toDateTime(dateTimeZone61);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.weekOfWeekyear();
        org.joda.time.DurationField durationField72 = chronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField72", (durationField60.compareTo(durationField72) == 0) == durationField60.equals(durationField72));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        java.lang.String str15 = chronology12.toString();
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        int int37 = localDateTime35.getYearOfEra();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        int int39 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.yearOfEra();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.yearOfEra();
        int int55 = property54.getMaximumValueOverall();
        int int56 = property54.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime57 = property54.roundHalfFloorCopy();
        int int58 = property45.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.minus(readablePeriod61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plus(readablePeriod63);
        boolean boolean65 = localDateTime35.equals((java.lang.Object) localDateTime64);
        int[] intArray67 = chronology23.get((org.joda.time.ReadablePartial) localDateTime35, 1104537600009L);
        org.joda.time.DurationField durationField68 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField69 = chronology23.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField68", (durationField15.compareTo(durationField68) == 0) == durationField15.equals(durationField68));
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
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        org.joda.time.DurationField durationField26 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField26", Math.signum(durationField14.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField14)));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        int int23 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = property24.setCopy(1);
        org.joda.time.DateTimeField dateTimeField27 = property24.getField();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.yearOfEra();
        int int34 = property33.getMaximumValueOverall();
        int int35 = property33.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readablePeriod40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.yearOfEra();
        int int43 = property42.getMaximumValueOverall();
        int int44 = property42.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime45 = property42.roundHalfFloorCopy();
        int int46 = property33.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime45);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withYearOfCentury((int) ' ');
        int int50 = localDateTime49.size();
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime();
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        java.lang.String str53 = instant52.toString();
        long long54 = instant52.getMillis();
        int int55 = property24.compareTo((org.joda.time.ReadableInstant) instant52);
        long long56 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) instant52);
        org.joda.time.LocalDateTime localDateTime57 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime58 = property17.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant52", (dateTime51.compareTo(instant52) == 0) == dateTime51.equals(instant52));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) '#');
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property8.getField();
        org.joda.time.LocalDateTime localDateTime13 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        int int22 = localDateTime21.getWeekyear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withDayOfYear((int) ' ');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfCentury();
        java.lang.String str28 = property27.getAsText();
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
        org.joda.time.DurationField durationField43 = chronology42.hours();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) '#', chronology42);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusMonths((int) (short) 10);
        int int47 = localDateTime44.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minus(readablePeriod51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime50.yearOfEra();
        int int54 = property53.getMaximumValueOverall();
        int int55 = property53.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime56 = property53.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minus(readablePeriod60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime59.yearOfEra();
        int int63 = property62.getMaximumValueOverall();
        int int64 = property62.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime65 = property62.roundHalfFloorCopy();
        int int66 = property53.compareTo((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime65);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withYearOfCentury((int) ' ');
        int int70 = localDateTime69.size();
        org.joda.time.DateTime dateTime71 = localDateTime69.toDateTime();
        org.joda.time.Instant instant72 = dateTime71.toInstant();
        org.joda.time.DateTime dateTime73 = localDateTime44.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        long long74 = dateTime73.getMillis();
        int int75 = property27.getDifference((org.joda.time.ReadableInstant) dateTime73);
        long long76 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology77 = dateTime73.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime71 and instant72", (dateTime71.compareTo(instant72) == 0) == dateTime71.equals(instant72));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        int int19 = localDateTime17.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.minusHours(0);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.plus(readableDuration23);
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.hours();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) '#', chronology38);
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
        org.joda.time.DurationField durationField55 = chronology54.hours();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) '#', chronology54);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusMonths((int) (short) 10);
        boolean boolean59 = localDateTime40.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.DateTime dateTime60 = localDateTime56.toDateTime();
        long long61 = dateTime60.getMillis();
        org.joda.time.Instant instant62 = dateTime60.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean64 = dateTime60.isSupported(dateTimeFieldType63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime17.withField(dateTimeFieldType63, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant62", (dateTime60.compareTo(instant62) == 0) == dateTime60.equals(instant62));
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
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = chronology12.withZone(dateTimeZone15);
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
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plus(readableDuration39);
        org.joda.time.DateTimeField dateTimeField42 = localDateTime38.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMonthOfYear(4);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minus(readablePeriod49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.yearOfEra();
        int int52 = property51.getMaximumValueOverall();
        int int53 = property51.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime54 = property51.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        int int61 = property60.getMaximumValueOverall();
        int int62 = property60.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundHalfFloorCopy();
        int int64 = property51.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = localDateTime66.getFields();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withWeekyear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.dayOfYear();
        int int73 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        int[] intArray75 = chronology22.get((org.joda.time.ReadablePartial) localDateTime44, (long) 31);
        org.joda.time.DateTimeField dateTimeField76 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField77 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField78 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField79 = chronology22.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField78", (durationField14.compareTo(durationField78) == 0) == durationField14.equals(durationField78));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        int int37 = localDateTime35.getYearOfEra();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        int int39 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.yearOfEra();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.yearOfEra();
        int int55 = property54.getMaximumValueOverall();
        int int56 = property54.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime57 = property54.roundHalfFloorCopy();
        int int58 = property45.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.minus(readablePeriod61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plus(readablePeriod63);
        boolean boolean65 = localDateTime35.equals((java.lang.Object) localDateTime64);
        int[] intArray67 = chronology23.get((org.joda.time.ReadablePartial) localDateTime35, 1104537600009L);
        org.joda.time.DurationField durationField68 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField69 = chronology23.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField68", (durationField15.compareTo(durationField68) == 0) == durationField15.equals(durationField68));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        java.lang.String str1 = durationFieldType0.toString();
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minus(readablePeriod28);
        int int30 = localDateTime29.getYearOfCentury();
        java.util.Date date31 = localDateTime29.toDate();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology36 = chronology14.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField37 = chronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField39 = durationFieldType0.getField(chronology14);
        org.joda.time.DurationField durationField40 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField16, and durationField39", !(durationField40.compareTo(durationField16) == 0) || (Math.signum(durationField40.compareTo(durationField39)) == Math.signum(durationField16.compareTo(durationField39))));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.joda.time.DateTimeField dateTimeField51 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField52 = chronology14.weekyears();
        org.joda.time.DurationField durationField53 = chronology14.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField52", (durationField30.compareTo(durationField52) == 0) == durationField30.equals(durationField52));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        int int19 = localDateTime17.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
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
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '#', chronology48);
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
        org.joda.time.DurationField durationField65 = chronology64.hours();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) '#', chronology64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusMonths((int) (short) 10);
        boolean boolean69 = localDateTime50.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.DateTime dateTime70 = localDateTime66.toDateTime();
        long long71 = dateTime70.getMillis();
        org.joda.time.Instant instant72 = dateTime70.toInstant();
        int int73 = property29.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.LocalDateTime localDateTime75 = property29.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property29.getFieldType();
        org.joda.time.DurationFieldType durationFieldType77 = dateTimeFieldType76.getRangeDurationType();
        boolean boolean78 = property22.equals((java.lang.Object) dateTimeFieldType76);
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType76.getRangeDurationType();
        org.joda.time.Chronology chronology81 = null;
        java.util.Locale locale82 = java.util.Locale.GERMAN;
        java.util.Locale locale83 = null;
        java.lang.String str84 = locale82.getDisplayVariant(locale83);
        java.util.Locale locale85 = java.util.Locale.GERMAN;
        java.util.Locale locale86 = null;
        java.lang.String str87 = locale85.getDisplayVariant(locale86);
        java.lang.String str88 = locale82.getDisplayCountry(locale85);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology81, locale82, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology92 = dateTimeParserBucket91.getChronology();
        org.joda.time.DurationField durationField93 = chronology92.eras();
        boolean boolean94 = durationFieldType79.isSupported(chronology92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField49 and durationField93", Math.signum(durationField49.compareTo(durationField93)) == -Math.signum(durationField93.compareTo(durationField49)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayVariant(locale41);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = null;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.lang.String str46 = locale40.getDisplayCountry(locale43);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology39, locale40, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket49.getChronology();
        java.util.Locale locale51 = dateTimeParserBucket49.getLocale();
        boolean boolean53 = dateTimeParserBucket49.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.era();
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
        org.joda.time.DurationField durationField69 = chronology68.years();
        org.joda.time.DateTimeField dateTimeField70 = chronology68.hourOfHalfday();
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.util.Locale locale72 = null;
        java.lang.String str73 = locale71.getDisplayVariant(locale72);
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.util.Locale locale75 = null;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.lang.String str77 = locale71.getDisplayCountry(locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology68, locale71, (java.lang.Integer) 2, 70);
        boolean boolean81 = dateTimeFieldType54.isSupported(chronology68);
        dateTimeParserBucket49.saveField(dateTimeFieldType54, (-292275054));
        int int84 = dateTime35.get(dateTimeFieldType54);
        org.joda.time.Chronology chronology85 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant37", (dateTime35.compareTo(instant37) == 0) == dateTime35.equals(instant37));
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
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime20.getFields();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        int int36 = localDateTime35.getYearOfCentury();
        java.util.Date date37 = localDateTime35.toDate();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.withField(dateTimeFieldType42, 1);
        java.lang.String str45 = dateTimeFieldType42.getName();
        org.joda.time.LocalDateTime.Property property46 = localDateTime23.property(dateTimeFieldType42);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.lang.String str57 = locale51.getDisplayCountry(locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology50, locale51, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.millis();
        org.joda.time.tz.NameProvider nameProvider63 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.lang.String str67 = nameProvider63.getName(locale64, "1", "Ora media di Greenwich");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((-62167219199948L), chronology61, locale64, (java.lang.Integer) 28, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField71 = chronology61.era();
        org.joda.time.DurationField durationField72 = chronology61.eras();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType47.getField(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField62 and durationField72", Math.signum(durationField62.compareTo(durationField72)) == -Math.signum(durationField72.compareTo(durationField62)));
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
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        java.lang.String str19 = chronology18.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        long long24 = chronology18.add((long) 'a', 10L, (int) (short) 0);
        org.joda.time.DurationField durationField25 = chronology18.hours();
        org.joda.time.Chronology chronology26 = chronology18.withUTC();
        org.joda.time.DurationField durationField27 = chronology26.minutes();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField25, and durationField27", !(durationField29.compareTo(durationField25) == 0) || (Math.signum(durationField29.compareTo(durationField27)) == Math.signum(durationField25.compareTo(durationField27))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology12.add(readablePeriod17, 41848L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField20", (durationField13.compareTo(durationField20) == 0) == durationField13.equals(durationField20));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime20.getFields();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minus(readablePeriod25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        int int32 = property31.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime34 = property31.addToCopy((int) (byte) 0);
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
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '#', chronology48);
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
        org.joda.time.DurationField durationField65 = chronology64.hours();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) '#', chronology64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusMonths((int) (short) 10);
        boolean boolean69 = localDateTime50.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.DateTime dateTime70 = localDateTime66.toDateTime();
        long long71 = dateTime70.getMillis();
        org.joda.time.DateTime dateTime72 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        int int73 = property27.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTimeZone dateTimeZone74 = dateTime72.getZone();
        org.joda.time.Instant instant75 = dateTime72.toInstant();
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime72.getZone();
        org.joda.time.DateTime dateTime77 = localDateTime20.toDateTime(dateTimeZone76);
        java.util.TimeZone timeZone78 = dateTimeZone76.toTimeZone();
        java.lang.String str79 = timeZone78.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime72 and instant75", (dateTime72.compareTo(instant75) == 0) == dateTime72.equals(instant75));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        java.lang.String str28 = chronology23.toString();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology23.weekyears();
        org.joda.time.DurationField durationField31 = chronology23.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField30", (durationField15.compareTo(durationField30) == 0) == durationField15.equals(durationField30));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.lang.String str30 = nameProvider20.getShortName(locale21, "", "hi!");
        java.lang.String str31 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 10, locale21);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime16.withMillisOfSecond(10);
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        java.lang.String str43 = locale35.getDisplayScript(locale39);
        java.lang.String str44 = locale35.getDisplayCountry();
        java.lang.String str45 = localDateTime16.toString("-1", locale35);
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
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        org.joda.time.DurationField durationField60 = chronology58.years();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        boolean boolean67 = dateTimeZone61.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology68 = chronology58.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime69 = localDateTime16.toDateTime(dateTimeZone61);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.weekOfWeekyear();
        org.joda.time.DurationField durationField72 = chronology70.weekyears();
        org.joda.time.DurationField durationField73 = chronology70.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField72", (durationField60.compareTo(durationField72) == 0) == durationField60.equals(durationField72));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        org.joda.time.DurationField durationField64 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField66 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField67 = chronology17.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField66", Math.signum(durationField43.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField43)));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.String[] strArray9 = new java.lang.String[] { "cinese (Cina)", "dayOfMonth", "100", "Property[yearOfEra]", "-1", "hi!", "weekyears", "Italia", "+00:00" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        boolean boolean12 = strSet10.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray29 = new java.lang.String[] { "UTC", "1970", "Deutsch", "UTC", "UTC", "10", "10", "+00:00", "10", "UTC" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray45 = new java.lang.String[] { "UTC", "UTC", "+00:00", "DurationField[years]", "+00:00", "Italia", "UTC", "Italien", "Italia", "+00:00", "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.add("Italien");
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet46);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Iterator<java.lang.String> strItor52 = strSet46.iterator();
        java.lang.Object[] objArray53 = strSet46.toArray();
        boolean boolean54 = strSet10.removeAll((java.util.Collection<java.lang.String>) strSet46);
        boolean boolean55 = strSet46.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minus(readablePeriod59);
        int int61 = localDateTime60.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusSeconds(1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime63.withTime(4, (int) (short) 1, (int) (byte) 1, 59);
        org.joda.time.DateTime dateTime69 = localDateTime63.toDateTime();
        boolean boolean70 = strSet46.remove((java.lang.Object) localDateTime63);
        org.joda.time.Chronology chronology72 = null;
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = null;
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        java.util.Locale locale76 = java.util.Locale.GERMAN;
        java.util.Locale locale77 = null;
        java.lang.String str78 = locale76.getDisplayVariant(locale77);
        java.lang.String str79 = locale73.getDisplayCountry(locale76);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology72, locale73, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology83 = dateTimeParserBucket82.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.year();
        org.joda.time.DurationField durationField85 = chronology83.years();
        org.joda.time.DateTimeField dateTimeField86 = chronology83.yearOfCentury();
        long long90 = chronology83.add((-1920001L), 117L, (int) '#');
        org.joda.time.DateTimeField dateTimeField91 = chronology83.monthOfYear();
        org.joda.time.DateTimeField dateTimeField92 = chronology83.dayOfWeek();
        org.joda.time.DurationField durationField93 = chronology83.minutes();
        boolean boolean94 = strSet46.equals((java.lang.Object) chronology83);
        org.joda.time.DateTimeField dateTimeField95 = chronology83.weekyear();
        org.joda.time.DurationField durationField96 = chronology83.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField96, durationField85, and durationField93", !(durationField96.compareTo(durationField85) == 0) || (Math.signum(durationField96.compareTo(durationField93)) == Math.signum(durationField85.compareTo(durationField93))));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        long long24 = chronology18.add((long) 'a', 10L, (int) (short) 0);
        org.joda.time.DurationField durationField25 = chronology18.hours();
        org.joda.time.Chronology chronology26 = chronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.hourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology26.days();
        org.joda.time.DurationField durationField31 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField25, and durationField30", !(durationField31.compareTo(durationField25) == 0) || (Math.signum(durationField31.compareTo(durationField30)) == Math.signum(durationField25.compareTo(durationField30))));
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
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.clockhourOfDay();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField28", Math.signum(durationField24.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField24)));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.joda.time.DurationField durationField18 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField20 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology13.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField20", (durationField14.compareTo(durationField20) == 0) == durationField14.equals(durationField20));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        int int18 = localDateTime17.getYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.weekOfWeekyear();
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        org.joda.time.DurationField durationField22 = chronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.centuryOfEra();
        int int26 = dateTimeField23.getDifference(62230291200003L, 119916460800000L);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.yearOfEra();
        int int33 = property32.getMaximumValueOverall();
        int int34 = property32.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime35 = property32.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minus(readablePeriod39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.yearOfEra();
        int int42 = property41.getMaximumValueOverall();
        int int43 = property41.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime44 = property41.roundHalfFloorCopy();
        int int45 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        java.lang.String str46 = localDateTime44.toString();
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.dayOfYear();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekyear();
        java.lang.String str49 = property48.getAsText();
        org.joda.time.LocalDateTime localDateTime50 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withDayOfWeek(5);
        int int53 = localDateTime52.size();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale57.getDisplayCountry(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.years();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.year();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.secondOfDay();
        int int73 = dateTimeField71.getMinimumValue(31556952000L);
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.util.Locale locale78 = null;
        java.lang.String str79 = locale77.getDisplayVariant(locale78);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.util.Locale locale81 = null;
        java.lang.String str82 = locale80.getDisplayVariant(locale81);
        java.lang.String str83 = locale77.getDisplayCountry(locale80);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology76, locale77, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology87 = dateTimeParserBucket86.getChronology();
        java.util.Locale locale88 = dateTimeParserBucket86.getLocale();
        java.lang.String str89 = locale88.toLanguageTag();
        java.lang.String str90 = locale88.getDisplayVariant();
        java.lang.String str91 = dateTimeField71.getAsShortText((-20), locale88);
        java.lang.String str92 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime52, (-1985), locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField68", (durationField22.compareTo(durationField68) == 0) == durationField22.equals(durationField68));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.lang.String str28 = chronology23.toString();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology23.weekyears();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField30", (durationField15.compareTo(durationField30) == 0) == durationField15.equals(durationField30));
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
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfEra();
        int int22 = property21.getMaximumValueOverall();
        int int23 = property21.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYear((int) ' ');
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plus(readableDuration29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plus(readableDuration31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minus(readablePeriod33);
        int[] intArray36 = chronology12.get((org.joda.time.ReadablePartial) localDateTime32, (-1920001L));
        long long40 = chronology12.add((-251880000L), (long) '#', (int) (short) 10);
        org.joda.time.DurationField durationField41 = chronology12.millis();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.lang.String str51 = locale45.getDisplayCountry(locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology55 = dateTimeParserBucket54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.hours();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) '#', chronology55);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusMonths((int) (short) 10);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfEra();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        boolean boolean63 = durationField62.isPrecise();
        int int64 = durationField41.compareTo(durationField62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField15, and durationField56", !(durationField62.compareTo(durationField15) == 0) || (Math.signum(durationField62.compareTo(durationField56)) == Math.signum(durationField15.compareTo(durationField56))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getDurationType();
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
        boolean boolean17 = durationFieldType2.isSupported(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.millis();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField21 = chronology15.dayOfWeek();
        org.joda.time.DurationField durationField22 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField16, and durationField18", !(durationField22.compareTo(durationField16) == 0) || (Math.signum(durationField22.compareTo(durationField18)) == Math.signum(durationField16.compareTo(durationField18))));
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
        java.util.Locale locale13 = dateTimeParserBucket11.getLocale();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.eras();
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
        long long37 = durationField35.getMillis((int) (short) 10);
        java.lang.String str38 = durationField35.toString();
        boolean boolean39 = durationField35.isSupported();
        long long42 = durationField35.add(32L, 9L);
        long long44 = durationField35.getMillis((int) (byte) 100);
        int int45 = durationField20.compareTo(durationField35);
        long long47 = durationField35.getMillis((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField35, and durationField20", !(durationField20.compareTo(durationField35) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField35.compareTo(durationField20))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        org.joda.time.DateTimeField dateTimeField64 = chronology63.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = chronology63.add(readablePeriod65, (long) 70, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField69 = chronology63.dayOfWeek();
        org.joda.time.DurationField durationField70 = chronology63.weekyears();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology63.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField43 and durationField70", (durationField43.compareTo(durationField70) == 0) == durationField43.equals(durationField70));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfCentury((int) ' ');
        int int22 = localDateTime21.size();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
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
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '#', chronology48);
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
        org.joda.time.DurationField durationField65 = chronology64.hours();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) '#', chronology64);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusMonths((int) (short) 10);
        boolean boolean69 = localDateTime50.isBefore((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.DateTime dateTime70 = localDateTime66.toDateTime();
        long long71 = dateTime70.getMillis();
        org.joda.time.Instant instant72 = dateTime70.toInstant();
        int int73 = property29.getDifference((org.joda.time.ReadableInstant) dateTime70);
        boolean boolean74 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Chronology chronology75 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime70 and instant72", (dateTime70.compareTo(instant72) == 0) == dateTime70.equals(instant72));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        int int11 = localDateTime10.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        java.lang.String str14 = durationFieldType13.toString();
        java.lang.String str15 = durationFieldType13.getName();
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
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        org.joda.time.DurationField durationField30 = chronology28.years();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        boolean boolean37 = dateTimeZone31.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology38 = chronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.hourOfDay();
        org.joda.time.DurationField durationField41 = durationFieldType13.getField(chronology38);
        boolean boolean42 = localDateTime10.isSupported(durationFieldType13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField41", (durationField30.compareTo(durationField41) == 0) == durationField30.equals(durationField41));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plus(readableDuration39);
        org.joda.time.DateTimeField dateTimeField42 = localDateTime38.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMonthOfYear(4);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minus(readablePeriod49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.yearOfEra();
        int int52 = property51.getMaximumValueOverall();
        int int53 = property51.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime54 = property51.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        int int61 = property60.getMaximumValueOverall();
        int int62 = property60.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundHalfFloorCopy();
        int int64 = property51.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = localDateTime66.getFields();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withWeekyear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.dayOfYear();
        int int73 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        int[] intArray75 = chronology22.get((org.joda.time.ReadablePartial) localDateTime44, (long) 31);
        org.joda.time.DateTimeField dateTimeField76 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField77 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField78 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField79 = chronology22.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField78", (durationField14.compareTo(durationField78) == 0) == durationField14.equals(durationField78));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        int int31 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        boolean boolean33 = localDateTime30.equals((java.lang.Object) 'u');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.minusMonths(31);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minus(readablePeriod39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.yearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        int int43 = localDateTime42.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property44 = localDateTime42.yearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = property44.setCopy((int) '#');
        org.joda.time.DurationField durationField47 = property44.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField48 = property44.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = dateTimeField48.getType();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        java.lang.String str51 = dateTimeFieldType49.toString();
        int int52 = localDateTime30.indexOf(dateTimeFieldType49);
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
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(chronology66);
        long long74 = chronology66.add((-31536000000L), (-115246022400000L), (int) 'x');
        org.joda.time.DurationField durationField75 = chronology66.eras();
        boolean boolean76 = dateTimeFieldType49.isSupported(chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField67 and durationField75", Math.signum(durationField67.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField67)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.era();
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
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale18.getDisplayCountry(locale21);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology15, locale18, (java.lang.Integer) 2, 70);
        boolean boolean28 = dateTimeFieldType1.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField29 = chronology15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 3287, chronology15);
        org.joda.time.DateTimeField dateTimeField31 = chronology15.millisOfSecond();
        org.joda.time.DurationField durationField32 = chronology15.months();
        org.joda.time.DateTimeField dateTimeField33 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology15.weekyears();
        org.joda.time.DurationField durationField36 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField35", (durationField16.compareTo(durationField35) == 0) == durationField16.equals(durationField35));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(1970);
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
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        boolean boolean32 = dateTimeZone26.isLocalDateTimeGap(localDateTime31);
        org.joda.time.Chronology chronology33 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology33);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DurationField durationField39 = chronology33.weekyears();
        org.joda.time.DurationField durationField40 = chronology33.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField39", (durationField25.compareTo(durationField39) == 0) == durationField25.equals(durationField39));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        int int21 = dateTimeZone19.getOffset((long) (short) 0);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.lang.String str24 = dateTimeZone19.getName((long) (short) 1, locale23);
        boolean boolean26 = dateTimeZone19.isStandardOffset(32L);
        org.joda.time.Chronology chronology27 = chronology18.withZone(dateTimeZone19);
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
        org.joda.time.DurationField durationField42 = chronology41.hours();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) '#', chronology41);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusMonths((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minus(readableDuration46);
        long long49 = chronology18.set((org.joda.time.ReadablePartial) localDateTime45, (long) 1979);
        org.joda.time.DurationField durationField50 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField51 = chronology18.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField42 and durationField50", Math.signum(durationField42.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField42)));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        java.lang.String str18 = chronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField17", Math.signum(durationField13.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField13)));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale57.getDisplayCountry(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.hours();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) '#', chronology67);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plusMonths((int) (short) 10);
        boolean boolean72 = localDateTime53.isBefore((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.DateTime dateTime73 = localDateTime69.toDateTime();
        long long74 = dateTime73.getMillis();
        org.joda.time.Instant instant75 = dateTime73.toInstant();
        boolean boolean76 = dateTime35.isAfter((org.joda.time.ReadableInstant) instant75);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone78);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.minus(readablePeriod80);
        int int82 = localDateTime81.getYearOfCentury();
        java.util.Date date83 = localDateTime81.toDate();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone86 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime87 = localDateTime85.toDateTime(dateTimeZone86);
        org.joda.time.Instant instant88 = dateTime87.toInstant();
        boolean boolean89 = instant75.isBefore((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Chronology chronology90 = instant75.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.seconds();
        org.joda.time.DateTimeField dateTimeField92 = chronology90.millisOfDay();
        org.joda.time.DurationField durationField93 = chronology90.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant37", (dateTime35.compareTo(instant37) == 0) == dateTime35.equals(instant37));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField20", Math.signum(durationField14.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField14)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField18 = chronology12.weeks();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField13, and durationField18", !(durationField19.compareTo(durationField13) == 0) || (Math.signum(durationField19.compareTo(durationField18)) == Math.signum(durationField13.compareTo(durationField18))));
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
        org.joda.time.DateTimeField dateTimeField24 = chronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology22.days();
        org.joda.time.DurationField durationField26 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField14, and durationField25", !(durationField26.compareTo(durationField14) == 0) || (Math.signum(durationField26.compareTo(durationField25)) == Math.signum(durationField14.compareTo(durationField25))));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        int int19 = dateTimeZone17.getOffset((long) (short) 0);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.lang.String str22 = dateTimeZone17.getName((long) (short) 1, locale21);
        long long25 = dateTimeZone17.convertLocalToUTC(2208988800120L, true);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone17);
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
        java.util.Locale locale40 = dateTimeParserBucket38.getLocale();
        boolean boolean42 = dateTimeParserBucket38.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology43 = dateTimeParserBucket38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeParserBucket38.getZone();
        org.joda.time.Chronology chronology45 = dateTimeParserBucket38.getChronology();
        java.lang.String str46 = chronology45.toString();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.millisOfDay();
        long long51 = chronology45.add((long) 'a', 10L, (int) (short) 0);
        org.joda.time.DurationField durationField52 = chronology45.hours();
        org.joda.time.DateTimeField dateTimeField53 = chronology45.dayOfWeek();
        org.joda.time.DurationField durationField54 = chronology45.weekyears();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plus(readableDuration58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfDay();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.dayOfYear();
        int[] intArray63 = chronology45.get((org.joda.time.ReadablePartial) localDateTime59, 112477409805600000L);
        int int64 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) localDateTime26, intArray63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField54", (durationField13.compareTo(durationField54) == 0) == durationField13.equals(durationField54));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.joda.time.DurationField durationField64 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField66 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField67 = chronology17.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField66", Math.signum(durationField43.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField43)));
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
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DurationField durationField17 = chronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(1970);
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
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        boolean boolean32 = dateTimeZone26.isLocalDateTimeGap(localDateTime31);
        org.joda.time.Chronology chronology33 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology33);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField39 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField40 = chronology33.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology33.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField40", Math.signum(durationField25.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField25)));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.years();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minus(readablePeriod45);
        boolean boolean47 = dateTimeZone41.isLocalDateTimeGap(localDateTime46);
        org.joda.time.Chronology chronology48 = chronology38.withZone(dateTimeZone41);
        boolean boolean49 = dateTimeFieldType25.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.year();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.dayOfWeek();
        org.joda.time.DurationField durationField54 = durationFieldType24.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField55 = chronology48.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField54", Math.signum(durationField40.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField40)));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfEra();
        int int16 = property15.getMaximumValueOverall();
        int int17 = property15.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime18 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = property24.getMaximumValueOverall();
        int int26 = property24.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfFloorCopy();
        int int28 = property15.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray31 = localDateTime30.getFields();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean35 = localDateTime30.isSupported(dateTimeFieldType34);
        boolean boolean36 = dateTime9.isSupported(dateTimeFieldType34);
        org.joda.time.Instant instant37 = dateTime9.toInstant();
        org.joda.time.Instant instant38 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minus(readablePeriod42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime41.yearOfEra();
        int int45 = property44.getMaximumValueOverall();
        int int46 = property44.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime47 = property44.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = localDateTime47.getFieldTypes();
        org.joda.time.DateTime dateTime49 = localDateTime47.toDateTime();
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minus(readablePeriod54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime53.yearOfEra();
        int int57 = property56.getMaximumValueOverall();
        int int58 = property56.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime59 = property56.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minus(readablePeriod67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime66.yearOfEra();
        org.joda.time.LocalDateTime localDateTime70 = property69.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property69.getFieldType();
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.GERMAN;
        java.util.Locale locale75 = null;
        java.lang.String str76 = locale74.getDisplayVariant(locale75);
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.util.Locale locale78 = null;
        java.lang.String str79 = locale77.getDisplayVariant(locale78);
        java.lang.String str80 = locale74.getDisplayCountry(locale77);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket83 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology73, locale74, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology84 = dateTimeParserBucket83.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.millisOfDay();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField87 = dateTimeFieldType71.getField(chronology84);
        int int88 = localDateTime63.get(dateTimeFieldType71);
        org.joda.time.DurationFieldType durationFieldType89 = dateTimeFieldType71.getDurationType();
        int int90 = dateTime49.get(dateTimeFieldType71);
        boolean boolean91 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone92 = dateTime49.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant37", (dateTime9.compareTo(instant37) == 0) == dateTime9.equals(instant37));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.joda.time.DateTimeField dateTimeField51 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField52 = chronology14.weeks();
        org.joda.time.DateTimeField dateTimeField53 = chronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField54 = chronology14.weekOfWeekyear();
        org.joda.time.DurationField durationField55 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField30, and durationField52", !(durationField55.compareTo(durationField30) == 0) || (Math.signum(durationField55.compareTo(durationField52)) == Math.signum(durationField30.compareTo(durationField52))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.DurationField durationField17 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 719000, chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        org.joda.time.DurationField durationField30 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = chronology14.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField30", (durationField15.compareTo(durationField30) == 0) == durationField15.equals(durationField30));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        boolean boolean9 = localDateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        java.lang.String str14 = durationFieldType13.toString();
        java.lang.String str15 = durationFieldType13.getName();
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
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        org.joda.time.DurationField durationField30 = chronology28.years();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        boolean boolean37 = dateTimeZone31.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology38 = chronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.hourOfDay();
        org.joda.time.DurationField durationField41 = durationFieldType13.getField(chronology38);
        boolean boolean42 = localDateTime11.isSupported(durationFieldType13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField41", (durationField30.compareTo(durationField41) == 0) == durationField30.equals(durationField41));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Object obj0 = null;
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
        int int19 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        java.lang.String str23 = durationFieldType22.toString();
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
        java.util.Locale locale37 = dateTimeParserBucket35.getLocale();
        boolean boolean39 = dateTimeParserBucket35.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology40 = dateTimeParserBucket35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket35.getZone();
        org.joda.time.Chronology chronology42 = dateTimeParserBucket35.getChronology();
        java.lang.String str43 = chronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.millisOfDay();
        long long48 = chronology42.add((long) 'a', 10L, (int) (short) 0);
        boolean boolean49 = durationFieldType22.isSupported(chronology42);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime16.withFieldAdded(durationFieldType22, 9);
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
        org.joda.time.DurationField durationField65 = chronology64.years();
        org.joda.time.DurationField durationField66 = chronology64.minutes();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField68 = chronology64.clockhourOfHalfday();
        boolean boolean69 = durationFieldType22.isSupported(chronology64);
        org.joda.time.DateTimeField dateTimeField70 = chronology64.hourOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology64.weekOfWeekyear();
        org.joda.time.DurationField durationField72 = chronology64.years();
        org.joda.time.DurationField durationField73 = chronology64.weekyears();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(obj0, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField65 and durationField73", (durationField65.compareTo(durationField73) == 0) == durationField65.equals(durationField73));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        dateTimeParserBucket11.setPivotYear((java.lang.Integer) 31);
        dateTimeParserBucket11.setOffset((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyear();
        dateTimeParserBucket11.saveField(dateTimeFieldType20, 70);
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType20.getDurationType();
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
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        java.lang.String str40 = chronology36.toString();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField43 = chronology36.weekyear();
        org.joda.time.DurationField durationField44 = durationFieldType23.getField(chronology36);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.weeks();
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
        org.joda.time.DurationField durationField60 = chronology59.years();
        org.joda.time.DurationField durationField61 = chronology59.minutes();
        boolean boolean62 = durationFieldType46.isSupported(chronology59);
        org.joda.time.DateTimeField dateTimeField63 = chronology59.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime67 = property65.addToCopy((long) 10);
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minusHours(292275054);
        boolean boolean71 = localDateTime45.isAfter((org.joda.time.ReadablePartial) localDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField60", (durationField44.compareTo(durationField60) == 0) == durationField44.equals(durationField60));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology22.add(readablePeriod25, (long) 2, 31);
        org.joda.time.DurationField durationField29 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField30 = chronology22.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField29", Math.signum(durationField14.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField14)));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey((long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withDayOfWeek(2);
        int int32 = localDateTime26.getYear();
        boolean boolean33 = dateTimeZone21.isLocalDateTimeGap(localDateTime26);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.yearOfEra();
        int int41 = property40.getMaximumValueOverall();
        int int42 = property40.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfFloorCopy();
        int int44 = property40.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime45 = property40.roundCeilingCopy();
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
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = java.util.Locale.GERMAN;
        java.util.Locale locale66 = null;
        java.lang.String str67 = locale65.getDisplayVariant(locale66);
        java.util.Locale locale68 = java.util.Locale.GERMAN;
        java.util.Locale locale69 = null;
        java.lang.String str70 = locale68.getDisplayVariant(locale69);
        java.lang.String str71 = locale65.getDisplayCountry(locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology64, locale65, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology75 = dateTimeParserBucket74.getChronology();
        org.joda.time.DurationField durationField76 = chronology75.hours();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) '#', chronology75);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.plusMonths((int) (short) 10);
        boolean boolean80 = localDateTime61.isBefore((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.DateTime dateTime81 = localDateTime77.toDateTime();
        long long82 = dateTime81.getMillis();
        org.joda.time.Instant instant83 = dateTime81.toInstant();
        int int84 = property40.getDifference((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.LocalDateTime localDateTime86 = property40.addWrapFieldToCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property40.getFieldType();
        org.joda.time.LocalDateTime localDateTime89 = localDateTime34.withField(dateTimeFieldType87, 60);
        boolean boolean90 = localDateTime19.isSupported(dateTimeFieldType87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime81 and instant83", (dateTime81.compareTo(instant83) == 0) == dateTime81.equals(instant83));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3287);
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
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        int int20 = localDateTime19.getYear();
        int int21 = localDateTime19.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.year();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-52));
        int int25 = localDateTime24.getWeekyear();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime24);
        boolean boolean28 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str31 = dateTimeZone29.getNameKey((long) 10);
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
        org.joda.time.DurationField durationField46 = chronology44.years();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minus(readablePeriod51);
        boolean boolean53 = dateTimeZone47.isLocalDateTimeGap(localDateTime52);
        org.joda.time.Chronology chronology54 = chronology44.withZone(dateTimeZone47);
        long long56 = dateTimeZone29.getMillisKeepLocal(dateTimeZone47, (long) (short) 0);
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.util.Locale locale64 = null;
        java.lang.String str65 = locale63.getDisplayVariant(locale64);
        java.lang.String str66 = locale60.getDisplayCountry(locale63);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology70 = dateTimeParserBucket69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.hours();
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) '#', chronology70);
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
        org.joda.time.DurationField durationField87 = chronology86.hours();
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime((long) '#', chronology86);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plusMonths((int) (short) 10);
        boolean boolean91 = localDateTime72.isBefore((org.joda.time.ReadablePartial) localDateTime88);
        org.joda.time.DateTime dateTime92 = localDateTime88.toDateTime();
        long long93 = dateTime92.getMillis();
        org.joda.time.Instant instant94 = dateTime92.toInstant();
        int int95 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) instant94);
        long long97 = dateTimeZone29.convertUTCToLocal(0L);
        long long99 = dateTimeZone1.getMillisKeepLocal(dateTimeZone29, 79200012L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime92 and instant94", (dateTime92.compareTo(instant94) == 0) == dateTime92.equals(instant94));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) '#');
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        int int12 = property8.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property8.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.yearOfEra();
        int int20 = property19.getMaximumValueOverall();
        int int21 = property19.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime22 = property19.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.yearOfEra();
        int int29 = property28.getMaximumValueOverall();
        int int30 = property28.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime31 = property28.roundHalfFloorCopy();
        int int32 = property19.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime31);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withYearOfCentury((int) ' ');
        int int36 = localDateTime35.size();
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minus(readablePeriod41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.yearOfEra();
        int int44 = property43.getMaximumValueOverall();
        int int45 = property43.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundHalfFloorCopy();
        int int47 = property43.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime48 = property43.roundCeilingCopy();
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
        org.joda.time.DurationField durationField79 = chronology78.hours();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) '#', chronology78);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusMonths((int) (short) 10);
        boolean boolean83 = localDateTime64.isBefore((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.DateTime dateTime84 = localDateTime80.toDateTime();
        long long85 = dateTime84.getMillis();
        org.joda.time.Instant instant86 = dateTime84.toInstant();
        int int87 = property43.getDifference((org.joda.time.ReadableInstant) dateTime84);
        boolean boolean88 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime dateTime89 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.Instant instant90 = dateTime89.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime84 and instant86", (dateTime84.compareTo(instant86) == 0) == dateTime84.equals(instant86));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        org.joda.time.DurationField durationField52 = chronology14.days();
        org.joda.time.DurationField durationField53 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = chronology14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField53", (durationField30.compareTo(durationField53) == 0) == durationField30.equals(durationField53));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.joda.time.LocalDateTime localDateTime20 = property5.addToCopy((int) (byte) 0);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean41 = localDateTime38.isSupported(dateTimeFieldType40);
        boolean boolean42 = localDateTime20.isSupported(dateTimeFieldType40);
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType40.getRangeDurationType();
        java.lang.String str44 = dateTimeFieldType40.getName();
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
        org.joda.time.DurationField durationField59 = chronology57.years();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType40.getField(chronology57);
        org.joda.time.DurationField durationField61 = chronology57.weekyears();
        org.joda.time.DateTimeField dateTimeField62 = chronology57.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField58 and durationField61", (durationField58.compareTo(durationField61) == 0) == durationField58.equals(durationField61));
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
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology12.add(readablePeriod14, (long) 28, 10);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField20 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField20", Math.signum(durationField13.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField13)));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
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
        java.util.Locale locale19 = dateTimeParserBucket17.getLocale();
        boolean boolean21 = dateTimeParserBucket17.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology22 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfFloorCopy();
        int int33 = property29.getMinimumValue();
        boolean boolean34 = property29.isLeap();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayVariant(locale41);
        java.lang.String str43 = locale37.getDisplayCountry(locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology47 = dateTimeParserBucket46.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.years();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.hourOfHalfday();
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
        java.util.Locale locale63 = dateTimeParserBucket61.getLocale();
        int int64 = dateTimeField49.getMaximumShortTextLength(locale63);
        java.lang.String str65 = property29.getAsText(locale63);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology22, locale63);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.Chronology chronology68 = chronology22.withZone(dateTimeZone67);
        org.joda.time.DurationField durationField69 = chronology22.years();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        int int72 = dateTimeZone70.getOffset((long) (short) 0);
        boolean boolean73 = dateTimeZone70.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone70);
        long long77 = dateTimeZone70.adjustOffset((-441504000001L), true);
        org.joda.time.Chronology chronology78 = chronology22.withZone(dateTimeZone70);
        org.joda.time.DurationField durationField79 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField80 = dateTimeFieldType0.getField(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField48 and durationField79", Math.signum(durationField48.compareTo(durationField79)) == -Math.signum(durationField79.compareTo(durationField48)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.lang.String str15 = chronology12.toString();
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        int int5 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        int int13 = localDateTime12.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDateTime12.isSupported(durationFieldType14);
        int int16 = localDateTime12.getWeekyear();
        boolean boolean17 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        boolean boolean42 = dateTimeFieldType18.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = chronology41.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        boolean boolean54 = dateTimeZone48.isLocalDateTimeGap(localDateTime53);
        int int55 = localDateTime53.getYearOfEra();
        org.joda.time.Chronology chronology56 = localDateTime53.getChronology();
        int int57 = localDateTime53.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readablePeriod61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime60.yearOfEra();
        int int64 = property63.getMaximumValueOverall();
        int int65 = property63.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime66 = property63.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minus(readablePeriod70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.yearOfEra();
        int int73 = property72.getMaximumValueOverall();
        int int74 = property72.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime75 = property72.roundHalfFloorCopy();
        int int76 = property63.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime75.minus(readablePeriod79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plus(readablePeriod81);
        boolean boolean83 = localDateTime53.equals((java.lang.Object) localDateTime82);
        int[] intArray85 = chronology41.get((org.joda.time.ReadablePartial) localDateTime53, 1104537600009L);
        org.joda.time.DurationField durationField86 = chronology41.weekyears();
        boolean boolean87 = localDateTime7.equals((java.lang.Object) durationField86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime7.minusSeconds(199);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField86", (durationField33.compareTo(durationField86) == 0) == durationField33.equals(durationField86));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology13.era();
        org.joda.time.DurationField durationField24 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology13.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField24", Math.signum(durationField14.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField14)));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        java.lang.String str35 = localDateTime15.toString();
        org.joda.time.DateTimeField dateTimeField37 = localDateTime15.getField(0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime15.withPeriodAdded(readablePeriod38, 87658);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.lang.String str51 = locale45.getDisplayCountry(locale48);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology44, locale45, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology55 = dateTimeParserBucket54.getChronology();
        java.util.Locale locale56 = dateTimeParserBucket54.getLocale();
        boolean boolean58 = dateTimeParserBucket54.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology59 = dateTimeParserBucket54.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.hourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.weekyearOfCentury();
        org.joda.time.DurationField durationField63 = durationFieldType42.getField(chronology59);
        boolean boolean64 = localDateTime15.isSupported(durationFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField63", Math.signum(durationField14.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField14)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.DurationField durationField26 = chronology23.eras();
        org.joda.time.DurationField durationField27 = chronology23.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField26", Math.signum(durationField27.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField27)));
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
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = chronology14.eras();
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
        org.joda.time.DurationField durationField45 = chronology43.years();
        int int46 = durationField30.compareTo(durationField45);
        int int48 = durationField45.getValue((-1L));
        long long50 = durationField45.getMillis((long) 9);
        long long53 = durationField45.getDifferenceAsLong(0L, (long) (-1));
        long long56 = durationField45.add((long) '#', 28);
        int int59 = durationField45.getValue((long) (byte) -1, 978307200012L);
        java.lang.String str60 = durationField45.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        org.joda.time.DateTimeField dateTimeField75 = chronology74.year();
        org.joda.time.DurationField durationField76 = chronology74.years();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minus(readablePeriod81);
        boolean boolean83 = dateTimeZone77.isLocalDateTimeGap(localDateTime82);
        org.joda.time.Chronology chronology84 = chronology74.withZone(dateTimeZone77);
        boolean boolean85 = dateTimeFieldType61.isSupported(chronology84);
        org.joda.time.DateTimeField dateTimeField86 = chronology84.dayOfYear();
        org.joda.time.DateTimeField dateTimeField87 = chronology84.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField88 = chronology84.year();
        org.joda.time.DateTimeField dateTimeField89 = chronology84.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone90 = chronology84.getZone();
        org.joda.time.DateTimeZone dateTimeZone91 = chronology84.getZone();
        org.joda.time.DurationField durationField92 = chronology84.hours();
        long long94 = durationField92.getMillis((-2004));
        long long97 = durationField92.subtract(44179776032969L, 12);
        int int98 = durationField45.compareTo(durationField92);
        int int99 = durationField16.compareTo(durationField45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField45, and durationField92", !(durationField16.compareTo(durationField45) == 0) || (Math.signum(durationField16.compareTo(durationField92)) == Math.signum(durationField45.compareTo(durationField92))));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.DurationField durationField27 = chronology23.years();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readablePeriod32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.yearOfEra();
        int int35 = property34.getMaximumValueOverall();
        int int36 = property34.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime37 = property34.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime38 = property34.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minus(readablePeriod42);
        int int44 = localDateTime43.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusSeconds(1);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minus(readablePeriod50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.yearOfEra();
        int int53 = property52.getMaximumValueOverall();
        int int54 = property52.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMonths((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minus(readablePeriod63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime62.yearOfEra();
        org.joda.time.LocalDateTime localDateTime66 = property65.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale70.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.GERMAN;
        java.util.Locale locale74 = null;
        java.lang.String str75 = locale73.getDisplayVariant(locale74);
        java.lang.String str76 = locale70.getDisplayCountry(locale73);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology69, locale70, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology80 = dateTimeParserBucket79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.millisOfDay();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField83 = dateTimeFieldType67.getField(chronology80);
        int int84 = localDateTime59.get(dateTimeFieldType67);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime59.withWeekyear(70);
        int int87 = localDateTime46.compareTo((org.joda.time.ReadablePartial) localDateTime86);
        boolean boolean88 = localDateTime38.isEqual((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.LocalDateTime localDateTime90 = localDateTime38.minus(readablePeriod89);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime38.plusHours(366);
        int[] intArray94 = chronology23.get((org.joda.time.ReadablePartial) localDateTime92, (long) (-8));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField28", Math.signum(durationField15.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField15)));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plus(readableDuration39);
        org.joda.time.DateTimeField dateTimeField42 = localDateTime38.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMonthOfYear(4);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minus(readablePeriod49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.yearOfEra();
        int int52 = property51.getMaximumValueOverall();
        int int53 = property51.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime54 = property51.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        int int61 = property60.getMaximumValueOverall();
        int int62 = property60.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundHalfFloorCopy();
        int int64 = property51.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = localDateTime66.getFields();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withWeekyear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.dayOfYear();
        int int73 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        int[] intArray75 = chronology22.get((org.joda.time.ReadablePartial) localDateTime44, (long) 31);
        org.joda.time.DateTimeField dateTimeField76 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField77 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField78 = chronology22.weekyears();
        java.lang.String str79 = chronology22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField78", (durationField14.compareTo(durationField78) == 0) == durationField14.equals(durationField78));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long5 = dateTimeZone1.convertLocalToUTC(220752000000L, false, 9L);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone1);
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
        org.joda.time.DateTime dateTime89 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.LocalDateTime localDateTime91 = localDateTime6.minus(readableDuration90);
        java.util.Date date92 = localDateTime6.toDate();
        org.joda.time.ReadablePeriod readablePeriod93 = null;
        org.joda.time.LocalDateTime localDateTime95 = localDateTime6.withPeriodAdded(readablePeriod93, 30680369);
        int int96 = localDateTime6.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
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
        dateTimeParserBucket11.setOffset((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.DurationField durationField29 = chronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        boolean boolean36 = dateTimeZone30.isLocalDateTimeGap(localDateTime35);
        org.joda.time.Chronology chronology37 = chronology27.withZone(dateTimeZone30);
        boolean boolean38 = dateTimeFieldType14.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.year();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology37.getZone();
        dateTimeParserBucket11.setZone(dateTimeZone44);
        boolean boolean47 = dateTimeZone44.isStandardOffset(311039996400000L);
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
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
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.minus(readablePeriod71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plus(readablePeriod73);
        org.joda.time.Chronology chronology75 = localDateTime72.getChronology();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minus(readablePeriod79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime78.dayOfYear();
        org.joda.time.LocalDateTime localDateTime82 = property81.withMaximumValue();
        int int83 = localDateTime72.compareTo((org.joda.time.ReadablePartial) localDateTime82);
        org.joda.time.Chronology chronology84 = localDateTime72.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.era();
        org.joda.time.DurationField durationField86 = chronology84.weekyears();
        org.joda.time.DateTimeZone dateTimeZone87 = chronology84.getZone();
        long long89 = dateTimeZone44.getMillisKeepLocal(dateTimeZone87, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField86", (durationField29.compareTo(durationField86) == 0) == durationField29.equals(durationField86));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        java.lang.String str18 = chronology14.toString();
        org.joda.time.DurationField durationField19 = chronology14.halfdays();
        org.joda.time.DurationField durationField20 = chronology14.millis();
        org.joda.time.DurationField durationField21 = durationFieldType1.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField19, and durationField20", !(durationField23.compareTo(durationField19) == 0) || (Math.signum(durationField23.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        org.joda.time.DurationField durationField16 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField16", (durationField14.compareTo(durationField16) == 0) == durationField14.equals(durationField16));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        org.joda.time.DateTimeField dateTimeField21 = chronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.era();
        org.joda.time.DurationField durationField23 = chronology16.weekyears();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = null;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = null;
        java.lang.String str31 = locale29.getDisplayVariant(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 0, 0);
        dateTimeParserBucket35.setOffset((java.lang.Integer) 10);
        java.lang.Object obj38 = dateTimeParserBucket35.saveState();
        java.lang.Integer int39 = dateTimeParserBucket35.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket35.getZone();
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
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = chronology53.add(readablePeriod55, (long) 28, 10);
        org.joda.time.DateTimeZone dateTimeZone59 = chronology53.getZone();
        int int61 = dateTimeZone59.getOffsetFromLocal((-2726520305608080000L));
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
        org.joda.time.DateTimeField dateTimeField81 = chronology80.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.year();
        java.util.Locale locale86 = new java.util.Locale("italiano", "1970-01-01T00:00:00.000", "1");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((-31449599990L), chronology80, locale86);
        java.lang.String str88 = dateTimeZone59.getName(252000001L, locale86);
        long long91 = dateTimeZone59.adjustOffset((long) 68640000, false);
        int int93 = dateTimeZone59.getOffsetFromLocal(62135596800004L);
        dateTimeParserBucket35.setZone(dateTimeZone59);
        org.joda.time.Chronology chronology95 = chronology16.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField54", (durationField23.compareTo(durationField54) == 0) == durationField23.equals(durationField54));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '#', chronology17);
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
        org.joda.time.DurationField durationField34 = chronology33.hours();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '#', chronology33);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMonths((int) (short) 10);
        boolean boolean38 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime();
        long long40 = dateTime39.getMillis();
        org.joda.time.Instant instant41 = dateTime39.toInstant();
        long long42 = instant41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = instant41.getZone();
        int int44 = property3.getDifference((org.joda.time.ReadableInstant) instant41);
        int int45 = property3.getMinimumValueOverall();
        int int46 = property3.getMinimumValue();
        org.joda.time.Interval interval47 = property3.toInterval();
        org.joda.time.DurationField durationField48 = property3.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime49 = property3.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant41", (dateTime39.compareTo(instant41) == 0) == dateTime39.equals(instant41));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.clockhourOfHalfday();
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
        org.joda.time.DurationField durationField33 = chronology32.hours();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '#', chronology32);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusWeeks(35);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusMillis(65);
        int int40 = localDateTime37.getEra();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.minus(readablePeriod41);
        int[] intArray44 = chronology13.get((org.joda.time.ReadablePartial) localDateTime42, 6058940117124888000L);
        org.joda.time.DurationField durationField45 = chronology13.seconds();
        org.joda.time.DurationField durationField46 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField14, and durationField16", !(durationField46.compareTo(durationField14) == 0) || (Math.signum(durationField46.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.joda.time.DateTimeField dateTimeField36 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readablePeriod40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.yearOfEra();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundFloorCopy();
        int int44 = localDateTime43.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.yearOfEra();
        int int46 = property45.getLeapAmount();
        java.lang.String str47 = property45.getName();
        org.joda.time.LocalDateTime localDateTime49 = property45.addToCopy((int) 'u');
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDateTime49, (int) 'x', locale51);
        int int54 = dateTimeField36.getMinimumValue((long) 36000000);
        org.joda.time.Chronology chronology58 = null;
        java.util.Locale locale59 = java.util.Locale.GERMAN;
        java.util.Locale locale60 = null;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.util.Locale locale63 = null;
        java.lang.String str64 = locale62.getDisplayVariant(locale63);
        java.lang.String str65 = locale59.getDisplayCountry(locale62);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology58, locale59, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology69 = dateTimeParserBucket68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.year();
        org.joda.time.DurationField durationField71 = chronology69.weekyears();
        org.joda.time.DurationField durationField72 = chronology69.seconds();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.clockhourOfHalfday();
        java.util.Locale locale74 = java.util.Locale.ITALY;
        java.util.Locale locale75 = java.util.Locale.GERMAN;
        java.util.Locale locale76 = null;
        java.lang.String str77 = locale75.getDisplayVariant(locale76);
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.util.Locale locale79 = null;
        java.lang.String str80 = locale78.getDisplayVariant(locale79);
        java.lang.String str81 = locale75.getDisplayCountry(locale78);
        java.lang.String str82 = locale74.getDisplayScript(locale78);
        java.util.Locale locale83 = locale78.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((-1915906L), chronology69, locale83, (java.lang.Integer) 1972, 53);
        java.lang.String str87 = locale83.getDisplayLanguage();
        java.lang.String str88 = locale83.getLanguage();
        java.lang.String str90 = locale83.getExtension('x');
        java.lang.String str91 = dateTimeField36.getAsText((-352800), locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField71", (durationField14.compareTo(durationField71) == 0) == durationField14.equals(durationField71));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        int int9 = property5.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusDays(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDateTime10.toString(dateTimeFormatter15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusDays(80);
        org.joda.time.LocalDateTime.Property property19 = localDateTime10.millisOfDay();
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
        org.joda.time.DateTimeField dateTimeField35 = chronology32.dayOfWeek();
        org.joda.time.DurationField durationField36 = chronology32.eras();
        org.joda.time.DurationFieldType durationFieldType37 = durationField36.getType();
        boolean boolean38 = localDateTime10.isSupported(durationFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField36", Math.signum(durationField33.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField33)));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology23.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.DurationField durationField27 = chronology23.years();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField28", Math.signum(durationField15.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField15)));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.lang.String str57 = locale51.getDisplayCountry(locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology50, locale51, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.years();
        org.joda.time.DurationField durationField63 = chronology61.minutes();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.DateTimeField dateTimeField65 = chronology61.clockhourOfHalfday();
        org.joda.time.DurationField durationField66 = durationFieldType48.getField(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField66, durationField14, and durationField62", !(durationField66.compareTo(durationField14) == 0) || (Math.signum(durationField66.compareTo(durationField62)) == Math.signum(durationField14.compareTo(durationField62))));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology14.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = chronology14.weekyears();
        long long33 = chronology14.add((-946687919903L), (-315619200000L), 988);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField29", (durationField15.compareTo(durationField29) == 0) == durationField15.equals(durationField29));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.year();
        org.joda.time.DurationField durationField17 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology22.add(readablePeriod25, (long) 2, 31);
        org.joda.time.DateTimeField dateTimeField29 = chronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology22.weekOfWeekyear();
        org.joda.time.DurationField durationField31 = chronology22.eras();
        org.joda.time.DurationField durationField32 = chronology22.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField31", Math.signum(durationField14.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField14)));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime38.getFields();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusMonths((int) (byte) 0);
        long long45 = chronology16.set((org.joda.time.ReadablePartial) localDateTime43, 0L);
        org.joda.time.DateTimeZone dateTimeZone46 = chronology16.getZone();
        org.joda.time.DurationField durationField47 = chronology16.eras();
        org.joda.time.DurationField durationField48 = chronology16.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField47", Math.signum(durationField17.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField17)));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology22.add(readablePeriod25, (long) 2, 31);
        org.joda.time.DateTimeField dateTimeField29 = chronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology22.weekOfWeekyear();
        org.joda.time.DurationField durationField31 = chronology22.eras();
        org.joda.time.DurationField durationField32 = chronology22.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField31", Math.signum(durationField14.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField14)));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        java.lang.String str28 = chronology23.toString();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology23.weekyears();
        org.joda.time.DurationField durationField31 = chronology23.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField31", (durationField15.compareTo(durationField31) == 0) == durationField15.equals(durationField31));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField16", (durationField13.compareTo(durationField16) == 0) == durationField13.equals(durationField16));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = chronology12.add(readablePeriod29, (-1052077248000000L), 35999947);
        org.joda.time.DurationField durationField33 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField13, and durationField14", !(durationField33.compareTo(durationField13) == 0) || (Math.signum(durationField33.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.yearOfEra();
        int int7 = property6.getMaximumValueOverall();
        int int8 = property6.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime9 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.yearOfEra();
        int int16 = property15.getMaximumValueOverall();
        int int17 = property15.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime18 = property15.roundHalfFloorCopy();
        int int19 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYearOfCentury((int) ' ');
        int int23 = localDateTime22.size();
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime();
        java.lang.String str25 = dateTime24.toString();
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
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray47 = localDateTime46.getFields();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withMillisOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean51 = localDateTime46.isSupported(dateTimeFieldType50);
        int int52 = dateTime24.get(dateTimeFieldType50);
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
        org.joda.time.DateTimeZone dateTimeZone67 = chronology65.getZone();
        org.joda.time.DurationField durationField68 = chronology65.hours();
        boolean boolean69 = dateTimeFieldType50.isSupported(chronology65);
        org.joda.time.DurationField durationField70 = chronology65.days();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(3295L, chronology65);
        org.joda.time.DateTimeField dateTimeField72 = chronology65.year();
        org.joda.time.DurationField durationField73 = chronology65.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField66, and durationField68", !(durationField73.compareTo(durationField66) == 0) || (Math.signum(durationField73.compareTo(durationField68)) == Math.signum(durationField66.compareTo(durationField68))));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.joda.time.DurationField durationField23 = chronology22.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfDay();
        org.joda.time.DurationField durationField25 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField14, and durationField23", !(durationField25.compareTo(durationField14) == 0) || (Math.signum(durationField25.compareTo(durationField23)) == Math.signum(durationField14.compareTo(durationField23))));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField13, and durationField14", !(durationField18.compareTo(durationField13) == 0) || (Math.signum(durationField18.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.yearOfEra();
        int int34 = property33.getMaximumValueOverall();
        int int35 = property33.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime38 = property33.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfWeek();
        int int43 = property33.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        long long45 = chronology14.set((org.joda.time.ReadablePartial) localDateTime41, 883612800000L);
        org.joda.time.Chronology chronology46 = localDateTime41.getChronology();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = chronology46.add(readablePeriod47, (long) 1, 7199999);
        org.joda.time.DurationField durationField51 = chronology46.eras();
        org.joda.time.Chronology chronology52 = chronology46.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField51", Math.signum(durationField15.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField15)));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField20", (durationField13.compareTo(durationField20) == 0) == durationField13.equals(durationField20));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        java.lang.String str20 = chronology19.toString();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.DurationField durationField26 = chronology19.eras();
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
        long long43 = dateTimeField40.set((long) '4', (int) (short) 0);
        long long45 = dateTimeField40.roundFloor(284012568000L);
        long long48 = dateTimeField40.addWrapField((long) 3, 32);
        java.util.Locale locale53 = new java.util.Locale("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", "gio", "1980");
        java.lang.String str54 = dateTimeField40.getAsShortText(2208988800120L, locale53);
        java.util.Locale locale56 = java.util.Locale.forLanguageTag("yearOfEra");
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 21, chronology19, locale53, (java.lang.Integer) 27143365, 32400000);
        org.joda.time.DurationField durationField61 = chronology19.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField61, and durationField26", !(durationField26.compareTo(durationField61) == 0) || (Math.signum(durationField26.compareTo(durationField26)) == Math.signum(durationField61.compareTo(durationField26))));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology13);
        long long21 = chronology13.add((-31536000000L), (-115246022400000L), (int) 'x');
        org.joda.time.DurationField durationField22 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology13.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField22", Math.signum(durationField14.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField14)));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        int int29 = localDateTime28.getYearOfCentury();
        java.util.Date date30 = localDateTime28.toDate();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusHours(70);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology35 = chronology13.withZone(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        int int39 = dateTimeZone37.getOffset((long) (short) 0);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = dateTimeZone37.getName((long) (short) 1, locale41);
        long long44 = dateTimeZone36.getMillisKeepLocal(dateTimeZone37, (long) 31);
        org.joda.time.Chronology chronology45 = chronology35.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField46 = chronology35.weekyears();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.lang.String str57 = locale51.getDisplayCountry(locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology50, locale51, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.hours();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) '#', chronology61);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusMonths((int) (short) 10);
        org.joda.time.Chronology chronology66 = localDateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfEra();
        java.util.Locale locale69 = new java.util.Locale("0");
        java.lang.String str70 = locale69.toLanguageTag();
        java.lang.String str71 = locale69.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket(1104537600009L, chronology66, locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((-62198755200000L), chronology35, locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField46", (durationField15.compareTo(durationField46) == 0) == durationField15.equals(durationField46));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        org.joda.time.DurationField durationField19 = chronology12.days();
        org.joda.time.DurationField durationField20 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.monthOfYear();
        org.joda.time.DurationField durationField23 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField19, and durationField20", !(durationField23.compareTo(durationField19) == 0) || (Math.signum(durationField23.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology12.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology13.era();
        org.joda.time.DurationField durationField24 = chronology13.eras();
        org.joda.time.Chronology chronology25 = chronology13.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField24", Math.signum(durationField14.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField14)));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        org.joda.time.DurationField durationField23 = chronology12.centuries();
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField14, and durationField23", !(durationField24.compareTo(durationField14) == 0) || (Math.signum(durationField24.compareTo(durationField23)) == Math.signum(durationField14.compareTo(durationField23))));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        org.joda.time.DateTimeField dateTimeField27 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField28 = chronology23.weekyears();
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
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = chronology41.add(readablePeriod43, (long) 28, 10);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology41.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        int int54 = localDateTime53.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType55 = null;
        boolean boolean56 = localDateTime53.isSupported(durationFieldType55);
        int int57 = dateTimeField48.getMinimumValue((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.minusDays(3991);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 'a');
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
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minusMillis(28);
        int int88 = localDateTime85.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = null;
        boolean boolean90 = localDateTime85.isSupported(dateTimeFieldType89);
        int int91 = localDateTime61.compareTo((org.joda.time.ReadablePartial) localDateTime85);
        int[] intArray92 = localDateTime61.getValues();
        chronology23.validate((org.joda.time.ReadablePartial) localDateTime53, intArray92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField28", (durationField15.compareTo(durationField28) == 0) == durationField15.equals(durationField28));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology20.seconds();
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
        org.joda.time.DurationField durationField36 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        long long40 = dateTimeField37.add((long) 28, (long) 'u');
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.lang.String str48 = locale42.getDisplayCountry(locale45);
        java.lang.String str49 = dateTimeField37.getAsShortText(100, locale45);
        java.util.Set<java.lang.String> strSet50 = locale45.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(283996800032L, chronology20, locale45, (java.lang.Integer) 366, 1972);
        org.joda.time.DateTimeField dateTimeField54 = chronology20.weekOfWeekyear();
        org.joda.time.DurationField durationField55 = chronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField56 = chronology20.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField55", (durationField36.compareTo(durationField55) == 0) == durationField36.equals(durationField55));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology12.minuteOfHour();
        org.joda.time.DurationField durationField17 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField17", Math.signum(durationField13.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField13)));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology12.monthOfYear();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DurationField durationField17 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        long long24 = chronology12.add(32L, (long) (byte) 100, 0);
        org.joda.time.DateTimeField dateTimeField25 = chronology12.yearOfEra();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = null;
        java.lang.String str33 = locale31.getDisplayVariant(locale32);
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.years();
        org.joda.time.Chronology chronology40 = chronology38.withUTC();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = null;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = null;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        java.lang.String str49 = locale43.getDisplayCountry(locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology42, locale43, (java.lang.Integer) 0, 0);
        dateTimeParserBucket52.setOffset((java.lang.Integer) 10);
        java.lang.Object obj55 = dateTimeParserBucket52.saveState();
        java.lang.Integer int56 = dateTimeParserBucket52.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeParserBucket52.getZone();
        org.joda.time.Chronology chronology58 = chronology38.withZone(dateTimeZone57);
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
        boolean boolean74 = dateTimeField73.isSupported();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.minus(readablePeriod78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime77.yearOfEra();
        int int81 = property80.getMaximumValueOverall();
        int int82 = property80.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime83 = property80.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.plusMonths((int) (byte) -1);
        java.util.Locale locale88 = new java.util.Locale("Koordinierte Universalzeit");
        java.lang.String str89 = dateTimeField73.getAsShortText((org.joda.time.ReadablePartial) localDateTime83, (int) (byte) 1, locale88);
        java.lang.String str90 = dateTimeZone57.getName((-61851599999990L), locale88);
        org.joda.time.Chronology chronology91 = chronology12.withZone(dateTimeZone57);
        org.joda.time.DurationField durationField92 = chronology12.eras();
        long long96 = chronology12.add(421200028L, (-229L), 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField92", Math.signum(durationField14.compareTo(durationField92)) == -Math.signum(durationField92.compareTo(durationField14)));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weeks();
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
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        boolean boolean18 = durationFieldType2.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.halfdayOfDay();
        org.joda.time.DurationField durationField20 = durationFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField21 = chronology15.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField16, and durationField17", !(durationField22.compareTo(durationField16) == 0) || (Math.signum(durationField22.compareTo(durationField17)) == Math.signum(durationField16.compareTo(durationField17))));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField20", Math.signum(durationField14.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField14)));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        java.lang.String str22 = durationFieldType21.toString();
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
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket34.getZone();
        org.joda.time.Chronology chronology41 = dateTimeParserBucket34.getChronology();
        java.lang.String str42 = chronology41.toString();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.millisOfDay();
        long long47 = chronology41.add((long) 'a', 10L, (int) (short) 0);
        boolean boolean48 = durationFieldType21.isSupported(chronology41);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime15.withFieldAdded(durationFieldType21, 9);
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
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.DateTimeField dateTimeField67 = chronology63.clockhourOfHalfday();
        boolean boolean68 = durationFieldType21.isSupported(chronology63);
        org.joda.time.DateTimeField dateTimeField69 = chronology63.hourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = chronology63.weekOfWeekyear();
        org.joda.time.DurationField durationField71 = chronology63.centuries();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        long long75 = chronology63.add(readablePeriod72, (long) 58, 44);
        org.joda.time.DurationField durationField76 = chronology63.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField76, durationField14, and durationField64", !(durationField76.compareTo(durationField14) == 0) || (Math.signum(durationField76.compareTo(durationField64)) == Math.signum(durationField14.compareTo(durationField64))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = null;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = null;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale11.getDisplayCountry(locale14);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology21);
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.dayOfWeek();
        org.joda.time.DurationField durationField26 = chronology21.weeks();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DurationField durationField28 = chronology21.centuries();
        org.joda.time.DurationField durationField29 = chronology21.millis();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.era();
        org.joda.time.DateTimeField dateTimeField31 = chronology21.secondOfMinute();
        org.joda.time.DurationField durationField32 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField26, and durationField28", !(durationField32.compareTo(durationField26) == 0) || (Math.signum(durationField32.compareTo(durationField28)) == Math.signum(durationField26.compareTo(durationField28))));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        int int19 = property18.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
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
        java.lang.String str46 = instant45.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minus(readablePeriod50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime49.yearOfEra();
        int int53 = property52.getMaximumValueOverall();
        int int54 = property52.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minus(readablePeriod59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime58.yearOfEra();
        int int62 = property61.getMaximumValueOverall();
        int int63 = property61.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime64 = property61.roundHalfFloorCopy();
        int int65 = property52.compareTo((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.minus(readablePeriod68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.plus(readablePeriod70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType73 = dateTimeFieldType72.getRangeDurationType();
        int int74 = localDateTime69.get(dateTimeFieldType72);
        org.joda.time.DateTime dateTime75 = localDateTime69.toDateTime();
        boolean boolean76 = instant45.isAfter((org.joda.time.ReadableInstant) dateTime75);
        int int77 = property18.getDifference((org.joda.time.ReadableInstant) dateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant45", (dateTime44.compareTo(instant45) == 0) == dateTime44.equals(instant45));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(10);
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
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
        org.joda.time.DateTimeField dateTimeField36 = chronology35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology35);
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType21.getField(chronology35);
        int int39 = instant13.get(dateTimeFieldType21);
        org.joda.time.Instant instant40 = instant13.toInstant();
        org.joda.time.Chronology chronology41 = instant13.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray13 = new java.lang.String[] { "UTC", "1970", "Deutsch", "UTC", "UTC", "10", "10", "+00:00", "10", "UTC" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap18);
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.lang.String str28 = locale20.getDisplayScript(locale24);
        java.util.Set<java.lang.String> strSet29 = locale24.getUnicodeLocaleKeys();
        boolean boolean30 = strSet29.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet29.parallelStream();
        int int32 = strSet29.size();
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
        org.joda.time.DateTimeField dateTimeField57 = chronology56.dayOfMonth();
        java.util.Locale locale58 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-1052190046800000L), chronology56, locale58);
        boolean boolean60 = strSet29.contains((java.lang.Object) chronology56);
        java.lang.String str61 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Locale locale62 = java.util.Locale.ITALY;
        java.util.Locale.setDefault(locale62);
        java.util.Locale locale64 = locale62.stripExtensions();
        java.util.Set<java.lang.String> strSet65 = locale62.getUnicodeLocaleAttributes();
        boolean boolean66 = strSet29.containsAll((java.util.Collection<java.lang.String>) strSet65);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minus(readablePeriod70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.yearOfEra();
        int int73 = property72.getMaximumValueOverall();
        int int74 = property72.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime75 = property72.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.minus(readablePeriod79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime78.yearOfEra();
        int int82 = property81.getMaximumValueOverall();
        int int83 = property81.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime84 = property81.roundHalfFloorCopy();
        int int85 = property72.compareTo((org.joda.time.ReadablePartial) localDateTime84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean89 = localDateTime87.isSupported(dateTimeFieldType88);
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        org.joda.time.LocalDateTime localDateTime92 = localDateTime87.withPeriodAdded(readablePeriod90, 2);
        org.joda.time.LocalDateTime.Property property93 = localDateTime92.weekyear();
        org.joda.time.LocalDateTime.Property property94 = localDateTime92.weekyear();
        int int95 = property94.getMaximumValue();
        org.joda.time.DurationField durationField96 = property94.getDurationField();
        java.lang.String str97 = property94.toString();
        org.joda.time.LocalDateTime localDateTime98 = property94.roundFloorCopy();
        boolean boolean99 = strSet29.contains((java.lang.Object) localDateTime98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField48 and durationField96", (durationField48.compareTo(durationField96) == 0) == durationField48.equals(durationField96));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.lang.String str30 = nameProvider20.getShortName(locale21, "", "hi!");
        java.lang.String str31 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 10, locale21);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime16.withMillisOfSecond(10);
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Locale locale37 = null;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale39);
        java.lang.String str43 = locale35.getDisplayScript(locale39);
        java.lang.String str44 = locale35.getDisplayCountry();
        java.lang.String str45 = localDateTime16.toString("-1", locale35);
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
        org.joda.time.DateTimeField dateTimeField59 = chronology58.year();
        org.joda.time.DurationField durationField60 = chronology58.years();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        boolean boolean67 = dateTimeZone61.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology68 = chronology58.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime69 = localDateTime16.toDateTime(dateTimeZone61);
        int int70 = localDateTime16.getEra();
        int int71 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property72 = localDateTime16.yearOfCentury();
        org.joda.time.Chronology chronology74 = null;
        java.util.Locale locale75 = java.util.Locale.GERMAN;
        java.util.Locale locale76 = null;
        java.lang.String str77 = locale75.getDisplayVariant(locale76);
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.util.Locale locale79 = null;
        java.lang.String str80 = locale78.getDisplayVariant(locale79);
        java.lang.String str81 = locale75.getDisplayCountry(locale78);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology74, locale75, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology85 = dateTimeParserBucket84.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.year();
        org.joda.time.DurationField durationField87 = chronology85.weekyears();
        org.joda.time.DurationField durationField88 = chronology85.years();
        long long91 = durationField88.getValueAsLong((-7524857663999999L), 17180999L);
        boolean boolean92 = property72.equals((java.lang.Object) durationField88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField88 and durationField87", (durationField88.compareTo(durationField87) == 0) == durationField88.equals(durationField87));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        org.joda.time.DateTimeField dateTimeField18 = chronology12.millisOfSecond();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.hourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField21, and durationField19", !(durationField19.compareTo(durationField21) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField21.compareTo(durationField19))));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        org.joda.time.DurationField durationField23 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = chronology12.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField23", (durationField14.compareTo(durationField23) == 0) == durationField14.equals(durationField23));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds((int) ' ');
        int[] intArray22 = localDateTime19.getValues();
        int int23 = localDateTime19.getEra();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minus(readablePeriod37);
        boolean boolean40 = localDateTime36.equals((java.lang.Object) 'x');
        org.joda.time.LocalDateTime.Property property41 = localDateTime36.era();
        org.joda.time.LocalDateTime.Property property42 = localDateTime36.monthOfYear();
        int int43 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property44 = localDateTime32.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        int int46 = localDateTime19.get(dateTimeFieldType45);
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
        org.joda.time.DateTimeField dateTimeField60 = chronology59.year();
        org.joda.time.DurationField durationField61 = chronology59.years();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minus(readablePeriod66);
        boolean boolean68 = dateTimeZone62.isLocalDateTimeGap(localDateTime67);
        org.joda.time.Chronology chronology69 = chronology59.withZone(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField70 = chronology59.hourOfDay();
        org.joda.time.DurationField durationField71 = chronology59.weeks();
        org.joda.time.DateTimeField dateTimeField72 = chronology59.dayOfMonth();
        long long76 = chronology59.add((long) 1439, 221616000000L, 14);
        org.joda.time.DateTimeZone dateTimeZone77 = chronology59.getZone();
        org.joda.time.DurationField durationField78 = chronology59.seconds();
        boolean boolean79 = dateTimeFieldType45.isSupported(chronology59);
        org.joda.time.DurationField durationField80 = chronology59.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField80, durationField61, and durationField71", !(durationField80.compareTo(durationField61) == 0) || (Math.signum(durationField80.compareTo(durationField71)) == Math.signum(durationField61.compareTo(durationField71))));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfEra();
        int int18 = property17.getMaximumValueOverall();
        int int19 = property17.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime20 = property17.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.yearOfEra();
        int int27 = property26.getMaximumValueOverall();
        int int28 = property26.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime29 = property26.roundHalfFloorCopy();
        int int30 = property17.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYearOfCentury((int) ' ');
        int int34 = localDateTime33.size();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
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
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusMonths((int) (short) 10);
        boolean boolean70 = localDateTime51.isBefore((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.DateTime dateTime71 = localDateTime67.toDateTime();
        int int72 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime71.getZone();
        long long74 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.util.Locale locale78 = null;
        java.lang.String str79 = locale77.getDisplayVariant(locale78);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.util.Locale locale81 = null;
        java.lang.String str82 = locale80.getDisplayVariant(locale81);
        java.lang.String str83 = locale77.getDisplayCountry(locale80);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket86 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology76, locale77, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology87 = dateTimeParserBucket86.getChronology();
        java.util.Locale locale88 = dateTimeParserBucket86.getLocale();
        boolean boolean90 = dateTimeParserBucket86.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology91 = dateTimeParserBucket86.getChronology();
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(chronology91);
        boolean boolean93 = dateTime71.equals((java.lang.Object) chronology91);
        org.joda.time.DurationField durationField94 = chronology91.eras();
        org.joda.time.DateTimeField dateTimeField95 = chronology91.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField50 and durationField94", Math.signum(durationField50.compareTo(durationField94)) == -Math.signum(durationField94.compareTo(durationField50)));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        java.lang.Integer int14 = dateTimeParserBucket11.getPivotYear();
        long long16 = dateTimeParserBucket11.computeMillis(false);
        dateTimeParserBucket11.setPivotYear((java.lang.Integer) 36000000);
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
        org.joda.time.DurationField durationField33 = chronology32.hours();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) '#', chronology32);
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
        org.joda.time.DurationField durationField49 = chronology48.hours();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) '#', chronology48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusMonths((int) (short) 10);
        boolean boolean53 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.DateTime dateTime54 = localDateTime50.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        int int61 = property60.getMaximumValueOverall();
        int int62 = property60.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minus(readablePeriod67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime66.yearOfEra();
        int int70 = property69.getMaximumValueOverall();
        int int71 = property69.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime72 = property69.roundHalfFloorCopy();
        int int73 = property60.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime72);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withYearOfCentury((int) ' ');
        int int77 = localDateTime76.size();
        org.joda.time.DateTime dateTime78 = localDateTime76.toDateTime();
        org.joda.time.Instant instant79 = dateTime78.toInstant();
        java.lang.String str80 = instant79.toString();
        org.joda.time.Instant instant81 = instant79.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean83 = instant81.isSupported(dateTimeFieldType82);
        int int84 = dateTime54.get(dateTimeFieldType82);
        dateTimeParserBucket11.saveField(dateTimeFieldType82, 30680369);
        java.lang.Object obj87 = dateTimeParserBucket11.saveState();
        int int88 = dateTimeParserBucket11.getOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime78 and instant79", (dateTime78.compareTo(instant79) == 0) == dateTime78.equals(instant79));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfMonth();
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((-1052190046800000L), chronology23, locale25);
        org.joda.time.DurationField durationField27 = chronology23.seconds();
        org.joda.time.DurationField durationField28 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField28", (durationField15.compareTo(durationField28) == 0) == durationField15.equals(durationField28));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMinutes(1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plusHours((int) 'u');
        org.joda.time.Chronology chronology23 = localDateTime19.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) "49", chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField24", Math.signum(durationField15.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField15)));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.joda.time.DurationField durationField27 = chronology23.hours();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField27", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField27)) == Math.signum(durationField15.compareTo(durationField27))));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plus(readablePeriod21);
        int int23 = localDateTime22.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfEra();
        int int30 = property29.getMaximumValueOverall();
        int int31 = property29.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfFloorCopy();
        int int33 = property29.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime34 = property29.roundFloorCopy();
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
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withYearOfCentury((int) ' ');
        int int57 = localDateTime56.size();
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime();
        org.joda.time.Instant instant59 = dateTime58.toInstant();
        java.lang.String str60 = instant59.toString();
        long long61 = instant59.getMillis();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.yearOfEra();
        org.joda.time.LocalDateTime localDateTime68 = property67.roundFloorCopy();
        int int69 = localDateTime68.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property70 = localDateTime68.year();
        org.joda.time.LocalDateTime localDateTime71 = property70.getLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str73 = dateTimeFieldType72.toString();
        int int74 = localDateTime71.get(dateTimeFieldType72);
        org.joda.time.DateTime dateTime75 = localDateTime71.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType77 = dateTimeFieldType76.getDurationType();
        boolean boolean78 = dateTime75.isSupported(dateTimeFieldType76);
        boolean boolean79 = instant59.isBefore((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime dateTime80 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime dateTime81 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime22.minusYears(86390);
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime22.minus(readableDuration84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and instant59", (dateTime58.compareTo(instant59) == 0) == dateTime58.equals(instant59));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        int int19 = localDateTime17.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDayOfMonth(5);
        int int23 = localDateTime17.getEra();
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
        org.joda.time.DurationField durationField38 = chronology37.hours();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '#', chronology37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusMonths((int) (short) 10);
        int int42 = localDateTime39.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minus(readablePeriod46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.yearOfEra();
        int int49 = property48.getMaximumValueOverall();
        int int50 = property48.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime51 = property48.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minus(readablePeriod55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime54.yearOfEra();
        int int58 = property57.getMaximumValueOverall();
        int int59 = property57.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime60 = property57.roundHalfFloorCopy();
        int int61 = property48.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime60);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withYearOfCentury((int) ' ');
        int int65 = localDateTime64.size();
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime();
        org.joda.time.Instant instant67 = dateTime66.toInstant();
        org.joda.time.DateTime dateTime68 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minus(readablePeriod72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime71.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        int int76 = dateTime68.get(dateTimeFieldType75);
        org.joda.time.Instant instant77 = dateTime68.toInstant();
        org.joda.time.DateTime dateTime78 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        java.lang.Class<?> wildcardClass79 = dateTime78.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime66 and instant67", (dateTime66.compareTo(instant67) == 0) == dateTime66.equals(instant67));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long5 = dateTimeZone1.convertLocalToUTC(220752000000L, false, 9L);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone1);
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
        org.joda.time.DateTime dateTime89 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.LocalDateTime localDateTime91 = localDateTime6.minus(readableDuration90);
        org.joda.time.LocalDateTime localDateTime93 = localDateTime6.plusHours((int) (short) 0);
        org.joda.time.LocalDateTime.Property property94 = localDateTime6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and instant50", (dateTime49.compareTo(instant50) == 0) == dateTime49.equals(instant50));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.centuryOfEra();
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
        org.joda.time.DurationField durationField38 = chronology37.hours();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '#', chronology37);
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
        org.joda.time.DurationField durationField54 = chronology53.hours();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) '#', chronology53);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMonths((int) (short) 10);
        boolean boolean58 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.DateTime dateTime59 = localDateTime55.toDateTime();
        long long60 = dateTime59.getMillis();
        org.joda.time.Instant instant61 = dateTime59.toInstant();
        long long62 = instant61.getMillis();
        org.joda.time.DateTimeZone dateTimeZone63 = instant61.getZone();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone63);
        org.joda.time.Chronology chronology65 = chronology12.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.monthOfYear();
        org.joda.time.DurationField durationField69 = chronology65.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant61", (dateTime59.compareTo(instant61) == 0) == dateTime59.equals(instant61));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean39 = dateTime35.isSupported(dateTimeFieldType38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.yearOfEra();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minus(readablePeriod52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime51.yearOfEra();
        int int55 = property54.getMaximumValueOverall();
        int int56 = property54.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime57 = property54.roundHalfFloorCopy();
        int int58 = property45.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withYearOfCentury((int) ' ');
        int int62 = localDateTime61.size();
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime();
        org.joda.time.Instant instant64 = dateTime63.toInstant();
        boolean boolean65 = dateTime35.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minus(readablePeriod69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime68.yearOfEra();
        int int72 = property71.getMaximumValueOverall();
        int int73 = property71.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime74 = property71.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.minus(readablePeriod78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime77.yearOfEra();
        int int81 = property80.getMaximumValueOverall();
        int int82 = property80.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime83 = property80.roundHalfFloorCopy();
        int int84 = property71.compareTo((org.joda.time.ReadablePartial) localDateTime83);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalDateTime localDateTime88 = localDateTime83.minus(readablePeriod87);
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plus(readablePeriod89);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType92 = dateTimeFieldType91.getRangeDurationType();
        int int93 = localDateTime88.get(dateTimeFieldType91);
        org.joda.time.DateTime dateTime94 = localDateTime88.toDateTime();
        boolean boolean95 = dateTime35.isBefore((org.joda.time.ReadableInstant) dateTime94);
        long long96 = dateTime35.getMillis();
        org.joda.time.Instant instant97 = dateTime35.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and instant64", (dateTime63.compareTo(instant64) == 0) == dateTime63.equals(instant64));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        org.joda.time.DurationField durationField52 = chronology14.days();
        org.joda.time.DurationField durationField53 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((-604800000L));
        int[] intArray57 = chronology14.get((org.joda.time.ReadablePartial) localDateTime55, 252806400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField53", (durationField30.compareTo(durationField53) == 0) == durationField30.equals(durationField53));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.joda.time.DurationField durationField20 = chronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField19", Math.signum(durationField13.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField13)));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        java.lang.String str24 = dateTimeZone16.toString();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) 100, dateTimeZone16);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        long long31 = chronology26.add(31795200000L, (long) 1963, 60264);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField27", (durationField15.compareTo(durationField27) == 0) == durationField15.equals(durationField27));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField16", Math.signum(durationField13.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField13)));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.yearOfEra();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime21, locale24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getDurationType();
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
        org.joda.time.DurationField durationField43 = chronology42.hours();
        boolean boolean44 = durationFieldType29.isSupported(chronology42);
        org.joda.time.DurationField durationField45 = durationFieldType27.getField(chronology42);
        java.lang.String str46 = durationFieldType27.toString();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime21.withFieldAdded(durationFieldType27, 3287);
        java.lang.String str49 = durationFieldType27.getName();
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
        org.joda.time.DateTimeField dateTimeField65 = chronology62.secondOfMinute();
        org.joda.time.DurationField durationField66 = chronology62.hours();
        boolean boolean67 = durationFieldType27.isSupported(chronology62);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType68.getDurationType();
        org.joda.time.Chronology chronology71 = null;
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = null;
        java.lang.String str74 = locale72.getDisplayVariant(locale73);
        java.util.Locale locale75 = java.util.Locale.GERMAN;
        java.util.Locale locale76 = null;
        java.lang.String str77 = locale75.getDisplayVariant(locale76);
        java.lang.String str78 = locale72.getDisplayCountry(locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket81 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology71, locale72, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology82 = dateTimeParserBucket81.getChronology();
        org.joda.time.DurationField durationField83 = chronology82.hours();
        boolean boolean84 = durationFieldType69.isSupported(chronology82);
        org.joda.time.DurationField durationField85 = chronology82.millis();
        boolean boolean86 = durationFieldType27.isSupported(chronology82);
        org.joda.time.DurationField durationField87 = chronology82.days();
        org.joda.time.DurationField durationField88 = chronology82.weeks();
        org.joda.time.DurationField durationField89 = chronology82.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField89, durationField43, and durationField63", !(durationField89.compareTo(durationField43) == 0) || (Math.signum(durationField89.compareTo(durationField63)) == Math.signum(durationField43.compareTo(durationField63))));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray29 = new java.lang.String[] { "UTC", "1970", "Deutsch", "UTC", "UTC", "10", "10", "+00:00", "10", "UTC" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray45 = new java.lang.String[] { "UTC", "UTC", "+00:00", "DurationField[years]", "+00:00", "Italia", "UTC", "Italien", "Italia", "+00:00", "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.add("Italien");
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet46);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet46);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale67 = java.util.Locale.GERMAN;
        java.util.Locale locale68 = null;
        java.lang.String str69 = locale67.getDisplayVariant(locale68);
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.util.Locale locale71 = null;
        java.lang.String str72 = locale70.getDisplayVariant(locale71);
        java.lang.String str73 = locale67.getDisplayCountry(locale70);
        dateTimeParserBucket63.saveField(dateTimeFieldType65, "", locale67);
        boolean boolean75 = strSet46.remove((java.lang.Object) dateTimeFieldType65);
        org.joda.time.Chronology chronology78 = null;
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.util.Locale locale80 = null;
        java.lang.String str81 = locale79.getDisplayVariant(locale80);
        java.util.Locale locale82 = java.util.Locale.GERMAN;
        java.util.Locale locale83 = null;
        java.lang.String str84 = locale82.getDisplayVariant(locale83);
        java.lang.String str85 = locale79.getDisplayCountry(locale82);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology78, locale79, (java.lang.Integer) 0, 0);
        dateTimeParserBucket11.saveField(dateTimeFieldType65, "1970-01-01T00:00:00.052", locale79);
        org.joda.time.Chronology chronology90 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.eras();
        org.joda.time.DurationField durationField92 = chronology90.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField91, durationField92, and durationField91", !(durationField91.compareTo(durationField92) == 0) || (Math.signum(durationField91.compareTo(durationField91)) == Math.signum(durationField92.compareTo(durationField91))));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(1970);
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
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        boolean boolean32 = dateTimeZone26.isLocalDateTimeGap(localDateTime31);
        org.joda.time.Chronology chronology33 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology33);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.DurationField durationField39 = chronology33.weekyears();
        java.lang.String str40 = chronology33.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField39", (durationField25.compareTo(durationField39) == 0) == durationField25.equals(durationField39));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = chronology22.add(readablePeriod25, (long) 2, 31);
        org.joda.time.DateTimeField dateTimeField29 = chronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology22.weekOfWeekyear();
        org.joda.time.DurationField durationField31 = chronology22.eras();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField31", Math.signum(durationField14.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField14)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
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
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) '#', chronology22);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusDays(0);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.plusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withDayOfYear((int) (byte) 1);
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale locale41 = null;
        java.lang.String str42 = locale40.getDisplayVariant(locale41);
        java.lang.String str43 = locale37.getDisplayCountry(locale40);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology36, locale37, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology47 = dateTimeParserBucket46.getChronology();
        org.joda.time.DurationField durationField48 = chronology47.hours();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) '#', chronology47);
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
        org.joda.time.DurationField durationField64 = chronology63.hours();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) '#', chronology63);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusMonths((int) (short) 10);
        boolean boolean68 = localDateTime49.isBefore((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime();
        long long70 = dateTime69.getMillis();
        org.joda.time.Instant instant71 = dateTime69.toInstant();
        long long72 = instant71.getMillis();
        java.lang.String str73 = instant71.toString();
        org.joda.time.DateTime dateTime74 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) instant71);
        org.joda.time.Chronology chronology75 = dateTime74.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant71", (dateTime69.compareTo(instant71) == 0) == dateTime69.equals(instant71));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) '#', chronology17);
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
        org.joda.time.DurationField durationField34 = chronology33.hours();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '#', chronology33);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusMonths((int) (short) 10);
        boolean boolean38 = localDateTime19.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime();
        long long40 = dateTime39.getMillis();
        org.joda.time.Instant instant41 = dateTime39.toInstant();
        long long42 = instant41.getMillis();
        org.joda.time.DateTimeZone dateTimeZone43 = instant41.getZone();
        int int44 = property3.getDifference((org.joda.time.ReadableInstant) instant41);
        int int45 = property3.getMinimumValueOverall();
        int int46 = property3.getMinimumValue();
        java.lang.String str47 = property3.getName();
        java.lang.String str48 = property3.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant41", (dateTime39.compareTo(instant41) == 0) == dateTime39.equals(instant41));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField25 = chronology13.seconds();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((-32372574L), chronology13);
        org.joda.time.DateTimeField dateTimeField27 = chronology13.secondOfMinute();
        org.joda.time.DurationField durationField28 = chronology13.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField25", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField25)) == Math.signum(durationField15.compareTo(durationField25))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        org.joda.time.DateTimeField dateTimeField27 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField28 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField28", (durationField15.compareTo(durationField28) == 0) == durationField15.equals(durationField28));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        int int6 = property5.getMaximumValueOverall();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = null;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = null;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale15.getDisplayCountry(locale18);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology14, locale15, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.hours();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) '#', chronology25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths((int) (short) 10);
        int int30 = localDateTime27.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readablePeriod34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.yearOfEra();
        int int37 = property36.getMaximumValueOverall();
        int int38 = property36.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime39 = property36.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.yearOfEra();
        int int46 = property45.getMaximumValueOverall();
        int int47 = property45.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        int int49 = property36.compareTo((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withYearOfCentury((int) ' ');
        int int53 = localDateTime52.size();
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime();
        org.joda.time.Instant instant55 = dateTime54.toInstant();
        org.joda.time.DateTime dateTime56 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        int int57 = property5.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology58 = dateTime56.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.halfdays();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.millisOfSecond();
        java.lang.String str62 = dateTimeField60.getAsText((-84001L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant55", (dateTime54.compareTo(instant55) == 0) == dateTime54.equals(instant55));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.centuryOfEra();
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
        org.joda.time.DurationField durationField38 = chronology37.hours();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '#', chronology37);
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
        org.joda.time.DurationField durationField54 = chronology53.hours();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) '#', chronology53);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMonths((int) (short) 10);
        boolean boolean58 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.DateTime dateTime59 = localDateTime55.toDateTime();
        long long60 = dateTime59.getMillis();
        org.joda.time.Instant instant61 = dateTime59.toInstant();
        long long62 = instant61.getMillis();
        org.joda.time.DateTimeZone dateTimeZone63 = instant61.getZone();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone63);
        org.joda.time.Chronology chronology65 = chronology12.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.hourOfHalfday();
        org.joda.time.DurationField durationField68 = chronology65.centuries();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.era();
        boolean boolean70 = dateTimeField69.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant61", (dateTime59.compareTo(instant61) == 0) == dateTime59.equals(instant61));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.centuryOfEra();
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
        org.joda.time.DurationField durationField38 = chronology37.hours();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) '#', chronology37);
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
        org.joda.time.DurationField durationField54 = chronology53.hours();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) '#', chronology53);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMonths((int) (short) 10);
        boolean boolean58 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.DateTime dateTime59 = localDateTime55.toDateTime();
        long long60 = dateTime59.getMillis();
        org.joda.time.Instant instant61 = dateTime59.toInstant();
        long long62 = instant61.getMillis();
        org.joda.time.DateTimeZone dateTimeZone63 = instant61.getZone();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 7, dateTimeZone63);
        org.joda.time.Chronology chronology65 = chronology12.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.minuteOfDay();
        org.joda.time.DurationField durationField68 = chronology65.halfdays();
        long long71 = durationField68.subtract(283996800000L, 0L);
        java.lang.String str72 = durationField68.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and instant61", (dateTime59.compareTo(instant61) == 0) == dateTime59.equals(instant61));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.joda.time.DurationField durationField34 = chronology33.hours();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) '#', chronology33);
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
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusMonths((int) (short) 10);
        boolean boolean54 = localDateTime35.isBefore((org.joda.time.ReadablePartial) localDateTime51);
        java.lang.String str55 = localDateTime35.toString();
        int[] intArray57 = chronology12.get((org.joda.time.ReadablePartial) localDateTime35, 2L);
        org.joda.time.DurationField durationField58 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField59 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField61 = chronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField62 = chronology12.millisOfDay();
        java.lang.String str63 = chronology12.toString();
        org.joda.time.DurationField durationField64 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField14, and durationField34", !(durationField64.compareTo(durationField14) == 0) || (Math.signum(durationField64.compareTo(durationField34)) == Math.signum(durationField14.compareTo(durationField34))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology20.seconds();
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
        org.joda.time.DurationField durationField36 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.hourOfHalfday();
        long long40 = dateTimeField37.add((long) 28, (long) 'u');
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale42.getDisplayVariant(locale43);
        java.util.Locale locale45 = java.util.Locale.GERMAN;
        java.util.Locale locale46 = null;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        java.lang.String str48 = locale42.getDisplayCountry(locale45);
        java.lang.String str49 = dateTimeField37.getAsShortText(100, locale45);
        java.util.Set<java.lang.String> strSet50 = locale45.getUnicodeLocaleAttributes();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(283996800032L, chronology20, locale45, (java.lang.Integer) 366, 1972);
        org.joda.time.DateTimeField dateTimeField54 = chronology20.weekOfWeekyear();
        org.joda.time.DurationField durationField55 = chronology20.weekyears();
        long long59 = chronology20.add((-59897663999999L), (-691199913L), 212253);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField55", (durationField36.compareTo(durationField55) == 0) == durationField36.equals(durationField55));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plus(readableDuration39);
        org.joda.time.DateTimeField dateTimeField42 = localDateTime38.getField((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMonthOfYear(4);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minus(readablePeriod49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.yearOfEra();
        int int52 = property51.getMaximumValueOverall();
        int int53 = property51.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime54 = property51.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime57.yearOfEra();
        int int61 = property60.getMaximumValueOverall();
        int int62 = property60.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime63 = property60.roundHalfFloorCopy();
        int int64 = property51.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = localDateTime66.getFields();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.withWeekyear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.dayOfYear();
        int int73 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        int[] intArray75 = chronology22.get((org.joda.time.ReadablePartial) localDateTime44, (long) 31);
        org.joda.time.DateTimeField dateTimeField76 = chronology22.secondOfMinute();
        org.joda.time.DurationField durationField77 = chronology22.weekyears();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        long long81 = chronology22.add(readablePeriod78, (-9467085600046270L), 27302630);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField77", (durationField14.compareTo(durationField77) == 0) == durationField14.equals(durationField77));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property5.getFieldType();
        java.lang.String str8 = property5.toString();
        org.joda.time.LocalDateTime localDateTime10 = property5.addToCopy(31);
        org.joda.time.LocalDateTime localDateTime11 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getRangeDurationType();
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
        org.joda.time.DurationField durationField29 = durationFieldType15.getField(chronology28);
        java.lang.String str30 = durationFieldType15.getName();
        java.lang.String str31 = durationFieldType15.getName();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime13.withFieldAdded(durationFieldType15, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.era();
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
        org.joda.time.DurationField durationField49 = chronology48.years();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.hourOfHalfday();
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.util.Locale locale54 = java.util.Locale.GERMAN;
        java.util.Locale locale55 = null;
        java.lang.String str56 = locale54.getDisplayVariant(locale55);
        java.lang.String str57 = locale51.getDisplayCountry(locale54);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology48, locale51, (java.lang.Integer) 2, 70);
        boolean boolean61 = dateTimeFieldType34.isSupported(chronology48);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.yearOfEra();
        int int68 = property67.getMaximumValueOverall();
        int int69 = property67.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime70 = property67.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime71 = property67.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime72 = property67.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) '4', dateTimeZone74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.dayOfWeek();
        int int77 = property67.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        long long79 = chronology48.set((org.joda.time.ReadablePartial) localDateTime75, 883612800000L);
        org.joda.time.Chronology chronology80 = localDateTime75.getChronology();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        long long84 = chronology80.add(readablePeriod81, (long) 1, 7199999);
        org.joda.time.DurationField durationField85 = chronology80.eras();
        org.joda.time.DurationField durationField86 = durationFieldType15.getField(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField86 and durationField85", Math.signum(durationField86.compareTo(durationField85)) == -Math.signum(durationField85.compareTo(durationField86)));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readablePeriod3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
        int int7 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = property8.setCopy((int) '#');
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property8.getField();
        int int14 = dateTimeField12.get((-1915906L));
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
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale locale33 = null;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale32.getDisplayCountry(locale35);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology29, locale32, (java.lang.Integer) 2, 70);
        org.joda.time.DateTimeField dateTimeField42 = chronology29.year();
        org.joda.time.DateTimeField dateTimeField43 = chronology29.dayOfYear();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((-1104537600000L), chronology29);
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.lang.String str47 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localDateTime44, 11, locale46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekyear();
        org.joda.time.LocalDateTime localDateTime49 = property48.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str51 = dateTimeFieldType50.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        java.lang.String str54 = durationFieldType53.toString();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = java.util.Locale.GERMAN;
        java.util.Locale locale58 = null;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.util.Locale locale61 = null;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale57.getDisplayCountry(locale60);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology56, locale57, (java.lang.Integer) 0, 0);
        org.joda.time.Chronology chronology67 = dateTimeParserBucket66.getChronology();
        java.util.Locale locale68 = dateTimeParserBucket66.getLocale();
        boolean boolean70 = dateTimeParserBucket66.restoreState((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology71 = dateTimeParserBucket66.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.year();
        org.joda.time.Chronology chronology74 = chronology71.withUTC();
        org.joda.time.DurationField durationField75 = durationFieldType53.getField(chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType50.getField(chronology74);
        org.joda.time.DurationField durationField78 = chronology74.hours();
        org.joda.time.DateTimeField dateTimeField79 = chronology74.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField80 = chronology74.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime49, chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField75", (durationField30.compareTo(durationField75) == 0) == durationField30.equals(durationField75));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        org.joda.time.DateTimeZone dateTimeZone16 = chronology12.getZone();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology12.add(readablePeriod17, 9593337601946L, (int) 'a');
        org.joda.time.DurationField durationField21 = chronology12.weekyears();
        org.joda.time.DurationField durationField22 = chronology12.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField21", (durationField22.compareTo(durationField21) == 0) == durationField22.equals(durationField21));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField20", Math.signum(durationField17.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField17)));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readablePeriod17);
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = null;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.lang.String str30 = nameProvider20.getShortName(locale21, "", "hi!");
        java.lang.String str31 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 10, locale21);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime16.withMillisOfSecond(10);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        int int35 = property34.getMaximumValue();
        org.joda.time.DurationField durationField36 = property34.getDurationField();
        long long37 = property34.remainder();
        int int38 = property34.getLeapAmount();
        int int39 = property34.getMaximumValueOverall();
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
        org.joda.time.DurationField durationField54 = chronology53.hours();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) '#', chronology53);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusMonths((int) (short) 10);
        int int58 = localDateTime55.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minus(readablePeriod62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime61.yearOfEra();
        int int65 = property64.getMaximumValueOverall();
        int int66 = property64.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime67 = property64.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minus(readablePeriod71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime70.yearOfEra();
        int int74 = property73.getMaximumValueOverall();
        int int75 = property73.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime76 = property73.roundHalfFloorCopy();
        int int77 = property64.compareTo((org.joda.time.ReadablePartial) localDateTime76);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime76);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.withYearOfCentury((int) ' ');
        int int81 = localDateTime80.size();
        org.joda.time.DateTime dateTime82 = localDateTime80.toDateTime();
        org.joda.time.Instant instant83 = dateTime82.toInstant();
        org.joda.time.DateTime dateTime84 = localDateTime55.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        long long85 = dateTime84.getMillis();
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime84.getZone();
        long long87 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime82 and instant83", (dateTime82.compareTo(instant83) == 0) == dateTime82.equals(instant83));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.DurationField durationField17 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((-1645513199999374L), chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.DurationField durationField19 = chronology16.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField18", Math.signum(durationField17.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField17)));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMonths((int) (short) 10);
        boolean boolean35 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime();
        long long37 = dateTime36.getMillis();
        org.joda.time.Instant instant38 = dateTime36.toInstant();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str41 = dateTimeZone39.getNameKey((long) 10);
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
        org.joda.time.DateTimeField dateTimeField55 = chronology54.year();
        org.joda.time.DurationField durationField56 = chronology54.years();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readablePeriod61);
        boolean boolean63 = dateTimeZone57.isLocalDateTimeGap(localDateTime62);
        org.joda.time.Chronology chronology64 = chronology54.withZone(dateTimeZone57);
        long long66 = dateTimeZone39.getMillisKeepLocal(dateTimeZone57, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((java.lang.Object) instant38, dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(31536000000L, dateTimeZone39);
        java.lang.String str69 = dateTimeZone39.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant38", (dateTime36.compareTo(instant38) == 0) == dateTime36.equals(instant38));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale2.getDisplayCountry(locale5);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 0, 0);
        java.util.Locale locale12 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket11.getZone();
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
        org.joda.time.DateTimeField dateTimeField27 = chronology26.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minus(readablePeriod31);
        org.joda.time.tz.NameProvider nameProvider34 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale35.getDisplayCountry(locale38);
        java.lang.String str44 = nameProvider34.getShortName(locale35, "", "hi!");
        java.lang.String str45 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, (int) (byte) 10, locale35);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime30.withMillisOfSecond(10);
        java.util.Locale locale49 = java.util.Locale.ITALY;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = null;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.util.Locale locale54 = null;
        java.lang.String str55 = locale53.getDisplayVariant(locale54);
        java.lang.String str56 = locale50.getDisplayCountry(locale53);
        java.lang.String str57 = locale49.getDisplayScript(locale53);
        java.lang.String str58 = locale49.getDisplayCountry();
        java.lang.String str59 = localDateTime30.toString("-1", locale49);
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
        org.joda.time.DateTime dateTime83 = localDateTime30.toDateTime(dateTimeZone75);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType85 = dateTimeFieldType84.getRangeDurationType();
        int int86 = dateTime83.get(dateTimeFieldType84);
        dateTimeParserBucket11.saveField(dateTimeFieldType84, (-17150744));
        org.joda.time.Chronology chronology89 = dateTimeParserBucket11.getChronology();
        org.joda.time.DurationField durationField90 = chronology89.days();
        org.joda.time.DurationField durationField91 = chronology89.seconds();
        org.joda.time.DateTimeField dateTimeField92 = chronology89.minuteOfDay();
        org.joda.time.DurationField durationField93 = chronology89.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField93, durationField74, and durationField90", !(durationField93.compareTo(durationField74) == 0) || (Math.signum(durationField93.compareTo(durationField90)) == Math.signum(durationField74.compareTo(durationField90))));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        org.joda.time.DateTimeField dateTimeField21 = chronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology16.weekyear();
        org.joda.time.DurationField durationField25 = chronology16.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField25, and durationField23", !(durationField23.compareTo(durationField25) == 0) || (Math.signum(durationField23.compareTo(durationField23)) == Math.signum(durationField25.compareTo(durationField23))));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.joda.time.DateTimeField dateTimeField62 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField63 = chronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField64 = chronology17.secondOfDay();
        org.joda.time.DurationField durationField65 = chronology17.hours();
        org.joda.time.DurationField durationField66 = chronology17.hours();
        org.joda.time.DurationField durationField67 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField67, durationField43, and durationField65", !(durationField67.compareTo(durationField43) == 0) || (Math.signum(durationField67.compareTo(durationField65)) == Math.signum(durationField43.compareTo(durationField65))));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekyear();
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = locale26.getLanguage();
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
        org.joda.time.DurationField durationField41 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.year();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.secondOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology40.minuteOfDay();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale locale49 = null;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = null;
        java.lang.String str53 = locale51.getDisplayVariant(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale51);
        java.lang.String str55 = locale47.getDisplayScript(locale51);
        java.util.Set<java.lang.String> strSet56 = locale51.getUnicodeLocaleKeys();
        java.lang.String str57 = dateTimeField45.getAsShortText(0L, locale51);
        java.lang.String str58 = locale26.getDisplayLanguage(locale51);
        int int59 = dateTimeField25.getMaximumShortTextLength(locale26);
        org.joda.time.DurationField durationField60 = dateTimeField25.getDurationField();
        long long62 = dateTimeField25.roundHalfCeiling((-11525897977200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField60", (durationField14.compareTo(durationField60) == 0) == durationField14.equals(durationField60));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        org.joda.time.DurationField durationField64 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField65 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField66 = chronology17.eras();
        org.joda.time.DateTimeField dateTimeField67 = chronology17.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField66", Math.signum(durationField43.compareTo(durationField66)) == -Math.signum(durationField66.compareTo(durationField43)));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.joda.time.DateTimeField dateTimeField51 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField52 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = chronology14.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField52", (durationField30.compareTo(durationField52) == 0) == durationField30.equals(durationField52));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        org.joda.time.DateTimeZone dateTimeZone18 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.clockhourOfDay();
        org.joda.time.DurationField durationField21 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = chronology12.monthOfYear();
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
        org.joda.time.DurationField durationField37 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.yearOfCentury();
        long long42 = chronology35.add((-1920001L), 117L, (int) '#');
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
        org.joda.time.DurationField durationField73 = chronology72.hours();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) '#', chronology72);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusMonths((int) (short) 10);
        boolean boolean77 = localDateTime58.isBefore((org.joda.time.ReadablePartial) localDateTime74);
        java.lang.String str78 = localDateTime58.toString();
        int[] intArray80 = chronology35.get((org.joda.time.ReadablePartial) localDateTime58, 2L);
        org.joda.time.DurationField durationField81 = chronology35.years();
        org.joda.time.DateTimeField dateTimeField82 = chronology35.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology35.getZone();
        int int85 = dateTimeZone83.getOffset((-259200000L));
        int int87 = dateTimeZone83.getStandardOffset(2240611200000L);
        long long90 = dateTimeZone83.adjustOffset((-26259898040L), true);
        org.joda.time.Chronology chronology91 = chronology12.withZone(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField37", (durationField21.compareTo(durationField37) == 0) == durationField21.equals(durationField37));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfMinute();
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
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DurationField durationField17 = chronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) 1, dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        org.joda.time.Chronology chronology25 = chronology15.withZone(dateTimeZone18);
        boolean boolean26 = dateTimeFieldType2.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology25.getZone();
        boolean boolean32 = durationFieldType1.isSupported(chronology25);
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
        org.joda.time.DateTimeField dateTimeField47 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.year();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology45.dayOfMonth();
        org.joda.time.DurationField durationField51 = chronology45.weeks();
        org.joda.time.DurationField durationField52 = durationFieldType1.getField(chronology45);
        org.joda.time.DurationField durationField53 = chronology45.hours();
        long long57 = chronology45.add((-946687919903L), (long) (-3), (-210273));
        org.joda.time.DurationField durationField58 = chronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = chronology45.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField58", (durationField17.compareTo(durationField58) == 0) == durationField17.equals(durationField58));
    }
}

