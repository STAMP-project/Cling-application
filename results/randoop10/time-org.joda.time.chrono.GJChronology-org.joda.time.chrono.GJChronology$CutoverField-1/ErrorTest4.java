import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        boolean boolean24 = instant22.equals((java.lang.Object) ' ');
        boolean boolean25 = instant16.isEqual((org.joda.time.ReadableInstant) instant22);
        java.lang.String str26 = instant16.toString();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((java.lang.Object) str26);
        org.joda.time.Instant instant29 = instant27.plus(3692163384000L);
        boolean boolean30 = instant29.isBeforeNow();
        java.util.Date date31 = instant29.toDate();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Instant instant40 = instant33.plus(0L);
        long long41 = instant33.getMillis();
        org.joda.time.MutableDateTime mutableDateTime42 = instant33.toMutableDateTime();
        boolean boolean43 = instant29.isAfter((org.joda.time.ReadableInstant) instant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime42", (instant9.compareTo(mutableDateTime42) == 0) == instant9.equals(mutableDateTime42));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.Instant instant4 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant6 = instant4.withMillis((long) 'u');
        boolean boolean7 = instant1.isAfter((org.joda.time.ReadableInstant) instant4);
        org.joda.time.DateTime dateTime8 = instant1.toDateTimeISO();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.millisOfSecond();
        org.joda.time.DurationField durationField13 = gJChronology11.millis();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField16 = gJChronology11.halfdays();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long21 = dateTimeZone18.adjustOffset((-64983772800051L), true);
        long long23 = dateTimeZone18.convertUTCToLocal(5983L);
        org.joda.time.Chronology chronology24 = gJChronology11.withZone(dateTimeZone18);
        java.lang.String str25 = dateTimeZone18.getID();
        org.joda.time.DateTime dateTime26 = dateTime8.toDateTime(dateTimeZone18);
        long long29 = dateTimeZone18.adjustOffset(12622780800000L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime8", (instant1.compareTo(dateTime8) == 0) == instant1.equals(dateTime8));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.Instant instant11 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, (int) 'u');
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = instant14.toMutableDateTime();
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        java.lang.String str20 = instant18.toString();
        java.lang.String str21 = instant18.toString();
        org.joda.time.Instant instant24 = instant18.withDurationAdded(115200000L, (int) (short) 1);
        org.joda.time.Instant instant25 = instant18.toInstant();
        org.joda.time.Instant instant27 = instant25.minus(4492800100L);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = gJChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology30.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology30.getZone();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology38.halfdays();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        long long46 = dateTimeZone41.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean48 = dateTimeZone41.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology49 = gJChronology38.withZone(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime50 = null;
        boolean boolean51 = dateTimeZone41.isLocalDateTimeGap(localDateTime50);
        boolean boolean52 = dateTimeZone41.isFixed();
        org.joda.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = dateTimeZone41.isLocalDateTimeGap(localDateTime53);
        long long56 = dateTimeZone35.getMillisKeepLocal(dateTimeZone41, (long) 1431201);
        org.joda.time.DateTime dateTime57 = instant25.toDateTime(dateTimeZone41);
        boolean boolean58 = instant14.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant60 = instant14.plus(readableDuration59);
        java.util.Date date61 = instant14.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime16", (instant14.compareTo(mutableDateTime16) == 0) == instant14.equals(mutableDateTime16));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-64983772799999L));
        java.util.Date date2 = instant1.toDate();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.Instant instant5 = instant3.toInstant();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone7.getNameKey((long) 100);
        boolean boolean10 = dateTimeZone7.isFixed();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField12 = gJChronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.DurationField durationField15 = gJChronology11.days();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField17 = gJChronology11.days();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = instant3.toMutableDateTime((org.joda.time.Chronology) gJChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        org.joda.time.DateTime dateTime21 = instant5.toDateTime();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant5.withDurationAdded(readableDuration22, 52);
        java.lang.String str25 = instant24.toString();
        long long26 = instant24.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime21", (instant1.compareTo(dateTime21) == 0) == instant1.equals(dateTime21));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-64983772799999L));
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant5.plus(readableDuration7);
        long long9 = instant5.getMillis();
        java.lang.String str10 = instant5.toString();
        boolean boolean12 = instant5.isAfter((long) (-1));
        java.lang.Object obj13 = null;
        boolean boolean14 = instant5.equals(obj13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant5.minus(readableDuration15);
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.Instant instant19 = mutableDateTime17.toInstant();
        boolean boolean20 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) instant19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = dateTimeZone1.getShortName(0L, locale10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.weekyearOfCentury();
        org.joda.time.Instant instant19 = gJChronology16.getGregorianCutover();
        org.joda.time.Instant instant21 = instant19.withMillis(0L);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant19, 4);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.weekyearOfCentury();
        org.joda.time.Instant instant29 = gJChronology26.getGregorianCutover();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Instant instant40 = instant33.plus(0L);
        int int41 = instant31.compareTo((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant43.plus(readableDuration45);
        boolean boolean48 = instant46.equals((java.lang.Object) ' ');
        boolean boolean49 = instant40.isEqual((org.joda.time.ReadableInstant) instant46);
        java.lang.String str50 = instant40.toString();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant40.withDurationAdded(readableDuration51, 1431201);
        int int54 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant40);
        java.util.Date date55 = instant40.toDate();
        java.util.Date date56 = instant40.toDate();
        org.joda.time.Instant instant58 = instant40.plus(262978799880000L);
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology61.weekyear();
        org.joda.time.DurationField durationField64 = gJChronology61.centuries();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology61.halfdayOfDay();
        org.joda.time.DurationField durationField66 = gJChronology61.minutes();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology61.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 52);
        org.joda.time.Chronology chronology71 = gJChronology61.withZone(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = instant58.toMutableDateTime((org.joda.time.Chronology) gJChronology61);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Instant instant74 = instant58.plus(readableDuration73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = instant74.toString(dateTimeFormatter75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant74 and mutableDateTime72", (instant74.compareTo(mutableDateTime72) == 0) == instant74.equals(mutableDateTime72));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) '#');
        java.lang.String str2 = instant1.toString();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(3600000L);
        int int7 = instant4.compareTo((org.joda.time.ReadableInstant) instant6);
        boolean boolean9 = instant6.isBefore((-599968L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime3", (instant1.compareTo(mutableDateTime3) == 0) == instant1.equals(mutableDateTime3));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant8 = instant6.withMillis((long) 'u');
        boolean boolean9 = instant1.isBefore((org.joda.time.ReadableInstant) instant6);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        long long16 = dateTimeZone11.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) true);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale20.toLanguageTag();
        java.lang.String str23 = dateTimeZone11.getShortName(0L, locale20);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.weekyearOfCentury();
        org.joda.time.Instant instant29 = gJChronology26.getGregorianCutover();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant29, 4);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.weekyearOfCentury();
        org.joda.time.Instant instant39 = gJChronology36.getGregorianCutover();
        org.joda.time.Instant instant41 = instant39.withMillis(0L);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology46.millisOfSecond();
        int int48 = instant43.get(dateTimeField47);
        org.joda.time.Instant instant50 = instant43.plus(0L);
        int int51 = instant41.compareTo((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Instant instant53 = new org.joda.time.Instant(52L);
        boolean boolean54 = instant53.isEqualNow();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Instant instant56 = instant53.plus(readableDuration55);
        boolean boolean58 = instant56.equals((java.lang.Object) ' ');
        boolean boolean59 = instant50.isEqual((org.joda.time.ReadableInstant) instant56);
        java.lang.String str60 = instant50.toString();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant63 = instant50.withDurationAdded(readableDuration61, 1431201);
        int int64 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) instant50);
        org.joda.time.DateTime dateTime65 = instant6.toDateTime(dateTimeZone11);
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField69 = gJChronology68.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology68.weekyearOfCentury();
        org.joda.time.Instant instant71 = gJChronology68.getGregorianCutover();
        org.joda.time.Instant instant73 = instant71.withMillis(0L);
        org.joda.time.Chronology chronology74 = instant73.getChronology();
        org.joda.time.Instant instant75 = instant73.toInstant();
        org.joda.time.Instant instant77 = instant75.plus((long) 303090);
        boolean boolean78 = dateTimeZone11.equals((java.lang.Object) instant75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime65", (instant1.compareTo(dateTime65) == 0) == instant1.equals(dateTime65));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-315566928000000L));
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) 100);
        boolean boolean7 = dateTimeZone4.isFixed();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        long long11 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime12 = instant1.toMutableDateTime(dateTimeZone9);
        boolean boolean13 = mutableDateTime12.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(3155760000000L);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant4 = instant1.withMillis(0L);
        boolean boolean6 = instant1.isEqual((long) (short) 10);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.millisOfSecond();
        org.joda.time.DurationField durationField11 = gJChronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        long long15 = dateTimeZone13.previousTransition((-43829L));
        java.lang.String str17 = dateTimeZone13.getShortName((-102228L));
        org.joda.time.DateTime dateTime18 = instant1.toDateTime(dateTimeZone13);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = gJChronology21.halfdays();
        long long26 = gJChronology21.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean28 = gJChronology21.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology21.clockhourOfDay();
        long long36 = gJChronology21.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.Instant instant37 = gJChronology21.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology21.yearOfEra();
        long long42 = gJChronology21.add((long) '#', 86400000L, 20);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.lang.String str46 = dateTimeZone44.getNameKey((long) 100);
        boolean boolean47 = dateTimeZone44.isFixed();
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44);
        int int49 = gJChronology48.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology48.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = gJChronology48.add(readablePeriod51, (long) (short) -1, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField55 = gJChronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology48.minuteOfDay();
        java.lang.String str57 = gJChronology48.toString();
        org.joda.time.DurationField durationField58 = gJChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology48.monthOfYear();
        boolean boolean60 = gJChronology21.equals((java.lang.Object) dateTimeField59);
        org.joda.time.DateTimeField dateTimeField61 = gJChronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        java.lang.String str65 = dateTimeZone63.toString();
        java.lang.String str66 = dateTimeZone63.getID();
        int int68 = dateTimeZone63.getOffset(221529803040000L);
        org.joda.time.Chronology chronology69 = gJChronology21.withZone(dateTimeZone63);
        long long71 = dateTimeZone13.getMillisKeepLocal(dateTimeZone63, (-201360000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = gJChronology11.millis();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField15 = gJChronology11.centuries();
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology20.millisOfSecond();
        int int22 = instant17.get(dateTimeField21);
        org.joda.time.Instant instant24 = instant17.plus(0L);
        org.joda.time.Instant instant25 = instant24.toInstant();
        org.joda.time.Instant instant27 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.millisOfSecond();
        int int32 = instant27.get(dateTimeField31);
        org.joda.time.Instant instant34 = instant27.plus(0L);
        org.joda.time.Instant instant35 = instant34.toInstant();
        boolean boolean36 = instant25.isEqual((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        boolean boolean39 = instant38.isEqualNow();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant38.plus(readableDuration40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant45 = instant43.withMillis((long) 'u');
        boolean boolean46 = instant38.isBefore((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant47 = instant43.toInstant();
        org.joda.time.DateTime dateTime48 = instant43.toDateTime();
        boolean boolean49 = instant35.isBefore((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTimeZone dateTimeZone50 = instant43.getZone();
        org.joda.time.Chronology chronology51 = gJChronology11.withZone(dateTimeZone50);
        java.lang.String str53 = dateTimeZone50.getShortName(35940000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime48", (instant17.compareTo(dateTime48) == 0) == instant17.equals(dateTime48));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Chronology chronology15 = instant9.getChronology();
        boolean boolean16 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        boolean boolean19 = locale18.hasExtensions();
        java.lang.String str20 = locale18.getISO3Language();
        java.util.Locale.setDefault(category17, locale18);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale22.getDisplayLanguage(locale23);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = locale25.getISO3Language();
        java.lang.String str27 = locale22.getDisplayVariant(locale25);
        java.lang.String str28 = locale22.getDisplayName();
        java.util.Locale.setDefault(category17, locale22);
        java.util.Locale locale30 = java.util.Locale.getDefault(category17);
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str32 = locale31.getLanguage();
        java.util.Set<java.lang.Character> charSet33 = locale31.getExtensionKeys();
        java.util.Locale locale35 = new java.util.Locale("hi!");
        java.lang.String str36 = locale35.getVariant();
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale35.getDisplayName(locale38);
        java.lang.String str41 = locale31.getDisplayScript(locale38);
        java.lang.String str42 = locale38.getDisplayCountry();
        java.util.Locale.setDefault(category17, locale38);
        java.util.Locale.Category category44 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        boolean boolean46 = locale45.hasExtensions();
        java.lang.String str47 = locale45.getISO3Language();
        java.util.Locale.setDefault(category44, locale45);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale.setDefault(category44, locale50);
        java.util.Locale locale54 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.util.Locale.setDefault(category44, locale54);
        java.lang.String str56 = locale54.getDisplayCountry();
        java.util.Locale.setDefault(category17, locale54);
        boolean boolean58 = instant1.equals((java.lang.Object) locale54);
        org.joda.time.MutableDateTime mutableDateTime59 = instant1.toMutableDateTime();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.lang.String str63 = dateTimeZone61.getNameKey((long) 100);
        boolean boolean64 = dateTimeZone61.isFixed();
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61);
        int int66 = gJChronology65.getMinimumDaysInFirstWeek();
        java.lang.String str67 = gJChronology65.toString();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology65.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField69 = gJChronology65.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField70 = gJChronology65.weekOfWeekyear();
        boolean boolean71 = mutableDateTime59.equals((java.lang.Object) gJChronology65);
        org.joda.time.DurationField durationField72 = gJChronology65.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime59", (instant1.compareTo(mutableDateTime59) == 0) == instant1.equals(mutableDateTime59));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = instant1.getZone();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        java.lang.String str8 = instant6.toString();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        java.util.Locale locale13 = new java.util.Locale("hi!");
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getDisplayName();
        java.lang.String str17 = locale13.getDisplayScript(locale15);
        boolean boolean18 = dateTimeZone10.equals((java.lang.Object) locale15);
        int int20 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.weekyearOfCentury();
        org.joda.time.Instant instant26 = gJChronology23.getGregorianCutover();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        int int35 = instant30.get(dateTimeField34);
        org.joda.time.Instant instant37 = instant30.plus(0L);
        int int38 = instant28.compareTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = instant37.isSupported(dateTimeFieldType39);
        int int41 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) instant37);
        boolean boolean42 = instant6.isAfter((org.joda.time.ReadableInstant) instant37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = instant6.toString(dateTimeFormatter43);
        boolean boolean45 = instant1.isBefore((org.joda.time.ReadableInstant) instant6);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = gJChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology48.millisOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology48.minuteOfDay();
        org.joda.time.DurationField durationField52 = gJChronology48.centuries();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology48.dayOfYear();
        java.lang.String str54 = gJChronology48.toString();
        org.joda.time.DurationField durationField55 = gJChronology48.years();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology48.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology60 = gJChronology48.withZone(dateTimeZone59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone59.getOffset(readableInstant61);
        org.joda.time.Instant instant64 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = gJChronology67.millisOfSecond();
        int int69 = instant64.get(dateTimeField68);
        org.joda.time.Instant instant71 = instant64.plus(0L);
        org.joda.time.Instant instant72 = instant71.toInstant();
        org.joda.time.Instant instant74 = new org.joda.time.Instant(52L);
        boolean boolean75 = instant74.isEqualNow();
        java.lang.String str76 = instant74.toString();
        java.lang.String str77 = instant74.toString();
        org.joda.time.Instant instant79 = new org.joda.time.Instant(52L);
        boolean boolean80 = instant79.isEqualNow();
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.Instant instant82 = instant79.plus(readableDuration81);
        boolean boolean83 = instant74.isBefore((org.joda.time.ReadableInstant) instant82);
        org.joda.time.Instant instant85 = instant74.minus((long) 0);
        int int86 = instant71.compareTo((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Instant instant89 = instant74.withDurationAdded((long) (short) 100, 70);
        org.joda.time.chrono.GJChronology gJChronology90 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, (org.joda.time.ReadableInstant) instant89);
        org.joda.time.DateTime dateTime91 = instant89.toDateTimeISO();
        boolean boolean92 = instant1.isEqual((org.joda.time.ReadableInstant) dateTime91);
        boolean boolean93 = instant1.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant89 and dateTime91", (instant89.compareTo(dateTime91) == 0) == instant89.equals(dateTime91));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded(306102434400000L, (int) (short) 100);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean12 = dateTimeZone5.equals((java.lang.Object) true);
        long long14 = dateTimeZone5.nextTransition((long) '4');
        java.lang.String str16 = dateTimeZone5.getShortName(432000001L);
        java.util.TimeZone timeZone17 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime18 = instant0.toDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        long long22 = dateTimeZone19.adjustOffset(3155764200000L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime18", (instant0.compareTo(dateTime18) == 0) == instant0.equals(dateTime18));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) (short) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant1.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        org.joda.time.Instant instant16 = new org.joda.time.Instant(4000L);
        boolean boolean18 = instant16.isAfter((-8567999948L));
        java.lang.String str19 = instant16.toString();
        int int20 = instant14.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant23 = instant14.withDurationAdded((long) 46, 985);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant14.minus(readableDuration24);
        org.joda.time.Instant instant27 = new org.joda.time.Instant(52L);
        boolean boolean28 = instant27.isEqualNow();
        boolean boolean30 = instant27.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = instant27.isSupported(dateTimeFieldType31);
        org.joda.time.Instant instant35 = instant27.withDurationAdded((-61827926399999L), (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime36 = instant35.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        boolean boolean40 = instant39.isEqualNow();
        java.lang.String str41 = instant39.toString();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43);
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getCountry();
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.lang.String str49 = locale48.getDisplayName();
        java.lang.String str50 = locale46.getDisplayScript(locale48);
        boolean boolean51 = dateTimeZone43.equals((java.lang.Object) locale48);
        int int53 = dateTimeZone43.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.chrono.GJChronology gJChronology56 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField57 = gJChronology56.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology56.weekyearOfCentury();
        org.joda.time.Instant instant59 = gJChronology56.getGregorianCutover();
        org.joda.time.Instant instant61 = instant59.withMillis(0L);
        org.joda.time.Instant instant63 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = gJChronology66.millisOfSecond();
        int int68 = instant63.get(dateTimeField67);
        org.joda.time.Instant instant70 = instant63.plus(0L);
        int int71 = instant61.compareTo((org.joda.time.ReadableInstant) instant70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = null;
        boolean boolean73 = instant70.isSupported(dateTimeFieldType72);
        int int74 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) instant70);
        boolean boolean75 = instant39.isAfter((org.joda.time.ReadableInstant) instant70);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.Instant instant77 = instant39.minus(readableDuration76);
        org.joda.time.Instant instant78 = instant77.toInstant();
        java.util.TimeZone timeZone79 = null;
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone79);
        java.lang.String str82 = dateTimeZone80.getNameKey((long) 100);
        boolean boolean83 = dateTimeZone80.isFixed();
        org.joda.time.chrono.GJChronology gJChronology84 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone80);
        int int85 = gJChronology84.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField86 = gJChronology84.clockhourOfDay();
        boolean boolean87 = instant77.equals((java.lang.Object) dateTimeField86);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = null;
        boolean boolean89 = instant77.isSupported(dateTimeFieldType88);
        boolean boolean90 = mutableDateTime36.isBefore((org.joda.time.ReadableInstant) instant77);
        boolean boolean91 = instant25.isBefore((org.joda.time.ReadableInstant) instant77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime36", (instant35.compareTo(mutableDateTime36) == 0) == instant35.equals(mutableDateTime36));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant8 = instant6.withMillis((long) 'u');
        boolean boolean9 = instant1.isBefore((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant10 = instant6.toInstant();
        org.joda.time.Instant instant12 = instant10.withMillis(7472212848000000L);
        org.joda.time.DateTimeZone dateTimeZone13 = instant10.getZone();
        org.joda.time.DateTime dateTime14 = instant10.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = instant10.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime14", (instant1.compareTo(dateTime14) == 0) == instant1.equals(dateTime14));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffset((long) (byte) 1);
        long long5 = dateTimeZone0.adjustOffset((-1L), false);
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        java.lang.String str9 = instant7.toString();
        java.lang.String str10 = instant7.toString();
        org.joda.time.Instant instant13 = instant7.withDurationAdded(115200000L, (int) (short) 1);
        boolean boolean14 = instant13.isBeforeNow();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        int int21 = instant16.get(dateTimeField20);
        boolean boolean22 = instant16.isEqualNow();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant24.plus(readableDuration26);
        long long28 = instant24.getMillis();
        java.lang.Object obj29 = null;
        boolean boolean30 = instant24.equals(obj29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        long long36 = instant32.getMillis();
        java.lang.String str37 = instant32.toString();
        org.joda.time.Instant instant38 = instant32.toInstant();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant41 = instant32.withDurationAdded(readableDuration39, (int) 'x');
        org.joda.time.Instant instant42 = instant32.toInstant();
        int int43 = instant24.compareTo((org.joda.time.ReadableInstant) instant32);
        boolean boolean44 = instant16.isBefore((org.joda.time.ReadableInstant) instant32);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = gJChronology47.halfdays();
        long long52 = gJChronology47.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField53 = gJChronology47.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology47.secondOfMinute();
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        boolean boolean57 = instant56.isEqualNow();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant56.plus(readableDuration58);
        boolean boolean60 = gJChronology47.equals((java.lang.Object) instant56);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = instant56.isSupported(dateTimeFieldType61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = instant56.isSupported(dateTimeFieldType63);
        java.lang.String str65 = instant56.toString();
        boolean boolean66 = instant16.isAfter((org.joda.time.ReadableInstant) instant56);
        org.joda.time.MutableDateTime mutableDateTime67 = instant56.toMutableDateTimeISO();
        int int68 = instant13.compareTo((org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        long long73 = gJChronology69.add(readablePeriod70, 28800149L, (-8279429));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime67", (instant7.compareTo(mutableDateTime67) == 0) == instant7.equals(mutableDateTime67));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        long long19 = instant11.getMillis();
        java.lang.String str20 = instant11.toString();
        org.joda.time.Chronology chronology21 = instant11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = instant11.toMutableDateTimeISO();
        org.joda.time.Instant instant24 = instant11.withMillis(94920000L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField28 = gJChronology27.halfdays();
        long long32 = gJChronology27.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology27.secondOfMinute();
        org.joda.time.Instant instant36 = new org.joda.time.Instant(52L);
        boolean boolean37 = instant36.isEqualNow();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant36.plus(readableDuration38);
        boolean boolean40 = gJChronology27.equals((java.lang.Object) instant36);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = instant36.isSupported(dateTimeFieldType41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        boolean boolean44 = instant36.isSupported(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone45 = instant36.getZone();
        long long46 = instant36.getMillis();
        boolean boolean48 = instant36.isBefore(261273600604800052L);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50);
        org.joda.time.DurationField durationField52 = gJChronology51.halfdays();
        long long56 = gJChronology51.add((long) 'a', (-1L), (int) (short) 0);
        long long60 = gJChronology51.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField61 = gJChronology51.years();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology51.dayOfYear();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology51.halfdayOfDay();
        int int64 = instant36.get(dateTimeField63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant67 = instant36.withDurationAdded(readableDuration65, 5995);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69);
        org.joda.time.DurationField durationField71 = gJChronology70.halfdays();
        long long75 = gJChronology70.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean77 = gJChronology70.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField78 = gJChronology70.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField79 = gJChronology70.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField80 = gJChronology70.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology70.clockhourOfHalfday();
        org.joda.time.DurationField durationField82 = gJChronology70.halfdays();
        org.joda.time.DateTimeField dateTimeField83 = gJChronology70.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology70.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime85 = instant36.toMutableDateTime((org.joda.time.Chronology) gJChronology70);
        boolean boolean86 = mutableDateTime85.isBeforeNow();
        org.joda.time.Instant instant87 = mutableDateTime85.toInstant();
        boolean boolean88 = instant11.isEqual((org.joda.time.ReadableInstant) mutableDateTime85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant36", (mutableDateTime22.compareTo(instant36) == 0) == mutableDateTime22.equals(instant36));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant3 = instant1.withMillis((long) 'u');
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = gJChronology6.halfdays();
        long long11 = gJChronology6.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean13 = gJChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology6.clockhourOfHalfday();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime((org.joda.time.Chronology) gJChronology6);
        org.joda.time.Instant instant20 = instant1.plus(0L);
        org.joda.time.Instant instant22 = org.joda.time.Instant.parse("3929-04-02T00:00:00.051Z");
        org.joda.time.DateTime dateTime23 = instant22.toDateTime();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.era();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.year();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.secondOfDay();
        org.joda.time.DurationField durationField30 = gJChronology26.years();
        boolean boolean31 = instant22.equals((java.lang.Object) gJChronology26);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant22.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant22.isSupported(dateTimeFieldType34);
        int int36 = instant20.compareTo((org.joda.time.ReadableInstant) instant22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime18", (instant20.compareTo(dateTime18) == 0) == instant20.equals(dateTime18));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        boolean boolean37 = instant1.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant1.minus(readableDuration38);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.weekyear();
        org.joda.time.DurationField durationField45 = gJChronology42.centuries();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology42.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology42.centuryOfEra();
        org.joda.time.DateTime dateTime50 = instant1.toDateTime((org.joda.time.Chronology) gJChronology42);
        org.joda.time.DurationField durationField51 = gJChronology42.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        boolean boolean13 = instant10.isEqual(2160000000000L);
        java.lang.String str14 = instant10.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = instant1.toString(dateTimeFormatter8);
        java.lang.String str10 = instant1.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant1.withDurationAdded(readableDuration11, (-612));
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        boolean boolean15 = instant13.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime14", (instant13.compareTo(dateTime14) == 0) == instant13.equals(dateTime14));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = instant1.withMillis((long) 4);
        boolean boolean7 = instant6.isBeforeNow();
        boolean boolean9 = instant6.isBefore(5185792L);
        org.joda.time.MutableDateTime mutableDateTime10 = instant6.toMutableDateTime();
        org.joda.time.Instant instant12 = instant6.withMillis((-61827926399999L));
        org.joda.time.DateTimeZone dateTimeZone13 = instant6.getZone();
        boolean boolean15 = dateTimeZone13.isStandardOffset((-1345683119L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime10", (instant6.compareTo(mutableDateTime10) == 0) == instant6.equals(mutableDateTime10));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        long long15 = gJChronology2.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.hourOfDay();
        org.joda.time.DurationField durationField19 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField11", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        long long10 = instant6.getMillis();
        java.lang.String str11 = instant6.toString();
        org.joda.time.Instant instant12 = instant6.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant6.withDurationAdded(readableDuration13, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = instant6.isSupported(dateTimeFieldType16);
        boolean boolean18 = instant1.isEqual((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology19 = instant6.getChronology();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant6.withDurationAdded(readableDuration20, 2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = instant22.toString(dateTimeFormatter23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.weekyear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.halfdayOfDay();
        org.joda.time.DurationField durationField31 = gJChronology27.weekyears();
        long long34 = durationField31.subtract(259200006000000L, (int) (byte) 1);
        boolean boolean35 = instant22.equals((java.lang.Object) 259200006000000L);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.lang.String str39 = dateTimeZone37.getNameKey((long) 100);
        boolean boolean40 = dateTimeZone37.isFixed();
        java.util.Locale locale44 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str45 = dateTimeZone37.getName((long) (short) 10, locale44);
        org.joda.time.Instant instant47 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = gJChronology50.millisOfSecond();
        int int52 = instant47.get(dateTimeField51);
        org.joda.time.Chronology chronology53 = instant47.getChronology();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant47);
        long long55 = instant47.getMillis();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Instant instant57 = instant47.minus(readableDuration56);
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("");
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61);
        org.joda.time.DurationField durationField63 = gJChronology62.halfdays();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology62.millisOfDay();
        org.joda.time.DateTimeField dateTimeField65 = gJChronology62.minuteOfDay();
        org.joda.time.DurationField durationField66 = gJChronology62.centuries();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology62.halfdayOfDay();
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.CANADA;
        java.lang.String str71 = locale68.getDisplayVariant(locale70);
        boolean boolean72 = gJChronology62.equals((java.lang.Object) locale70);
        java.lang.String str73 = locale59.getDisplayLanguage(locale70);
        java.lang.String str75 = locale70.getUnicodeLocaleType("en");
        boolean boolean76 = instant57.equals((java.lang.Object) str75);
        org.joda.time.Instant instant78 = new org.joda.time.Instant((long) '#');
        java.lang.String str79 = instant78.toString();
        org.joda.time.MutableDateTime mutableDateTime80 = instant78.toMutableDateTimeISO();
        boolean boolean81 = mutableDateTime80.isAfterNow();
        boolean boolean82 = instant57.isBefore((org.joda.time.ReadableInstant) mutableDateTime80);
        boolean boolean83 = instant22.isEqual((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.Instant instant85 = instant22.minus(6087472L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant78 and mutableDateTime80", (instant78.compareTo(mutableDateTime80) == 0) == instant78.equals(mutableDateTime80));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant26 = instant11.withDurationAdded((long) (short) 100, 70);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant11.minus(readableDuration27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str32 = dateTimeZone30.getNameKey((long) 100);
        boolean boolean33 = dateTimeZone30.isFixed();
        java.util.Locale locale37 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str38 = dateTimeZone30.getName((long) (short) 10, locale37);
        org.joda.time.Instant instant40 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = gJChronology43.millisOfSecond();
        int int45 = instant40.get(dateTimeField44);
        org.joda.time.Chronology chronology46 = instant40.getChronology();
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, (org.joda.time.ReadableInstant) instant40);
        long long48 = instant40.getMillis();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant40.minus(readableDuration49);
        java.lang.String str51 = instant40.toString();
        org.joda.time.Instant instant53 = instant40.withMillis(3155760000000L);
        boolean boolean54 = instant28.isAfter((org.joda.time.ReadableInstant) instant53);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Instant instant57 = instant53.withDurationAdded(readableDuration55, 0);
        org.joda.time.MutableDateTime mutableDateTime58 = instant53.toMutableDateTimeISO();
        org.joda.time.Chronology chronology59 = instant53.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant53 and mutableDateTime58", (instant53.compareTo(mutableDateTime58) == 0) == instant53.equals(mutableDateTime58));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime(chronology4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = gJChronology8.halfdays();
        long long13 = gJChronology8.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean15 = gJChronology8.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology8.weekyear();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.millisOfSecond();
        org.joda.time.DurationField durationField25 = gJChronology23.millis();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology23.getZone();
        org.joda.time.Chronology chronology27 = gJChronology8.withZone(dateTimeZone26);
        long long30 = dateTimeZone26.convertLocalToUTC(110449353600000L, false);
        org.joda.time.DateTime dateTime31 = mutableDateTime5.toDateTime(dateTimeZone26);
        java.lang.String str33 = dateTimeZone26.getName((long) 43081);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clear();
        java.util.Locale.Builder builder37 = builder35.removeUnicodeLocaleAttribute("und");
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        boolean boolean39 = locale38.hasExtensions();
        java.util.Locale.Builder builder40 = builder35.setLocale(locale38);
        java.util.Locale.Builder builder42 = builder40.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder43 = builder40.clear();
        java.util.Locale.Builder builder45 = builder43.setLanguage("CAN");
        java.util.Locale locale46 = builder45.build();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("3929-04-02T00:00:00.051Z");
        java.util.Locale locale50 = new java.util.Locale("hi!");
        java.lang.String str51 = locale50.getCountry();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getDisplayName();
        java.lang.String str54 = locale50.getDisplayScript(locale52);
        java.util.Set<java.lang.Character> charSet55 = locale52.getExtensionKeys();
        java.util.Set<java.lang.String> strSet56 = locale52.getUnicodeLocaleAttributes();
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale57.getDisplayLanguage(locale58);
        java.util.Locale locale60 = java.util.Locale.CANADA;
        java.lang.String str61 = locale60.getISO3Language();
        java.lang.String str62 = locale57.getDisplayVariant(locale60);
        java.util.Set<java.lang.String> strSet63 = locale57.getUnicodeLocaleKeys();
        java.util.Locale locale67 = new java.util.Locale("zh", "en", "");
        java.lang.String str68 = locale57.getDisplayName(locale67);
        java.lang.String str69 = locale67.getVariant();
        java.lang.String str70 = locale52.getDisplayVariant(locale67);
        java.util.Locale locale72 = java.util.Locale.forLanguageTag("zho");
        java.util.Locale locale73 = java.util.Locale.CANADA;
        java.lang.String str74 = locale73.getISO3Language();
        java.lang.String str75 = locale72.getDisplayScript(locale73);
        boolean boolean76 = locale72.hasExtensions();
        java.lang.String str77 = locale52.getDisplayVariant(locale72);
        java.lang.String str78 = locale48.getDisplayCountry(locale52);
        java.lang.String str79 = locale46.getDisplayCountry(locale52);
        boolean boolean80 = dateTimeZone26.equals((java.lang.Object) locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime5", (instant1.compareTo(mutableDateTime5) == 0) == instant1.equals(mutableDateTime5));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = instant7.toMutableDateTime(dateTimeZone8);
        org.joda.time.Instant instant10 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.minus(readableDuration11);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime9", (instant13.compareTo(mutableDateTime9) == 0) == instant13.equals(mutableDateTime9));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffset((long) (byte) 1);
        long long5 = dateTimeZone0.adjustOffset((-1L), false);
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        java.lang.String str9 = instant7.toString();
        java.lang.String str10 = instant7.toString();
        org.joda.time.Instant instant13 = instant7.withDurationAdded(115200000L, (int) (short) 1);
        boolean boolean14 = instant13.isBeforeNow();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        int int21 = instant16.get(dateTimeField20);
        boolean boolean22 = instant16.isEqualNow();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant24.plus(readableDuration26);
        long long28 = instant24.getMillis();
        java.lang.Object obj29 = null;
        boolean boolean30 = instant24.equals(obj29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        long long36 = instant32.getMillis();
        java.lang.String str37 = instant32.toString();
        org.joda.time.Instant instant38 = instant32.toInstant();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant41 = instant32.withDurationAdded(readableDuration39, (int) 'x');
        org.joda.time.Instant instant42 = instant32.toInstant();
        int int43 = instant24.compareTo((org.joda.time.ReadableInstant) instant32);
        boolean boolean44 = instant16.isBefore((org.joda.time.ReadableInstant) instant32);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.DurationField durationField48 = gJChronology47.halfdays();
        long long52 = gJChronology47.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField53 = gJChronology47.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology47.secondOfMinute();
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        boolean boolean57 = instant56.isEqualNow();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant56.plus(readableDuration58);
        boolean boolean60 = gJChronology47.equals((java.lang.Object) instant56);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = instant56.isSupported(dateTimeFieldType61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = instant56.isSupported(dateTimeFieldType63);
        java.lang.String str65 = instant56.toString();
        boolean boolean66 = instant16.isAfter((org.joda.time.ReadableInstant) instant56);
        org.joda.time.MutableDateTime mutableDateTime67 = instant56.toMutableDateTimeISO();
        int int68 = instant13.compareTo((org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.DurationField durationField70 = gJChronology69.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime67", (instant7.compareTo(mutableDateTime67) == 0) == instant7.equals(mutableDateTime67));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 70);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        long long18 = gJChronology13.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean20 = gJChronology13.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology13.clockhourOfDay();
        long long28 = gJChronology13.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.Instant instant29 = gJChronology13.getGregorianCutover();
        boolean boolean30 = instant1.isEqual((org.joda.time.ReadableInstant) instant29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant1.minus(readableDuration31);
        org.joda.time.DateTime dateTime33 = instant1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant1.isSupported(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime33", (instant1.compareTo(dateTime33) == 0) == instant1.equals(dateTime33));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.Locale locale8 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 10, locale8);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Chronology chronology17 = instant11.getChronology();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11);
        org.joda.time.DateTime dateTime19 = instant11.toDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant11.withDurationAdded(readableDuration20, (int) (short) 10);
        org.joda.time.Instant instant24 = instant22.minus(600097L);
        org.joda.time.Instant instant26 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.millisOfSecond();
        int int31 = instant26.get(dateTimeField30);
        org.joda.time.Chronology chronology32 = instant26.getChronology();
        org.joda.time.Instant instant34 = instant26.withMillis((-24192000000000L));
        org.joda.time.MutableDateTime mutableDateTime35 = instant34.toMutableDateTimeISO();
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = instant34.toDateTime(dateTimeZone37);
        boolean boolean39 = instant24.isEqual((org.joda.time.ReadableInstant) instant34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime19", (instant11.compareTo(dateTime19) == 0) == instant11.equals(dateTime19));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        java.lang.String str8 = instant6.toString();
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant12 = instant6.withDurationAdded(115200000L, (int) (short) 1);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str16 = dateTimeZone14.getNameKey((long) 100);
        boolean boolean17 = dateTimeZone14.isFixed();
        org.joda.time.DateTime dateTime18 = instant6.toDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = instant6.isSupported(dateTimeFieldType19);
        int int21 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant6);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clear();
        java.util.Locale.Builder builder25 = builder23.clearExtensions();
        java.util.Locale.Builder builder27 = builder23.setVariant("halfdays");
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        long long34 = dateTimeZone29.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean36 = dateTimeZone29.equals((java.lang.Object) true);
        long long38 = dateTimeZone29.nextTransition((long) '4');
        java.lang.String str40 = dateTimeZone29.getShortName(432000001L);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale.Builder builder45 = builder43.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        java.util.Locale.Builder builder48 = builder45.setLanguageTag("en");
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder50 = builder49.clear();
        java.util.Locale.Builder builder52 = builder50.removeUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder53 = builder52.clearExtensions();
        java.util.Locale.Category category54 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale55 = java.util.Locale.getDefault();
        boolean boolean56 = locale55.hasExtensions();
        java.lang.String str57 = locale55.getISO3Language();
        java.util.Locale.setDefault(category54, locale55);
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale59.getDisplayLanguage(locale60);
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.lang.String str63 = locale62.getISO3Language();
        java.lang.String str64 = locale59.getDisplayVariant(locale62);
        java.lang.String str65 = locale59.getDisplayName();
        java.util.Locale.setDefault(category54, locale59);
        java.util.Locale locale67 = java.util.Locale.getDefault(category54);
        java.util.Locale locale68 = java.util.Locale.CHINESE;
        java.lang.String str69 = locale67.getDisplayScript(locale68);
        java.util.Locale.Builder builder70 = builder52.setLocale(locale67);
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = locale72.getDisplayScript();
        java.util.Locale.Builder builder74 = builder52.setLocale(locale72);
        java.util.Locale.Builder builder75 = builder48.setLocale(locale72);
        java.lang.String str76 = dateTimeZone29.getShortName(747159923736000000L, locale72);
        java.util.Locale.Builder builder77 = builder27.setLocale(locale72);
        java.lang.String str78 = dateTimeZone1.getName(262978782360000L, locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime18", (instant6.compareTo(dateTime18) == 0) == instant6.equals(dateTime18));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        boolean boolean37 = instant1.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = instant1.toString(dateTimeFormatter38);
        boolean boolean41 = instant1.isBefore((-60479999900000L));
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField45 = gJChronology44.halfdays();
        long long49 = gJChronology44.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology44.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology44.centuryOfEra();
        long long55 = gJChronology44.add(4492800100L, 43201764L, 0);
        org.joda.time.DurationField durationField56 = gJChronology44.centuries();
        boolean boolean57 = instant1.equals((java.lang.Object) gJChronology44);
        org.joda.time.DateTime dateTime58 = instant1.toDateTime();
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology61.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.Chronology chronology66 = gJChronology61.withZone(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.halfdayOfDay();
        int int68 = instant1.get(dateTimeField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime58", (instant25.compareTo(dateTime58) == 0) == instant25.equals(dateTime58));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.Object obj14 = null;
        boolean boolean15 = instant9.equals(obj14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        long long21 = instant17.getMillis();
        java.lang.String str22 = instant17.toString();
        org.joda.time.Instant instant23 = instant17.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant17.withDurationAdded(readableDuration24, (int) 'x');
        org.joda.time.Instant instant27 = instant17.toInstant();
        int int28 = instant9.compareTo((org.joda.time.ReadableInstant) instant17);
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) instant17);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = gJChronology32.halfdays();
        long long37 = gJChronology32.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.secondOfMinute();
        org.joda.time.Instant instant41 = new org.joda.time.Instant(52L);
        boolean boolean42 = instant41.isEqualNow();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.plus(readableDuration43);
        boolean boolean45 = gJChronology32.equals((java.lang.Object) instant41);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant41.isSupported(dateTimeFieldType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant41.isSupported(dateTimeFieldType48);
        java.lang.String str50 = instant41.toString();
        boolean boolean51 = instant1.isAfter((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Instant instant53 = instant1.plus(171253440000000000L);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant55 = instant1.minus(readableDuration54);
        boolean boolean57 = instant55.isEqual((long) 60000);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61);
        int int64 = dateTimeZone61.getOffsetFromLocal(1000L);
        long long66 = dateTimeZone59.getMillisKeepLocal(dateTimeZone61, (-61827926399999L));
        java.lang.String str67 = dateTimeZone61.toString();
        org.joda.time.Instant instant69 = new org.joda.time.Instant(52L);
        boolean boolean70 = instant69.isEqualNow();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.Instant instant72 = instant69.plus(readableDuration71);
        long long73 = instant69.getMillis();
        java.lang.String str74 = instant69.toString();
        org.joda.time.Instant instant75 = instant69.toInstant();
        org.joda.time.Instant instant77 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone78);
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone79);
        org.joda.time.DateTimeField dateTimeField81 = gJChronology80.millisOfSecond();
        int int82 = instant77.get(dateTimeField81);
        org.joda.time.Chronology chronology83 = instant77.getChronology();
        boolean boolean84 = instant69.isBefore((org.joda.time.ReadableInstant) instant77);
        boolean boolean86 = instant69.isEqual(1136050274678400000L);
        org.joda.time.chrono.GJChronology gJChronology87 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, (org.joda.time.ReadableInstant) instant69);
        org.joda.time.DateTime dateTime88 = instant69.toDateTime();
        boolean boolean89 = instant55.isEqual((org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Instant instant92 = instant55.withDurationAdded(80740740000L, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant92 and dateTime88", (instant92.compareTo(dateTime88) == 0) == instant92.equals(dateTime88));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        int int7 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField15 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField6", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(126590400068L);
        org.joda.time.Instant instant3 = new org.joda.time.Instant(52L);
        boolean boolean4 = instant3.isEqualNow();
        java.lang.String str5 = instant3.toString();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(52L);
        boolean boolean8 = instant7.isEqualNow();
        java.lang.String str9 = instant7.toString();
        java.lang.String str10 = instant7.toString();
        org.joda.time.Instant instant13 = instant7.withDurationAdded(115200000L, (int) (short) 1);
        int int14 = instant3.compareTo((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean21 = instant19.equals((java.lang.Object) ' ');
        boolean boolean22 = instant7.isAfter((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTime dateTime23 = instant7.toDateTime();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        long long31 = gJChronology26.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology26.secondOfMinute();
        org.joda.time.Instant instant35 = new org.joda.time.Instant(52L);
        boolean boolean36 = instant35.isEqualNow();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant38 = instant35.plus(readableDuration37);
        boolean boolean39 = gJChronology26.equals((java.lang.Object) instant35);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DurationField durationField43 = gJChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.minuteOfDay();
        org.joda.time.DurationField durationField46 = gJChronology42.centuries();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology42.dayOfYear();
        java.lang.String str48 = gJChronology42.toString();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology42.getZone();
        org.joda.time.DateTime dateTime51 = instant35.toDateTime((org.joda.time.Chronology) gJChronology42);
        boolean boolean53 = dateTime51.isBefore(262974605200L);
        boolean boolean54 = dateTime23.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = gJChronology59.millisOfSecond();
        int int61 = instant56.get(dateTimeField60);
        boolean boolean62 = instant56.isEqualNow();
        boolean boolean64 = instant56.isBefore(35L);
        boolean boolean65 = dateTime51.isAfter((org.joda.time.ReadableInstant) instant56);
        boolean boolean66 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime51);
        boolean boolean67 = dateTime51.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime23", (instant3.compareTo(dateTime23) == 0) == instant3.equals(dateTime23));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        boolean boolean8 = instant1.isAfter((long) (-1));
        org.joda.time.Instant instant9 = instant1.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        java.util.Locale locale18 = new java.util.Locale("hi!");
        java.lang.String str19 = locale18.getCountry();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getDisplayName();
        java.lang.String str22 = locale18.getDisplayScript(locale20);
        boolean boolean23 = dateTimeZone15.equals((java.lang.Object) locale20);
        int int25 = dateTimeZone15.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.weekyearOfCentury();
        org.joda.time.Instant instant31 = gJChronology28.getGregorianCutover();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Instant instant35 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.millisOfSecond();
        int int40 = instant35.get(dateTimeField39);
        org.joda.time.Instant instant42 = instant35.plus(0L);
        int int43 = instant33.compareTo((org.joda.time.ReadableInstant) instant42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = instant42.isSupported(dateTimeFieldType44);
        int int46 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) instant42);
        boolean boolean47 = instant11.isAfter((org.joda.time.ReadableInstant) instant42);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant11.minus(readableDuration48);
        boolean boolean50 = instant1.isEqual((org.joda.time.ReadableInstant) instant49);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        org.joda.time.DurationField durationField54 = gJChronology53.halfdays();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology53.millisOfDay();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology53.minuteOfDay();
        org.joda.time.DurationField durationField57 = gJChronology53.centuries();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology53.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology53.millisOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology53.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime61 = instant49.toMutableDateTime((org.joda.time.Chronology) gJChronology53);
        org.joda.time.DateTime dateTime62 = instant49.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime61", (instant1.compareTo(mutableDateTime61) == 0) == instant1.equals(mutableDateTime61));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) (short) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant1.plus(readableDuration11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = instant1.toString(dateTimeFormatter13);
        org.joda.time.MutableDateTime mutableDateTime15 = instant1.toMutableDateTime();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = gJChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.minuteOfDay();
        org.joda.time.DurationField durationField22 = gJChronology18.centuries();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.halfdayOfDay();
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale24.getDisplayVariant(locale26);
        boolean boolean28 = gJChronology18.equals((java.lang.Object) locale26);
        org.joda.time.DurationField durationField29 = gJChronology18.months();
        org.joda.time.Chronology chronology30 = gJChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology18.yearOfCentury();
        org.joda.time.Chronology chronology32 = gJChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.centuryOfEra();
        org.joda.time.Chronology chronology34 = chronology32.withUTC();
        boolean boolean35 = instant1.equals((java.lang.Object) chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime15", (instant1.compareTo(mutableDateTime15) == 0) == instant1.equals(mutableDateTime15));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        boolean boolean24 = instant22.equals((java.lang.Object) ' ');
        boolean boolean25 = instant16.isEqual((org.joda.time.ReadableInstant) instant22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant28 = instant16.withDurationAdded(readableDuration26, 0);
        org.joda.time.MutableDateTime mutableDateTime29 = instant28.toMutableDateTime();
        org.joda.time.Instant instant31 = instant28.plus(221529803040000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and mutableDateTime29", (instant28.compareTo(mutableDateTime29) == 0) == instant28.equals(mutableDateTime29));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 4320000000L);
        org.joda.time.Instant instant8 = new org.joda.time.Instant(52L);
        boolean boolean9 = instant8.isEqualNow();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant8.plus(readableDuration10);
        long long12 = instant8.getMillis();
        java.lang.String str13 = instant8.toString();
        org.joda.time.Instant instant14 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant8.withDurationAdded(readableDuration15, (int) 'x');
        org.joda.time.Instant instant18 = instant8.toInstant();
        int int19 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = instant8.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime22 = instant8.toDateTimeISO();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfSecond();
        int int29 = instant24.get(dateTimeField28);
        org.joda.time.Instant instant31 = instant24.plus(0L);
        org.joda.time.Instant instant32 = instant31.toInstant();
        org.joda.time.Instant instant34 = new org.joda.time.Instant(52L);
        boolean boolean35 = instant34.isEqualNow();
        java.lang.String str36 = instant34.toString();
        java.lang.String str37 = instant34.toString();
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        boolean boolean40 = instant39.isEqualNow();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant39.plus(readableDuration41);
        boolean boolean43 = instant34.isBefore((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Instant instant45 = instant34.minus((long) 0);
        int int46 = instant31.compareTo((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Instant instant49 = instant31.withDurationAdded((long) 432086114, 97);
        org.joda.time.DateTimeZone dateTimeZone50 = instant31.getZone();
        org.joda.time.Instant instant51 = instant31.toInstant();
        boolean boolean52 = dateTime22.isAfter((org.joda.time.ReadableInstant) instant31);
        org.joda.time.MutableDateTime mutableDateTime53 = instant31.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime54 = instant31.toMutableDateTime();
        boolean boolean56 = mutableDateTime54.isEqual(532542598960L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime22", (instant8.compareTo(dateTime22) == 0) == instant8.equals(dateTime22));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getNameKey((long) 100);
        boolean boolean6 = dateTimeZone3.isFixed();
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        int int8 = gJChronology7.getMinimumDaysInFirstWeek();
        java.lang.String str9 = gJChronology7.toString();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = gJChronology7.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.millisOfSecond();
        int int16 = instant1.get(dateTimeField15);
        long long17 = instant1.getMillis();
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant26 = instant24.withMillis((long) 'u');
        boolean boolean27 = instant19.isBefore((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant28 = instant24.toInstant();
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) instant24);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = gJChronology32.halfdays();
        long long37 = gJChronology32.add((long) 'a', (-1L), (int) (short) 0);
        long long41 = gJChronology32.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField42 = gJChronology32.minuteOfHour();
        org.joda.time.DurationField durationField43 = gJChronology32.hours();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology32.monthOfYear();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology32.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology32.getZone();
        org.joda.time.DateTime dateTime49 = instant1.toDateTime(dateTimeZone48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = instant1.toString(dateTimeFormatter50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime49", (instant19.compareTo(dateTime49) == 0) == instant19.equals(dateTime49));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.yearOfCentury();
        int int16 = instant10.get(dateTimeField15);
        boolean boolean18 = instant10.isAfter(171253440000000000L);
        org.joda.time.Instant instant20 = instant10.plus(115799948L);
        org.joda.time.DateTime dateTime21 = instant10.toDateTimeISO();
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        int int28 = instant23.get(dateTimeField27);
        org.joda.time.Instant instant30 = instant23.plus(0L);
        long long31 = instant23.getMillis();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        java.lang.String str35 = instant33.toString();
        java.lang.String str36 = instant33.toString();
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        boolean boolean39 = instant38.isEqualNow();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant38.plus(readableDuration40);
        boolean boolean42 = instant33.isBefore((org.joda.time.ReadableInstant) instant41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.minus(readableDuration43);
        boolean boolean45 = instant23.isAfter((org.joda.time.ReadableInstant) instant41);
        boolean boolean46 = instant41.isEqualNow();
        org.joda.time.Instant instant47 = instant41.toInstant();
        boolean boolean48 = instant10.isBefore((org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime21", (instant10.compareTo(dateTime21) == 0) == instant10.equals(dateTime21));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.withDurationAdded(115200000L, (int) (short) 1);
        boolean boolean8 = instant7.isBeforeNow();
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = instant7.isSupported(dateTimeFieldType10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((-220870497598236L));
        boolean boolean14 = instant7.isAfter((org.joda.time.ReadableInstant) instant13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.minuteOfDay();
        org.joda.time.DurationField durationField21 = gJChronology17.centuries();
        int int22 = gJChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField23 = gJChronology17.minutes();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology17.minuteOfHour();
        org.joda.time.DurationField durationField25 = gJChronology17.hours();
        org.joda.time.DurationField durationField26 = gJChronology17.minutes();
        org.joda.time.MutableDateTime mutableDateTime27 = instant13.toMutableDateTime((org.joda.time.Chronology) gJChronology17);
        org.joda.time.Instant instant29 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfSecond();
        int int34 = instant29.get(dateTimeField33);
        boolean boolean35 = instant29.isEqualNow();
        org.joda.time.Instant instant36 = instant29.toInstant();
        int int37 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) instant36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 70);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfYear();
        java.lang.String str19 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.weekOfWeekyear();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        int int29 = dateTimeZone26.getOffsetFromLocal(1000L);
        org.joda.time.Chronology chronology30 = gJChronology22.withZone(dateTimeZone26);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, 863999948L, 4);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone26.isLocalDateTimeGap(localDateTime34);
        long long37 = dateTimeZone26.nextTransition((-2247000017L));
        java.util.TimeZone timeZone38 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime39 = instant1.toDateTime(dateTimeZone26);
        java.util.TimeZone timeZone40 = dateTimeZone26.toTimeZone();
        java.lang.String str41 = dateTimeZone26.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime39", (instant1.compareTo(dateTime39) == 0) == instant1.equals(dateTime39));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.Object obj14 = null;
        boolean boolean15 = instant9.equals(obj14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        long long21 = instant17.getMillis();
        java.lang.String str22 = instant17.toString();
        org.joda.time.Instant instant23 = instant17.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant17.withDurationAdded(readableDuration24, (int) 'x');
        org.joda.time.Instant instant27 = instant17.toInstant();
        int int28 = instant9.compareTo((org.joda.time.ReadableInstant) instant17);
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) instant17);
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.weekyearOfCentury();
        org.joda.time.Instant instant35 = gJChronology32.getGregorianCutover();
        org.joda.time.Instant instant37 = instant35.withMillis(0L);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.millisOfSecond();
        int int44 = instant39.get(dateTimeField43);
        org.joda.time.Instant instant46 = instant39.plus(0L);
        int int47 = instant37.compareTo((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Instant instant49 = new org.joda.time.Instant(52L);
        boolean boolean50 = instant49.isEqualNow();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant52 = instant49.plus(readableDuration51);
        boolean boolean54 = instant52.equals((java.lang.Object) ' ');
        boolean boolean55 = instant46.isEqual((org.joda.time.ReadableInstant) instant52);
        org.joda.time.MutableDateTime mutableDateTime56 = instant46.toMutableDateTime();
        boolean boolean57 = instant17.isEqual((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.Instant instant60 = instant17.withDurationAdded((-7304862L), 3120000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime56", (instant1.compareTo(mutableDateTime56) == 0) == instant1.equals(mutableDateTime56));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-64983772799999L));
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Chronology chronology3 = dateTime2.getChronology();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        java.util.Locale locale8 = new java.util.Locale("hi!");
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        boolean boolean13 = dateTimeZone5.equals((java.lang.Object) locale10);
        int int15 = dateTimeZone5.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.weekyearOfCentury();
        org.joda.time.Instant instant21 = gJChronology18.getGregorianCutover();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        int int30 = instant25.get(dateTimeField29);
        org.joda.time.Instant instant32 = instant25.plus(0L);
        int int33 = instant23.compareTo((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant32.isSupported(dateTimeFieldType34);
        int int36 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTime dateTime37 = instant32.toDateTimeISO();
        org.joda.time.Instant instant39 = new org.joda.time.Instant(3155760000000L);
        org.joda.time.Instant instant40 = instant39.toInstant();
        int int41 = dateTime37.compareTo((org.joda.time.ReadableInstant) instant39);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        java.lang.String str45 = instant43.toString();
        org.joda.time.Instant instant47 = new org.joda.time.Instant(52L);
        boolean boolean48 = instant47.isEqualNow();
        java.lang.String str49 = instant47.toString();
        java.lang.String str50 = instant47.toString();
        org.joda.time.Instant instant53 = instant47.withDurationAdded(115200000L, (int) (short) 1);
        int int54 = instant43.compareTo((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Instant instant56 = new org.joda.time.Instant(52L);
        boolean boolean57 = instant56.isEqualNow();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant56.plus(readableDuration58);
        boolean boolean61 = instant59.equals((java.lang.Object) ' ');
        boolean boolean62 = instant47.isAfter((org.joda.time.ReadableInstant) instant59);
        java.lang.String str63 = instant59.toString();
        java.lang.String str64 = instant59.toString();
        boolean boolean65 = dateTime37.isEqual((org.joda.time.ReadableInstant) instant59);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime37.getZone();
        org.joda.time.DateTime dateTime67 = dateTime2.toDateTime(dateTimeZone66);
        java.lang.String str68 = dateTimeZone66.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.yearOfCentury();
        int int16 = instant10.get(dateTimeField15);
        org.joda.time.Instant instant17 = instant10.toInstant();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant10.minus(readableDuration18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfSecond();
        int int26 = instant21.get(dateTimeField25);
        org.joda.time.Instant instant28 = instant21.plus(0L);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DurationField durationField32 = gJChronology31.halfdays();
        org.joda.time.Chronology chronology33 = gJChronology31.withUTC();
        java.lang.String str34 = gJChronology31.toString();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology31.hourOfHalfday();
        int int36 = instant21.get(dateTimeField35);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        boolean boolean39 = instant38.isEqualNow();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant38.plus(readableDuration40);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant45 = instant43.withMillis((long) 'u');
        boolean boolean46 = instant38.isBefore((org.joda.time.ReadableInstant) instant43);
        boolean boolean47 = instant21.isEqual((org.joda.time.ReadableInstant) instant43);
        boolean boolean48 = instant10.isBefore((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Instant instant49 = instant21.toInstant();
        org.joda.time.DateTime dateTime50 = instant49.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant49.withDurationAdded(readableDuration51, 135);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("3929-04-02T00:00:00.051Z");
        org.joda.time.Instant instant3 = instant1.minus(1869000L);
        boolean boolean4 = instant3.isAfterNow();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology7.yearOfCentury();
        org.joda.time.DurationField durationField14 = gJChronology7.days();
        boolean boolean15 = instant3.equals((java.lang.Object) gJChronology7);
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant24 = instant22.withMillis((long) 'u');
        boolean boolean25 = instant17.isBefore((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant28 = instant22.withDurationAdded(4320000000L, (int) 'u');
        boolean boolean29 = instant28.isEqualNow();
        boolean boolean30 = instant28.isBeforeNow();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = gJChronology33.halfdays();
        long long38 = gJChronology33.add((long) 'a', (-1L), (int) (short) 0);
        long long42 = gJChronology33.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology33.minuteOfHour();
        org.joda.time.DurationField durationField44 = gJChronology33.hours();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology33.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology33.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone49 = gJChronology33.getZone();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology33.era();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology33.halfdayOfDay();
        java.lang.String str53 = gJChronology33.toString();
        org.joda.time.Chronology chronology54 = gJChronology33.withUTC();
        org.joda.time.MutableDateTime mutableDateTime55 = instant28.toMutableDateTime(chronology54);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((-315566928000000L));
        org.joda.time.MutableDateTime mutableDateTime58 = instant57.toMutableDateTimeISO();
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        java.lang.String str62 = dateTimeZone60.getNameKey((long) 100);
        boolean boolean63 = dateTimeZone60.isFixed();
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        long long67 = dateTimeZone60.getMillisKeepLocal(dateTimeZone65, (long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime68 = instant57.toMutableDateTime(dateTimeZone65);
        java.util.Date date69 = instant57.toDate();
        boolean boolean70 = instant28.isBefore((org.joda.time.ReadableInstant) instant57);
        int int71 = instant3.compareTo((org.joda.time.ReadableInstant) instant57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and mutableDateTime55", (instant28.compareTo(mutableDateTime55) == 0) == instant28.equals(mutableDateTime55));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology2.getZone();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) locale17);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone12);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.lang.String str24 = locale23.getCountry();
        java.lang.String str25 = locale23.getDisplayName();
        java.lang.String str26 = dateTimeZone12.getName((long) (byte) 0, locale23);
        boolean boolean27 = dateTimeZone12.isFixed();
        org.joda.time.Instant instant29 = new org.joda.time.Instant(52L);
        boolean boolean30 = instant29.isEqualNow();
        java.lang.String str31 = instant29.toString();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        java.lang.String str35 = instant33.toString();
        java.lang.String str36 = instant33.toString();
        org.joda.time.Instant instant39 = instant33.withDurationAdded(115200000L, (int) (short) 1);
        int int40 = instant29.compareTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant42 = new org.joda.time.Instant(52L);
        boolean boolean43 = instant42.isEqualNow();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant42.plus(readableDuration44);
        boolean boolean47 = instant45.equals((java.lang.Object) ' ');
        boolean boolean48 = instant33.isAfter((org.joda.time.ReadableInstant) instant45);
        java.lang.String str49 = instant45.toString();
        int int50 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) instant45);
        java.lang.String str52 = dateTimeZone12.getNameKey((-31535940000L));
        int int54 = dateTimeZone12.getOffsetFromLocal((long) 1582);
        java.lang.String str56 = dateTimeZone12.getShortName((long) 1969);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59);
        org.joda.time.DurationField durationField61 = gJChronology60.halfdays();
        java.util.TimeZone timeZone62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63);
        long long68 = dateTimeZone63.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean70 = dateTimeZone63.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology71 = gJChronology60.withZone(dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime72 = null;
        boolean boolean73 = dateTimeZone63.isLocalDateTimeGap(localDateTime72);
        boolean boolean74 = dateTimeZone63.isFixed();
        org.joda.time.Instant instant76 = new org.joda.time.Instant(52L);
        boolean boolean77 = instant76.isEqualNow();
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.Instant instant79 = instant76.plus(readableDuration78);
        org.joda.time.Instant instant81 = instant76.withMillis((long) 4);
        boolean boolean82 = instant81.isBeforeNow();
        boolean boolean84 = instant81.isBefore(5185792L);
        org.joda.time.MutableDateTime mutableDateTime85 = instant81.toMutableDateTime();
        int int86 = dateTimeZone63.getOffset((org.joda.time.ReadableInstant) mutableDateTime85);
        int int88 = dateTimeZone63.getStandardOffset((-2247000017L));
        boolean boolean90 = dateTimeZone63.isStandardOffset(3732479999399896L);
        long long92 = dateTimeZone63.nextTransition(4315800000L);
        long long94 = dateTimeZone12.getMillisKeepLocal(dateTimeZone63, 747221751617230000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant81 and mutableDateTime85", (instant81.compareTo(mutableDateTime85) == 0) == instant81.equals(mutableDateTime85));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        boolean boolean11 = instant1.equals((java.lang.Object) nameProvider8);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(52L);
        boolean boolean14 = instant13.isEqualNow();
        java.lang.String str15 = instant13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = instant13.getZone();
        org.joda.time.DateTime dateTime17 = instant1.toDateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant1.withDurationAdded(readableDuration18, 73048);
        org.joda.time.Instant instant22 = instant1.plus((-3151007999374L));
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        java.lang.String str26 = instant24.toString();
        java.lang.String str27 = instant24.toString();
        org.joda.time.Instant instant30 = instant24.withDurationAdded(115200000L, (int) (short) 1);
        boolean boolean31 = instant30.isBeforeNow();
        org.joda.time.DateTime dateTime32 = instant30.toDateTimeISO();
        org.joda.time.Instant instant34 = new org.joda.time.Instant(52L);
        boolean boolean35 = instant34.isEqualNow();
        java.lang.String str36 = instant34.toString();
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38);
        java.util.Locale locale41 = new java.util.Locale("hi!");
        java.lang.String str42 = locale41.getCountry();
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale43.getDisplayName();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        boolean boolean46 = dateTimeZone38.equals((java.lang.Object) locale43);
        int int48 = dateTimeZone38.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology51.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology51.weekyearOfCentury();
        org.joda.time.Instant instant54 = gJChronology51.getGregorianCutover();
        org.joda.time.Instant instant56 = instant54.withMillis(0L);
        org.joda.time.Instant instant58 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.millisOfSecond();
        int int63 = instant58.get(dateTimeField62);
        org.joda.time.Instant instant65 = instant58.plus(0L);
        int int66 = instant56.compareTo((org.joda.time.ReadableInstant) instant65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        boolean boolean68 = instant65.isSupported(dateTimeFieldType67);
        int int69 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) instant65);
        boolean boolean70 = instant34.isAfter((org.joda.time.ReadableInstant) instant65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = instant34.toString(dateTimeFormatter71);
        boolean boolean73 = instant34.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone74 = instant34.getZone();
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Instant instant76 = instant34.minus(readableDuration75);
        boolean boolean78 = instant76.isEqual(18934171200000000L);
        org.joda.time.Instant instant80 = new org.joda.time.Instant(3155760000000L);
        org.joda.time.Instant instant81 = instant80.toInstant();
        boolean boolean82 = instant76.equals((java.lang.Object) instant81);
        org.joda.time.ReadableDuration readableDuration83 = null;
        org.joda.time.Instant instant85 = instant81.withDurationAdded(readableDuration83, (-1045470876));
        boolean boolean86 = instant30.isBefore((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Instant instant88 = instant81.withMillis(0L);
        boolean boolean89 = instant22.isEqual((org.joda.time.ReadableInstant) instant81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime32", (instant30.compareTo(dateTime32) == 0) == instant30.equals(dateTime32));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone11 = instant1.getZone();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology14.millis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology14.add(readablePeriod17, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField21 = gJChronology14.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology14);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        long long33 = dateTimeZone28.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean35 = dateTimeZone28.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology36 = gJChronology25.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone28.isLocalDateTimeGap(localDateTime37);
        int int40 = dateTimeZone28.getStandardOffset(4320000000L);
        org.joda.time.DateTime dateTime41 = mutableDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone28.isLocalDateTimeGap(localDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime22", (instant1.compareTo(mutableDateTime22) == 0) == instant1.equals(mutableDateTime22));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        long long17 = gJChronology2.getDateTimeMillis(10, (int) (short) 10, 4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.millisOfDay();
        java.lang.String str19 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.halfdayOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        long long30 = gJChronology25.add((long) 'a', (-1L), (int) (short) 0);
        long long34 = gJChronology25.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField35 = gJChronology25.years();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology25.getZone();
        org.joda.time.Chronology chronology38 = gJChronology2.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology2.days();
        org.joda.time.DurationField durationField40 = gJChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField45 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField45", (durationField35.compareTo(durationField45) == 0) == durationField35.equals(durationField45));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean9 = gJChronology2.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.weekyear();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.millisOfSecond();
        org.joda.time.DurationField durationField19 = gJChronology17.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology17.getZone();
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField26 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField3, and durationField19", !(durationField26.compareTo(durationField3) == 0) || (Math.signum(durationField26.compareTo(durationField19)) == Math.signum(durationField3.compareTo(durationField19))));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = instant1.getZone();
        org.joda.time.Instant instant6 = instant1.minus((-2208729599948L));
        boolean boolean7 = instant1.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTime();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        long long15 = dateTimeZone10.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.era();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.centuryOfEra();
        org.joda.time.Chronology chronology22 = gJChronology18.withUTC();
        org.joda.time.DurationField durationField23 = gJChronology18.years();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str27 = dateTimeZone25.getNameKey((long) 100);
        long long30 = dateTimeZone25.convertLocalToUTC((-2246399965L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.Chronology chronology32 = gJChronology18.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology33 = gJChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology18.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime8.toMutableDateTime((org.joda.time.Chronology) gJChronology18);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = gJChronology39.halfdays();
        long long44 = gJChronology39.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology39.centuryOfEra();
        long long50 = gJChronology39.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DurationField durationField51 = gJChronology39.millis();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime8.toMutableDateTime((org.joda.time.Chronology) gJChronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime36", (instant1.compareTo(mutableDateTime36) == 0) == instant1.equals(mutableDateTime36));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        java.lang.String str21 = instant17.toString();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = gJChronology24.halfdays();
        long long29 = gJChronology24.add(0L, (long) (short) -1, (int) '4');
        org.joda.time.Instant instant30 = gJChronology24.getGregorianCutover();
        boolean boolean31 = instant17.isAfter((org.joda.time.ReadableInstant) instant30);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = gJChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.minuteOfDay();
        org.joda.time.DurationField durationField38 = gJChronology34.centuries();
        int int39 = gJChronology34.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology34.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology34.weekyearOfCentury();
        org.joda.time.DurationField durationField42 = gJChronology34.halfdays();
        java.lang.String str43 = gJChronology34.toString();
        org.joda.time.DurationField durationField44 = gJChronology34.halfdays();
        org.joda.time.DateTime dateTime45 = instant30.toDateTime((org.joda.time.Chronology) gJChronology34);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology34.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime45", (instant30.compareTo(dateTime45) == 0) == instant30.equals(dateTime45));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = gJChronology7.halfdays();
        long long12 = gJChronology7.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean14 = gJChronology7.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology7.clockhourOfDay();
        long long21 = gJChronology7.add(262974600000L, (-4199880L), (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology7.year();
        org.joda.time.MutableDateTime mutableDateTime23 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology7);
        org.joda.time.DateTimeZone dateTimeZone24 = instant1.getZone();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        long long29 = dateTimeZone26.previousTransition((-2246399965L));
        java.lang.String str31 = dateTimeZone26.getShortName(2388787200000000L);
        java.lang.String str33 = dateTimeZone26.getShortName(0L);
        long long35 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, 38226602146199948L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime23", (instant1.compareTo(mutableDateTime23) == 0) == instant1.equals(mutableDateTime23));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.halfdayOfDay();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.withMillis((long) 1970);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = gJChronology12.halfdays();
        long long17 = gJChronology12.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean19 = gJChronology12.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology12.dayOfMonth();
        org.joda.time.DurationField durationField21 = gJChronology12.days();
        org.joda.time.DurationField durationField22 = gJChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology12.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = gJChronology12.add(readablePeriod25, (long) 'a', 7200);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology12.era();
        org.joda.time.MutableDateTime mutableDateTime31 = instant0.toMutableDateTime((org.joda.time.Chronology) gJChronology12);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime31", (instant0.compareTo(mutableDateTime31) == 0) == instant0.equals(mutableDateTime31));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.weekyearOfCentury();
        org.joda.time.Instant instant17 = gJChronology14.getGregorianCutover();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfSecond();
        int int26 = instant21.get(dateTimeField25);
        org.joda.time.Instant instant28 = instant21.plus(0L);
        int int29 = instant19.compareTo((org.joda.time.ReadableInstant) instant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant28.isSupported(dateTimeFieldType30);
        int int32 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant28);
        org.joda.time.DateTime dateTime33 = instant28.toDateTimeISO();
        org.joda.time.Instant instant35 = new org.joda.time.Instant(3155760000000L);
        org.joda.time.Instant instant36 = instant35.toInstant();
        int int37 = dateTime33.compareTo((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        boolean boolean40 = instant39.isEqualNow();
        java.lang.String str41 = instant39.toString();
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        java.lang.String str45 = instant43.toString();
        java.lang.String str46 = instant43.toString();
        org.joda.time.Instant instant49 = instant43.withDurationAdded(115200000L, (int) (short) 1);
        int int50 = instant39.compareTo((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant52 = new org.joda.time.Instant(52L);
        boolean boolean53 = instant52.isEqualNow();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant55 = instant52.plus(readableDuration54);
        boolean boolean57 = instant55.equals((java.lang.Object) ' ');
        boolean boolean58 = instant43.isAfter((org.joda.time.ReadableInstant) instant55);
        java.lang.String str59 = instant55.toString();
        java.lang.String str60 = instant55.toString();
        boolean boolean61 = dateTime33.isEqual((org.joda.time.ReadableInstant) instant55);
        org.joda.time.Instant instant63 = new org.joda.time.Instant(4000L);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = gJChronology66.era();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology66.year();
        org.joda.time.DateTime dateTime69 = instant63.toDateTime((org.joda.time.Chronology) gJChronology66);
        boolean boolean70 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime69);
        java.util.TimeZone timeZone71 = null;
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        org.joda.time.chrono.GJChronology gJChronology73 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone72);
        org.joda.time.DurationField durationField74 = gJChronology73.halfdays();
        org.joda.time.Chronology chronology75 = gJChronology73.withUTC();
        java.lang.String str76 = gJChronology73.toString();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology73.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        org.joda.time.Chronology chronology81 = gJChronology73.withZone(dateTimeZone80);
        long long83 = dateTimeZone80.convertUTCToLocal((-43829L));
        boolean boolean84 = dateTimeZone80.isFixed();
        java.util.TimeZone timeZone85 = dateTimeZone80.toTimeZone();
        long long88 = dateTimeZone80.convertLocalToUTC(262974605200L, true);
        long long92 = dateTimeZone80.convertLocalToUTC(4906220186429268L, false, (-2246400062L));
        boolean boolean93 = dateTimeZone80.isFixed();
        org.joda.time.DateTime dateTime94 = dateTime69.toDateTime(dateTimeZone80);
        java.util.TimeZone timeZone95 = dateTimeZone80.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant63 and dateTime69", (instant63.compareTo(dateTime69) == 0) == instant63.equals(dateTime69));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        long long15 = dateTimeZone11.adjustOffset((long) 0, false);
        int int17 = dateTimeZone11.getOffsetFromLocal((-26438399999L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (byte) 10);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        org.joda.time.Instant instant27 = instant21.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant21.withDurationAdded(readableDuration28, (int) 'x');
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.yearOfCentury();
        int int36 = instant30.get(dateTimeField35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.minuteOfDay();
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = gJChronology41.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology41.minuteOfDay();
        org.joda.time.DurationField durationField45 = gJChronology41.centuries();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology41.dayOfYear();
        java.lang.String str47 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology41.dayOfYear();
        org.joda.time.Chronology chronology49 = gJChronology41.withUTC();
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology41.getZone();
        org.joda.time.Chronology chronology51 = gJChronology37.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField52 = gJChronology37.years();
        java.lang.String str53 = gJChronology37.toString();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology37.era();
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = gJChronology57.halfdays();
        long long62 = gJChronology57.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField63 = gJChronology57.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology57.centuryOfEra();
        long long68 = gJChronology57.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DurationField durationField69 = gJChronology57.hours();
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.Chronology chronology72 = gJChronology57.withZone(dateTimeZone71);
        org.joda.time.DurationField durationField73 = gJChronology57.centuries();
        org.joda.time.DateTimeZone dateTimeZone74 = gJChronology57.getZone();
        org.joda.time.Chronology chronology75 = gJChronology37.withZone(dateTimeZone74);
        org.joda.time.DurationField durationField76 = gJChronology37.hours();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology37.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField69 and durationField76", (durationField69.compareTo(durationField76) == 0) == durationField69.equals(durationField76));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.hourOfDay();
        org.joda.time.DurationField durationField22 = gJChronology2.days();
        org.joda.time.DurationField durationField23 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField24 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField25 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField13", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField13)) == Math.signum(durationField3.compareTo(durationField13))));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology2.add(readablePeriod13, (long) '#', (int) (byte) 1);
        java.lang.String str17 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField20 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField3, and durationField12", !(durationField20.compareTo(durationField3) == 0) || (Math.signum(durationField20.compareTo(durationField12)) == Math.signum(durationField3.compareTo(durationField12))));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology2.add(readablePeriod8, (-42L), (int) '4');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology2.add(readablePeriod12, (long) 432000001, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField17 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = gJChronology19.halfdays();
        long long24 = gJChronology19.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology19.secondOfMinute();
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.plus(readableDuration30);
        boolean boolean32 = gJChronology19.equals((java.lang.Object) instant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = instant28.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = instant28.isSupported(dateTimeFieldType35);
        org.joda.time.DateTimeZone dateTimeZone37 = instant28.getZone();
        boolean boolean38 = instant1.isAfter((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Instant instant40 = instant28.plus((long) 4);
        java.util.Date date41 = instant28.toDate();
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant45 = instant43.withMillis((long) 'u');
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = gJChronology48.halfdays();
        long long53 = gJChronology48.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean55 = gJChronology48.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField56 = gJChronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology48.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology48.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology48.clockhourOfHalfday();
        org.joda.time.DateTime dateTime60 = instant43.toDateTime((org.joda.time.Chronology) gJChronology48);
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62);
        org.joda.time.DurationField durationField64 = gJChronology63.halfdays();
        long long68 = gJChronology63.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean70 = gJChronology63.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField71 = gJChronology63.dayOfMonth();
        org.joda.time.DateTime dateTime72 = instant43.toDateTime((org.joda.time.Chronology) gJChronology63);
        boolean boolean73 = instant43.isBeforeNow();
        boolean boolean74 = instant28.isAfter((org.joda.time.ReadableInstant) instant43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime60", (instant1.compareTo(dateTime60) == 0) == instant1.equals(dateTime60));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        int int17 = dateTimeZone15.getOffsetFromLocal(97000L);
        org.joda.time.Chronology chronology18 = gJChronology2.withZone(dateTimeZone15);
        org.joda.time.Instant instant20 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.millisOfSecond();
        int int25 = instant20.get(dateTimeField24);
        org.joda.time.Instant instant27 = instant20.plus(0L);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = gJChronology30.halfdays();
        org.joda.time.Chronology chronology32 = gJChronology30.withUTC();
        java.lang.String str33 = gJChronology30.toString();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology30.hourOfHalfday();
        int int35 = instant20.get(dateTimeField34);
        org.joda.time.Instant instant37 = new org.joda.time.Instant(52L);
        boolean boolean38 = instant37.isEqualNow();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant37.plus(readableDuration39);
        org.joda.time.Instant instant42 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant44 = instant42.withMillis((long) 'u');
        boolean boolean45 = instant37.isBefore((org.joda.time.ReadableInstant) instant42);
        boolean boolean46 = instant20.isEqual((org.joda.time.ReadableInstant) instant42);
        org.joda.time.DateTime dateTime47 = instant20.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime47.getZone();
        int int49 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime47);
        java.lang.String str50 = dateTimeZone15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime47", (instant20.compareTo(dateTime47) == 0) == instant20.equals(dateTime47));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.weeks();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        org.joda.time.Instant instant13 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField15 = gJChronology2.weeks();
        org.joda.time.Chronology chronology16 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField18 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField12", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField12)) == Math.signum(durationField3.compareTo(durationField12))));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField11 = gJChronology2.weeks();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.minuteOfDay();
        org.joda.time.DurationField durationField21 = gJChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.dayOfYear();
        java.lang.String str23 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology17.getZone();
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.lang.String str31 = locale30.getCountry();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        boolean boolean35 = dateTimeZone27.equals((java.lang.Object) locale32);
        org.joda.time.Chronology chronology36 = gJChronology17.withZone(dateTimeZone27);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.lang.String str39 = locale38.getCountry();
        java.lang.String str40 = locale38.getDisplayName();
        java.lang.String str41 = dateTimeZone27.getName((long) (byte) 0, locale38);
        boolean boolean42 = dateTimeZone27.isFixed();
        org.joda.time.Instant instant44 = new org.joda.time.Instant(52L);
        boolean boolean45 = instant44.isEqualNow();
        java.lang.String str46 = instant44.toString();
        org.joda.time.Instant instant48 = new org.joda.time.Instant(52L);
        boolean boolean49 = instant48.isEqualNow();
        java.lang.String str50 = instant48.toString();
        java.lang.String str51 = instant48.toString();
        org.joda.time.Instant instant54 = instant48.withDurationAdded(115200000L, (int) (short) 1);
        int int55 = instant44.compareTo((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Instant instant57 = new org.joda.time.Instant(52L);
        boolean boolean58 = instant57.isEqualNow();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant60 = instant57.plus(readableDuration59);
        boolean boolean62 = instant60.equals((java.lang.Object) ' ');
        boolean boolean63 = instant48.isAfter((org.joda.time.ReadableInstant) instant60);
        java.lang.String str64 = instant60.toString();
        int int65 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) instant60);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant60);
        org.joda.time.MutableDateTime mutableDateTime67 = instant60.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime67.getZone();
        org.joda.time.Chronology chronology69 = gJChronology2.withZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant44 and mutableDateTime67", (instant44.compareTo(mutableDateTime67) == 0) == instant44.equals(mutableDateTime67));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale4 = new java.util.Locale("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale4.getDisplayScript(locale6);
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) locale6);
        int int11 = dateTimeZone1.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.weekyearOfCentury();
        org.joda.time.Instant instant17 = gJChronology14.getGregorianCutover();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology24.millisOfSecond();
        int int26 = instant21.get(dateTimeField25);
        org.joda.time.Instant instant28 = instant21.plus(0L);
        int int29 = instant19.compareTo((org.joda.time.ReadableInstant) instant28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant28.isSupported(dateTimeFieldType30);
        int int32 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant28);
        long long35 = dateTimeZone1.adjustOffset((-60479999899948L), true);
        org.joda.time.Instant instant37 = new org.joda.time.Instant(4000L);
        boolean boolean39 = instant37.isAfter((-8567999948L));
        org.joda.time.Instant instant41 = instant37.plus((long) 104);
        org.joda.time.MutableDateTime mutableDateTime42 = instant41.toMutableDateTimeISO();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology45.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.weekyearOfCentury();
        org.joda.time.Instant instant48 = gJChronology45.getGregorianCutover();
        org.joda.time.Instant instant50 = instant48.withMillis(0L);
        org.joda.time.Instant instant52 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.millisOfSecond();
        int int57 = instant52.get(dateTimeField56);
        org.joda.time.Instant instant59 = instant52.plus(0L);
        int int60 = instant50.compareTo((org.joda.time.ReadableInstant) instant59);
        org.joda.time.Instant instant62 = new org.joda.time.Instant(52L);
        boolean boolean63 = instant62.isEqualNow();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Instant instant65 = instant62.plus(readableDuration64);
        boolean boolean67 = instant65.equals((java.lang.Object) ' ');
        boolean boolean68 = instant59.isEqual((org.joda.time.ReadableInstant) instant65);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = instant59.isSupported(dateTimeFieldType69);
        boolean boolean71 = mutableDateTime42.isAfter((org.joda.time.ReadableInstant) instant59);
        int int72 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant41 and mutableDateTime42", (instant41.compareTo(mutableDateTime42) == 0) == instant41.equals(mutableDateTime42));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add(0L, (long) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        java.lang.String str16 = gJChronology10.toString();
        org.joda.time.DurationField durationField17 = gJChronology10.years();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology22 = gJChronology10.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField24 = gJChronology2.halfdays();
        org.joda.time.Instant instant25 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant27 = instant25.withMillis((long) (short) -1);
        org.joda.time.Instant instant30 = instant27.withDurationAdded((long) (-5914428), 236785);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        long long36 = instant32.getMillis();
        java.lang.String str37 = instant32.toString();
        org.joda.time.Instant instant38 = instant32.toInstant();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant41 = instant32.withDurationAdded(readableDuration39, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone42 = instant32.getZone();
        org.joda.time.Instant instant44 = new org.joda.time.Instant(52L);
        boolean boolean45 = instant44.isEqualNow();
        java.lang.String str46 = instant44.toString();
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48);
        java.util.Locale locale51 = new java.util.Locale("hi!");
        java.lang.String str52 = locale51.getCountry();
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getDisplayName();
        java.lang.String str55 = locale51.getDisplayScript(locale53);
        boolean boolean56 = dateTimeZone48.equals((java.lang.Object) locale53);
        int int58 = dateTimeZone48.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology61.weekyearOfCentury();
        org.joda.time.Instant instant64 = gJChronology61.getGregorianCutover();
        org.joda.time.Instant instant66 = instant64.withMillis(0L);
        org.joda.time.Instant instant68 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70);
        org.joda.time.DateTimeField dateTimeField72 = gJChronology71.millisOfSecond();
        int int73 = instant68.get(dateTimeField72);
        org.joda.time.Instant instant75 = instant68.plus(0L);
        int int76 = instant66.compareTo((org.joda.time.ReadableInstant) instant75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = null;
        boolean boolean78 = instant75.isSupported(dateTimeFieldType77);
        int int79 = dateTimeZone48.getOffset((org.joda.time.ReadableInstant) instant75);
        boolean boolean80 = instant44.isAfter((org.joda.time.ReadableInstant) instant75);
        org.joda.time.Instant instant82 = instant75.withMillis((long) 10);
        boolean boolean83 = instant32.isEqual((org.joda.time.ReadableInstant) instant82);
        org.joda.time.Chronology chronology84 = instant32.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = null;
        boolean boolean86 = instant32.isSupported(dateTimeFieldType85);
        org.joda.time.DateTimeZone dateTimeZone87 = instant32.getZone();
        org.joda.time.Instant instant89 = instant32.withMillis((long) 87696);
        org.joda.time.Instant instant91 = instant32.plus(262975270000L);
        int int92 = instant27.compareTo((org.joda.time.ReadableInstant) instant91);
        org.joda.time.Instant instant93 = instant91.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = null;
        java.lang.String str95 = instant93.toString(dateTimeFormatter94);
        org.joda.time.DateTime dateTime96 = instant93.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime97 = instant93.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant93 and dateTime96", (instant93.compareTo(dateTime96) == 0) == instant93.equals(dateTime96));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        boolean boolean12 = instant10.isAfter(259199996880000L);
        org.joda.time.DateTime dateTime13 = instant10.toDateTime();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = gJChronology16.halfdays();
        long long21 = gJChronology16.add(0L, (long) (short) -1, (int) '4');
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.hourOfDay();
        org.joda.time.DurationField durationField23 = gJChronology16.centuries();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology16.secondOfDay();
        boolean boolean25 = dateTime13.equals((java.lang.Object) gJChronology16);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology16.minuteOfHour();
        long long30 = gJChronology16.add(3155764200000L, (-928711L), 0);
        org.joda.time.DurationField durationField31 = gJChronology16.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime13", (instant1.compareTo(dateTime13) == 0) == instant1.equals(dateTime13));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        long long13 = gJChronology2.add(262974600000L, (long) (byte) 100, (int) '4');
        org.joda.time.DurationField durationField14 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField18 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField20 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField20", (durationField18.compareTo(durationField20) == 0) == durationField18.equals(durationField20));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology2.add(readablePeriod8, (-42L), (int) '4');
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField14 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.centuryOfEra();
        org.joda.time.Chronology chronology13 = gJChronology9.withUTC();
        org.joda.time.Chronology chronology14 = gJChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = gJChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.secondOfDay();
        org.joda.time.DurationField durationField18 = gJChronology9.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField18", Math.signum(durationField16.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField16)));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = new org.joda.time.Instant(52L);
        boolean boolean3 = instant2.isEqualNow();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.plus(readableDuration4);
        long long6 = instant2.getMillis();
        java.lang.String str7 = instant2.toString();
        org.joda.time.Instant instant8 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone12 = instant2.getZone();
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        java.lang.String str16 = instant14.toString();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        java.util.Locale locale21 = new java.util.Locale("hi!");
        java.lang.String str22 = locale21.getCountry();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale23.getDisplayName();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        boolean boolean26 = dateTimeZone18.equals((java.lang.Object) locale23);
        int int28 = dateTimeZone18.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.weekyearOfCentury();
        org.joda.time.Instant instant34 = gJChronology31.getGregorianCutover();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = gJChronology41.millisOfSecond();
        int int43 = instant38.get(dateTimeField42);
        org.joda.time.Instant instant45 = instant38.plus(0L);
        int int46 = instant36.compareTo((org.joda.time.ReadableInstant) instant45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = instant45.isSupported(dateTimeFieldType47);
        int int49 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant45);
        boolean boolean50 = instant14.isAfter((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Instant instant52 = instant45.withMillis((long) 10);
        boolean boolean53 = instant2.isEqual((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant2.getChronology();
        boolean boolean55 = instant0.isBefore((org.joda.time.ReadableInstant) instant2);
        java.lang.String str56 = instant0.toString();
        org.joda.time.MutableDateTime mutableDateTime57 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant60 = instant0.withDurationAdded(55296000000L, 35);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = instant60.isSupported(dateTimeFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime57", (instant0.compareTo(mutableDateTime57) == 0) == instant0.equals(mutableDateTime57));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        boolean boolean11 = instant1.equals((java.lang.Object) nameProvider8);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(52L);
        boolean boolean14 = instant13.isEqualNow();
        java.lang.String str15 = instant13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = instant13.getZone();
        org.joda.time.DateTime dateTime17 = instant1.toDateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant1.withDurationAdded(readableDuration18, 73048);
        org.joda.time.Chronology chronology21 = instant20.getChronology();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str25 = dateTimeZone23.getNameKey((long) 100);
        boolean boolean26 = dateTimeZone23.isFixed();
        java.util.Locale locale30 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str31 = dateTimeZone23.getName((long) (short) 10, locale30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Chronology chronology39 = instant33.getChronology();
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant33);
        long long41 = instant33.getMillis();
        java.lang.String str42 = instant33.toString();
        org.joda.time.Chronology chronology43 = instant33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant33.toMutableDateTimeISO();
        boolean boolean46 = instant33.isAfter(1555200003600000L);
        boolean boolean47 = instant20.isEqual((org.joda.time.ReadableInstant) instant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime44", (instant20.compareTo(mutableDateTime44) == 0) == instant20.equals(mutableDateTime44));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true, 0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) (short) 0);
        boolean boolean10 = dateTimeZone1.isStandardOffset((long) 0);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.halfdayOfDay();
        int int18 = instant11.get(dateTimeField17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        long long25 = dateTimeZone20.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean27 = dateTimeZone20.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology28.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime31 = instant11.toMutableDateTime((org.joda.time.Chronology) gJChronology28);
        int int32 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) mutableDateTime31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = gJChronology35.halfdays();
        long long40 = gJChronology35.add(0L, (long) (short) -1, (int) '4');
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField44 = gJChronology43.halfdays();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology43.minuteOfDay();
        org.joda.time.DurationField durationField47 = gJChronology43.centuries();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology43.dayOfYear();
        java.lang.String str49 = gJChronology43.toString();
        org.joda.time.DurationField durationField50 = gJChronology43.years();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology43.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology55 = gJChronology43.withZone(dateTimeZone54);
        org.joda.time.Chronology chronology56 = gJChronology35.withZone(dateTimeZone54);
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        java.lang.String str59 = dateTimeZone54.getNameKey(170400410L);
        java.lang.String str61 = dateTimeZone54.getName(0L);
        org.joda.time.DateTime dateTime62 = mutableDateTime31.toDateTime(dateTimeZone54);
        java.lang.String str63 = dateTimeZone54.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime31", (instant11.compareTo(mutableDateTime31) == 0) == instant11.equals(mutableDateTime31));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        long long16 = gJChronology11.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean18 = gJChronology11.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology11.dayOfMonth();
        org.joda.time.DurationField durationField20 = gJChronology11.days();
        long long24 = gJChronology11.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DurationField durationField25 = gJChronology11.years();
        java.lang.String str26 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology11.hourOfDay();
        boolean boolean28 = instant8.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTime dateTime29 = instant8.toDateTime();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.weekyear();
        org.joda.time.DurationField durationField35 = gJChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology32.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology32.clockhourOfDay();
        org.joda.time.DateTime dateTime40 = dateTime29.toDateTime((org.joda.time.Chronology) gJChronology32);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology32.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime29", (instant1.compareTo(dateTime29) == 0) == instant1.equals(dateTime29));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 4320000000L);
        java.lang.String str7 = dateTimeZone2.getID();
        boolean boolean8 = dateTimeZone2.isFixed();
        long long10 = dateTimeZone2.nextTransition((-3155673600052L));
        java.lang.String str11 = dateTimeZone2.getID();
        int int13 = dateTimeZone2.getOffset(17295368605L);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = gJChronology16.halfdays();
        long long21 = gJChronology16.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.secondOfMinute();
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        boolean boolean26 = instant25.isEqualNow();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant25.plus(readableDuration27);
        boolean boolean29 = gJChronology16.equals((java.lang.Object) instant25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = instant25.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = instant25.isSupported(dateTimeFieldType32);
        boolean boolean34 = instant25.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime35 = instant25.toMutableDateTime();
        int int36 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and mutableDateTime35", (instant25.compareTo(mutableDateTime35) == 0) == instant25.equals(mutableDateTime35));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        boolean boolean6 = instant4.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, 4320000000L);
        boolean boolean14 = instant4.equals((java.lang.Object) 4320000000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = instant4.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime17 = instant4.toDateTimeISO();
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant21 = instant19.withMillis((long) 'u');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = gJChronology24.halfdays();
        long long29 = gJChronology24.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean31 = gJChronology24.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology24.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTime dateTime36 = instant19.toDateTime((org.joda.time.Chronology) gJChronology24);
        java.lang.String str37 = dateTime36.toString();
        long long38 = dateTime36.getMillis();
        long long39 = dateTime36.getMillis();
        boolean boolean40 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = dateTime36.toString(dateTimeFormatter41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime17", (instant1.compareTo(dateTime17) == 0) == instant1.equals(dateTime17));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = gJChronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.minuteOfDay();
        org.joda.time.DurationField durationField24 = gJChronology20.centuries();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.halfdayOfDay();
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        boolean boolean30 = gJChronology20.equals((java.lang.Object) locale28);
        org.joda.time.DateTime dateTime31 = instant7.toDateTime((org.joda.time.Chronology) gJChronology20);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        boolean boolean39 = instant33.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = instant33.toString(dateTimeFormatter40);
        boolean boolean42 = instant33.isAfterNow();
        org.joda.time.Instant instant43 = instant33.toInstant();
        org.joda.time.Instant instant45 = instant33.plus(1512000000L);
        java.util.Date date46 = instant45.toDate();
        boolean boolean47 = dateTime31.isAfter((org.joda.time.ReadableInstant) instant45);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = instant45.isSupported(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime31", (instant7.compareTo(dateTime31) == 0) == instant7.equals(dateTime31));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        java.lang.String str10 = gJChronology2.toString();
        org.joda.time.Chronology chronology11 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField13 = gJChronology2.eras();
        org.joda.time.DurationField durationField14 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField14", Math.signum(durationField3.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField3)));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-220870497598236L));
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = new org.joda.time.Instant(52L);
        boolean boolean5 = instant4.isEqualNow();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant4.plus(readableDuration6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant11 = instant9.withMillis((long) 'u');
        boolean boolean12 = instant4.isBefore((org.joda.time.ReadableInstant) instant9);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = gJChronology15.halfdays();
        long long20 = gJChronology15.add((long) 'a', (-1L), (int) (short) 0);
        long long24 = gJChronology15.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology15.minuteOfHour();
        org.joda.time.DurationField durationField26 = gJChronology15.hours();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology15.weekOfWeekyear();
        org.joda.time.DateTime dateTime28 = instant9.toDateTime((org.joda.time.Chronology) gJChronology15);
        boolean boolean29 = instant1.isBefore((org.joda.time.ReadableInstant) dateTime28);
        long long30 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime28", (instant4.compareTo(dateTime28) == 0) == instant4.equals(dateTime28));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-2246399965L));
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) 3732479999999948L);
        boolean boolean5 = instant1.equals((java.lang.Object) instant4);
        org.joda.time.Instant instant6 = instant1.toInstant();
        boolean boolean8 = instant6.isEqual(34712646282798L);
        org.joda.time.Chronology chronology9 = instant6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime2", (instant6.compareTo(dateTime2) == 0) == instant6.equals(dateTime2));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-8380800000L));
        java.lang.String str10 = dateTimeZone1.getName((-24192000000000L));
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        long long18 = gJChronology13.add((long) 'a', (-1L), (int) (short) 0);
        long long22 = gJChronology13.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField23 = gJChronology13.years();
        org.joda.time.Instant instant24 = gJChronology13.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        org.joda.time.DurationField durationField30 = gJChronology28.millis();
        org.joda.time.DurationField durationField31 = gJChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.dayOfMonth();
        org.joda.time.DateTime dateTime33 = instant24.toDateTime((org.joda.time.Chronology) gJChronology28);
        org.joda.time.Instant instant35 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.millisOfSecond();
        int int40 = instant35.get(dateTimeField39);
        boolean boolean41 = instant35.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider42 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider42);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider42);
        boolean boolean45 = instant35.equals((java.lang.Object) nameProvider42);
        org.joda.time.Instant instant47 = instant35.minus(0L);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant35.minus(readableDuration48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant52 = instant35.withDurationAdded(readableDuration50, 1582);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        org.joda.time.DurationField durationField56 = gJChronology55.halfdays();
        long long60 = gJChronology55.add((long) 'a', (-1L), (int) (short) 0);
        long long64 = gJChronology55.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField65 = gJChronology55.minuteOfHour();
        org.joda.time.DurationField durationField66 = gJChronology55.hours();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology55.monthOfYear();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology55.secondOfMinute();
        org.joda.time.Chronology chronology69 = gJChronology55.withUTC();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.hourOfHalfday();
        org.joda.time.DateTime dateTime71 = instant35.toDateTime(chronology69);
        int int72 = dateTime33.compareTo((org.joda.time.ReadableInstant) instant35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime71", (instant35.compareTo(dateTime71) == 0) == instant35.equals(dateTime71));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey((long) 100);
        boolean boolean15 = dateTimeZone12.isFixed();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.lang.String str17 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime18 = instant10.toDateTime(dateTimeZone12);
        java.lang.String str20 = dateTimeZone12.getNameKey((-5919628L));
        long long24 = dateTimeZone12.convertLocalToUTC(42L, true, 10229112000000L);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone12.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime11 = instant1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = instant1.getZone();
        long long14 = dateTimeZone12.nextTransition((long) 600000);
        long long16 = dateTimeZone12.previousTransition((-359088681600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime11", (instant1.compareTo(dateTime11) == 0) == instant1.equals(dateTime11));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        java.lang.String str20 = instant18.toString();
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        boolean boolean23 = instant22.isEqualNow();
        java.lang.String str24 = instant22.toString();
        java.lang.String str25 = instant22.toString();
        org.joda.time.Instant instant28 = instant22.withDurationAdded(115200000L, (int) (short) 1);
        int int29 = instant18.compareTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant31 = new org.joda.time.Instant(52L);
        boolean boolean32 = instant31.isEqualNow();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant31.plus(readableDuration33);
        boolean boolean36 = instant34.equals((java.lang.Object) ' ');
        boolean boolean37 = instant22.isAfter((org.joda.time.ReadableInstant) instant34);
        int int38 = instant1.compareTo((org.joda.time.ReadableInstant) instant22);
        long long39 = instant1.getMillis();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant42 = instant1.withDurationAdded(readableDuration40, 12);
        org.joda.time.Instant instant44 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology47.millisOfSecond();
        int int49 = instant44.get(dateTimeField48);
        org.joda.time.Instant instant51 = instant44.plus(0L);
        org.joda.time.Instant instant52 = instant51.toInstant();
        org.joda.time.Instant instant54 = new org.joda.time.Instant(52L);
        boolean boolean55 = instant54.isEqualNow();
        java.lang.String str56 = instant54.toString();
        java.lang.String str57 = instant54.toString();
        org.joda.time.Instant instant59 = new org.joda.time.Instant(52L);
        boolean boolean60 = instant59.isEqualNow();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant62 = instant59.plus(readableDuration61);
        boolean boolean63 = instant54.isBefore((org.joda.time.ReadableInstant) instant62);
        org.joda.time.Instant instant65 = instant54.minus((long) 0);
        int int66 = instant51.compareTo((org.joda.time.ReadableInstant) instant54);
        org.joda.time.Instant instant69 = instant54.withDurationAdded((long) (short) 100, 70);
        org.joda.time.ReadableInstant readableInstant70 = null;
        boolean boolean71 = instant54.isBefore(readableInstant70);
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.Instant instant74 = instant54.withDurationAdded(readableDuration72, 10);
        org.joda.time.Instant instant75 = instant54.toInstant();
        boolean boolean76 = instant1.isEqual((org.joda.time.ReadableInstant) instant75);
        boolean boolean78 = instant75.isEqual((-1202L));
        java.util.TimeZone timeZone79 = null;
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone79);
        org.joda.time.chrono.GJChronology gJChronology81 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone80);
        org.joda.time.DurationField durationField82 = gJChronology81.halfdays();
        org.joda.time.DateTimeField dateTimeField83 = gJChronology81.millisOfDay();
        org.joda.time.DateTimeField dateTimeField84 = gJChronology81.minuteOfDay();
        org.joda.time.DurationField durationField85 = gJChronology81.centuries();
        org.joda.time.DateTimeField dateTimeField86 = gJChronology81.dayOfYear();
        java.lang.String str87 = gJChronology81.toString();
        org.joda.time.DateTimeField dateTimeField88 = gJChronology81.dayOfYear();
        org.joda.time.DateTimeField dateTimeField89 = gJChronology81.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField90 = gJChronology81.clockhourOfDay();
        org.joda.time.DurationField durationField91 = gJChronology81.months();
        org.joda.time.DurationField durationField92 = gJChronology81.seconds();
        org.joda.time.DateTimeField dateTimeField93 = gJChronology81.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime94 = instant75.toMutableDateTime((org.joda.time.Chronology) gJChronology81);
        org.joda.time.Chronology chronology95 = gJChronology81.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime94", (instant1.compareTo(mutableDateTime94) == 0) == instant1.equals(mutableDateTime94));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) (short) 0);
        org.joda.time.Instant instant12 = instant1.plus(35000L);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        long long23 = instant19.getMillis();
        java.lang.String str24 = instant19.toString();
        org.joda.time.Instant instant25 = instant19.toInstant();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant28 = instant19.withDurationAdded(readableDuration26, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = instant19.isSupported(dateTimeFieldType29);
        boolean boolean31 = instant14.isEqual((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Chronology chronology32 = instant19.getChronology();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant35 = instant19.withDurationAdded(readableDuration33, 2);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        int int38 = instant12.compareTo((org.joda.time.ReadableInstant) instant37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        long long45 = dateTimeZone40.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean47 = dateTimeZone40.equals((java.lang.Object) true);
        long long51 = dateTimeZone40.convertLocalToUTC((long) 'a', true, 0L);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        int int55 = dateTimeZone53.getOffsetFromLocal((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        long long60 = dateTimeZone53.getMillisKeepLocal(dateTimeZone58, (-61827926399999L));
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getDisplayLanguage();
        java.lang.String str64 = dateTimeZone58.getShortName(186805440000000000L, locale62);
        long long66 = dateTimeZone40.getMillisKeepLocal(dateTimeZone58, 43200100L);
        java.util.Locale locale69 = new java.util.Locale("hi!");
        java.lang.String str70 = locale69.getCountry();
        java.lang.String str71 = locale69.getLanguage();
        java.lang.String str72 = locale69.getDisplayVariant();
        java.lang.String str73 = dateTimeZone58.getShortName(12888000000L, locale69);
        long long75 = dateTimeZone58.nextTransition(3155760001170L);
        long long78 = dateTimeZone58.adjustOffset(3155760001170L, false);
        org.joda.time.MutableDateTime mutableDateTime79 = instant12.toMutableDateTime(dateTimeZone58);
        int int81 = dateTimeZone58.getStandardOffset(876106140000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime79", (instant12.compareTo(mutableDateTime79) == 0) == instant12.equals(mutableDateTime79));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        java.lang.String str21 = instant17.toString();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = gJChronology24.halfdays();
        long long29 = gJChronology24.add(0L, (long) (short) -1, (int) '4');
        org.joda.time.Instant instant30 = gJChronology24.getGregorianCutover();
        boolean boolean31 = instant17.isAfter((org.joda.time.ReadableInstant) instant30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant17.minus(readableDuration32);
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTimeISO();
        org.joda.time.Instant instant36 = new org.joda.time.Instant(52L);
        boolean boolean37 = instant36.isEqualNow();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant36.plus(readableDuration38);
        long long40 = instant36.getMillis();
        java.lang.String str41 = instant36.toString();
        org.joda.time.Instant instant42 = instant36.toInstant();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant36.withDurationAdded(readableDuration43, (int) 'x');
        org.joda.time.DateTimeZone dateTimeZone46 = instant36.getZone();
        org.joda.time.Instant instant48 = new org.joda.time.Instant(52L);
        boolean boolean49 = instant48.isEqualNow();
        java.lang.String str50 = instant48.toString();
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.lang.String str56 = locale55.getCountry();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getDisplayName();
        java.lang.String str59 = locale55.getDisplayScript(locale57);
        boolean boolean60 = dateTimeZone52.equals((java.lang.Object) locale57);
        int int62 = dateTimeZone52.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology65.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology65.weekyearOfCentury();
        org.joda.time.Instant instant68 = gJChronology65.getGregorianCutover();
        org.joda.time.Instant instant70 = instant68.withMillis(0L);
        org.joda.time.Instant instant72 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.chrono.GJChronology gJChronology75 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField76 = gJChronology75.millisOfSecond();
        int int77 = instant72.get(dateTimeField76);
        org.joda.time.Instant instant79 = instant72.plus(0L);
        int int80 = instant70.compareTo((org.joda.time.ReadableInstant) instant79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = null;
        boolean boolean82 = instant79.isSupported(dateTimeFieldType81);
        int int83 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) instant79);
        boolean boolean84 = instant48.isAfter((org.joda.time.ReadableInstant) instant79);
        org.joda.time.Instant instant86 = instant79.withMillis((long) 10);
        boolean boolean87 = instant36.isEqual((org.joda.time.ReadableInstant) instant86);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = null;
        java.lang.String str89 = instant36.toString(dateTimeFormatter88);
        boolean boolean90 = instant33.isAfter((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Instant instant91 = instant33.toInstant();
        java.util.TimeZone timeZone92 = null;
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forTimeZone(timeZone92);
        org.joda.time.chrono.GJChronology gJChronology94 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone93);
        org.joda.time.DateTimeField dateTimeField95 = gJChronology94.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField96 = gJChronology94.weekyearOfCentury();
        org.joda.time.DurationField durationField97 = gJChronology94.months();
        org.joda.time.DateTimeField dateTimeField98 = gJChronology94.weekOfWeekyear();
        int int99 = instant91.get(dateTimeField98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime34", (instant1.compareTo(mutableDateTime34) == 0) == instant1.equals(mutableDateTime34));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        org.joda.time.Instant instant17 = instant16.toInstant();
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        java.lang.String str21 = instant19.toString();
        java.lang.String str22 = instant19.toString();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant24.plus(readableDuration26);
        boolean boolean28 = instant19.isBefore((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Instant instant30 = instant19.minus((long) 0);
        int int31 = instant16.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant34 = instant19.withDurationAdded((long) (short) 100, 70);
        org.joda.time.MutableDateTime mutableDateTime35 = instant34.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = instant34.getZone();
        org.joda.time.Instant instant38 = instant34.withMillis(37300317264000L);
        boolean boolean39 = instant1.isBefore((org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant34 and mutableDateTime35", (instant34.compareTo(mutableDateTime35) == 0) == instant34.equals(mutableDateTime35));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 4320000000L);
        org.joda.time.Instant instant8 = new org.joda.time.Instant(52L);
        boolean boolean9 = instant8.isEqualNow();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant8.plus(readableDuration10);
        long long12 = instant8.getMillis();
        java.lang.String str13 = instant8.toString();
        org.joda.time.Instant instant14 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant8.withDurationAdded(readableDuration15, (int) 'x');
        org.joda.time.Instant instant18 = instant8.toInstant();
        int int19 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant21.plus(readableDuration23);
        long long25 = instant21.getMillis();
        java.lang.String str26 = instant21.toString();
        boolean boolean28 = instant21.isAfter((long) (-1));
        java.lang.Object obj29 = null;
        boolean boolean30 = instant21.equals(obj29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant21.minus(readableDuration31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant21);
        org.joda.time.DateTimeZone dateTimeZone34 = instant21.getZone();
        org.joda.time.Instant instant36 = new org.joda.time.Instant(52L);
        boolean boolean37 = instant36.isEqualNow();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant36.plus(readableDuration38);
        long long40 = instant36.getMillis();
        java.lang.String str41 = instant36.toString();
        boolean boolean43 = instant36.isAfter((long) (-1));
        java.lang.Object obj44 = null;
        boolean boolean45 = instant36.equals(obj44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant36.minus(readableDuration46);
        org.joda.time.Instant instant49 = new org.joda.time.Instant(52L);
        boolean boolean50 = instant49.isEqualNow();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant52 = instant49.plus(readableDuration51);
        boolean boolean54 = instant52.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        long long61 = dateTimeZone57.getMillisKeepLocal(dateTimeZone59, 4320000000L);
        boolean boolean62 = instant52.equals((java.lang.Object) 4320000000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = instant52.isSupported(dateTimeFieldType63);
        boolean boolean65 = instant47.isAfter((org.joda.time.ReadableInstant) instant52);
        java.util.TimeZone timeZone66 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        org.joda.time.chrono.GJChronology gJChronology68 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone67);
        org.joda.time.DurationField durationField69 = gJChronology68.halfdays();
        long long73 = gJChronology68.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField74 = gJChronology68.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology68.secondOfMinute();
        org.joda.time.Instant instant77 = new org.joda.time.Instant(52L);
        boolean boolean78 = instant77.isEqualNow();
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.Instant instant80 = instant77.plus(readableDuration79);
        boolean boolean81 = gJChronology68.equals((java.lang.Object) instant77);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = null;
        boolean boolean83 = instant77.isSupported(dateTimeFieldType82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = null;
        boolean boolean85 = instant77.isSupported(dateTimeFieldType84);
        org.joda.time.DateTimeZone dateTimeZone86 = instant77.getZone();
        long long87 = instant77.getMillis();
        org.joda.time.Instant instant88 = instant77.toInstant();
        org.joda.time.MutableDateTime mutableDateTime89 = instant77.toMutableDateTime();
        boolean boolean90 = instant47.isEqual((org.joda.time.ReadableInstant) instant77);
        boolean boolean91 = instant21.isAfter((org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime89", (instant8.compareTo(mutableDateTime89) == 0) == instant8.equals(mutableDateTime89));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone12.getNameKey((long) 100);
        boolean boolean15 = dateTimeZone12.isFixed();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        java.lang.String str17 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime18 = instant10.toDateTime(dateTimeZone12);
        org.joda.time.Instant instant20 = instant10.plus(63113904000000L);
        boolean boolean21 = instant20.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = instant1.toString(dateTimeFormatter8);
        boolean boolean10 = instant1.isAfterNow();
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) '#');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.weekyearOfCentury();
        org.joda.time.Instant instant18 = gJChronology15.getGregorianCutover();
        boolean boolean19 = instant12.equals((java.lang.Object) gJChronology15);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology15.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = instant1.toMutableDateTime((org.joda.time.Chronology) gJChronology15);
        org.joda.time.DurationField durationField22 = gJChronology15.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime21", (instant1.compareTo(mutableDateTime21) == 0) == instant1.equals(mutableDateTime21));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        java.lang.String str20 = instant18.toString();
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        boolean boolean23 = instant22.isEqualNow();
        java.lang.String str24 = instant22.toString();
        java.lang.String str25 = instant22.toString();
        org.joda.time.Instant instant28 = instant22.withDurationAdded(115200000L, (int) (short) 1);
        int int29 = instant18.compareTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant31 = new org.joda.time.Instant(52L);
        boolean boolean32 = instant31.isEqualNow();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant31.plus(readableDuration33);
        boolean boolean36 = instant34.equals((java.lang.Object) ' ');
        boolean boolean37 = instant22.isAfter((org.joda.time.ReadableInstant) instant34);
        int int38 = instant1.compareTo((org.joda.time.ReadableInstant) instant22);
        java.util.Date date39 = instant22.toDate();
        boolean boolean41 = instant22.isAfter(6311390400000L);
        boolean boolean42 = instant22.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant22.plus(readableDuration43);
        org.joda.time.Chronology chronology45 = instant22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = instant22.toMutableDateTime();
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48);
        long long53 = dateTimeZone48.convertLocalToUTC((long) (byte) -1, true, 0L);
        java.lang.String str55 = dateTimeZone48.getNameKey((long) (short) 0);
        boolean boolean57 = dateTimeZone48.isStandardOffset((long) 0);
        long long59 = dateTimeZone48.previousTransition((-86400000L));
        org.joda.time.LocalDateTime localDateTime60 = null;
        boolean boolean61 = dateTimeZone48.isLocalDateTimeGap(localDateTime60);
        int int63 = dateTimeZone48.getStandardOffset(262978799879948L);
        java.lang.String str64 = dateTimeZone48.getID();
        org.joda.time.DateTime dateTime65 = instant22.toDateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime46", (instant1.compareTo(mutableDateTime46) == 0) == instant1.equals(mutableDateTime46));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        java.lang.String str21 = instant17.toString();
        java.lang.String str22 = instant17.toString();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant25 = instant17.withDurationAdded(readableDuration23, 236785);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((-64983772799999L));
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime29 = instant27.toMutableDateTime();
        int int30 = instant17.compareTo((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTimeZone dateTimeZone31 = instant27.getZone();
        java.lang.String str33 = dateTimeZone31.getNameKey(18100133334L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime28", (instant27.compareTo(dateTime28) == 0) == instant27.equals(dateTime28));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        boolean boolean12 = instant11.isEqualNow();
        java.lang.String str13 = instant11.toString();
        java.lang.String str14 = instant11.toString();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        boolean boolean17 = instant16.isEqualNow();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        boolean boolean20 = instant11.isBefore((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant11.minus((long) 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant11);
        boolean boolean25 = instant8.equals((java.lang.Object) 349200L);
        long long26 = instant8.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant8.isSupported(dateTimeFieldType27);
        org.joda.time.Instant instant30 = instant8.withMillis((-2208729596097L));
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = gJChronology33.halfdays();
        long long38 = gJChronology33.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology33.halfdayOfDay();
        org.joda.time.Chronology chronology40 = gJChronology33.withUTC();
        java.lang.String str41 = gJChronology33.toString();
        org.joda.time.Chronology chronology42 = gJChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology33.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime45 = instant8.toMutableDateTime((org.joda.time.Chronology) gJChronology33);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology33.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime45", (instant1.compareTo(mutableDateTime45) == 0) == instant1.equals(mutableDateTime45));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.String str14 = instant9.toString();
        org.joda.time.Instant instant15 = instant9.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant9.withDurationAdded(readableDuration16, (int) 'x');
        org.joda.time.Instant instant19 = instant9.toInstant();
        int int20 = instant1.compareTo((org.joda.time.ReadableInstant) instant9);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.era();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.centuryOfEra();
        org.joda.time.DurationField durationField26 = gJChronology23.hours();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology23.monthOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.dayOfWeek();
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30);
        int int33 = dateTimeZone30.getStandardOffset((long) (byte) 0);
        org.joda.time.Chronology chronology34 = gJChronology23.withZone(dateTimeZone30);
        int int36 = dateTimeZone30.getOffsetFromLocal(262978799880L);
        org.joda.time.MutableDateTime mutableDateTime37 = instant1.toMutableDateTime(dateTimeZone30);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology40.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.weekyearOfCentury();
        org.joda.time.Instant instant43 = gJChronology40.getGregorianCutover();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Chronology chronology46 = instant43.getChronology();
        org.joda.time.Instant instant47 = instant43.toInstant();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant43.plus(readableDuration48);
        boolean boolean50 = mutableDateTime37.isAfter((org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTime dateTime51 = instant49.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime37", (instant1.compareTo(mutableDateTime37) == 0) == instant1.equals(mutableDateTime37));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant12 = instant9.plus((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime13 = instant9.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.Instant instant16 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        int int21 = instant16.get(dateTimeField20);
        org.joda.time.Instant instant23 = instant16.plus(0L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = gJChronology26.halfdays();
        org.joda.time.Chronology chronology28 = gJChronology26.withUTC();
        java.lang.String str29 = gJChronology26.toString();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology26.hourOfHalfday();
        int int31 = instant16.get(dateTimeField30);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        java.lang.String str35 = instant33.toString();
        org.joda.time.Instant instant37 = new org.joda.time.Instant(52L);
        boolean boolean38 = instant37.isEqualNow();
        java.lang.String str39 = instant37.toString();
        java.lang.String str40 = instant37.toString();
        org.joda.time.Instant instant43 = instant37.withDurationAdded(115200000L, (int) (short) 1);
        int int44 = instant33.compareTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Instant instant46 = new org.joda.time.Instant(52L);
        boolean boolean47 = instant46.isEqualNow();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant46.plus(readableDuration48);
        boolean boolean51 = instant49.equals((java.lang.Object) ' ');
        boolean boolean52 = instant37.isAfter((org.joda.time.ReadableInstant) instant49);
        int int53 = instant16.compareTo((org.joda.time.ReadableInstant) instant37);
        long long54 = instant16.getMillis();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Instant instant57 = instant16.withDurationAdded(readableDuration55, 12);
        org.joda.time.MutableDateTime mutableDateTime58 = instant16.toMutableDateTime();
        boolean boolean59 = mutableDateTime58.isEqualNow();
        long long60 = mutableDateTime58.getMillis();
        int int61 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) mutableDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime13", (instant1.compareTo(mutableDateTime13) == 0) == instant1.equals(mutableDateTime13));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology2.add(readablePeriod8, (-42L), (int) '4');
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField16 = gJChronology2.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField15", (durationField16.compareTo(durationField15) == 0) == durationField16.equals(durationField15));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        org.joda.time.Instant instant7 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        long long19 = dateTimeZone14.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean21 = dateTimeZone14.equals((java.lang.Object) true);
        long long25 = dateTimeZone14.convertLocalToUTC((long) 'a', true, 0L);
        int int27 = dateTimeZone14.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime28 = instant10.toDateTime(dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant29 = null;
        boolean boolean30 = instant10.isBefore(readableInstant29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        org.joda.time.DateTime dateTime13 = instant9.toDateTimeISO();
        org.joda.time.Instant instant14 = instant9.toInstant();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology17.era();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.dayOfMonth();
        org.joda.time.Instant instant23 = gJChronology17.getGregorianCutover();
        boolean boolean24 = instant14.isEqual((org.joda.time.ReadableInstant) instant23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime13", (instant1.compareTo(dateTime13) == 0) == instant1.equals(dateTime13));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1577455689601869L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        int int6 = dateTimeZone3.getStandardOffset((long) (byte) 0);
        long long8 = dateTimeZone3.nextTransition(43200100L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.weekyearOfCentury();
        org.joda.time.Instant instant14 = gJChronology11.getGregorianCutover();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.millisOfSecond();
        int int23 = instant18.get(dateTimeField22);
        org.joda.time.Instant instant25 = instant18.plus(0L);
        int int26 = instant16.compareTo((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.plus(readableDuration30);
        boolean boolean33 = instant31.equals((java.lang.Object) ' ');
        boolean boolean34 = instant25.isEqual((org.joda.time.ReadableInstant) instant31);
        java.lang.String str35 = instant25.toString();
        org.joda.time.Instant instant36 = instant25.toInstant();
        org.joda.time.Instant instant38 = instant36.plus((long) 4200000);
        int int39 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) instant36);
        org.joda.time.MutableDateTime mutableDateTime40 = instant1.toMutableDateTime(dateTimeZone3);
        boolean boolean41 = instant1.isEqualNow();
        org.joda.time.Instant instant43 = new org.joda.time.Instant(52L);
        boolean boolean44 = instant43.isEqualNow();
        java.lang.String str45 = instant43.toString();
        java.lang.String str46 = instant43.toString();
        org.joda.time.Instant instant48 = new org.joda.time.Instant(52L);
        boolean boolean49 = instant48.isEqualNow();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant51 = instant48.plus(readableDuration50);
        boolean boolean52 = instant43.isBefore((org.joda.time.ReadableInstant) instant51);
        org.joda.time.MutableDateTime mutableDateTime53 = instant43.toMutableDateTimeISO();
        boolean boolean54 = instant1.isAfter((org.joda.time.ReadableInstant) instant43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime53", (instant18.compareTo(mutableDateTime53) == 0) == instant18.equals(mutableDateTime53));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = instant1.toString(dateTimeFormatter8);
        boolean boolean10 = instant1.isAfterNow();
        org.joda.time.Instant instant11 = instant1.toInstant();
        org.joda.time.Instant instant13 = instant1.plus(1512000000L);
        java.util.Date date14 = instant13.toDate();
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.Instant instant17 = new org.joda.time.Instant(52L);
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.plus(readableDuration19);
        boolean boolean22 = instant20.equals((java.lang.Object) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, 4320000000L);
        boolean boolean30 = instant20.equals((java.lang.Object) 4320000000L);
        org.joda.time.Instant instant32 = instant20.withMillis(10L);
        boolean boolean33 = instant13.isEqual((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime34 = instant20.toDateTime();
        org.joda.time.Instant instant36 = instant20.minus((-65890385517941L));
        boolean boolean37 = instant36.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime34", (instant1.compareTo(dateTime34) == 0) == instant1.equals(dateTime34));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(3155760000000L);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.String str5 = dateTimeZone1.toString();
        boolean boolean7 = dateTimeZone1.isStandardOffset((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        int int13 = dateTimeZone10.getOffsetFromLocal((long) (-1));
        int int15 = dateTimeZone10.getOffset((-61827926399999L));
        java.lang.String str16 = dateTimeZone10.toString();
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 100L);
        org.joda.time.Instant instant20 = new org.joda.time.Instant(52L);
        boolean boolean21 = instant20.isEqualNow();
        java.lang.String str22 = instant20.toString();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        boolean boolean25 = instant24.isEqualNow();
        java.lang.String str26 = instant24.toString();
        java.lang.String str27 = instant24.toString();
        org.joda.time.Instant instant30 = instant24.withDurationAdded(115200000L, (int) (short) 1);
        int int31 = instant20.compareTo((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        boolean boolean34 = instant33.isEqualNow();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant33.plus(readableDuration35);
        boolean boolean38 = instant36.equals((java.lang.Object) ' ');
        boolean boolean39 = instant24.isAfter((org.joda.time.ReadableInstant) instant36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant36.plus(readableDuration40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = instant36.toString(dateTimeFormatter42);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant36);
        org.joda.time.DateTime dateTime45 = instant36.toDateTime();
        org.joda.time.Instant instant46 = instant36.toInstant();
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime45", (instant20.compareTo(dateTime45) == 0) == instant20.equals(dateTime45));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        java.lang.String str4 = instant1.toString();
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        boolean boolean7 = instant6.isEqualNow();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        boolean boolean10 = instant1.isBefore((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        long long13 = instant12.getMillis();
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.millisOfSecond();
        int int20 = instant15.get(dateTimeField19);
        org.joda.time.Instant instant22 = instant15.plus(0L);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        org.joda.time.Chronology chronology27 = gJChronology25.withUTC();
        java.lang.String str28 = gJChronology25.toString();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.hourOfHalfday();
        int int30 = instant15.get(dateTimeField29);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        org.joda.time.Instant instant37 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant39 = instant37.withMillis((long) 'u');
        boolean boolean40 = instant32.isBefore((org.joda.time.ReadableInstant) instant37);
        boolean boolean41 = instant15.isEqual((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Instant instant43 = instant15.plus(3732480000000000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = instant43.toString(dateTimeFormatter44);
        org.joda.time.MutableDateTime mutableDateTime46 = instant43.toMutableDateTime();
        org.joda.time.Instant instant47 = instant43.toInstant();
        int int48 = instant12.compareTo((org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant47 and mutableDateTime46", (instant47.compareTo(mutableDateTime46) == 0) == instant47.equals(mutableDateTime46));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        org.joda.time.DurationField durationField6 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField8 = gJChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField4, and durationField5", !(durationField8.compareTo(durationField4) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        boolean boolean24 = instant22.equals((java.lang.Object) ' ');
        boolean boolean25 = instant16.isEqual((org.joda.time.ReadableInstant) instant22);
        java.lang.String str26 = instant16.toString();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant16.withDurationAdded(readableDuration27, 1431201);
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = instant16.isSupported(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime30", (instant16.compareTo(mutableDateTime30) == 0) == instant16.equals(mutableDateTime30));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.String str6 = instant1.toString();
        boolean boolean8 = instant1.isAfter((long) (-1));
        java.lang.Object obj9 = null;
        boolean boolean10 = instant1.equals(obj9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant1.minus(readableDuration11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = gJChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.minuteOfDay();
        org.joda.time.DurationField durationField19 = gJChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology15.dayOfYear();
        java.lang.String str21 = gJChronology15.toString();
        org.joda.time.DurationField durationField22 = gJChronology15.years();
        org.joda.time.DurationField durationField23 = gJChronology15.hours();
        org.joda.time.DurationField durationField24 = gJChronology15.years();
        org.joda.time.DateTime dateTime25 = instant1.toDateTime((org.joda.time.Chronology) gJChronology15);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        java.util.Locale locale30 = new java.util.Locale("hi!");
        java.lang.String str31 = locale30.getCountry();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        boolean boolean35 = dateTimeZone27.equals((java.lang.Object) locale32);
        int int37 = dateTimeZone27.getOffsetFromLocal((long) (short) 10);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology40.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.weekyearOfCentury();
        org.joda.time.Instant instant43 = gJChronology40.getGregorianCutover();
        org.joda.time.Instant instant45 = instant43.withMillis(0L);
        org.joda.time.Instant instant47 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = gJChronology50.millisOfSecond();
        int int52 = instant47.get(dateTimeField51);
        org.joda.time.Instant instant54 = instant47.plus(0L);
        int int55 = instant45.compareTo((org.joda.time.ReadableInstant) instant54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        boolean boolean57 = instant54.isSupported(dateTimeFieldType56);
        int int58 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) instant54);
        boolean boolean60 = instant54.isEqual((long) (byte) 1);
        org.joda.time.Instant instant62 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology65.millisOfSecond();
        int int67 = instant62.get(dateTimeField66);
        boolean boolean68 = instant62.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider69 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider69);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider69);
        boolean boolean72 = instant62.equals((java.lang.Object) nameProvider69);
        org.joda.time.Instant instant74 = instant62.minus(0L);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.Instant instant76 = instant62.minus(readableDuration75);
        org.joda.time.Instant instant78 = instant62.plus(0L);
        int int79 = instant54.compareTo((org.joda.time.ReadableInstant) instant62);
        org.joda.time.MutableDateTime mutableDateTime80 = instant54.toMutableDateTime();
        int int81 = dateTime25.compareTo((org.joda.time.ReadableInstant) instant54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime80", (instant1.compareTo(mutableDateTime80) == 0) == instant1.equals(mutableDateTime80));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfYear();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField12 = gJChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology2.getZone();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        int int20 = dateTimeZone17.getOffsetFromLocal(1000L);
        long long22 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (-61827926399999L));
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.Instant instant25 = new org.joda.time.Instant(52L);
        boolean boolean26 = instant25.isEqualNow();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant25.plus(readableDuration27);
        long long29 = instant25.getMillis();
        java.lang.String str30 = instant25.toString();
        org.joda.time.Instant instant31 = instant25.toInstant();
        org.joda.time.Instant instant33 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology36.millisOfSecond();
        int int38 = instant33.get(dateTimeField37);
        org.joda.time.Chronology chronology39 = instant33.getChronology();
        boolean boolean40 = instant25.isBefore((org.joda.time.ReadableInstant) instant33);
        boolean boolean42 = instant25.isEqual(1136050274678400000L);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTime dateTime44 = instant25.toDateTime();
        boolean boolean45 = dateTime44.isEqualNow();
        int int46 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime44);
        long long48 = dateTimeZone13.convertUTCToLocal(154L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime44", (instant25.compareTo(dateTime44) == 0) == instant25.equals(dateTime44));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = gJChronology11.halfdays();
        org.joda.time.Chronology chronology13 = gJChronology11.withUTC();
        java.lang.String str14 = gJChronology11.toString();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.hourOfHalfday();
        int int16 = instant1.get(dateTimeField15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(52L);
        boolean boolean19 = instant18.isEqualNow();
        java.lang.String str20 = instant18.toString();
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        boolean boolean23 = instant22.isEqualNow();
        java.lang.String str24 = instant22.toString();
        java.lang.String str25 = instant22.toString();
        org.joda.time.Instant instant28 = instant22.withDurationAdded(115200000L, (int) (short) 1);
        int int29 = instant18.compareTo((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant31 = new org.joda.time.Instant(52L);
        boolean boolean32 = instant31.isEqualNow();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant31.plus(readableDuration33);
        boolean boolean36 = instant34.equals((java.lang.Object) ' ');
        boolean boolean37 = instant22.isAfter((org.joda.time.ReadableInstant) instant34);
        int int38 = instant1.compareTo((org.joda.time.ReadableInstant) instant22);
        java.util.Date date39 = instant22.toDate();
        boolean boolean41 = instant22.isAfter(6311390400000L);
        org.joda.time.MutableDateTime mutableDateTime42 = instant22.toMutableDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = instant22.toString(dateTimeFormatter43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime42", (instant1.compareTo(mutableDateTime42) == 0) == instant1.equals(mutableDateTime42));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add(0L, (long) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfDay();
        org.joda.time.DurationField durationField14 = gJChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfYear();
        java.lang.String str16 = gJChronology10.toString();
        org.joda.time.DurationField durationField17 = gJChronology10.years();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology22 = gJChronology10.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology23 = gJChronology2.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField24 = gJChronology2.halfdays();
        org.joda.time.Instant instant25 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant27 = instant25.withMillis((long) (short) -1);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = gJChronology30.halfdays();
        long long35 = gJChronology30.add(0L, (long) (short) -1, (int) '4');
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DurationField durationField39 = gJChronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.minuteOfDay();
        org.joda.time.DurationField durationField42 = gJChronology38.centuries();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology38.dayOfYear();
        java.lang.String str44 = gJChronology38.toString();
        org.joda.time.DurationField durationField45 = gJChronology38.years();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology38.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.joda.time.Chronology chronology50 = gJChronology38.withZone(dateTimeZone49);
        org.joda.time.Chronology chronology51 = gJChronology30.withZone(dateTimeZone49);
        org.joda.time.DurationField durationField52 = gJChronology30.halfdays();
        org.joda.time.Instant instant53 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant55 = instant53.plus(readableDuration54);
        boolean boolean56 = instant27.isAfter((org.joda.time.ReadableInstant) instant53);
        org.joda.time.Instant instant57 = org.joda.time.Instant.now();
        boolean boolean59 = instant57.isBefore(0L);
        org.joda.time.Instant instant61 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant63 = instant61.withMillis((long) 'u');
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone65);
        org.joda.time.DurationField durationField67 = gJChronology66.halfdays();
        long long71 = gJChronology66.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean73 = gJChronology66.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField74 = gJChronology66.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology66.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField76 = gJChronology66.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField77 = gJChronology66.clockhourOfHalfday();
        org.joda.time.DateTime dateTime78 = instant61.toDateTime((org.joda.time.Chronology) gJChronology66);
        boolean boolean79 = instant57.isEqual((org.joda.time.ReadableInstant) dateTime78);
        boolean boolean80 = dateTime78.isBeforeNow();
        boolean boolean81 = instant27.isAfter((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.Instant instant83 = instant27.plus(61827926400051L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and dateTime78", (instant61.compareTo(dateTime78) == 0) == instant61.equals(dateTime78));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        java.lang.String str3 = instant1.toString();
        org.joda.time.Instant instant5 = new org.joda.time.Instant(52L);
        boolean boolean6 = instant5.isEqualNow();
        java.lang.String str7 = instant5.toString();
        java.lang.String str8 = instant5.toString();
        org.joda.time.Instant instant11 = instant5.withDurationAdded(115200000L, (int) (short) 1);
        int int12 = instant1.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant14 = new org.joda.time.Instant(52L);
        boolean boolean15 = instant14.isEqualNow();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant14.plus(readableDuration16);
        boolean boolean19 = instant17.equals((java.lang.Object) ' ');
        boolean boolean20 = instant5.isAfter((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant22 = new org.joda.time.Instant(52L);
        boolean boolean23 = instant22.isEqualNow();
        java.lang.String str24 = instant22.toString();
        java.lang.String str25 = instant22.toString();
        org.joda.time.Instant instant27 = new org.joda.time.Instant(52L);
        boolean boolean28 = instant27.isEqualNow();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant27.plus(readableDuration29);
        boolean boolean31 = instant22.isBefore((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant33 = instant30.plus((long) (short) 100);
        java.lang.String str34 = instant30.toString();
        boolean boolean35 = instant17.isEqual((org.joda.time.ReadableInstant) instant30);
        boolean boolean36 = instant17.isBeforeNow();
        org.joda.time.Instant instant38 = new org.joda.time.Instant(52L);
        boolean boolean39 = instant38.isEqualNow();
        java.lang.String str40 = instant38.toString();
        java.lang.String str41 = instant38.toString();
        org.joda.time.Instant instant44 = instant38.withDurationAdded(115200000L, (int) (short) 1);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str48 = dateTimeZone46.getNameKey((long) 100);
        boolean boolean49 = dateTimeZone46.isFixed();
        org.joda.time.DateTime dateTime50 = instant38.toDateTime(dateTimeZone46);
        int int51 = instant17.compareTo((org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime52 = instant17.toDateTime();
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = gJChronology55.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.weekyear();
        org.joda.time.DurationField durationField58 = gJChronology55.centuries();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology55.halfdayOfDay();
        int int60 = gJChronology55.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology55.weekyearOfCentury();
        boolean boolean62 = instant17.equals((java.lang.Object) dateTimeField61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime50", (instant1.compareTo(dateTime50) == 0) == instant1.equals(dateTime50));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale8.getDisplayVariant(locale10);
        boolean boolean12 = gJChronology2.equals((java.lang.Object) locale10);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = gJChronology2.hours();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.weekyearOfCentury();
        org.joda.time.Instant instant22 = gJChronology19.getGregorianCutover();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Instant instant26 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.millisOfSecond();
        int int31 = instant26.get(dateTimeField30);
        org.joda.time.Instant instant33 = instant26.plus(0L);
        int int34 = instant24.compareTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Instant instant36 = new org.joda.time.Instant(52L);
        boolean boolean37 = instant36.isEqualNow();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant36.plus(readableDuration38);
        boolean boolean41 = instant39.equals((java.lang.Object) ' ');
        boolean boolean42 = instant33.isEqual((org.joda.time.ReadableInstant) instant39);
        java.util.Date date43 = instant39.toDate();
        org.joda.time.DateTime dateTime44 = instant39.toDateTimeISO();
        boolean boolean45 = gJChronology2.equals((java.lang.Object) dateTime44);
        org.joda.time.Chronology chronology46 = gJChronology2.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime44", (instant26.compareTo(dateTime44) == 0) == instant26.equals(dateTime44));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.Instant instant5 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant7 = instant5.withMillis(0L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.millisOfSecond();
        int int14 = instant9.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant9.plus(0L);
        int int17 = instant7.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant19 = new org.joda.time.Instant(52L);
        boolean boolean20 = instant19.isEqualNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant19.plus(readableDuration21);
        boolean boolean24 = instant22.equals((java.lang.Object) ' ');
        boolean boolean25 = instant16.isEqual((org.joda.time.ReadableInstant) instant22);
        org.joda.time.MutableDateTime mutableDateTime26 = instant16.toMutableDateTime();
        org.joda.time.Instant instant28 = instant16.plus((long) 8);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(52L);
        boolean boolean31 = instant30.isEqualNow();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant30.plus(readableDuration32);
        org.joda.time.Instant instant35 = instant30.withMillis((long) 4);
        boolean boolean36 = instant35.isBeforeNow();
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        boolean boolean38 = instant35.isAfterNow();
        boolean boolean39 = instant16.isAfter((org.joda.time.ReadableInstant) instant35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime26", (instant16.compareTo(mutableDateTime26) == 0) == instant16.equals(mutableDateTime26));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField9 = gJChronology2.centuries();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str13 = dateTimeZone11.getNameKey((long) 100);
        boolean boolean14 = dateTimeZone11.isFixed();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        int int16 = gJChronology15.getMinimumDaysInFirstWeek();
        java.lang.String str17 = gJChronology15.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology15.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = gJChronology15.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.millisOfSecond();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        int int28 = dateTimeZone25.getOffsetFromLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        long long32 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (-8380800000L));
        org.joda.time.Chronology chronology33 = chronology22.withZone(dateTimeZone25);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField37 = gJChronology36.halfdays();
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39);
        long long44 = dateTimeZone39.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean46 = dateTimeZone39.equals((java.lang.Object) true);
        org.joda.time.Chronology chronology47 = gJChronology36.withZone(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = dateTimeZone39.isLocalDateTimeGap(localDateTime48);
        boolean boolean50 = dateTimeZone39.isFixed();
        long long52 = dateTimeZone25.getMillisKeepLocal(dateTimeZone39, (long) (short) -1);
        org.joda.time.Chronology chronology53 = gJChronology2.withZone(dateTimeZone39);
        org.joda.time.Instant instant55 = new org.joda.time.Instant(52L);
        boolean boolean56 = instant55.isEqualNow();
        java.lang.String str57 = instant55.toString();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = instant55.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = instant55.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime61 = instant55.toMutableDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = instant55.toString(dateTimeFormatter62);
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, (org.joda.time.ReadableInstant) instant55);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant66 = instant55.minus(readableDuration65);
        org.joda.time.MutableDateTime mutableDateTime67 = instant55.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime59 and instant55", (mutableDateTime59.compareTo(instant55) == 0) == mutableDateTime59.equals(instant55));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.Instant instant9 = instant1.withMillis((-24192000000000L));
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        org.joda.time.Chronology chronology17 = gJChronology12.withZone(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology12.add(readablePeriod18, 3155764201170L, (-119));
        org.joda.time.DurationField durationField22 = gJChronology12.halfdays();
        org.joda.time.DateTime dateTime23 = instant1.toDateTime((org.joda.time.Chronology) gJChronology12);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime23", (instant1.compareTo(dateTime23) == 0) == instant1.equals(dateTime23));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long13 = dateTimeZone8.adjustOffset((-1L), false);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(52L);
        boolean boolean16 = instant15.isEqualNow();
        java.lang.String str17 = instant15.toString();
        java.lang.String str18 = instant15.toString();
        org.joda.time.Instant instant21 = instant15.withDurationAdded(115200000L, (int) (short) 1);
        boolean boolean22 = instant21.isBeforeNow();
        org.joda.time.Instant instant24 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology27.millisOfSecond();
        int int29 = instant24.get(dateTimeField28);
        boolean boolean30 = instant24.isEqualNow();
        org.joda.time.Instant instant32 = new org.joda.time.Instant(52L);
        boolean boolean33 = instant32.isEqualNow();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        long long36 = instant32.getMillis();
        java.lang.Object obj37 = null;
        boolean boolean38 = instant32.equals(obj37);
        org.joda.time.Instant instant40 = new org.joda.time.Instant(52L);
        boolean boolean41 = instant40.isEqualNow();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Instant instant43 = instant40.plus(readableDuration42);
        long long44 = instant40.getMillis();
        java.lang.String str45 = instant40.toString();
        org.joda.time.Instant instant46 = instant40.toInstant();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant49 = instant40.withDurationAdded(readableDuration47, (int) 'x');
        org.joda.time.Instant instant50 = instant40.toInstant();
        int int51 = instant32.compareTo((org.joda.time.ReadableInstant) instant40);
        boolean boolean52 = instant24.isBefore((org.joda.time.ReadableInstant) instant40);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone54);
        org.joda.time.DurationField durationField56 = gJChronology55.halfdays();
        long long60 = gJChronology55.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField61 = gJChronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology55.secondOfMinute();
        org.joda.time.Instant instant64 = new org.joda.time.Instant(52L);
        boolean boolean65 = instant64.isEqualNow();
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.Instant instant67 = instant64.plus(readableDuration66);
        boolean boolean68 = gJChronology55.equals((java.lang.Object) instant64);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = instant64.isSupported(dateTimeFieldType69);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        boolean boolean72 = instant64.isSupported(dateTimeFieldType71);
        java.lang.String str73 = instant64.toString();
        boolean boolean74 = instant24.isAfter((org.joda.time.ReadableInstant) instant64);
        org.joda.time.MutableDateTime mutableDateTime75 = instant64.toMutableDateTimeISO();
        int int76 = instant21.compareTo((org.joda.time.ReadableInstant) mutableDateTime75);
        org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) mutableDateTime75);
        org.joda.time.Chronology chronology78 = gJChronology2.withZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime75", (instant15.compareTo(mutableDateTime75) == 0) == instant15.equals(mutableDateTime75));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 70);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfYear();
        java.lang.String str19 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology13.getZone();
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.weekOfWeekyear();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        int int29 = dateTimeZone26.getOffsetFromLocal(1000L);
        org.joda.time.Chronology chronology30 = gJChronology22.withZone(dateTimeZone26);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, 863999948L, 4);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone26.isLocalDateTimeGap(localDateTime34);
        long long37 = dateTimeZone26.nextTransition((-2247000017L));
        java.util.TimeZone timeZone38 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime39 = instant1.toDateTime(dateTimeZone26);
        java.lang.String str40 = dateTimeZone26.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime39", (instant1.compareTo(dateTime39) == 0) == instant1.equals(dateTime39));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        boolean boolean7 = instant1.isEqualNow();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        boolean boolean11 = instant1.equals((java.lang.Object) nameProvider8);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(52L);
        boolean boolean14 = instant13.isEqualNow();
        java.lang.String str15 = instant13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = instant13.getZone();
        org.joda.time.DateTime dateTime17 = instant1.toDateTime(dateTimeZone16);
        java.lang.String str18 = instant1.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant1.plus(readableDuration19);
        org.joda.time.Instant instant22 = instant20.plus(43200152L);
        org.joda.time.Instant instant24 = instant22.plus(0L);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str28 = dateTimeZone26.getNameKey((long) 100);
        boolean boolean29 = dateTimeZone26.isFixed();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        long long33 = dateTimeZone26.getMillisKeepLocal(dateTimeZone31, (long) (byte) 0);
        int int35 = dateTimeZone26.getOffsetFromLocal(349200000L);
        java.lang.String str36 = dateTimeZone26.getID();
        org.joda.time.MutableDateTime mutableDateTime37 = instant22.toMutableDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology38 = instant22.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime37", (instant22.compareTo(mutableDateTime37) == 0) == instant22.equals(mutableDateTime37));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        long long7 = gJChronology2.add((long) 'a', (-1L), (int) (short) 0);
        long long11 = gJChronology2.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.millisOfSecond();
        org.joda.time.DurationField durationField16 = gJChronology2.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology2.add(readablePeriod17, (long) 1431201, (int) (short) 1);
        org.joda.time.DurationField durationField21 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField22 = gJChronology2.hours();
        org.joda.time.Instant instant23 = gJChronology2.getGregorianCutover();
        long long24 = instant23.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = instant23.isSupported(dateTimeFieldType25);
        org.joda.time.Instant instant28 = new org.joda.time.Instant(52L);
        boolean boolean29 = instant28.isEqualNow();
        java.lang.String str30 = instant28.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = instant28.getZone();
        org.joda.time.Instant instant33 = instant28.minus((-2208729599948L));
        boolean boolean34 = instant28.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime35 = instant28.toMutableDateTime();
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        long long42 = dateTimeZone37.convertLocalToUTC((long) (byte) -1, true, 0L);
        boolean boolean44 = dateTimeZone37.equals((java.lang.Object) true);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology45.weekyear();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.era();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.centuryOfEra();
        org.joda.time.Chronology chronology49 = gJChronology45.withUTC();
        org.joda.time.DurationField durationField50 = gJChronology45.years();
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.lang.String str54 = dateTimeZone52.getNameKey((long) 100);
        long long57 = dateTimeZone52.convertLocalToUTC((-2246399965L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.Chronology chronology59 = gJChronology45.withZone(dateTimeZone52);
        org.joda.time.Chronology chronology60 = gJChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology45.yearOfEra();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology45.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime35.toMutableDateTime((org.joda.time.Chronology) gJChronology45);
        boolean boolean64 = instant23.isEqual((org.joda.time.ReadableInstant) mutableDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and mutableDateTime35", (instant28.compareTo(mutableDateTime35) == 0) == instant28.equals(mutableDateTime35));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.dayOfYear();
        java.lang.String str15 = gJChronology9.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = instant6.toMutableDateTime(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.Instant instant23 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.millisOfSecond();
        int int28 = instant23.get(dateTimeField27);
        org.joda.time.Instant instant30 = instant23.plus(0L);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = gJChronology33.halfdays();
        org.joda.time.Chronology chronology35 = gJChronology33.withUTC();
        java.lang.String str36 = gJChronology33.toString();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.hourOfHalfday();
        int int38 = instant23.get(dateTimeField37);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField42 = gJChronology41.halfdays();
        long long46 = gJChronology41.add((long) 'a', (-1L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology41.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology41.secondOfMinute();
        org.joda.time.Instant instant50 = new org.joda.time.Instant(52L);
        boolean boolean51 = instant50.isEqualNow();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant53 = instant50.plus(readableDuration52);
        boolean boolean54 = gJChronology41.equals((java.lang.Object) instant50);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = null;
        boolean boolean56 = instant50.isSupported(dateTimeFieldType55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = instant50.isSupported(dateTimeFieldType57);
        org.joda.time.DateTimeZone dateTimeZone59 = instant50.getZone();
        boolean boolean60 = instant23.isAfter((org.joda.time.ReadableInstant) instant50);
        org.joda.time.Instant instant62 = instant23.minus((long) 70);
        org.joda.time.Instant instant64 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = gJChronology67.millisOfSecond();
        int int69 = instant64.get(dateTimeField68);
        boolean boolean70 = instant64.isEqualNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = instant64.toString(dateTimeFormatter71);
        boolean boolean73 = instant23.isAfter((org.joda.time.ReadableInstant) instant64);
        org.joda.time.Instant instant75 = instant64.plus(863999948L);
        org.joda.time.MutableDateTime mutableDateTime76 = instant75.toMutableDateTimeISO();
        org.joda.time.Instant instant78 = new org.joda.time.Instant(52L);
        boolean boolean79 = instant78.isEqualNow();
        boolean boolean81 = instant78.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = null;
        boolean boolean83 = instant78.isSupported(dateTimeFieldType82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = null;
        boolean boolean85 = instant78.isSupported(dateTimeFieldType84);
        org.joda.time.ReadableDuration readableDuration86 = null;
        org.joda.time.Instant instant87 = instant78.minus(readableDuration86);
        boolean boolean88 = mutableDateTime76.isEqual((org.joda.time.ReadableInstant) instant87);
        int int89 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) instant87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime19", (instant6.compareTo(mutableDateTime19) == 0) == instant6.equals(mutableDateTime19));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        boolean boolean4 = instant1.isEqual(0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = instant1.isSupported(dateTimeFieldType5);
        org.joda.time.Instant instant9 = instant1.withDurationAdded((-61827926399999L), (int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        org.joda.time.Instant instant12 = new org.joda.time.Instant(52L);
        boolean boolean13 = instant12.isEqualNow();
        java.lang.String str14 = instant12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = instant12.getZone();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = gJChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology18.getZone();
        boolean boolean24 = dateTimeZone23.isFixed();
        boolean boolean25 = dateTimeZone23.isFixed();
        java.lang.String str26 = dateTimeZone23.toString();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.millisOfSecond();
        org.joda.time.DurationField durationField31 = gJChronology29.millis();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = gJChronology29.add(readablePeriod32, (long) 'a', (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = gJChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology29.yearOfCentury();
        boolean boolean38 = dateTimeZone23.equals((java.lang.Object) dateTimeField37);
        int int40 = dateTimeZone23.getOffsetFromLocal((long) ' ');
        long long42 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, 1431201L);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44);
        org.joda.time.DurationField durationField46 = gJChronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.minuteOfDay();
        org.joda.time.DurationField durationField49 = gJChronology45.centuries();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology45.halfdayOfDay();
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Locale locale53 = java.util.Locale.CANADA;
        java.lang.String str54 = locale51.getDisplayVariant(locale53);
        boolean boolean55 = gJChronology45.equals((java.lang.Object) locale53);
        org.joda.time.DurationField durationField56 = gJChronology45.days();
        long long58 = durationField56.getMillis(10);
        boolean boolean59 = dateTimeZone23.equals((java.lang.Object) long58);
        org.joda.time.DateTime dateTime60 = instant9.toDateTime(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant62 = instant9.plus(readableDuration61);
        org.joda.time.Instant instant64 = new org.joda.time.Instant(52L);
        boolean boolean65 = instant64.isEqualNow();
        java.lang.String str66 = instant64.toString();
        java.lang.String str67 = instant64.toString();
        org.joda.time.Instant instant70 = instant64.withDurationAdded(115200000L, (int) (short) 1);
        org.joda.time.Instant instant72 = new org.joda.time.Instant(52L);
        boolean boolean73 = instant72.isEqualNow();
        java.lang.String str74 = instant72.toString();
        org.joda.time.Instant instant76 = new org.joda.time.Instant(52L);
        boolean boolean77 = instant76.isEqualNow();
        java.lang.String str78 = instant76.toString();
        java.lang.String str79 = instant76.toString();
        org.joda.time.Instant instant82 = instant76.withDurationAdded(115200000L, (int) (short) 1);
        int int83 = instant72.compareTo((org.joda.time.ReadableInstant) instant76);
        int int84 = instant70.compareTo((org.joda.time.ReadableInstant) instant72);
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.Instant instant86 = instant72.plus(readableDuration85);
        long long87 = instant86.getMillis();
        boolean boolean88 = instant62.isBefore((org.joda.time.ReadableInstant) instant86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant62 and mutableDateTime10", (instant62.compareTo(mutableDateTime10) == 0) == instant62.equals(mutableDateTime10));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        java.lang.Object obj6 = null;
        boolean boolean7 = instant1.equals(obj6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant(52L);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.plus(readableDuration11);
        long long13 = instant9.getMillis();
        java.lang.String str14 = instant9.toString();
        org.joda.time.Instant instant15 = instant9.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant9.withDurationAdded(readableDuration16, (int) 'x');
        org.joda.time.Instant instant19 = instant9.toInstant();
        int int20 = instant1.compareTo((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant1.plus(readableDuration21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology25.era();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology25.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime31 = instant22.toMutableDateTime((org.joda.time.Chronology) gJChronology25);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = gJChronology25.add(readablePeriod32, 240938L, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime31", (instant1.compareTo(mutableDateTime31) == 0) == instant1.equals(mutableDateTime31));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = gJChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.dayOfYear();
        java.lang.String str15 = gJChronology9.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology9.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = instant6.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = mutableDateTime19.getChronology();
        java.lang.String str21 = chronology20.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime19", (instant6.compareTo(mutableDateTime19) == 0) == instant6.equals(mutableDateTime19));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        boolean boolean2 = instant1.isEqualNow();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant(52L);
        org.joda.time.Instant instant8 = instant6.withMillis((long) 'u');
        boolean boolean9 = instant1.isBefore((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant10 = instant6.toInstant();
        org.joda.time.Instant instant12 = instant10.withMillis(7472212848000000L);
        org.joda.time.DateTimeZone dateTimeZone13 = instant10.getZone();
        org.joda.time.DateTime dateTime14 = instant10.toDateTimeISO();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology17.halfdays();
        long long22 = gJChronology17.add((long) 'a', (-1L), (int) (short) 0);
        boolean boolean24 = gJChronology17.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology17.dayOfMonth();
        org.joda.time.DurationField durationField26 = gJChronology17.days();
        long long30 = gJChronology17.add((long) '4', 432000000L, (int) (short) 0);
        org.joda.time.DurationField durationField31 = gJChronology17.years();
        org.joda.time.DurationField durationField32 = gJChronology17.centuries();
        org.joda.time.DurationField durationField33 = gJChronology17.minutes();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology17.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime14.toMutableDateTime((org.joda.time.Chronology) gJChronology17);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology17.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime35", (instant1.compareTo(mutableDateTime35) == 0) == instant1.equals(mutableDateTime35));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.millisOfSecond();
        int int6 = instant1.get(dateTimeField5);
        org.joda.time.Instant instant8 = instant1.plus(0L);
        long long9 = instant1.getMillis();
        org.joda.time.Instant instant11 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        int int16 = instant11.get(dateTimeField15);
        org.joda.time.Instant instant18 = instant11.plus(0L);
        long long19 = instant11.getMillis();
        org.joda.time.Instant instant21 = new org.joda.time.Instant(52L);
        boolean boolean22 = instant21.isEqualNow();
        java.lang.String str23 = instant21.toString();
        java.lang.String str24 = instant21.toString();
        org.joda.time.Instant instant26 = new org.joda.time.Instant(52L);
        boolean boolean27 = instant26.isEqualNow();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant26.plus(readableDuration28);
        boolean boolean30 = instant21.isBefore((org.joda.time.ReadableInstant) instant29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant29.minus(readableDuration31);
        boolean boolean33 = instant11.isAfter((org.joda.time.ReadableInstant) instant29);
        boolean boolean34 = instant29.isEqualNow();
        boolean boolean35 = instant1.isAfter((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant37 = instant29.minus(7020000L);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(52L);
        boolean boolean40 = instant39.isEqualNow();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant39.plus(readableDuration41);
        org.joda.time.Instant instant44 = instant39.withMillis((long) 4);
        org.joda.time.Instant instant46 = instant44.withMillis((-5919628L));
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.millisOfSecond();
        org.joda.time.DurationField durationField51 = gJChronology49.weeks();
        org.joda.time.DurationField durationField52 = gJChronology49.months();
        java.lang.String str53 = gJChronology49.toString();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology49.centuryOfEra();
        org.joda.time.DateTime dateTime55 = instant44.toDateTime((org.joda.time.Chronology) gJChronology49);
        org.joda.time.Chronology chronology56 = instant44.getChronology();
        int int57 = instant29.compareTo((org.joda.time.ReadableInstant) instant44);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant44.minus(readableDuration58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        java.lang.String str64 = dateTimeZone62.getNameKey((long) 100);
        boolean boolean65 = dateTimeZone62.isFixed();
        java.util.Locale locale69 = new java.util.Locale("DurationField[halfdays]", "\u82f1\u6587");
        java.lang.String str70 = dateTimeZone62.getName((long) (short) 10, locale69);
        org.joda.time.Instant instant72 = new org.joda.time.Instant(52L);
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.chrono.GJChronology gJChronology75 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone74);
        org.joda.time.DateTimeField dateTimeField76 = gJChronology75.millisOfSecond();
        int int77 = instant72.get(dateTimeField76);
        org.joda.time.Chronology chronology78 = instant72.getChronology();
        org.joda.time.chrono.GJChronology gJChronology79 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, (org.joda.time.ReadableInstant) instant72);
        long long80 = instant72.getMillis();
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.Instant instant82 = instant72.minus(readableDuration81);
        java.lang.String str83 = instant72.toString();
        boolean boolean85 = instant72.isBefore((-43881L));
        org.joda.time.DateTimeZone dateTimeZone86 = instant72.getZone();
        boolean boolean87 = instant72.isEqualNow();
        org.joda.time.chrono.GJChronology gJChronology88 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, (org.joda.time.ReadableInstant) instant72);
        boolean boolean89 = instant59.isAfter((org.joda.time.ReadableInstant) instant72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant59 and dateTime55", (instant59.compareTo(dateTime55) == 0) == instant59.equals(dateTime55));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        java.util.Locale locale2 = new java.util.Locale("GJChronology[+00:10]", "TW");
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology5.halfdays();
        long long10 = gJChronology5.add((long) 'a', (-1L), (int) (short) 0);
        long long14 = gJChronology5.add((long) (byte) 0, (long) '4', 100);
        org.joda.time.DurationField durationField15 = gJChronology5.years();
        org.joda.time.Instant instant16 = gJChronology5.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology5.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology5.era();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology5.minuteOfDay();
        org.joda.time.DurationField durationField20 = gJChronology5.halfdays();
        org.joda.time.DurationField durationField21 = gJChronology5.weekyears();
        boolean boolean22 = locale2.equals((java.lang.Object) gJChronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField21", (durationField15.compareTo(durationField21) == 0) == durationField15.equals(durationField21));
    }
}

